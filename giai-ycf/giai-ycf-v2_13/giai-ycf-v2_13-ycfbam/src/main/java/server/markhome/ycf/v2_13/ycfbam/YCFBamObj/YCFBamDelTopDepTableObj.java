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

public class CFBamDelTopDepTableObj
	implements ICFBamDelTopDepTableObj
{
	protected ICFBamSchemaObj schema;
	private Map<CFBamScopePKey, ICFBamDelTopDepObj> members;
	private Map<CFBamScopePKey, ICFBamDelTopDepObj> allDelTopDep;
	private Map< CFBamScopeByTenantIdxKey,
		Map<CFBamScopePKey, ICFBamDelTopDepObj > > indexByTenantIdx;
	private Map< CFBamDelDepByDefSchemaIdxKey,
		Map<CFBamScopePKey, ICFBamDelTopDepObj > > indexByDefSchemaIdx;
	private Map< CFBamDelDepByDelDepIdxKey,
		Map<CFBamScopePKey, ICFBamDelTopDepObj > > indexByDelDepIdx;
	private Map< CFBamDelTopDepByDelTopDepTblIdxKey,
		Map<CFBamScopePKey, ICFBamDelTopDepObj > > indexByDelTopDepTblIdx;
	private Map< CFBamDelTopDepByUNameIdxKey,
		ICFBamDelTopDepObj > indexByUNameIdx;
	private Map< CFBamDelTopDepByPrevIdxKey,
		Map<CFBamScopePKey, ICFBamDelTopDepObj > > indexByPrevIdx;
	private Map< CFBamDelTopDepByNextIdxKey,
		Map<CFBamScopePKey, ICFBamDelTopDepObj > > indexByNextIdx;
	public static String TABLE_NAME = "DelTopDep";
	public static String TABLE_DBNAME = "del_topdep";

	public CFBamDelTopDepTableObj() {
		schema = null;
		members = new HashMap<CFBamScopePKey, ICFBamDelTopDepObj>();
		allDelTopDep = null;
		indexByTenantIdx = null;
		indexByDefSchemaIdx = null;
		indexByDelDepIdx = null;
		indexByDelTopDepTblIdx = null;
		indexByUNameIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
	}

	public CFBamDelTopDepTableObj( ICFBamSchemaObj argSchema ) {
		schema = (ICFBamSchemaObj)argSchema;
		members = new HashMap<CFBamScopePKey, ICFBamDelTopDepObj>();
		allDelTopDep = null;
		indexByTenantIdx = null;
		indexByDefSchemaIdx = null;
		indexByDelDepIdx = null;
		indexByDelTopDepTblIdx = null;
		indexByUNameIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
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
		allDelTopDep = null;
		indexByTenantIdx = null;
		indexByDefSchemaIdx = null;
		indexByDelDepIdx = null;
		indexByDelTopDepTblIdx = null;
		indexByUNameIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
		List<ICFBamDelTopDepObj> toForget = new LinkedList<ICFBamDelTopDepObj>();
		ICFBamDelTopDepObj cur = null;
		Iterator<ICFBamDelTopDepObj> iter = members.values().iterator();
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
	 *	CFBamDelTopDepObj.
	 */
	public ICFBamDelTopDepObj newInstance() {
		ICFBamDelTopDepObj inst = new CFBamDelTopDepObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamDelTopDepObj.
	 */
	public ICFBamDelTopDepEditObj newEditInstance( ICFBamDelTopDepObj orig ) {
		ICFBamDelTopDepEditObj edit = new CFBamDelTopDepEditObj( orig );
		return( edit );
	}

	public ICFBamDelTopDepObj realiseDelTopDep( ICFBamDelTopDepObj Obj ) {
		ICFBamDelTopDepObj obj = Obj;
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamDelTopDepObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFBamDelTopDepObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamDelTopDepObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamDelTopDepObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByDelDepIdx != null ) {
				CFBamDelDepByDelDepIdxKey keyDelDepIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
				keyDelDepIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyDelDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<CFBamScopePKey, ICFBamDelTopDepObj > mapDelDepIdx = indexByDelDepIdx.get( keyDelDepIdx );
				if( mapDelDepIdx != null ) {
					indexByDelDepIdx.remove( keyDelDepIdx );
				}
			}

			if( indexByDelTopDepTblIdx != null ) {
				CFBamDelTopDepByDelTopDepTblIdxKey keyDelTopDepTblIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newDelTopDepTblIdxKey();
				keyDelTopDepTblIdx.setRequiredTableTenantId( keepObj.getRequiredTableTenantId() );
				keyDelTopDepTblIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<CFBamScopePKey, ICFBamDelTopDepObj > mapDelTopDepTblIdx = indexByDelTopDepTblIdx.get( keyDelTopDepTblIdx );
				if( mapDelTopDepTblIdx != null ) {
					mapDelTopDepTblIdx.remove( keepObj.getPKey() );
					if( mapDelTopDepTblIdx.size() <= 0 ) {
						indexByDelTopDepTblIdx.remove( keyDelTopDepTblIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamDelTopDepByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newUNameIdxKey();
				keyUNameIdx.setRequiredTableTenantId( keepObj.getRequiredTableTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByPrevIdx != null ) {
				CFBamDelTopDepByPrevIdxKey keyPrevIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<CFBamScopePKey, ICFBamDelTopDepObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.remove( keepObj.getPKey() );
					if( mapPrevIdx.size() <= 0 ) {
						indexByPrevIdx.remove( keyPrevIdx );
					}
				}
			}

			if( indexByNextIdx != null ) {
				CFBamDelTopDepByNextIdxKey keyNextIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<CFBamScopePKey, ICFBamDelTopDepObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.remove( keepObj.getPKey() );
					if( mapNextIdx.size() <= 0 ) {
						indexByNextIdx.remove( keyNextIdx );
					}
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (ICFBamDelTopDepObj)schema.getDelDepTableObj().realiseDelDep( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamDelTopDepObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamDelTopDepObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelDepIdx != null ) {
				CFBamDelDepByDelDepIdxKey keyDelDepIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
				keyDelDepIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyDelDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<CFBamScopePKey, ICFBamDelTopDepObj > mapDelDepIdx = indexByDelDepIdx.get( keyDelDepIdx );
				if( mapDelDepIdx != null ) {
					mapDelDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelTopDepTblIdx != null ) {
				CFBamDelTopDepByDelTopDepTblIdxKey keyDelTopDepTblIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newDelTopDepTblIdxKey();
				keyDelTopDepTblIdx.setRequiredTableTenantId( keepObj.getRequiredTableTenantId() );
				keyDelTopDepTblIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<CFBamScopePKey, ICFBamDelTopDepObj > mapDelTopDepTblIdx = indexByDelTopDepTblIdx.get( keyDelTopDepTblIdx );
				if( mapDelTopDepTblIdx != null ) {
					mapDelTopDepTblIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamDelTopDepByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newUNameIdxKey();
				keyUNameIdx.setRequiredTableTenantId( keepObj.getRequiredTableTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByPrevIdx != null ) {
				CFBamDelTopDepByPrevIdxKey keyPrevIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<CFBamScopePKey, ICFBamDelTopDepObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				CFBamDelTopDepByNextIdxKey keyNextIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<CFBamScopePKey, ICFBamDelTopDepObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allDelTopDep != null ) {
				allDelTopDep.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (ICFBamDelTopDepObj)schema.getDelDepTableObj().realiseDelDep( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allDelTopDep != null ) {
				allDelTopDep.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamDelTopDepObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamDelTopDepObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelDepIdx != null ) {
				CFBamDelDepByDelDepIdxKey keyDelDepIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
				keyDelDepIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyDelDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<CFBamScopePKey, ICFBamDelTopDepObj > mapDelDepIdx = indexByDelDepIdx.get( keyDelDepIdx );
				if( mapDelDepIdx != null ) {
					mapDelDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelTopDepTblIdx != null ) {
				CFBamDelTopDepByDelTopDepTblIdxKey keyDelTopDepTblIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newDelTopDepTblIdxKey();
				keyDelTopDepTblIdx.setRequiredTableTenantId( keepObj.getRequiredTableTenantId() );
				keyDelTopDepTblIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<CFBamScopePKey, ICFBamDelTopDepObj > mapDelTopDepTblIdx = indexByDelTopDepTblIdx.get( keyDelTopDepTblIdx );
				if( mapDelTopDepTblIdx != null ) {
					mapDelTopDepTblIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamDelTopDepByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newUNameIdxKey();
				keyUNameIdx.setRequiredTableTenantId( keepObj.getRequiredTableTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByPrevIdx != null ) {
				CFBamDelTopDepByPrevIdxKey keyPrevIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<CFBamScopePKey, ICFBamDelTopDepObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				CFBamDelTopDepByNextIdxKey keyNextIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<CFBamScopePKey, ICFBamDelTopDepObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFBamDelTopDepObj createDelTopDep( ICFBamDelTopDepObj Obj ) {
		ICFBamDelTopDepObj obj = Obj;
		CFBamDelTopDepBuff buff = obj.getDelTopDepBuff();
		((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().createDelTopDep(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a81e" ) ) {
			obj = (ICFBamDelTopDepObj)(obj.realise());
		}
		ICFBamDelTopDepObj prev = obj.getOptionalLookupPrev();
		if( prev != null ) {
			prev.read( true );
		}
		obj.endEdit();
		return( obj );
	}

	public ICFBamDelTopDepObj readDelTopDep( CFBamScopePKey pkey ) {
		return( readDelTopDep( pkey, false ) );
	}

	public ICFBamDelTopDepObj readDelTopDep( CFBamScopePKey pkey, boolean forceRead ) {
		ICFBamDelTopDepObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFBamDelTopDepBuff readBuff = ((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (ICFBamDelTopDepObj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFBamDelTopDepObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamDelTopDepObj readCachedDelTopDep( CFBamScopePKey pkey ) {
		ICFBamDelTopDepObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeDelTopDep( ICFBamDelTopDepObj obj )
	{
		final String S_ProcName = "CFBamDelTopDepTableObj.reallyDeepDisposeDelTopDep() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamDelTopDepObj existing = readCachedDelTopDep( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFBamDelTopDepByDelTopDepTblIdxKey keyDelTopDepTblIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newDelTopDepTblIdxKey();
		keyDelTopDepTblIdx.setRequiredTableTenantId( existing.getRequiredTableTenantId() );
		keyDelTopDepTblIdx.setRequiredTableId( existing.getRequiredTableId() );

		CFBamDelTopDepByUNameIdxKey keyUNameIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newUNameIdxKey();
		keyUNameIdx.setRequiredTableTenantId( existing.getRequiredTableTenantId() );
		keyUNameIdx.setRequiredTableId( existing.getRequiredTableId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		CFBamDelTopDepByPrevIdxKey keyPrevIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		CFBamDelTopDepByNextIdxKey keyNextIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newNextIdxKey();
		keyNextIdx.setOptionalNextTenantId( existing.getOptionalNextTenantId() );
		keyNextIdx.setOptionalNextId( existing.getOptionalNextId() );


		schema.getDelSubDep1TableObj().deepDisposeDelSubDep1ByDelTopDepIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByDelTopDepTblIdx != null ) {
			if( indexByDelTopDepTblIdx.containsKey( keyDelTopDepTblIdx ) ) {
				indexByDelTopDepTblIdx.get( keyDelTopDepTblIdx ).remove( pkey );
				if( indexByDelTopDepTblIdx.get( keyDelTopDepTblIdx ).size() <= 0 ) {
					indexByDelTopDepTblIdx.remove( keyDelTopDepTblIdx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}

		if( indexByPrevIdx != null ) {
			if( indexByPrevIdx.containsKey( keyPrevIdx ) ) {
				indexByPrevIdx.get( keyPrevIdx ).remove( pkey );
				if( indexByPrevIdx.get( keyPrevIdx ).size() <= 0 ) {
					indexByPrevIdx.remove( keyPrevIdx );
				}
			}
		}

		if( indexByNextIdx != null ) {
			if( indexByNextIdx.containsKey( keyNextIdx ) ) {
				indexByNextIdx.get( keyNextIdx ).remove( pkey );
				if( indexByNextIdx.get( keyNextIdx ).size() <= 0 ) {
					indexByNextIdx.remove( keyNextIdx );
				}
			}
		}


		schema.getDelDepTableObj().reallyDeepDisposeDelDep( obj );
	}
	public void deepDisposeDelTopDep( CFBamScopePKey pkey ) {
		ICFBamDelTopDepObj obj = readCachedDelTopDep( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamDelTopDepObj lockDelTopDep( CFBamScopePKey pkey ) {
		ICFBamDelTopDepObj locked = null;
		CFBamDelTopDepBuff lockBuff = ((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (ICFBamDelTopDepObj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFBamDelTopDepObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockDelTopDep", pkey );
		}
		return( locked );
	}

	public List<ICFBamDelTopDepObj> readAllDelTopDep() {
		return( readAllDelTopDep( false ) );
	}

	public List<ICFBamDelTopDepObj> readAllDelTopDep( boolean forceRead ) {
		final String S_ProcName = "readAllDelTopDep";
		if( ( allDelTopDep == null ) || forceRead ) {
			Map<CFBamScopePKey, ICFBamDelTopDepObj> map = new HashMap<CFBamScopePKey,ICFBamDelTopDepObj>();
			allDelTopDep = map;
			CFBamDelTopDepBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().readAllDerived( schema.getAuthorization() );
			CFBamDelTopDepBuff buff;
			ICFBamDelTopDepObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamDelTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamDelTopDepObj realised = (ICFBamDelTopDepObj)obj.realise();
			}
		}
		int len = allDelTopDep.size();
		ICFBamDelTopDepObj arr[] = new ICFBamDelTopDepObj[len];
		Iterator<ICFBamDelTopDepObj> valIter = allDelTopDep.values().iterator();
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
		ArrayList<ICFBamDelTopDepObj> arrayList = new ArrayList<ICFBamDelTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamDelTopDepObj> cmp = new Comparator<ICFBamDelTopDepObj>() {
			public int compare( ICFBamDelTopDepObj lhs, ICFBamDelTopDepObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamDelTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamDelTopDepObj> readCachedAllDelTopDep() {
		final String S_ProcName = "readCachedAllDelTopDep";
		ArrayList<ICFBamDelTopDepObj> arrayList = new ArrayList<ICFBamDelTopDepObj>();
		if( allDelTopDep != null ) {
			int len = allDelTopDep.size();
			ICFBamDelTopDepObj arr[] = new ICFBamDelTopDepObj[len];
			Iterator<ICFBamDelTopDepObj> valIter = allDelTopDep.values().iterator();
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
		Comparator<ICFBamDelTopDepObj> cmp = new Comparator<ICFBamDelTopDepObj>() {
			public int compare( ICFBamDelTopDepObj lhs, ICFBamDelTopDepObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFBamDelTopDepObj readDelTopDepByIdIdx( long TenantId,
		long Id )
	{
		return( readDelTopDepByIdIdx( TenantId,
			Id,
			false ) );
	}

	public ICFBamDelTopDepObj readDelTopDepByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamDelTopDepObj obj = readDelTopDep( pkey, forceRead );
		return( obj );
	}

	public List<ICFBamDelTopDepObj> readDelTopDepByTenantIdx( long TenantId )
	{
		return( readDelTopDepByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFBamDelTopDepObj> readDelTopDepByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelTopDepByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFBamScopePKey, ICFBamDelTopDepObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamDelTopDepObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamDelTopDepObj>();
			ICFBamScopeObj obj;
			CFBamScopeBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamDelTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamDelTopDepObj realised = (ICFBamDelTopDepObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamDelTopDepObj arr[] = new ICFBamDelTopDepObj[len];
		Iterator<ICFBamDelTopDepObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamDelTopDepObj> arrayList = new ArrayList<ICFBamDelTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamDelTopDepObj> cmp = new Comparator<ICFBamDelTopDepObj>() {
			public int compare( ICFBamDelTopDepObj lhs, ICFBamDelTopDepObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamDelTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamDelTopDepObj> readDelTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readDelTopDepByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<ICFBamDelTopDepObj> readDelTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelTopDepByDefSchemaIdx";
		CFBamDelDepByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<CFBamScopePKey, ICFBamDelTopDepObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamDelDepByDefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamDelTopDepObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamDelTopDepObj>();
			ICFBamDelDepObj obj;
			CFBamDelDepBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableDelDep().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			CFBamDelDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamDelTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamDelTopDepObj realised = (ICFBamDelTopDepObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamDelTopDepObj arr[] = new ICFBamDelTopDepObj[len];
		Iterator<ICFBamDelTopDepObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamDelTopDepObj> arrayList = new ArrayList<ICFBamDelTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamDelTopDepObj> cmp = new Comparator<ICFBamDelTopDepObj>() {
			public int compare( ICFBamDelTopDepObj lhs, ICFBamDelTopDepObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamDelTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamDelTopDepObj> readDelTopDepByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		return( readDelTopDepByDelDepIdx( RelationTenantId,
			RelationId,
			false ) );
	}

	public List<ICFBamDelTopDepObj> readDelTopDepByDelDepIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelTopDepByDelDepIdx";
		CFBamDelDepByDelDepIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		Map<CFBamScopePKey, ICFBamDelTopDepObj> dict;
		if( indexByDelDepIdx == null ) {
			indexByDelDepIdx = new HashMap< CFBamDelDepByDelDepIdxKey,
				Map< CFBamScopePKey, ICFBamDelTopDepObj > >();
		}
		if( ( ! forceRead ) && indexByDelDepIdx.containsKey( key ) ) {
			dict = indexByDelDepIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamDelTopDepObj>();
			ICFBamDelDepObj obj;
			CFBamDelDepBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableDelDep().readDerivedByDelDepIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			CFBamDelDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamDelTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamDelTopDepObj realised = (ICFBamDelTopDepObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDelDepIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamDelTopDepObj arr[] = new ICFBamDelTopDepObj[len];
		Iterator<ICFBamDelTopDepObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamDelTopDepObj> arrayList = new ArrayList<ICFBamDelTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamDelTopDepObj> cmp = new Comparator<ICFBamDelTopDepObj>() {
			public int compare( ICFBamDelTopDepObj lhs, ICFBamDelTopDepObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamDelTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamDelTopDepObj> readDelTopDepByDelTopDepTblIdx( long TableTenantId,
		long TableId )
	{
		return( readDelTopDepByDelTopDepTblIdx( TableTenantId,
			TableId,
			false ) );
	}

	public List<ICFBamDelTopDepObj> readDelTopDepByDelTopDepTblIdx( long TableTenantId,
		long TableId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelTopDepByDelTopDepTblIdx";
		CFBamDelTopDepByDelTopDepTblIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newDelTopDepTblIdxKey();
		key.setRequiredTableTenantId( TableTenantId );
		key.setRequiredTableId( TableId );
		Map<CFBamScopePKey, ICFBamDelTopDepObj> dict;
		if( indexByDelTopDepTblIdx == null ) {
			indexByDelTopDepTblIdx = new HashMap< CFBamDelTopDepByDelTopDepTblIdxKey,
				Map< CFBamScopePKey, ICFBamDelTopDepObj > >();
		}
		if( ( ! forceRead ) && indexByDelTopDepTblIdx.containsKey( key ) ) {
			dict = indexByDelTopDepTblIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamDelTopDepObj>();
			ICFBamDelTopDepObj obj;
			CFBamDelTopDepBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().readDerivedByDelTopDepTblIdx( schema.getAuthorization(),
				TableTenantId,
				TableId );
			CFBamDelTopDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamDelTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamDelTopDepObj realised = (ICFBamDelTopDepObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDelTopDepTblIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamDelTopDepObj arr[] = new ICFBamDelTopDepObj[len];
		Iterator<ICFBamDelTopDepObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamDelTopDepObj> arrayList = new ArrayList<ICFBamDelTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamDelTopDepObj> cmp = new Comparator<ICFBamDelTopDepObj>() {
			public int compare( ICFBamDelTopDepObj lhs, ICFBamDelTopDepObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamDelTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamDelTopDepObj readDelTopDepByUNameIdx( long TableTenantId,
		long TableId,
		String Name )
	{
		return( readDelTopDepByUNameIdx( TableTenantId,
			TableId,
			Name,
			false ) );
	}

	public ICFBamDelTopDepObj readDelTopDepByUNameIdx( long TableTenantId,
		long TableId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamDelTopDepByUNameIdxKey,
				ICFBamDelTopDepObj >();
		}
		CFBamDelTopDepByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newUNameIdxKey();
		key.setRequiredTableTenantId( TableTenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		ICFBamDelTopDepObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			CFBamDelTopDepBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().readDerivedByUNameIdx( schema.getAuthorization(),
				TableTenantId,
				TableId,
				Name );
			if( buff != null ) {
				obj = (ICFBamDelTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamDelTopDepObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<ICFBamDelTopDepObj> readDelTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		return( readDelTopDepByPrevIdx( PrevTenantId,
			PrevId,
			false ) );
	}

	public List<ICFBamDelTopDepObj> readDelTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelTopDepByPrevIdx";
		CFBamDelTopDepByPrevIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		Map<CFBamScopePKey, ICFBamDelTopDepObj> dict;
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< CFBamDelTopDepByPrevIdxKey,
				Map< CFBamScopePKey, ICFBamDelTopDepObj > >();
		}
		if( ( ! forceRead ) && indexByPrevIdx.containsKey( key ) ) {
			dict = indexByPrevIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamDelTopDepObj>();
			ICFBamDelTopDepObj obj;
			CFBamDelTopDepBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().readDerivedByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			CFBamDelTopDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamDelTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamDelTopDepObj realised = (ICFBamDelTopDepObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPrevIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamDelTopDepObj arr[] = new ICFBamDelTopDepObj[len];
		Iterator<ICFBamDelTopDepObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamDelTopDepObj> arrayList = new ArrayList<ICFBamDelTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamDelTopDepObj> cmp = new Comparator<ICFBamDelTopDepObj>() {
			public int compare( ICFBamDelTopDepObj lhs, ICFBamDelTopDepObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamDelTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamDelTopDepObj> readDelTopDepByNextIdx( Long NextTenantId,
		Long NextId )
	{
		return( readDelTopDepByNextIdx( NextTenantId,
			NextId,
			false ) );
	}

	public List<ICFBamDelTopDepObj> readDelTopDepByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelTopDepByNextIdx";
		CFBamDelTopDepByNextIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		Map<CFBamScopePKey, ICFBamDelTopDepObj> dict;
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< CFBamDelTopDepByNextIdxKey,
				Map< CFBamScopePKey, ICFBamDelTopDepObj > >();
		}
		if( ( ! forceRead ) && indexByNextIdx.containsKey( key ) ) {
			dict = indexByNextIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamDelTopDepObj>();
			ICFBamDelTopDepObj obj;
			CFBamDelTopDepBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().readDerivedByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			CFBamDelTopDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamDelTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamDelTopDepObj realised = (ICFBamDelTopDepObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByNextIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamDelTopDepObj arr[] = new ICFBamDelTopDepObj[len];
		Iterator<ICFBamDelTopDepObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamDelTopDepObj> arrayList = new ArrayList<ICFBamDelTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamDelTopDepObj> cmp = new Comparator<ICFBamDelTopDepObj>() {
			public int compare( ICFBamDelTopDepObj lhs, ICFBamDelTopDepObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamDelTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamDelTopDepObj readCachedDelTopDepByIdIdx( long TenantId,
		long Id )
	{
		ICFBamDelTopDepObj obj = null;
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedDelTopDep( pkey );
		return( obj );
	}

	public List<ICFBamDelTopDepObj> readCachedDelTopDepByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedDelTopDepByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFBamDelTopDepObj> arrayList = new ArrayList<ICFBamDelTopDepObj>();
		if( indexByTenantIdx != null ) {
			Map<CFBamScopePKey, ICFBamDelTopDepObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFBamDelTopDepObj arr[] = new ICFBamDelTopDepObj[len];
				Iterator<ICFBamDelTopDepObj> valIter = dict.values().iterator();
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
			ICFBamDelTopDepObj obj;
			Iterator<ICFBamDelTopDepObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamDelTopDepObj> cmp = new Comparator<ICFBamDelTopDepObj>() {
			public int compare( ICFBamDelTopDepObj lhs, ICFBamDelTopDepObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamDelTopDepObj> readCachedDelTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedDelTopDepByDefSchemaIdx";
		CFBamDelDepByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<ICFBamDelTopDepObj> arrayList = new ArrayList<ICFBamDelTopDepObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<CFBamScopePKey, ICFBamDelTopDepObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				ICFBamDelTopDepObj arr[] = new ICFBamDelTopDepObj[len];
				Iterator<ICFBamDelTopDepObj> valIter = dict.values().iterator();
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
			ICFBamDelTopDepObj obj;
			Iterator<ICFBamDelTopDepObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamDelTopDepObj> cmp = new Comparator<ICFBamDelTopDepObj>() {
			public int compare( ICFBamDelTopDepObj lhs, ICFBamDelTopDepObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamDelTopDepObj> readCachedDelTopDepByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "readCachedDelTopDepByDelDepIdx";
		CFBamDelDepByDelDepIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		ArrayList<ICFBamDelTopDepObj> arrayList = new ArrayList<ICFBamDelTopDepObj>();
		if( indexByDelDepIdx != null ) {
			Map<CFBamScopePKey, ICFBamDelTopDepObj> dict;
			if( indexByDelDepIdx.containsKey( key ) ) {
				dict = indexByDelDepIdx.get( key );
				int len = dict.size();
				ICFBamDelTopDepObj arr[] = new ICFBamDelTopDepObj[len];
				Iterator<ICFBamDelTopDepObj> valIter = dict.values().iterator();
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
			ICFBamDelTopDepObj obj;
			Iterator<ICFBamDelTopDepObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamDelTopDepObj> cmp = new Comparator<ICFBamDelTopDepObj>() {
			public int compare( ICFBamDelTopDepObj lhs, ICFBamDelTopDepObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamDelTopDepObj> readCachedDelTopDepByDelTopDepTblIdx( long TableTenantId,
		long TableId )
	{
		final String S_ProcName = "readCachedDelTopDepByDelTopDepTblIdx";
		CFBamDelTopDepByDelTopDepTblIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newDelTopDepTblIdxKey();
		key.setRequiredTableTenantId( TableTenantId );
		key.setRequiredTableId( TableId );
		ArrayList<ICFBamDelTopDepObj> arrayList = new ArrayList<ICFBamDelTopDepObj>();
		if( indexByDelTopDepTblIdx != null ) {
			Map<CFBamScopePKey, ICFBamDelTopDepObj> dict;
			if( indexByDelTopDepTblIdx.containsKey( key ) ) {
				dict = indexByDelTopDepTblIdx.get( key );
				int len = dict.size();
				ICFBamDelTopDepObj arr[] = new ICFBamDelTopDepObj[len];
				Iterator<ICFBamDelTopDepObj> valIter = dict.values().iterator();
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
			ICFBamDelTopDepObj obj;
			Iterator<ICFBamDelTopDepObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamDelTopDepObj> cmp = new Comparator<ICFBamDelTopDepObj>() {
			public int compare( ICFBamDelTopDepObj lhs, ICFBamDelTopDepObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFBamDelTopDepObj readCachedDelTopDepByUNameIdx( long TableTenantId,
		long TableId,
		String Name )
	{
		ICFBamDelTopDepObj obj = null;
		CFBamDelTopDepByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newUNameIdxKey();
		key.setRequiredTableTenantId( TableTenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<ICFBamDelTopDepObj> valIter = members.values().iterator();
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
			Iterator<ICFBamDelTopDepObj> valIter = members.values().iterator();
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

	public List<ICFBamDelTopDepObj> readCachedDelTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "readCachedDelTopDepByPrevIdx";
		CFBamDelTopDepByPrevIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		ArrayList<ICFBamDelTopDepObj> arrayList = new ArrayList<ICFBamDelTopDepObj>();
		if( indexByPrevIdx != null ) {
			Map<CFBamScopePKey, ICFBamDelTopDepObj> dict;
			if( indexByPrevIdx.containsKey( key ) ) {
				dict = indexByPrevIdx.get( key );
				int len = dict.size();
				ICFBamDelTopDepObj arr[] = new ICFBamDelTopDepObj[len];
				Iterator<ICFBamDelTopDepObj> valIter = dict.values().iterator();
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
			ICFBamDelTopDepObj obj;
			Iterator<ICFBamDelTopDepObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamDelTopDepObj> cmp = new Comparator<ICFBamDelTopDepObj>() {
			public int compare( ICFBamDelTopDepObj lhs, ICFBamDelTopDepObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamDelTopDepObj> readCachedDelTopDepByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "readCachedDelTopDepByNextIdx";
		CFBamDelTopDepByNextIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		ArrayList<ICFBamDelTopDepObj> arrayList = new ArrayList<ICFBamDelTopDepObj>();
		if( indexByNextIdx != null ) {
			Map<CFBamScopePKey, ICFBamDelTopDepObj> dict;
			if( indexByNextIdx.containsKey( key ) ) {
				dict = indexByNextIdx.get( key );
				int len = dict.size();
				ICFBamDelTopDepObj arr[] = new ICFBamDelTopDepObj[len];
				Iterator<ICFBamDelTopDepObj> valIter = dict.values().iterator();
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
			ICFBamDelTopDepObj obj;
			Iterator<ICFBamDelTopDepObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamDelTopDepObj> cmp = new Comparator<ICFBamDelTopDepObj>() {
			public int compare( ICFBamDelTopDepObj lhs, ICFBamDelTopDepObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeDelTopDepByIdIdx( long TenantId,
		long Id )
	{
		ICFBamDelTopDepObj obj = readCachedDelTopDepByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeDelTopDepByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeDelTopDepByTenantIdx";
		ICFBamDelTopDepObj obj;
		List<ICFBamDelTopDepObj> arrayList = readCachedDelTopDepByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFBamDelTopDepObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeDelTopDepByDefSchemaIdx";
		ICFBamDelTopDepObj obj;
		List<ICFBamDelTopDepObj> arrayList = readCachedDelTopDepByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<ICFBamDelTopDepObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelTopDepByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "deepDisposeDelTopDepByDelDepIdx";
		ICFBamDelTopDepObj obj;
		List<ICFBamDelTopDepObj> arrayList = readCachedDelTopDepByDelDepIdx( RelationTenantId,
				RelationId );
		if( arrayList != null )  {
			Iterator<ICFBamDelTopDepObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelTopDepByDelTopDepTblIdx( long TableTenantId,
		long TableId )
	{
		final String S_ProcName = "deepDisposeDelTopDepByDelTopDepTblIdx";
		ICFBamDelTopDepObj obj;
		List<ICFBamDelTopDepObj> arrayList = readCachedDelTopDepByDelTopDepTblIdx( TableTenantId,
				TableId );
		if( arrayList != null )  {
			Iterator<ICFBamDelTopDepObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelTopDepByUNameIdx( long TableTenantId,
		long TableId,
		String Name )
	{
		ICFBamDelTopDepObj obj = readCachedDelTopDepByUNameIdx( TableTenantId,
				TableId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeDelTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "deepDisposeDelTopDepByPrevIdx";
		ICFBamDelTopDepObj obj;
		List<ICFBamDelTopDepObj> arrayList = readCachedDelTopDepByPrevIdx( PrevTenantId,
				PrevId );
		if( arrayList != null )  {
			Iterator<ICFBamDelTopDepObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelTopDepByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "deepDisposeDelTopDepByNextIdx";
		ICFBamDelTopDepObj obj;
		List<ICFBamDelTopDepObj> arrayList = readCachedDelTopDepByNextIdx( NextTenantId,
				NextId );
		if( arrayList != null )  {
			Iterator<ICFBamDelTopDepObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public ICFBamDelTopDepObj updateDelTopDep( ICFBamDelTopDepObj Obj ) {
		ICFBamDelTopDepObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().updateDelTopDep( schema.getAuthorization(),
			Obj.getDelTopDepBuff() );
		if( Obj.getClassCode().equals( "a81e" ) ) {
			obj = (ICFBamDelTopDepObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteDelTopDep( ICFBamDelTopDepObj Obj ) {
		ICFBamDelTopDepObj obj = Obj;
		ICFBamDelTopDepObj prev = obj.getOptionalLookupPrev();
		ICFBamDelTopDepObj next = obj.getOptionalLookupNext();
		((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDep( schema.getAuthorization(),
			obj.getDelTopDepBuff() );
		Obj.forget();
		if( prev != null ) {
			prev.read( true );
		}
		if( next != null ) {
			next.read( true );
		}
	}

	public void deleteDelTopDepByIdIdx( long TenantId,
		long Id )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamDelTopDepObj obj = readDelTopDep( pkey );
		if( obj != null ) {
			ICFBamDelTopDepEditObj editObj = (ICFBamDelTopDepEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFBamDelTopDepEditObj)obj.beginEdit();
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
		deepDisposeDelTopDepByIdIdx( TenantId,
				Id );
	}

	public void deleteDelTopDepByTenantIdx( long TenantId )
	{
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamDelTopDepObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamDelTopDepObj> dict = indexByTenantIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFBamDelTopDepObj> iter = dict.values().iterator();
			ICFBamDelTopDepObj obj;
			List<ICFBamDelTopDepObj> toForget = new LinkedList<ICFBamDelTopDepObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeDelTopDepByTenantIdx( TenantId );
	}

	public void deleteDelTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		CFBamDelDepByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamDelDepByDefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamDelTopDepObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamDelTopDepObj> dict = indexByDefSchemaIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<ICFBamDelTopDepObj> iter = dict.values().iterator();
			ICFBamDelTopDepObj obj;
			List<ICFBamDelTopDepObj> toForget = new LinkedList<ICFBamDelTopDepObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeDelTopDepByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteDelTopDepByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		CFBamDelDepByDelDepIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		if( indexByDelDepIdx == null ) {
			indexByDelDepIdx = new HashMap< CFBamDelDepByDelDepIdxKey,
				Map< CFBamScopePKey, ICFBamDelTopDepObj > >();
		}
		if( indexByDelDepIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamDelTopDepObj> dict = indexByDelDepIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByDelDepIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			Iterator<ICFBamDelTopDepObj> iter = dict.values().iterator();
			ICFBamDelTopDepObj obj;
			List<ICFBamDelTopDepObj> toForget = new LinkedList<ICFBamDelTopDepObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByDelDepIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByDelDepIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
		}
		deepDisposeDelTopDepByDelDepIdx( RelationTenantId,
				RelationId );
	}

	public void deleteDelTopDepByDelTopDepTblIdx( long TableTenantId,
		long TableId )
	{
		CFBamDelTopDepByDelTopDepTblIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newDelTopDepTblIdxKey();
		key.setRequiredTableTenantId( TableTenantId );
		key.setRequiredTableId( TableId );
		if( indexByDelTopDepTblIdx == null ) {
			indexByDelTopDepTblIdx = new HashMap< CFBamDelTopDepByDelTopDepTblIdxKey,
				Map< CFBamScopePKey, ICFBamDelTopDepObj > >();
		}
		if( indexByDelTopDepTblIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamDelTopDepObj> dict = indexByDelTopDepTblIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByDelTopDepTblIdx( schema.getAuthorization(),
				TableTenantId,
				TableId );
			Iterator<ICFBamDelTopDepObj> iter = dict.values().iterator();
			ICFBamDelTopDepObj obj;
			List<ICFBamDelTopDepObj> toForget = new LinkedList<ICFBamDelTopDepObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByDelTopDepTblIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByDelTopDepTblIdx( schema.getAuthorization(),
				TableTenantId,
				TableId );
		}
		deepDisposeDelTopDepByDelTopDepTblIdx( TableTenantId,
				TableId );
	}

	public void deleteDelTopDepByUNameIdx( long TableTenantId,
		long TableId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamDelTopDepByUNameIdxKey,
				ICFBamDelTopDepObj >();
		}
		CFBamDelTopDepByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newUNameIdxKey();
		key.setRequiredTableTenantId( TableTenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		ICFBamDelTopDepObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByUNameIdx( schema.getAuthorization(),
				TableTenantId,
				TableId,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByUNameIdx( schema.getAuthorization(),
				TableTenantId,
				TableId,
				Name );
		}
		deepDisposeDelTopDepByUNameIdx( TableTenantId,
				TableId,
				Name );
	}

	public void deleteDelTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		CFBamDelTopDepByPrevIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< CFBamDelTopDepByPrevIdxKey,
				Map< CFBamScopePKey, ICFBamDelTopDepObj > >();
		}
		if( indexByPrevIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamDelTopDepObj> dict = indexByPrevIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			Iterator<ICFBamDelTopDepObj> iter = dict.values().iterator();
			ICFBamDelTopDepObj obj;
			List<ICFBamDelTopDepObj> toForget = new LinkedList<ICFBamDelTopDepObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByPrevIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
		}
		deepDisposeDelTopDepByPrevIdx( PrevTenantId,
				PrevId );
	}

	public void deleteDelTopDepByNextIdx( Long NextTenantId,
		Long NextId )
	{
		CFBamDelTopDepByNextIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< CFBamDelTopDepByNextIdxKey,
				Map< CFBamScopePKey, ICFBamDelTopDepObj > >();
		}
		if( indexByNextIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamDelTopDepObj> dict = indexByNextIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			Iterator<ICFBamDelTopDepObj> iter = dict.values().iterator();
			ICFBamDelTopDepObj obj;
			List<ICFBamDelTopDepObj> toForget = new LinkedList<ICFBamDelTopDepObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByNextIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
		}
		deepDisposeDelTopDepByNextIdx( NextTenantId,
				NextId );
	}

	/**
	 *	Move the CFBamDelTopDepObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDelTopDepObj refreshed cache instance.
	 */
	public ICFBamDelTopDepObj moveUpDelTopDep( ICFBamDelTopDepObj Obj ) {
		ICFBamDelTopDepObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new CFLibUsageException( getClass(),
				"moveUpDelTopDep",
				"You cannot move an object that is being edited" );
		}
		CFBamDelTopDepBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().moveBuffUp( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getDelTopDepTableObj().newInstance();
			obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			obj.setBuff( buff );
			obj = (ICFBamDelTopDepObj)obj.realise();
			ICFBamDelTopDepObj prev = obj.getOptionalLookupPrev( true );
			ICFBamDelTopDepObj next = obj.getOptionalLookupNext( true );
			if( next != null ) {
				ICFBamDelTopDepObj gnext = next.getOptionalLookupNext( true );
			}
		}
		return( obj );
	}

	/**
	 *	Move the CFBamDelTopDepObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDelTopDepObj refreshed cache instance.
	 */
	public ICFBamDelTopDepObj moveDownDelTopDep( ICFBamDelTopDepObj Obj ) {
		ICFBamDelTopDepObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new CFLibUsageException( getClass(),
				"moveDownDelTopDep",
				"You cannot move an object that is being edited" );
		}
		CFBamDelTopDepBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableDelTopDep().moveBuffDown( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getDelTopDepTableObj().newInstance();
			obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			obj.setBuff( buff );
			obj = (ICFBamDelTopDepObj)obj.realise();
			ICFBamDelTopDepObj prev = obj.getOptionalLookupPrev( true );
			if( prev != null ) {
				ICFBamDelTopDepObj gprev = prev.getOptionalLookupPrev( true );
			}
			ICFBamDelTopDepObj next = obj.getOptionalLookupNext( true );
		}
		return( obj );
	}
}