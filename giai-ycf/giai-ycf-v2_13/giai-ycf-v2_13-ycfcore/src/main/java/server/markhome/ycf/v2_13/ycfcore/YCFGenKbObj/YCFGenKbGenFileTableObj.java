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

public class CFGenKbGenFileTableObj
	implements ICFGenKbGenFileTableObj
{
	protected ICFGenKbSchemaObj schema;
	private Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> members;
	private Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> allGenFile;
	private Map< CFGenKbGenItemByTenantIdxKey,
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > > indexByTenantIdx;
	private Map< CFGenKbGenItemByCartIdxKey,
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > > indexByCartIdx;
	private Map< CFGenKbGenItemByRuleTypeIdxKey,
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > > indexByRuleTypeIdx;
	private Map< CFGenKbGenItemByToolSetIdxKey,
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > > indexByToolSetIdx;
	private Map< CFGenKbGenItemByScopeIdxKey,
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > > indexByScopeIdx;
	private Map< CFGenKbGenItemByGenDefIdxKey,
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > > indexByGenDefIdx;
	private Map< CFGenKbGenItemByAltIdxKey,
		ICFGenKbGenFileObj > indexByAltIdx;
	private Map< CFGenKbGenItemByGelExecIdxKey,
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > > indexByGelExecIdx;
	private Map< CFGenKbGenItemByProbeIdxKey,
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > > indexByProbeIdx;
	private Map< CFGenKbGenRuleByBodyIdxKey,
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > > indexByBodyIdx;
	private Map< CFGenKbGenFileByXSrcBundleKey,
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > > indexByXSrcBundle;
	private Map< CFGenKbGenFileByXModNameKey,
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > > indexByXModName;
	private Map< CFGenKbGenFileByXBasePkgKey,
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > > indexByXBasePkg;
	private Map< CFGenKbGenFileByXSubPkgKey,
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > > indexByXSubPkg;
	private Map< CFGenKbGenFileByXExpClsNameKey,
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > > indexByXExpClsName;
	private Map< CFGenKbGenFileByXExpKeyNameKey,
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > > indexByXExpKeyName;
	private Map< CFGenKbGenFileByXExpFileNameKey,
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > > indexByXExpFileName;
	public static String TABLE_NAME = "GenFile";
	public static String TABLE_DBNAME = "kbgenfile";

	public CFGenKbGenFileTableObj() {
		schema = null;
		members = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenFileObj>();
		allGenFile = null;
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
		indexByXSrcBundle = null;
		indexByXModName = null;
		indexByXBasePkg = null;
		indexByXSubPkg = null;
		indexByXExpClsName = null;
		indexByXExpKeyName = null;
		indexByXExpFileName = null;
	}

	public CFGenKbGenFileTableObj( ICFGenKbSchemaObj argSchema ) {
		schema = (ICFGenKbSchemaObj)argSchema;
		members = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenFileObj>();
		allGenFile = null;
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
		indexByXSrcBundle = null;
		indexByXModName = null;
		indexByXBasePkg = null;
		indexByXSubPkg = null;
		indexByXExpClsName = null;
		indexByXExpKeyName = null;
		indexByXExpFileName = null;
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
		allGenFile = null;
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
		indexByXSrcBundle = null;
		indexByXModName = null;
		indexByXBasePkg = null;
		indexByXSubPkg = null;
		indexByXExpClsName = null;
		indexByXExpKeyName = null;
		indexByXExpFileName = null;
		List<ICFGenKbGenFileObj> toForget = new LinkedList<ICFGenKbGenFileObj>();
		ICFGenKbGenFileObj cur = null;
		Iterator<ICFGenKbGenFileObj> iter = members.values().iterator();
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
	 *	CFGenKbGenFileObj.
	 */
	public ICFGenKbGenFileObj newInstance() {
		ICFGenKbGenFileObj inst = new CFGenKbGenFileObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFGenKbGenFileObj.
	 */
	public ICFGenKbGenFileEditObj newEditInstance( ICFGenKbGenFileObj orig ) {
		ICFGenKbGenFileEditObj edit = new CFGenKbGenFileEditObj( orig );
		return( edit );
	}

	public ICFGenKbGenFileObj realiseGenFile( ICFGenKbGenFileObj Obj ) {
		ICFGenKbGenFileObj obj = Obj;
		CFGenKbGenItemPKey pkey = obj.getPKey();
		ICFGenKbGenFileObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFGenKbGenFileObj existingObj = members.get( pkey );
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
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByCartIdx != null ) {
				CFGenKbGenItemByCartIdxKey keyCartIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
				keyCartIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyCartIdx.setRequiredCartridgeId( keepObj.getRequiredCartridgeId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapCartIdx = indexByCartIdx.get( keyCartIdx );
				if( mapCartIdx != null ) {
					indexByCartIdx.remove( keyCartIdx );
				}
			}

			if( indexByRuleTypeIdx != null ) {
				CFGenKbGenItemByRuleTypeIdxKey keyRuleTypeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
				keyRuleTypeIdx.setRequiredRuleTypeId( keepObj.getRequiredRuleTypeId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapRuleTypeIdx = indexByRuleTypeIdx.get( keyRuleTypeIdx );
				if( mapRuleTypeIdx != null ) {
					indexByRuleTypeIdx.remove( keyRuleTypeIdx );
				}
			}

			if( indexByToolSetIdx != null ) {
				CFGenKbGenItemByToolSetIdxKey keyToolSetIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
				keyToolSetIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapToolSetIdx = indexByToolSetIdx.get( keyToolSetIdx );
				if( mapToolSetIdx != null ) {
					indexByToolSetIdx.remove( keyToolSetIdx );
				}
			}

			if( indexByScopeIdx != null ) {
				CFGenKbGenItemByScopeIdxKey keyScopeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
				keyScopeIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					indexByScopeIdx.remove( keyScopeIdx );
				}
			}

			if( indexByGenDefIdx != null ) {
				CFGenKbGenItemByGenDefIdxKey keyGenDefIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
				keyGenDefIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapGenDefIdx = indexByGenDefIdx.get( keyGenDefIdx );
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
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapGelExecIdx = indexByGelExecIdx.get( keyGelExecIdx );
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
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapProbeIdx = indexByProbeIdx.get( keyProbeIdx );
				if( mapProbeIdx != null ) {
					indexByProbeIdx.remove( keyProbeIdx );
				}
			}

			if( indexByBodyIdx != null ) {
				CFGenKbGenRuleByBodyIdxKey keyBodyIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenRule().newBodyIdxKey();
				keyBodyIdx.setOptionalBodyTenantId( keepObj.getOptionalBodyTenantId() );
				keyBodyIdx.setOptionalBodyGelCacheId( keepObj.getOptionalBodyGelCacheId() );
				keyBodyIdx.setOptionalBodyGelId( keepObj.getOptionalBodyGelId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapBodyIdx = indexByBodyIdx.get( keyBodyIdx );
				if( mapBodyIdx != null ) {
					indexByBodyIdx.remove( keyBodyIdx );
				}
			}

			if( indexByXSrcBundle != null ) {
				CFGenKbGenFileByXSrcBundleKey keyXSrcBundle =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSrcBundleKey();
				keyXSrcBundle.setOptionalSourceBundleTenantId( keepObj.getOptionalSourceBundleTenantId() );
				keyXSrcBundle.setOptionalSourceBundleGelCacheId( keepObj.getOptionalSourceBundleGelCacheId() );
				keyXSrcBundle.setOptionalSourceBundleGelId( keepObj.getOptionalSourceBundleGelId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapXSrcBundle = indexByXSrcBundle.get( keyXSrcBundle );
				if( mapXSrcBundle != null ) {
					mapXSrcBundle.remove( keepObj.getPKey() );
					if( mapXSrcBundle.size() <= 0 ) {
						indexByXSrcBundle.remove( keyXSrcBundle );
					}
				}
			}

			if( indexByXModName != null ) {
				CFGenKbGenFileByXModNameKey keyXModName =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXModNameKey();
				keyXModName.setOptionalModuleNameTenantId( keepObj.getOptionalModuleNameTenantId() );
				keyXModName.setOptionalModuleNameGelCacheId( keepObj.getOptionalModuleNameGelCacheId() );
				keyXModName.setOptionalModuleNameGelId( keepObj.getOptionalModuleNameGelId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapXModName = indexByXModName.get( keyXModName );
				if( mapXModName != null ) {
					mapXModName.remove( keepObj.getPKey() );
					if( mapXModName.size() <= 0 ) {
						indexByXModName.remove( keyXModName );
					}
				}
			}

			if( indexByXBasePkg != null ) {
				CFGenKbGenFileByXBasePkgKey keyXBasePkg =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXBasePkgKey();
				keyXBasePkg.setOptionalBasePackageTenantId( keepObj.getOptionalBasePackageTenantId() );
				keyXBasePkg.setOptionalBasePackageGelCacheId( keepObj.getOptionalBasePackageGelCacheId() );
				keyXBasePkg.setOptionalBasePackageGelId( keepObj.getOptionalBasePackageGelId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapXBasePkg = indexByXBasePkg.get( keyXBasePkg );
				if( mapXBasePkg != null ) {
					mapXBasePkg.remove( keepObj.getPKey() );
					if( mapXBasePkg.size() <= 0 ) {
						indexByXBasePkg.remove( keyXBasePkg );
					}
				}
			}

			if( indexByXSubPkg != null ) {
				CFGenKbGenFileByXSubPkgKey keyXSubPkg =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSubPkgKey();
				keyXSubPkg.setOptionalSubPackageTenantId( keepObj.getOptionalSubPackageTenantId() );
				keyXSubPkg.setOptionalSubPackageGelCacheId( keepObj.getOptionalSubPackageGelCacheId() );
				keyXSubPkg.setOptionalSubPackageGelId( keepObj.getOptionalSubPackageGelId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapXSubPkg = indexByXSubPkg.get( keyXSubPkg );
				if( mapXSubPkg != null ) {
					mapXSubPkg.remove( keepObj.getPKey() );
					if( mapXSubPkg.size() <= 0 ) {
						indexByXSubPkg.remove( keyXSubPkg );
					}
				}
			}

			if( indexByXExpClsName != null ) {
				CFGenKbGenFileByXExpClsNameKey keyXExpClsName =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpClsNameKey();
				keyXExpClsName.setOptionalExpansionClassNameTenantId( keepObj.getOptionalExpansionClassNameTenantId() );
				keyXExpClsName.setOptionalExpansionClassNameGelCacheId( keepObj.getOptionalExpansionClassNameGelCacheId() );
				keyXExpClsName.setOptionalExpansionClassNameGelId( keepObj.getOptionalExpansionClassNameGelId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapXExpClsName = indexByXExpClsName.get( keyXExpClsName );
				if( mapXExpClsName != null ) {
					mapXExpClsName.remove( keepObj.getPKey() );
					if( mapXExpClsName.size() <= 0 ) {
						indexByXExpClsName.remove( keyXExpClsName );
					}
				}
			}

			if( indexByXExpKeyName != null ) {
				CFGenKbGenFileByXExpKeyNameKey keyXExpKeyName =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpKeyNameKey();
				keyXExpKeyName.setOptionalExpansionKeyNameTenantId( keepObj.getOptionalExpansionKeyNameTenantId() );
				keyXExpKeyName.setOptionalExpansionKeyNameGelCacheId( keepObj.getOptionalExpansionKeyNameGelCacheId() );
				keyXExpKeyName.setOptionalExpansionKeyNameGelId( keepObj.getOptionalExpansionKeyNameGelId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapXExpKeyName = indexByXExpKeyName.get( keyXExpKeyName );
				if( mapXExpKeyName != null ) {
					mapXExpKeyName.remove( keepObj.getPKey() );
					if( mapXExpKeyName.size() <= 0 ) {
						indexByXExpKeyName.remove( keyXExpKeyName );
					}
				}
			}

			if( indexByXExpFileName != null ) {
				CFGenKbGenFileByXExpFileNameKey keyXExpFileName =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpFileNameKey();
				keyXExpFileName.setOptionalExpansionFileNameTenantId( keepObj.getOptionalExpansionFileNameTenantId() );
				keyXExpFileName.setOptionalExpansionFileNameGelCacheId( keepObj.getOptionalExpansionFileNameGelCacheId() );
				keyXExpFileName.setOptionalExpansionFileNameGelId( keepObj.getOptionalExpansionFileNameGelId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapXExpFileName = indexByXExpFileName.get( keyXExpFileName );
				if( mapXExpFileName != null ) {
					mapXExpFileName.remove( keepObj.getPKey() );
					if( mapXExpFileName.size() <= 0 ) {
						indexByXExpFileName.remove( keyXExpFileName );
					}
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (ICFGenKbGenFileObj)schema.getGenRuleTableObj().realiseGenRule( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFGenKbGenItemByTenantIdxKey keyTenantIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCartIdx != null ) {
				CFGenKbGenItemByCartIdxKey keyCartIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
				keyCartIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyCartIdx.setRequiredCartridgeId( keepObj.getRequiredCartridgeId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapCartIdx = indexByCartIdx.get( keyCartIdx );
				if( mapCartIdx != null ) {
					mapCartIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRuleTypeIdx != null ) {
				CFGenKbGenItemByRuleTypeIdxKey keyRuleTypeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
				keyRuleTypeIdx.setRequiredRuleTypeId( keepObj.getRequiredRuleTypeId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapRuleTypeIdx = indexByRuleTypeIdx.get( keyRuleTypeIdx );
				if( mapRuleTypeIdx != null ) {
					mapRuleTypeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByToolSetIdx != null ) {
				CFGenKbGenItemByToolSetIdxKey keyToolSetIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
				keyToolSetIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapToolSetIdx = indexByToolSetIdx.get( keyToolSetIdx );
				if( mapToolSetIdx != null ) {
					mapToolSetIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				CFGenKbGenItemByScopeIdxKey keyScopeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
				keyScopeIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGenDefIdx != null ) {
				CFGenKbGenItemByGenDefIdxKey keyGenDefIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
				keyGenDefIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapGenDefIdx = indexByGenDefIdx.get( keyGenDefIdx );
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
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapGelExecIdx = indexByGelExecIdx.get( keyGelExecIdx );
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
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapProbeIdx = indexByProbeIdx.get( keyProbeIdx );
				if( mapProbeIdx != null ) {
					mapProbeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByBodyIdx != null ) {
				CFGenKbGenRuleByBodyIdxKey keyBodyIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenRule().newBodyIdxKey();
				keyBodyIdx.setOptionalBodyTenantId( keepObj.getOptionalBodyTenantId() );
				keyBodyIdx.setOptionalBodyGelCacheId( keepObj.getOptionalBodyGelCacheId() );
				keyBodyIdx.setOptionalBodyGelId( keepObj.getOptionalBodyGelId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapBodyIdx = indexByBodyIdx.get( keyBodyIdx );
				if( mapBodyIdx != null ) {
					mapBodyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXSrcBundle != null ) {
				CFGenKbGenFileByXSrcBundleKey keyXSrcBundle =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSrcBundleKey();
				keyXSrcBundle.setOptionalSourceBundleTenantId( keepObj.getOptionalSourceBundleTenantId() );
				keyXSrcBundle.setOptionalSourceBundleGelCacheId( keepObj.getOptionalSourceBundleGelCacheId() );
				keyXSrcBundle.setOptionalSourceBundleGelId( keepObj.getOptionalSourceBundleGelId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapXSrcBundle = indexByXSrcBundle.get( keyXSrcBundle );
				if( mapXSrcBundle != null ) {
					mapXSrcBundle.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXModName != null ) {
				CFGenKbGenFileByXModNameKey keyXModName =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXModNameKey();
				keyXModName.setOptionalModuleNameTenantId( keepObj.getOptionalModuleNameTenantId() );
				keyXModName.setOptionalModuleNameGelCacheId( keepObj.getOptionalModuleNameGelCacheId() );
				keyXModName.setOptionalModuleNameGelId( keepObj.getOptionalModuleNameGelId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapXModName = indexByXModName.get( keyXModName );
				if( mapXModName != null ) {
					mapXModName.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXBasePkg != null ) {
				CFGenKbGenFileByXBasePkgKey keyXBasePkg =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXBasePkgKey();
				keyXBasePkg.setOptionalBasePackageTenantId( keepObj.getOptionalBasePackageTenantId() );
				keyXBasePkg.setOptionalBasePackageGelCacheId( keepObj.getOptionalBasePackageGelCacheId() );
				keyXBasePkg.setOptionalBasePackageGelId( keepObj.getOptionalBasePackageGelId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapXBasePkg = indexByXBasePkg.get( keyXBasePkg );
				if( mapXBasePkg != null ) {
					mapXBasePkg.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXSubPkg != null ) {
				CFGenKbGenFileByXSubPkgKey keyXSubPkg =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSubPkgKey();
				keyXSubPkg.setOptionalSubPackageTenantId( keepObj.getOptionalSubPackageTenantId() );
				keyXSubPkg.setOptionalSubPackageGelCacheId( keepObj.getOptionalSubPackageGelCacheId() );
				keyXSubPkg.setOptionalSubPackageGelId( keepObj.getOptionalSubPackageGelId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapXSubPkg = indexByXSubPkg.get( keyXSubPkg );
				if( mapXSubPkg != null ) {
					mapXSubPkg.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXExpClsName != null ) {
				CFGenKbGenFileByXExpClsNameKey keyXExpClsName =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpClsNameKey();
				keyXExpClsName.setOptionalExpansionClassNameTenantId( keepObj.getOptionalExpansionClassNameTenantId() );
				keyXExpClsName.setOptionalExpansionClassNameGelCacheId( keepObj.getOptionalExpansionClassNameGelCacheId() );
				keyXExpClsName.setOptionalExpansionClassNameGelId( keepObj.getOptionalExpansionClassNameGelId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapXExpClsName = indexByXExpClsName.get( keyXExpClsName );
				if( mapXExpClsName != null ) {
					mapXExpClsName.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXExpKeyName != null ) {
				CFGenKbGenFileByXExpKeyNameKey keyXExpKeyName =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpKeyNameKey();
				keyXExpKeyName.setOptionalExpansionKeyNameTenantId( keepObj.getOptionalExpansionKeyNameTenantId() );
				keyXExpKeyName.setOptionalExpansionKeyNameGelCacheId( keepObj.getOptionalExpansionKeyNameGelCacheId() );
				keyXExpKeyName.setOptionalExpansionKeyNameGelId( keepObj.getOptionalExpansionKeyNameGelId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapXExpKeyName = indexByXExpKeyName.get( keyXExpKeyName );
				if( mapXExpKeyName != null ) {
					mapXExpKeyName.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXExpFileName != null ) {
				CFGenKbGenFileByXExpFileNameKey keyXExpFileName =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpFileNameKey();
				keyXExpFileName.setOptionalExpansionFileNameTenantId( keepObj.getOptionalExpansionFileNameTenantId() );
				keyXExpFileName.setOptionalExpansionFileNameGelCacheId( keepObj.getOptionalExpansionFileNameGelCacheId() );
				keyXExpFileName.setOptionalExpansionFileNameGelId( keepObj.getOptionalExpansionFileNameGelId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapXExpFileName = indexByXExpFileName.get( keyXExpFileName );
				if( mapXExpFileName != null ) {
					mapXExpFileName.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allGenFile != null ) {
				allGenFile.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (ICFGenKbGenFileObj)schema.getGenRuleTableObj().realiseGenRule( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allGenFile != null ) {
				allGenFile.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFGenKbGenItemByTenantIdxKey keyTenantIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCartIdx != null ) {
				CFGenKbGenItemByCartIdxKey keyCartIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
				keyCartIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyCartIdx.setRequiredCartridgeId( keepObj.getRequiredCartridgeId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapCartIdx = indexByCartIdx.get( keyCartIdx );
				if( mapCartIdx != null ) {
					mapCartIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRuleTypeIdx != null ) {
				CFGenKbGenItemByRuleTypeIdxKey keyRuleTypeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
				keyRuleTypeIdx.setRequiredRuleTypeId( keepObj.getRequiredRuleTypeId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapRuleTypeIdx = indexByRuleTypeIdx.get( keyRuleTypeIdx );
				if( mapRuleTypeIdx != null ) {
					mapRuleTypeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByToolSetIdx != null ) {
				CFGenKbGenItemByToolSetIdxKey keyToolSetIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
				keyToolSetIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapToolSetIdx = indexByToolSetIdx.get( keyToolSetIdx );
				if( mapToolSetIdx != null ) {
					mapToolSetIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				CFGenKbGenItemByScopeIdxKey keyScopeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
				keyScopeIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGenDefIdx != null ) {
				CFGenKbGenItemByGenDefIdxKey keyGenDefIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
				keyGenDefIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapGenDefIdx = indexByGenDefIdx.get( keyGenDefIdx );
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
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapGelExecIdx = indexByGelExecIdx.get( keyGelExecIdx );
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
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapProbeIdx = indexByProbeIdx.get( keyProbeIdx );
				if( mapProbeIdx != null ) {
					mapProbeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByBodyIdx != null ) {
				CFGenKbGenRuleByBodyIdxKey keyBodyIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenRule().newBodyIdxKey();
				keyBodyIdx.setOptionalBodyTenantId( keepObj.getOptionalBodyTenantId() );
				keyBodyIdx.setOptionalBodyGelCacheId( keepObj.getOptionalBodyGelCacheId() );
				keyBodyIdx.setOptionalBodyGelId( keepObj.getOptionalBodyGelId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapBodyIdx = indexByBodyIdx.get( keyBodyIdx );
				if( mapBodyIdx != null ) {
					mapBodyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXSrcBundle != null ) {
				CFGenKbGenFileByXSrcBundleKey keyXSrcBundle =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSrcBundleKey();
				keyXSrcBundle.setOptionalSourceBundleTenantId( keepObj.getOptionalSourceBundleTenantId() );
				keyXSrcBundle.setOptionalSourceBundleGelCacheId( keepObj.getOptionalSourceBundleGelCacheId() );
				keyXSrcBundle.setOptionalSourceBundleGelId( keepObj.getOptionalSourceBundleGelId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapXSrcBundle = indexByXSrcBundle.get( keyXSrcBundle );
				if( mapXSrcBundle != null ) {
					mapXSrcBundle.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXModName != null ) {
				CFGenKbGenFileByXModNameKey keyXModName =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXModNameKey();
				keyXModName.setOptionalModuleNameTenantId( keepObj.getOptionalModuleNameTenantId() );
				keyXModName.setOptionalModuleNameGelCacheId( keepObj.getOptionalModuleNameGelCacheId() );
				keyXModName.setOptionalModuleNameGelId( keepObj.getOptionalModuleNameGelId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapXModName = indexByXModName.get( keyXModName );
				if( mapXModName != null ) {
					mapXModName.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXBasePkg != null ) {
				CFGenKbGenFileByXBasePkgKey keyXBasePkg =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXBasePkgKey();
				keyXBasePkg.setOptionalBasePackageTenantId( keepObj.getOptionalBasePackageTenantId() );
				keyXBasePkg.setOptionalBasePackageGelCacheId( keepObj.getOptionalBasePackageGelCacheId() );
				keyXBasePkg.setOptionalBasePackageGelId( keepObj.getOptionalBasePackageGelId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapXBasePkg = indexByXBasePkg.get( keyXBasePkg );
				if( mapXBasePkg != null ) {
					mapXBasePkg.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXSubPkg != null ) {
				CFGenKbGenFileByXSubPkgKey keyXSubPkg =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSubPkgKey();
				keyXSubPkg.setOptionalSubPackageTenantId( keepObj.getOptionalSubPackageTenantId() );
				keyXSubPkg.setOptionalSubPackageGelCacheId( keepObj.getOptionalSubPackageGelCacheId() );
				keyXSubPkg.setOptionalSubPackageGelId( keepObj.getOptionalSubPackageGelId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapXSubPkg = indexByXSubPkg.get( keyXSubPkg );
				if( mapXSubPkg != null ) {
					mapXSubPkg.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXExpClsName != null ) {
				CFGenKbGenFileByXExpClsNameKey keyXExpClsName =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpClsNameKey();
				keyXExpClsName.setOptionalExpansionClassNameTenantId( keepObj.getOptionalExpansionClassNameTenantId() );
				keyXExpClsName.setOptionalExpansionClassNameGelCacheId( keepObj.getOptionalExpansionClassNameGelCacheId() );
				keyXExpClsName.setOptionalExpansionClassNameGelId( keepObj.getOptionalExpansionClassNameGelId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapXExpClsName = indexByXExpClsName.get( keyXExpClsName );
				if( mapXExpClsName != null ) {
					mapXExpClsName.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXExpKeyName != null ) {
				CFGenKbGenFileByXExpKeyNameKey keyXExpKeyName =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpKeyNameKey();
				keyXExpKeyName.setOptionalExpansionKeyNameTenantId( keepObj.getOptionalExpansionKeyNameTenantId() );
				keyXExpKeyName.setOptionalExpansionKeyNameGelCacheId( keepObj.getOptionalExpansionKeyNameGelCacheId() );
				keyXExpKeyName.setOptionalExpansionKeyNameGelId( keepObj.getOptionalExpansionKeyNameGelId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapXExpKeyName = indexByXExpKeyName.get( keyXExpKeyName );
				if( mapXExpKeyName != null ) {
					mapXExpKeyName.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXExpFileName != null ) {
				CFGenKbGenFileByXExpFileNameKey keyXExpFileName =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpFileNameKey();
				keyXExpFileName.setOptionalExpansionFileNameTenantId( keepObj.getOptionalExpansionFileNameTenantId() );
				keyXExpFileName.setOptionalExpansionFileNameGelCacheId( keepObj.getOptionalExpansionFileNameGelCacheId() );
				keyXExpFileName.setOptionalExpansionFileNameGelId( keepObj.getOptionalExpansionFileNameGelId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj > mapXExpFileName = indexByXExpFileName.get( keyXExpFileName );
				if( mapXExpFileName != null ) {
					mapXExpFileName.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFGenKbGenFileObj createGenFile( ICFGenKbGenFileObj Obj ) {
		ICFGenKbGenFileObj obj = Obj;
		CFGenKbGenFileBuff buff = obj.getGenFileBuff();
		((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().createGenFile(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a932" ) ) {
			obj = (ICFGenKbGenFileObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public ICFGenKbGenFileObj readGenFile( CFGenKbGenItemPKey pkey ) {
		return( readGenFile( pkey, false ) );
	}

	public ICFGenKbGenFileObj readGenFile( CFGenKbGenItemPKey pkey, boolean forceRead ) {
		ICFGenKbGenFileObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFGenKbGenFileBuff readBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().readDerivedByItemIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredCartridgeId(),
				pkey.getRequiredItemId() );
			if( readBuff != null ) {
				obj = (ICFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFGenKbGenFileObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbGenFileObj readCachedGenFile( CFGenKbGenItemPKey pkey ) {
		ICFGenKbGenFileObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeGenFile( ICFGenKbGenFileObj obj )
	{
		final String S_ProcName = "CFGenKbGenFileTableObj.reallyDeepDisposeGenFile() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFGenKbGenItemPKey pkey = obj.getPKey();
		ICFGenKbGenFileObj existing = readCachedGenFile( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFGenKbGenFileByXSrcBundleKey keyXSrcBundle = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSrcBundleKey();
		keyXSrcBundle.setOptionalSourceBundleTenantId( existing.getOptionalSourceBundleTenantId() );
		keyXSrcBundle.setOptionalSourceBundleGelCacheId( existing.getOptionalSourceBundleGelCacheId() );
		keyXSrcBundle.setOptionalSourceBundleGelId( existing.getOptionalSourceBundleGelId() );

		CFGenKbGenFileByXModNameKey keyXModName = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXModNameKey();
		keyXModName.setOptionalModuleNameTenantId( existing.getOptionalModuleNameTenantId() );
		keyXModName.setOptionalModuleNameGelCacheId( existing.getOptionalModuleNameGelCacheId() );
		keyXModName.setOptionalModuleNameGelId( existing.getOptionalModuleNameGelId() );

		CFGenKbGenFileByXBasePkgKey keyXBasePkg = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXBasePkgKey();
		keyXBasePkg.setOptionalBasePackageTenantId( existing.getOptionalBasePackageTenantId() );
		keyXBasePkg.setOptionalBasePackageGelCacheId( existing.getOptionalBasePackageGelCacheId() );
		keyXBasePkg.setOptionalBasePackageGelId( existing.getOptionalBasePackageGelId() );

		CFGenKbGenFileByXSubPkgKey keyXSubPkg = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSubPkgKey();
		keyXSubPkg.setOptionalSubPackageTenantId( existing.getOptionalSubPackageTenantId() );
		keyXSubPkg.setOptionalSubPackageGelCacheId( existing.getOptionalSubPackageGelCacheId() );
		keyXSubPkg.setOptionalSubPackageGelId( existing.getOptionalSubPackageGelId() );

		CFGenKbGenFileByXExpClsNameKey keyXExpClsName = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpClsNameKey();
		keyXExpClsName.setOptionalExpansionClassNameTenantId( existing.getOptionalExpansionClassNameTenantId() );
		keyXExpClsName.setOptionalExpansionClassNameGelCacheId( existing.getOptionalExpansionClassNameGelCacheId() );
		keyXExpClsName.setOptionalExpansionClassNameGelId( existing.getOptionalExpansionClassNameGelId() );

		CFGenKbGenFileByXExpKeyNameKey keyXExpKeyName = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpKeyNameKey();
		keyXExpKeyName.setOptionalExpansionKeyNameTenantId( existing.getOptionalExpansionKeyNameTenantId() );
		keyXExpKeyName.setOptionalExpansionKeyNameGelCacheId( existing.getOptionalExpansionKeyNameGelCacheId() );
		keyXExpKeyName.setOptionalExpansionKeyNameGelId( existing.getOptionalExpansionKeyNameGelId() );

		CFGenKbGenFileByXExpFileNameKey keyXExpFileName = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpFileNameKey();
		keyXExpFileName.setOptionalExpansionFileNameTenantId( existing.getOptionalExpansionFileNameTenantId() );
		keyXExpFileName.setOptionalExpansionFileNameGelCacheId( existing.getOptionalExpansionFileNameGelCacheId() );
		keyXExpFileName.setOptionalExpansionFileNameGelId( existing.getOptionalExpansionFileNameGelId() );


		schema.getGelExecutableTableObj().deepDisposeGelExecutableByPIdx( existing.getOptionalSourceBundleTenantId(),
						existing.getOptionalSourceBundleGelCacheId(),
						existing.getOptionalSourceBundleGelId() );
		schema.getGelExecutableTableObj().deepDisposeGelExecutableByPIdx( existing.getOptionalBasePackageTenantId(),
						existing.getOptionalBasePackageGelCacheId(),
						existing.getOptionalBasePackageGelId() );
		schema.getGelExecutableTableObj().deepDisposeGelExecutableByPIdx( existing.getOptionalModuleNameTenantId(),
						existing.getOptionalModuleNameGelCacheId(),
						existing.getOptionalModuleNameGelId() );
		schema.getGelExecutableTableObj().deepDisposeGelExecutableByPIdx( existing.getOptionalSubPackageTenantId(),
						existing.getOptionalSubPackageGelCacheId(),
						existing.getOptionalSubPackageGelId() );
		schema.getGelExecutableTableObj().deepDisposeGelExecutableByPIdx( existing.getOptionalExpansionClassNameTenantId(),
						existing.getOptionalExpansionClassNameGelCacheId(),
						existing.getOptionalExpansionClassNameGelId() );
		schema.getGelExecutableTableObj().deepDisposeGelExecutableByPIdx( existing.getOptionalExpansionKeyNameTenantId(),
						existing.getOptionalExpansionKeyNameGelCacheId(),
						existing.getOptionalExpansionKeyNameGelId() );
		schema.getGelExecutableTableObj().deepDisposeGelExecutableByPIdx( existing.getOptionalExpansionFileNameTenantId(),
						existing.getOptionalExpansionFileNameGelCacheId(),
						existing.getOptionalExpansionFileNameGelId() );
		schema.getGelExecutableTableObj().deepDisposeGelExecutableByPIdx( existing.getOptionalBodyTenantId(),
						existing.getOptionalBodyGelCacheId(),
						existing.getOptionalBodyGelId() );
		schema.getGelExecutableTableObj().deepDisposeGelExecutableByPIdx( existing.getOptionalGelExecutableTenantId(),
						existing.getOptionalGelExecutableGelCacheId(),
						existing.getOptionalGelExecutableId() );

		if( indexByXSrcBundle != null ) {
			if( indexByXSrcBundle.containsKey( keyXSrcBundle ) ) {
				indexByXSrcBundle.get( keyXSrcBundle ).remove( pkey );
				if( indexByXSrcBundle.get( keyXSrcBundle ).size() <= 0 ) {
					indexByXSrcBundle.remove( keyXSrcBundle );
				}
			}
		}

		if( indexByXModName != null ) {
			if( indexByXModName.containsKey( keyXModName ) ) {
				indexByXModName.get( keyXModName ).remove( pkey );
				if( indexByXModName.get( keyXModName ).size() <= 0 ) {
					indexByXModName.remove( keyXModName );
				}
			}
		}

		if( indexByXBasePkg != null ) {
			if( indexByXBasePkg.containsKey( keyXBasePkg ) ) {
				indexByXBasePkg.get( keyXBasePkg ).remove( pkey );
				if( indexByXBasePkg.get( keyXBasePkg ).size() <= 0 ) {
					indexByXBasePkg.remove( keyXBasePkg );
				}
			}
		}

		if( indexByXSubPkg != null ) {
			if( indexByXSubPkg.containsKey( keyXSubPkg ) ) {
				indexByXSubPkg.get( keyXSubPkg ).remove( pkey );
				if( indexByXSubPkg.get( keyXSubPkg ).size() <= 0 ) {
					indexByXSubPkg.remove( keyXSubPkg );
				}
			}
		}

		if( indexByXExpClsName != null ) {
			if( indexByXExpClsName.containsKey( keyXExpClsName ) ) {
				indexByXExpClsName.get( keyXExpClsName ).remove( pkey );
				if( indexByXExpClsName.get( keyXExpClsName ).size() <= 0 ) {
					indexByXExpClsName.remove( keyXExpClsName );
				}
			}
		}

		if( indexByXExpKeyName != null ) {
			if( indexByXExpKeyName.containsKey( keyXExpKeyName ) ) {
				indexByXExpKeyName.get( keyXExpKeyName ).remove( pkey );
				if( indexByXExpKeyName.get( keyXExpKeyName ).size() <= 0 ) {
					indexByXExpKeyName.remove( keyXExpKeyName );
				}
			}
		}

		if( indexByXExpFileName != null ) {
			if( indexByXExpFileName.containsKey( keyXExpFileName ) ) {
				indexByXExpFileName.get( keyXExpFileName ).remove( pkey );
				if( indexByXExpFileName.get( keyXExpFileName ).size() <= 0 ) {
					indexByXExpFileName.remove( keyXExpFileName );
				}
			}
		}


		schema.getGenRuleTableObj().reallyDeepDisposeGenRule( obj );
	}
	public void deepDisposeGenFile( CFGenKbGenItemPKey pkey ) {
		ICFGenKbGenFileObj obj = readCachedGenFile( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFGenKbGenFileObj lockGenFile( CFGenKbGenItemPKey pkey ) {
		ICFGenKbGenFileObj locked = null;
		CFGenKbGenFileBuff lockBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (ICFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFGenKbGenFileObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockGenFile", pkey );
		}
		return( locked );
	}

	public List<ICFGenKbGenFileObj> readAllGenFile() {
		return( readAllGenFile( false ) );
	}

	public List<ICFGenKbGenFileObj> readAllGenFile( boolean forceRead ) {
		final String S_ProcName = "readAllGenFile";
		if( ( allGenFile == null ) || forceRead ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> map = new HashMap<CFGenKbGenItemPKey,ICFGenKbGenFileObj>();
			allGenFile = map;
			CFGenKbGenFileBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().readAllDerived( schema.getAuthorization() );
			CFGenKbGenFileBuff buff;
			ICFGenKbGenFileObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenFileObj realised = (ICFGenKbGenFileObj)obj.realise();
			}
		}
		int len = allGenFile.size();
		ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
		Iterator<ICFGenKbGenFileObj> valIter = allGenFile.values().iterator();
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
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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
		List<ICFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGenFileObj> readCachedAllGenFile() {
		final String S_ProcName = "readCachedAllGenFile";
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>();
		if( allGenFile != null ) {
			int len = allGenFile.size();
			ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
			Iterator<ICFGenKbGenFileObj> valIter = allGenFile.values().iterator();
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
		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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

	public ICFGenKbGenFileObj readGenFileByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		return( readGenFileByItemIdIdx( TenantId,
			CartridgeId,
			ItemId,
			false ) );
	}

	public ICFGenKbGenFileObj readGenFileByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId, boolean forceRead )
	{
		CFGenKbGenItemPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredCartridgeId( CartridgeId );
		pkey.setRequiredItemId( ItemId );
		ICFGenKbGenFileObj obj = readGenFile( pkey, forceRead );
		return( obj );
	}

	public List<ICFGenKbGenFileObj> readGenFileByTenantIdx( long TenantId )
	{
		return( readGenFileByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFGenKbGenFileObj> readGenFileByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByTenantIdx";
		CFGenKbGenItemByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFGenKbGenItemByTenantIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenFileObj>();
			ICFGenKbGenItemObj obj;
			CFGenKbGenItemBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenFileObj realised = (ICFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
		Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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
		List<ICFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGenFileObj> readGenFileByCartIdx( long TenantId,
		long CartridgeId )
	{
		return( readGenFileByCartIdx( TenantId,
			CartridgeId,
			false ) );
	}

	public List<ICFGenKbGenFileObj> readGenFileByCartIdx( long TenantId,
		long CartridgeId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByCartIdx";
		CFGenKbGenItemByCartIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
		if( indexByCartIdx == null ) {
			indexByCartIdx = new HashMap< CFGenKbGenItemByCartIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByCartIdx.containsKey( key ) ) {
			dict = indexByCartIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenFileObj>();
			ICFGenKbGenItemObj obj;
			CFGenKbGenItemBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByCartIdx( schema.getAuthorization(),
				TenantId,
				CartridgeId );
			CFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenFileObj realised = (ICFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByCartIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
		Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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
		List<ICFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGenFileObj> readGenFileByRuleTypeIdx( short RuleTypeId )
	{
		return( readGenFileByRuleTypeIdx( RuleTypeId,
			false ) );
	}

	public List<ICFGenKbGenFileObj> readGenFileByRuleTypeIdx( short RuleTypeId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByRuleTypeIdx";
		CFGenKbGenItemByRuleTypeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( RuleTypeId );
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
		if( indexByRuleTypeIdx == null ) {
			indexByRuleTypeIdx = new HashMap< CFGenKbGenItemByRuleTypeIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByRuleTypeIdx.containsKey( key ) ) {
			dict = indexByRuleTypeIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenFileObj>();
			ICFGenKbGenItemObj obj;
			CFGenKbGenItemBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByRuleTypeIdx( schema.getAuthorization(),
				RuleTypeId );
			CFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenFileObj realised = (ICFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRuleTypeIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
		Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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
		List<ICFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGenFileObj> readGenFileByToolSetIdx( short ToolSetId )
	{
		return( readGenFileByToolSetIdx( ToolSetId,
			false ) );
	}

	public List<ICFGenKbGenFileObj> readGenFileByToolSetIdx( short ToolSetId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByToolSetIdx";
		CFGenKbGenItemByToolSetIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( ToolSetId );
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
		if( indexByToolSetIdx == null ) {
			indexByToolSetIdx = new HashMap< CFGenKbGenItemByToolSetIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByToolSetIdx.containsKey( key ) ) {
			dict = indexByToolSetIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenFileObj>();
			ICFGenKbGenItemObj obj;
			CFGenKbGenItemBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByToolSetIdx( schema.getAuthorization(),
				ToolSetId );
			CFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenFileObj realised = (ICFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByToolSetIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
		Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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
		List<ICFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGenFileObj> readGenFileByScopeIdx( Short ScopeDefId )
	{
		return( readGenFileByScopeIdx( ScopeDefId,
			false ) );
	}

	public List<ICFGenKbGenFileObj> readGenFileByScopeIdx( Short ScopeDefId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByScopeIdx";
		CFGenKbGenItemByScopeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( ScopeDefId );
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< CFGenKbGenItemByScopeIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByScopeIdx.containsKey( key ) ) {
			dict = indexByScopeIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenFileObj>();
			ICFGenKbGenItemObj obj;
			CFGenKbGenItemBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByScopeIdx( schema.getAuthorization(),
				ScopeDefId );
			CFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenFileObj realised = (ICFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
		Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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
		List<ICFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGenFileObj> readGenFileByGenDefIdx( short GenDefId )
	{
		return( readGenFileByGenDefIdx( GenDefId,
			false ) );
	}

	public List<ICFGenKbGenFileObj> readGenFileByGenDefIdx( short GenDefId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByGenDefIdx";
		CFGenKbGenItemByGenDefIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( GenDefId );
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
		if( indexByGenDefIdx == null ) {
			indexByGenDefIdx = new HashMap< CFGenKbGenItemByGenDefIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByGenDefIdx.containsKey( key ) ) {
			dict = indexByGenDefIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenFileObj>();
			ICFGenKbGenItemObj obj;
			CFGenKbGenItemBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByGenDefIdx( schema.getAuthorization(),
				GenDefId );
			CFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenFileObj realised = (ICFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGenDefIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
		Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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
		List<ICFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFGenKbGenFileObj readGenFileByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		return( readGenFileByAltIdx( Name,
			ToolSetId,
			ScopeDefId,
			GenDefId,
			false ) );
	}

	public ICFGenKbGenFileObj readGenFileByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId, boolean forceRead )
	{
		if( indexByAltIdx == null ) {
			indexByAltIdx = new HashMap< CFGenKbGenItemByAltIdxKey,
				ICFGenKbGenFileObj >();
		}
		CFGenKbGenItemByAltIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newAltIdxKey();
		key.setRequiredName( Name );
		key.setRequiredToolSetId( ToolSetId );
		key.setOptionalScopeDefId( ScopeDefId );
		key.setRequiredGenDefId( GenDefId );
		ICFGenKbGenFileObj obj = null;
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
				obj = (ICFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				obj = (ICFGenKbGenFileObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<ICFGenKbGenFileObj> readGenFileByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		return( readGenFileByGelExecIdx( GelExecutableTenantId,
			GelExecutableGelCacheId,
			GelExecutableId,
			false ) );
	}

	public List<ICFGenKbGenFileObj> readGenFileByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByGelExecIdx";
		CFGenKbGenItemByGelExecIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( GelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( GelExecutableGelCacheId );
		key.setOptionalGelExecutableId( GelExecutableId );
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
		if( indexByGelExecIdx == null ) {
			indexByGelExecIdx = new HashMap< CFGenKbGenItemByGelExecIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByGelExecIdx.containsKey( key ) ) {
			dict = indexByGelExecIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenFileObj>();
			ICFGenKbGenItemObj obj;
			CFGenKbGenItemBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByGelExecIdx( schema.getAuthorization(),
				GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
			CFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenFileObj realised = (ICFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGelExecIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
		Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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
		List<ICFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGenFileObj> readGenFileByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		return( readGenFileByProbeIdx( ProbeTenantId,
			ProbeCartridgeId,
			ProbeGenItemId,
			false ) );
	}

	public List<ICFGenKbGenFileObj> readGenFileByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByProbeIdx";
		CFGenKbGenItemByProbeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( ProbeTenantId );
		key.setOptionalProbeCartridgeId( ProbeCartridgeId );
		key.setOptionalProbeGenItemId( ProbeGenItemId );
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
		if( indexByProbeIdx == null ) {
			indexByProbeIdx = new HashMap< CFGenKbGenItemByProbeIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByProbeIdx.containsKey( key ) ) {
			dict = indexByProbeIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenFileObj>();
			ICFGenKbGenItemObj obj;
			CFGenKbGenItemBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByProbeIdx( schema.getAuthorization(),
				ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
			CFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenFileObj realised = (ICFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByProbeIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
		Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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
		List<ICFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGenFileObj> readGenFileByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId )
	{
		return( readGenFileByBodyIdx( BodyTenantId,
			BodyGelCacheId,
			BodyGelId,
			false ) );
	}

	public List<ICFGenKbGenFileObj> readGenFileByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByBodyIdx";
		CFGenKbGenRuleByBodyIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenRule().newBodyIdxKey();
		key.setOptionalBodyTenantId( BodyTenantId );
		key.setOptionalBodyGelCacheId( BodyGelCacheId );
		key.setOptionalBodyGelId( BodyGelId );
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
		if( indexByBodyIdx == null ) {
			indexByBodyIdx = new HashMap< CFGenKbGenRuleByBodyIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByBodyIdx.containsKey( key ) ) {
			dict = indexByBodyIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenFileObj>();
			ICFGenKbGenRuleObj obj;
			CFGenKbGenRuleBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenRule().readDerivedByBodyIdx( schema.getAuthorization(),
				BodyTenantId,
				BodyGelCacheId,
				BodyGelId );
			CFGenKbGenRuleBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenFileObj realised = (ICFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByBodyIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
		Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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
		List<ICFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGenFileObj> readGenFileByXSrcBundle( Long SourceBundleTenantId,
		Long SourceBundleGelCacheId,
		Long SourceBundleGelId )
	{
		return( readGenFileByXSrcBundle( SourceBundleTenantId,
			SourceBundleGelCacheId,
			SourceBundleGelId,
			false ) );
	}

	public List<ICFGenKbGenFileObj> readGenFileByXSrcBundle( Long SourceBundleTenantId,
		Long SourceBundleGelCacheId,
		Long SourceBundleGelId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByXSrcBundle";
		CFGenKbGenFileByXSrcBundleKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSrcBundleKey();
		key.setOptionalSourceBundleTenantId( SourceBundleTenantId );
		key.setOptionalSourceBundleGelCacheId( SourceBundleGelCacheId );
		key.setOptionalSourceBundleGelId( SourceBundleGelId );
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
		if( indexByXSrcBundle == null ) {
			indexByXSrcBundle = new HashMap< CFGenKbGenFileByXSrcBundleKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByXSrcBundle.containsKey( key ) ) {
			dict = indexByXSrcBundle.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenFileObj>();
			ICFGenKbGenFileObj obj;
			CFGenKbGenFileBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().readDerivedByXSrcBundle( schema.getAuthorization(),
				SourceBundleTenantId,
				SourceBundleGelCacheId,
				SourceBundleGelId );
			CFGenKbGenFileBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenFileObj realised = (ICFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByXSrcBundle.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
		Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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
		List<ICFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGenFileObj> readGenFileByXModName( Long ModuleNameTenantId,
		Long ModuleNameGelCacheId,
		Long ModuleNameGelId )
	{
		return( readGenFileByXModName( ModuleNameTenantId,
			ModuleNameGelCacheId,
			ModuleNameGelId,
			false ) );
	}

	public List<ICFGenKbGenFileObj> readGenFileByXModName( Long ModuleNameTenantId,
		Long ModuleNameGelCacheId,
		Long ModuleNameGelId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByXModName";
		CFGenKbGenFileByXModNameKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXModNameKey();
		key.setOptionalModuleNameTenantId( ModuleNameTenantId );
		key.setOptionalModuleNameGelCacheId( ModuleNameGelCacheId );
		key.setOptionalModuleNameGelId( ModuleNameGelId );
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
		if( indexByXModName == null ) {
			indexByXModName = new HashMap< CFGenKbGenFileByXModNameKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByXModName.containsKey( key ) ) {
			dict = indexByXModName.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenFileObj>();
			ICFGenKbGenFileObj obj;
			CFGenKbGenFileBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().readDerivedByXModName( schema.getAuthorization(),
				ModuleNameTenantId,
				ModuleNameGelCacheId,
				ModuleNameGelId );
			CFGenKbGenFileBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenFileObj realised = (ICFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByXModName.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
		Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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
		List<ICFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGenFileObj> readGenFileByXBasePkg( Long BasePackageTenantId,
		Long BasePackageGelCacheId,
		Long BasePackageGelId )
	{
		return( readGenFileByXBasePkg( BasePackageTenantId,
			BasePackageGelCacheId,
			BasePackageGelId,
			false ) );
	}

	public List<ICFGenKbGenFileObj> readGenFileByXBasePkg( Long BasePackageTenantId,
		Long BasePackageGelCacheId,
		Long BasePackageGelId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByXBasePkg";
		CFGenKbGenFileByXBasePkgKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXBasePkgKey();
		key.setOptionalBasePackageTenantId( BasePackageTenantId );
		key.setOptionalBasePackageGelCacheId( BasePackageGelCacheId );
		key.setOptionalBasePackageGelId( BasePackageGelId );
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
		if( indexByXBasePkg == null ) {
			indexByXBasePkg = new HashMap< CFGenKbGenFileByXBasePkgKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByXBasePkg.containsKey( key ) ) {
			dict = indexByXBasePkg.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenFileObj>();
			ICFGenKbGenFileObj obj;
			CFGenKbGenFileBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().readDerivedByXBasePkg( schema.getAuthorization(),
				BasePackageTenantId,
				BasePackageGelCacheId,
				BasePackageGelId );
			CFGenKbGenFileBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenFileObj realised = (ICFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByXBasePkg.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
		Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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
		List<ICFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGenFileObj> readGenFileByXSubPkg( Long SubPackageTenantId,
		Long SubPackageGelCacheId,
		Long SubPackageGelId )
	{
		return( readGenFileByXSubPkg( SubPackageTenantId,
			SubPackageGelCacheId,
			SubPackageGelId,
			false ) );
	}

	public List<ICFGenKbGenFileObj> readGenFileByXSubPkg( Long SubPackageTenantId,
		Long SubPackageGelCacheId,
		Long SubPackageGelId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByXSubPkg";
		CFGenKbGenFileByXSubPkgKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSubPkgKey();
		key.setOptionalSubPackageTenantId( SubPackageTenantId );
		key.setOptionalSubPackageGelCacheId( SubPackageGelCacheId );
		key.setOptionalSubPackageGelId( SubPackageGelId );
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
		if( indexByXSubPkg == null ) {
			indexByXSubPkg = new HashMap< CFGenKbGenFileByXSubPkgKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByXSubPkg.containsKey( key ) ) {
			dict = indexByXSubPkg.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenFileObj>();
			ICFGenKbGenFileObj obj;
			CFGenKbGenFileBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().readDerivedByXSubPkg( schema.getAuthorization(),
				SubPackageTenantId,
				SubPackageGelCacheId,
				SubPackageGelId );
			CFGenKbGenFileBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenFileObj realised = (ICFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByXSubPkg.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
		Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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
		List<ICFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGenFileObj> readGenFileByXExpClsName( Long ExpansionClassNameTenantId,
		Long ExpansionClassNameGelCacheId,
		Long ExpansionClassNameGelId )
	{
		return( readGenFileByXExpClsName( ExpansionClassNameTenantId,
			ExpansionClassNameGelCacheId,
			ExpansionClassNameGelId,
			false ) );
	}

	public List<ICFGenKbGenFileObj> readGenFileByXExpClsName( Long ExpansionClassNameTenantId,
		Long ExpansionClassNameGelCacheId,
		Long ExpansionClassNameGelId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByXExpClsName";
		CFGenKbGenFileByXExpClsNameKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpClsNameKey();
		key.setOptionalExpansionClassNameTenantId( ExpansionClassNameTenantId );
		key.setOptionalExpansionClassNameGelCacheId( ExpansionClassNameGelCacheId );
		key.setOptionalExpansionClassNameGelId( ExpansionClassNameGelId );
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
		if( indexByXExpClsName == null ) {
			indexByXExpClsName = new HashMap< CFGenKbGenFileByXExpClsNameKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByXExpClsName.containsKey( key ) ) {
			dict = indexByXExpClsName.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenFileObj>();
			ICFGenKbGenFileObj obj;
			CFGenKbGenFileBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().readDerivedByXExpClsName( schema.getAuthorization(),
				ExpansionClassNameTenantId,
				ExpansionClassNameGelCacheId,
				ExpansionClassNameGelId );
			CFGenKbGenFileBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenFileObj realised = (ICFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByXExpClsName.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
		Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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
		List<ICFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGenFileObj> readGenFileByXExpKeyName( Long ExpansionKeyNameTenantId,
		Long ExpansionKeyNameGelCacheId,
		Long ExpansionKeyNameGelId )
	{
		return( readGenFileByXExpKeyName( ExpansionKeyNameTenantId,
			ExpansionKeyNameGelCacheId,
			ExpansionKeyNameGelId,
			false ) );
	}

	public List<ICFGenKbGenFileObj> readGenFileByXExpKeyName( Long ExpansionKeyNameTenantId,
		Long ExpansionKeyNameGelCacheId,
		Long ExpansionKeyNameGelId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByXExpKeyName";
		CFGenKbGenFileByXExpKeyNameKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpKeyNameKey();
		key.setOptionalExpansionKeyNameTenantId( ExpansionKeyNameTenantId );
		key.setOptionalExpansionKeyNameGelCacheId( ExpansionKeyNameGelCacheId );
		key.setOptionalExpansionKeyNameGelId( ExpansionKeyNameGelId );
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
		if( indexByXExpKeyName == null ) {
			indexByXExpKeyName = new HashMap< CFGenKbGenFileByXExpKeyNameKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByXExpKeyName.containsKey( key ) ) {
			dict = indexByXExpKeyName.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenFileObj>();
			ICFGenKbGenFileObj obj;
			CFGenKbGenFileBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().readDerivedByXExpKeyName( schema.getAuthorization(),
				ExpansionKeyNameTenantId,
				ExpansionKeyNameGelCacheId,
				ExpansionKeyNameGelId );
			CFGenKbGenFileBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenFileObj realised = (ICFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByXExpKeyName.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
		Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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
		List<ICFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGenFileObj> readGenFileByXExpFileName( Long ExpansionFileNameTenantId,
		Long ExpansionFileNameGelCacheId,
		Long ExpansionFileNameGelId )
	{
		return( readGenFileByXExpFileName( ExpansionFileNameTenantId,
			ExpansionFileNameGelCacheId,
			ExpansionFileNameGelId,
			false ) );
	}

	public List<ICFGenKbGenFileObj> readGenFileByXExpFileName( Long ExpansionFileNameTenantId,
		Long ExpansionFileNameGelCacheId,
		Long ExpansionFileNameGelId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByXExpFileName";
		CFGenKbGenFileByXExpFileNameKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpFileNameKey();
		key.setOptionalExpansionFileNameTenantId( ExpansionFileNameTenantId );
		key.setOptionalExpansionFileNameGelCacheId( ExpansionFileNameGelCacheId );
		key.setOptionalExpansionFileNameGelId( ExpansionFileNameGelId );
		Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
		if( indexByXExpFileName == null ) {
			indexByXExpFileName = new HashMap< CFGenKbGenFileByXExpFileNameKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByXExpFileName.containsKey( key ) ) {
			dict = indexByXExpFileName.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenFileObj>();
			ICFGenKbGenFileObj obj;
			CFGenKbGenFileBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().readDerivedByXExpFileName( schema.getAuthorization(),
				ExpansionFileNameTenantId,
				ExpansionFileNameGelCacheId,
				ExpansionFileNameGelId );
			CFGenKbGenFileBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenFileObj realised = (ICFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByXExpFileName.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
		Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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
		List<ICFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFGenKbGenFileObj readCachedGenFileByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		ICFGenKbGenFileObj obj = null;
		CFGenKbGenItemPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredCartridgeId( CartridgeId );
		pkey.setRequiredItemId( ItemId );
		obj = readCachedGenFile( pkey );
		return( obj );
	}

	public List<ICFGenKbGenFileObj> readCachedGenFileByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedGenFileByTenantIdx";
		CFGenKbGenItemByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>();
		if( indexByTenantIdx != null ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
				Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
			ICFGenKbGenFileObj obj;
			Iterator<ICFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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

	public List<ICFGenKbGenFileObj> readCachedGenFileByCartIdx( long TenantId,
		long CartridgeId )
	{
		final String S_ProcName = "readCachedGenFileByCartIdx";
		CFGenKbGenItemByCartIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>();
		if( indexByCartIdx != null ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
			if( indexByCartIdx.containsKey( key ) ) {
				dict = indexByCartIdx.get( key );
				int len = dict.size();
				ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
				Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
			ICFGenKbGenFileObj obj;
			Iterator<ICFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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

	public List<ICFGenKbGenFileObj> readCachedGenFileByRuleTypeIdx( short RuleTypeId )
	{
		final String S_ProcName = "readCachedGenFileByRuleTypeIdx";
		CFGenKbGenItemByRuleTypeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( RuleTypeId );
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>();
		if( indexByRuleTypeIdx != null ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
			if( indexByRuleTypeIdx.containsKey( key ) ) {
				dict = indexByRuleTypeIdx.get( key );
				int len = dict.size();
				ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
				Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
			ICFGenKbGenFileObj obj;
			Iterator<ICFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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

	public List<ICFGenKbGenFileObj> readCachedGenFileByToolSetIdx( short ToolSetId )
	{
		final String S_ProcName = "readCachedGenFileByToolSetIdx";
		CFGenKbGenItemByToolSetIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( ToolSetId );
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>();
		if( indexByToolSetIdx != null ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
			if( indexByToolSetIdx.containsKey( key ) ) {
				dict = indexByToolSetIdx.get( key );
				int len = dict.size();
				ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
				Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
			ICFGenKbGenFileObj obj;
			Iterator<ICFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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

	public List<ICFGenKbGenFileObj> readCachedGenFileByScopeIdx( Short ScopeDefId )
	{
		final String S_ProcName = "readCachedGenFileByScopeIdx";
		CFGenKbGenItemByScopeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( ScopeDefId );
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>();
		if( indexByScopeIdx != null ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
			if( indexByScopeIdx.containsKey( key ) ) {
				dict = indexByScopeIdx.get( key );
				int len = dict.size();
				ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
				Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
			ICFGenKbGenFileObj obj;
			Iterator<ICFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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

	public List<ICFGenKbGenFileObj> readCachedGenFileByGenDefIdx( short GenDefId )
	{
		final String S_ProcName = "readCachedGenFileByGenDefIdx";
		CFGenKbGenItemByGenDefIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( GenDefId );
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>();
		if( indexByGenDefIdx != null ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
			if( indexByGenDefIdx.containsKey( key ) ) {
				dict = indexByGenDefIdx.get( key );
				int len = dict.size();
				ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
				Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
			ICFGenKbGenFileObj obj;
			Iterator<ICFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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

	public ICFGenKbGenFileObj readCachedGenFileByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		ICFGenKbGenFileObj obj = null;
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
				Iterator<ICFGenKbGenFileObj> valIter = members.values().iterator();
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
			Iterator<ICFGenKbGenFileObj> valIter = members.values().iterator();
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

	public List<ICFGenKbGenFileObj> readCachedGenFileByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		final String S_ProcName = "readCachedGenFileByGelExecIdx";
		CFGenKbGenItemByGelExecIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( GelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( GelExecutableGelCacheId );
		key.setOptionalGelExecutableId( GelExecutableId );
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>();
		if( indexByGelExecIdx != null ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
			if( indexByGelExecIdx.containsKey( key ) ) {
				dict = indexByGelExecIdx.get( key );
				int len = dict.size();
				ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
				Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
			ICFGenKbGenFileObj obj;
			Iterator<ICFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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

	public List<ICFGenKbGenFileObj> readCachedGenFileByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		final String S_ProcName = "readCachedGenFileByProbeIdx";
		CFGenKbGenItemByProbeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( ProbeTenantId );
		key.setOptionalProbeCartridgeId( ProbeCartridgeId );
		key.setOptionalProbeGenItemId( ProbeGenItemId );
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>();
		if( indexByProbeIdx != null ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
			if( indexByProbeIdx.containsKey( key ) ) {
				dict = indexByProbeIdx.get( key );
				int len = dict.size();
				ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
				Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
			ICFGenKbGenFileObj obj;
			Iterator<ICFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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

	public List<ICFGenKbGenFileObj> readCachedGenFileByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId )
	{
		final String S_ProcName = "readCachedGenFileByBodyIdx";
		CFGenKbGenRuleByBodyIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenRule().newBodyIdxKey();
		key.setOptionalBodyTenantId( BodyTenantId );
		key.setOptionalBodyGelCacheId( BodyGelCacheId );
		key.setOptionalBodyGelId( BodyGelId );
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>();
		if( indexByBodyIdx != null ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
			if( indexByBodyIdx.containsKey( key ) ) {
				dict = indexByBodyIdx.get( key );
				int len = dict.size();
				ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
				Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
			ICFGenKbGenFileObj obj;
			Iterator<ICFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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

	public List<ICFGenKbGenFileObj> readCachedGenFileByXSrcBundle( Long SourceBundleTenantId,
		Long SourceBundleGelCacheId,
		Long SourceBundleGelId )
	{
		final String S_ProcName = "readCachedGenFileByXSrcBundle";
		CFGenKbGenFileByXSrcBundleKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSrcBundleKey();
		key.setOptionalSourceBundleTenantId( SourceBundleTenantId );
		key.setOptionalSourceBundleGelCacheId( SourceBundleGelCacheId );
		key.setOptionalSourceBundleGelId( SourceBundleGelId );
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>();
		if( indexByXSrcBundle != null ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
			if( indexByXSrcBundle.containsKey( key ) ) {
				dict = indexByXSrcBundle.get( key );
				int len = dict.size();
				ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
				Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
			ICFGenKbGenFileObj obj;
			Iterator<ICFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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

	public List<ICFGenKbGenFileObj> readCachedGenFileByXModName( Long ModuleNameTenantId,
		Long ModuleNameGelCacheId,
		Long ModuleNameGelId )
	{
		final String S_ProcName = "readCachedGenFileByXModName";
		CFGenKbGenFileByXModNameKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXModNameKey();
		key.setOptionalModuleNameTenantId( ModuleNameTenantId );
		key.setOptionalModuleNameGelCacheId( ModuleNameGelCacheId );
		key.setOptionalModuleNameGelId( ModuleNameGelId );
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>();
		if( indexByXModName != null ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
			if( indexByXModName.containsKey( key ) ) {
				dict = indexByXModName.get( key );
				int len = dict.size();
				ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
				Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
			ICFGenKbGenFileObj obj;
			Iterator<ICFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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

	public List<ICFGenKbGenFileObj> readCachedGenFileByXBasePkg( Long BasePackageTenantId,
		Long BasePackageGelCacheId,
		Long BasePackageGelId )
	{
		final String S_ProcName = "readCachedGenFileByXBasePkg";
		CFGenKbGenFileByXBasePkgKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXBasePkgKey();
		key.setOptionalBasePackageTenantId( BasePackageTenantId );
		key.setOptionalBasePackageGelCacheId( BasePackageGelCacheId );
		key.setOptionalBasePackageGelId( BasePackageGelId );
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>();
		if( indexByXBasePkg != null ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
			if( indexByXBasePkg.containsKey( key ) ) {
				dict = indexByXBasePkg.get( key );
				int len = dict.size();
				ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
				Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
			ICFGenKbGenFileObj obj;
			Iterator<ICFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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

	public List<ICFGenKbGenFileObj> readCachedGenFileByXSubPkg( Long SubPackageTenantId,
		Long SubPackageGelCacheId,
		Long SubPackageGelId )
	{
		final String S_ProcName = "readCachedGenFileByXSubPkg";
		CFGenKbGenFileByXSubPkgKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSubPkgKey();
		key.setOptionalSubPackageTenantId( SubPackageTenantId );
		key.setOptionalSubPackageGelCacheId( SubPackageGelCacheId );
		key.setOptionalSubPackageGelId( SubPackageGelId );
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>();
		if( indexByXSubPkg != null ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
			if( indexByXSubPkg.containsKey( key ) ) {
				dict = indexByXSubPkg.get( key );
				int len = dict.size();
				ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
				Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
			ICFGenKbGenFileObj obj;
			Iterator<ICFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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

	public List<ICFGenKbGenFileObj> readCachedGenFileByXExpClsName( Long ExpansionClassNameTenantId,
		Long ExpansionClassNameGelCacheId,
		Long ExpansionClassNameGelId )
	{
		final String S_ProcName = "readCachedGenFileByXExpClsName";
		CFGenKbGenFileByXExpClsNameKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpClsNameKey();
		key.setOptionalExpansionClassNameTenantId( ExpansionClassNameTenantId );
		key.setOptionalExpansionClassNameGelCacheId( ExpansionClassNameGelCacheId );
		key.setOptionalExpansionClassNameGelId( ExpansionClassNameGelId );
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>();
		if( indexByXExpClsName != null ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
			if( indexByXExpClsName.containsKey( key ) ) {
				dict = indexByXExpClsName.get( key );
				int len = dict.size();
				ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
				Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
			ICFGenKbGenFileObj obj;
			Iterator<ICFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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

	public List<ICFGenKbGenFileObj> readCachedGenFileByXExpKeyName( Long ExpansionKeyNameTenantId,
		Long ExpansionKeyNameGelCacheId,
		Long ExpansionKeyNameGelId )
	{
		final String S_ProcName = "readCachedGenFileByXExpKeyName";
		CFGenKbGenFileByXExpKeyNameKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpKeyNameKey();
		key.setOptionalExpansionKeyNameTenantId( ExpansionKeyNameTenantId );
		key.setOptionalExpansionKeyNameGelCacheId( ExpansionKeyNameGelCacheId );
		key.setOptionalExpansionKeyNameGelId( ExpansionKeyNameGelId );
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>();
		if( indexByXExpKeyName != null ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
			if( indexByXExpKeyName.containsKey( key ) ) {
				dict = indexByXExpKeyName.get( key );
				int len = dict.size();
				ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
				Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
			ICFGenKbGenFileObj obj;
			Iterator<ICFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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

	public List<ICFGenKbGenFileObj> readCachedGenFileByXExpFileName( Long ExpansionFileNameTenantId,
		Long ExpansionFileNameGelCacheId,
		Long ExpansionFileNameGelId )
	{
		final String S_ProcName = "readCachedGenFileByXExpFileName";
		CFGenKbGenFileByXExpFileNameKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpFileNameKey();
		key.setOptionalExpansionFileNameTenantId( ExpansionFileNameTenantId );
		key.setOptionalExpansionFileNameGelCacheId( ExpansionFileNameGelCacheId );
		key.setOptionalExpansionFileNameGelId( ExpansionFileNameGelId );
		ArrayList<ICFGenKbGenFileObj> arrayList = new ArrayList<ICFGenKbGenFileObj>();
		if( indexByXExpFileName != null ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict;
			if( indexByXExpFileName.containsKey( key ) ) {
				dict = indexByXExpFileName.get( key );
				int len = dict.size();
				ICFGenKbGenFileObj arr[] = new ICFGenKbGenFileObj[len];
				Iterator<ICFGenKbGenFileObj> valIter = dict.values().iterator();
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
			ICFGenKbGenFileObj obj;
			Iterator<ICFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGenFileObj> cmp = new Comparator<ICFGenKbGenFileObj>() {
			public int compare( ICFGenKbGenFileObj lhs, ICFGenKbGenFileObj rhs ) {
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

	public void deepDisposeGenFileByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		ICFGenKbGenFileObj obj = readCachedGenFileByItemIdIdx( TenantId,
				CartridgeId,
				ItemId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGenFileByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeGenFileByTenantIdx";
		ICFGenKbGenFileObj obj;
		List<ICFGenKbGenFileObj> arrayList = readCachedGenFileByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGenFileObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenFileByCartIdx( long TenantId,
		long CartridgeId )
	{
		final String S_ProcName = "deepDisposeGenFileByCartIdx";
		ICFGenKbGenFileObj obj;
		List<ICFGenKbGenFileObj> arrayList = readCachedGenFileByCartIdx( TenantId,
				CartridgeId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGenFileObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenFileByRuleTypeIdx( short RuleTypeId )
	{
		final String S_ProcName = "deepDisposeGenFileByRuleTypeIdx";
		ICFGenKbGenFileObj obj;
		List<ICFGenKbGenFileObj> arrayList = readCachedGenFileByRuleTypeIdx( RuleTypeId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGenFileObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenFileByToolSetIdx( short ToolSetId )
	{
		final String S_ProcName = "deepDisposeGenFileByToolSetIdx";
		ICFGenKbGenFileObj obj;
		List<ICFGenKbGenFileObj> arrayList = readCachedGenFileByToolSetIdx( ToolSetId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGenFileObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenFileByScopeIdx( Short ScopeDefId )
	{
		final String S_ProcName = "deepDisposeGenFileByScopeIdx";
		ICFGenKbGenFileObj obj;
		List<ICFGenKbGenFileObj> arrayList = readCachedGenFileByScopeIdx( ScopeDefId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGenFileObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenFileByGenDefIdx( short GenDefId )
	{
		final String S_ProcName = "deepDisposeGenFileByGenDefIdx";
		ICFGenKbGenFileObj obj;
		List<ICFGenKbGenFileObj> arrayList = readCachedGenFileByGenDefIdx( GenDefId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGenFileObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenFileByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		ICFGenKbGenFileObj obj = readCachedGenFileByAltIdx( Name,
				ToolSetId,
				ScopeDefId,
				GenDefId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGenFileByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		final String S_ProcName = "deepDisposeGenFileByGelExecIdx";
		ICFGenKbGenFileObj obj;
		List<ICFGenKbGenFileObj> arrayList = readCachedGenFileByGelExecIdx( GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGenFileObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenFileByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		final String S_ProcName = "deepDisposeGenFileByProbeIdx";
		ICFGenKbGenFileObj obj;
		List<ICFGenKbGenFileObj> arrayList = readCachedGenFileByProbeIdx( ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGenFileObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenFileByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId )
	{
		final String S_ProcName = "deepDisposeGenFileByBodyIdx";
		ICFGenKbGenFileObj obj;
		List<ICFGenKbGenFileObj> arrayList = readCachedGenFileByBodyIdx( BodyTenantId,
				BodyGelCacheId,
				BodyGelId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGenFileObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenFileByXSrcBundle( Long SourceBundleTenantId,
		Long SourceBundleGelCacheId,
		Long SourceBundleGelId )
	{
		final String S_ProcName = "deepDisposeGenFileByXSrcBundle";
		ICFGenKbGenFileObj obj;
		List<ICFGenKbGenFileObj> arrayList = readCachedGenFileByXSrcBundle( SourceBundleTenantId,
				SourceBundleGelCacheId,
				SourceBundleGelId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGenFileObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenFileByXModName( Long ModuleNameTenantId,
		Long ModuleNameGelCacheId,
		Long ModuleNameGelId )
	{
		final String S_ProcName = "deepDisposeGenFileByXModName";
		ICFGenKbGenFileObj obj;
		List<ICFGenKbGenFileObj> arrayList = readCachedGenFileByXModName( ModuleNameTenantId,
				ModuleNameGelCacheId,
				ModuleNameGelId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGenFileObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenFileByXBasePkg( Long BasePackageTenantId,
		Long BasePackageGelCacheId,
		Long BasePackageGelId )
	{
		final String S_ProcName = "deepDisposeGenFileByXBasePkg";
		ICFGenKbGenFileObj obj;
		List<ICFGenKbGenFileObj> arrayList = readCachedGenFileByXBasePkg( BasePackageTenantId,
				BasePackageGelCacheId,
				BasePackageGelId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGenFileObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenFileByXSubPkg( Long SubPackageTenantId,
		Long SubPackageGelCacheId,
		Long SubPackageGelId )
	{
		final String S_ProcName = "deepDisposeGenFileByXSubPkg";
		ICFGenKbGenFileObj obj;
		List<ICFGenKbGenFileObj> arrayList = readCachedGenFileByXSubPkg( SubPackageTenantId,
				SubPackageGelCacheId,
				SubPackageGelId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGenFileObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenFileByXExpClsName( Long ExpansionClassNameTenantId,
		Long ExpansionClassNameGelCacheId,
		Long ExpansionClassNameGelId )
	{
		final String S_ProcName = "deepDisposeGenFileByXExpClsName";
		ICFGenKbGenFileObj obj;
		List<ICFGenKbGenFileObj> arrayList = readCachedGenFileByXExpClsName( ExpansionClassNameTenantId,
				ExpansionClassNameGelCacheId,
				ExpansionClassNameGelId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGenFileObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenFileByXExpKeyName( Long ExpansionKeyNameTenantId,
		Long ExpansionKeyNameGelCacheId,
		Long ExpansionKeyNameGelId )
	{
		final String S_ProcName = "deepDisposeGenFileByXExpKeyName";
		ICFGenKbGenFileObj obj;
		List<ICFGenKbGenFileObj> arrayList = readCachedGenFileByXExpKeyName( ExpansionKeyNameTenantId,
				ExpansionKeyNameGelCacheId,
				ExpansionKeyNameGelId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGenFileObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenFileByXExpFileName( Long ExpansionFileNameTenantId,
		Long ExpansionFileNameGelCacheId,
		Long ExpansionFileNameGelId )
	{
		final String S_ProcName = "deepDisposeGenFileByXExpFileName";
		ICFGenKbGenFileObj obj;
		List<ICFGenKbGenFileObj> arrayList = readCachedGenFileByXExpFileName( ExpansionFileNameTenantId,
				ExpansionFileNameGelCacheId,
				ExpansionFileNameGelId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGenFileObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public ICFGenKbGenFileObj updateGenFile( ICFGenKbGenFileObj Obj ) {
		ICFGenKbGenFileObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().updateGenFile( schema.getAuthorization(),
			Obj.getGenFileBuff() );
		if( Obj.getClassCode().equals( "a932" ) ) {
			obj = (ICFGenKbGenFileObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteGenFile( ICFGenKbGenFileObj Obj ) {
		ICFGenKbGenFileObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFile( schema.getAuthorization(),
			obj.getGenFileBuff() );
		Obj.forget();
	}

	public void deleteGenFileByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		CFGenKbGenItemPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredCartridgeId( CartridgeId );
		pkey.setRequiredItemId( ItemId );
		ICFGenKbGenFileObj obj = readGenFile( pkey );
		if( obj != null ) {
			ICFGenKbGenFileEditObj editObj = (ICFGenKbGenFileEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFGenKbGenFileEditObj)obj.beginEdit();
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
		deepDisposeGenFileByItemIdIdx( TenantId,
				CartridgeId,
				ItemId );
	}

	public void deleteGenFileByTenantIdx( long TenantId )
	{
		CFGenKbGenItemByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFGenKbGenItemByTenantIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict = indexByTenantIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFGenKbGenFileObj> iter = dict.values().iterator();
			ICFGenKbGenFileObj obj;
			List<ICFGenKbGenFileObj> toForget = new LinkedList<ICFGenKbGenFileObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeGenFileByTenantIdx( TenantId );
	}

	public void deleteGenFileByCartIdx( long TenantId,
		long CartridgeId )
	{
		CFGenKbGenItemByCartIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		if( indexByCartIdx == null ) {
			indexByCartIdx = new HashMap< CFGenKbGenItemByCartIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( indexByCartIdx.containsKey( key ) ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict = indexByCartIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByCartIdx( schema.getAuthorization(),
				TenantId,
				CartridgeId );
			Iterator<ICFGenKbGenFileObj> iter = dict.values().iterator();
			ICFGenKbGenFileObj obj;
			List<ICFGenKbGenFileObj> toForget = new LinkedList<ICFGenKbGenFileObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByCartIdx( schema.getAuthorization(),
				TenantId,
				CartridgeId );
		}
		deepDisposeGenFileByCartIdx( TenantId,
				CartridgeId );
	}

	public void deleteGenFileByRuleTypeIdx( short RuleTypeId )
	{
		CFGenKbGenItemByRuleTypeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( RuleTypeId );
		if( indexByRuleTypeIdx == null ) {
			indexByRuleTypeIdx = new HashMap< CFGenKbGenItemByRuleTypeIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( indexByRuleTypeIdx.containsKey( key ) ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict = indexByRuleTypeIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByRuleTypeIdx( schema.getAuthorization(),
				RuleTypeId );
			Iterator<ICFGenKbGenFileObj> iter = dict.values().iterator();
			ICFGenKbGenFileObj obj;
			List<ICFGenKbGenFileObj> toForget = new LinkedList<ICFGenKbGenFileObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByRuleTypeIdx( schema.getAuthorization(),
				RuleTypeId );
		}
		deepDisposeGenFileByRuleTypeIdx( RuleTypeId );
	}

	public void deleteGenFileByToolSetIdx( short ToolSetId )
	{
		CFGenKbGenItemByToolSetIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( ToolSetId );
		if( indexByToolSetIdx == null ) {
			indexByToolSetIdx = new HashMap< CFGenKbGenItemByToolSetIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( indexByToolSetIdx.containsKey( key ) ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict = indexByToolSetIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByToolSetIdx( schema.getAuthorization(),
				ToolSetId );
			Iterator<ICFGenKbGenFileObj> iter = dict.values().iterator();
			ICFGenKbGenFileObj obj;
			List<ICFGenKbGenFileObj> toForget = new LinkedList<ICFGenKbGenFileObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByToolSetIdx( schema.getAuthorization(),
				ToolSetId );
		}
		deepDisposeGenFileByToolSetIdx( ToolSetId );
	}

	public void deleteGenFileByScopeIdx( Short ScopeDefId )
	{
		CFGenKbGenItemByScopeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( ScopeDefId );
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< CFGenKbGenItemByScopeIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( indexByScopeIdx.containsKey( key ) ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict = indexByScopeIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByScopeIdx( schema.getAuthorization(),
				ScopeDefId );
			Iterator<ICFGenKbGenFileObj> iter = dict.values().iterator();
			ICFGenKbGenFileObj obj;
			List<ICFGenKbGenFileObj> toForget = new LinkedList<ICFGenKbGenFileObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByScopeIdx( schema.getAuthorization(),
				ScopeDefId );
		}
		deepDisposeGenFileByScopeIdx( ScopeDefId );
	}

	public void deleteGenFileByGenDefIdx( short GenDefId )
	{
		CFGenKbGenItemByGenDefIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( GenDefId );
		if( indexByGenDefIdx == null ) {
			indexByGenDefIdx = new HashMap< CFGenKbGenItemByGenDefIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( indexByGenDefIdx.containsKey( key ) ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict = indexByGenDefIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByGenDefIdx( schema.getAuthorization(),
				GenDefId );
			Iterator<ICFGenKbGenFileObj> iter = dict.values().iterator();
			ICFGenKbGenFileObj obj;
			List<ICFGenKbGenFileObj> toForget = new LinkedList<ICFGenKbGenFileObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByGenDefIdx( schema.getAuthorization(),
				GenDefId );
		}
		deepDisposeGenFileByGenDefIdx( GenDefId );
	}

	public void deleteGenFileByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		if( indexByAltIdx == null ) {
			indexByAltIdx = new HashMap< CFGenKbGenItemByAltIdxKey,
				ICFGenKbGenFileObj >();
		}
		CFGenKbGenItemByAltIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newAltIdxKey();
		key.setRequiredName( Name );
		key.setRequiredToolSetId( ToolSetId );
		key.setOptionalScopeDefId( ScopeDefId );
		key.setRequiredGenDefId( GenDefId );
		ICFGenKbGenFileObj obj = null;
		if( indexByAltIdx.containsKey( key ) ) {
			obj = indexByAltIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByAltIdx( schema.getAuthorization(),
				Name,
				ToolSetId,
				ScopeDefId,
				GenDefId );
			obj.forget();
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByAltIdx( schema.getAuthorization(),
				Name,
				ToolSetId,
				ScopeDefId,
				GenDefId );
		}
		deepDisposeGenFileByAltIdx( Name,
				ToolSetId,
				ScopeDefId,
				GenDefId );
	}

	public void deleteGenFileByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		CFGenKbGenItemByGelExecIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( GelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( GelExecutableGelCacheId );
		key.setOptionalGelExecutableId( GelExecutableId );
		if( indexByGelExecIdx == null ) {
			indexByGelExecIdx = new HashMap< CFGenKbGenItemByGelExecIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( indexByGelExecIdx.containsKey( key ) ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict = indexByGelExecIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByGelExecIdx( schema.getAuthorization(),
				GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
			Iterator<ICFGenKbGenFileObj> iter = dict.values().iterator();
			ICFGenKbGenFileObj obj;
			List<ICFGenKbGenFileObj> toForget = new LinkedList<ICFGenKbGenFileObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByGelExecIdx( schema.getAuthorization(),
				GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
		}
		deepDisposeGenFileByGelExecIdx( GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
	}

	public void deleteGenFileByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		CFGenKbGenItemByProbeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( ProbeTenantId );
		key.setOptionalProbeCartridgeId( ProbeCartridgeId );
		key.setOptionalProbeGenItemId( ProbeGenItemId );
		if( indexByProbeIdx == null ) {
			indexByProbeIdx = new HashMap< CFGenKbGenItemByProbeIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( indexByProbeIdx.containsKey( key ) ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict = indexByProbeIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByProbeIdx( schema.getAuthorization(),
				ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
			Iterator<ICFGenKbGenFileObj> iter = dict.values().iterator();
			ICFGenKbGenFileObj obj;
			List<ICFGenKbGenFileObj> toForget = new LinkedList<ICFGenKbGenFileObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByProbeIdx( schema.getAuthorization(),
				ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
		}
		deepDisposeGenFileByProbeIdx( ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
	}

	public void deleteGenFileByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId )
	{
		CFGenKbGenRuleByBodyIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenRule().newBodyIdxKey();
		key.setOptionalBodyTenantId( BodyTenantId );
		key.setOptionalBodyGelCacheId( BodyGelCacheId );
		key.setOptionalBodyGelId( BodyGelId );
		if( indexByBodyIdx == null ) {
			indexByBodyIdx = new HashMap< CFGenKbGenRuleByBodyIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( indexByBodyIdx.containsKey( key ) ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict = indexByBodyIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByBodyIdx( schema.getAuthorization(),
				BodyTenantId,
				BodyGelCacheId,
				BodyGelId );
			Iterator<ICFGenKbGenFileObj> iter = dict.values().iterator();
			ICFGenKbGenFileObj obj;
			List<ICFGenKbGenFileObj> toForget = new LinkedList<ICFGenKbGenFileObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByBodyIdx( schema.getAuthorization(),
				BodyTenantId,
				BodyGelCacheId,
				BodyGelId );
		}
		deepDisposeGenFileByBodyIdx( BodyTenantId,
				BodyGelCacheId,
				BodyGelId );
	}

	public void deleteGenFileByXSrcBundle( Long SourceBundleTenantId,
		Long SourceBundleGelCacheId,
		Long SourceBundleGelId )
	{
		CFGenKbGenFileByXSrcBundleKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSrcBundleKey();
		key.setOptionalSourceBundleTenantId( SourceBundleTenantId );
		key.setOptionalSourceBundleGelCacheId( SourceBundleGelCacheId );
		key.setOptionalSourceBundleGelId( SourceBundleGelId );
		if( indexByXSrcBundle == null ) {
			indexByXSrcBundle = new HashMap< CFGenKbGenFileByXSrcBundleKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( indexByXSrcBundle.containsKey( key ) ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict = indexByXSrcBundle.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXSrcBundle( schema.getAuthorization(),
				SourceBundleTenantId,
				SourceBundleGelCacheId,
				SourceBundleGelId );
			Iterator<ICFGenKbGenFileObj> iter = dict.values().iterator();
			ICFGenKbGenFileObj obj;
			List<ICFGenKbGenFileObj> toForget = new LinkedList<ICFGenKbGenFileObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByXSrcBundle.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXSrcBundle( schema.getAuthorization(),
				SourceBundleTenantId,
				SourceBundleGelCacheId,
				SourceBundleGelId );
		}
		deepDisposeGenFileByXSrcBundle( SourceBundleTenantId,
				SourceBundleGelCacheId,
				SourceBundleGelId );
	}

	public void deleteGenFileByXModName( Long ModuleNameTenantId,
		Long ModuleNameGelCacheId,
		Long ModuleNameGelId )
	{
		CFGenKbGenFileByXModNameKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXModNameKey();
		key.setOptionalModuleNameTenantId( ModuleNameTenantId );
		key.setOptionalModuleNameGelCacheId( ModuleNameGelCacheId );
		key.setOptionalModuleNameGelId( ModuleNameGelId );
		if( indexByXModName == null ) {
			indexByXModName = new HashMap< CFGenKbGenFileByXModNameKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( indexByXModName.containsKey( key ) ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict = indexByXModName.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXModName( schema.getAuthorization(),
				ModuleNameTenantId,
				ModuleNameGelCacheId,
				ModuleNameGelId );
			Iterator<ICFGenKbGenFileObj> iter = dict.values().iterator();
			ICFGenKbGenFileObj obj;
			List<ICFGenKbGenFileObj> toForget = new LinkedList<ICFGenKbGenFileObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByXModName.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXModName( schema.getAuthorization(),
				ModuleNameTenantId,
				ModuleNameGelCacheId,
				ModuleNameGelId );
		}
		deepDisposeGenFileByXModName( ModuleNameTenantId,
				ModuleNameGelCacheId,
				ModuleNameGelId );
	}

	public void deleteGenFileByXBasePkg( Long BasePackageTenantId,
		Long BasePackageGelCacheId,
		Long BasePackageGelId )
	{
		CFGenKbGenFileByXBasePkgKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXBasePkgKey();
		key.setOptionalBasePackageTenantId( BasePackageTenantId );
		key.setOptionalBasePackageGelCacheId( BasePackageGelCacheId );
		key.setOptionalBasePackageGelId( BasePackageGelId );
		if( indexByXBasePkg == null ) {
			indexByXBasePkg = new HashMap< CFGenKbGenFileByXBasePkgKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( indexByXBasePkg.containsKey( key ) ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict = indexByXBasePkg.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXBasePkg( schema.getAuthorization(),
				BasePackageTenantId,
				BasePackageGelCacheId,
				BasePackageGelId );
			Iterator<ICFGenKbGenFileObj> iter = dict.values().iterator();
			ICFGenKbGenFileObj obj;
			List<ICFGenKbGenFileObj> toForget = new LinkedList<ICFGenKbGenFileObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByXBasePkg.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXBasePkg( schema.getAuthorization(),
				BasePackageTenantId,
				BasePackageGelCacheId,
				BasePackageGelId );
		}
		deepDisposeGenFileByXBasePkg( BasePackageTenantId,
				BasePackageGelCacheId,
				BasePackageGelId );
	}

	public void deleteGenFileByXSubPkg( Long SubPackageTenantId,
		Long SubPackageGelCacheId,
		Long SubPackageGelId )
	{
		CFGenKbGenFileByXSubPkgKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSubPkgKey();
		key.setOptionalSubPackageTenantId( SubPackageTenantId );
		key.setOptionalSubPackageGelCacheId( SubPackageGelCacheId );
		key.setOptionalSubPackageGelId( SubPackageGelId );
		if( indexByXSubPkg == null ) {
			indexByXSubPkg = new HashMap< CFGenKbGenFileByXSubPkgKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( indexByXSubPkg.containsKey( key ) ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict = indexByXSubPkg.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXSubPkg( schema.getAuthorization(),
				SubPackageTenantId,
				SubPackageGelCacheId,
				SubPackageGelId );
			Iterator<ICFGenKbGenFileObj> iter = dict.values().iterator();
			ICFGenKbGenFileObj obj;
			List<ICFGenKbGenFileObj> toForget = new LinkedList<ICFGenKbGenFileObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByXSubPkg.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXSubPkg( schema.getAuthorization(),
				SubPackageTenantId,
				SubPackageGelCacheId,
				SubPackageGelId );
		}
		deepDisposeGenFileByXSubPkg( SubPackageTenantId,
				SubPackageGelCacheId,
				SubPackageGelId );
	}

	public void deleteGenFileByXExpClsName( Long ExpansionClassNameTenantId,
		Long ExpansionClassNameGelCacheId,
		Long ExpansionClassNameGelId )
	{
		CFGenKbGenFileByXExpClsNameKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpClsNameKey();
		key.setOptionalExpansionClassNameTenantId( ExpansionClassNameTenantId );
		key.setOptionalExpansionClassNameGelCacheId( ExpansionClassNameGelCacheId );
		key.setOptionalExpansionClassNameGelId( ExpansionClassNameGelId );
		if( indexByXExpClsName == null ) {
			indexByXExpClsName = new HashMap< CFGenKbGenFileByXExpClsNameKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( indexByXExpClsName.containsKey( key ) ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict = indexByXExpClsName.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXExpClsName( schema.getAuthorization(),
				ExpansionClassNameTenantId,
				ExpansionClassNameGelCacheId,
				ExpansionClassNameGelId );
			Iterator<ICFGenKbGenFileObj> iter = dict.values().iterator();
			ICFGenKbGenFileObj obj;
			List<ICFGenKbGenFileObj> toForget = new LinkedList<ICFGenKbGenFileObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByXExpClsName.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXExpClsName( schema.getAuthorization(),
				ExpansionClassNameTenantId,
				ExpansionClassNameGelCacheId,
				ExpansionClassNameGelId );
		}
		deepDisposeGenFileByXExpClsName( ExpansionClassNameTenantId,
				ExpansionClassNameGelCacheId,
				ExpansionClassNameGelId );
	}

	public void deleteGenFileByXExpKeyName( Long ExpansionKeyNameTenantId,
		Long ExpansionKeyNameGelCacheId,
		Long ExpansionKeyNameGelId )
	{
		CFGenKbGenFileByXExpKeyNameKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpKeyNameKey();
		key.setOptionalExpansionKeyNameTenantId( ExpansionKeyNameTenantId );
		key.setOptionalExpansionKeyNameGelCacheId( ExpansionKeyNameGelCacheId );
		key.setOptionalExpansionKeyNameGelId( ExpansionKeyNameGelId );
		if( indexByXExpKeyName == null ) {
			indexByXExpKeyName = new HashMap< CFGenKbGenFileByXExpKeyNameKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( indexByXExpKeyName.containsKey( key ) ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict = indexByXExpKeyName.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXExpKeyName( schema.getAuthorization(),
				ExpansionKeyNameTenantId,
				ExpansionKeyNameGelCacheId,
				ExpansionKeyNameGelId );
			Iterator<ICFGenKbGenFileObj> iter = dict.values().iterator();
			ICFGenKbGenFileObj obj;
			List<ICFGenKbGenFileObj> toForget = new LinkedList<ICFGenKbGenFileObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByXExpKeyName.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXExpKeyName( schema.getAuthorization(),
				ExpansionKeyNameTenantId,
				ExpansionKeyNameGelCacheId,
				ExpansionKeyNameGelId );
		}
		deepDisposeGenFileByXExpKeyName( ExpansionKeyNameTenantId,
				ExpansionKeyNameGelCacheId,
				ExpansionKeyNameGelId );
	}

	public void deleteGenFileByXExpFileName( Long ExpansionFileNameTenantId,
		Long ExpansionFileNameGelCacheId,
		Long ExpansionFileNameGelId )
	{
		CFGenKbGenFileByXExpFileNameKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpFileNameKey();
		key.setOptionalExpansionFileNameTenantId( ExpansionFileNameTenantId );
		key.setOptionalExpansionFileNameGelCacheId( ExpansionFileNameGelCacheId );
		key.setOptionalExpansionFileNameGelId( ExpansionFileNameGelId );
		if( indexByXExpFileName == null ) {
			indexByXExpFileName = new HashMap< CFGenKbGenFileByXExpFileNameKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenFileObj > >();
		}
		if( indexByXExpFileName.containsKey( key ) ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenFileObj> dict = indexByXExpFileName.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXExpFileName( schema.getAuthorization(),
				ExpansionFileNameTenantId,
				ExpansionFileNameGelCacheId,
				ExpansionFileNameGelId );
			Iterator<ICFGenKbGenFileObj> iter = dict.values().iterator();
			ICFGenKbGenFileObj obj;
			List<ICFGenKbGenFileObj> toForget = new LinkedList<ICFGenKbGenFileObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByXExpFileName.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXExpFileName( schema.getAuthorization(),
				ExpansionFileNameTenantId,
				ExpansionFileNameGelCacheId,
				ExpansionFileNameGelId );
		}
		deepDisposeGenFileByXExpFileName( ExpansionFileNameTenantId,
				ExpansionFileNameGelCacheId,
				ExpansionFileNameGelId );
	}
}