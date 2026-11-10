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

public class YCFGenKbGenFileTableObj
	implements IYCFGenKbGenFileTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> members;
	private Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> allGenFile;
	private Map< YCFGenKbGenItemByTenantIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > > indexByTenantIdx;
	private Map< YCFGenKbGenItemByCartIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > > indexByCartIdx;
	private Map< YCFGenKbGenItemByRuleTypeIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > > indexByRuleTypeIdx;
	private Map< YCFGenKbGenItemByToolSetIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > > indexByToolSetIdx;
	private Map< YCFGenKbGenItemByScopeIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > > indexByScopeIdx;
	private Map< YCFGenKbGenItemByGenDefIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > > indexByGenDefIdx;
	private Map< YCFGenKbGenItemByAltIdxKey,
		IYCFGenKbGenFileObj > indexByAltIdx;
	private Map< YCFGenKbGenItemByGelExecIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > > indexByGelExecIdx;
	private Map< YCFGenKbGenItemByProbeIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > > indexByProbeIdx;
	private Map< YCFGenKbGenRuleByBodyIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > > indexByBodyIdx;
	private Map< YCFGenKbGenFileByXSrcBundleKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > > indexByXSrcBundle;
	private Map< YCFGenKbGenFileByXModNameKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > > indexByXModName;
	private Map< YCFGenKbGenFileByXBasePkgKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > > indexByXBasePkg;
	private Map< YCFGenKbGenFileByXSubPkgKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > > indexByXSubPkg;
	private Map< YCFGenKbGenFileByXExpClsNameKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > > indexByXExpClsName;
	private Map< YCFGenKbGenFileByXExpKeyNameKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > > indexByXExpKeyName;
	private Map< YCFGenKbGenFileByXExpFileNameKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > > indexByXExpFileName;
	public static String TABLE_NAME = "GenFile";
	public static String TABLE_DBNAME = "kbgenfile";

	public YCFGenKbGenFileTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj>();
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

	public YCFGenKbGenFileTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj>();
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
		List<IYCFGenKbGenFileObj> toForget = new LinkedList<IYCFGenKbGenFileObj>();
		IYCFGenKbGenFileObj cur = null;
		Iterator<IYCFGenKbGenFileObj> iter = members.values().iterator();
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
	 *	YCFGenKbGenFileObj.
	 */
	public IYCFGenKbGenFileObj newInstance() {
		IYCFGenKbGenFileObj inst = new YCFGenKbGenFileObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbGenFileObj.
	 */
	public IYCFGenKbGenFileEditObj newEditInstance( IYCFGenKbGenFileObj orig ) {
		IYCFGenKbGenFileEditObj edit = new YCFGenKbGenFileEditObj( orig );
		return( edit );
	}

	public IYCFGenKbGenFileObj realiseGenFile( IYCFGenKbGenFileObj Obj ) {
		IYCFGenKbGenFileObj obj = Obj;
		YCFGenKbGenItemPKey pkey = obj.getPKey();
		IYCFGenKbGenFileObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbGenFileObj existingObj = members.get( pkey );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByCartIdx != null ) {
				YCFGenKbGenItemByCartIdxKey keyCartIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
				keyCartIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyCartIdx.setRequiredCartridgeId( keepObj.getRequiredCartridgeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapCartIdx = indexByCartIdx.get( keyCartIdx );
				if( mapCartIdx != null ) {
					indexByCartIdx.remove( keyCartIdx );
				}
			}

			if( indexByRuleTypeIdx != null ) {
				YCFGenKbGenItemByRuleTypeIdxKey keyRuleTypeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
				keyRuleTypeIdx.setRequiredRuleTypeId( keepObj.getRequiredRuleTypeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapRuleTypeIdx = indexByRuleTypeIdx.get( keyRuleTypeIdx );
				if( mapRuleTypeIdx != null ) {
					indexByRuleTypeIdx.remove( keyRuleTypeIdx );
				}
			}

			if( indexByToolSetIdx != null ) {
				YCFGenKbGenItemByToolSetIdxKey keyToolSetIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
				keyToolSetIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapToolSetIdx = indexByToolSetIdx.get( keyToolSetIdx );
				if( mapToolSetIdx != null ) {
					indexByToolSetIdx.remove( keyToolSetIdx );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFGenKbGenItemByScopeIdxKey keyScopeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
				keyScopeIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					indexByScopeIdx.remove( keyScopeIdx );
				}
			}

			if( indexByGenDefIdx != null ) {
				YCFGenKbGenItemByGenDefIdxKey keyGenDefIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
				keyGenDefIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapGenDefIdx = indexByGenDefIdx.get( keyGenDefIdx );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapGelExecIdx = indexByGelExecIdx.get( keyGelExecIdx );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapProbeIdx = indexByProbeIdx.get( keyProbeIdx );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapBodyIdx = indexByBodyIdx.get( keyBodyIdx );
				if( mapBodyIdx != null ) {
					indexByBodyIdx.remove( keyBodyIdx );
				}
			}

			if( indexByXSrcBundle != null ) {
				YCFGenKbGenFileByXSrcBundleKey keyXSrcBundle =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSrcBundleKey();
				keyXSrcBundle.setOptionalSourceBundleTenantId( keepObj.getOptionalSourceBundleTenantId() );
				keyXSrcBundle.setOptionalSourceBundleGelCacheId( keepObj.getOptionalSourceBundleGelCacheId() );
				keyXSrcBundle.setOptionalSourceBundleGelId( keepObj.getOptionalSourceBundleGelId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapXSrcBundle = indexByXSrcBundle.get( keyXSrcBundle );
				if( mapXSrcBundle != null ) {
					mapXSrcBundle.remove( keepObj.getPKey() );
					if( mapXSrcBundle.size() <= 0 ) {
						indexByXSrcBundle.remove( keyXSrcBundle );
					}
				}
			}

			if( indexByXModName != null ) {
				YCFGenKbGenFileByXModNameKey keyXModName =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXModNameKey();
				keyXModName.setOptionalModuleNameTenantId( keepObj.getOptionalModuleNameTenantId() );
				keyXModName.setOptionalModuleNameGelCacheId( keepObj.getOptionalModuleNameGelCacheId() );
				keyXModName.setOptionalModuleNameGelId( keepObj.getOptionalModuleNameGelId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapXModName = indexByXModName.get( keyXModName );
				if( mapXModName != null ) {
					mapXModName.remove( keepObj.getPKey() );
					if( mapXModName.size() <= 0 ) {
						indexByXModName.remove( keyXModName );
					}
				}
			}

			if( indexByXBasePkg != null ) {
				YCFGenKbGenFileByXBasePkgKey keyXBasePkg =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXBasePkgKey();
				keyXBasePkg.setOptionalBasePackageTenantId( keepObj.getOptionalBasePackageTenantId() );
				keyXBasePkg.setOptionalBasePackageGelCacheId( keepObj.getOptionalBasePackageGelCacheId() );
				keyXBasePkg.setOptionalBasePackageGelId( keepObj.getOptionalBasePackageGelId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapXBasePkg = indexByXBasePkg.get( keyXBasePkg );
				if( mapXBasePkg != null ) {
					mapXBasePkg.remove( keepObj.getPKey() );
					if( mapXBasePkg.size() <= 0 ) {
						indexByXBasePkg.remove( keyXBasePkg );
					}
				}
			}

			if( indexByXSubPkg != null ) {
				YCFGenKbGenFileByXSubPkgKey keyXSubPkg =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSubPkgKey();
				keyXSubPkg.setOptionalSubPackageTenantId( keepObj.getOptionalSubPackageTenantId() );
				keyXSubPkg.setOptionalSubPackageGelCacheId( keepObj.getOptionalSubPackageGelCacheId() );
				keyXSubPkg.setOptionalSubPackageGelId( keepObj.getOptionalSubPackageGelId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapXSubPkg = indexByXSubPkg.get( keyXSubPkg );
				if( mapXSubPkg != null ) {
					mapXSubPkg.remove( keepObj.getPKey() );
					if( mapXSubPkg.size() <= 0 ) {
						indexByXSubPkg.remove( keyXSubPkg );
					}
				}
			}

			if( indexByXExpClsName != null ) {
				YCFGenKbGenFileByXExpClsNameKey keyXExpClsName =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpClsNameKey();
				keyXExpClsName.setOptionalExpansionClassNameTenantId( keepObj.getOptionalExpansionClassNameTenantId() );
				keyXExpClsName.setOptionalExpansionClassNameGelCacheId( keepObj.getOptionalExpansionClassNameGelCacheId() );
				keyXExpClsName.setOptionalExpansionClassNameGelId( keepObj.getOptionalExpansionClassNameGelId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapXExpClsName = indexByXExpClsName.get( keyXExpClsName );
				if( mapXExpClsName != null ) {
					mapXExpClsName.remove( keepObj.getPKey() );
					if( mapXExpClsName.size() <= 0 ) {
						indexByXExpClsName.remove( keyXExpClsName );
					}
				}
			}

			if( indexByXExpKeyName != null ) {
				YCFGenKbGenFileByXExpKeyNameKey keyXExpKeyName =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpKeyNameKey();
				keyXExpKeyName.setOptionalExpansionKeyNameTenantId( keepObj.getOptionalExpansionKeyNameTenantId() );
				keyXExpKeyName.setOptionalExpansionKeyNameGelCacheId( keepObj.getOptionalExpansionKeyNameGelCacheId() );
				keyXExpKeyName.setOptionalExpansionKeyNameGelId( keepObj.getOptionalExpansionKeyNameGelId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapXExpKeyName = indexByXExpKeyName.get( keyXExpKeyName );
				if( mapXExpKeyName != null ) {
					mapXExpKeyName.remove( keepObj.getPKey() );
					if( mapXExpKeyName.size() <= 0 ) {
						indexByXExpKeyName.remove( keyXExpKeyName );
					}
				}
			}

			if( indexByXExpFileName != null ) {
				YCFGenKbGenFileByXExpFileNameKey keyXExpFileName =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpFileNameKey();
				keyXExpFileName.setOptionalExpansionFileNameTenantId( keepObj.getOptionalExpansionFileNameTenantId() );
				keyXExpFileName.setOptionalExpansionFileNameGelCacheId( keepObj.getOptionalExpansionFileNameGelCacheId() );
				keyXExpFileName.setOptionalExpansionFileNameGelId( keepObj.getOptionalExpansionFileNameGelId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapXExpFileName = indexByXExpFileName.get( keyXExpFileName );
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
			keepObj = (IYCFGenKbGenFileObj)schema.getGenRuleTableObj().realiseGenRule( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFGenKbGenItemByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCartIdx != null ) {
				YCFGenKbGenItemByCartIdxKey keyCartIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
				keyCartIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyCartIdx.setRequiredCartridgeId( keepObj.getRequiredCartridgeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapCartIdx = indexByCartIdx.get( keyCartIdx );
				if( mapCartIdx != null ) {
					mapCartIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRuleTypeIdx != null ) {
				YCFGenKbGenItemByRuleTypeIdxKey keyRuleTypeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
				keyRuleTypeIdx.setRequiredRuleTypeId( keepObj.getRequiredRuleTypeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapRuleTypeIdx = indexByRuleTypeIdx.get( keyRuleTypeIdx );
				if( mapRuleTypeIdx != null ) {
					mapRuleTypeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByToolSetIdx != null ) {
				YCFGenKbGenItemByToolSetIdxKey keyToolSetIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
				keyToolSetIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapToolSetIdx = indexByToolSetIdx.get( keyToolSetIdx );
				if( mapToolSetIdx != null ) {
					mapToolSetIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFGenKbGenItemByScopeIdxKey keyScopeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
				keyScopeIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGenDefIdx != null ) {
				YCFGenKbGenItemByGenDefIdxKey keyGenDefIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
				keyGenDefIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapGenDefIdx = indexByGenDefIdx.get( keyGenDefIdx );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapGelExecIdx = indexByGelExecIdx.get( keyGelExecIdx );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapProbeIdx = indexByProbeIdx.get( keyProbeIdx );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapBodyIdx = indexByBodyIdx.get( keyBodyIdx );
				if( mapBodyIdx != null ) {
					mapBodyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXSrcBundle != null ) {
				YCFGenKbGenFileByXSrcBundleKey keyXSrcBundle =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSrcBundleKey();
				keyXSrcBundle.setOptionalSourceBundleTenantId( keepObj.getOptionalSourceBundleTenantId() );
				keyXSrcBundle.setOptionalSourceBundleGelCacheId( keepObj.getOptionalSourceBundleGelCacheId() );
				keyXSrcBundle.setOptionalSourceBundleGelId( keepObj.getOptionalSourceBundleGelId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapXSrcBundle = indexByXSrcBundle.get( keyXSrcBundle );
				if( mapXSrcBundle != null ) {
					mapXSrcBundle.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXModName != null ) {
				YCFGenKbGenFileByXModNameKey keyXModName =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXModNameKey();
				keyXModName.setOptionalModuleNameTenantId( keepObj.getOptionalModuleNameTenantId() );
				keyXModName.setOptionalModuleNameGelCacheId( keepObj.getOptionalModuleNameGelCacheId() );
				keyXModName.setOptionalModuleNameGelId( keepObj.getOptionalModuleNameGelId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapXModName = indexByXModName.get( keyXModName );
				if( mapXModName != null ) {
					mapXModName.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXBasePkg != null ) {
				YCFGenKbGenFileByXBasePkgKey keyXBasePkg =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXBasePkgKey();
				keyXBasePkg.setOptionalBasePackageTenantId( keepObj.getOptionalBasePackageTenantId() );
				keyXBasePkg.setOptionalBasePackageGelCacheId( keepObj.getOptionalBasePackageGelCacheId() );
				keyXBasePkg.setOptionalBasePackageGelId( keepObj.getOptionalBasePackageGelId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapXBasePkg = indexByXBasePkg.get( keyXBasePkg );
				if( mapXBasePkg != null ) {
					mapXBasePkg.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXSubPkg != null ) {
				YCFGenKbGenFileByXSubPkgKey keyXSubPkg =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSubPkgKey();
				keyXSubPkg.setOptionalSubPackageTenantId( keepObj.getOptionalSubPackageTenantId() );
				keyXSubPkg.setOptionalSubPackageGelCacheId( keepObj.getOptionalSubPackageGelCacheId() );
				keyXSubPkg.setOptionalSubPackageGelId( keepObj.getOptionalSubPackageGelId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapXSubPkg = indexByXSubPkg.get( keyXSubPkg );
				if( mapXSubPkg != null ) {
					mapXSubPkg.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXExpClsName != null ) {
				YCFGenKbGenFileByXExpClsNameKey keyXExpClsName =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpClsNameKey();
				keyXExpClsName.setOptionalExpansionClassNameTenantId( keepObj.getOptionalExpansionClassNameTenantId() );
				keyXExpClsName.setOptionalExpansionClassNameGelCacheId( keepObj.getOptionalExpansionClassNameGelCacheId() );
				keyXExpClsName.setOptionalExpansionClassNameGelId( keepObj.getOptionalExpansionClassNameGelId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapXExpClsName = indexByXExpClsName.get( keyXExpClsName );
				if( mapXExpClsName != null ) {
					mapXExpClsName.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXExpKeyName != null ) {
				YCFGenKbGenFileByXExpKeyNameKey keyXExpKeyName =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpKeyNameKey();
				keyXExpKeyName.setOptionalExpansionKeyNameTenantId( keepObj.getOptionalExpansionKeyNameTenantId() );
				keyXExpKeyName.setOptionalExpansionKeyNameGelCacheId( keepObj.getOptionalExpansionKeyNameGelCacheId() );
				keyXExpKeyName.setOptionalExpansionKeyNameGelId( keepObj.getOptionalExpansionKeyNameGelId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapXExpKeyName = indexByXExpKeyName.get( keyXExpKeyName );
				if( mapXExpKeyName != null ) {
					mapXExpKeyName.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXExpFileName != null ) {
				YCFGenKbGenFileByXExpFileNameKey keyXExpFileName =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpFileNameKey();
				keyXExpFileName.setOptionalExpansionFileNameTenantId( keepObj.getOptionalExpansionFileNameTenantId() );
				keyXExpFileName.setOptionalExpansionFileNameGelCacheId( keepObj.getOptionalExpansionFileNameGelCacheId() );
				keyXExpFileName.setOptionalExpansionFileNameGelId( keepObj.getOptionalExpansionFileNameGelId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapXExpFileName = indexByXExpFileName.get( keyXExpFileName );
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
			keepObj = (IYCFGenKbGenFileObj)schema.getGenRuleTableObj().realiseGenRule( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allGenFile != null ) {
				allGenFile.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFGenKbGenItemByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCartIdx != null ) {
				YCFGenKbGenItemByCartIdxKey keyCartIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
				keyCartIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyCartIdx.setRequiredCartridgeId( keepObj.getRequiredCartridgeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapCartIdx = indexByCartIdx.get( keyCartIdx );
				if( mapCartIdx != null ) {
					mapCartIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRuleTypeIdx != null ) {
				YCFGenKbGenItemByRuleTypeIdxKey keyRuleTypeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
				keyRuleTypeIdx.setRequiredRuleTypeId( keepObj.getRequiredRuleTypeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapRuleTypeIdx = indexByRuleTypeIdx.get( keyRuleTypeIdx );
				if( mapRuleTypeIdx != null ) {
					mapRuleTypeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByToolSetIdx != null ) {
				YCFGenKbGenItemByToolSetIdxKey keyToolSetIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
				keyToolSetIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapToolSetIdx = indexByToolSetIdx.get( keyToolSetIdx );
				if( mapToolSetIdx != null ) {
					mapToolSetIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFGenKbGenItemByScopeIdxKey keyScopeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
				keyScopeIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGenDefIdx != null ) {
				YCFGenKbGenItemByGenDefIdxKey keyGenDefIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
				keyGenDefIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapGenDefIdx = indexByGenDefIdx.get( keyGenDefIdx );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapGelExecIdx = indexByGelExecIdx.get( keyGelExecIdx );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapProbeIdx = indexByProbeIdx.get( keyProbeIdx );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapBodyIdx = indexByBodyIdx.get( keyBodyIdx );
				if( mapBodyIdx != null ) {
					mapBodyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXSrcBundle != null ) {
				YCFGenKbGenFileByXSrcBundleKey keyXSrcBundle =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSrcBundleKey();
				keyXSrcBundle.setOptionalSourceBundleTenantId( keepObj.getOptionalSourceBundleTenantId() );
				keyXSrcBundle.setOptionalSourceBundleGelCacheId( keepObj.getOptionalSourceBundleGelCacheId() );
				keyXSrcBundle.setOptionalSourceBundleGelId( keepObj.getOptionalSourceBundleGelId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapXSrcBundle = indexByXSrcBundle.get( keyXSrcBundle );
				if( mapXSrcBundle != null ) {
					mapXSrcBundle.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXModName != null ) {
				YCFGenKbGenFileByXModNameKey keyXModName =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXModNameKey();
				keyXModName.setOptionalModuleNameTenantId( keepObj.getOptionalModuleNameTenantId() );
				keyXModName.setOptionalModuleNameGelCacheId( keepObj.getOptionalModuleNameGelCacheId() );
				keyXModName.setOptionalModuleNameGelId( keepObj.getOptionalModuleNameGelId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapXModName = indexByXModName.get( keyXModName );
				if( mapXModName != null ) {
					mapXModName.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXBasePkg != null ) {
				YCFGenKbGenFileByXBasePkgKey keyXBasePkg =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXBasePkgKey();
				keyXBasePkg.setOptionalBasePackageTenantId( keepObj.getOptionalBasePackageTenantId() );
				keyXBasePkg.setOptionalBasePackageGelCacheId( keepObj.getOptionalBasePackageGelCacheId() );
				keyXBasePkg.setOptionalBasePackageGelId( keepObj.getOptionalBasePackageGelId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapXBasePkg = indexByXBasePkg.get( keyXBasePkg );
				if( mapXBasePkg != null ) {
					mapXBasePkg.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXSubPkg != null ) {
				YCFGenKbGenFileByXSubPkgKey keyXSubPkg =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSubPkgKey();
				keyXSubPkg.setOptionalSubPackageTenantId( keepObj.getOptionalSubPackageTenantId() );
				keyXSubPkg.setOptionalSubPackageGelCacheId( keepObj.getOptionalSubPackageGelCacheId() );
				keyXSubPkg.setOptionalSubPackageGelId( keepObj.getOptionalSubPackageGelId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapXSubPkg = indexByXSubPkg.get( keyXSubPkg );
				if( mapXSubPkg != null ) {
					mapXSubPkg.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXExpClsName != null ) {
				YCFGenKbGenFileByXExpClsNameKey keyXExpClsName =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpClsNameKey();
				keyXExpClsName.setOptionalExpansionClassNameTenantId( keepObj.getOptionalExpansionClassNameTenantId() );
				keyXExpClsName.setOptionalExpansionClassNameGelCacheId( keepObj.getOptionalExpansionClassNameGelCacheId() );
				keyXExpClsName.setOptionalExpansionClassNameGelId( keepObj.getOptionalExpansionClassNameGelId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapXExpClsName = indexByXExpClsName.get( keyXExpClsName );
				if( mapXExpClsName != null ) {
					mapXExpClsName.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXExpKeyName != null ) {
				YCFGenKbGenFileByXExpKeyNameKey keyXExpKeyName =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpKeyNameKey();
				keyXExpKeyName.setOptionalExpansionKeyNameTenantId( keepObj.getOptionalExpansionKeyNameTenantId() );
				keyXExpKeyName.setOptionalExpansionKeyNameGelCacheId( keepObj.getOptionalExpansionKeyNameGelCacheId() );
				keyXExpKeyName.setOptionalExpansionKeyNameGelId( keepObj.getOptionalExpansionKeyNameGelId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapXExpKeyName = indexByXExpKeyName.get( keyXExpKeyName );
				if( mapXExpKeyName != null ) {
					mapXExpKeyName.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByXExpFileName != null ) {
				YCFGenKbGenFileByXExpFileNameKey keyXExpFileName =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpFileNameKey();
				keyXExpFileName.setOptionalExpansionFileNameTenantId( keepObj.getOptionalExpansionFileNameTenantId() );
				keyXExpFileName.setOptionalExpansionFileNameGelCacheId( keepObj.getOptionalExpansionFileNameGelCacheId() );
				keyXExpFileName.setOptionalExpansionFileNameGelId( keepObj.getOptionalExpansionFileNameGelId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > mapXExpFileName = indexByXExpFileName.get( keyXExpFileName );
				if( mapXExpFileName != null ) {
					mapXExpFileName.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFGenKbGenFileObj createGenFile( IYCFGenKbGenFileObj Obj ) {
		IYCFGenKbGenFileObj obj = Obj;
		YCFGenKbGenFileBuff buff = obj.getGenFileBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().createGenFile(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a932" ) ) {
			obj = (IYCFGenKbGenFileObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbGenFileObj readGenFile( YCFGenKbGenItemPKey pkey ) {
		return( readGenFile( pkey, false ) );
	}

	public IYCFGenKbGenFileObj readGenFile( YCFGenKbGenItemPKey pkey, boolean forceRead ) {
		IYCFGenKbGenFileObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbGenFileBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().readDerivedByItemIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredCartridgeId(),
				pkey.getRequiredItemId() );
			if( readBuff != null ) {
				obj = (IYCFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbGenFileObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbGenFileObj readCachedGenFile( YCFGenKbGenItemPKey pkey ) {
		IYCFGenKbGenFileObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeGenFile( IYCFGenKbGenFileObj obj )
	{
		final String S_ProcName = "YCFGenKbGenFileTableObj.reallyDeepDisposeGenFile() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbGenItemPKey pkey = obj.getPKey();
		IYCFGenKbGenFileObj existing = readCachedGenFile( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbGenFileByXSrcBundleKey keyXSrcBundle = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSrcBundleKey();
		keyXSrcBundle.setOptionalSourceBundleTenantId( existing.getOptionalSourceBundleTenantId() );
		keyXSrcBundle.setOptionalSourceBundleGelCacheId( existing.getOptionalSourceBundleGelCacheId() );
		keyXSrcBundle.setOptionalSourceBundleGelId( existing.getOptionalSourceBundleGelId() );

		YCFGenKbGenFileByXModNameKey keyXModName = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXModNameKey();
		keyXModName.setOptionalModuleNameTenantId( existing.getOptionalModuleNameTenantId() );
		keyXModName.setOptionalModuleNameGelCacheId( existing.getOptionalModuleNameGelCacheId() );
		keyXModName.setOptionalModuleNameGelId( existing.getOptionalModuleNameGelId() );

		YCFGenKbGenFileByXBasePkgKey keyXBasePkg = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXBasePkgKey();
		keyXBasePkg.setOptionalBasePackageTenantId( existing.getOptionalBasePackageTenantId() );
		keyXBasePkg.setOptionalBasePackageGelCacheId( existing.getOptionalBasePackageGelCacheId() );
		keyXBasePkg.setOptionalBasePackageGelId( existing.getOptionalBasePackageGelId() );

		YCFGenKbGenFileByXSubPkgKey keyXSubPkg = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSubPkgKey();
		keyXSubPkg.setOptionalSubPackageTenantId( existing.getOptionalSubPackageTenantId() );
		keyXSubPkg.setOptionalSubPackageGelCacheId( existing.getOptionalSubPackageGelCacheId() );
		keyXSubPkg.setOptionalSubPackageGelId( existing.getOptionalSubPackageGelId() );

		YCFGenKbGenFileByXExpClsNameKey keyXExpClsName = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpClsNameKey();
		keyXExpClsName.setOptionalExpansionClassNameTenantId( existing.getOptionalExpansionClassNameTenantId() );
		keyXExpClsName.setOptionalExpansionClassNameGelCacheId( existing.getOptionalExpansionClassNameGelCacheId() );
		keyXExpClsName.setOptionalExpansionClassNameGelId( existing.getOptionalExpansionClassNameGelId() );

		YCFGenKbGenFileByXExpKeyNameKey keyXExpKeyName = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpKeyNameKey();
		keyXExpKeyName.setOptionalExpansionKeyNameTenantId( existing.getOptionalExpansionKeyNameTenantId() );
		keyXExpKeyName.setOptionalExpansionKeyNameGelCacheId( existing.getOptionalExpansionKeyNameGelCacheId() );
		keyXExpKeyName.setOptionalExpansionKeyNameGelId( existing.getOptionalExpansionKeyNameGelId() );

		YCFGenKbGenFileByXExpFileNameKey keyXExpFileName = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpFileNameKey();
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
	public void deepDisposeGenFile( YCFGenKbGenItemPKey pkey ) {
		IYCFGenKbGenFileObj obj = readCachedGenFile( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbGenFileObj lockGenFile( YCFGenKbGenItemPKey pkey ) {
		IYCFGenKbGenFileObj locked = null;
		YCFGenKbGenFileBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbGenFileObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockGenFile", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbGenFileObj> readAllGenFile() {
		return( readAllGenFile( false ) );
	}

	public List<IYCFGenKbGenFileObj> readAllGenFile( boolean forceRead ) {
		final String S_ProcName = "readAllGenFile";
		if( ( allGenFile == null ) || forceRead ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> map = new HashMap<YCFGenKbGenItemPKey,IYCFGenKbGenFileObj>();
			allGenFile = map;
			YCFGenKbGenFileBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().readAllDerived( schema.getAuthorization() );
			YCFGenKbGenFileBuff buff;
			IYCFGenKbGenFileObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenFileObj realised = (IYCFGenKbGenFileObj)obj.realise();
			}
		}
		int len = allGenFile.size();
		IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
		Iterator<IYCFGenKbGenFileObj> valIter = allGenFile.values().iterator();
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
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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
		List<IYCFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenFileObj> readCachedAllGenFile() {
		final String S_ProcName = "readCachedAllGenFile";
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>();
		if( allGenFile != null ) {
			int len = allGenFile.size();
			IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
			Iterator<IYCFGenKbGenFileObj> valIter = allGenFile.values().iterator();
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
		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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

	public IYCFGenKbGenFileObj readGenFileByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		return( readGenFileByItemIdIdx( TenantId,
			CartridgeId,
			ItemId,
			false ) );
	}

	public IYCFGenKbGenFileObj readGenFileByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId, boolean forceRead )
	{
		YCFGenKbGenItemPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredCartridgeId( CartridgeId );
		pkey.setRequiredItemId( ItemId );
		IYCFGenKbGenFileObj obj = readGenFile( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByTenantIdx( long TenantId )
	{
		return( readGenFileByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByTenantIdx";
		YCFGenKbGenItemByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGenItemByTenantIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenFileObj realised = (IYCFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
		Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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
		List<IYCFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByCartIdx( long TenantId,
		long CartridgeId )
	{
		return( readGenFileByCartIdx( TenantId,
			CartridgeId,
			false ) );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByCartIdx( long TenantId,
		long CartridgeId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByCartIdx";
		YCFGenKbGenItemByCartIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
		if( indexByCartIdx == null ) {
			indexByCartIdx = new HashMap< YCFGenKbGenItemByCartIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByCartIdx.containsKey( key ) ) {
			dict = indexByCartIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByCartIdx( schema.getAuthorization(),
				TenantId,
				CartridgeId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenFileObj realised = (IYCFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByCartIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
		Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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
		List<IYCFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByRuleTypeIdx( short RuleTypeId )
	{
		return( readGenFileByRuleTypeIdx( RuleTypeId,
			false ) );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByRuleTypeIdx( short RuleTypeId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByRuleTypeIdx";
		YCFGenKbGenItemByRuleTypeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( RuleTypeId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
		if( indexByRuleTypeIdx == null ) {
			indexByRuleTypeIdx = new HashMap< YCFGenKbGenItemByRuleTypeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByRuleTypeIdx.containsKey( key ) ) {
			dict = indexByRuleTypeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByRuleTypeIdx( schema.getAuthorization(),
				RuleTypeId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenFileObj realised = (IYCFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRuleTypeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
		Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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
		List<IYCFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByToolSetIdx( short ToolSetId )
	{
		return( readGenFileByToolSetIdx( ToolSetId,
			false ) );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByToolSetIdx( short ToolSetId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByToolSetIdx";
		YCFGenKbGenItemByToolSetIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( ToolSetId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
		if( indexByToolSetIdx == null ) {
			indexByToolSetIdx = new HashMap< YCFGenKbGenItemByToolSetIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByToolSetIdx.containsKey( key ) ) {
			dict = indexByToolSetIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByToolSetIdx( schema.getAuthorization(),
				ToolSetId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenFileObj realised = (IYCFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByToolSetIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
		Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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
		List<IYCFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByScopeIdx( Short ScopeDefId )
	{
		return( readGenFileByScopeIdx( ScopeDefId,
			false ) );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByScopeIdx( Short ScopeDefId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByScopeIdx";
		YCFGenKbGenItemByScopeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( ScopeDefId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFGenKbGenItemByScopeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByScopeIdx.containsKey( key ) ) {
			dict = indexByScopeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByScopeIdx( schema.getAuthorization(),
				ScopeDefId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenFileObj realised = (IYCFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
		Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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
		List<IYCFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByGenDefIdx( short GenDefId )
	{
		return( readGenFileByGenDefIdx( GenDefId,
			false ) );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByGenDefIdx( short GenDefId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByGenDefIdx";
		YCFGenKbGenItemByGenDefIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( GenDefId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
		if( indexByGenDefIdx == null ) {
			indexByGenDefIdx = new HashMap< YCFGenKbGenItemByGenDefIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByGenDefIdx.containsKey( key ) ) {
			dict = indexByGenDefIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByGenDefIdx( schema.getAuthorization(),
				GenDefId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenFileObj realised = (IYCFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGenDefIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
		Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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
		List<IYCFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbGenFileObj readGenFileByAltIdx( String Name,
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

	public IYCFGenKbGenFileObj readGenFileByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId, boolean forceRead )
	{
		if( indexByAltIdx == null ) {
			indexByAltIdx = new HashMap< YCFGenKbGenItemByAltIdxKey,
				IYCFGenKbGenFileObj >();
		}
		YCFGenKbGenItemByAltIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newAltIdxKey();
		key.setRequiredName( Name );
		key.setRequiredToolSetId( ToolSetId );
		key.setOptionalScopeDefId( ScopeDefId );
		key.setRequiredGenDefId( GenDefId );
		IYCFGenKbGenFileObj obj = null;
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
				obj = (IYCFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbGenFileObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		return( readGenFileByGelExecIdx( GelExecutableTenantId,
			GelExecutableGelCacheId,
			GelExecutableId,
			false ) );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByGelExecIdx";
		YCFGenKbGenItemByGelExecIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( GelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( GelExecutableGelCacheId );
		key.setOptionalGelExecutableId( GelExecutableId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
		if( indexByGelExecIdx == null ) {
			indexByGelExecIdx = new HashMap< YCFGenKbGenItemByGelExecIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByGelExecIdx.containsKey( key ) ) {
			dict = indexByGelExecIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByGelExecIdx( schema.getAuthorization(),
				GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenFileObj realised = (IYCFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGelExecIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
		Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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
		List<IYCFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		return( readGenFileByProbeIdx( ProbeTenantId,
			ProbeCartridgeId,
			ProbeGenItemId,
			false ) );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByProbeIdx";
		YCFGenKbGenItemByProbeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( ProbeTenantId );
		key.setOptionalProbeCartridgeId( ProbeCartridgeId );
		key.setOptionalProbeGenItemId( ProbeGenItemId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
		if( indexByProbeIdx == null ) {
			indexByProbeIdx = new HashMap< YCFGenKbGenItemByProbeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByProbeIdx.containsKey( key ) ) {
			dict = indexByProbeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByProbeIdx( schema.getAuthorization(),
				ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenFileObj realised = (IYCFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByProbeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
		Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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
		List<IYCFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId )
	{
		return( readGenFileByBodyIdx( BodyTenantId,
			BodyGelCacheId,
			BodyGelId,
			false ) );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByBodyIdx";
		YCFGenKbGenRuleByBodyIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenRule().newBodyIdxKey();
		key.setOptionalBodyTenantId( BodyTenantId );
		key.setOptionalBodyGelCacheId( BodyGelCacheId );
		key.setOptionalBodyGelId( BodyGelId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
		if( indexByBodyIdx == null ) {
			indexByBodyIdx = new HashMap< YCFGenKbGenRuleByBodyIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByBodyIdx.containsKey( key ) ) {
			dict = indexByBodyIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj>();
			IYCFGenKbGenRuleObj obj;
			YCFGenKbGenRuleBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().readDerivedByBodyIdx( schema.getAuthorization(),
				BodyTenantId,
				BodyGelCacheId,
				BodyGelId );
			YCFGenKbGenRuleBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenFileObj realised = (IYCFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByBodyIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
		Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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
		List<IYCFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByXSrcBundle( Long SourceBundleTenantId,
		Long SourceBundleGelCacheId,
		Long SourceBundleGelId )
	{
		return( readGenFileByXSrcBundle( SourceBundleTenantId,
			SourceBundleGelCacheId,
			SourceBundleGelId,
			false ) );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByXSrcBundle( Long SourceBundleTenantId,
		Long SourceBundleGelCacheId,
		Long SourceBundleGelId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByXSrcBundle";
		YCFGenKbGenFileByXSrcBundleKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSrcBundleKey();
		key.setOptionalSourceBundleTenantId( SourceBundleTenantId );
		key.setOptionalSourceBundleGelCacheId( SourceBundleGelCacheId );
		key.setOptionalSourceBundleGelId( SourceBundleGelId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
		if( indexByXSrcBundle == null ) {
			indexByXSrcBundle = new HashMap< YCFGenKbGenFileByXSrcBundleKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByXSrcBundle.containsKey( key ) ) {
			dict = indexByXSrcBundle.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj>();
			IYCFGenKbGenFileObj obj;
			YCFGenKbGenFileBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().readDerivedByXSrcBundle( schema.getAuthorization(),
				SourceBundleTenantId,
				SourceBundleGelCacheId,
				SourceBundleGelId );
			YCFGenKbGenFileBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenFileObj realised = (IYCFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByXSrcBundle.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
		Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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
		List<IYCFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByXModName( Long ModuleNameTenantId,
		Long ModuleNameGelCacheId,
		Long ModuleNameGelId )
	{
		return( readGenFileByXModName( ModuleNameTenantId,
			ModuleNameGelCacheId,
			ModuleNameGelId,
			false ) );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByXModName( Long ModuleNameTenantId,
		Long ModuleNameGelCacheId,
		Long ModuleNameGelId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByXModName";
		YCFGenKbGenFileByXModNameKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXModNameKey();
		key.setOptionalModuleNameTenantId( ModuleNameTenantId );
		key.setOptionalModuleNameGelCacheId( ModuleNameGelCacheId );
		key.setOptionalModuleNameGelId( ModuleNameGelId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
		if( indexByXModName == null ) {
			indexByXModName = new HashMap< YCFGenKbGenFileByXModNameKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByXModName.containsKey( key ) ) {
			dict = indexByXModName.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj>();
			IYCFGenKbGenFileObj obj;
			YCFGenKbGenFileBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().readDerivedByXModName( schema.getAuthorization(),
				ModuleNameTenantId,
				ModuleNameGelCacheId,
				ModuleNameGelId );
			YCFGenKbGenFileBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenFileObj realised = (IYCFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByXModName.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
		Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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
		List<IYCFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByXBasePkg( Long BasePackageTenantId,
		Long BasePackageGelCacheId,
		Long BasePackageGelId )
	{
		return( readGenFileByXBasePkg( BasePackageTenantId,
			BasePackageGelCacheId,
			BasePackageGelId,
			false ) );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByXBasePkg( Long BasePackageTenantId,
		Long BasePackageGelCacheId,
		Long BasePackageGelId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByXBasePkg";
		YCFGenKbGenFileByXBasePkgKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXBasePkgKey();
		key.setOptionalBasePackageTenantId( BasePackageTenantId );
		key.setOptionalBasePackageGelCacheId( BasePackageGelCacheId );
		key.setOptionalBasePackageGelId( BasePackageGelId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
		if( indexByXBasePkg == null ) {
			indexByXBasePkg = new HashMap< YCFGenKbGenFileByXBasePkgKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByXBasePkg.containsKey( key ) ) {
			dict = indexByXBasePkg.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj>();
			IYCFGenKbGenFileObj obj;
			YCFGenKbGenFileBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().readDerivedByXBasePkg( schema.getAuthorization(),
				BasePackageTenantId,
				BasePackageGelCacheId,
				BasePackageGelId );
			YCFGenKbGenFileBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenFileObj realised = (IYCFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByXBasePkg.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
		Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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
		List<IYCFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByXSubPkg( Long SubPackageTenantId,
		Long SubPackageGelCacheId,
		Long SubPackageGelId )
	{
		return( readGenFileByXSubPkg( SubPackageTenantId,
			SubPackageGelCacheId,
			SubPackageGelId,
			false ) );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByXSubPkg( Long SubPackageTenantId,
		Long SubPackageGelCacheId,
		Long SubPackageGelId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByXSubPkg";
		YCFGenKbGenFileByXSubPkgKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSubPkgKey();
		key.setOptionalSubPackageTenantId( SubPackageTenantId );
		key.setOptionalSubPackageGelCacheId( SubPackageGelCacheId );
		key.setOptionalSubPackageGelId( SubPackageGelId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
		if( indexByXSubPkg == null ) {
			indexByXSubPkg = new HashMap< YCFGenKbGenFileByXSubPkgKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByXSubPkg.containsKey( key ) ) {
			dict = indexByXSubPkg.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj>();
			IYCFGenKbGenFileObj obj;
			YCFGenKbGenFileBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().readDerivedByXSubPkg( schema.getAuthorization(),
				SubPackageTenantId,
				SubPackageGelCacheId,
				SubPackageGelId );
			YCFGenKbGenFileBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenFileObj realised = (IYCFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByXSubPkg.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
		Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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
		List<IYCFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByXExpClsName( Long ExpansionClassNameTenantId,
		Long ExpansionClassNameGelCacheId,
		Long ExpansionClassNameGelId )
	{
		return( readGenFileByXExpClsName( ExpansionClassNameTenantId,
			ExpansionClassNameGelCacheId,
			ExpansionClassNameGelId,
			false ) );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByXExpClsName( Long ExpansionClassNameTenantId,
		Long ExpansionClassNameGelCacheId,
		Long ExpansionClassNameGelId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByXExpClsName";
		YCFGenKbGenFileByXExpClsNameKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpClsNameKey();
		key.setOptionalExpansionClassNameTenantId( ExpansionClassNameTenantId );
		key.setOptionalExpansionClassNameGelCacheId( ExpansionClassNameGelCacheId );
		key.setOptionalExpansionClassNameGelId( ExpansionClassNameGelId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
		if( indexByXExpClsName == null ) {
			indexByXExpClsName = new HashMap< YCFGenKbGenFileByXExpClsNameKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByXExpClsName.containsKey( key ) ) {
			dict = indexByXExpClsName.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj>();
			IYCFGenKbGenFileObj obj;
			YCFGenKbGenFileBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().readDerivedByXExpClsName( schema.getAuthorization(),
				ExpansionClassNameTenantId,
				ExpansionClassNameGelCacheId,
				ExpansionClassNameGelId );
			YCFGenKbGenFileBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenFileObj realised = (IYCFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByXExpClsName.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
		Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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
		List<IYCFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByXExpKeyName( Long ExpansionKeyNameTenantId,
		Long ExpansionKeyNameGelCacheId,
		Long ExpansionKeyNameGelId )
	{
		return( readGenFileByXExpKeyName( ExpansionKeyNameTenantId,
			ExpansionKeyNameGelCacheId,
			ExpansionKeyNameGelId,
			false ) );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByXExpKeyName( Long ExpansionKeyNameTenantId,
		Long ExpansionKeyNameGelCacheId,
		Long ExpansionKeyNameGelId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByXExpKeyName";
		YCFGenKbGenFileByXExpKeyNameKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpKeyNameKey();
		key.setOptionalExpansionKeyNameTenantId( ExpansionKeyNameTenantId );
		key.setOptionalExpansionKeyNameGelCacheId( ExpansionKeyNameGelCacheId );
		key.setOptionalExpansionKeyNameGelId( ExpansionKeyNameGelId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
		if( indexByXExpKeyName == null ) {
			indexByXExpKeyName = new HashMap< YCFGenKbGenFileByXExpKeyNameKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByXExpKeyName.containsKey( key ) ) {
			dict = indexByXExpKeyName.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj>();
			IYCFGenKbGenFileObj obj;
			YCFGenKbGenFileBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().readDerivedByXExpKeyName( schema.getAuthorization(),
				ExpansionKeyNameTenantId,
				ExpansionKeyNameGelCacheId,
				ExpansionKeyNameGelId );
			YCFGenKbGenFileBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenFileObj realised = (IYCFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByXExpKeyName.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
		Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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
		List<IYCFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByXExpFileName( Long ExpansionFileNameTenantId,
		Long ExpansionFileNameGelCacheId,
		Long ExpansionFileNameGelId )
	{
		return( readGenFileByXExpFileName( ExpansionFileNameTenantId,
			ExpansionFileNameGelCacheId,
			ExpansionFileNameGelId,
			false ) );
	}

	public List<IYCFGenKbGenFileObj> readGenFileByXExpFileName( Long ExpansionFileNameTenantId,
		Long ExpansionFileNameGelCacheId,
		Long ExpansionFileNameGelId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenFileByXExpFileName";
		YCFGenKbGenFileByXExpFileNameKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpFileNameKey();
		key.setOptionalExpansionFileNameTenantId( ExpansionFileNameTenantId );
		key.setOptionalExpansionFileNameGelCacheId( ExpansionFileNameGelCacheId );
		key.setOptionalExpansionFileNameGelId( ExpansionFileNameGelId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
		if( indexByXExpFileName == null ) {
			indexByXExpFileName = new HashMap< YCFGenKbGenFileByXExpFileNameKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( ( ! forceRead ) && indexByXExpFileName.containsKey( key ) ) {
			dict = indexByXExpFileName.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj>();
			IYCFGenKbGenFileObj obj;
			YCFGenKbGenFileBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().readDerivedByXExpFileName( schema.getAuthorization(),
				ExpansionFileNameTenantId,
				ExpansionFileNameGelCacheId,
				ExpansionFileNameGelId );
			YCFGenKbGenFileBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenFileObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenFileObj realised = (IYCFGenKbGenFileObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByXExpFileName.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
		Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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
		List<IYCFGenKbGenFileObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbGenFileObj readCachedGenFileByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		IYCFGenKbGenFileObj obj = null;
		YCFGenKbGenItemPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredCartridgeId( CartridgeId );
		pkey.setRequiredItemId( ItemId );
		obj = readCachedGenFile( pkey );
		return( obj );
	}

	public List<IYCFGenKbGenFileObj> readCachedGenFileByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedGenFileByTenantIdx";
		YCFGenKbGenItemByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
				Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenFileObj obj;
			Iterator<IYCFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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

	public List<IYCFGenKbGenFileObj> readCachedGenFileByCartIdx( long TenantId,
		long CartridgeId )
	{
		final String S_ProcName = "readCachedGenFileByCartIdx";
		YCFGenKbGenItemByCartIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>();
		if( indexByCartIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
			if( indexByCartIdx.containsKey( key ) ) {
				dict = indexByCartIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
				Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenFileObj obj;
			Iterator<IYCFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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

	public List<IYCFGenKbGenFileObj> readCachedGenFileByRuleTypeIdx( short RuleTypeId )
	{
		final String S_ProcName = "readCachedGenFileByRuleTypeIdx";
		YCFGenKbGenItemByRuleTypeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( RuleTypeId );
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>();
		if( indexByRuleTypeIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
			if( indexByRuleTypeIdx.containsKey( key ) ) {
				dict = indexByRuleTypeIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
				Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenFileObj obj;
			Iterator<IYCFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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

	public List<IYCFGenKbGenFileObj> readCachedGenFileByToolSetIdx( short ToolSetId )
	{
		final String S_ProcName = "readCachedGenFileByToolSetIdx";
		YCFGenKbGenItemByToolSetIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( ToolSetId );
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>();
		if( indexByToolSetIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
			if( indexByToolSetIdx.containsKey( key ) ) {
				dict = indexByToolSetIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
				Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenFileObj obj;
			Iterator<IYCFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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

	public List<IYCFGenKbGenFileObj> readCachedGenFileByScopeIdx( Short ScopeDefId )
	{
		final String S_ProcName = "readCachedGenFileByScopeIdx";
		YCFGenKbGenItemByScopeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( ScopeDefId );
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>();
		if( indexByScopeIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
			if( indexByScopeIdx.containsKey( key ) ) {
				dict = indexByScopeIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
				Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenFileObj obj;
			Iterator<IYCFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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

	public List<IYCFGenKbGenFileObj> readCachedGenFileByGenDefIdx( short GenDefId )
	{
		final String S_ProcName = "readCachedGenFileByGenDefIdx";
		YCFGenKbGenItemByGenDefIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( GenDefId );
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>();
		if( indexByGenDefIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
			if( indexByGenDefIdx.containsKey( key ) ) {
				dict = indexByGenDefIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
				Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenFileObj obj;
			Iterator<IYCFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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

	public IYCFGenKbGenFileObj readCachedGenFileByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		IYCFGenKbGenFileObj obj = null;
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
				Iterator<IYCFGenKbGenFileObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbGenFileObj> valIter = members.values().iterator();
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

	public List<IYCFGenKbGenFileObj> readCachedGenFileByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		final String S_ProcName = "readCachedGenFileByGelExecIdx";
		YCFGenKbGenItemByGelExecIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( GelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( GelExecutableGelCacheId );
		key.setOptionalGelExecutableId( GelExecutableId );
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>();
		if( indexByGelExecIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
			if( indexByGelExecIdx.containsKey( key ) ) {
				dict = indexByGelExecIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
				Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenFileObj obj;
			Iterator<IYCFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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

	public List<IYCFGenKbGenFileObj> readCachedGenFileByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		final String S_ProcName = "readCachedGenFileByProbeIdx";
		YCFGenKbGenItemByProbeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( ProbeTenantId );
		key.setOptionalProbeCartridgeId( ProbeCartridgeId );
		key.setOptionalProbeGenItemId( ProbeGenItemId );
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>();
		if( indexByProbeIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
			if( indexByProbeIdx.containsKey( key ) ) {
				dict = indexByProbeIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
				Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenFileObj obj;
			Iterator<IYCFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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

	public List<IYCFGenKbGenFileObj> readCachedGenFileByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId )
	{
		final String S_ProcName = "readCachedGenFileByBodyIdx";
		YCFGenKbGenRuleByBodyIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenRule().newBodyIdxKey();
		key.setOptionalBodyTenantId( BodyTenantId );
		key.setOptionalBodyGelCacheId( BodyGelCacheId );
		key.setOptionalBodyGelId( BodyGelId );
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>();
		if( indexByBodyIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
			if( indexByBodyIdx.containsKey( key ) ) {
				dict = indexByBodyIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
				Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenFileObj obj;
			Iterator<IYCFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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

	public List<IYCFGenKbGenFileObj> readCachedGenFileByXSrcBundle( Long SourceBundleTenantId,
		Long SourceBundleGelCacheId,
		Long SourceBundleGelId )
	{
		final String S_ProcName = "readCachedGenFileByXSrcBundle";
		YCFGenKbGenFileByXSrcBundleKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSrcBundleKey();
		key.setOptionalSourceBundleTenantId( SourceBundleTenantId );
		key.setOptionalSourceBundleGelCacheId( SourceBundleGelCacheId );
		key.setOptionalSourceBundleGelId( SourceBundleGelId );
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>();
		if( indexByXSrcBundle != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
			if( indexByXSrcBundle.containsKey( key ) ) {
				dict = indexByXSrcBundle.get( key );
				int len = dict.size();
				IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
				Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenFileObj obj;
			Iterator<IYCFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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

	public List<IYCFGenKbGenFileObj> readCachedGenFileByXModName( Long ModuleNameTenantId,
		Long ModuleNameGelCacheId,
		Long ModuleNameGelId )
	{
		final String S_ProcName = "readCachedGenFileByXModName";
		YCFGenKbGenFileByXModNameKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXModNameKey();
		key.setOptionalModuleNameTenantId( ModuleNameTenantId );
		key.setOptionalModuleNameGelCacheId( ModuleNameGelCacheId );
		key.setOptionalModuleNameGelId( ModuleNameGelId );
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>();
		if( indexByXModName != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
			if( indexByXModName.containsKey( key ) ) {
				dict = indexByXModName.get( key );
				int len = dict.size();
				IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
				Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenFileObj obj;
			Iterator<IYCFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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

	public List<IYCFGenKbGenFileObj> readCachedGenFileByXBasePkg( Long BasePackageTenantId,
		Long BasePackageGelCacheId,
		Long BasePackageGelId )
	{
		final String S_ProcName = "readCachedGenFileByXBasePkg";
		YCFGenKbGenFileByXBasePkgKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXBasePkgKey();
		key.setOptionalBasePackageTenantId( BasePackageTenantId );
		key.setOptionalBasePackageGelCacheId( BasePackageGelCacheId );
		key.setOptionalBasePackageGelId( BasePackageGelId );
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>();
		if( indexByXBasePkg != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
			if( indexByXBasePkg.containsKey( key ) ) {
				dict = indexByXBasePkg.get( key );
				int len = dict.size();
				IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
				Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenFileObj obj;
			Iterator<IYCFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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

	public List<IYCFGenKbGenFileObj> readCachedGenFileByXSubPkg( Long SubPackageTenantId,
		Long SubPackageGelCacheId,
		Long SubPackageGelId )
	{
		final String S_ProcName = "readCachedGenFileByXSubPkg";
		YCFGenKbGenFileByXSubPkgKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSubPkgKey();
		key.setOptionalSubPackageTenantId( SubPackageTenantId );
		key.setOptionalSubPackageGelCacheId( SubPackageGelCacheId );
		key.setOptionalSubPackageGelId( SubPackageGelId );
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>();
		if( indexByXSubPkg != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
			if( indexByXSubPkg.containsKey( key ) ) {
				dict = indexByXSubPkg.get( key );
				int len = dict.size();
				IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
				Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenFileObj obj;
			Iterator<IYCFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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

	public List<IYCFGenKbGenFileObj> readCachedGenFileByXExpClsName( Long ExpansionClassNameTenantId,
		Long ExpansionClassNameGelCacheId,
		Long ExpansionClassNameGelId )
	{
		final String S_ProcName = "readCachedGenFileByXExpClsName";
		YCFGenKbGenFileByXExpClsNameKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpClsNameKey();
		key.setOptionalExpansionClassNameTenantId( ExpansionClassNameTenantId );
		key.setOptionalExpansionClassNameGelCacheId( ExpansionClassNameGelCacheId );
		key.setOptionalExpansionClassNameGelId( ExpansionClassNameGelId );
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>();
		if( indexByXExpClsName != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
			if( indexByXExpClsName.containsKey( key ) ) {
				dict = indexByXExpClsName.get( key );
				int len = dict.size();
				IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
				Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenFileObj obj;
			Iterator<IYCFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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

	public List<IYCFGenKbGenFileObj> readCachedGenFileByXExpKeyName( Long ExpansionKeyNameTenantId,
		Long ExpansionKeyNameGelCacheId,
		Long ExpansionKeyNameGelId )
	{
		final String S_ProcName = "readCachedGenFileByXExpKeyName";
		YCFGenKbGenFileByXExpKeyNameKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpKeyNameKey();
		key.setOptionalExpansionKeyNameTenantId( ExpansionKeyNameTenantId );
		key.setOptionalExpansionKeyNameGelCacheId( ExpansionKeyNameGelCacheId );
		key.setOptionalExpansionKeyNameGelId( ExpansionKeyNameGelId );
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>();
		if( indexByXExpKeyName != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
			if( indexByXExpKeyName.containsKey( key ) ) {
				dict = indexByXExpKeyName.get( key );
				int len = dict.size();
				IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
				Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenFileObj obj;
			Iterator<IYCFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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

	public List<IYCFGenKbGenFileObj> readCachedGenFileByXExpFileName( Long ExpansionFileNameTenantId,
		Long ExpansionFileNameGelCacheId,
		Long ExpansionFileNameGelId )
	{
		final String S_ProcName = "readCachedGenFileByXExpFileName";
		YCFGenKbGenFileByXExpFileNameKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpFileNameKey();
		key.setOptionalExpansionFileNameTenantId( ExpansionFileNameTenantId );
		key.setOptionalExpansionFileNameGelCacheId( ExpansionFileNameGelCacheId );
		key.setOptionalExpansionFileNameGelId( ExpansionFileNameGelId );
		ArrayList<IYCFGenKbGenFileObj> arrayList = new ArrayList<IYCFGenKbGenFileObj>();
		if( indexByXExpFileName != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict;
			if( indexByXExpFileName.containsKey( key ) ) {
				dict = indexByXExpFileName.get( key );
				int len = dict.size();
				IYCFGenKbGenFileObj arr[] = new IYCFGenKbGenFileObj[len];
				Iterator<IYCFGenKbGenFileObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenFileObj obj;
			Iterator<IYCFGenKbGenFileObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenFileObj> cmp = new Comparator<IYCFGenKbGenFileObj>() {
			public int compare( IYCFGenKbGenFileObj lhs, IYCFGenKbGenFileObj rhs ) {
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

	public void deepDisposeGenFileByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		IYCFGenKbGenFileObj obj = readCachedGenFileByItemIdIdx( TenantId,
				CartridgeId,
				ItemId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGenFileByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeGenFileByTenantIdx";
		IYCFGenKbGenFileObj obj;
		List<IYCFGenKbGenFileObj> arrayList = readCachedGenFileByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenFileObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGenFileObj obj;
		List<IYCFGenKbGenFileObj> arrayList = readCachedGenFileByCartIdx( TenantId,
				CartridgeId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenFileObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGenFileObj obj;
		List<IYCFGenKbGenFileObj> arrayList = readCachedGenFileByRuleTypeIdx( RuleTypeId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenFileObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGenFileObj obj;
		List<IYCFGenKbGenFileObj> arrayList = readCachedGenFileByToolSetIdx( ToolSetId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenFileObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGenFileObj obj;
		List<IYCFGenKbGenFileObj> arrayList = readCachedGenFileByScopeIdx( ScopeDefId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenFileObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGenFileObj obj;
		List<IYCFGenKbGenFileObj> arrayList = readCachedGenFileByGenDefIdx( GenDefId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenFileObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGenFileObj obj = readCachedGenFileByAltIdx( Name,
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
		IYCFGenKbGenFileObj obj;
		List<IYCFGenKbGenFileObj> arrayList = readCachedGenFileByGelExecIdx( GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenFileObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGenFileObj obj;
		List<IYCFGenKbGenFileObj> arrayList = readCachedGenFileByProbeIdx( ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenFileObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGenFileObj obj;
		List<IYCFGenKbGenFileObj> arrayList = readCachedGenFileByBodyIdx( BodyTenantId,
				BodyGelCacheId,
				BodyGelId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenFileObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGenFileObj obj;
		List<IYCFGenKbGenFileObj> arrayList = readCachedGenFileByXSrcBundle( SourceBundleTenantId,
				SourceBundleGelCacheId,
				SourceBundleGelId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenFileObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGenFileObj obj;
		List<IYCFGenKbGenFileObj> arrayList = readCachedGenFileByXModName( ModuleNameTenantId,
				ModuleNameGelCacheId,
				ModuleNameGelId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenFileObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGenFileObj obj;
		List<IYCFGenKbGenFileObj> arrayList = readCachedGenFileByXBasePkg( BasePackageTenantId,
				BasePackageGelCacheId,
				BasePackageGelId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenFileObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGenFileObj obj;
		List<IYCFGenKbGenFileObj> arrayList = readCachedGenFileByXSubPkg( SubPackageTenantId,
				SubPackageGelCacheId,
				SubPackageGelId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenFileObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGenFileObj obj;
		List<IYCFGenKbGenFileObj> arrayList = readCachedGenFileByXExpClsName( ExpansionClassNameTenantId,
				ExpansionClassNameGelCacheId,
				ExpansionClassNameGelId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenFileObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGenFileObj obj;
		List<IYCFGenKbGenFileObj> arrayList = readCachedGenFileByXExpKeyName( ExpansionKeyNameTenantId,
				ExpansionKeyNameGelCacheId,
				ExpansionKeyNameGelId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenFileObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGenFileObj obj;
		List<IYCFGenKbGenFileObj> arrayList = readCachedGenFileByXExpFileName( ExpansionFileNameTenantId,
				ExpansionFileNameGelCacheId,
				ExpansionFileNameGelId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenFileObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFGenKbGenFileObj updateGenFile( IYCFGenKbGenFileObj Obj ) {
		IYCFGenKbGenFileObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().updateGenFile( schema.getAuthorization(),
			Obj.getGenFileBuff() );
		if( Obj.getClassCode().equals( "a932" ) ) {
			obj = (IYCFGenKbGenFileObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteGenFile( IYCFGenKbGenFileObj Obj ) {
		IYCFGenKbGenFileObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFile( schema.getAuthorization(),
			obj.getGenFileBuff() );
		Obj.forget();
	}

	public void deleteGenFileByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		YCFGenKbGenItemPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredCartridgeId( CartridgeId );
		pkey.setRequiredItemId( ItemId );
		IYCFGenKbGenFileObj obj = readGenFile( pkey );
		if( obj != null ) {
			IYCFGenKbGenFileEditObj editObj = (IYCFGenKbGenFileEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbGenFileEditObj)obj.beginEdit();
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
		YCFGenKbGenItemByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGenItemByTenantIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict = indexByTenantIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFGenKbGenFileObj> iter = dict.values().iterator();
			IYCFGenKbGenFileObj obj;
			List<IYCFGenKbGenFileObj> toForget = new LinkedList<IYCFGenKbGenFileObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeGenFileByTenantIdx( TenantId );
	}

	public void deleteGenFileByCartIdx( long TenantId,
		long CartridgeId )
	{
		YCFGenKbGenItemByCartIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		if( indexByCartIdx == null ) {
			indexByCartIdx = new HashMap< YCFGenKbGenItemByCartIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( indexByCartIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict = indexByCartIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByCartIdx( schema.getAuthorization(),
				TenantId,
				CartridgeId );
			Iterator<IYCFGenKbGenFileObj> iter = dict.values().iterator();
			IYCFGenKbGenFileObj obj;
			List<IYCFGenKbGenFileObj> toForget = new LinkedList<IYCFGenKbGenFileObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByCartIdx( schema.getAuthorization(),
				TenantId,
				CartridgeId );
		}
		deepDisposeGenFileByCartIdx( TenantId,
				CartridgeId );
	}

	public void deleteGenFileByRuleTypeIdx( short RuleTypeId )
	{
		YCFGenKbGenItemByRuleTypeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( RuleTypeId );
		if( indexByRuleTypeIdx == null ) {
			indexByRuleTypeIdx = new HashMap< YCFGenKbGenItemByRuleTypeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( indexByRuleTypeIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict = indexByRuleTypeIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByRuleTypeIdx( schema.getAuthorization(),
				RuleTypeId );
			Iterator<IYCFGenKbGenFileObj> iter = dict.values().iterator();
			IYCFGenKbGenFileObj obj;
			List<IYCFGenKbGenFileObj> toForget = new LinkedList<IYCFGenKbGenFileObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByRuleTypeIdx( schema.getAuthorization(),
				RuleTypeId );
		}
		deepDisposeGenFileByRuleTypeIdx( RuleTypeId );
	}

	public void deleteGenFileByToolSetIdx( short ToolSetId )
	{
		YCFGenKbGenItemByToolSetIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( ToolSetId );
		if( indexByToolSetIdx == null ) {
			indexByToolSetIdx = new HashMap< YCFGenKbGenItemByToolSetIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( indexByToolSetIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict = indexByToolSetIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByToolSetIdx( schema.getAuthorization(),
				ToolSetId );
			Iterator<IYCFGenKbGenFileObj> iter = dict.values().iterator();
			IYCFGenKbGenFileObj obj;
			List<IYCFGenKbGenFileObj> toForget = new LinkedList<IYCFGenKbGenFileObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByToolSetIdx( schema.getAuthorization(),
				ToolSetId );
		}
		deepDisposeGenFileByToolSetIdx( ToolSetId );
	}

	public void deleteGenFileByScopeIdx( Short ScopeDefId )
	{
		YCFGenKbGenItemByScopeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( ScopeDefId );
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFGenKbGenItemByScopeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( indexByScopeIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict = indexByScopeIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByScopeIdx( schema.getAuthorization(),
				ScopeDefId );
			Iterator<IYCFGenKbGenFileObj> iter = dict.values().iterator();
			IYCFGenKbGenFileObj obj;
			List<IYCFGenKbGenFileObj> toForget = new LinkedList<IYCFGenKbGenFileObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByScopeIdx( schema.getAuthorization(),
				ScopeDefId );
		}
		deepDisposeGenFileByScopeIdx( ScopeDefId );
	}

	public void deleteGenFileByGenDefIdx( short GenDefId )
	{
		YCFGenKbGenItemByGenDefIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( GenDefId );
		if( indexByGenDefIdx == null ) {
			indexByGenDefIdx = new HashMap< YCFGenKbGenItemByGenDefIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( indexByGenDefIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict = indexByGenDefIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByGenDefIdx( schema.getAuthorization(),
				GenDefId );
			Iterator<IYCFGenKbGenFileObj> iter = dict.values().iterator();
			IYCFGenKbGenFileObj obj;
			List<IYCFGenKbGenFileObj> toForget = new LinkedList<IYCFGenKbGenFileObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByGenDefIdx( schema.getAuthorization(),
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
			indexByAltIdx = new HashMap< YCFGenKbGenItemByAltIdxKey,
				IYCFGenKbGenFileObj >();
		}
		YCFGenKbGenItemByAltIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newAltIdxKey();
		key.setRequiredName( Name );
		key.setRequiredToolSetId( ToolSetId );
		key.setOptionalScopeDefId( ScopeDefId );
		key.setRequiredGenDefId( GenDefId );
		IYCFGenKbGenFileObj obj = null;
		if( indexByAltIdx.containsKey( key ) ) {
			obj = indexByAltIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByAltIdx( schema.getAuthorization(),
				Name,
				ToolSetId,
				ScopeDefId,
				GenDefId );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByAltIdx( schema.getAuthorization(),
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
		YCFGenKbGenItemByGelExecIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( GelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( GelExecutableGelCacheId );
		key.setOptionalGelExecutableId( GelExecutableId );
		if( indexByGelExecIdx == null ) {
			indexByGelExecIdx = new HashMap< YCFGenKbGenItemByGelExecIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( indexByGelExecIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict = indexByGelExecIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByGelExecIdx( schema.getAuthorization(),
				GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
			Iterator<IYCFGenKbGenFileObj> iter = dict.values().iterator();
			IYCFGenKbGenFileObj obj;
			List<IYCFGenKbGenFileObj> toForget = new LinkedList<IYCFGenKbGenFileObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByGelExecIdx( schema.getAuthorization(),
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
		YCFGenKbGenItemByProbeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( ProbeTenantId );
		key.setOptionalProbeCartridgeId( ProbeCartridgeId );
		key.setOptionalProbeGenItemId( ProbeGenItemId );
		if( indexByProbeIdx == null ) {
			indexByProbeIdx = new HashMap< YCFGenKbGenItemByProbeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( indexByProbeIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict = indexByProbeIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByProbeIdx( schema.getAuthorization(),
				ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
			Iterator<IYCFGenKbGenFileObj> iter = dict.values().iterator();
			IYCFGenKbGenFileObj obj;
			List<IYCFGenKbGenFileObj> toForget = new LinkedList<IYCFGenKbGenFileObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByProbeIdx( schema.getAuthorization(),
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
		YCFGenKbGenRuleByBodyIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenRule().newBodyIdxKey();
		key.setOptionalBodyTenantId( BodyTenantId );
		key.setOptionalBodyGelCacheId( BodyGelCacheId );
		key.setOptionalBodyGelId( BodyGelId );
		if( indexByBodyIdx == null ) {
			indexByBodyIdx = new HashMap< YCFGenKbGenRuleByBodyIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( indexByBodyIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict = indexByBodyIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByBodyIdx( schema.getAuthorization(),
				BodyTenantId,
				BodyGelCacheId,
				BodyGelId );
			Iterator<IYCFGenKbGenFileObj> iter = dict.values().iterator();
			IYCFGenKbGenFileObj obj;
			List<IYCFGenKbGenFileObj> toForget = new LinkedList<IYCFGenKbGenFileObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByBodyIdx( schema.getAuthorization(),
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
		YCFGenKbGenFileByXSrcBundleKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSrcBundleKey();
		key.setOptionalSourceBundleTenantId( SourceBundleTenantId );
		key.setOptionalSourceBundleGelCacheId( SourceBundleGelCacheId );
		key.setOptionalSourceBundleGelId( SourceBundleGelId );
		if( indexByXSrcBundle == null ) {
			indexByXSrcBundle = new HashMap< YCFGenKbGenFileByXSrcBundleKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( indexByXSrcBundle.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict = indexByXSrcBundle.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXSrcBundle( schema.getAuthorization(),
				SourceBundleTenantId,
				SourceBundleGelCacheId,
				SourceBundleGelId );
			Iterator<IYCFGenKbGenFileObj> iter = dict.values().iterator();
			IYCFGenKbGenFileObj obj;
			List<IYCFGenKbGenFileObj> toForget = new LinkedList<IYCFGenKbGenFileObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXSrcBundle( schema.getAuthorization(),
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
		YCFGenKbGenFileByXModNameKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXModNameKey();
		key.setOptionalModuleNameTenantId( ModuleNameTenantId );
		key.setOptionalModuleNameGelCacheId( ModuleNameGelCacheId );
		key.setOptionalModuleNameGelId( ModuleNameGelId );
		if( indexByXModName == null ) {
			indexByXModName = new HashMap< YCFGenKbGenFileByXModNameKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( indexByXModName.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict = indexByXModName.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXModName( schema.getAuthorization(),
				ModuleNameTenantId,
				ModuleNameGelCacheId,
				ModuleNameGelId );
			Iterator<IYCFGenKbGenFileObj> iter = dict.values().iterator();
			IYCFGenKbGenFileObj obj;
			List<IYCFGenKbGenFileObj> toForget = new LinkedList<IYCFGenKbGenFileObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXModName( schema.getAuthorization(),
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
		YCFGenKbGenFileByXBasePkgKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXBasePkgKey();
		key.setOptionalBasePackageTenantId( BasePackageTenantId );
		key.setOptionalBasePackageGelCacheId( BasePackageGelCacheId );
		key.setOptionalBasePackageGelId( BasePackageGelId );
		if( indexByXBasePkg == null ) {
			indexByXBasePkg = new HashMap< YCFGenKbGenFileByXBasePkgKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( indexByXBasePkg.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict = indexByXBasePkg.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXBasePkg( schema.getAuthorization(),
				BasePackageTenantId,
				BasePackageGelCacheId,
				BasePackageGelId );
			Iterator<IYCFGenKbGenFileObj> iter = dict.values().iterator();
			IYCFGenKbGenFileObj obj;
			List<IYCFGenKbGenFileObj> toForget = new LinkedList<IYCFGenKbGenFileObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXBasePkg( schema.getAuthorization(),
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
		YCFGenKbGenFileByXSubPkgKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXSubPkgKey();
		key.setOptionalSubPackageTenantId( SubPackageTenantId );
		key.setOptionalSubPackageGelCacheId( SubPackageGelCacheId );
		key.setOptionalSubPackageGelId( SubPackageGelId );
		if( indexByXSubPkg == null ) {
			indexByXSubPkg = new HashMap< YCFGenKbGenFileByXSubPkgKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( indexByXSubPkg.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict = indexByXSubPkg.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXSubPkg( schema.getAuthorization(),
				SubPackageTenantId,
				SubPackageGelCacheId,
				SubPackageGelId );
			Iterator<IYCFGenKbGenFileObj> iter = dict.values().iterator();
			IYCFGenKbGenFileObj obj;
			List<IYCFGenKbGenFileObj> toForget = new LinkedList<IYCFGenKbGenFileObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXSubPkg( schema.getAuthorization(),
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
		YCFGenKbGenFileByXExpClsNameKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpClsNameKey();
		key.setOptionalExpansionClassNameTenantId( ExpansionClassNameTenantId );
		key.setOptionalExpansionClassNameGelCacheId( ExpansionClassNameGelCacheId );
		key.setOptionalExpansionClassNameGelId( ExpansionClassNameGelId );
		if( indexByXExpClsName == null ) {
			indexByXExpClsName = new HashMap< YCFGenKbGenFileByXExpClsNameKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( indexByXExpClsName.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict = indexByXExpClsName.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXExpClsName( schema.getAuthorization(),
				ExpansionClassNameTenantId,
				ExpansionClassNameGelCacheId,
				ExpansionClassNameGelId );
			Iterator<IYCFGenKbGenFileObj> iter = dict.values().iterator();
			IYCFGenKbGenFileObj obj;
			List<IYCFGenKbGenFileObj> toForget = new LinkedList<IYCFGenKbGenFileObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXExpClsName( schema.getAuthorization(),
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
		YCFGenKbGenFileByXExpKeyNameKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpKeyNameKey();
		key.setOptionalExpansionKeyNameTenantId( ExpansionKeyNameTenantId );
		key.setOptionalExpansionKeyNameGelCacheId( ExpansionKeyNameGelCacheId );
		key.setOptionalExpansionKeyNameGelId( ExpansionKeyNameGelId );
		if( indexByXExpKeyName == null ) {
			indexByXExpKeyName = new HashMap< YCFGenKbGenFileByXExpKeyNameKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( indexByXExpKeyName.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict = indexByXExpKeyName.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXExpKeyName( schema.getAuthorization(),
				ExpansionKeyNameTenantId,
				ExpansionKeyNameGelCacheId,
				ExpansionKeyNameGelId );
			Iterator<IYCFGenKbGenFileObj> iter = dict.values().iterator();
			IYCFGenKbGenFileObj obj;
			List<IYCFGenKbGenFileObj> toForget = new LinkedList<IYCFGenKbGenFileObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXExpKeyName( schema.getAuthorization(),
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
		YCFGenKbGenFileByXExpFileNameKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newXExpFileNameKey();
		key.setOptionalExpansionFileNameTenantId( ExpansionFileNameTenantId );
		key.setOptionalExpansionFileNameGelCacheId( ExpansionFileNameGelCacheId );
		key.setOptionalExpansionFileNameGelId( ExpansionFileNameGelId );
		if( indexByXExpFileName == null ) {
			indexByXExpFileName = new HashMap< YCFGenKbGenFileByXExpFileNameKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenFileObj > >();
		}
		if( indexByXExpFileName.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenFileObj> dict = indexByXExpFileName.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXExpFileName( schema.getAuthorization(),
				ExpansionFileNameTenantId,
				ExpansionFileNameGelCacheId,
				ExpansionFileNameGelId );
			Iterator<IYCFGenKbGenFileObj> iter = dict.values().iterator();
			IYCFGenKbGenFileObj obj;
			List<IYCFGenKbGenFileObj> toForget = new LinkedList<IYCFGenKbGenFileObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().deleteGenFileByXExpFileName( schema.getAuthorization(),
				ExpansionFileNameTenantId,
				ExpansionFileNameGelCacheId,
				ExpansionFileNameGelId );
		}
		deepDisposeGenFileByXExpFileName( ExpansionFileNameTenantId,
				ExpansionFileNameGelCacheId,
				ExpansionFileNameGelId );
	}
}
