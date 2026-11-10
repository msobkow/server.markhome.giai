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

public class YCFGenKbGenItemTableObj
	implements IYCFGenKbGenItemTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> members;
	private Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> allGenItem;
	private Map< YCFGenKbGenItemByTenantIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > > indexByTenantIdx;
	private Map< YCFGenKbGenItemByCartIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > > indexByCartIdx;
	private Map< YCFGenKbGenItemByRuleTypeIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > > indexByRuleTypeIdx;
	private Map< YCFGenKbGenItemByToolSetIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > > indexByToolSetIdx;
	private Map< YCFGenKbGenItemByScopeIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > > indexByScopeIdx;
	private Map< YCFGenKbGenItemByGenDefIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > > indexByGenDefIdx;
	private Map< YCFGenKbGenItemByAltIdxKey,
		IYCFGenKbGenItemObj > indexByAltIdx;
	private Map< YCFGenKbGenItemByGelExecIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > > indexByGelExecIdx;
	private Map< YCFGenKbGenItemByProbeIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > > indexByProbeIdx;
	public static String TABLE_NAME = "GenItem";
	public static String TABLE_DBNAME = "kbgenitem";

	public YCFGenKbGenItemTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj>();
		allGenItem = null;
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

	public YCFGenKbGenItemTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj>();
		allGenItem = null;
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
		allGenItem = null;
		indexByTenantIdx = null;
		indexByCartIdx = null;
		indexByRuleTypeIdx = null;
		indexByToolSetIdx = null;
		indexByScopeIdx = null;
		indexByGenDefIdx = null;
		indexByAltIdx = null;
		indexByGelExecIdx = null;
		indexByProbeIdx = null;
		List<IYCFGenKbGenItemObj> toForget = new LinkedList<IYCFGenKbGenItemObj>();
		IYCFGenKbGenItemObj cur = null;
		Iterator<IYCFGenKbGenItemObj> iter = members.values().iterator();
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
	 *	YCFGenKbGenItemObj.
	 */
	public IYCFGenKbGenItemObj newInstance() {
		IYCFGenKbGenItemObj inst = new YCFGenKbGenItemObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbGenItemObj.
	 */
	public IYCFGenKbGenItemEditObj newEditInstance( IYCFGenKbGenItemObj orig ) {
		IYCFGenKbGenItemEditObj edit = new YCFGenKbGenItemEditObj( orig );
		return( edit );
	}

	public IYCFGenKbGenItemObj constructByClassCode( String argClassCode ) {
		IYCFGenKbGenItemObj obj = null;
		if( argClassCode.equals( "a920" ) ) {
			obj = ((IYCFGenKbSchemaObj)schema).getGenItemTableObj().newInstance();
		}
		else if( argClassCode.equals( "a921" ) ) {
			obj = ((IYCFGenKbSchemaObj)schema).getGenIteratorTableObj().newInstance();
		}
		else if( argClassCode.equals( "a922" ) ) {
			obj = ((IYCFGenKbSchemaObj)schema).getGenReferenceTableObj().newInstance();
		}
		else if( argClassCode.equals( "a923" ) ) {
			obj = ((IYCFGenKbSchemaObj)schema).getGenRuleTableObj().newInstance();
		}
		else if( argClassCode.equals( "a924" ) ) {
			obj = ((IYCFGenKbSchemaObj)schema).getGenTruncTableObj().newInstance();
		}
		else if( argClassCode.equals( "a932" ) ) {
			obj = ((IYCFGenKbSchemaObj)schema).getGenFileTableObj().newInstance();
		}
		else if( argClassCode.equals( "a931" ) ) {
			obj = ((IYCFGenKbSchemaObj)schema).getGenBindTableObj().newInstance();
		}
		return( obj );
	}

	public IYCFGenKbGenItemObj realiseGenItem( IYCFGenKbGenItemObj Obj ) {
		IYCFGenKbGenItemObj obj = Obj;
		YCFGenKbGenItemPKey pkey = obj.getPKey();
		IYCFGenKbGenItemObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbGenItemObj existingObj = members.get( pkey );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.remove( keepObj.getPKey() );
					if( mapTenantIdx.size() <= 0 ) {
						indexByTenantIdx.remove( keyTenantIdx );
					}
				}
			}

			if( indexByCartIdx != null ) {
				YCFGenKbGenItemByCartIdxKey keyCartIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
				keyCartIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyCartIdx.setRequiredCartridgeId( keepObj.getRequiredCartridgeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > mapCartIdx = indexByCartIdx.get( keyCartIdx );
				if( mapCartIdx != null ) {
					mapCartIdx.remove( keepObj.getPKey() );
					if( mapCartIdx.size() <= 0 ) {
						indexByCartIdx.remove( keyCartIdx );
					}
				}
			}

			if( indexByRuleTypeIdx != null ) {
				YCFGenKbGenItemByRuleTypeIdxKey keyRuleTypeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
				keyRuleTypeIdx.setRequiredRuleTypeId( keepObj.getRequiredRuleTypeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > mapRuleTypeIdx = indexByRuleTypeIdx.get( keyRuleTypeIdx );
				if( mapRuleTypeIdx != null ) {
					mapRuleTypeIdx.remove( keepObj.getPKey() );
					if( mapRuleTypeIdx.size() <= 0 ) {
						indexByRuleTypeIdx.remove( keyRuleTypeIdx );
					}
				}
			}

			if( indexByToolSetIdx != null ) {
				YCFGenKbGenItemByToolSetIdxKey keyToolSetIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
				keyToolSetIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > mapToolSetIdx = indexByToolSetIdx.get( keyToolSetIdx );
				if( mapToolSetIdx != null ) {
					mapToolSetIdx.remove( keepObj.getPKey() );
					if( mapToolSetIdx.size() <= 0 ) {
						indexByToolSetIdx.remove( keyToolSetIdx );
					}
				}
			}

			if( indexByScopeIdx != null ) {
				YCFGenKbGenItemByScopeIdxKey keyScopeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
				keyScopeIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.remove( keepObj.getPKey() );
					if( mapScopeIdx.size() <= 0 ) {
						indexByScopeIdx.remove( keyScopeIdx );
					}
				}
			}

			if( indexByGenDefIdx != null ) {
				YCFGenKbGenItemByGenDefIdxKey keyGenDefIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
				keyGenDefIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > mapGenDefIdx = indexByGenDefIdx.get( keyGenDefIdx );
				if( mapGenDefIdx != null ) {
					mapGenDefIdx.remove( keepObj.getPKey() );
					if( mapGenDefIdx.size() <= 0 ) {
						indexByGenDefIdx.remove( keyGenDefIdx );
					}
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > mapGelExecIdx = indexByGelExecIdx.get( keyGelExecIdx );
				if( mapGelExecIdx != null ) {
					mapGelExecIdx.remove( keepObj.getPKey() );
					if( mapGelExecIdx.size() <= 0 ) {
						indexByGelExecIdx.remove( keyGelExecIdx );
					}
				}
			}

			if( indexByProbeIdx != null ) {
				YCFGenKbGenItemByProbeIdxKey keyProbeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
				keyProbeIdx.setOptionalProbeTenantId( keepObj.getOptionalProbeTenantId() );
				keyProbeIdx.setOptionalProbeCartridgeId( keepObj.getOptionalProbeCartridgeId() );
				keyProbeIdx.setOptionalProbeGenItemId( keepObj.getOptionalProbeGenItemId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > mapProbeIdx = indexByProbeIdx.get( keyProbeIdx );
				if( mapProbeIdx != null ) {
					mapProbeIdx.remove( keepObj.getPKey() );
					if( mapProbeIdx.size() <= 0 ) {
						indexByProbeIdx.remove( keyProbeIdx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFGenKbGenItemByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCartIdx != null ) {
				YCFGenKbGenItemByCartIdxKey keyCartIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
				keyCartIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyCartIdx.setRequiredCartridgeId( keepObj.getRequiredCartridgeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > mapCartIdx = indexByCartIdx.get( keyCartIdx );
				if( mapCartIdx != null ) {
					mapCartIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRuleTypeIdx != null ) {
				YCFGenKbGenItemByRuleTypeIdxKey keyRuleTypeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
				keyRuleTypeIdx.setRequiredRuleTypeId( keepObj.getRequiredRuleTypeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > mapRuleTypeIdx = indexByRuleTypeIdx.get( keyRuleTypeIdx );
				if( mapRuleTypeIdx != null ) {
					mapRuleTypeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByToolSetIdx != null ) {
				YCFGenKbGenItemByToolSetIdxKey keyToolSetIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
				keyToolSetIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > mapToolSetIdx = indexByToolSetIdx.get( keyToolSetIdx );
				if( mapToolSetIdx != null ) {
					mapToolSetIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFGenKbGenItemByScopeIdxKey keyScopeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
				keyScopeIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGenDefIdx != null ) {
				YCFGenKbGenItemByGenDefIdxKey keyGenDefIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
				keyGenDefIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > mapGenDefIdx = indexByGenDefIdx.get( keyGenDefIdx );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > mapGelExecIdx = indexByGelExecIdx.get( keyGelExecIdx );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > mapProbeIdx = indexByProbeIdx.get( keyProbeIdx );
				if( mapProbeIdx != null ) {
					mapProbeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allGenItem != null ) {
				allGenItem.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allGenItem != null ) {
				allGenItem.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFGenKbGenItemByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCartIdx != null ) {
				YCFGenKbGenItemByCartIdxKey keyCartIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
				keyCartIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyCartIdx.setRequiredCartridgeId( keepObj.getRequiredCartridgeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > mapCartIdx = indexByCartIdx.get( keyCartIdx );
				if( mapCartIdx != null ) {
					mapCartIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRuleTypeIdx != null ) {
				YCFGenKbGenItemByRuleTypeIdxKey keyRuleTypeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
				keyRuleTypeIdx.setRequiredRuleTypeId( keepObj.getRequiredRuleTypeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > mapRuleTypeIdx = indexByRuleTypeIdx.get( keyRuleTypeIdx );
				if( mapRuleTypeIdx != null ) {
					mapRuleTypeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByToolSetIdx != null ) {
				YCFGenKbGenItemByToolSetIdxKey keyToolSetIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
				keyToolSetIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > mapToolSetIdx = indexByToolSetIdx.get( keyToolSetIdx );
				if( mapToolSetIdx != null ) {
					mapToolSetIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFGenKbGenItemByScopeIdxKey keyScopeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
				keyScopeIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGenDefIdx != null ) {
				YCFGenKbGenItemByGenDefIdxKey keyGenDefIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
				keyGenDefIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > mapGenDefIdx = indexByGenDefIdx.get( keyGenDefIdx );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > mapGelExecIdx = indexByGelExecIdx.get( keyGelExecIdx );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > mapProbeIdx = indexByProbeIdx.get( keyProbeIdx );
				if( mapProbeIdx != null ) {
					mapProbeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFGenKbGenItemObj createGenItem( IYCFGenKbGenItemObj Obj ) {
		IYCFGenKbGenItemObj obj = Obj;
		YCFGenKbGenItemBuff buff = obj.getGenItemBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().createGenItem(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a920" ) ) {
			obj = (IYCFGenKbGenItemObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbGenItemObj readGenItem( YCFGenKbGenItemPKey pkey ) {
		return( readGenItem( pkey, false ) );
	}

	public IYCFGenKbGenItemObj readGenItem( YCFGenKbGenItemPKey pkey, boolean forceRead ) {
		IYCFGenKbGenItemObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbGenItemBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByItemIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredCartridgeId(),
				pkey.getRequiredItemId() );
			if( readBuff != null ) {
				obj = (IYCFGenKbGenItemObj)schema.getGenItemTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbGenItemObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbGenItemObj readCachedGenItem( YCFGenKbGenItemPKey pkey ) {
		IYCFGenKbGenItemObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeGenItem( IYCFGenKbGenItemObj obj )
	{
		final String S_ProcName = "YCFGenKbGenItemTableObj.reallyDeepDisposeGenItem() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbGenItemPKey pkey = obj.getPKey();
		IYCFGenKbGenItemObj existing = readCachedGenItem( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbGenItemByTenantIdxKey keyTenantIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFGenKbGenItemByCartIdxKey keyCartIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
		keyCartIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyCartIdx.setRequiredCartridgeId( existing.getRequiredCartridgeId() );

		YCFGenKbGenItemByRuleTypeIdxKey keyRuleTypeIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
		keyRuleTypeIdx.setRequiredRuleTypeId( existing.getRequiredRuleTypeId() );

		YCFGenKbGenItemByToolSetIdxKey keyToolSetIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
		keyToolSetIdx.setRequiredToolSetId( existing.getRequiredToolSetId() );

		YCFGenKbGenItemByScopeIdxKey keyScopeIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
		keyScopeIdx.setOptionalScopeDefId( existing.getOptionalScopeDefId() );

		YCFGenKbGenItemByGenDefIdxKey keyGenDefIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
		keyGenDefIdx.setRequiredGenDefId( existing.getRequiredGenDefId() );

		YCFGenKbGenItemByAltIdxKey keyAltIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newAltIdxKey();
		keyAltIdx.setRequiredName( existing.getRequiredName() );
		keyAltIdx.setRequiredToolSetId( existing.getRequiredToolSetId() );
		keyAltIdx.setOptionalScopeDefId( existing.getOptionalScopeDefId() );
		keyAltIdx.setRequiredGenDefId( existing.getRequiredGenDefId() );

		YCFGenKbGenItemByGelExecIdxKey keyGelExecIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
		keyGelExecIdx.setOptionalGelExecutableTenantId( existing.getOptionalGelExecutableTenantId() );
		keyGelExecIdx.setOptionalGelExecutableGelCacheId( existing.getOptionalGelExecutableGelCacheId() );
		keyGelExecIdx.setOptionalGelExecutableId( existing.getOptionalGelExecutableId() );

		YCFGenKbGenItemByProbeIdxKey keyProbeIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
		keyProbeIdx.setOptionalProbeTenantId( existing.getOptionalProbeTenantId() );
		keyProbeIdx.setOptionalProbeCartridgeId( existing.getOptionalProbeCartridgeId() );
		keyProbeIdx.setOptionalProbeGenItemId( existing.getOptionalProbeGenItemId() );


					schema.getGelExecutableTableObj().deepDisposeGelExecutableByPIdx( existing.getOptionalGelExecutableTenantId(),
						existing.getOptionalGelExecutableGelCacheId(),
						existing.getOptionalGelExecutableId() );

		if( indexByTenantIdx != null ) {
			if( indexByTenantIdx.containsKey( keyTenantIdx ) ) {
				indexByTenantIdx.get( keyTenantIdx ).remove( pkey );
				if( indexByTenantIdx.get( keyTenantIdx ).size() <= 0 ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}
		}

		if( indexByCartIdx != null ) {
			if( indexByCartIdx.containsKey( keyCartIdx ) ) {
				indexByCartIdx.get( keyCartIdx ).remove( pkey );
				if( indexByCartIdx.get( keyCartIdx ).size() <= 0 ) {
					indexByCartIdx.remove( keyCartIdx );
				}
			}
		}

		if( indexByRuleTypeIdx != null ) {
			if( indexByRuleTypeIdx.containsKey( keyRuleTypeIdx ) ) {
				indexByRuleTypeIdx.get( keyRuleTypeIdx ).remove( pkey );
				if( indexByRuleTypeIdx.get( keyRuleTypeIdx ).size() <= 0 ) {
					indexByRuleTypeIdx.remove( keyRuleTypeIdx );
				}
			}
		}

		if( indexByToolSetIdx != null ) {
			if( indexByToolSetIdx.containsKey( keyToolSetIdx ) ) {
				indexByToolSetIdx.get( keyToolSetIdx ).remove( pkey );
				if( indexByToolSetIdx.get( keyToolSetIdx ).size() <= 0 ) {
					indexByToolSetIdx.remove( keyToolSetIdx );
				}
			}
		}

		if( indexByScopeIdx != null ) {
			if( indexByScopeIdx.containsKey( keyScopeIdx ) ) {
				indexByScopeIdx.get( keyScopeIdx ).remove( pkey );
				if( indexByScopeIdx.get( keyScopeIdx ).size() <= 0 ) {
					indexByScopeIdx.remove( keyScopeIdx );
				}
			}
		}

		if( indexByGenDefIdx != null ) {
			if( indexByGenDefIdx.containsKey( keyGenDefIdx ) ) {
				indexByGenDefIdx.get( keyGenDefIdx ).remove( pkey );
				if( indexByGenDefIdx.get( keyGenDefIdx ).size() <= 0 ) {
					indexByGenDefIdx.remove( keyGenDefIdx );
				}
			}
		}

		if( indexByAltIdx != null ) {
			indexByAltIdx.remove( keyAltIdx );
		}

		if( indexByGelExecIdx != null ) {
			if( indexByGelExecIdx.containsKey( keyGelExecIdx ) ) {
				indexByGelExecIdx.get( keyGelExecIdx ).remove( pkey );
				if( indexByGelExecIdx.get( keyGelExecIdx ).size() <= 0 ) {
					indexByGelExecIdx.remove( keyGelExecIdx );
				}
			}
		}

		if( indexByProbeIdx != null ) {
			if( indexByProbeIdx.containsKey( keyProbeIdx ) ) {
				indexByProbeIdx.get( keyProbeIdx ).remove( pkey );
				if( indexByProbeIdx.get( keyProbeIdx ).size() <= 0 ) {
					indexByProbeIdx.remove( keyProbeIdx );
				}
			}
		}


	}
	public void deepDisposeGenItem( YCFGenKbGenItemPKey pkey ) {
		IYCFGenKbGenItemObj obj = readCachedGenItem( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbGenItemObj lockGenItem( YCFGenKbGenItemPKey pkey ) {
		IYCFGenKbGenItemObj locked = null;
		YCFGenKbGenItemBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFGenKbGenItemObj)schema.getGenItemTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbGenItemObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockGenItem", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbGenItemObj> readAllGenItem() {
		return( readAllGenItem( false ) );
	}

	public List<IYCFGenKbGenItemObj> readAllGenItem( boolean forceRead ) {
		final String S_ProcName = "readAllGenItem";
		if( ( allGenItem == null ) || forceRead ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> map = new HashMap<YCFGenKbGenItemPKey,IYCFGenKbGenItemObj>();
			allGenItem = map;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readAllDerived( schema.getAuthorization() );
			YCFGenKbGenItemBuff buff;
			IYCFGenKbGenItemObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenItemObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenItemObj realised = (IYCFGenKbGenItemObj)obj.realise();
			}
		}
		int len = allGenItem.size();
		IYCFGenKbGenItemObj arr[] = new IYCFGenKbGenItemObj[len];
		Iterator<IYCFGenKbGenItemObj> valIter = allGenItem.values().iterator();
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
		ArrayList<IYCFGenKbGenItemObj> arrayList = new ArrayList<IYCFGenKbGenItemObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenItemObj> cmp = new Comparator<IYCFGenKbGenItemObj>() {
			public int compare( IYCFGenKbGenItemObj lhs, IYCFGenKbGenItemObj rhs ) {
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
		List<IYCFGenKbGenItemObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenItemObj> readCachedAllGenItem() {
		final String S_ProcName = "readCachedAllGenItem";
		ArrayList<IYCFGenKbGenItemObj> arrayList = new ArrayList<IYCFGenKbGenItemObj>();
		if( allGenItem != null ) {
			int len = allGenItem.size();
			IYCFGenKbGenItemObj arr[] = new IYCFGenKbGenItemObj[len];
			Iterator<IYCFGenKbGenItemObj> valIter = allGenItem.values().iterator();
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
		Comparator<IYCFGenKbGenItemObj> cmp = new Comparator<IYCFGenKbGenItemObj>() {
			public int compare( IYCFGenKbGenItemObj lhs, IYCFGenKbGenItemObj rhs ) {
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

	public IYCFGenKbGenItemObj readGenItemByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		return( readGenItemByItemIdIdx( TenantId,
			CartridgeId,
			ItemId,
			false ) );
	}

	public IYCFGenKbGenItemObj readGenItemByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId, boolean forceRead )
	{
		YCFGenKbGenItemPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredCartridgeId( CartridgeId );
		pkey.setRequiredItemId( ItemId );
		IYCFGenKbGenItemObj obj = readGenItem( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbGenItemObj> readGenItemByTenantIdx( long TenantId )
	{
		return( readGenItemByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFGenKbGenItemObj> readGenItemByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenItemByTenantIdx";
		YCFGenKbGenItemByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGenItemByTenantIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenItemObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenItemObj realised = (IYCFGenKbGenItemObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenItemObj arr[] = new IYCFGenKbGenItemObj[len];
		Iterator<IYCFGenKbGenItemObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenItemObj> arrayList = new ArrayList<IYCFGenKbGenItemObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenItemObj> cmp = new Comparator<IYCFGenKbGenItemObj>() {
			public int compare( IYCFGenKbGenItemObj lhs, IYCFGenKbGenItemObj rhs ) {
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
		List<IYCFGenKbGenItemObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenItemObj> readGenItemByCartIdx( long TenantId,
		long CartridgeId )
	{
		return( readGenItemByCartIdx( TenantId,
			CartridgeId,
			false ) );
	}

	public List<IYCFGenKbGenItemObj> readGenItemByCartIdx( long TenantId,
		long CartridgeId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenItemByCartIdx";
		YCFGenKbGenItemByCartIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> dict;
		if( indexByCartIdx == null ) {
			indexByCartIdx = new HashMap< YCFGenKbGenItemByCartIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > >();
		}
		if( ( ! forceRead ) && indexByCartIdx.containsKey( key ) ) {
			dict = indexByCartIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByCartIdx( schema.getAuthorization(),
				TenantId,
				CartridgeId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenItemObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenItemObj realised = (IYCFGenKbGenItemObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByCartIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenItemObj arr[] = new IYCFGenKbGenItemObj[len];
		Iterator<IYCFGenKbGenItemObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenItemObj> arrayList = new ArrayList<IYCFGenKbGenItemObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenItemObj> cmp = new Comparator<IYCFGenKbGenItemObj>() {
			public int compare( IYCFGenKbGenItemObj lhs, IYCFGenKbGenItemObj rhs ) {
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
		List<IYCFGenKbGenItemObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenItemObj> readGenItemByRuleTypeIdx( short RuleTypeId )
	{
		return( readGenItemByRuleTypeIdx( RuleTypeId,
			false ) );
	}

	public List<IYCFGenKbGenItemObj> readGenItemByRuleTypeIdx( short RuleTypeId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenItemByRuleTypeIdx";
		YCFGenKbGenItemByRuleTypeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( RuleTypeId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> dict;
		if( indexByRuleTypeIdx == null ) {
			indexByRuleTypeIdx = new HashMap< YCFGenKbGenItemByRuleTypeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > >();
		}
		if( ( ! forceRead ) && indexByRuleTypeIdx.containsKey( key ) ) {
			dict = indexByRuleTypeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByRuleTypeIdx( schema.getAuthorization(),
				RuleTypeId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenItemObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenItemObj realised = (IYCFGenKbGenItemObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRuleTypeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenItemObj arr[] = new IYCFGenKbGenItemObj[len];
		Iterator<IYCFGenKbGenItemObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenItemObj> arrayList = new ArrayList<IYCFGenKbGenItemObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenItemObj> cmp = new Comparator<IYCFGenKbGenItemObj>() {
			public int compare( IYCFGenKbGenItemObj lhs, IYCFGenKbGenItemObj rhs ) {
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
		List<IYCFGenKbGenItemObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenItemObj> readGenItemByToolSetIdx( short ToolSetId )
	{
		return( readGenItemByToolSetIdx( ToolSetId,
			false ) );
	}

	public List<IYCFGenKbGenItemObj> readGenItemByToolSetIdx( short ToolSetId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenItemByToolSetIdx";
		YCFGenKbGenItemByToolSetIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( ToolSetId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> dict;
		if( indexByToolSetIdx == null ) {
			indexByToolSetIdx = new HashMap< YCFGenKbGenItemByToolSetIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > >();
		}
		if( ( ! forceRead ) && indexByToolSetIdx.containsKey( key ) ) {
			dict = indexByToolSetIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByToolSetIdx( schema.getAuthorization(),
				ToolSetId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenItemObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenItemObj realised = (IYCFGenKbGenItemObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByToolSetIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenItemObj arr[] = new IYCFGenKbGenItemObj[len];
		Iterator<IYCFGenKbGenItemObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenItemObj> arrayList = new ArrayList<IYCFGenKbGenItemObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenItemObj> cmp = new Comparator<IYCFGenKbGenItemObj>() {
			public int compare( IYCFGenKbGenItemObj lhs, IYCFGenKbGenItemObj rhs ) {
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
		List<IYCFGenKbGenItemObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenItemObj> readGenItemByScopeIdx( Short ScopeDefId )
	{
		return( readGenItemByScopeIdx( ScopeDefId,
			false ) );
	}

	public List<IYCFGenKbGenItemObj> readGenItemByScopeIdx( Short ScopeDefId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenItemByScopeIdx";
		YCFGenKbGenItemByScopeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( ScopeDefId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> dict;
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFGenKbGenItemByScopeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > >();
		}
		if( ( ! forceRead ) && indexByScopeIdx.containsKey( key ) ) {
			dict = indexByScopeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByScopeIdx( schema.getAuthorization(),
				ScopeDefId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenItemObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenItemObj realised = (IYCFGenKbGenItemObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenItemObj arr[] = new IYCFGenKbGenItemObj[len];
		Iterator<IYCFGenKbGenItemObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenItemObj> arrayList = new ArrayList<IYCFGenKbGenItemObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenItemObj> cmp = new Comparator<IYCFGenKbGenItemObj>() {
			public int compare( IYCFGenKbGenItemObj lhs, IYCFGenKbGenItemObj rhs ) {
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
		List<IYCFGenKbGenItemObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenItemObj> readGenItemByGenDefIdx( short GenDefId )
	{
		return( readGenItemByGenDefIdx( GenDefId,
			false ) );
	}

	public List<IYCFGenKbGenItemObj> readGenItemByGenDefIdx( short GenDefId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenItemByGenDefIdx";
		YCFGenKbGenItemByGenDefIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( GenDefId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> dict;
		if( indexByGenDefIdx == null ) {
			indexByGenDefIdx = new HashMap< YCFGenKbGenItemByGenDefIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > >();
		}
		if( ( ! forceRead ) && indexByGenDefIdx.containsKey( key ) ) {
			dict = indexByGenDefIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByGenDefIdx( schema.getAuthorization(),
				GenDefId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenItemObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenItemObj realised = (IYCFGenKbGenItemObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGenDefIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenItemObj arr[] = new IYCFGenKbGenItemObj[len];
		Iterator<IYCFGenKbGenItemObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenItemObj> arrayList = new ArrayList<IYCFGenKbGenItemObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenItemObj> cmp = new Comparator<IYCFGenKbGenItemObj>() {
			public int compare( IYCFGenKbGenItemObj lhs, IYCFGenKbGenItemObj rhs ) {
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
		List<IYCFGenKbGenItemObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbGenItemObj readGenItemByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		return( readGenItemByAltIdx( Name,
			ToolSetId,
			ScopeDefId,
			GenDefId,
			false ) );
	}

	public IYCFGenKbGenItemObj readGenItemByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId, boolean forceRead )
	{
		if( indexByAltIdx == null ) {
			indexByAltIdx = new HashMap< YCFGenKbGenItemByAltIdxKey,
				IYCFGenKbGenItemObj >();
		}
		YCFGenKbGenItemByAltIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newAltIdxKey();
		key.setRequiredName( Name );
		key.setRequiredToolSetId( ToolSetId );
		key.setOptionalScopeDefId( ScopeDefId );
		key.setRequiredGenDefId( GenDefId );
		IYCFGenKbGenItemObj obj = null;
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
				obj = (IYCFGenKbGenItemObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbGenItemObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFGenKbGenItemObj> readGenItemByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		return( readGenItemByGelExecIdx( GelExecutableTenantId,
			GelExecutableGelCacheId,
			GelExecutableId,
			false ) );
	}

	public List<IYCFGenKbGenItemObj> readGenItemByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenItemByGelExecIdx";
		YCFGenKbGenItemByGelExecIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( GelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( GelExecutableGelCacheId );
		key.setOptionalGelExecutableId( GelExecutableId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> dict;
		if( indexByGelExecIdx == null ) {
			indexByGelExecIdx = new HashMap< YCFGenKbGenItemByGelExecIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > >();
		}
		if( ( ! forceRead ) && indexByGelExecIdx.containsKey( key ) ) {
			dict = indexByGelExecIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByGelExecIdx( schema.getAuthorization(),
				GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenItemObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenItemObj realised = (IYCFGenKbGenItemObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGelExecIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenItemObj arr[] = new IYCFGenKbGenItemObj[len];
		Iterator<IYCFGenKbGenItemObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenItemObj> arrayList = new ArrayList<IYCFGenKbGenItemObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenItemObj> cmp = new Comparator<IYCFGenKbGenItemObj>() {
			public int compare( IYCFGenKbGenItemObj lhs, IYCFGenKbGenItemObj rhs ) {
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
		List<IYCFGenKbGenItemObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenItemObj> readGenItemByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		return( readGenItemByProbeIdx( ProbeTenantId,
			ProbeCartridgeId,
			ProbeGenItemId,
			false ) );
	}

	public List<IYCFGenKbGenItemObj> readGenItemByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenItemByProbeIdx";
		YCFGenKbGenItemByProbeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( ProbeTenantId );
		key.setOptionalProbeCartridgeId( ProbeCartridgeId );
		key.setOptionalProbeGenItemId( ProbeGenItemId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> dict;
		if( indexByProbeIdx == null ) {
			indexByProbeIdx = new HashMap< YCFGenKbGenItemByProbeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > >();
		}
		if( ( ! forceRead ) && indexByProbeIdx.containsKey( key ) ) {
			dict = indexByProbeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByProbeIdx( schema.getAuthorization(),
				ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenItemObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenItemObj realised = (IYCFGenKbGenItemObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByProbeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenItemObj arr[] = new IYCFGenKbGenItemObj[len];
		Iterator<IYCFGenKbGenItemObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenItemObj> arrayList = new ArrayList<IYCFGenKbGenItemObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenItemObj> cmp = new Comparator<IYCFGenKbGenItemObj>() {
			public int compare( IYCFGenKbGenItemObj lhs, IYCFGenKbGenItemObj rhs ) {
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
		List<IYCFGenKbGenItemObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbGenItemObj readCachedGenItemByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		IYCFGenKbGenItemObj obj = null;
		YCFGenKbGenItemPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredCartridgeId( CartridgeId );
		pkey.setRequiredItemId( ItemId );
		obj = readCachedGenItem( pkey );
		return( obj );
	}

	public List<IYCFGenKbGenItemObj> readCachedGenItemByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedGenItemByTenantIdx";
		YCFGenKbGenItemByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFGenKbGenItemObj> arrayList = new ArrayList<IYCFGenKbGenItemObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenItemObj arr[] = new IYCFGenKbGenItemObj[len];
				Iterator<IYCFGenKbGenItemObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenItemObj obj;
			Iterator<IYCFGenKbGenItemObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenItemObj> cmp = new Comparator<IYCFGenKbGenItemObj>() {
			public int compare( IYCFGenKbGenItemObj lhs, IYCFGenKbGenItemObj rhs ) {
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

	public List<IYCFGenKbGenItemObj> readCachedGenItemByCartIdx( long TenantId,
		long CartridgeId )
	{
		final String S_ProcName = "readCachedGenItemByCartIdx";
		YCFGenKbGenItemByCartIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		ArrayList<IYCFGenKbGenItemObj> arrayList = new ArrayList<IYCFGenKbGenItemObj>();
		if( indexByCartIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> dict;
			if( indexByCartIdx.containsKey( key ) ) {
				dict = indexByCartIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenItemObj arr[] = new IYCFGenKbGenItemObj[len];
				Iterator<IYCFGenKbGenItemObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenItemObj obj;
			Iterator<IYCFGenKbGenItemObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenItemObj> cmp = new Comparator<IYCFGenKbGenItemObj>() {
			public int compare( IYCFGenKbGenItemObj lhs, IYCFGenKbGenItemObj rhs ) {
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

	public List<IYCFGenKbGenItemObj> readCachedGenItemByRuleTypeIdx( short RuleTypeId )
	{
		final String S_ProcName = "readCachedGenItemByRuleTypeIdx";
		YCFGenKbGenItemByRuleTypeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( RuleTypeId );
		ArrayList<IYCFGenKbGenItemObj> arrayList = new ArrayList<IYCFGenKbGenItemObj>();
		if( indexByRuleTypeIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> dict;
			if( indexByRuleTypeIdx.containsKey( key ) ) {
				dict = indexByRuleTypeIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenItemObj arr[] = new IYCFGenKbGenItemObj[len];
				Iterator<IYCFGenKbGenItemObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenItemObj obj;
			Iterator<IYCFGenKbGenItemObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenItemObj> cmp = new Comparator<IYCFGenKbGenItemObj>() {
			public int compare( IYCFGenKbGenItemObj lhs, IYCFGenKbGenItemObj rhs ) {
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

	public List<IYCFGenKbGenItemObj> readCachedGenItemByToolSetIdx( short ToolSetId )
	{
		final String S_ProcName = "readCachedGenItemByToolSetIdx";
		YCFGenKbGenItemByToolSetIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( ToolSetId );
		ArrayList<IYCFGenKbGenItemObj> arrayList = new ArrayList<IYCFGenKbGenItemObj>();
		if( indexByToolSetIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> dict;
			if( indexByToolSetIdx.containsKey( key ) ) {
				dict = indexByToolSetIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenItemObj arr[] = new IYCFGenKbGenItemObj[len];
				Iterator<IYCFGenKbGenItemObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenItemObj obj;
			Iterator<IYCFGenKbGenItemObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenItemObj> cmp = new Comparator<IYCFGenKbGenItemObj>() {
			public int compare( IYCFGenKbGenItemObj lhs, IYCFGenKbGenItemObj rhs ) {
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

	public List<IYCFGenKbGenItemObj> readCachedGenItemByScopeIdx( Short ScopeDefId )
	{
		final String S_ProcName = "readCachedGenItemByScopeIdx";
		YCFGenKbGenItemByScopeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( ScopeDefId );
		ArrayList<IYCFGenKbGenItemObj> arrayList = new ArrayList<IYCFGenKbGenItemObj>();
		if( indexByScopeIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> dict;
			if( indexByScopeIdx.containsKey( key ) ) {
				dict = indexByScopeIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenItemObj arr[] = new IYCFGenKbGenItemObj[len];
				Iterator<IYCFGenKbGenItemObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenItemObj obj;
			Iterator<IYCFGenKbGenItemObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenItemObj> cmp = new Comparator<IYCFGenKbGenItemObj>() {
			public int compare( IYCFGenKbGenItemObj lhs, IYCFGenKbGenItemObj rhs ) {
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

	public List<IYCFGenKbGenItemObj> readCachedGenItemByGenDefIdx( short GenDefId )
	{
		final String S_ProcName = "readCachedGenItemByGenDefIdx";
		YCFGenKbGenItemByGenDefIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( GenDefId );
		ArrayList<IYCFGenKbGenItemObj> arrayList = new ArrayList<IYCFGenKbGenItemObj>();
		if( indexByGenDefIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> dict;
			if( indexByGenDefIdx.containsKey( key ) ) {
				dict = indexByGenDefIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenItemObj arr[] = new IYCFGenKbGenItemObj[len];
				Iterator<IYCFGenKbGenItemObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenItemObj obj;
			Iterator<IYCFGenKbGenItemObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenItemObj> cmp = new Comparator<IYCFGenKbGenItemObj>() {
			public int compare( IYCFGenKbGenItemObj lhs, IYCFGenKbGenItemObj rhs ) {
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

	public IYCFGenKbGenItemObj readCachedGenItemByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		IYCFGenKbGenItemObj obj = null;
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
				Iterator<IYCFGenKbGenItemObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbGenItemObj> valIter = members.values().iterator();
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

	public List<IYCFGenKbGenItemObj> readCachedGenItemByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		final String S_ProcName = "readCachedGenItemByGelExecIdx";
		YCFGenKbGenItemByGelExecIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( GelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( GelExecutableGelCacheId );
		key.setOptionalGelExecutableId( GelExecutableId );
		ArrayList<IYCFGenKbGenItemObj> arrayList = new ArrayList<IYCFGenKbGenItemObj>();
		if( indexByGelExecIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> dict;
			if( indexByGelExecIdx.containsKey( key ) ) {
				dict = indexByGelExecIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenItemObj arr[] = new IYCFGenKbGenItemObj[len];
				Iterator<IYCFGenKbGenItemObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenItemObj obj;
			Iterator<IYCFGenKbGenItemObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenItemObj> cmp = new Comparator<IYCFGenKbGenItemObj>() {
			public int compare( IYCFGenKbGenItemObj lhs, IYCFGenKbGenItemObj rhs ) {
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

	public List<IYCFGenKbGenItemObj> readCachedGenItemByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		final String S_ProcName = "readCachedGenItemByProbeIdx";
		YCFGenKbGenItemByProbeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( ProbeTenantId );
		key.setOptionalProbeCartridgeId( ProbeCartridgeId );
		key.setOptionalProbeGenItemId( ProbeGenItemId );
		ArrayList<IYCFGenKbGenItemObj> arrayList = new ArrayList<IYCFGenKbGenItemObj>();
		if( indexByProbeIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> dict;
			if( indexByProbeIdx.containsKey( key ) ) {
				dict = indexByProbeIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenItemObj arr[] = new IYCFGenKbGenItemObj[len];
				Iterator<IYCFGenKbGenItemObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenItemObj obj;
			Iterator<IYCFGenKbGenItemObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenItemObj> cmp = new Comparator<IYCFGenKbGenItemObj>() {
			public int compare( IYCFGenKbGenItemObj lhs, IYCFGenKbGenItemObj rhs ) {
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

	public void deepDisposeGenItemByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		IYCFGenKbGenItemObj obj = readCachedGenItemByItemIdIdx( TenantId,
				CartridgeId,
				ItemId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGenItemByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeGenItemByTenantIdx";
		IYCFGenKbGenItemObj obj;
		List<IYCFGenKbGenItemObj> arrayList = readCachedGenItemByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenItemObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenItemByCartIdx( long TenantId,
		long CartridgeId )
	{
		final String S_ProcName = "deepDisposeGenItemByCartIdx";
		IYCFGenKbGenItemObj obj;
		List<IYCFGenKbGenItemObj> arrayList = readCachedGenItemByCartIdx( TenantId,
				CartridgeId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenItemObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenItemByRuleTypeIdx( short RuleTypeId )
	{
		final String S_ProcName = "deepDisposeGenItemByRuleTypeIdx";
		IYCFGenKbGenItemObj obj;
		List<IYCFGenKbGenItemObj> arrayList = readCachedGenItemByRuleTypeIdx( RuleTypeId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenItemObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenItemByToolSetIdx( short ToolSetId )
	{
		final String S_ProcName = "deepDisposeGenItemByToolSetIdx";
		IYCFGenKbGenItemObj obj;
		List<IYCFGenKbGenItemObj> arrayList = readCachedGenItemByToolSetIdx( ToolSetId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenItemObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenItemByScopeIdx( Short ScopeDefId )
	{
		final String S_ProcName = "deepDisposeGenItemByScopeIdx";
		IYCFGenKbGenItemObj obj;
		List<IYCFGenKbGenItemObj> arrayList = readCachedGenItemByScopeIdx( ScopeDefId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenItemObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenItemByGenDefIdx( short GenDefId )
	{
		final String S_ProcName = "deepDisposeGenItemByGenDefIdx";
		IYCFGenKbGenItemObj obj;
		List<IYCFGenKbGenItemObj> arrayList = readCachedGenItemByGenDefIdx( GenDefId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenItemObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenItemByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		IYCFGenKbGenItemObj obj = readCachedGenItemByAltIdx( Name,
				ToolSetId,
				ScopeDefId,
				GenDefId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGenItemByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		final String S_ProcName = "deepDisposeGenItemByGelExecIdx";
		IYCFGenKbGenItemObj obj;
		List<IYCFGenKbGenItemObj> arrayList = readCachedGenItemByGelExecIdx( GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenItemObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenItemByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		final String S_ProcName = "deepDisposeGenItemByProbeIdx";
		IYCFGenKbGenItemObj obj;
		List<IYCFGenKbGenItemObj> arrayList = readCachedGenItemByProbeIdx( ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenItemObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFGenKbGenItemObj updateGenItem( IYCFGenKbGenItemObj Obj ) {
		IYCFGenKbGenItemObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().updateGenItem( schema.getAuthorization(),
			Obj.getGenItemBuff() );
		if( Obj.getClassCode().equals( "a920" ) ) {
			obj = (IYCFGenKbGenItemObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteGenItem( IYCFGenKbGenItemObj Obj ) {
		IYCFGenKbGenItemObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().deleteGenItem( schema.getAuthorization(),
			obj.getGenItemBuff() );
		Obj.forget();
	}

	public void deleteGenItemByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		YCFGenKbGenItemPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredCartridgeId( CartridgeId );
		pkey.setRequiredItemId( ItemId );
		IYCFGenKbGenItemObj obj = readGenItem( pkey );
		if( obj != null ) {
			IYCFGenKbGenItemEditObj editObj = (IYCFGenKbGenItemEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbGenItemEditObj)obj.beginEdit();
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
		deepDisposeGenItemByItemIdIdx( TenantId,
				CartridgeId,
				ItemId );
	}

	public void deleteGenItemByTenantIdx( long TenantId )
	{
		YCFGenKbGenItemByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGenItemByTenantIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> dict = indexByTenantIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().deleteGenItemByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFGenKbGenItemObj> iter = dict.values().iterator();
			IYCFGenKbGenItemObj obj;
			List<IYCFGenKbGenItemObj> toForget = new LinkedList<IYCFGenKbGenItemObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().deleteGenItemByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeGenItemByTenantIdx( TenantId );
	}

	public void deleteGenItemByCartIdx( long TenantId,
		long CartridgeId )
	{
		YCFGenKbGenItemByCartIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		if( indexByCartIdx == null ) {
			indexByCartIdx = new HashMap< YCFGenKbGenItemByCartIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > >();
		}
		if( indexByCartIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> dict = indexByCartIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().deleteGenItemByCartIdx( schema.getAuthorization(),
				TenantId,
				CartridgeId );
			Iterator<IYCFGenKbGenItemObj> iter = dict.values().iterator();
			IYCFGenKbGenItemObj obj;
			List<IYCFGenKbGenItemObj> toForget = new LinkedList<IYCFGenKbGenItemObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().deleteGenItemByCartIdx( schema.getAuthorization(),
				TenantId,
				CartridgeId );
		}
		deepDisposeGenItemByCartIdx( TenantId,
				CartridgeId );
	}

	public void deleteGenItemByRuleTypeIdx( short RuleTypeId )
	{
		YCFGenKbGenItemByRuleTypeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( RuleTypeId );
		if( indexByRuleTypeIdx == null ) {
			indexByRuleTypeIdx = new HashMap< YCFGenKbGenItemByRuleTypeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > >();
		}
		if( indexByRuleTypeIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> dict = indexByRuleTypeIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().deleteGenItemByRuleTypeIdx( schema.getAuthorization(),
				RuleTypeId );
			Iterator<IYCFGenKbGenItemObj> iter = dict.values().iterator();
			IYCFGenKbGenItemObj obj;
			List<IYCFGenKbGenItemObj> toForget = new LinkedList<IYCFGenKbGenItemObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().deleteGenItemByRuleTypeIdx( schema.getAuthorization(),
				RuleTypeId );
		}
		deepDisposeGenItemByRuleTypeIdx( RuleTypeId );
	}

	public void deleteGenItemByToolSetIdx( short ToolSetId )
	{
		YCFGenKbGenItemByToolSetIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( ToolSetId );
		if( indexByToolSetIdx == null ) {
			indexByToolSetIdx = new HashMap< YCFGenKbGenItemByToolSetIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > >();
		}
		if( indexByToolSetIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> dict = indexByToolSetIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().deleteGenItemByToolSetIdx( schema.getAuthorization(),
				ToolSetId );
			Iterator<IYCFGenKbGenItemObj> iter = dict.values().iterator();
			IYCFGenKbGenItemObj obj;
			List<IYCFGenKbGenItemObj> toForget = new LinkedList<IYCFGenKbGenItemObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().deleteGenItemByToolSetIdx( schema.getAuthorization(),
				ToolSetId );
		}
		deepDisposeGenItemByToolSetIdx( ToolSetId );
	}

	public void deleteGenItemByScopeIdx( Short ScopeDefId )
	{
		YCFGenKbGenItemByScopeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( ScopeDefId );
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFGenKbGenItemByScopeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > >();
		}
		if( indexByScopeIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> dict = indexByScopeIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().deleteGenItemByScopeIdx( schema.getAuthorization(),
				ScopeDefId );
			Iterator<IYCFGenKbGenItemObj> iter = dict.values().iterator();
			IYCFGenKbGenItemObj obj;
			List<IYCFGenKbGenItemObj> toForget = new LinkedList<IYCFGenKbGenItemObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().deleteGenItemByScopeIdx( schema.getAuthorization(),
				ScopeDefId );
		}
		deepDisposeGenItemByScopeIdx( ScopeDefId );
	}

	public void deleteGenItemByGenDefIdx( short GenDefId )
	{
		YCFGenKbGenItemByGenDefIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( GenDefId );
		if( indexByGenDefIdx == null ) {
			indexByGenDefIdx = new HashMap< YCFGenKbGenItemByGenDefIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > >();
		}
		if( indexByGenDefIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> dict = indexByGenDefIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().deleteGenItemByGenDefIdx( schema.getAuthorization(),
				GenDefId );
			Iterator<IYCFGenKbGenItemObj> iter = dict.values().iterator();
			IYCFGenKbGenItemObj obj;
			List<IYCFGenKbGenItemObj> toForget = new LinkedList<IYCFGenKbGenItemObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().deleteGenItemByGenDefIdx( schema.getAuthorization(),
				GenDefId );
		}
		deepDisposeGenItemByGenDefIdx( GenDefId );
	}

	public void deleteGenItemByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		if( indexByAltIdx == null ) {
			indexByAltIdx = new HashMap< YCFGenKbGenItemByAltIdxKey,
				IYCFGenKbGenItemObj >();
		}
		YCFGenKbGenItemByAltIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newAltIdxKey();
		key.setRequiredName( Name );
		key.setRequiredToolSetId( ToolSetId );
		key.setOptionalScopeDefId( ScopeDefId );
		key.setRequiredGenDefId( GenDefId );
		IYCFGenKbGenItemObj obj = null;
		if( indexByAltIdx.containsKey( key ) ) {
			obj = indexByAltIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().deleteGenItemByAltIdx( schema.getAuthorization(),
				Name,
				ToolSetId,
				ScopeDefId,
				GenDefId );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().deleteGenItemByAltIdx( schema.getAuthorization(),
				Name,
				ToolSetId,
				ScopeDefId,
				GenDefId );
		}
		deepDisposeGenItemByAltIdx( Name,
				ToolSetId,
				ScopeDefId,
				GenDefId );
	}

	public void deleteGenItemByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		YCFGenKbGenItemByGelExecIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( GelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( GelExecutableGelCacheId );
		key.setOptionalGelExecutableId( GelExecutableId );
		if( indexByGelExecIdx == null ) {
			indexByGelExecIdx = new HashMap< YCFGenKbGenItemByGelExecIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > >();
		}
		if( indexByGelExecIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> dict = indexByGelExecIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().deleteGenItemByGelExecIdx( schema.getAuthorization(),
				GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
			Iterator<IYCFGenKbGenItemObj> iter = dict.values().iterator();
			IYCFGenKbGenItemObj obj;
			List<IYCFGenKbGenItemObj> toForget = new LinkedList<IYCFGenKbGenItemObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().deleteGenItemByGelExecIdx( schema.getAuthorization(),
				GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
		}
		deepDisposeGenItemByGelExecIdx( GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
	}

	public void deleteGenItemByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		YCFGenKbGenItemByProbeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( ProbeTenantId );
		key.setOptionalProbeCartridgeId( ProbeCartridgeId );
		key.setOptionalProbeGenItemId( ProbeGenItemId );
		if( indexByProbeIdx == null ) {
			indexByProbeIdx = new HashMap< YCFGenKbGenItemByProbeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenItemObj > >();
		}
		if( indexByProbeIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenItemObj> dict = indexByProbeIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().deleteGenItemByProbeIdx( schema.getAuthorization(),
				ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
			Iterator<IYCFGenKbGenItemObj> iter = dict.values().iterator();
			IYCFGenKbGenItemObj obj;
			List<IYCFGenKbGenItemObj> toForget = new LinkedList<IYCFGenKbGenItemObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().deleteGenItemByProbeIdx( schema.getAuthorization(),
				ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
		}
		deepDisposeGenItemByProbeIdx( ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
	}
}
