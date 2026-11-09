// Description: Java 11 Table Object implementation for CFBam.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFBam.
 *	
 *	Mark's Code Fractal CFBam is available under dual commercial license from
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
 *	Mark's Code Fractal CFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal CFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal CFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;

public class CFBamSchemaRoleTableObj
	implements ICFBamSchemaRoleTableObj
{
	protected ICFBamSchemaObj schema;
	private Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj> members;
	private Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj> allSchemaRole;
	private Map< CFBamRoleDefByUNameIdxKey,
		ICFBamSchemaRoleObj > indexByUNameIdx;
	private Map< CFBamRoleDefByUDefIdxKey,
		ICFBamSchemaRoleObj > indexByUDefIdx;
	private Map< CFBamRoleDefByRoleDefTentIdxKey,
		Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj > > indexByRoleDefTentIdx;
	private Map< CFBamRoleDefByScopeIdxKey,
		Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj > > indexByScopeIdx;
	private Map< CFBamRoleDefByDefSchemaIdxKey,
		Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj > > indexByDefSchemaIdx;
	private Map< CFBamSchemaRoleBySchemaIdxKey,
		Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj > > indexBySchemaIdx;
	private Map< CFBamSchemaRoleByRoleScopeIdxKey,
		Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj > > indexByRoleScopeIdx;
	private Map< CFBamSchemaRoleBySchRoleScpIdxKey,
		Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj > > indexBySchRoleScpIdx;
	public static String TABLE_NAME = "SchemaRole";
	public static String TABLE_DBNAME = "schrole";

	public CFBamSchemaRoleTableObj() {
		schema = null;
		members = new HashMap<CFBamRoleDefPKey, ICFBamSchemaRoleObj>();
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

	public CFBamSchemaRoleTableObj( ICFBamSchemaObj argSchema ) {
		schema = (ICFBamSchemaObj)argSchema;
		members = new HashMap<CFBamRoleDefPKey, ICFBamSchemaRoleObj>();
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

	public ICFBamSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFBamSchemaObj value ) {
		schema = (ICFBamSchemaObj)value;
	}

	public String getTableName() {
		return( TABLE_NAME );
	}

	public String getTableDbName() {
		return( TABLE_DBNAME );
	}

	public Class getObjQualifyingClass() {
		return( ICFBamSchemaDefObj.class );
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
		List<ICFBamSchemaRoleObj> toForget = new LinkedList<ICFBamSchemaRoleObj>();
		ICFBamSchemaRoleObj cur = null;
		Iterator<ICFBamSchemaRoleObj> iter = members.values().iterator();
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
	 *	CFBamSchemaRoleObj.
	 */
	public ICFBamSchemaRoleObj newInstance() {
		ICFBamSchemaRoleObj inst = new CFBamSchemaRoleObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamSchemaRoleObj.
	 */
	public ICFBamSchemaRoleEditObj newEditInstance( ICFBamSchemaRoleObj orig ) {
		ICFBamSchemaRoleEditObj edit = new CFBamSchemaRoleEditObj( orig );
		return( edit );
	}

	public ICFBamSchemaRoleObj realiseSchemaRole( ICFBamSchemaRoleObj Obj ) {
		ICFBamSchemaRoleObj obj = Obj;
		CFBamRoleDefPKey pkey = obj.getPKey();
		ICFBamSchemaRoleObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFBamSchemaRoleObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByUNameIdx != null ) {
				CFBamRoleDefByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByUDefIdx != null ) {
				CFBamRoleDefByUDefIdxKey keyUDefIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
				keyUDefIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUDefIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUDefIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyUDefIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				keyUDefIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUDefIdx.remove( keyUDefIdx );
			}

			if( indexByRoleDefTentIdx != null ) {
				CFBamRoleDefByRoleDefTentIdxKey keyRoleDefTentIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
				keyRoleDefTentIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj > mapRoleDefTentIdx = indexByRoleDefTentIdx.get( keyRoleDefTentIdx );
				if( mapRoleDefTentIdx != null ) {
					indexByRoleDefTentIdx.remove( keyRoleDefTentIdx );
				}
			}

			if( indexByScopeIdx != null ) {
				CFBamRoleDefByScopeIdxKey keyScopeIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					indexByScopeIdx.remove( keyScopeIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamRoleDefByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexBySchemaIdx != null ) {
				CFBamSchemaRoleBySchemaIdxKey keySchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					mapSchemaIdx.remove( keepObj.getPKey() );
					if( mapSchemaIdx.size() <= 0 ) {
						indexBySchemaIdx.remove( keySchemaIdx );
					}
				}
			}

			if( indexByRoleScopeIdx != null ) {
				CFBamSchemaRoleByRoleScopeIdxKey keyRoleScopeIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newRoleScopeIdxKey();
				keyRoleScopeIdx.setRequiredRoleScope( keepObj.getRequiredRoleScope() );
				Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj > mapRoleScopeIdx = indexByRoleScopeIdx.get( keyRoleScopeIdx );
				if( mapRoleScopeIdx != null ) {
					mapRoleScopeIdx.remove( keepObj.getPKey() );
					if( mapRoleScopeIdx.size() <= 0 ) {
						indexByRoleScopeIdx.remove( keyRoleScopeIdx );
					}
				}
			}

			if( indexBySchRoleScpIdx != null ) {
				CFBamSchemaRoleBySchRoleScpIdxKey keySchRoleScpIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchRoleScpIdxKey();
				keySchRoleScpIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchRoleScpIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				keySchRoleScpIdx.setRequiredRoleScope( keepObj.getRequiredRoleScope() );
				Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj > mapSchRoleScpIdx = indexBySchRoleScpIdx.get( keySchRoleScpIdx );
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
			keepObj = (ICFBamSchemaRoleObj)schema.getRoleDefTableObj().realiseRoleDef( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByUNameIdx != null ) {
				CFBamRoleDefByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByUDefIdx != null ) {
				CFBamRoleDefByUDefIdxKey keyUDefIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
				keyUDefIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUDefIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUDefIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyUDefIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				keyUDefIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUDefIdx.put( keyUDefIdx, keepObj );
			}

			if( indexByRoleDefTentIdx != null ) {
				CFBamRoleDefByRoleDefTentIdxKey keyRoleDefTentIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
				keyRoleDefTentIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj > mapRoleDefTentIdx = indexByRoleDefTentIdx.get( keyRoleDefTentIdx );
				if( mapRoleDefTentIdx != null ) {
					mapRoleDefTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				CFBamRoleDefByScopeIdxKey keyScopeIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamRoleDefByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaIdx != null ) {
				CFBamSchemaRoleBySchemaIdxKey keySchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					mapSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRoleScopeIdx != null ) {
				CFBamSchemaRoleByRoleScopeIdxKey keyRoleScopeIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newRoleScopeIdxKey();
				keyRoleScopeIdx.setRequiredRoleScope( keepObj.getRequiredRoleScope() );
				Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj > mapRoleScopeIdx = indexByRoleScopeIdx.get( keyRoleScopeIdx );
				if( mapRoleScopeIdx != null ) {
					mapRoleScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchRoleScpIdx != null ) {
				CFBamSchemaRoleBySchRoleScpIdxKey keySchRoleScpIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchRoleScpIdxKey();
				keySchRoleScpIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchRoleScpIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				keySchRoleScpIdx.setRequiredRoleScope( keepObj.getRequiredRoleScope() );
				Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj > mapSchRoleScpIdx = indexBySchRoleScpIdx.get( keySchRoleScpIdx );
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
			keepObj = (ICFBamSchemaRoleObj)schema.getRoleDefTableObj().realiseRoleDef( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSchemaRole != null ) {
				allSchemaRole.put( keepObj.getPKey(), keepObj );
			}

			if( indexByUNameIdx != null ) {
				CFBamRoleDefByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByUDefIdx != null ) {
				CFBamRoleDefByUDefIdxKey keyUDefIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
				keyUDefIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUDefIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUDefIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyUDefIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				keyUDefIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUDefIdx.put( keyUDefIdx, keepObj );
			}

			if( indexByRoleDefTentIdx != null ) {
				CFBamRoleDefByRoleDefTentIdxKey keyRoleDefTentIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
				keyRoleDefTentIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj > mapRoleDefTentIdx = indexByRoleDefTentIdx.get( keyRoleDefTentIdx );
				if( mapRoleDefTentIdx != null ) {
					mapRoleDefTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				CFBamRoleDefByScopeIdxKey keyScopeIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamRoleDefByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaIdx != null ) {
				CFBamSchemaRoleBySchemaIdxKey keySchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					mapSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRoleScopeIdx != null ) {
				CFBamSchemaRoleByRoleScopeIdxKey keyRoleScopeIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newRoleScopeIdxKey();
				keyRoleScopeIdx.setRequiredRoleScope( keepObj.getRequiredRoleScope() );
				Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj > mapRoleScopeIdx = indexByRoleScopeIdx.get( keyRoleScopeIdx );
				if( mapRoleScopeIdx != null ) {
					mapRoleScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchRoleScpIdx != null ) {
				CFBamSchemaRoleBySchRoleScpIdxKey keySchRoleScpIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchRoleScpIdxKey();
				keySchRoleScpIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchRoleScpIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				keySchRoleScpIdx.setRequiredRoleScope( keepObj.getRequiredRoleScope() );
				Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj > mapSchRoleScpIdx = indexBySchRoleScpIdx.get( keySchRoleScpIdx );
				if( mapSchRoleScpIdx != null ) {
					mapSchRoleScpIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFBamSchemaRoleObj createSchemaRole( ICFBamSchemaRoleObj Obj ) {
		ICFBamSchemaRoleObj obj = Obj;
		CFBamSchemaRoleBuff buff = obj.getSchemaRoleBuff();
		((ICFBamSchema)schema.getBackingStore()).getTableSchemaRole().createSchemaRole(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a88e" ) ) {
			obj = (ICFBamSchemaRoleObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public ICFBamSchemaRoleObj readSchemaRole( CFBamRoleDefPKey pkey ) {
		return( readSchemaRole( pkey, false ) );
	}

	public ICFBamSchemaRoleObj readSchemaRole( CFBamRoleDefPKey pkey, boolean forceRead ) {
		ICFBamSchemaRoleObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFBamSchemaRoleBuff readBuff = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaRole().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (ICFBamSchemaRoleObj)schema.getRoleDefTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFBamSchemaRoleObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamSchemaRoleObj readCachedSchemaRole( CFBamRoleDefPKey pkey ) {
		ICFBamSchemaRoleObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSchemaRole( ICFBamSchemaRoleObj obj )
	{
		final String S_ProcName = "CFBamSchemaRoleTableObj.reallyDeepDisposeSchemaRole() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFBamRoleDefPKey pkey = obj.getPKey();
		ICFBamSchemaRoleObj existing = readCachedSchemaRole( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFBamSchemaRoleBySchemaIdxKey keySchemaIdx = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchemaIdxKey();
		keySchemaIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keySchemaIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );

		CFBamSchemaRoleByRoleScopeIdxKey keyRoleScopeIdx = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newRoleScopeIdxKey();
		keyRoleScopeIdx.setRequiredRoleScope( existing.getRequiredRoleScope() );

		CFBamSchemaRoleBySchRoleScpIdxKey keySchRoleScpIdx = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchRoleScpIdxKey();
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
	public void deepDisposeSchemaRole( CFBamRoleDefPKey pkey ) {
		ICFBamSchemaRoleObj obj = readCachedSchemaRole( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamSchemaRoleObj lockSchemaRole( CFBamRoleDefPKey pkey ) {
		ICFBamSchemaRoleObj locked = null;
		CFBamSchemaRoleBuff lockBuff = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaRole().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (ICFBamSchemaRoleObj)schema.getRoleDefTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFBamSchemaRoleObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockSchemaRole", pkey );
		}
		return( locked );
	}

	public List<ICFBamSchemaRoleObj> readAllSchemaRole() {
		return( readAllSchemaRole( false ) );
	}

	public List<ICFBamSchemaRoleObj> readAllSchemaRole( boolean forceRead ) {
		final String S_ProcName = "readAllSchemaRole";
		if( ( allSchemaRole == null ) || forceRead ) {
			Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj> map = new HashMap<CFBamRoleDefPKey,ICFBamSchemaRoleObj>();
			allSchemaRole = map;
			CFBamSchemaRoleBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaRole().readAllDerived( schema.getAuthorization() );
			CFBamSchemaRoleBuff buff;
			ICFBamSchemaRoleObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamSchemaRoleObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				ICFBamSchemaRoleObj realised = (ICFBamSchemaRoleObj)obj.realise();
			}
		}
		int len = allSchemaRole.size();
		ICFBamSchemaRoleObj arr[] = new ICFBamSchemaRoleObj[len];
		Iterator<ICFBamSchemaRoleObj> valIter = allSchemaRole.values().iterator();
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
		ArrayList<ICFBamSchemaRoleObj> arrayList = new ArrayList<ICFBamSchemaRoleObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamSchemaRoleObj> cmp = new Comparator<ICFBamSchemaRoleObj>() {
			public int compare( ICFBamSchemaRoleObj lhs, ICFBamSchemaRoleObj rhs ) {
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
					CFBamRoleDefPKey lhsPKey = lhs.getPKey();
					CFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamSchemaRoleObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamSchemaRoleObj> readCachedAllSchemaRole() {
		final String S_ProcName = "readCachedAllSchemaRole";
		ArrayList<ICFBamSchemaRoleObj> arrayList = new ArrayList<ICFBamSchemaRoleObj>();
		if( allSchemaRole != null ) {
			int len = allSchemaRole.size();
			ICFBamSchemaRoleObj arr[] = new ICFBamSchemaRoleObj[len];
			Iterator<ICFBamSchemaRoleObj> valIter = allSchemaRole.values().iterator();
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
		Comparator<ICFBamSchemaRoleObj> cmp = new Comparator<ICFBamSchemaRoleObj>() {
			public int compare( ICFBamSchemaRoleObj lhs, ICFBamSchemaRoleObj rhs ) {
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
					CFBamRoleDefPKey lhsPKey = lhs.getPKey();
					CFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFBamSchemaRoleObj readSchemaRoleByIdIdx( long TenantId,
		long Id )
	{
		return( readSchemaRoleByIdIdx( TenantId,
			Id,
			false ) );
	}

	public ICFBamSchemaRoleObj readSchemaRoleByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		CFBamRoleDefPKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamSchemaRoleObj obj = readSchemaRole( pkey, forceRead );
		return( obj );
	}

	public ICFBamSchemaRoleObj readSchemaRoleByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		return( readSchemaRoleByUNameIdx( TenantId,
			ScopeId,
			Name,
			false ) );
	}

	public ICFBamSchemaRoleObj readSchemaRoleByUNameIdx( long TenantId,
		long ScopeId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamRoleDefByUNameIdxKey,
				ICFBamSchemaRoleObj >();
		}
		CFBamRoleDefByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		ICFBamSchemaRoleObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			CFBamRoleDefBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			if( buff != null ) {
				obj = (ICFBamSchemaRoleObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamSchemaRoleObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamSchemaRoleObj readSchemaRoleByUDefIdx( long TenantId,
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

	public ICFBamSchemaRoleObj readSchemaRoleByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name, boolean forceRead )
	{
		if( indexByUDefIdx == null ) {
			indexByUDefIdx = new HashMap< CFBamRoleDefByUDefIdxKey,
				ICFBamSchemaRoleObj >();
		}
		CFBamRoleDefByUDefIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		key.setRequiredName( Name );
		ICFBamSchemaRoleObj obj = null;
		if( ( ! forceRead ) && indexByUDefIdx.containsKey( key ) ) {
			obj = indexByUDefIdx.get( key );
		}
		else {
			CFBamRoleDefBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().readDerivedByUDefIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
			if( buff != null ) {
				obj = (ICFBamSchemaRoleObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamSchemaRoleObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<ICFBamSchemaRoleObj> readSchemaRoleByRoleDefTentIdx( long TenantId )
	{
		return( readSchemaRoleByRoleDefTentIdx( TenantId,
			false ) );
	}

	public List<ICFBamSchemaRoleObj> readSchemaRoleByRoleDefTentIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaRoleByRoleDefTentIdx";
		CFBamRoleDefByRoleDefTentIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj> dict;
		if( indexByRoleDefTentIdx == null ) {
			indexByRoleDefTentIdx = new HashMap< CFBamRoleDefByRoleDefTentIdxKey,
				Map< CFBamRoleDefPKey, ICFBamSchemaRoleObj > >();
		}
		if( ( ! forceRead ) && indexByRoleDefTentIdx.containsKey( key ) ) {
			dict = indexByRoleDefTentIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamRoleDefPKey, ICFBamSchemaRoleObj>();
			ICFBamRoleDefObj obj;
			CFBamRoleDefBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().readDerivedByRoleDefTentIdx( schema.getAuthorization(),
				TenantId );
			CFBamRoleDefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamSchemaRoleObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				ICFBamSchemaRoleObj realised = (ICFBamSchemaRoleObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRoleDefTentIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamSchemaRoleObj arr[] = new ICFBamSchemaRoleObj[len];
		Iterator<ICFBamSchemaRoleObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamSchemaRoleObj> arrayList = new ArrayList<ICFBamSchemaRoleObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamSchemaRoleObj> cmp = new Comparator<ICFBamSchemaRoleObj>() {
			public int compare( ICFBamSchemaRoleObj lhs, ICFBamSchemaRoleObj rhs ) {
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
					CFBamRoleDefPKey lhsPKey = lhs.getPKey();
					CFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamSchemaRoleObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamSchemaRoleObj> readSchemaRoleByScopeIdx( long TenantId,
		long ScopeId )
	{
		return( readSchemaRoleByScopeIdx( TenantId,
			ScopeId,
			false ) );
	}

	public List<ICFBamSchemaRoleObj> readSchemaRoleByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaRoleByScopeIdx";
		CFBamRoleDefByScopeIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj> dict;
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< CFBamRoleDefByScopeIdxKey,
				Map< CFBamRoleDefPKey, ICFBamSchemaRoleObj > >();
		}
		if( ( ! forceRead ) && indexByScopeIdx.containsKey( key ) ) {
			dict = indexByScopeIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamRoleDefPKey, ICFBamSchemaRoleObj>();
			ICFBamRoleDefObj obj;
			CFBamRoleDefBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().readDerivedByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			CFBamRoleDefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamSchemaRoleObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				ICFBamSchemaRoleObj realised = (ICFBamSchemaRoleObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamSchemaRoleObj arr[] = new ICFBamSchemaRoleObj[len];
		Iterator<ICFBamSchemaRoleObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamSchemaRoleObj> arrayList = new ArrayList<ICFBamSchemaRoleObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamSchemaRoleObj> cmp = new Comparator<ICFBamSchemaRoleObj>() {
			public int compare( ICFBamSchemaRoleObj lhs, ICFBamSchemaRoleObj rhs ) {
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
					CFBamRoleDefPKey lhsPKey = lhs.getPKey();
					CFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamSchemaRoleObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamSchemaRoleObj> readSchemaRoleByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readSchemaRoleByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<ICFBamSchemaRoleObj> readSchemaRoleByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaRoleByDefSchemaIdx";
		CFBamRoleDefByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamRoleDefByDefSchemaIdxKey,
				Map< CFBamRoleDefPKey, ICFBamSchemaRoleObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamRoleDefPKey, ICFBamSchemaRoleObj>();
			ICFBamRoleDefObj obj;
			CFBamRoleDefBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			CFBamRoleDefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamSchemaRoleObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				ICFBamSchemaRoleObj realised = (ICFBamSchemaRoleObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamSchemaRoleObj arr[] = new ICFBamSchemaRoleObj[len];
		Iterator<ICFBamSchemaRoleObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamSchemaRoleObj> arrayList = new ArrayList<ICFBamSchemaRoleObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamSchemaRoleObj> cmp = new Comparator<ICFBamSchemaRoleObj>() {
			public int compare( ICFBamSchemaRoleObj lhs, ICFBamSchemaRoleObj rhs ) {
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
					CFBamRoleDefPKey lhsPKey = lhs.getPKey();
					CFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamSchemaRoleObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamSchemaRoleObj> readSchemaRoleBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		return( readSchemaRoleBySchemaIdx( TenantId,
			SchemaDefId,
			false ) );
	}

	public List<ICFBamSchemaRoleObj> readSchemaRoleBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaRoleBySchemaIdx";
		CFBamSchemaRoleBySchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj> dict;
		if( indexBySchemaIdx == null ) {
			indexBySchemaIdx = new HashMap< CFBamSchemaRoleBySchemaIdxKey,
				Map< CFBamRoleDefPKey, ICFBamSchemaRoleObj > >();
		}
		if( ( ! forceRead ) && indexBySchemaIdx.containsKey( key ) ) {
			dict = indexBySchemaIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamRoleDefPKey, ICFBamSchemaRoleObj>();
			ICFBamSchemaRoleObj obj;
			CFBamSchemaRoleBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaRole().readDerivedBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
			CFBamSchemaRoleBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamSchemaRoleObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				ICFBamSchemaRoleObj realised = (ICFBamSchemaRoleObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySchemaIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamSchemaRoleObj arr[] = new ICFBamSchemaRoleObj[len];
		Iterator<ICFBamSchemaRoleObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamSchemaRoleObj> arrayList = new ArrayList<ICFBamSchemaRoleObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamSchemaRoleObj> cmp = new Comparator<ICFBamSchemaRoleObj>() {
			public int compare( ICFBamSchemaRoleObj lhs, ICFBamSchemaRoleObj rhs ) {
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
					CFBamRoleDefPKey lhsPKey = lhs.getPKey();
					CFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamSchemaRoleObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamSchemaRoleObj> readSchemaRoleByRoleScopeIdx( ICFBamSchema.RoleScopeEnum RoleScope )
	{
		return( readSchemaRoleByRoleScopeIdx( RoleScope,
			false ) );
	}

	public List<ICFBamSchemaRoleObj> readSchemaRoleByRoleScopeIdx( ICFBamSchema.RoleScopeEnum RoleScope,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaRoleByRoleScopeIdx";
		CFBamSchemaRoleByRoleScopeIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newRoleScopeIdxKey();
		key.setRequiredRoleScope( RoleScope );
		Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj> dict;
		if( indexByRoleScopeIdx == null ) {
			indexByRoleScopeIdx = new HashMap< CFBamSchemaRoleByRoleScopeIdxKey,
				Map< CFBamRoleDefPKey, ICFBamSchemaRoleObj > >();
		}
		if( ( ! forceRead ) && indexByRoleScopeIdx.containsKey( key ) ) {
			dict = indexByRoleScopeIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamRoleDefPKey, ICFBamSchemaRoleObj>();
			ICFBamSchemaRoleObj obj;
			CFBamSchemaRoleBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaRole().readDerivedByRoleScopeIdx( schema.getAuthorization(),
				RoleScope );
			CFBamSchemaRoleBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamSchemaRoleObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				ICFBamSchemaRoleObj realised = (ICFBamSchemaRoleObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRoleScopeIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamSchemaRoleObj arr[] = new ICFBamSchemaRoleObj[len];
		Iterator<ICFBamSchemaRoleObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamSchemaRoleObj> arrayList = new ArrayList<ICFBamSchemaRoleObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamSchemaRoleObj> cmp = new Comparator<ICFBamSchemaRoleObj>() {
			public int compare( ICFBamSchemaRoleObj lhs, ICFBamSchemaRoleObj rhs ) {
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
					CFBamRoleDefPKey lhsPKey = lhs.getPKey();
					CFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamSchemaRoleObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamSchemaRoleObj> readSchemaRoleBySchRoleScpIdx( long TenantId,
		long SchemaDefId,
		ICFBamSchema.RoleScopeEnum RoleScope )
	{
		return( readSchemaRoleBySchRoleScpIdx( TenantId,
			SchemaDefId,
			RoleScope,
			false ) );
	}

	public List<ICFBamSchemaRoleObj> readSchemaRoleBySchRoleScpIdx( long TenantId,
		long SchemaDefId,
		ICFBamSchema.RoleScopeEnum RoleScope,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaRoleBySchRoleScpIdx";
		CFBamSchemaRoleBySchRoleScpIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchRoleScpIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredRoleScope( RoleScope );
		Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj> dict;
		if( indexBySchRoleScpIdx == null ) {
			indexBySchRoleScpIdx = new HashMap< CFBamSchemaRoleBySchRoleScpIdxKey,
				Map< CFBamRoleDefPKey, ICFBamSchemaRoleObj > >();
		}
		if( ( ! forceRead ) && indexBySchRoleScpIdx.containsKey( key ) ) {
			dict = indexBySchRoleScpIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamRoleDefPKey, ICFBamSchemaRoleObj>();
			ICFBamSchemaRoleObj obj;
			CFBamSchemaRoleBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaRole().readDerivedBySchRoleScpIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId,
				RoleScope );
			CFBamSchemaRoleBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamSchemaRoleObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				ICFBamSchemaRoleObj realised = (ICFBamSchemaRoleObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySchRoleScpIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamSchemaRoleObj arr[] = new ICFBamSchemaRoleObj[len];
		Iterator<ICFBamSchemaRoleObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamSchemaRoleObj> arrayList = new ArrayList<ICFBamSchemaRoleObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamSchemaRoleObj> cmp = new Comparator<ICFBamSchemaRoleObj>() {
			public int compare( ICFBamSchemaRoleObj lhs, ICFBamSchemaRoleObj rhs ) {
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
					CFBamRoleDefPKey lhsPKey = lhs.getPKey();
					CFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamSchemaRoleObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamSchemaRoleObj readCachedSchemaRoleByIdIdx( long TenantId,
		long Id )
	{
		ICFBamSchemaRoleObj obj = null;
		CFBamRoleDefPKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedSchemaRole( pkey );
		return( obj );
	}

	public ICFBamSchemaRoleObj readCachedSchemaRoleByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		ICFBamSchemaRoleObj obj = null;
		CFBamRoleDefByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<ICFBamSchemaRoleObj> valIter = members.values().iterator();
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
			Iterator<ICFBamSchemaRoleObj> valIter = members.values().iterator();
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

	public ICFBamSchemaRoleObj readCachedSchemaRoleByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		ICFBamSchemaRoleObj obj = null;
		CFBamRoleDefByUDefIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
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
				Iterator<ICFBamSchemaRoleObj> valIter = members.values().iterator();
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
			Iterator<ICFBamSchemaRoleObj> valIter = members.values().iterator();
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

	public List<ICFBamSchemaRoleObj> readCachedSchemaRoleByRoleDefTentIdx( long TenantId )
	{
		final String S_ProcName = "readCachedSchemaRoleByRoleDefTentIdx";
		CFBamRoleDefByRoleDefTentIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFBamSchemaRoleObj> arrayList = new ArrayList<ICFBamSchemaRoleObj>();
		if( indexByRoleDefTentIdx != null ) {
			Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj> dict;
			if( indexByRoleDefTentIdx.containsKey( key ) ) {
				dict = indexByRoleDefTentIdx.get( key );
				int len = dict.size();
				ICFBamSchemaRoleObj arr[] = new ICFBamSchemaRoleObj[len];
				Iterator<ICFBamSchemaRoleObj> valIter = dict.values().iterator();
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
			ICFBamSchemaRoleObj obj;
			Iterator<ICFBamSchemaRoleObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamSchemaRoleObj> cmp = new Comparator<ICFBamSchemaRoleObj>() {
			public int compare( ICFBamSchemaRoleObj lhs, ICFBamSchemaRoleObj rhs ) {
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
					CFBamRoleDefPKey lhsPKey = lhs.getPKey();
					CFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamSchemaRoleObj> readCachedSchemaRoleByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "readCachedSchemaRoleByScopeIdx";
		CFBamRoleDefByScopeIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		ArrayList<ICFBamSchemaRoleObj> arrayList = new ArrayList<ICFBamSchemaRoleObj>();
		if( indexByScopeIdx != null ) {
			Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj> dict;
			if( indexByScopeIdx.containsKey( key ) ) {
				dict = indexByScopeIdx.get( key );
				int len = dict.size();
				ICFBamSchemaRoleObj arr[] = new ICFBamSchemaRoleObj[len];
				Iterator<ICFBamSchemaRoleObj> valIter = dict.values().iterator();
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
			ICFBamSchemaRoleObj obj;
			Iterator<ICFBamSchemaRoleObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamSchemaRoleObj> cmp = new Comparator<ICFBamSchemaRoleObj>() {
			public int compare( ICFBamSchemaRoleObj lhs, ICFBamSchemaRoleObj rhs ) {
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
					CFBamRoleDefPKey lhsPKey = lhs.getPKey();
					CFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamSchemaRoleObj> readCachedSchemaRoleByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedSchemaRoleByDefSchemaIdx";
		CFBamRoleDefByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<ICFBamSchemaRoleObj> arrayList = new ArrayList<ICFBamSchemaRoleObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				ICFBamSchemaRoleObj arr[] = new ICFBamSchemaRoleObj[len];
				Iterator<ICFBamSchemaRoleObj> valIter = dict.values().iterator();
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
			ICFBamSchemaRoleObj obj;
			Iterator<ICFBamSchemaRoleObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamSchemaRoleObj> cmp = new Comparator<ICFBamSchemaRoleObj>() {
			public int compare( ICFBamSchemaRoleObj lhs, ICFBamSchemaRoleObj rhs ) {
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
					CFBamRoleDefPKey lhsPKey = lhs.getPKey();
					CFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamSchemaRoleObj> readCachedSchemaRoleBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		final String S_ProcName = "readCachedSchemaRoleBySchemaIdx";
		CFBamSchemaRoleBySchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		ArrayList<ICFBamSchemaRoleObj> arrayList = new ArrayList<ICFBamSchemaRoleObj>();
		if( indexBySchemaIdx != null ) {
			Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj> dict;
			if( indexBySchemaIdx.containsKey( key ) ) {
				dict = indexBySchemaIdx.get( key );
				int len = dict.size();
				ICFBamSchemaRoleObj arr[] = new ICFBamSchemaRoleObj[len];
				Iterator<ICFBamSchemaRoleObj> valIter = dict.values().iterator();
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
			ICFBamSchemaRoleObj obj;
			Iterator<ICFBamSchemaRoleObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamSchemaRoleObj> cmp = new Comparator<ICFBamSchemaRoleObj>() {
			public int compare( ICFBamSchemaRoleObj lhs, ICFBamSchemaRoleObj rhs ) {
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
					CFBamRoleDefPKey lhsPKey = lhs.getPKey();
					CFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamSchemaRoleObj> readCachedSchemaRoleByRoleScopeIdx( ICFBamSchema.RoleScopeEnum RoleScope )
	{
		final String S_ProcName = "readCachedSchemaRoleByRoleScopeIdx";
		CFBamSchemaRoleByRoleScopeIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newRoleScopeIdxKey();
		key.setRequiredRoleScope( RoleScope );
		ArrayList<ICFBamSchemaRoleObj> arrayList = new ArrayList<ICFBamSchemaRoleObj>();
		if( indexByRoleScopeIdx != null ) {
			Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj> dict;
			if( indexByRoleScopeIdx.containsKey( key ) ) {
				dict = indexByRoleScopeIdx.get( key );
				int len = dict.size();
				ICFBamSchemaRoleObj arr[] = new ICFBamSchemaRoleObj[len];
				Iterator<ICFBamSchemaRoleObj> valIter = dict.values().iterator();
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
			ICFBamSchemaRoleObj obj;
			Iterator<ICFBamSchemaRoleObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamSchemaRoleObj> cmp = new Comparator<ICFBamSchemaRoleObj>() {
			public int compare( ICFBamSchemaRoleObj lhs, ICFBamSchemaRoleObj rhs ) {
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
					CFBamRoleDefPKey lhsPKey = lhs.getPKey();
					CFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamSchemaRoleObj> readCachedSchemaRoleBySchRoleScpIdx( long TenantId,
		long SchemaDefId,
		ICFBamSchema.RoleScopeEnum RoleScope )
	{
		final String S_ProcName = "readCachedSchemaRoleBySchRoleScpIdx";
		CFBamSchemaRoleBySchRoleScpIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchRoleScpIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredRoleScope( RoleScope );
		ArrayList<ICFBamSchemaRoleObj> arrayList = new ArrayList<ICFBamSchemaRoleObj>();
		if( indexBySchRoleScpIdx != null ) {
			Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj> dict;
			if( indexBySchRoleScpIdx.containsKey( key ) ) {
				dict = indexBySchRoleScpIdx.get( key );
				int len = dict.size();
				ICFBamSchemaRoleObj arr[] = new ICFBamSchemaRoleObj[len];
				Iterator<ICFBamSchemaRoleObj> valIter = dict.values().iterator();
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
			ICFBamSchemaRoleObj obj;
			Iterator<ICFBamSchemaRoleObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamSchemaRoleObj> cmp = new Comparator<ICFBamSchemaRoleObj>() {
			public int compare( ICFBamSchemaRoleObj lhs, ICFBamSchemaRoleObj rhs ) {
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
					CFBamRoleDefPKey lhsPKey = lhs.getPKey();
					CFBamRoleDefPKey rhsPKey = rhs.getPKey();
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
		ICFBamSchemaRoleObj obj = readCachedSchemaRoleByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSchemaRoleByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		ICFBamSchemaRoleObj obj = readCachedSchemaRoleByUNameIdx( TenantId,
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
		ICFBamSchemaRoleObj obj = readCachedSchemaRoleByUDefIdx( TenantId,
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
		ICFBamSchemaRoleObj obj;
		List<ICFBamSchemaRoleObj> arrayList = readCachedSchemaRoleByRoleDefTentIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFBamSchemaRoleObj> arrayIter = arrayList.iterator();
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
		ICFBamSchemaRoleObj obj;
		List<ICFBamSchemaRoleObj> arrayList = readCachedSchemaRoleByScopeIdx( TenantId,
				ScopeId );
		if( arrayList != null )  {
			Iterator<ICFBamSchemaRoleObj> arrayIter = arrayList.iterator();
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
		ICFBamSchemaRoleObj obj;
		List<ICFBamSchemaRoleObj> arrayList = readCachedSchemaRoleByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<ICFBamSchemaRoleObj> arrayIter = arrayList.iterator();
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
		ICFBamSchemaRoleObj obj;
		List<ICFBamSchemaRoleObj> arrayList = readCachedSchemaRoleBySchemaIdx( TenantId,
				SchemaDefId );
		if( arrayList != null )  {
			Iterator<ICFBamSchemaRoleObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSchemaRoleByRoleScopeIdx( ICFBamSchema.RoleScopeEnum RoleScope )
	{
		final String S_ProcName = "deepDisposeSchemaRoleByRoleScopeIdx";
		ICFBamSchemaRoleObj obj;
		List<ICFBamSchemaRoleObj> arrayList = readCachedSchemaRoleByRoleScopeIdx( RoleScope );
		if( arrayList != null )  {
			Iterator<ICFBamSchemaRoleObj> arrayIter = arrayList.iterator();
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
		ICFBamSchema.RoleScopeEnum RoleScope )
	{
		final String S_ProcName = "deepDisposeSchemaRoleBySchRoleScpIdx";
		ICFBamSchemaRoleObj obj;
		List<ICFBamSchemaRoleObj> arrayList = readCachedSchemaRoleBySchRoleScpIdx( TenantId,
				SchemaDefId,
				RoleScope );
		if( arrayList != null )  {
			Iterator<ICFBamSchemaRoleObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public ICFBamSchemaRoleObj updateSchemaRole( ICFBamSchemaRoleObj Obj ) {
		ICFBamSchemaRoleObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableSchemaRole().updateSchemaRole( schema.getAuthorization(),
			Obj.getSchemaRoleBuff() );
		if( Obj.getClassCode().equals( "a88e" ) ) {
			obj = (ICFBamSchemaRoleObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteSchemaRole( ICFBamSchemaRoleObj Obj ) {
		ICFBamSchemaRoleObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRole( schema.getAuthorization(),
			obj.getSchemaRoleBuff() );
		Obj.forget();
	}

	public void deleteSchemaRoleByIdIdx( long TenantId,
		long Id )
	{
		CFBamRoleDefPKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamSchemaRoleObj obj = readSchemaRole( pkey );
		if( obj != null ) {
			ICFBamSchemaRoleEditObj editObj = (ICFBamSchemaRoleEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFBamSchemaRoleEditObj)obj.beginEdit();
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
			indexByUNameIdx = new HashMap< CFBamRoleDefByUNameIdxKey,
				ICFBamSchemaRoleObj >();
		}
		CFBamRoleDefByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		ICFBamSchemaRoleObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleByUNameIdx( schema.getAuthorization(),
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
			indexByUDefIdx = new HashMap< CFBamRoleDefByUDefIdxKey,
				ICFBamSchemaRoleObj >();
		}
		CFBamRoleDefByUDefIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		key.setRequiredName( Name );
		ICFBamSchemaRoleObj obj = null;
		if( indexByUDefIdx.containsKey( key ) ) {
			obj = indexByUDefIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleByUDefIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleByUDefIdx( schema.getAuthorization(),
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
		CFBamRoleDefByRoleDefTentIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByRoleDefTentIdx == null ) {
			indexByRoleDefTentIdx = new HashMap< CFBamRoleDefByRoleDefTentIdxKey,
				Map< CFBamRoleDefPKey, ICFBamSchemaRoleObj > >();
		}
		if( indexByRoleDefTentIdx.containsKey( key ) ) {
			Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj> dict = indexByRoleDefTentIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleByRoleDefTentIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFBamSchemaRoleObj> iter = dict.values().iterator();
			ICFBamSchemaRoleObj obj;
			List<ICFBamSchemaRoleObj> toForget = new LinkedList<ICFBamSchemaRoleObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleByRoleDefTentIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeSchemaRoleByRoleDefTentIdx( TenantId );
	}

	public void deleteSchemaRoleByScopeIdx( long TenantId,
		long ScopeId )
	{
		CFBamRoleDefByScopeIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< CFBamRoleDefByScopeIdxKey,
				Map< CFBamRoleDefPKey, ICFBamSchemaRoleObj > >();
		}
		if( indexByScopeIdx.containsKey( key ) ) {
			Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj> dict = indexByScopeIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			Iterator<ICFBamSchemaRoleObj> iter = dict.values().iterator();
			ICFBamSchemaRoleObj obj;
			List<ICFBamSchemaRoleObj> toForget = new LinkedList<ICFBamSchemaRoleObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
		}
		deepDisposeSchemaRoleByScopeIdx( TenantId,
				ScopeId );
	}

	public void deleteSchemaRoleByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		CFBamRoleDefByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamRoleDefByDefSchemaIdxKey,
				Map< CFBamRoleDefPKey, ICFBamSchemaRoleObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj> dict = indexByDefSchemaIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<ICFBamSchemaRoleObj> iter = dict.values().iterator();
			ICFBamSchemaRoleObj obj;
			List<ICFBamSchemaRoleObj> toForget = new LinkedList<ICFBamSchemaRoleObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeSchemaRoleByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteSchemaRoleBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		CFBamSchemaRoleBySchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		if( indexBySchemaIdx == null ) {
			indexBySchemaIdx = new HashMap< CFBamSchemaRoleBySchemaIdxKey,
				Map< CFBamRoleDefPKey, ICFBamSchemaRoleObj > >();
		}
		if( indexBySchemaIdx.containsKey( key ) ) {
			Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj> dict = indexBySchemaIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
			Iterator<ICFBamSchemaRoleObj> iter = dict.values().iterator();
			ICFBamSchemaRoleObj obj;
			List<ICFBamSchemaRoleObj> toForget = new LinkedList<ICFBamSchemaRoleObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
		}
		deepDisposeSchemaRoleBySchemaIdx( TenantId,
				SchemaDefId );
	}

	public void deleteSchemaRoleByRoleScopeIdx( ICFBamSchema.RoleScopeEnum RoleScope )
	{
		CFBamSchemaRoleByRoleScopeIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newRoleScopeIdxKey();
		key.setRequiredRoleScope( RoleScope );
		if( indexByRoleScopeIdx == null ) {
			indexByRoleScopeIdx = new HashMap< CFBamSchemaRoleByRoleScopeIdxKey,
				Map< CFBamRoleDefPKey, ICFBamSchemaRoleObj > >();
		}
		if( indexByRoleScopeIdx.containsKey( key ) ) {
			Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj> dict = indexByRoleScopeIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleByRoleScopeIdx( schema.getAuthorization(),
				RoleScope );
			Iterator<ICFBamSchemaRoleObj> iter = dict.values().iterator();
			ICFBamSchemaRoleObj obj;
			List<ICFBamSchemaRoleObj> toForget = new LinkedList<ICFBamSchemaRoleObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleByRoleScopeIdx( schema.getAuthorization(),
				RoleScope );
		}
		deepDisposeSchemaRoleByRoleScopeIdx( RoleScope );
	}

	public void deleteSchemaRoleBySchRoleScpIdx( long TenantId,
		long SchemaDefId,
		ICFBamSchema.RoleScopeEnum RoleScope )
	{
		CFBamSchemaRoleBySchRoleScpIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRole().newSchRoleScpIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredRoleScope( RoleScope );
		if( indexBySchRoleScpIdx == null ) {
			indexBySchRoleScpIdx = new HashMap< CFBamSchemaRoleBySchRoleScpIdxKey,
				Map< CFBamRoleDefPKey, ICFBamSchemaRoleObj > >();
		}
		if( indexBySchRoleScpIdx.containsKey( key ) ) {
			Map<CFBamRoleDefPKey, ICFBamSchemaRoleObj> dict = indexBySchRoleScpIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleBySchRoleScpIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId,
				RoleScope );
			Iterator<ICFBamSchemaRoleObj> iter = dict.values().iterator();
			ICFBamSchemaRoleObj obj;
			List<ICFBamSchemaRoleObj> toForget = new LinkedList<ICFBamSchemaRoleObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRole().deleteSchemaRoleBySchRoleScpIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId,
				RoleScope );
		}
		deepDisposeSchemaRoleBySchRoleScpIdx( TenantId,
				SchemaDefId,
				RoleScope );
	}
}