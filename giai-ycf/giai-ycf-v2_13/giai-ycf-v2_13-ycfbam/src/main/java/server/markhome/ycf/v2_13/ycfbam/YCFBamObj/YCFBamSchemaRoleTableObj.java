// Description: Java 11 Table Object implementation for YCFBam.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFBam.
 *	
 *	Mark's Code Fractal YCFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the GPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-GPLv3-compatibly licensed code. You may not
 *	implement an LPGLv3 "wedge" to try to bypass this restriction. That said, code which
 *	does not rely on this library is free to specify whatever license its authors decide
 *	to use. Mark Sobkow specifically rejects the infectious nature of the GPLv3, and
 *	considers the mere act of including GPLv3 modules in an executable to be perfectly
 *	reasonable given tools like modern Java's single-jar deployment options.
 *	
 *	Mark's Code Fractal YCFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal YCFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal YCFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;

public class YCFBamSchemaRoleTableObj
	implements IYCFBamSchemaRoleTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj> members;
	private Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj> allSchemaRole;
	private Map< YCFBamRoleDefByUNameIdxKey,
		IYCFBamSchemaRoleObj > indexByUNameIdx;
	private Map< YCFBamRoleDefByUDefIdxKey,
		IYCFBamSchemaRoleObj > indexByUDefIdx;
	private Map< YCFBamRoleDefByRoleDefTentIdxKey,
		Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > > indexByRoleDefTentIdx;
	private Map< YCFBamRoleDefByScopeIdxKey,
		Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > > indexByScopeIdx;
	private Map< YCFBamRoleDefByDefSchemaIdxKey,
		Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > > indexByDefSchemaIdx;
	private Map< YCFBamSchemaRoleBySchemaIdxKey,
		Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > > indexBySchemaIdx;
	private Map< YCFBamSchemaRoleByRoleScopeIdxKey,
		Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > > indexByRoleScopeIdx;
	private Map< YCFBamSchemaRoleBySchRoleScpIdxKey,
		Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > > indexBySchRoleScpIdx;
	public static String TABLE_NAME = "SchemaRole";
	public static String TABLE_DBNAME = "schrole";

	public YCFBamSchemaRoleTableObj() {
		schema = null;
		members = new HashMap<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj>();
		allSchemaRole = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByRoleDefTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
		indexBySchemaIdx = null;
		indexByRoleScopeIdx = null;
		indexBySchRoleScpIdx = null;
	}

	public YCFBamSchemaRoleTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj>();
		allSchemaRole = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByRoleDefTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
		indexBySchemaIdx = null;
		indexByRoleScopeIdx = null;
		indexBySchRoleScpIdx = null;
	}

	public IYCFBamSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFBamSchemaObj value ) {
		schema = (IYCFBamSchemaObj)value;
	}

	public String getTableName() {
		return( TABLE_NAME );
	}

	public String getTableDbName() {
		return( TABLE_DBNAME );
	}

	public Class getObjQualifyingClass() {
		return( IYCFBamSchemaDefObj.class );
	}


	public void minimizeMemory() {
		allSchemaRole = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByRoleDefTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
		indexBySchemaIdx = null;
		indexByRoleScopeIdx = null;
		indexBySchRoleScpIdx = null;
		List<IYCFBamSchemaRoleObj> toForget = new LinkedList<IYCFBamSchemaRoleObj>();
		IYCFBamSchemaRoleObj cur = null;
		Iterator<IYCFBamSchemaRoleObj> iter = members.values().iterator();
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
	 *	YCFBamSchemaRoleObj.
	 */
	public IYCFBamSchemaRoleObj newInstance() {
		IYCFBamSchemaRoleObj inst = new YCFBamSchemaRoleObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamSchemaRoleObj.
	 */
	public IYCFBamSchemaRoleEditObj newEditInstance( IYCFBamSchemaRoleObj orig ) {
		IYCFBamSchemaRoleEditObj edit = new YCFBamSchemaRoleEditObj( orig );
		return( edit );
	}

	public IYCFBamSchemaRoleObj realiseSchemaRole( IYCFBamSchemaRoleObj Obj ) {
		IYCFBamSchemaRoleObj obj = Obj;
		YCFBamRoleDefPKey pkey = obj.getPKey();
		IYCFBamSchemaRoleObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamSchemaRoleObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByUNameIdx != null ) {
				YCFBamRoleDefByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByUDefIdx != null ) {
				YCFBamRoleDefByUDefIdxKey keyUDefIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
				keyUDefIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUDefIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUDefIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyUDefIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				keyUDefIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUDefIdx.remove( keyUDefIdx );
			}

			if( indexByRoleDefTentIdx != null ) {
				YCFBamRoleDefByRoleDefTentIdxKey keyRoleDefTentIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
				keyRoleDefTentIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > mapRoleDefTentIdx = indexByRoleDefTentIdx.get( keyRoleDefTentIdx );
				if( mapRoleDefTentIdx != null ) {
					indexByRoleDefTentIdx.remove( keyRoleDefTentIdx );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamRoleDefByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					indexByScopeIdx.remove( keyScopeIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamRoleDefByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexBySchemaIdx != null ) {
				YCFBamSchemaRoleBySchemaIdxKey keySchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					mapSchemaIdx.remove( keepObj.getPKey() );
					if( mapSchemaIdx.size() <= 0 ) {
						indexBySchemaIdx.remove( keySchemaIdx );
					}
				}
			}

			if( indexByRoleScopeIdx != null ) {
				YCFBamSchemaRoleByRoleScopeIdxKey keyRoleScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newRoleScopeIdxKey();
				keyRoleScopeIdx.setRequiredRoleScope( keepObj.getRequiredRoleScope() );
				Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > mapRoleScopeIdx = indexByRoleScopeIdx.get( keyRoleScopeIdx );
				if( mapRoleScopeIdx != null ) {
					mapRoleScopeIdx.remove( keepObj.getPKey() );
					if( mapRoleScopeIdx.size() <= 0 ) {
						indexByRoleScopeIdx.remove( keyRoleScopeIdx );
					}
				}
			}

			if( indexBySchRoleScpIdx != null ) {
				YCFBamSchemaRoleBySchRoleScpIdxKey keySchRoleScpIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchRoleScpIdxKey();
				keySchRoleScpIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchRoleScpIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				keySchRoleScpIdx.setRequiredRoleScope( keepObj.getRequiredRoleScope() );
				Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > mapSchRoleScpIdx = indexBySchRoleScpIdx.get( keySchRoleScpIdx );
				if( mapSchRoleScpIdx != null ) {
					mapSchRoleScpIdx.remove( keepObj.getPKey() );
					if( mapSchRoleScpIdx.size() <= 0 ) {
						indexBySchRoleScpIdx.remove( keySchRoleScpIdx );
					}
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFBamSchemaRoleObj)schema.getRoleDefTableObj().realiseRoleDef( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByUNameIdx != null ) {
				YCFBamRoleDefByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByUDefIdx != null ) {
				YCFBamRoleDefByUDefIdxKey keyUDefIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
				keyUDefIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUDefIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUDefIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyUDefIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				keyUDefIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUDefIdx.put( keyUDefIdx, keepObj );
			}

			if( indexByRoleDefTentIdx != null ) {
				YCFBamRoleDefByRoleDefTentIdxKey keyRoleDefTentIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
				keyRoleDefTentIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > mapRoleDefTentIdx = indexByRoleDefTentIdx.get( keyRoleDefTentIdx );
				if( mapRoleDefTentIdx != null ) {
					mapRoleDefTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamRoleDefByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamRoleDefByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaIdx != null ) {
				YCFBamSchemaRoleBySchemaIdxKey keySchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					mapSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRoleScopeIdx != null ) {
				YCFBamSchemaRoleByRoleScopeIdxKey keyRoleScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newRoleScopeIdxKey();
				keyRoleScopeIdx.setRequiredRoleScope( keepObj.getRequiredRoleScope() );
				Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > mapRoleScopeIdx = indexByRoleScopeIdx.get( keyRoleScopeIdx );
				if( mapRoleScopeIdx != null ) {
					mapRoleScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchRoleScpIdx != null ) {
				YCFBamSchemaRoleBySchRoleScpIdxKey keySchRoleScpIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchRoleScpIdxKey();
				keySchRoleScpIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchRoleScpIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				keySchRoleScpIdx.setRequiredRoleScope( keepObj.getRequiredRoleScope() );
				Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > mapSchRoleScpIdx = indexBySchRoleScpIdx.get( keySchRoleScpIdx );
				if( mapSchRoleScpIdx != null ) {
					mapSchRoleScpIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allSchemaRole != null ) {
				allSchemaRole.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamSchemaRoleObj)schema.getRoleDefTableObj().realiseRoleDef( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSchemaRole != null ) {
				allSchemaRole.put( keepObj.getPKey(), keepObj );
			}

			if( indexByUNameIdx != null ) {
				YCFBamRoleDefByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByUDefIdx != null ) {
				YCFBamRoleDefByUDefIdxKey keyUDefIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
				keyUDefIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUDefIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUDefIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyUDefIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				keyUDefIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUDefIdx.put( keyUDefIdx, keepObj );
			}

			if( indexByRoleDefTentIdx != null ) {
				YCFBamRoleDefByRoleDefTentIdxKey keyRoleDefTentIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
				keyRoleDefTentIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > mapRoleDefTentIdx = indexByRoleDefTentIdx.get( keyRoleDefTentIdx );
				if( mapRoleDefTentIdx != null ) {
					mapRoleDefTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamRoleDefByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamRoleDefByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaIdx != null ) {
				YCFBamSchemaRoleBySchemaIdxKey keySchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					mapSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRoleScopeIdx != null ) {
				YCFBamSchemaRoleByRoleScopeIdxKey keyRoleScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newRoleScopeIdxKey();
				keyRoleScopeIdx.setRequiredRoleScope( keepObj.getRequiredRoleScope() );
				Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > mapRoleScopeIdx = indexByRoleScopeIdx.get( keyRoleScopeIdx );
				if( mapRoleScopeIdx != null ) {
					mapRoleScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchRoleScpIdx != null ) {
				YCFBamSchemaRoleBySchRoleScpIdxKey keySchRoleScpIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchRoleScpIdxKey();
				keySchRoleScpIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchRoleScpIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				keySchRoleScpIdx.setRequiredRoleScope( keepObj.getRequiredRoleScope() );
				Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > mapSchRoleScpIdx = indexBySchRoleScpIdx.get( keySchRoleScpIdx );
				if( mapSchRoleScpIdx != null ) {
					mapSchRoleScpIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamSchemaRoleObj createSchemaRole( IYCFBamSchemaRoleObj Obj ) {
		IYCFBamSchemaRoleObj obj = Obj;
		YCFBamSchemaRoleBuff buff = obj.getSchemaRoleBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRole().createSchemaRole(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a88e" ) ) {
			obj = (IYCFBamSchemaRoleObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamSchemaRoleObj readSchemaRole( YCFBamRoleDefPKey pkey ) {
		return( readSchemaRole( pkey, false ) );
	}

	public IYCFBamSchemaRoleObj readSchemaRole( YCFBamRoleDefPKey pkey, boolean forceRead ) {
		IYCFBamSchemaRoleObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamSchemaRoleBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRole().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamSchemaRoleObj)schema.getRoleDefTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamSchemaRoleObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamSchemaRoleObj readCachedSchemaRole( YCFBamRoleDefPKey pkey ) {
		IYCFBamSchemaRoleObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSchemaRole( IYCFBamSchemaRoleObj obj )
	{
		final String S_ProcName = "YCFBamSchemaRoleTableObj.reallyDeepDisposeSchemaRole() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamRoleDefPKey pkey = obj.getPKey();
		IYCFBamSchemaRoleObj existing = readCachedSchemaRole( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamSchemaRoleBySchemaIdxKey keySchemaIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchemaIdxKey();
		keySchemaIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keySchemaIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );

		YCFBamSchemaRoleByRoleScopeIdxKey keyRoleScopeIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newRoleScopeIdxKey();
		keyRoleScopeIdx.setRequiredRoleScope( existing.getRequiredRoleScope() );

		YCFBamSchemaRoleBySchRoleScpIdxKey keySchRoleScpIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchRoleScpIdxKey();
		keySchRoleScpIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keySchRoleScpIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );
		keySchRoleScpIdx.setRequiredRoleScope( existing.getRequiredRoleScope() );



		if( indexBySchemaIdx != null ) {
			if( indexBySchemaIdx.containsKey( keySchemaIdx ) ) {
				indexBySchemaIdx.get( keySchemaIdx ).remove( pkey );
				if( indexBySchemaIdx.get( keySchemaIdx ).size() <= 0 ) {
					indexBySchemaIdx.remove( keySchemaIdx );
				}
			}
		}

		if( indexByRoleScopeIdx != null ) {
			if( indexByRoleScopeIdx.containsKey( keyRoleScopeIdx ) ) {
				indexByRoleScopeIdx.get( keyRoleScopeIdx ).remove( pkey );
				if( indexByRoleScopeIdx.get( keyRoleScopeIdx ).size() <= 0 ) {
					indexByRoleScopeIdx.remove( keyRoleScopeIdx );
				}
			}
		}

		if( indexBySchRoleScpIdx != null ) {
			if( indexBySchRoleScpIdx.containsKey( keySchRoleScpIdx ) ) {
				indexBySchRoleScpIdx.get( keySchRoleScpIdx ).remove( pkey );
				if( indexBySchRoleScpIdx.get( keySchRoleScpIdx ).size() <= 0 ) {
					indexBySchRoleScpIdx.remove( keySchRoleScpIdx );
				}
			}
		}


		schema.getRoleDefTableObj().reallyDeepDisposeRoleDef( obj );
	}
	public void deepDisposeSchemaRole( YCFBamRoleDefPKey pkey ) {
		IYCFBamSchemaRoleObj obj = readCachedSchemaRole( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamSchemaRoleObj lockSchemaRole( YCFBamRoleDefPKey pkey ) {
		IYCFBamSchemaRoleObj locked = null;
		YCFBamSchemaRoleBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRole().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamSchemaRoleObj)schema.getRoleDefTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamSchemaRoleObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockSchemaRole", pkey );
		}
		return( locked );
	}

	public List<IYCFBamSchemaRoleObj> readAllSchemaRole() {
		return( readAllSchemaRole( false ) );
	}

	public List<IYCFBamSchemaRoleObj> readAllSchemaRole( boolean forceRead ) {
		final String S_ProcName = "readAllSchemaRole";
		if( ( allSchemaRole == null ) || forceRead ) {
			Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj> map = new HashMap<YCFBamRoleDefPKey,IYCFBamSchemaRoleObj>();
			allSchemaRole = map;
			YCFBamSchemaRoleBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRole().readAllDerived( schema.getAuthorization() );
			YCFBamSchemaRoleBuff buff;
			IYCFBamSchemaRoleObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamSchemaRoleObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				IYCFBamSchemaRoleObj realised = (IYCFBamSchemaRoleObj)obj.realise();
			}
		}
		int len = allSchemaRole.size();
		IYCFBamSchemaRoleObj arr[] = new IYCFBamSchemaRoleObj[len];
		Iterator<IYCFBamSchemaRoleObj> valIter = allSchemaRole.values().iterator();
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
		ArrayList<IYCFBamSchemaRoleObj> arrayList = new ArrayList<IYCFBamSchemaRoleObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamSchemaRoleObj> cmp = new Comparator<IYCFBamSchemaRoleObj>() {
			public int compare( IYCFBamSchemaRoleObj lhs, IYCFBamSchemaRoleObj rhs ) {
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
					YCFBamRoleDefPKey lhsPKey = lhs.getPKey();
					YCFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamSchemaRoleObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamSchemaRoleObj> readCachedAllSchemaRole() {
		final String S_ProcName = "readCachedAllSchemaRole";
		ArrayList<IYCFBamSchemaRoleObj> arrayList = new ArrayList<IYCFBamSchemaRoleObj>();
		if( allSchemaRole != null ) {
			int len = allSchemaRole.size();
			IYCFBamSchemaRoleObj arr[] = new IYCFBamSchemaRoleObj[len];
			Iterator<IYCFBamSchemaRoleObj> valIter = allSchemaRole.values().iterator();
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
		Comparator<IYCFBamSchemaRoleObj> cmp = new Comparator<IYCFBamSchemaRoleObj>() {
			public int compare( IYCFBamSchemaRoleObj lhs, IYCFBamSchemaRoleObj rhs ) {
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
					YCFBamRoleDefPKey lhsPKey = lhs.getPKey();
					YCFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFBamSchemaRoleObj readSchemaRoleByIdIdx( long TenantId,
		long Id )
	{
		return( readSchemaRoleByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamSchemaRoleObj readSchemaRoleByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamRoleDefPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamSchemaRoleObj obj = readSchemaRole( pkey, forceRead );
		return( obj );
	}

	public IYCFBamSchemaRoleObj readSchemaRoleByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		return( readSchemaRoleByUNameIdx( TenantId,
			ScopeId,
			Name,
			false ) );
	}

	public IYCFBamSchemaRoleObj readSchemaRoleByUNameIdx( long TenantId,
		long ScopeId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamRoleDefByUNameIdxKey,
				IYCFBamSchemaRoleObj >();
		}
		YCFBamRoleDefByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		IYCFBamSchemaRoleObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamRoleDefBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamSchemaRoleObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamSchemaRoleObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamSchemaRoleObj readSchemaRoleByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		return( readSchemaRoleByUDefIdx( TenantId,
			ScopeId,
			DefSchemaTenantId,
			DefSchemaId,
			Name,
			false ) );
	}

	public IYCFBamSchemaRoleObj readSchemaRoleByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name, boolean forceRead )
	{
		if( indexByUDefIdx == null ) {
			indexByUDefIdx = new HashMap< YCFBamRoleDefByUDefIdxKey,
				IYCFBamSchemaRoleObj >();
		}
		YCFBamRoleDefByUDefIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		key.setRequiredName( Name );
		IYCFBamSchemaRoleObj obj = null;
		if( ( ! forceRead ) && indexByUDefIdx.containsKey( key ) ) {
			obj = indexByUDefIdx.get( key );
		}
		else {
			YCFBamRoleDefBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().readDerivedByUDefIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamSchemaRoleObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamSchemaRoleObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamSchemaRoleObj> readSchemaRoleByRoleDefTentIdx( long TenantId )
	{
		return( readSchemaRoleByRoleDefTentIdx( TenantId,
			false ) );
	}

	public List<IYCFBamSchemaRoleObj> readSchemaRoleByRoleDefTentIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaRoleByRoleDefTentIdx";
		YCFBamRoleDefByRoleDefTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj> dict;
		if( indexByRoleDefTentIdx == null ) {
			indexByRoleDefTentIdx = new HashMap< YCFBamRoleDefByRoleDefTentIdxKey,
				Map< YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > >();
		}
		if( ( ! forceRead ) && indexByRoleDefTentIdx.containsKey( key ) ) {
			dict = indexByRoleDefTentIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj>();
			IYCFBamRoleDefObj obj;
			YCFBamRoleDefBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().readDerivedByRoleDefTentIdx( schema.getAuthorization(),
				TenantId );
			YCFBamRoleDefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamSchemaRoleObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				IYCFBamSchemaRoleObj realised = (IYCFBamSchemaRoleObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRoleDefTentIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamSchemaRoleObj arr[] = new IYCFBamSchemaRoleObj[len];
		Iterator<IYCFBamSchemaRoleObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamSchemaRoleObj> arrayList = new ArrayList<IYCFBamSchemaRoleObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamSchemaRoleObj> cmp = new Comparator<IYCFBamSchemaRoleObj>() {
			public int compare( IYCFBamSchemaRoleObj lhs, IYCFBamSchemaRoleObj rhs ) {
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
					YCFBamRoleDefPKey lhsPKey = lhs.getPKey();
					YCFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamSchemaRoleObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamSchemaRoleObj> readSchemaRoleByScopeIdx( long TenantId,
		long ScopeId )
	{
		return( readSchemaRoleByScopeIdx( TenantId,
			ScopeId,
			false ) );
	}

	public List<IYCFBamSchemaRoleObj> readSchemaRoleByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaRoleByScopeIdx";
		YCFBamRoleDefByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj> dict;
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFBamRoleDefByScopeIdxKey,
				Map< YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > >();
		}
		if( ( ! forceRead ) && indexByScopeIdx.containsKey( key ) ) {
			dict = indexByScopeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj>();
			IYCFBamRoleDefObj obj;
			YCFBamRoleDefBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().readDerivedByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			YCFBamRoleDefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamSchemaRoleObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				IYCFBamSchemaRoleObj realised = (IYCFBamSchemaRoleObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamSchemaRoleObj arr[] = new IYCFBamSchemaRoleObj[len];
		Iterator<IYCFBamSchemaRoleObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamSchemaRoleObj> arrayList = new ArrayList<IYCFBamSchemaRoleObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamSchemaRoleObj> cmp = new Comparator<IYCFBamSchemaRoleObj>() {
			public int compare( IYCFBamSchemaRoleObj lhs, IYCFBamSchemaRoleObj rhs ) {
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
					YCFBamRoleDefPKey lhsPKey = lhs.getPKey();
					YCFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamSchemaRoleObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamSchemaRoleObj> readSchemaRoleByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readSchemaRoleByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamSchemaRoleObj> readSchemaRoleByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaRoleByDefSchemaIdx";
		YCFBamRoleDefByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamRoleDefByDefSchemaIdxKey,
				Map< YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj>();
			IYCFBamRoleDefObj obj;
			YCFBamRoleDefBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamRoleDefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamSchemaRoleObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				IYCFBamSchemaRoleObj realised = (IYCFBamSchemaRoleObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamSchemaRoleObj arr[] = new IYCFBamSchemaRoleObj[len];
		Iterator<IYCFBamSchemaRoleObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamSchemaRoleObj> arrayList = new ArrayList<IYCFBamSchemaRoleObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamSchemaRoleObj> cmp = new Comparator<IYCFBamSchemaRoleObj>() {
			public int compare( IYCFBamSchemaRoleObj lhs, IYCFBamSchemaRoleObj rhs ) {
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
					YCFBamRoleDefPKey lhsPKey = lhs.getPKey();
					YCFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamSchemaRoleObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamSchemaRoleObj> readSchemaRoleBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		return( readSchemaRoleBySchemaIdx( TenantId,
			SchemaDefId,
			false ) );
	}

	public List<IYCFBamSchemaRoleObj> readSchemaRoleBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaRoleBySchemaIdx";
		YCFBamSchemaRoleBySchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj> dict;
		if( indexBySchemaIdx == null ) {
			indexBySchemaIdx = new HashMap< YCFBamSchemaRoleBySchemaIdxKey,
				Map< YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > >();
		}
		if( ( ! forceRead ) && indexBySchemaIdx.containsKey( key ) ) {
			dict = indexBySchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj>();
			IYCFBamSchemaRoleObj obj;
			YCFBamSchemaRoleBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRole().readDerivedBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
			YCFBamSchemaRoleBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamSchemaRoleObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				IYCFBamSchemaRoleObj realised = (IYCFBamSchemaRoleObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamSchemaRoleObj arr[] = new IYCFBamSchemaRoleObj[len];
		Iterator<IYCFBamSchemaRoleObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamSchemaRoleObj> arrayList = new ArrayList<IYCFBamSchemaRoleObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamSchemaRoleObj> cmp = new Comparator<IYCFBamSchemaRoleObj>() {
			public int compare( IYCFBamSchemaRoleObj lhs, IYCFBamSchemaRoleObj rhs ) {
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
					YCFBamRoleDefPKey lhsPKey = lhs.getPKey();
					YCFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamSchemaRoleObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamSchemaRoleObj> readSchemaRoleByRoleScopeIdx( IYCFBamSchema.RoleScopeEnum RoleScope )
	{
		return( readSchemaRoleByRoleScopeIdx( RoleScope,
			false ) );
	}

	public List<IYCFBamSchemaRoleObj> readSchemaRoleByRoleScopeIdx( IYCFBamSchema.RoleScopeEnum RoleScope,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaRoleByRoleScopeIdx";
		YCFBamSchemaRoleByRoleScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newRoleScopeIdxKey();
		key.setRequiredRoleScope( RoleScope );
		Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj> dict;
		if( indexByRoleScopeIdx == null ) {
			indexByRoleScopeIdx = new HashMap< YCFBamSchemaRoleByRoleScopeIdxKey,
				Map< YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > >();
		}
		if( ( ! forceRead ) && indexByRoleScopeIdx.containsKey( key ) ) {
			dict = indexByRoleScopeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj>();
			IYCFBamSchemaRoleObj obj;
			YCFBamSchemaRoleBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRole().readDerivedByRoleScopeIdx( schema.getAuthorization(),
				RoleScope );
			YCFBamSchemaRoleBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamSchemaRoleObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				IYCFBamSchemaRoleObj realised = (IYCFBamSchemaRoleObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRoleScopeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamSchemaRoleObj arr[] = new IYCFBamSchemaRoleObj[len];
		Iterator<IYCFBamSchemaRoleObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamSchemaRoleObj> arrayList = new ArrayList<IYCFBamSchemaRoleObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamSchemaRoleObj> cmp = new Comparator<IYCFBamSchemaRoleObj>() {
			public int compare( IYCFBamSchemaRoleObj lhs, IYCFBamSchemaRoleObj rhs ) {
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
					YCFBamRoleDefPKey lhsPKey = lhs.getPKey();
					YCFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamSchemaRoleObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamSchemaRoleObj> readSchemaRoleBySchRoleScpIdx( long TenantId,
		long SchemaDefId,
		IYCFBamSchema.RoleScopeEnum RoleScope )
	{
		return( readSchemaRoleBySchRoleScpIdx( TenantId,
			SchemaDefId,
			RoleScope,
			false ) );
	}

	public List<IYCFBamSchemaRoleObj> readSchemaRoleBySchRoleScpIdx( long TenantId,
		long SchemaDefId,
		IYCFBamSchema.RoleScopeEnum RoleScope,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaRoleBySchRoleScpIdx";
		YCFBamSchemaRoleBySchRoleScpIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchRoleScpIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredRoleScope( RoleScope );
		Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj> dict;
		if( indexBySchRoleScpIdx == null ) {
			indexBySchRoleScpIdx = new HashMap< YCFBamSchemaRoleBySchRoleScpIdxKey,
				Map< YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > >();
		}
		if( ( ! forceRead ) && indexBySchRoleScpIdx.containsKey( key ) ) {
			dict = indexBySchRoleScpIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj>();
			IYCFBamSchemaRoleObj obj;
			YCFBamSchemaRoleBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRole().readDerivedBySchRoleScpIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId,
				RoleScope );
			YCFBamSchemaRoleBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamSchemaRoleObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				IYCFBamSchemaRoleObj realised = (IYCFBamSchemaRoleObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySchRoleScpIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamSchemaRoleObj arr[] = new IYCFBamSchemaRoleObj[len];
		Iterator<IYCFBamSchemaRoleObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamSchemaRoleObj> arrayList = new ArrayList<IYCFBamSchemaRoleObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamSchemaRoleObj> cmp = new Comparator<IYCFBamSchemaRoleObj>() {
			public int compare( IYCFBamSchemaRoleObj lhs, IYCFBamSchemaRoleObj rhs ) {
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
					YCFBamRoleDefPKey lhsPKey = lhs.getPKey();
					YCFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamSchemaRoleObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamSchemaRoleObj readCachedSchemaRoleByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamSchemaRoleObj obj = null;
		YCFBamRoleDefPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedSchemaRole( pkey );
		return( obj );
	}

	public IYCFBamSchemaRoleObj readCachedSchemaRoleByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		IYCFBamSchemaRoleObj obj = null;
		YCFBamRoleDefByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamSchemaRoleObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamSchemaRoleObj> valIter = members.values().iterator();
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

	public IYCFBamSchemaRoleObj readCachedSchemaRoleByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		IYCFBamSchemaRoleObj obj = null;
		YCFBamRoleDefByUDefIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		key.setRequiredName( Name );
		if( indexByUDefIdx != null ) {
			if( indexByUDefIdx.containsKey( key ) ) {
				obj = indexByUDefIdx.get( key );
			}
			else {
				Iterator<IYCFBamSchemaRoleObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamSchemaRoleObj> valIter = members.values().iterator();
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

	public List<IYCFBamSchemaRoleObj> readCachedSchemaRoleByRoleDefTentIdx( long TenantId )
	{
		final String S_ProcName = "readCachedSchemaRoleByRoleDefTentIdx";
		YCFBamRoleDefByRoleDefTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamSchemaRoleObj> arrayList = new ArrayList<IYCFBamSchemaRoleObj>();
		if( indexByRoleDefTentIdx != null ) {
			Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj> dict;
			if( indexByRoleDefTentIdx.containsKey( key ) ) {
				dict = indexByRoleDefTentIdx.get( key );
				int len = dict.size();
				IYCFBamSchemaRoleObj arr[] = new IYCFBamSchemaRoleObj[len];
				Iterator<IYCFBamSchemaRoleObj> valIter = dict.values().iterator();
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
			IYCFBamSchemaRoleObj obj;
			Iterator<IYCFBamSchemaRoleObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamSchemaRoleObj> cmp = new Comparator<IYCFBamSchemaRoleObj>() {
			public int compare( IYCFBamSchemaRoleObj lhs, IYCFBamSchemaRoleObj rhs ) {
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
					YCFBamRoleDefPKey lhsPKey = lhs.getPKey();
					YCFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamSchemaRoleObj> readCachedSchemaRoleByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "readCachedSchemaRoleByScopeIdx";
		YCFBamRoleDefByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		ArrayList<IYCFBamSchemaRoleObj> arrayList = new ArrayList<IYCFBamSchemaRoleObj>();
		if( indexByScopeIdx != null ) {
			Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj> dict;
			if( indexByScopeIdx.containsKey( key ) ) {
				dict = indexByScopeIdx.get( key );
				int len = dict.size();
				IYCFBamSchemaRoleObj arr[] = new IYCFBamSchemaRoleObj[len];
				Iterator<IYCFBamSchemaRoleObj> valIter = dict.values().iterator();
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
			IYCFBamSchemaRoleObj obj;
			Iterator<IYCFBamSchemaRoleObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamSchemaRoleObj> cmp = new Comparator<IYCFBamSchemaRoleObj>() {
			public int compare( IYCFBamSchemaRoleObj lhs, IYCFBamSchemaRoleObj rhs ) {
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
					YCFBamRoleDefPKey lhsPKey = lhs.getPKey();
					YCFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamSchemaRoleObj> readCachedSchemaRoleByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedSchemaRoleByDefSchemaIdx";
		YCFBamRoleDefByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamSchemaRoleObj> arrayList = new ArrayList<IYCFBamSchemaRoleObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamSchemaRoleObj arr[] = new IYCFBamSchemaRoleObj[len];
				Iterator<IYCFBamSchemaRoleObj> valIter = dict.values().iterator();
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
			IYCFBamSchemaRoleObj obj;
			Iterator<IYCFBamSchemaRoleObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamSchemaRoleObj> cmp = new Comparator<IYCFBamSchemaRoleObj>() {
			public int compare( IYCFBamSchemaRoleObj lhs, IYCFBamSchemaRoleObj rhs ) {
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
					YCFBamRoleDefPKey lhsPKey = lhs.getPKey();
					YCFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamSchemaRoleObj> readCachedSchemaRoleBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		final String S_ProcName = "readCachedSchemaRoleBySchemaIdx";
		YCFBamSchemaRoleBySchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		ArrayList<IYCFBamSchemaRoleObj> arrayList = new ArrayList<IYCFBamSchemaRoleObj>();
		if( indexBySchemaIdx != null ) {
			Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj> dict;
			if( indexBySchemaIdx.containsKey( key ) ) {
				dict = indexBySchemaIdx.get( key );
				int len = dict.size();
				IYCFBamSchemaRoleObj arr[] = new IYCFBamSchemaRoleObj[len];
				Iterator<IYCFBamSchemaRoleObj> valIter = dict.values().iterator();
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
			IYCFBamSchemaRoleObj obj;
			Iterator<IYCFBamSchemaRoleObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamSchemaRoleObj> cmp = new Comparator<IYCFBamSchemaRoleObj>() {
			public int compare( IYCFBamSchemaRoleObj lhs, IYCFBamSchemaRoleObj rhs ) {
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
					YCFBamRoleDefPKey lhsPKey = lhs.getPKey();
					YCFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamSchemaRoleObj> readCachedSchemaRoleByRoleScopeIdx( IYCFBamSchema.RoleScopeEnum RoleScope )
	{
		final String S_ProcName = "readCachedSchemaRoleByRoleScopeIdx";
		YCFBamSchemaRoleByRoleScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newRoleScopeIdxKey();
		key.setRequiredRoleScope( RoleScope );
		ArrayList<IYCFBamSchemaRoleObj> arrayList = new ArrayList<IYCFBamSchemaRoleObj>();
		if( indexByRoleScopeIdx != null ) {
			Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj> dict;
			if( indexByRoleScopeIdx.containsKey( key ) ) {
				dict = indexByRoleScopeIdx.get( key );
				int len = dict.size();
				IYCFBamSchemaRoleObj arr[] = new IYCFBamSchemaRoleObj[len];
				Iterator<IYCFBamSchemaRoleObj> valIter = dict.values().iterator();
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
			IYCFBamSchemaRoleObj obj;
			Iterator<IYCFBamSchemaRoleObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamSchemaRoleObj> cmp = new Comparator<IYCFBamSchemaRoleObj>() {
			public int compare( IYCFBamSchemaRoleObj lhs, IYCFBamSchemaRoleObj rhs ) {
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
					YCFBamRoleDefPKey lhsPKey = lhs.getPKey();
					YCFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamSchemaRoleObj> readCachedSchemaRoleBySchRoleScpIdx( long TenantId,
		long SchemaDefId,
		IYCFBamSchema.RoleScopeEnum RoleScope )
	{
		final String S_ProcName = "readCachedSchemaRoleBySchRoleScpIdx";
		YCFBamSchemaRoleBySchRoleScpIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchRoleScpIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredRoleScope( RoleScope );
		ArrayList<IYCFBamSchemaRoleObj> arrayList = new ArrayList<IYCFBamSchemaRoleObj>();
		if( indexBySchRoleScpIdx != null ) {
			Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj> dict;
			if( indexBySchRoleScpIdx.containsKey( key ) ) {
				dict = indexBySchRoleScpIdx.get( key );
				int len = dict.size();
				IYCFBamSchemaRoleObj arr[] = new IYCFBamSchemaRoleObj[len];
				Iterator<IYCFBamSchemaRoleObj> valIter = dict.values().iterator();
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
			IYCFBamSchemaRoleObj obj;
			Iterator<IYCFBamSchemaRoleObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamSchemaRoleObj> cmp = new Comparator<IYCFBamSchemaRoleObj>() {
			public int compare( IYCFBamSchemaRoleObj lhs, IYCFBamSchemaRoleObj rhs ) {
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
					YCFBamRoleDefPKey lhsPKey = lhs.getPKey();
					YCFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeSchemaRoleByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamSchemaRoleObj obj = readCachedSchemaRoleByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSchemaRoleByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		IYCFBamSchemaRoleObj obj = readCachedSchemaRoleByUNameIdx( TenantId,
				ScopeId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSchemaRoleByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		IYCFBamSchemaRoleObj obj = readCachedSchemaRoleByUDefIdx( TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSchemaRoleByRoleDefTentIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeSchemaRoleByRoleDefTentIdx";
		IYCFBamSchemaRoleObj obj;
		List<IYCFBamSchemaRoleObj> arrayList = readCachedSchemaRoleByRoleDefTentIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamSchemaRoleObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSchemaRoleByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "deepDisposeSchemaRoleByScopeIdx";
		IYCFBamSchemaRoleObj obj;
		List<IYCFBamSchemaRoleObj> arrayList = readCachedSchemaRoleByScopeIdx( TenantId,
				ScopeId );
		if( arrayList != null )  {
			Iterator<IYCFBamSchemaRoleObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSchemaRoleByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeSchemaRoleByDefSchemaIdx";
		IYCFBamSchemaRoleObj obj;
		List<IYCFBamSchemaRoleObj> arrayList = readCachedSchemaRoleByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamSchemaRoleObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSchemaRoleBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		final String S_ProcName = "deepDisposeSchemaRoleBySchemaIdx";
		IYCFBamSchemaRoleObj obj;
		List<IYCFBamSchemaRoleObj> arrayList = readCachedSchemaRoleBySchemaIdx( TenantId,
				SchemaDefId );
		if( arrayList != null )  {
			Iterator<IYCFBamSchemaRoleObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSchemaRoleByRoleScopeIdx( IYCFBamSchema.RoleScopeEnum RoleScope )
	{
		final String S_ProcName = "deepDisposeSchemaRoleByRoleScopeIdx";
		IYCFBamSchemaRoleObj obj;
		List<IYCFBamSchemaRoleObj> arrayList = readCachedSchemaRoleByRoleScopeIdx( RoleScope );
		if( arrayList != null )  {
			Iterator<IYCFBamSchemaRoleObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSchemaRoleBySchRoleScpIdx( long TenantId,
		long SchemaDefId,
		IYCFBamSchema.RoleScopeEnum RoleScope )
	{
		final String S_ProcName = "deepDisposeSchemaRoleBySchRoleScpIdx";
		IYCFBamSchemaRoleObj obj;
		List<IYCFBamSchemaRoleObj> arrayList = readCachedSchemaRoleBySchRoleScpIdx( TenantId,
				SchemaDefId,
				RoleScope );
		if( arrayList != null )  {
			Iterator<IYCFBamSchemaRoleObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamSchemaRoleObj updateSchemaRole( IYCFBamSchemaRoleObj Obj ) {
		IYCFBamSchemaRoleObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRole().updateSchemaRole( schema.getAuthorization(),
			Obj.getSchemaRoleBuff() );
		if( Obj.getClassCode().equals( "a88e" ) ) {
			obj = (IYCFBamSchemaRoleObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteSchemaRole( IYCFBamSchemaRoleObj Obj ) {
		IYCFBamSchemaRoleObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRole( schema.getAuthorization(),
			obj.getSchemaRoleBuff() );
		Obj.forget();
	}

	public void deleteSchemaRoleByIdIdx( long TenantId,
		long Id )
	{
		YCFBamRoleDefPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamSchemaRoleObj obj = readSchemaRole( pkey );
		if( obj != null ) {
			IYCFBamSchemaRoleEditObj editObj = (IYCFBamSchemaRoleEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamSchemaRoleEditObj)obj.beginEdit();
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
		deepDisposeSchemaRoleByIdIdx( TenantId,
				Id );
	}

	public void deleteSchemaRoleByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamRoleDefByUNameIdxKey,
				IYCFBamSchemaRoleObj >();
		}
		YCFBamRoleDefByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		IYCFBamSchemaRoleObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
		}
		deepDisposeSchemaRoleByUNameIdx( TenantId,
				ScopeId,
				Name );
	}

	public void deleteSchemaRoleByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		if( indexByUDefIdx == null ) {
			indexByUDefIdx = new HashMap< YCFBamRoleDefByUDefIdxKey,
				IYCFBamSchemaRoleObj >();
		}
		YCFBamRoleDefByUDefIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		key.setRequiredName( Name );
		IYCFBamSchemaRoleObj obj = null;
		if( indexByUDefIdx.containsKey( key ) ) {
			obj = indexByUDefIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleByUDefIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleByUDefIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
		}
		deepDisposeSchemaRoleByUDefIdx( TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
	}

	public void deleteSchemaRoleByRoleDefTentIdx( long TenantId )
	{
		YCFBamRoleDefByRoleDefTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByRoleDefTentIdx == null ) {
			indexByRoleDefTentIdx = new HashMap< YCFBamRoleDefByRoleDefTentIdxKey,
				Map< YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > >();
		}
		if( indexByRoleDefTentIdx.containsKey( key ) ) {
			Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj> dict = indexByRoleDefTentIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleByRoleDefTentIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamSchemaRoleObj> iter = dict.values().iterator();
			IYCFBamSchemaRoleObj obj;
			List<IYCFBamSchemaRoleObj> toForget = new LinkedList<IYCFBamSchemaRoleObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByRoleDefTentIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleByRoleDefTentIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeSchemaRoleByRoleDefTentIdx( TenantId );
	}

	public void deleteSchemaRoleByScopeIdx( long TenantId,
		long ScopeId )
	{
		YCFBamRoleDefByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFBamRoleDefByScopeIdxKey,
				Map< YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > >();
		}
		if( indexByScopeIdx.containsKey( key ) ) {
			Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj> dict = indexByScopeIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			Iterator<IYCFBamSchemaRoleObj> iter = dict.values().iterator();
			IYCFBamSchemaRoleObj obj;
			List<IYCFBamSchemaRoleObj> toForget = new LinkedList<IYCFBamSchemaRoleObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
		}
		deepDisposeSchemaRoleByScopeIdx( TenantId,
				ScopeId );
	}

	public void deleteSchemaRoleByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamRoleDefByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamRoleDefByDefSchemaIdxKey,
				Map< YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamSchemaRoleObj> iter = dict.values().iterator();
			IYCFBamSchemaRoleObj obj;
			List<IYCFBamSchemaRoleObj> toForget = new LinkedList<IYCFBamSchemaRoleObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByDefSchemaIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeSchemaRoleByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteSchemaRoleBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		YCFBamSchemaRoleBySchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		if( indexBySchemaIdx == null ) {
			indexBySchemaIdx = new HashMap< YCFBamSchemaRoleBySchemaIdxKey,
				Map< YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > >();
		}
		if( indexBySchemaIdx.containsKey( key ) ) {
			Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj> dict = indexBySchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
			Iterator<IYCFBamSchemaRoleObj> iter = dict.values().iterator();
			IYCFBamSchemaRoleObj obj;
			List<IYCFBamSchemaRoleObj> toForget = new LinkedList<IYCFBamSchemaRoleObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexBySchemaIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
		}
		deepDisposeSchemaRoleBySchemaIdx( TenantId,
				SchemaDefId );
	}

	public void deleteSchemaRoleByRoleScopeIdx( IYCFBamSchema.RoleScopeEnum RoleScope )
	{
		YCFBamSchemaRoleByRoleScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newRoleScopeIdxKey();
		key.setRequiredRoleScope( RoleScope );
		if( indexByRoleScopeIdx == null ) {
			indexByRoleScopeIdx = new HashMap< YCFBamSchemaRoleByRoleScopeIdxKey,
				Map< YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > >();
		}
		if( indexByRoleScopeIdx.containsKey( key ) ) {
			Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj> dict = indexByRoleScopeIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleByRoleScopeIdx( schema.getAuthorization(),
				RoleScope );
			Iterator<IYCFBamSchemaRoleObj> iter = dict.values().iterator();
			IYCFBamSchemaRoleObj obj;
			List<IYCFBamSchemaRoleObj> toForget = new LinkedList<IYCFBamSchemaRoleObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByRoleScopeIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleByRoleScopeIdx( schema.getAuthorization(),
				RoleScope );
		}
		deepDisposeSchemaRoleByRoleScopeIdx( RoleScope );
	}

	public void deleteSchemaRoleBySchRoleScpIdx( long TenantId,
		long SchemaDefId,
		IYCFBamSchema.RoleScopeEnum RoleScope )
	{
		YCFBamSchemaRoleBySchRoleScpIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchRoleScpIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredRoleScope( RoleScope );
		if( indexBySchRoleScpIdx == null ) {
			indexBySchRoleScpIdx = new HashMap< YCFBamSchemaRoleBySchRoleScpIdxKey,
				Map< YCFBamRoleDefPKey, IYCFBamSchemaRoleObj > >();
		}
		if( indexBySchRoleScpIdx.containsKey( key ) ) {
			Map<YCFBamRoleDefPKey, IYCFBamSchemaRoleObj> dict = indexBySchRoleScpIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleBySchRoleScpIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId,
				RoleScope );
			Iterator<IYCFBamSchemaRoleObj> iter = dict.values().iterator();
			IYCFBamSchemaRoleObj obj;
			List<IYCFBamSchemaRoleObj> toForget = new LinkedList<IYCFBamSchemaRoleObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexBySchRoleScpIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleBySchRoleScpIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId,
				RoleScope );
		}
		deepDisposeSchemaRoleBySchRoleScpIdx( TenantId,
				SchemaDefId,
				RoleScope );
	}
}
