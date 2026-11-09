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

public class CFBamIndexColTableObj
	implements ICFBamIndexColTableObj
{
	protected ICFBamSchemaObj schema;
	private Map<CFBamIndexColPKey, ICFBamIndexColObj> members;
	private Map<CFBamIndexColPKey, ICFBamIndexColObj> allIndexCol;
	private Map< CFBamIndexColByUNameIdxKey,
		ICFBamIndexColObj > indexByUNameIdx;
	private Map< CFBamIndexColByIdxColTenantIdxKey,
		Map<CFBamIndexColPKey, ICFBamIndexColObj > > indexByIdxColTenantIdx;
	private Map< CFBamIndexColByIndexIdxKey,
		Map<CFBamIndexColPKey, ICFBamIndexColObj > > indexByIndexIdx;
	private Map< CFBamIndexColByDefSchemaIdxKey,
		Map<CFBamIndexColPKey, ICFBamIndexColObj > > indexByDefSchemaIdx;
	private Map< CFBamIndexColByColIdxKey,
		Map<CFBamIndexColPKey, ICFBamIndexColObj > > indexByColIdx;
	private Map< CFBamIndexColByPrevIdxKey,
		Map<CFBamIndexColPKey, ICFBamIndexColObj > > indexByPrevIdx;
	private Map< CFBamIndexColByNextIdxKey,
		Map<CFBamIndexColPKey, ICFBamIndexColObj > > indexByNextIdx;
	private Map< CFBamIndexColByIdxPrevIdxKey,
		Map<CFBamIndexColPKey, ICFBamIndexColObj > > indexByIdxPrevIdx;
	private Map< CFBamIndexColByIdxNextIdxKey,
		Map<CFBamIndexColPKey, ICFBamIndexColObj > > indexByIdxNextIdx;
	public static String TABLE_NAME = "IndexCol";
	public static String TABLE_DBNAME = "idxcol";

	public CFBamIndexColTableObj() {
		schema = null;
		members = new HashMap<CFBamIndexColPKey, ICFBamIndexColObj>();
		allIndexCol = null;
		indexByUNameIdx = null;
		indexByIdxColTenantIdx = null;
		indexByIndexIdx = null;
		indexByDefSchemaIdx = null;
		indexByColIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
		indexByIdxPrevIdx = null;
		indexByIdxNextIdx = null;
	}

	public CFBamIndexColTableObj( ICFBamSchemaObj argSchema ) {
		schema = (ICFBamSchemaObj)argSchema;
		members = new HashMap<CFBamIndexColPKey, ICFBamIndexColObj>();
		allIndexCol = null;
		indexByUNameIdx = null;
		indexByIdxColTenantIdx = null;
		indexByIndexIdx = null;
		indexByDefSchemaIdx = null;
		indexByColIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
		indexByIdxPrevIdx = null;
		indexByIdxNextIdx = null;
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
		allIndexCol = null;
		indexByUNameIdx = null;
		indexByIdxColTenantIdx = null;
		indexByIndexIdx = null;
		indexByDefSchemaIdx = null;
		indexByColIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
		indexByIdxPrevIdx = null;
		indexByIdxNextIdx = null;
		List<ICFBamIndexColObj> toForget = new LinkedList<ICFBamIndexColObj>();
		ICFBamIndexColObj cur = null;
		Iterator<ICFBamIndexColObj> iter = members.values().iterator();
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
	 *	CFBamIndexColObj.
	 */
	public ICFBamIndexColObj newInstance() {
		ICFBamIndexColObj inst = new CFBamIndexColObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamIndexColObj.
	 */
	public ICFBamIndexColEditObj newEditInstance( ICFBamIndexColObj orig ) {
		ICFBamIndexColEditObj edit = new CFBamIndexColEditObj( orig );
		return( edit );
	}

	public ICFBamIndexColObj realiseIndexCol( ICFBamIndexColObj Obj ) {
		ICFBamIndexColObj obj = Obj;
		CFBamIndexColPKey pkey = obj.getPKey();
		ICFBamIndexColObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFBamIndexColObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByUNameIdx != null ) {
				CFBamIndexColByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByIdxColTenantIdx != null ) {
				CFBamIndexColByIdxColTenantIdxKey keyIdxColTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxColTenantIdxKey();
				keyIdxColTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamIndexColPKey, ICFBamIndexColObj > mapIdxColTenantIdx = indexByIdxColTenantIdx.get( keyIdxColTenantIdx );
				if( mapIdxColTenantIdx != null ) {
					mapIdxColTenantIdx.remove( keepObj.getPKey() );
					if( mapIdxColTenantIdx.size() <= 0 ) {
						indexByIdxColTenantIdx.remove( keyIdxColTenantIdx );
					}
				}
			}

			if( indexByIndexIdx != null ) {
				CFBamIndexColByIndexIdxKey keyIndexIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIndexIdxKey();
				keyIndexIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIndexIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				Map<CFBamIndexColPKey, ICFBamIndexColObj > mapIndexIdx = indexByIndexIdx.get( keyIndexIdx );
				if( mapIndexIdx != null ) {
					mapIndexIdx.remove( keepObj.getPKey() );
					if( mapIndexIdx.size() <= 0 ) {
						indexByIndexIdx.remove( keyIndexIdx );
					}
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamIndexColByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamIndexColPKey, ICFBamIndexColObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.remove( keepObj.getPKey() );
					if( mapDefSchemaIdx.size() <= 0 ) {
						indexByDefSchemaIdx.remove( keyDefSchemaIdx );
					}
				}
			}

			if( indexByColIdx != null ) {
				CFBamIndexColByColIdxKey keyColIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newColIdxKey();
				keyColIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyColIdx.setRequiredColumnId( keepObj.getRequiredColumnId() );
				Map<CFBamIndexColPKey, ICFBamIndexColObj > mapColIdx = indexByColIdx.get( keyColIdx );
				if( mapColIdx != null ) {
					mapColIdx.remove( keepObj.getPKey() );
					if( mapColIdx.size() <= 0 ) {
						indexByColIdx.remove( keyColIdx );
					}
				}
			}

			if( indexByPrevIdx != null ) {
				CFBamIndexColByPrevIdxKey keyPrevIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<CFBamIndexColPKey, ICFBamIndexColObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.remove( keepObj.getPKey() );
					if( mapPrevIdx.size() <= 0 ) {
						indexByPrevIdx.remove( keyPrevIdx );
					}
				}
			}

			if( indexByNextIdx != null ) {
				CFBamIndexColByNextIdxKey keyNextIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<CFBamIndexColPKey, ICFBamIndexColObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.remove( keepObj.getPKey() );
					if( mapNextIdx.size() <= 0 ) {
						indexByNextIdx.remove( keyNextIdx );
					}
				}
			}

			if( indexByIdxPrevIdx != null ) {
				CFBamIndexColByIdxPrevIdxKey keyIdxPrevIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxPrevIdxKey();
				keyIdxPrevIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIdxPrevIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				keyIdxPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<CFBamIndexColPKey, ICFBamIndexColObj > mapIdxPrevIdx = indexByIdxPrevIdx.get( keyIdxPrevIdx );
				if( mapIdxPrevIdx != null ) {
					mapIdxPrevIdx.remove( keepObj.getPKey() );
					if( mapIdxPrevIdx.size() <= 0 ) {
						indexByIdxPrevIdx.remove( keyIdxPrevIdx );
					}
				}
			}

			if( indexByIdxNextIdx != null ) {
				CFBamIndexColByIdxNextIdxKey keyIdxNextIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxNextIdxKey();
				keyIdxNextIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIdxNextIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				keyIdxNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<CFBamIndexColPKey, ICFBamIndexColObj > mapIdxNextIdx = indexByIdxNextIdx.get( keyIdxNextIdx );
				if( mapIdxNextIdx != null ) {
					mapIdxNextIdx.remove( keepObj.getPKey() );
					if( mapIdxNextIdx.size() <= 0 ) {
						indexByIdxNextIdx.remove( keyIdxNextIdx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByUNameIdx != null ) {
				CFBamIndexColByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByIdxColTenantIdx != null ) {
				CFBamIndexColByIdxColTenantIdxKey keyIdxColTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxColTenantIdxKey();
				keyIdxColTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamIndexColPKey, ICFBamIndexColObj > mapIdxColTenantIdx = indexByIdxColTenantIdx.get( keyIdxColTenantIdx );
				if( mapIdxColTenantIdx != null ) {
					mapIdxColTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIndexIdx != null ) {
				CFBamIndexColByIndexIdxKey keyIndexIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIndexIdxKey();
				keyIndexIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIndexIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				Map<CFBamIndexColPKey, ICFBamIndexColObj > mapIndexIdx = indexByIndexIdx.get( keyIndexIdx );
				if( mapIndexIdx != null ) {
					mapIndexIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamIndexColByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamIndexColPKey, ICFBamIndexColObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByColIdx != null ) {
				CFBamIndexColByColIdxKey keyColIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newColIdxKey();
				keyColIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyColIdx.setRequiredColumnId( keepObj.getRequiredColumnId() );
				Map<CFBamIndexColPKey, ICFBamIndexColObj > mapColIdx = indexByColIdx.get( keyColIdx );
				if( mapColIdx != null ) {
					mapColIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPrevIdx != null ) {
				CFBamIndexColByPrevIdxKey keyPrevIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<CFBamIndexColPKey, ICFBamIndexColObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				CFBamIndexColByNextIdxKey keyNextIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<CFBamIndexColPKey, ICFBamIndexColObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIdxPrevIdx != null ) {
				CFBamIndexColByIdxPrevIdxKey keyIdxPrevIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxPrevIdxKey();
				keyIdxPrevIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIdxPrevIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				keyIdxPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<CFBamIndexColPKey, ICFBamIndexColObj > mapIdxPrevIdx = indexByIdxPrevIdx.get( keyIdxPrevIdx );
				if( mapIdxPrevIdx != null ) {
					mapIdxPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIdxNextIdx != null ) {
				CFBamIndexColByIdxNextIdxKey keyIdxNextIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxNextIdxKey();
				keyIdxNextIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIdxNextIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				keyIdxNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<CFBamIndexColPKey, ICFBamIndexColObj > mapIdxNextIdx = indexByIdxNextIdx.get( keyIdxNextIdx );
				if( mapIdxNextIdx != null ) {
					mapIdxNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allIndexCol != null ) {
				allIndexCol.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allIndexCol != null ) {
				allIndexCol.put( keepObj.getPKey(), keepObj );
			}

			if( indexByUNameIdx != null ) {
				CFBamIndexColByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByIdxColTenantIdx != null ) {
				CFBamIndexColByIdxColTenantIdxKey keyIdxColTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxColTenantIdxKey();
				keyIdxColTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamIndexColPKey, ICFBamIndexColObj > mapIdxColTenantIdx = indexByIdxColTenantIdx.get( keyIdxColTenantIdx );
				if( mapIdxColTenantIdx != null ) {
					mapIdxColTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIndexIdx != null ) {
				CFBamIndexColByIndexIdxKey keyIndexIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIndexIdxKey();
				keyIndexIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIndexIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				Map<CFBamIndexColPKey, ICFBamIndexColObj > mapIndexIdx = indexByIndexIdx.get( keyIndexIdx );
				if( mapIndexIdx != null ) {
					mapIndexIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamIndexColByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamIndexColPKey, ICFBamIndexColObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByColIdx != null ) {
				CFBamIndexColByColIdxKey keyColIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newColIdxKey();
				keyColIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyColIdx.setRequiredColumnId( keepObj.getRequiredColumnId() );
				Map<CFBamIndexColPKey, ICFBamIndexColObj > mapColIdx = indexByColIdx.get( keyColIdx );
				if( mapColIdx != null ) {
					mapColIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPrevIdx != null ) {
				CFBamIndexColByPrevIdxKey keyPrevIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<CFBamIndexColPKey, ICFBamIndexColObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				CFBamIndexColByNextIdxKey keyNextIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<CFBamIndexColPKey, ICFBamIndexColObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIdxPrevIdx != null ) {
				CFBamIndexColByIdxPrevIdxKey keyIdxPrevIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxPrevIdxKey();
				keyIdxPrevIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIdxPrevIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				keyIdxPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<CFBamIndexColPKey, ICFBamIndexColObj > mapIdxPrevIdx = indexByIdxPrevIdx.get( keyIdxPrevIdx );
				if( mapIdxPrevIdx != null ) {
					mapIdxPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIdxNextIdx != null ) {
				CFBamIndexColByIdxNextIdxKey keyIdxNextIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxNextIdxKey();
				keyIdxNextIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIdxNextIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				keyIdxNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<CFBamIndexColPKey, ICFBamIndexColObj > mapIdxNextIdx = indexByIdxNextIdx.get( keyIdxNextIdx );
				if( mapIdxNextIdx != null ) {
					mapIdxNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFBamIndexColObj createIndexCol( ICFBamIndexColObj Obj ) {
		ICFBamIndexColObj obj = Obj;
		CFBamIndexColBuff buff = obj.getIndexColBuff();
		((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().createIndexCol(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		ICFBamIndexColObj prev = obj.getOptionalLookupPrev();
		if( prev != null ) {
			prev.read( true );
		}
		obj.endEdit();
		return( obj );
	}

	public ICFBamIndexColObj readIndexCol( CFBamIndexColPKey pkey ) {
		return( readIndexCol( pkey, false ) );
	}

	public ICFBamIndexColObj readIndexCol( CFBamIndexColPKey pkey, boolean forceRead ) {
		ICFBamIndexColObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFBamIndexColBuff readBuff = ((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getIndexColTableObj().newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFBamIndexColObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamIndexColObj readCachedIndexCol( CFBamIndexColPKey pkey ) {
		ICFBamIndexColObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeIndexCol( ICFBamIndexColObj obj )
	{
		final String S_ProcName = "CFBamIndexColTableObj.reallyDeepDisposeIndexCol() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFBamIndexColPKey pkey = obj.getPKey();
		ICFBamIndexColObj existing = readCachedIndexCol( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFBamIndexColByUNameIdxKey keyUNameIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredIndexId( existing.getRequiredIndexId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		CFBamIndexColByIdxColTenantIdxKey keyIdxColTenantIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxColTenantIdxKey();
		keyIdxColTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		CFBamIndexColByIndexIdxKey keyIndexIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIndexIdxKey();
		keyIndexIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyIndexIdx.setRequiredIndexId( existing.getRequiredIndexId() );

		CFBamIndexColByDefSchemaIdxKey keyDefSchemaIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		CFBamIndexColByColIdxKey keyColIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newColIdxKey();
		keyColIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyColIdx.setRequiredColumnId( existing.getRequiredColumnId() );

		CFBamIndexColByPrevIdxKey keyPrevIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		CFBamIndexColByNextIdxKey keyNextIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newNextIdxKey();
		keyNextIdx.setOptionalNextTenantId( existing.getOptionalNextTenantId() );
		keyNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		CFBamIndexColByIdxPrevIdxKey keyIdxPrevIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxPrevIdxKey();
		keyIdxPrevIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyIdxPrevIdx.setRequiredIndexId( existing.getRequiredIndexId() );
		keyIdxPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		CFBamIndexColByIdxNextIdxKey keyIdxNextIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxNextIdxKey();
		keyIdxNextIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyIdxNextIdx.setRequiredIndexId( existing.getRequiredIndexId() );
		keyIdxNextIdx.setOptionalNextId( existing.getOptionalNextId() );


					schema.getRelationColTableObj().deepDisposeRelationColByFromColIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );
					schema.getRelationColTableObj().deepDisposeRelationColByToColIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}

		if( indexByIdxColTenantIdx != null ) {
			if( indexByIdxColTenantIdx.containsKey( keyIdxColTenantIdx ) ) {
				indexByIdxColTenantIdx.get( keyIdxColTenantIdx ).remove( pkey );
				if( indexByIdxColTenantIdx.get( keyIdxColTenantIdx ).size() <= 0 ) {
					indexByIdxColTenantIdx.remove( keyIdxColTenantIdx );
				}
			}
		}

		if( indexByIndexIdx != null ) {
			if( indexByIndexIdx.containsKey( keyIndexIdx ) ) {
				indexByIndexIdx.get( keyIndexIdx ).remove( pkey );
				if( indexByIndexIdx.get( keyIndexIdx ).size() <= 0 ) {
					indexByIndexIdx.remove( keyIndexIdx );
				}
			}
		}

		if( indexByDefSchemaIdx != null ) {
			if( indexByDefSchemaIdx.containsKey( keyDefSchemaIdx ) ) {
				indexByDefSchemaIdx.get( keyDefSchemaIdx ).remove( pkey );
				if( indexByDefSchemaIdx.get( keyDefSchemaIdx ).size() <= 0 ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}
		}

		if( indexByColIdx != null ) {
			if( indexByColIdx.containsKey( keyColIdx ) ) {
				indexByColIdx.get( keyColIdx ).remove( pkey );
				if( indexByColIdx.get( keyColIdx ).size() <= 0 ) {
					indexByColIdx.remove( keyColIdx );
				}
			}
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

		if( indexByIdxPrevIdx != null ) {
			if( indexByIdxPrevIdx.containsKey( keyIdxPrevIdx ) ) {
				indexByIdxPrevIdx.get( keyIdxPrevIdx ).remove( pkey );
				if( indexByIdxPrevIdx.get( keyIdxPrevIdx ).size() <= 0 ) {
					indexByIdxPrevIdx.remove( keyIdxPrevIdx );
				}
			}
		}

		if( indexByIdxNextIdx != null ) {
			if( indexByIdxNextIdx.containsKey( keyIdxNextIdx ) ) {
				indexByIdxNextIdx.get( keyIdxNextIdx ).remove( pkey );
				if( indexByIdxNextIdx.get( keyIdxNextIdx ).size() <= 0 ) {
					indexByIdxNextIdx.remove( keyIdxNextIdx );
				}
			}
		}


	}
	public void deepDisposeIndexCol( CFBamIndexColPKey pkey ) {
		ICFBamIndexColObj obj = readCachedIndexCol( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamIndexColObj lockIndexCol( CFBamIndexColPKey pkey ) {
		ICFBamIndexColObj locked = null;
		CFBamIndexColBuff lockBuff = ((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getIndexColTableObj().newInstance();
			locked.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFBamIndexColObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockIndexCol", pkey );
		}
		return( locked );
	}

	public List<ICFBamIndexColObj> readAllIndexCol() {
		return( readAllIndexCol( false ) );
	}

	public List<ICFBamIndexColObj> readAllIndexCol( boolean forceRead ) {
		final String S_ProcName = "readAllIndexCol";
		if( ( allIndexCol == null ) || forceRead ) {
			Map<CFBamIndexColPKey, ICFBamIndexColObj> map = new HashMap<CFBamIndexColPKey,ICFBamIndexColObj>();
			allIndexCol = map;
			CFBamIndexColBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().readAllDerived( schema.getAuthorization() );
			CFBamIndexColBuff buff;
			ICFBamIndexColObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
				obj.setBuff( buff );
				ICFBamIndexColObj realised = (ICFBamIndexColObj)obj.realise();
			}
		}
		int len = allIndexCol.size();
		ICFBamIndexColObj arr[] = new ICFBamIndexColObj[len];
		Iterator<ICFBamIndexColObj> valIter = allIndexCol.values().iterator();
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
		ArrayList<ICFBamIndexColObj> arrayList = new ArrayList<ICFBamIndexColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamIndexColObj> cmp = new Comparator<ICFBamIndexColObj>() {
			public int compare( ICFBamIndexColObj lhs, ICFBamIndexColObj rhs ) {
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
					CFBamIndexColPKey lhsPKey = lhs.getPKey();
					CFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamIndexColObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamIndexColObj> readCachedAllIndexCol() {
		final String S_ProcName = "readCachedAllIndexCol";
		ArrayList<ICFBamIndexColObj> arrayList = new ArrayList<ICFBamIndexColObj>();
		if( allIndexCol != null ) {
			int len = allIndexCol.size();
			ICFBamIndexColObj arr[] = new ICFBamIndexColObj[len];
			Iterator<ICFBamIndexColObj> valIter = allIndexCol.values().iterator();
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
		Comparator<ICFBamIndexColObj> cmp = new Comparator<ICFBamIndexColObj>() {
			public int compare( ICFBamIndexColObj lhs, ICFBamIndexColObj rhs ) {
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
					CFBamIndexColPKey lhsPKey = lhs.getPKey();
					CFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFBamIndexColObj readIndexColByIdIdx( long TenantId,
		long Id )
	{
		return( readIndexColByIdIdx( TenantId,
			Id,
			false ) );
	}

	public ICFBamIndexColObj readIndexColByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		CFBamIndexColPKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamIndexColObj obj = readIndexCol( pkey, forceRead );
		return( obj );
	}

	public ICFBamIndexColObj readIndexColByUNameIdx( long TenantId,
		long IndexId,
		String Name )
	{
		return( readIndexColByUNameIdx( TenantId,
			IndexId,
			Name,
			false ) );
	}

	public ICFBamIndexColObj readIndexColByUNameIdx( long TenantId,
		long IndexId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamIndexColByUNameIdxKey,
				ICFBamIndexColObj >();
		}
		CFBamIndexColByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		key.setRequiredName( Name );
		ICFBamIndexColObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			CFBamIndexColBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				IndexId,
				Name );
			if( buff != null ) {
				obj = schema.getIndexColTableObj().newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamIndexColObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<ICFBamIndexColObj> readIndexColByIdxColTenantIdx( long TenantId )
	{
		return( readIndexColByIdxColTenantIdx( TenantId,
			false ) );
	}

	public List<ICFBamIndexColObj> readIndexColByIdxColTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexColByIdxColTenantIdx";
		CFBamIndexColByIdxColTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxColTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFBamIndexColPKey, ICFBamIndexColObj> dict;
		if( indexByIdxColTenantIdx == null ) {
			indexByIdxColTenantIdx = new HashMap< CFBamIndexColByIdxColTenantIdxKey,
				Map< CFBamIndexColPKey, ICFBamIndexColObj > >();
		}
		if( ( ! forceRead ) && indexByIdxColTenantIdx.containsKey( key ) ) {
			dict = indexByIdxColTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamIndexColPKey, ICFBamIndexColObj>();
			ICFBamIndexColObj obj;
			CFBamIndexColBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().readDerivedByIdxColTenantIdx( schema.getAuthorization(),
				TenantId );
			CFBamIndexColBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getIndexColTableObj().newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
				obj.setBuff( buff );
				ICFBamIndexColObj realised = (ICFBamIndexColObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByIdxColTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamIndexColObj arr[] = new ICFBamIndexColObj[len];
		Iterator<ICFBamIndexColObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamIndexColObj> arrayList = new ArrayList<ICFBamIndexColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamIndexColObj> cmp = new Comparator<ICFBamIndexColObj>() {
			public int compare( ICFBamIndexColObj lhs, ICFBamIndexColObj rhs ) {
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
					CFBamIndexColPKey lhsPKey = lhs.getPKey();
					CFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamIndexColObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamIndexColObj> readIndexColByIndexIdx( long TenantId,
		long IndexId )
	{
		return( readIndexColByIndexIdx( TenantId,
			IndexId,
			false ) );
	}

	public List<ICFBamIndexColObj> readIndexColByIndexIdx( long TenantId,
		long IndexId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexColByIndexIdx";
		CFBamIndexColByIndexIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIndexIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		Map<CFBamIndexColPKey, ICFBamIndexColObj> dict;
		if( indexByIndexIdx == null ) {
			indexByIndexIdx = new HashMap< CFBamIndexColByIndexIdxKey,
				Map< CFBamIndexColPKey, ICFBamIndexColObj > >();
		}
		if( ( ! forceRead ) && indexByIndexIdx.containsKey( key ) ) {
			dict = indexByIndexIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamIndexColPKey, ICFBamIndexColObj>();
			ICFBamIndexColObj obj;
			CFBamIndexColBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().readDerivedByIndexIdx( schema.getAuthorization(),
				TenantId,
				IndexId );
			CFBamIndexColBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getIndexColTableObj().newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
				obj.setBuff( buff );
				ICFBamIndexColObj realised = (ICFBamIndexColObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByIndexIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamIndexColObj arr[] = new ICFBamIndexColObj[len];
		Iterator<ICFBamIndexColObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamIndexColObj> arrayList = new ArrayList<ICFBamIndexColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamIndexColObj> cmp = new Comparator<ICFBamIndexColObj>() {
			public int compare( ICFBamIndexColObj lhs, ICFBamIndexColObj rhs ) {
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
					CFBamIndexColPKey lhsPKey = lhs.getPKey();
					CFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamIndexColObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamIndexColObj> readIndexColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readIndexColByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<ICFBamIndexColObj> readIndexColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexColByDefSchemaIdx";
		CFBamIndexColByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<CFBamIndexColPKey, ICFBamIndexColObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamIndexColByDefSchemaIdxKey,
				Map< CFBamIndexColPKey, ICFBamIndexColObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamIndexColPKey, ICFBamIndexColObj>();
			ICFBamIndexColObj obj;
			CFBamIndexColBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			CFBamIndexColBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getIndexColTableObj().newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
				obj.setBuff( buff );
				ICFBamIndexColObj realised = (ICFBamIndexColObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamIndexColObj arr[] = new ICFBamIndexColObj[len];
		Iterator<ICFBamIndexColObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamIndexColObj> arrayList = new ArrayList<ICFBamIndexColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamIndexColObj> cmp = new Comparator<ICFBamIndexColObj>() {
			public int compare( ICFBamIndexColObj lhs, ICFBamIndexColObj rhs ) {
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
					CFBamIndexColPKey lhsPKey = lhs.getPKey();
					CFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamIndexColObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamIndexColObj> readIndexColByColIdx( long TenantId,
		long ColumnId )
	{
		return( readIndexColByColIdx( TenantId,
			ColumnId,
			false ) );
	}

	public List<ICFBamIndexColObj> readIndexColByColIdx( long TenantId,
		long ColumnId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexColByColIdx";
		CFBamIndexColByColIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newColIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredColumnId( ColumnId );
		Map<CFBamIndexColPKey, ICFBamIndexColObj> dict;
		if( indexByColIdx == null ) {
			indexByColIdx = new HashMap< CFBamIndexColByColIdxKey,
				Map< CFBamIndexColPKey, ICFBamIndexColObj > >();
		}
		if( ( ! forceRead ) && indexByColIdx.containsKey( key ) ) {
			dict = indexByColIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamIndexColPKey, ICFBamIndexColObj>();
			ICFBamIndexColObj obj;
			CFBamIndexColBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().readDerivedByColIdx( schema.getAuthorization(),
				TenantId,
				ColumnId );
			CFBamIndexColBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getIndexColTableObj().newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
				obj.setBuff( buff );
				ICFBamIndexColObj realised = (ICFBamIndexColObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByColIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamIndexColObj arr[] = new ICFBamIndexColObj[len];
		Iterator<ICFBamIndexColObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamIndexColObj> arrayList = new ArrayList<ICFBamIndexColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamIndexColObj> cmp = new Comparator<ICFBamIndexColObj>() {
			public int compare( ICFBamIndexColObj lhs, ICFBamIndexColObj rhs ) {
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
					CFBamIndexColPKey lhsPKey = lhs.getPKey();
					CFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamIndexColObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamIndexColObj> readIndexColByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		return( readIndexColByPrevIdx( PrevTenantId,
			PrevId,
			false ) );
	}

	public List<ICFBamIndexColObj> readIndexColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexColByPrevIdx";
		CFBamIndexColByPrevIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		Map<CFBamIndexColPKey, ICFBamIndexColObj> dict;
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< CFBamIndexColByPrevIdxKey,
				Map< CFBamIndexColPKey, ICFBamIndexColObj > >();
		}
		if( ( ! forceRead ) && indexByPrevIdx.containsKey( key ) ) {
			dict = indexByPrevIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamIndexColPKey, ICFBamIndexColObj>();
			ICFBamIndexColObj obj;
			CFBamIndexColBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().readDerivedByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			CFBamIndexColBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getIndexColTableObj().newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
				obj.setBuff( buff );
				ICFBamIndexColObj realised = (ICFBamIndexColObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPrevIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamIndexColObj arr[] = new ICFBamIndexColObj[len];
		Iterator<ICFBamIndexColObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamIndexColObj> arrayList = new ArrayList<ICFBamIndexColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamIndexColObj> cmp = new Comparator<ICFBamIndexColObj>() {
			public int compare( ICFBamIndexColObj lhs, ICFBamIndexColObj rhs ) {
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
					CFBamIndexColPKey lhsPKey = lhs.getPKey();
					CFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamIndexColObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamIndexColObj> readIndexColByNextIdx( Long NextTenantId,
		Long NextId )
	{
		return( readIndexColByNextIdx( NextTenantId,
			NextId,
			false ) );
	}

	public List<ICFBamIndexColObj> readIndexColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexColByNextIdx";
		CFBamIndexColByNextIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		Map<CFBamIndexColPKey, ICFBamIndexColObj> dict;
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< CFBamIndexColByNextIdxKey,
				Map< CFBamIndexColPKey, ICFBamIndexColObj > >();
		}
		if( ( ! forceRead ) && indexByNextIdx.containsKey( key ) ) {
			dict = indexByNextIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamIndexColPKey, ICFBamIndexColObj>();
			ICFBamIndexColObj obj;
			CFBamIndexColBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().readDerivedByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			CFBamIndexColBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getIndexColTableObj().newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
				obj.setBuff( buff );
				ICFBamIndexColObj realised = (ICFBamIndexColObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByNextIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamIndexColObj arr[] = new ICFBamIndexColObj[len];
		Iterator<ICFBamIndexColObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamIndexColObj> arrayList = new ArrayList<ICFBamIndexColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamIndexColObj> cmp = new Comparator<ICFBamIndexColObj>() {
			public int compare( ICFBamIndexColObj lhs, ICFBamIndexColObj rhs ) {
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
					CFBamIndexColPKey lhsPKey = lhs.getPKey();
					CFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamIndexColObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamIndexColObj> readIndexColByIdxPrevIdx( long TenantId,
		long IndexId,
		Long PrevId )
	{
		return( readIndexColByIdxPrevIdx( TenantId,
			IndexId,
			PrevId,
			false ) );
	}

	public List<ICFBamIndexColObj> readIndexColByIdxPrevIdx( long TenantId,
		long IndexId,
		Long PrevId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexColByIdxPrevIdx";
		CFBamIndexColByIdxPrevIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		key.setOptionalPrevId( PrevId );
		Map<CFBamIndexColPKey, ICFBamIndexColObj> dict;
		if( indexByIdxPrevIdx == null ) {
			indexByIdxPrevIdx = new HashMap< CFBamIndexColByIdxPrevIdxKey,
				Map< CFBamIndexColPKey, ICFBamIndexColObj > >();
		}
		if( ( ! forceRead ) && indexByIdxPrevIdx.containsKey( key ) ) {
			dict = indexByIdxPrevIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamIndexColPKey, ICFBamIndexColObj>();
			ICFBamIndexColObj obj;
			CFBamIndexColBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().readDerivedByIdxPrevIdx( schema.getAuthorization(),
				TenantId,
				IndexId,
				PrevId );
			CFBamIndexColBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getIndexColTableObj().newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
				obj.setBuff( buff );
				ICFBamIndexColObj realised = (ICFBamIndexColObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByIdxPrevIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamIndexColObj arr[] = new ICFBamIndexColObj[len];
		Iterator<ICFBamIndexColObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamIndexColObj> arrayList = new ArrayList<ICFBamIndexColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamIndexColObj> cmp = new Comparator<ICFBamIndexColObj>() {
			public int compare( ICFBamIndexColObj lhs, ICFBamIndexColObj rhs ) {
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
					CFBamIndexColPKey lhsPKey = lhs.getPKey();
					CFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamIndexColObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamIndexColObj> readIndexColByIdxNextIdx( long TenantId,
		long IndexId,
		Long NextId )
	{
		return( readIndexColByIdxNextIdx( TenantId,
			IndexId,
			NextId,
			false ) );
	}

	public List<ICFBamIndexColObj> readIndexColByIdxNextIdx( long TenantId,
		long IndexId,
		Long NextId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexColByIdxNextIdx";
		CFBamIndexColByIdxNextIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		key.setOptionalNextId( NextId );
		Map<CFBamIndexColPKey, ICFBamIndexColObj> dict;
		if( indexByIdxNextIdx == null ) {
			indexByIdxNextIdx = new HashMap< CFBamIndexColByIdxNextIdxKey,
				Map< CFBamIndexColPKey, ICFBamIndexColObj > >();
		}
		if( ( ! forceRead ) && indexByIdxNextIdx.containsKey( key ) ) {
			dict = indexByIdxNextIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamIndexColPKey, ICFBamIndexColObj>();
			ICFBamIndexColObj obj;
			CFBamIndexColBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().readDerivedByIdxNextIdx( schema.getAuthorization(),
				TenantId,
				IndexId,
				NextId );
			CFBamIndexColBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getIndexColTableObj().newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
				obj.setBuff( buff );
				ICFBamIndexColObj realised = (ICFBamIndexColObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByIdxNextIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamIndexColObj arr[] = new ICFBamIndexColObj[len];
		Iterator<ICFBamIndexColObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamIndexColObj> arrayList = new ArrayList<ICFBamIndexColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamIndexColObj> cmp = new Comparator<ICFBamIndexColObj>() {
			public int compare( ICFBamIndexColObj lhs, ICFBamIndexColObj rhs ) {
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
					CFBamIndexColPKey lhsPKey = lhs.getPKey();
					CFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamIndexColObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamIndexColObj readCachedIndexColByIdIdx( long TenantId,
		long Id )
	{
		ICFBamIndexColObj obj = null;
		CFBamIndexColPKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedIndexCol( pkey );
		return( obj );
	}

	public ICFBamIndexColObj readCachedIndexColByUNameIdx( long TenantId,
		long IndexId,
		String Name )
	{
		ICFBamIndexColObj obj = null;
		CFBamIndexColByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<ICFBamIndexColObj> valIter = members.values().iterator();
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
			Iterator<ICFBamIndexColObj> valIter = members.values().iterator();
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

	public List<ICFBamIndexColObj> readCachedIndexColByIdxColTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedIndexColByIdxColTenantIdx";
		CFBamIndexColByIdxColTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxColTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFBamIndexColObj> arrayList = new ArrayList<ICFBamIndexColObj>();
		if( indexByIdxColTenantIdx != null ) {
			Map<CFBamIndexColPKey, ICFBamIndexColObj> dict;
			if( indexByIdxColTenantIdx.containsKey( key ) ) {
				dict = indexByIdxColTenantIdx.get( key );
				int len = dict.size();
				ICFBamIndexColObj arr[] = new ICFBamIndexColObj[len];
				Iterator<ICFBamIndexColObj> valIter = dict.values().iterator();
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
			ICFBamIndexColObj obj;
			Iterator<ICFBamIndexColObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamIndexColObj> cmp = new Comparator<ICFBamIndexColObj>() {
			public int compare( ICFBamIndexColObj lhs, ICFBamIndexColObj rhs ) {
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
					CFBamIndexColPKey lhsPKey = lhs.getPKey();
					CFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamIndexColObj> readCachedIndexColByIndexIdx( long TenantId,
		long IndexId )
	{
		final String S_ProcName = "readCachedIndexColByIndexIdx";
		CFBamIndexColByIndexIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIndexIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		ArrayList<ICFBamIndexColObj> arrayList = new ArrayList<ICFBamIndexColObj>();
		if( indexByIndexIdx != null ) {
			Map<CFBamIndexColPKey, ICFBamIndexColObj> dict;
			if( indexByIndexIdx.containsKey( key ) ) {
				dict = indexByIndexIdx.get( key );
				int len = dict.size();
				ICFBamIndexColObj arr[] = new ICFBamIndexColObj[len];
				Iterator<ICFBamIndexColObj> valIter = dict.values().iterator();
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
			ICFBamIndexColObj obj;
			Iterator<ICFBamIndexColObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamIndexColObj> cmp = new Comparator<ICFBamIndexColObj>() {
			public int compare( ICFBamIndexColObj lhs, ICFBamIndexColObj rhs ) {
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
					CFBamIndexColPKey lhsPKey = lhs.getPKey();
					CFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamIndexColObj> readCachedIndexColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedIndexColByDefSchemaIdx";
		CFBamIndexColByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<ICFBamIndexColObj> arrayList = new ArrayList<ICFBamIndexColObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<CFBamIndexColPKey, ICFBamIndexColObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				ICFBamIndexColObj arr[] = new ICFBamIndexColObj[len];
				Iterator<ICFBamIndexColObj> valIter = dict.values().iterator();
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
			ICFBamIndexColObj obj;
			Iterator<ICFBamIndexColObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamIndexColObj> cmp = new Comparator<ICFBamIndexColObj>() {
			public int compare( ICFBamIndexColObj lhs, ICFBamIndexColObj rhs ) {
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
					CFBamIndexColPKey lhsPKey = lhs.getPKey();
					CFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamIndexColObj> readCachedIndexColByColIdx( long TenantId,
		long ColumnId )
	{
		final String S_ProcName = "readCachedIndexColByColIdx";
		CFBamIndexColByColIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newColIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredColumnId( ColumnId );
		ArrayList<ICFBamIndexColObj> arrayList = new ArrayList<ICFBamIndexColObj>();
		if( indexByColIdx != null ) {
			Map<CFBamIndexColPKey, ICFBamIndexColObj> dict;
			if( indexByColIdx.containsKey( key ) ) {
				dict = indexByColIdx.get( key );
				int len = dict.size();
				ICFBamIndexColObj arr[] = new ICFBamIndexColObj[len];
				Iterator<ICFBamIndexColObj> valIter = dict.values().iterator();
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
			ICFBamIndexColObj obj;
			Iterator<ICFBamIndexColObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamIndexColObj> cmp = new Comparator<ICFBamIndexColObj>() {
			public int compare( ICFBamIndexColObj lhs, ICFBamIndexColObj rhs ) {
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
					CFBamIndexColPKey lhsPKey = lhs.getPKey();
					CFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamIndexColObj> readCachedIndexColByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "readCachedIndexColByPrevIdx";
		CFBamIndexColByPrevIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		ArrayList<ICFBamIndexColObj> arrayList = new ArrayList<ICFBamIndexColObj>();
		if( indexByPrevIdx != null ) {
			Map<CFBamIndexColPKey, ICFBamIndexColObj> dict;
			if( indexByPrevIdx.containsKey( key ) ) {
				dict = indexByPrevIdx.get( key );
				int len = dict.size();
				ICFBamIndexColObj arr[] = new ICFBamIndexColObj[len];
				Iterator<ICFBamIndexColObj> valIter = dict.values().iterator();
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
			ICFBamIndexColObj obj;
			Iterator<ICFBamIndexColObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamIndexColObj> cmp = new Comparator<ICFBamIndexColObj>() {
			public int compare( ICFBamIndexColObj lhs, ICFBamIndexColObj rhs ) {
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
					CFBamIndexColPKey lhsPKey = lhs.getPKey();
					CFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamIndexColObj> readCachedIndexColByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "readCachedIndexColByNextIdx";
		CFBamIndexColByNextIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		ArrayList<ICFBamIndexColObj> arrayList = new ArrayList<ICFBamIndexColObj>();
		if( indexByNextIdx != null ) {
			Map<CFBamIndexColPKey, ICFBamIndexColObj> dict;
			if( indexByNextIdx.containsKey( key ) ) {
				dict = indexByNextIdx.get( key );
				int len = dict.size();
				ICFBamIndexColObj arr[] = new ICFBamIndexColObj[len];
				Iterator<ICFBamIndexColObj> valIter = dict.values().iterator();
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
			ICFBamIndexColObj obj;
			Iterator<ICFBamIndexColObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamIndexColObj> cmp = new Comparator<ICFBamIndexColObj>() {
			public int compare( ICFBamIndexColObj lhs, ICFBamIndexColObj rhs ) {
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
					CFBamIndexColPKey lhsPKey = lhs.getPKey();
					CFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamIndexColObj> readCachedIndexColByIdxPrevIdx( long TenantId,
		long IndexId,
		Long PrevId )
	{
		final String S_ProcName = "readCachedIndexColByIdxPrevIdx";
		CFBamIndexColByIdxPrevIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		key.setOptionalPrevId( PrevId );
		ArrayList<ICFBamIndexColObj> arrayList = new ArrayList<ICFBamIndexColObj>();
		if( indexByIdxPrevIdx != null ) {
			Map<CFBamIndexColPKey, ICFBamIndexColObj> dict;
			if( indexByIdxPrevIdx.containsKey( key ) ) {
				dict = indexByIdxPrevIdx.get( key );
				int len = dict.size();
				ICFBamIndexColObj arr[] = new ICFBamIndexColObj[len];
				Iterator<ICFBamIndexColObj> valIter = dict.values().iterator();
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
			ICFBamIndexColObj obj;
			Iterator<ICFBamIndexColObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamIndexColObj> cmp = new Comparator<ICFBamIndexColObj>() {
			public int compare( ICFBamIndexColObj lhs, ICFBamIndexColObj rhs ) {
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
					CFBamIndexColPKey lhsPKey = lhs.getPKey();
					CFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamIndexColObj> readCachedIndexColByIdxNextIdx( long TenantId,
		long IndexId,
		Long NextId )
	{
		final String S_ProcName = "readCachedIndexColByIdxNextIdx";
		CFBamIndexColByIdxNextIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		key.setOptionalNextId( NextId );
		ArrayList<ICFBamIndexColObj> arrayList = new ArrayList<ICFBamIndexColObj>();
		if( indexByIdxNextIdx != null ) {
			Map<CFBamIndexColPKey, ICFBamIndexColObj> dict;
			if( indexByIdxNextIdx.containsKey( key ) ) {
				dict = indexByIdxNextIdx.get( key );
				int len = dict.size();
				ICFBamIndexColObj arr[] = new ICFBamIndexColObj[len];
				Iterator<ICFBamIndexColObj> valIter = dict.values().iterator();
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
			ICFBamIndexColObj obj;
			Iterator<ICFBamIndexColObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamIndexColObj> cmp = new Comparator<ICFBamIndexColObj>() {
			public int compare( ICFBamIndexColObj lhs, ICFBamIndexColObj rhs ) {
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
					CFBamIndexColPKey lhsPKey = lhs.getPKey();
					CFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeIndexColByIdIdx( long TenantId,
		long Id )
	{
		ICFBamIndexColObj obj = readCachedIndexColByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeIndexColByUNameIdx( long TenantId,
		long IndexId,
		String Name )
	{
		ICFBamIndexColObj obj = readCachedIndexColByUNameIdx( TenantId,
				IndexId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeIndexColByIdxColTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeIndexColByIdxColTenantIdx";
		ICFBamIndexColObj obj;
		List<ICFBamIndexColObj> arrayList = readCachedIndexColByIdxColTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFBamIndexColObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeIndexColByIndexIdx( long TenantId,
		long IndexId )
	{
		final String S_ProcName = "deepDisposeIndexColByIndexIdx";
		ICFBamIndexColObj obj;
		List<ICFBamIndexColObj> arrayList = readCachedIndexColByIndexIdx( TenantId,
				IndexId );
		if( arrayList != null )  {
			Iterator<ICFBamIndexColObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeIndexColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeIndexColByDefSchemaIdx";
		ICFBamIndexColObj obj;
		List<ICFBamIndexColObj> arrayList = readCachedIndexColByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<ICFBamIndexColObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeIndexColByColIdx( long TenantId,
		long ColumnId )
	{
		final String S_ProcName = "deepDisposeIndexColByColIdx";
		ICFBamIndexColObj obj;
		List<ICFBamIndexColObj> arrayList = readCachedIndexColByColIdx( TenantId,
				ColumnId );
		if( arrayList != null )  {
			Iterator<ICFBamIndexColObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeIndexColByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "deepDisposeIndexColByPrevIdx";
		ICFBamIndexColObj obj;
		List<ICFBamIndexColObj> arrayList = readCachedIndexColByPrevIdx( PrevTenantId,
				PrevId );
		if( arrayList != null )  {
			Iterator<ICFBamIndexColObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeIndexColByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "deepDisposeIndexColByNextIdx";
		ICFBamIndexColObj obj;
		List<ICFBamIndexColObj> arrayList = readCachedIndexColByNextIdx( NextTenantId,
				NextId );
		if( arrayList != null )  {
			Iterator<ICFBamIndexColObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeIndexColByIdxPrevIdx( long TenantId,
		long IndexId,
		Long PrevId )
	{
		final String S_ProcName = "deepDisposeIndexColByIdxPrevIdx";
		ICFBamIndexColObj obj;
		List<ICFBamIndexColObj> arrayList = readCachedIndexColByIdxPrevIdx( TenantId,
				IndexId,
				PrevId );
		if( arrayList != null )  {
			Iterator<ICFBamIndexColObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeIndexColByIdxNextIdx( long TenantId,
		long IndexId,
		Long NextId )
	{
		final String S_ProcName = "deepDisposeIndexColByIdxNextIdx";
		ICFBamIndexColObj obj;
		List<ICFBamIndexColObj> arrayList = readCachedIndexColByIdxNextIdx( TenantId,
				IndexId,
				NextId );
		if( arrayList != null )  {
			Iterator<ICFBamIndexColObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public ICFBamIndexColObj updateIndexCol( ICFBamIndexColObj Obj ) {
		ICFBamIndexColObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().updateIndexCol( schema.getAuthorization(),
			Obj.getIndexColBuff() );
		obj = (ICFBamIndexColObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteIndexCol( ICFBamIndexColObj Obj ) {
		ICFBamIndexColObj obj = Obj;
		ICFBamIndexColObj prev = obj.getOptionalLookupPrev();
		ICFBamIndexColObj next = obj.getOptionalLookupNext();
		((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexCol( schema.getAuthorization(),
			obj.getIndexColBuff() );
		Obj.forget();
		if( prev != null ) {
			prev.read( true );
		}
		if( next != null ) {
			next.read( true );
		}
	}

	public void deleteIndexColByIdIdx( long TenantId,
		long Id )
	{
		CFBamIndexColPKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamIndexColObj obj = readIndexCol( pkey );
		if( obj != null ) {
			ICFBamIndexColEditObj editObj = (ICFBamIndexColEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFBamIndexColEditObj)obj.beginEdit();
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
		deepDisposeIndexColByIdIdx( TenantId,
				Id );
	}

	public void deleteIndexColByUNameIdx( long TenantId,
		long IndexId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamIndexColByUNameIdxKey,
				ICFBamIndexColObj >();
		}
		CFBamIndexColByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		key.setRequiredName( Name );
		ICFBamIndexColObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByUNameIdx( schema.getAuthorization(),
				TenantId,
				IndexId,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByUNameIdx( schema.getAuthorization(),
				TenantId,
				IndexId,
				Name );
		}
		deepDisposeIndexColByUNameIdx( TenantId,
				IndexId,
				Name );
	}

	public void deleteIndexColByIdxColTenantIdx( long TenantId )
	{
		CFBamIndexColByIdxColTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxColTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByIdxColTenantIdx == null ) {
			indexByIdxColTenantIdx = new HashMap< CFBamIndexColByIdxColTenantIdxKey,
				Map< CFBamIndexColPKey, ICFBamIndexColObj > >();
		}
		if( indexByIdxColTenantIdx.containsKey( key ) ) {
			Map<CFBamIndexColPKey, ICFBamIndexColObj> dict = indexByIdxColTenantIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByIdxColTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFBamIndexColObj> iter = dict.values().iterator();
			ICFBamIndexColObj obj;
			List<ICFBamIndexColObj> toForget = new LinkedList<ICFBamIndexColObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByIdxColTenantIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByIdxColTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeIndexColByIdxColTenantIdx( TenantId );
	}

	public void deleteIndexColByIndexIdx( long TenantId,
		long IndexId )
	{
		CFBamIndexColByIndexIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIndexIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		if( indexByIndexIdx == null ) {
			indexByIndexIdx = new HashMap< CFBamIndexColByIndexIdxKey,
				Map< CFBamIndexColPKey, ICFBamIndexColObj > >();
		}
		if( indexByIndexIdx.containsKey( key ) ) {
			Map<CFBamIndexColPKey, ICFBamIndexColObj> dict = indexByIndexIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByIndexIdx( schema.getAuthorization(),
				TenantId,
				IndexId );
			Iterator<ICFBamIndexColObj> iter = dict.values().iterator();
			ICFBamIndexColObj obj;
			List<ICFBamIndexColObj> toForget = new LinkedList<ICFBamIndexColObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByIndexIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByIndexIdx( schema.getAuthorization(),
				TenantId,
				IndexId );
		}
		deepDisposeIndexColByIndexIdx( TenantId,
				IndexId );
	}

	public void deleteIndexColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		CFBamIndexColByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamIndexColByDefSchemaIdxKey,
				Map< CFBamIndexColPKey, ICFBamIndexColObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<CFBamIndexColPKey, ICFBamIndexColObj> dict = indexByDefSchemaIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<ICFBamIndexColObj> iter = dict.values().iterator();
			ICFBamIndexColObj obj;
			List<ICFBamIndexColObj> toForget = new LinkedList<ICFBamIndexColObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeIndexColByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteIndexColByColIdx( long TenantId,
		long ColumnId )
	{
		CFBamIndexColByColIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newColIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredColumnId( ColumnId );
		if( indexByColIdx == null ) {
			indexByColIdx = new HashMap< CFBamIndexColByColIdxKey,
				Map< CFBamIndexColPKey, ICFBamIndexColObj > >();
		}
		if( indexByColIdx.containsKey( key ) ) {
			Map<CFBamIndexColPKey, ICFBamIndexColObj> dict = indexByColIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByColIdx( schema.getAuthorization(),
				TenantId,
				ColumnId );
			Iterator<ICFBamIndexColObj> iter = dict.values().iterator();
			ICFBamIndexColObj obj;
			List<ICFBamIndexColObj> toForget = new LinkedList<ICFBamIndexColObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByColIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByColIdx( schema.getAuthorization(),
				TenantId,
				ColumnId );
		}
		deepDisposeIndexColByColIdx( TenantId,
				ColumnId );
	}

	public void deleteIndexColByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		CFBamIndexColByPrevIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< CFBamIndexColByPrevIdxKey,
				Map< CFBamIndexColPKey, ICFBamIndexColObj > >();
		}
		if( indexByPrevIdx.containsKey( key ) ) {
			Map<CFBamIndexColPKey, ICFBamIndexColObj> dict = indexByPrevIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			Iterator<ICFBamIndexColObj> iter = dict.values().iterator();
			ICFBamIndexColObj obj;
			List<ICFBamIndexColObj> toForget = new LinkedList<ICFBamIndexColObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
		}
		deepDisposeIndexColByPrevIdx( PrevTenantId,
				PrevId );
	}

	public void deleteIndexColByNextIdx( Long NextTenantId,
		Long NextId )
	{
		CFBamIndexColByNextIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< CFBamIndexColByNextIdxKey,
				Map< CFBamIndexColPKey, ICFBamIndexColObj > >();
		}
		if( indexByNextIdx.containsKey( key ) ) {
			Map<CFBamIndexColPKey, ICFBamIndexColObj> dict = indexByNextIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			Iterator<ICFBamIndexColObj> iter = dict.values().iterator();
			ICFBamIndexColObj obj;
			List<ICFBamIndexColObj> toForget = new LinkedList<ICFBamIndexColObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
		}
		deepDisposeIndexColByNextIdx( NextTenantId,
				NextId );
	}

	public void deleteIndexColByIdxPrevIdx( long TenantId,
		long IndexId,
		Long PrevId )
	{
		CFBamIndexColByIdxPrevIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		key.setOptionalPrevId( PrevId );
		if( indexByIdxPrevIdx == null ) {
			indexByIdxPrevIdx = new HashMap< CFBamIndexColByIdxPrevIdxKey,
				Map< CFBamIndexColPKey, ICFBamIndexColObj > >();
		}
		if( indexByIdxPrevIdx.containsKey( key ) ) {
			Map<CFBamIndexColPKey, ICFBamIndexColObj> dict = indexByIdxPrevIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByIdxPrevIdx( schema.getAuthorization(),
				TenantId,
				IndexId,
				PrevId );
			Iterator<ICFBamIndexColObj> iter = dict.values().iterator();
			ICFBamIndexColObj obj;
			List<ICFBamIndexColObj> toForget = new LinkedList<ICFBamIndexColObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByIdxPrevIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByIdxPrevIdx( schema.getAuthorization(),
				TenantId,
				IndexId,
				PrevId );
		}
		deepDisposeIndexColByIdxPrevIdx( TenantId,
				IndexId,
				PrevId );
	}

	public void deleteIndexColByIdxNextIdx( long TenantId,
		long IndexId,
		Long NextId )
	{
		CFBamIndexColByIdxNextIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		key.setOptionalNextId( NextId );
		if( indexByIdxNextIdx == null ) {
			indexByIdxNextIdx = new HashMap< CFBamIndexColByIdxNextIdxKey,
				Map< CFBamIndexColPKey, ICFBamIndexColObj > >();
		}
		if( indexByIdxNextIdx.containsKey( key ) ) {
			Map<CFBamIndexColPKey, ICFBamIndexColObj> dict = indexByIdxNextIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByIdxNextIdx( schema.getAuthorization(),
				TenantId,
				IndexId,
				NextId );
			Iterator<ICFBamIndexColObj> iter = dict.values().iterator();
			ICFBamIndexColObj obj;
			List<ICFBamIndexColObj> toForget = new LinkedList<ICFBamIndexColObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByIdxNextIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByIdxNextIdx( schema.getAuthorization(),
				TenantId,
				IndexId,
				NextId );
		}
		deepDisposeIndexColByIdxNextIdx( TenantId,
				IndexId,
				NextId );
	}

	/**
	 *	Move the CFBamIndexColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamIndexColObj refreshed cache instance.
	 */
	public ICFBamIndexColObj moveUpIndexCol( ICFBamIndexColObj Obj ) {
		ICFBamIndexColObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new CFLibUsageException( getClass(),
				"moveUpIndexCol",
				"You cannot move an object that is being edited" );
		}
		CFBamIndexColBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().moveBuffUp( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getIndexColTableObj().newInstance();
			obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
			obj.setBuff( buff );
			obj = (ICFBamIndexColObj)obj.realise();
			ICFBamIndexColObj prev = obj.getOptionalLookupPrev( true );
			ICFBamIndexColObj next = obj.getOptionalLookupNext( true );
			if( next != null ) {
				ICFBamIndexColObj gnext = next.getOptionalLookupNext( true );
			}
		}
		return( obj );
	}

	/**
	 *	Move the CFBamIndexColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamIndexColObj refreshed cache instance.
	 */
	public ICFBamIndexColObj moveDownIndexCol( ICFBamIndexColObj Obj ) {
		ICFBamIndexColObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new CFLibUsageException( getClass(),
				"moveDownIndexCol",
				"You cannot move an object that is being edited" );
		}
		CFBamIndexColBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableIndexCol().moveBuffDown( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getIndexColTableObj().newInstance();
			obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
			obj.setBuff( buff );
			obj = (ICFBamIndexColObj)obj.realise();
			ICFBamIndexColObj prev = obj.getOptionalLookupPrev( true );
			if( prev != null ) {
				ICFBamIndexColObj gprev = prev.getOptionalLookupPrev( true );
			}
			ICFBamIndexColObj next = obj.getOptionalLookupNext( true );
		}
		return( obj );
	}
}