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

public class YCFBamIndexColTableObj
	implements IYCFBamIndexColTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamIndexColPKey, IYCFBamIndexColObj> members;
	private Map<YCFBamIndexColPKey, IYCFBamIndexColObj> allIndexCol;
	private Map< YCFBamIndexColByUNameIdxKey,
		IYCFBamIndexColObj > indexByUNameIdx;
	private Map< YCFBamIndexColByIdxColTenantIdxKey,
		Map<YCFBamIndexColPKey, IYCFBamIndexColObj > > indexByIdxColTenantIdx;
	private Map< YCFBamIndexColByIndexIdxKey,
		Map<YCFBamIndexColPKey, IYCFBamIndexColObj > > indexByIndexIdx;
	private Map< YCFBamIndexColByDefSchemaIdxKey,
		Map<YCFBamIndexColPKey, IYCFBamIndexColObj > > indexByDefSchemaIdx;
	private Map< YCFBamIndexColByColIdxKey,
		Map<YCFBamIndexColPKey, IYCFBamIndexColObj > > indexByColIdx;
	private Map< YCFBamIndexColByPrevIdxKey,
		Map<YCFBamIndexColPKey, IYCFBamIndexColObj > > indexByPrevIdx;
	private Map< YCFBamIndexColByNextIdxKey,
		Map<YCFBamIndexColPKey, IYCFBamIndexColObj > > indexByNextIdx;
	private Map< YCFBamIndexColByIdxPrevIdxKey,
		Map<YCFBamIndexColPKey, IYCFBamIndexColObj > > indexByIdxPrevIdx;
	private Map< YCFBamIndexColByIdxNextIdxKey,
		Map<YCFBamIndexColPKey, IYCFBamIndexColObj > > indexByIdxNextIdx;
	public static String TABLE_NAME = "IndexCol";
	public static String TABLE_DBNAME = "idxcol";

	public YCFBamIndexColTableObj() {
		schema = null;
		members = new HashMap<YCFBamIndexColPKey, IYCFBamIndexColObj>();
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

	public YCFBamIndexColTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamIndexColPKey, IYCFBamIndexColObj>();
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
		List<IYCFBamIndexColObj> toForget = new LinkedList<IYCFBamIndexColObj>();
		IYCFBamIndexColObj cur = null;
		Iterator<IYCFBamIndexColObj> iter = members.values().iterator();
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
	 *	YCFBamIndexColObj.
	 */
	public IYCFBamIndexColObj newInstance() {
		IYCFBamIndexColObj inst = new YCFBamIndexColObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamIndexColObj.
	 */
	public IYCFBamIndexColEditObj newEditInstance( IYCFBamIndexColObj orig ) {
		IYCFBamIndexColEditObj edit = new YCFBamIndexColEditObj( orig );
		return( edit );
	}

	public IYCFBamIndexColObj realiseIndexCol( IYCFBamIndexColObj Obj ) {
		IYCFBamIndexColObj obj = Obj;
		YCFBamIndexColPKey pkey = obj.getPKey();
		IYCFBamIndexColObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamIndexColObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByUNameIdx != null ) {
				YCFBamIndexColByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByIdxColTenantIdx != null ) {
				YCFBamIndexColByIdxColTenantIdxKey keyIdxColTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxColTenantIdxKey();
				keyIdxColTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamIndexColPKey, IYCFBamIndexColObj > mapIdxColTenantIdx = indexByIdxColTenantIdx.get( keyIdxColTenantIdx );
				if( mapIdxColTenantIdx != null ) {
					mapIdxColTenantIdx.remove( keepObj.getPKey() );
					if( mapIdxColTenantIdx.size() <= 0 ) {
						indexByIdxColTenantIdx.remove( keyIdxColTenantIdx );
					}
				}
			}

			if( indexByIndexIdx != null ) {
				YCFBamIndexColByIndexIdxKey keyIndexIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIndexIdxKey();
				keyIndexIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIndexIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				Map<YCFBamIndexColPKey, IYCFBamIndexColObj > mapIndexIdx = indexByIndexIdx.get( keyIndexIdx );
				if( mapIndexIdx != null ) {
					mapIndexIdx.remove( keepObj.getPKey() );
					if( mapIndexIdx.size() <= 0 ) {
						indexByIndexIdx.remove( keyIndexIdx );
					}
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamIndexColByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamIndexColPKey, IYCFBamIndexColObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.remove( keepObj.getPKey() );
					if( mapDefSchemaIdx.size() <= 0 ) {
						indexByDefSchemaIdx.remove( keyDefSchemaIdx );
					}
				}
			}

			if( indexByColIdx != null ) {
				YCFBamIndexColByColIdxKey keyColIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newColIdxKey();
				keyColIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyColIdx.setRequiredColumnId( keepObj.getRequiredColumnId() );
				Map<YCFBamIndexColPKey, IYCFBamIndexColObj > mapColIdx = indexByColIdx.get( keyColIdx );
				if( mapColIdx != null ) {
					mapColIdx.remove( keepObj.getPKey() );
					if( mapColIdx.size() <= 0 ) {
						indexByColIdx.remove( keyColIdx );
					}
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamIndexColByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamIndexColPKey, IYCFBamIndexColObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.remove( keepObj.getPKey() );
					if( mapPrevIdx.size() <= 0 ) {
						indexByPrevIdx.remove( keyPrevIdx );
					}
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamIndexColByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamIndexColPKey, IYCFBamIndexColObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.remove( keepObj.getPKey() );
					if( mapNextIdx.size() <= 0 ) {
						indexByNextIdx.remove( keyNextIdx );
					}
				}
			}

			if( indexByIdxPrevIdx != null ) {
				YCFBamIndexColByIdxPrevIdxKey keyIdxPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxPrevIdxKey();
				keyIdxPrevIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIdxPrevIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				keyIdxPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamIndexColPKey, IYCFBamIndexColObj > mapIdxPrevIdx = indexByIdxPrevIdx.get( keyIdxPrevIdx );
				if( mapIdxPrevIdx != null ) {
					mapIdxPrevIdx.remove( keepObj.getPKey() );
					if( mapIdxPrevIdx.size() <= 0 ) {
						indexByIdxPrevIdx.remove( keyIdxPrevIdx );
					}
				}
			}

			if( indexByIdxNextIdx != null ) {
				YCFBamIndexColByIdxNextIdxKey keyIdxNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxNextIdxKey();
				keyIdxNextIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIdxNextIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				keyIdxNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamIndexColPKey, IYCFBamIndexColObj > mapIdxNextIdx = indexByIdxNextIdx.get( keyIdxNextIdx );
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
				YCFBamIndexColByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByIdxColTenantIdx != null ) {
				YCFBamIndexColByIdxColTenantIdxKey keyIdxColTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxColTenantIdxKey();
				keyIdxColTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamIndexColPKey, IYCFBamIndexColObj > mapIdxColTenantIdx = indexByIdxColTenantIdx.get( keyIdxColTenantIdx );
				if( mapIdxColTenantIdx != null ) {
					mapIdxColTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIndexIdx != null ) {
				YCFBamIndexColByIndexIdxKey keyIndexIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIndexIdxKey();
				keyIndexIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIndexIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				Map<YCFBamIndexColPKey, IYCFBamIndexColObj > mapIndexIdx = indexByIndexIdx.get( keyIndexIdx );
				if( mapIndexIdx != null ) {
					mapIndexIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamIndexColByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamIndexColPKey, IYCFBamIndexColObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByColIdx != null ) {
				YCFBamIndexColByColIdxKey keyColIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newColIdxKey();
				keyColIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyColIdx.setRequiredColumnId( keepObj.getRequiredColumnId() );
				Map<YCFBamIndexColPKey, IYCFBamIndexColObj > mapColIdx = indexByColIdx.get( keyColIdx );
				if( mapColIdx != null ) {
					mapColIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamIndexColByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamIndexColPKey, IYCFBamIndexColObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamIndexColByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamIndexColPKey, IYCFBamIndexColObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIdxPrevIdx != null ) {
				YCFBamIndexColByIdxPrevIdxKey keyIdxPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxPrevIdxKey();
				keyIdxPrevIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIdxPrevIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				keyIdxPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamIndexColPKey, IYCFBamIndexColObj > mapIdxPrevIdx = indexByIdxPrevIdx.get( keyIdxPrevIdx );
				if( mapIdxPrevIdx != null ) {
					mapIdxPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIdxNextIdx != null ) {
				YCFBamIndexColByIdxNextIdxKey keyIdxNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxNextIdxKey();
				keyIdxNextIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIdxNextIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				keyIdxNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamIndexColPKey, IYCFBamIndexColObj > mapIdxNextIdx = indexByIdxNextIdx.get( keyIdxNextIdx );
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
				YCFBamIndexColByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByIdxColTenantIdx != null ) {
				YCFBamIndexColByIdxColTenantIdxKey keyIdxColTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxColTenantIdxKey();
				keyIdxColTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamIndexColPKey, IYCFBamIndexColObj > mapIdxColTenantIdx = indexByIdxColTenantIdx.get( keyIdxColTenantIdx );
				if( mapIdxColTenantIdx != null ) {
					mapIdxColTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIndexIdx != null ) {
				YCFBamIndexColByIndexIdxKey keyIndexIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIndexIdxKey();
				keyIndexIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIndexIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				Map<YCFBamIndexColPKey, IYCFBamIndexColObj > mapIndexIdx = indexByIndexIdx.get( keyIndexIdx );
				if( mapIndexIdx != null ) {
					mapIndexIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamIndexColByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamIndexColPKey, IYCFBamIndexColObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByColIdx != null ) {
				YCFBamIndexColByColIdxKey keyColIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newColIdxKey();
				keyColIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyColIdx.setRequiredColumnId( keepObj.getRequiredColumnId() );
				Map<YCFBamIndexColPKey, IYCFBamIndexColObj > mapColIdx = indexByColIdx.get( keyColIdx );
				if( mapColIdx != null ) {
					mapColIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamIndexColByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamIndexColPKey, IYCFBamIndexColObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamIndexColByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamIndexColPKey, IYCFBamIndexColObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIdxPrevIdx != null ) {
				YCFBamIndexColByIdxPrevIdxKey keyIdxPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxPrevIdxKey();
				keyIdxPrevIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIdxPrevIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				keyIdxPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamIndexColPKey, IYCFBamIndexColObj > mapIdxPrevIdx = indexByIdxPrevIdx.get( keyIdxPrevIdx );
				if( mapIdxPrevIdx != null ) {
					mapIdxPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIdxNextIdx != null ) {
				YCFBamIndexColByIdxNextIdxKey keyIdxNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxNextIdxKey();
				keyIdxNextIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIdxNextIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				keyIdxNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamIndexColPKey, IYCFBamIndexColObj > mapIdxNextIdx = indexByIdxNextIdx.get( keyIdxNextIdx );
				if( mapIdxNextIdx != null ) {
					mapIdxNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamIndexColObj createIndexCol( IYCFBamIndexColObj Obj ) {
		IYCFBamIndexColObj obj = Obj;
		YCFBamIndexColBuff buff = obj.getIndexColBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().createIndexCol(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		IYCFBamIndexColObj prev = obj.getOptionalLookupPrev();
		if( prev != null ) {
			prev.read( true );
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamIndexColObj readIndexCol( YCFBamIndexColPKey pkey ) {
		return( readIndexCol( pkey, false ) );
	}

	public IYCFBamIndexColObj readIndexCol( YCFBamIndexColPKey pkey, boolean forceRead ) {
		IYCFBamIndexColObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamIndexColBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getIndexColTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamIndexColObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamIndexColObj readCachedIndexCol( YCFBamIndexColPKey pkey ) {
		IYCFBamIndexColObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeIndexCol( IYCFBamIndexColObj obj )
	{
		final String S_ProcName = "YCFBamIndexColTableObj.reallyDeepDisposeIndexCol() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamIndexColPKey pkey = obj.getPKey();
		IYCFBamIndexColObj existing = readCachedIndexCol( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamIndexColByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredIndexId( existing.getRequiredIndexId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamIndexColByIdxColTenantIdxKey keyIdxColTenantIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxColTenantIdxKey();
		keyIdxColTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamIndexColByIndexIdxKey keyIndexIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIndexIdxKey();
		keyIndexIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyIndexIdx.setRequiredIndexId( existing.getRequiredIndexId() );

		YCFBamIndexColByDefSchemaIdxKey keyDefSchemaIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamIndexColByColIdxKey keyColIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newColIdxKey();
		keyColIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyColIdx.setRequiredColumnId( existing.getRequiredColumnId() );

		YCFBamIndexColByPrevIdxKey keyPrevIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamIndexColByNextIdxKey keyNextIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newNextIdxKey();
		keyNextIdx.setOptionalNextTenantId( existing.getOptionalNextTenantId() );
		keyNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		YCFBamIndexColByIdxPrevIdxKey keyIdxPrevIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxPrevIdxKey();
		keyIdxPrevIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyIdxPrevIdx.setRequiredIndexId( existing.getRequiredIndexId() );
		keyIdxPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamIndexColByIdxNextIdxKey keyIdxNextIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxNextIdxKey();
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
	public void deepDisposeIndexCol( YCFBamIndexColPKey pkey ) {
		IYCFBamIndexColObj obj = readCachedIndexCol( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamIndexColObj lockIndexCol( YCFBamIndexColPKey pkey ) {
		IYCFBamIndexColObj locked = null;
		YCFBamIndexColBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getIndexColTableObj().newInstance();
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamIndexColObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockIndexCol", pkey );
		}
		return( locked );
	}

	public List<IYCFBamIndexColObj> readAllIndexCol() {
		return( readAllIndexCol( false ) );
	}

	public List<IYCFBamIndexColObj> readAllIndexCol( boolean forceRead ) {
		final String S_ProcName = "readAllIndexCol";
		if( ( allIndexCol == null ) || forceRead ) {
			Map<YCFBamIndexColPKey, IYCFBamIndexColObj> map = new HashMap<YCFBamIndexColPKey,IYCFBamIndexColObj>();
			allIndexCol = map;
			YCFBamIndexColBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().readAllDerived( schema.getAuthorization() );
			YCFBamIndexColBuff buff;
			IYCFBamIndexColObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
				obj.setBuff( buff );
				IYCFBamIndexColObj realised = (IYCFBamIndexColObj)obj.realise();
			}
		}
		int len = allIndexCol.size();
		IYCFBamIndexColObj arr[] = new IYCFBamIndexColObj[len];
		Iterator<IYCFBamIndexColObj> valIter = allIndexCol.values().iterator();
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
		ArrayList<IYCFBamIndexColObj> arrayList = new ArrayList<IYCFBamIndexColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamIndexColObj> cmp = new Comparator<IYCFBamIndexColObj>() {
			public int compare( IYCFBamIndexColObj lhs, IYCFBamIndexColObj rhs ) {
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
					YCFBamIndexColPKey lhsPKey = lhs.getPKey();
					YCFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamIndexColObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamIndexColObj> readCachedAllIndexCol() {
		final String S_ProcName = "readCachedAllIndexCol";
		ArrayList<IYCFBamIndexColObj> arrayList = new ArrayList<IYCFBamIndexColObj>();
		if( allIndexCol != null ) {
			int len = allIndexCol.size();
			IYCFBamIndexColObj arr[] = new IYCFBamIndexColObj[len];
			Iterator<IYCFBamIndexColObj> valIter = allIndexCol.values().iterator();
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
		Comparator<IYCFBamIndexColObj> cmp = new Comparator<IYCFBamIndexColObj>() {
			public int compare( IYCFBamIndexColObj lhs, IYCFBamIndexColObj rhs ) {
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
					YCFBamIndexColPKey lhsPKey = lhs.getPKey();
					YCFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFBamIndexColObj readIndexColByIdIdx( long TenantId,
		long Id )
	{
		return( readIndexColByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamIndexColObj readIndexColByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamIndexColPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamIndexColObj obj = readIndexCol( pkey, forceRead );
		return( obj );
	}

	public IYCFBamIndexColObj readIndexColByUNameIdx( long TenantId,
		long IndexId,
		String Name )
	{
		return( readIndexColByUNameIdx( TenantId,
			IndexId,
			Name,
			false ) );
	}

	public IYCFBamIndexColObj readIndexColByUNameIdx( long TenantId,
		long IndexId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamIndexColByUNameIdxKey,
				IYCFBamIndexColObj >();
		}
		YCFBamIndexColByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		key.setRequiredName( Name );
		IYCFBamIndexColObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamIndexColBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				IndexId,
				Name );
			if( buff != null ) {
				obj = schema.getIndexColTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamIndexColObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamIndexColObj> readIndexColByIdxColTenantIdx( long TenantId )
	{
		return( readIndexColByIdxColTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamIndexColObj> readIndexColByIdxColTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexColByIdxColTenantIdx";
		YCFBamIndexColByIdxColTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxColTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamIndexColPKey, IYCFBamIndexColObj> dict;
		if( indexByIdxColTenantIdx == null ) {
			indexByIdxColTenantIdx = new HashMap< YCFBamIndexColByIdxColTenantIdxKey,
				Map< YCFBamIndexColPKey, IYCFBamIndexColObj > >();
		}
		if( ( ! forceRead ) && indexByIdxColTenantIdx.containsKey( key ) ) {
			dict = indexByIdxColTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamIndexColPKey, IYCFBamIndexColObj>();
			IYCFBamIndexColObj obj;
			YCFBamIndexColBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().readDerivedByIdxColTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamIndexColBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getIndexColTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
				obj.setBuff( buff );
				IYCFBamIndexColObj realised = (IYCFBamIndexColObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByIdxColTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamIndexColObj arr[] = new IYCFBamIndexColObj[len];
		Iterator<IYCFBamIndexColObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamIndexColObj> arrayList = new ArrayList<IYCFBamIndexColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamIndexColObj> cmp = new Comparator<IYCFBamIndexColObj>() {
			public int compare( IYCFBamIndexColObj lhs, IYCFBamIndexColObj rhs ) {
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
					YCFBamIndexColPKey lhsPKey = lhs.getPKey();
					YCFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamIndexColObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamIndexColObj> readIndexColByIndexIdx( long TenantId,
		long IndexId )
	{
		return( readIndexColByIndexIdx( TenantId,
			IndexId,
			false ) );
	}

	public List<IYCFBamIndexColObj> readIndexColByIndexIdx( long TenantId,
		long IndexId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexColByIndexIdx";
		YCFBamIndexColByIndexIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIndexIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		Map<YCFBamIndexColPKey, IYCFBamIndexColObj> dict;
		if( indexByIndexIdx == null ) {
			indexByIndexIdx = new HashMap< YCFBamIndexColByIndexIdxKey,
				Map< YCFBamIndexColPKey, IYCFBamIndexColObj > >();
		}
		if( ( ! forceRead ) && indexByIndexIdx.containsKey( key ) ) {
			dict = indexByIndexIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamIndexColPKey, IYCFBamIndexColObj>();
			IYCFBamIndexColObj obj;
			YCFBamIndexColBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().readDerivedByIndexIdx( schema.getAuthorization(),
				TenantId,
				IndexId );
			YCFBamIndexColBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getIndexColTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
				obj.setBuff( buff );
				IYCFBamIndexColObj realised = (IYCFBamIndexColObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByIndexIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamIndexColObj arr[] = new IYCFBamIndexColObj[len];
		Iterator<IYCFBamIndexColObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamIndexColObj> arrayList = new ArrayList<IYCFBamIndexColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamIndexColObj> cmp = new Comparator<IYCFBamIndexColObj>() {
			public int compare( IYCFBamIndexColObj lhs, IYCFBamIndexColObj rhs ) {
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
					YCFBamIndexColPKey lhsPKey = lhs.getPKey();
					YCFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamIndexColObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamIndexColObj> readIndexColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readIndexColByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamIndexColObj> readIndexColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexColByDefSchemaIdx";
		YCFBamIndexColByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamIndexColPKey, IYCFBamIndexColObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamIndexColByDefSchemaIdxKey,
				Map< YCFBamIndexColPKey, IYCFBamIndexColObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamIndexColPKey, IYCFBamIndexColObj>();
			IYCFBamIndexColObj obj;
			YCFBamIndexColBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamIndexColBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getIndexColTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
				obj.setBuff( buff );
				IYCFBamIndexColObj realised = (IYCFBamIndexColObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamIndexColObj arr[] = new IYCFBamIndexColObj[len];
		Iterator<IYCFBamIndexColObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamIndexColObj> arrayList = new ArrayList<IYCFBamIndexColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamIndexColObj> cmp = new Comparator<IYCFBamIndexColObj>() {
			public int compare( IYCFBamIndexColObj lhs, IYCFBamIndexColObj rhs ) {
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
					YCFBamIndexColPKey lhsPKey = lhs.getPKey();
					YCFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamIndexColObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamIndexColObj> readIndexColByColIdx( long TenantId,
		long ColumnId )
	{
		return( readIndexColByColIdx( TenantId,
			ColumnId,
			false ) );
	}

	public List<IYCFBamIndexColObj> readIndexColByColIdx( long TenantId,
		long ColumnId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexColByColIdx";
		YCFBamIndexColByColIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newColIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredColumnId( ColumnId );
		Map<YCFBamIndexColPKey, IYCFBamIndexColObj> dict;
		if( indexByColIdx == null ) {
			indexByColIdx = new HashMap< YCFBamIndexColByColIdxKey,
				Map< YCFBamIndexColPKey, IYCFBamIndexColObj > >();
		}
		if( ( ! forceRead ) && indexByColIdx.containsKey( key ) ) {
			dict = indexByColIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamIndexColPKey, IYCFBamIndexColObj>();
			IYCFBamIndexColObj obj;
			YCFBamIndexColBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().readDerivedByColIdx( schema.getAuthorization(),
				TenantId,
				ColumnId );
			YCFBamIndexColBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getIndexColTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
				obj.setBuff( buff );
				IYCFBamIndexColObj realised = (IYCFBamIndexColObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByColIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamIndexColObj arr[] = new IYCFBamIndexColObj[len];
		Iterator<IYCFBamIndexColObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamIndexColObj> arrayList = new ArrayList<IYCFBamIndexColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamIndexColObj> cmp = new Comparator<IYCFBamIndexColObj>() {
			public int compare( IYCFBamIndexColObj lhs, IYCFBamIndexColObj rhs ) {
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
					YCFBamIndexColPKey lhsPKey = lhs.getPKey();
					YCFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamIndexColObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamIndexColObj> readIndexColByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		return( readIndexColByPrevIdx( PrevTenantId,
			PrevId,
			false ) );
	}

	public List<IYCFBamIndexColObj> readIndexColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexColByPrevIdx";
		YCFBamIndexColByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		Map<YCFBamIndexColPKey, IYCFBamIndexColObj> dict;
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< YCFBamIndexColByPrevIdxKey,
				Map< YCFBamIndexColPKey, IYCFBamIndexColObj > >();
		}
		if( ( ! forceRead ) && indexByPrevIdx.containsKey( key ) ) {
			dict = indexByPrevIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamIndexColPKey, IYCFBamIndexColObj>();
			IYCFBamIndexColObj obj;
			YCFBamIndexColBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().readDerivedByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			YCFBamIndexColBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getIndexColTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
				obj.setBuff( buff );
				IYCFBamIndexColObj realised = (IYCFBamIndexColObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPrevIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamIndexColObj arr[] = new IYCFBamIndexColObj[len];
		Iterator<IYCFBamIndexColObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamIndexColObj> arrayList = new ArrayList<IYCFBamIndexColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamIndexColObj> cmp = new Comparator<IYCFBamIndexColObj>() {
			public int compare( IYCFBamIndexColObj lhs, IYCFBamIndexColObj rhs ) {
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
					YCFBamIndexColPKey lhsPKey = lhs.getPKey();
					YCFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamIndexColObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamIndexColObj> readIndexColByNextIdx( Long NextTenantId,
		Long NextId )
	{
		return( readIndexColByNextIdx( NextTenantId,
			NextId,
			false ) );
	}

	public List<IYCFBamIndexColObj> readIndexColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexColByNextIdx";
		YCFBamIndexColByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		Map<YCFBamIndexColPKey, IYCFBamIndexColObj> dict;
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< YCFBamIndexColByNextIdxKey,
				Map< YCFBamIndexColPKey, IYCFBamIndexColObj > >();
		}
		if( ( ! forceRead ) && indexByNextIdx.containsKey( key ) ) {
			dict = indexByNextIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamIndexColPKey, IYCFBamIndexColObj>();
			IYCFBamIndexColObj obj;
			YCFBamIndexColBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().readDerivedByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			YCFBamIndexColBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getIndexColTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
				obj.setBuff( buff );
				IYCFBamIndexColObj realised = (IYCFBamIndexColObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByNextIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamIndexColObj arr[] = new IYCFBamIndexColObj[len];
		Iterator<IYCFBamIndexColObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamIndexColObj> arrayList = new ArrayList<IYCFBamIndexColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamIndexColObj> cmp = new Comparator<IYCFBamIndexColObj>() {
			public int compare( IYCFBamIndexColObj lhs, IYCFBamIndexColObj rhs ) {
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
					YCFBamIndexColPKey lhsPKey = lhs.getPKey();
					YCFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamIndexColObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamIndexColObj> readIndexColByIdxPrevIdx( long TenantId,
		long IndexId,
		Long PrevId )
	{
		return( readIndexColByIdxPrevIdx( TenantId,
			IndexId,
			PrevId,
			false ) );
	}

	public List<IYCFBamIndexColObj> readIndexColByIdxPrevIdx( long TenantId,
		long IndexId,
		Long PrevId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexColByIdxPrevIdx";
		YCFBamIndexColByIdxPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		key.setOptionalPrevId( PrevId );
		Map<YCFBamIndexColPKey, IYCFBamIndexColObj> dict;
		if( indexByIdxPrevIdx == null ) {
			indexByIdxPrevIdx = new HashMap< YCFBamIndexColByIdxPrevIdxKey,
				Map< YCFBamIndexColPKey, IYCFBamIndexColObj > >();
		}
		if( ( ! forceRead ) && indexByIdxPrevIdx.containsKey( key ) ) {
			dict = indexByIdxPrevIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamIndexColPKey, IYCFBamIndexColObj>();
			IYCFBamIndexColObj obj;
			YCFBamIndexColBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().readDerivedByIdxPrevIdx( schema.getAuthorization(),
				TenantId,
				IndexId,
				PrevId );
			YCFBamIndexColBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getIndexColTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
				obj.setBuff( buff );
				IYCFBamIndexColObj realised = (IYCFBamIndexColObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByIdxPrevIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamIndexColObj arr[] = new IYCFBamIndexColObj[len];
		Iterator<IYCFBamIndexColObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamIndexColObj> arrayList = new ArrayList<IYCFBamIndexColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamIndexColObj> cmp = new Comparator<IYCFBamIndexColObj>() {
			public int compare( IYCFBamIndexColObj lhs, IYCFBamIndexColObj rhs ) {
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
					YCFBamIndexColPKey lhsPKey = lhs.getPKey();
					YCFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamIndexColObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamIndexColObj> readIndexColByIdxNextIdx( long TenantId,
		long IndexId,
		Long NextId )
	{
		return( readIndexColByIdxNextIdx( TenantId,
			IndexId,
			NextId,
			false ) );
	}

	public List<IYCFBamIndexColObj> readIndexColByIdxNextIdx( long TenantId,
		long IndexId,
		Long NextId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexColByIdxNextIdx";
		YCFBamIndexColByIdxNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		key.setOptionalNextId( NextId );
		Map<YCFBamIndexColPKey, IYCFBamIndexColObj> dict;
		if( indexByIdxNextIdx == null ) {
			indexByIdxNextIdx = new HashMap< YCFBamIndexColByIdxNextIdxKey,
				Map< YCFBamIndexColPKey, IYCFBamIndexColObj > >();
		}
		if( ( ! forceRead ) && indexByIdxNextIdx.containsKey( key ) ) {
			dict = indexByIdxNextIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamIndexColPKey, IYCFBamIndexColObj>();
			IYCFBamIndexColObj obj;
			YCFBamIndexColBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().readDerivedByIdxNextIdx( schema.getAuthorization(),
				TenantId,
				IndexId,
				NextId );
			YCFBamIndexColBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getIndexColTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
				obj.setBuff( buff );
				IYCFBamIndexColObj realised = (IYCFBamIndexColObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByIdxNextIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamIndexColObj arr[] = new IYCFBamIndexColObj[len];
		Iterator<IYCFBamIndexColObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamIndexColObj> arrayList = new ArrayList<IYCFBamIndexColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamIndexColObj> cmp = new Comparator<IYCFBamIndexColObj>() {
			public int compare( IYCFBamIndexColObj lhs, IYCFBamIndexColObj rhs ) {
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
					YCFBamIndexColPKey lhsPKey = lhs.getPKey();
					YCFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamIndexColObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamIndexColObj readCachedIndexColByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamIndexColObj obj = null;
		YCFBamIndexColPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedIndexCol( pkey );
		return( obj );
	}

	public IYCFBamIndexColObj readCachedIndexColByUNameIdx( long TenantId,
		long IndexId,
		String Name )
	{
		IYCFBamIndexColObj obj = null;
		YCFBamIndexColByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamIndexColObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamIndexColObj> valIter = members.values().iterator();
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

	public List<IYCFBamIndexColObj> readCachedIndexColByIdxColTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedIndexColByIdxColTenantIdx";
		YCFBamIndexColByIdxColTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxColTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamIndexColObj> arrayList = new ArrayList<IYCFBamIndexColObj>();
		if( indexByIdxColTenantIdx != null ) {
			Map<YCFBamIndexColPKey, IYCFBamIndexColObj> dict;
			if( indexByIdxColTenantIdx.containsKey( key ) ) {
				dict = indexByIdxColTenantIdx.get( key );
				int len = dict.size();
				IYCFBamIndexColObj arr[] = new IYCFBamIndexColObj[len];
				Iterator<IYCFBamIndexColObj> valIter = dict.values().iterator();
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
			IYCFBamIndexColObj obj;
			Iterator<IYCFBamIndexColObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamIndexColObj> cmp = new Comparator<IYCFBamIndexColObj>() {
			public int compare( IYCFBamIndexColObj lhs, IYCFBamIndexColObj rhs ) {
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
					YCFBamIndexColPKey lhsPKey = lhs.getPKey();
					YCFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamIndexColObj> readCachedIndexColByIndexIdx( long TenantId,
		long IndexId )
	{
		final String S_ProcName = "readCachedIndexColByIndexIdx";
		YCFBamIndexColByIndexIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIndexIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		ArrayList<IYCFBamIndexColObj> arrayList = new ArrayList<IYCFBamIndexColObj>();
		if( indexByIndexIdx != null ) {
			Map<YCFBamIndexColPKey, IYCFBamIndexColObj> dict;
			if( indexByIndexIdx.containsKey( key ) ) {
				dict = indexByIndexIdx.get( key );
				int len = dict.size();
				IYCFBamIndexColObj arr[] = new IYCFBamIndexColObj[len];
				Iterator<IYCFBamIndexColObj> valIter = dict.values().iterator();
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
			IYCFBamIndexColObj obj;
			Iterator<IYCFBamIndexColObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamIndexColObj> cmp = new Comparator<IYCFBamIndexColObj>() {
			public int compare( IYCFBamIndexColObj lhs, IYCFBamIndexColObj rhs ) {
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
					YCFBamIndexColPKey lhsPKey = lhs.getPKey();
					YCFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamIndexColObj> readCachedIndexColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedIndexColByDefSchemaIdx";
		YCFBamIndexColByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamIndexColObj> arrayList = new ArrayList<IYCFBamIndexColObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamIndexColPKey, IYCFBamIndexColObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamIndexColObj arr[] = new IYCFBamIndexColObj[len];
				Iterator<IYCFBamIndexColObj> valIter = dict.values().iterator();
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
			IYCFBamIndexColObj obj;
			Iterator<IYCFBamIndexColObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamIndexColObj> cmp = new Comparator<IYCFBamIndexColObj>() {
			public int compare( IYCFBamIndexColObj lhs, IYCFBamIndexColObj rhs ) {
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
					YCFBamIndexColPKey lhsPKey = lhs.getPKey();
					YCFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamIndexColObj> readCachedIndexColByColIdx( long TenantId,
		long ColumnId )
	{
		final String S_ProcName = "readCachedIndexColByColIdx";
		YCFBamIndexColByColIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newColIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredColumnId( ColumnId );
		ArrayList<IYCFBamIndexColObj> arrayList = new ArrayList<IYCFBamIndexColObj>();
		if( indexByColIdx != null ) {
			Map<YCFBamIndexColPKey, IYCFBamIndexColObj> dict;
			if( indexByColIdx.containsKey( key ) ) {
				dict = indexByColIdx.get( key );
				int len = dict.size();
				IYCFBamIndexColObj arr[] = new IYCFBamIndexColObj[len];
				Iterator<IYCFBamIndexColObj> valIter = dict.values().iterator();
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
			IYCFBamIndexColObj obj;
			Iterator<IYCFBamIndexColObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamIndexColObj> cmp = new Comparator<IYCFBamIndexColObj>() {
			public int compare( IYCFBamIndexColObj lhs, IYCFBamIndexColObj rhs ) {
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
					YCFBamIndexColPKey lhsPKey = lhs.getPKey();
					YCFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamIndexColObj> readCachedIndexColByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "readCachedIndexColByPrevIdx";
		YCFBamIndexColByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		ArrayList<IYCFBamIndexColObj> arrayList = new ArrayList<IYCFBamIndexColObj>();
		if( indexByPrevIdx != null ) {
			Map<YCFBamIndexColPKey, IYCFBamIndexColObj> dict;
			if( indexByPrevIdx.containsKey( key ) ) {
				dict = indexByPrevIdx.get( key );
				int len = dict.size();
				IYCFBamIndexColObj arr[] = new IYCFBamIndexColObj[len];
				Iterator<IYCFBamIndexColObj> valIter = dict.values().iterator();
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
			IYCFBamIndexColObj obj;
			Iterator<IYCFBamIndexColObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamIndexColObj> cmp = new Comparator<IYCFBamIndexColObj>() {
			public int compare( IYCFBamIndexColObj lhs, IYCFBamIndexColObj rhs ) {
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
					YCFBamIndexColPKey lhsPKey = lhs.getPKey();
					YCFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamIndexColObj> readCachedIndexColByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "readCachedIndexColByNextIdx";
		YCFBamIndexColByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		ArrayList<IYCFBamIndexColObj> arrayList = new ArrayList<IYCFBamIndexColObj>();
		if( indexByNextIdx != null ) {
			Map<YCFBamIndexColPKey, IYCFBamIndexColObj> dict;
			if( indexByNextIdx.containsKey( key ) ) {
				dict = indexByNextIdx.get( key );
				int len = dict.size();
				IYCFBamIndexColObj arr[] = new IYCFBamIndexColObj[len];
				Iterator<IYCFBamIndexColObj> valIter = dict.values().iterator();
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
			IYCFBamIndexColObj obj;
			Iterator<IYCFBamIndexColObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamIndexColObj> cmp = new Comparator<IYCFBamIndexColObj>() {
			public int compare( IYCFBamIndexColObj lhs, IYCFBamIndexColObj rhs ) {
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
					YCFBamIndexColPKey lhsPKey = lhs.getPKey();
					YCFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamIndexColObj> readCachedIndexColByIdxPrevIdx( long TenantId,
		long IndexId,
		Long PrevId )
	{
		final String S_ProcName = "readCachedIndexColByIdxPrevIdx";
		YCFBamIndexColByIdxPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		key.setOptionalPrevId( PrevId );
		ArrayList<IYCFBamIndexColObj> arrayList = new ArrayList<IYCFBamIndexColObj>();
		if( indexByIdxPrevIdx != null ) {
			Map<YCFBamIndexColPKey, IYCFBamIndexColObj> dict;
			if( indexByIdxPrevIdx.containsKey( key ) ) {
				dict = indexByIdxPrevIdx.get( key );
				int len = dict.size();
				IYCFBamIndexColObj arr[] = new IYCFBamIndexColObj[len];
				Iterator<IYCFBamIndexColObj> valIter = dict.values().iterator();
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
			IYCFBamIndexColObj obj;
			Iterator<IYCFBamIndexColObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamIndexColObj> cmp = new Comparator<IYCFBamIndexColObj>() {
			public int compare( IYCFBamIndexColObj lhs, IYCFBamIndexColObj rhs ) {
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
					YCFBamIndexColPKey lhsPKey = lhs.getPKey();
					YCFBamIndexColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamIndexColObj> readCachedIndexColByIdxNextIdx( long TenantId,
		long IndexId,
		Long NextId )
	{
		final String S_ProcName = "readCachedIndexColByIdxNextIdx";
		YCFBamIndexColByIdxNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		key.setOptionalNextId( NextId );
		ArrayList<IYCFBamIndexColObj> arrayList = new ArrayList<IYCFBamIndexColObj>();
		if( indexByIdxNextIdx != null ) {
			Map<YCFBamIndexColPKey, IYCFBamIndexColObj> dict;
			if( indexByIdxNextIdx.containsKey( key ) ) {
				dict = indexByIdxNextIdx.get( key );
				int len = dict.size();
				IYCFBamIndexColObj arr[] = new IYCFBamIndexColObj[len];
				Iterator<IYCFBamIndexColObj> valIter = dict.values().iterator();
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
			IYCFBamIndexColObj obj;
			Iterator<IYCFBamIndexColObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamIndexColObj> cmp = new Comparator<IYCFBamIndexColObj>() {
			public int compare( IYCFBamIndexColObj lhs, IYCFBamIndexColObj rhs ) {
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
					YCFBamIndexColPKey lhsPKey = lhs.getPKey();
					YCFBamIndexColPKey rhsPKey = rhs.getPKey();
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
		IYCFBamIndexColObj obj = readCachedIndexColByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeIndexColByUNameIdx( long TenantId,
		long IndexId,
		String Name )
	{
		IYCFBamIndexColObj obj = readCachedIndexColByUNameIdx( TenantId,
				IndexId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeIndexColByIdxColTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeIndexColByIdxColTenantIdx";
		IYCFBamIndexColObj obj;
		List<IYCFBamIndexColObj> arrayList = readCachedIndexColByIdxColTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamIndexColObj> arrayIter = arrayList.iterator();
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
		IYCFBamIndexColObj obj;
		List<IYCFBamIndexColObj> arrayList = readCachedIndexColByIndexIdx( TenantId,
				IndexId );
		if( arrayList != null )  {
			Iterator<IYCFBamIndexColObj> arrayIter = arrayList.iterator();
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
		IYCFBamIndexColObj obj;
		List<IYCFBamIndexColObj> arrayList = readCachedIndexColByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamIndexColObj> arrayIter = arrayList.iterator();
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
		IYCFBamIndexColObj obj;
		List<IYCFBamIndexColObj> arrayList = readCachedIndexColByColIdx( TenantId,
				ColumnId );
		if( arrayList != null )  {
			Iterator<IYCFBamIndexColObj> arrayIter = arrayList.iterator();
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
		IYCFBamIndexColObj obj;
		List<IYCFBamIndexColObj> arrayList = readCachedIndexColByPrevIdx( PrevTenantId,
				PrevId );
		if( arrayList != null )  {
			Iterator<IYCFBamIndexColObj> arrayIter = arrayList.iterator();
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
		IYCFBamIndexColObj obj;
		List<IYCFBamIndexColObj> arrayList = readCachedIndexColByNextIdx( NextTenantId,
				NextId );
		if( arrayList != null )  {
			Iterator<IYCFBamIndexColObj> arrayIter = arrayList.iterator();
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
		IYCFBamIndexColObj obj;
		List<IYCFBamIndexColObj> arrayList = readCachedIndexColByIdxPrevIdx( TenantId,
				IndexId,
				PrevId );
		if( arrayList != null )  {
			Iterator<IYCFBamIndexColObj> arrayIter = arrayList.iterator();
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
		IYCFBamIndexColObj obj;
		List<IYCFBamIndexColObj> arrayList = readCachedIndexColByIdxNextIdx( TenantId,
				IndexId,
				NextId );
		if( arrayList != null )  {
			Iterator<IYCFBamIndexColObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamIndexColObj updateIndexCol( IYCFBamIndexColObj Obj ) {
		IYCFBamIndexColObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().updateIndexCol( schema.getAuthorization(),
			Obj.getIndexColBuff() );
		obj = (IYCFBamIndexColObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteIndexCol( IYCFBamIndexColObj Obj ) {
		IYCFBamIndexColObj obj = Obj;
		IYCFBamIndexColObj prev = obj.getOptionalLookupPrev();
		IYCFBamIndexColObj next = obj.getOptionalLookupNext();
		((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexCol( schema.getAuthorization(),
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
		YCFBamIndexColPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamIndexColObj obj = readIndexCol( pkey );
		if( obj != null ) {
			IYCFBamIndexColEditObj editObj = (IYCFBamIndexColEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamIndexColEditObj)obj.beginEdit();
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
			indexByUNameIdx = new HashMap< YCFBamIndexColByUNameIdxKey,
				IYCFBamIndexColObj >();
		}
		YCFBamIndexColByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		key.setRequiredName( Name );
		IYCFBamIndexColObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByUNameIdx( schema.getAuthorization(),
				TenantId,
				IndexId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByUNameIdx( schema.getAuthorization(),
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
		YCFBamIndexColByIdxColTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxColTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByIdxColTenantIdx == null ) {
			indexByIdxColTenantIdx = new HashMap< YCFBamIndexColByIdxColTenantIdxKey,
				Map< YCFBamIndexColPKey, IYCFBamIndexColObj > >();
		}
		if( indexByIdxColTenantIdx.containsKey( key ) ) {
			Map<YCFBamIndexColPKey, IYCFBamIndexColObj> dict = indexByIdxColTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByIdxColTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamIndexColObj> iter = dict.values().iterator();
			IYCFBamIndexColObj obj;
			List<IYCFBamIndexColObj> toForget = new LinkedList<IYCFBamIndexColObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByIdxColTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeIndexColByIdxColTenantIdx( TenantId );
	}

	public void deleteIndexColByIndexIdx( long TenantId,
		long IndexId )
	{
		YCFBamIndexColByIndexIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIndexIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		if( indexByIndexIdx == null ) {
			indexByIndexIdx = new HashMap< YCFBamIndexColByIndexIdxKey,
				Map< YCFBamIndexColPKey, IYCFBamIndexColObj > >();
		}
		if( indexByIndexIdx.containsKey( key ) ) {
			Map<YCFBamIndexColPKey, IYCFBamIndexColObj> dict = indexByIndexIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByIndexIdx( schema.getAuthorization(),
				TenantId,
				IndexId );
			Iterator<IYCFBamIndexColObj> iter = dict.values().iterator();
			IYCFBamIndexColObj obj;
			List<IYCFBamIndexColObj> toForget = new LinkedList<IYCFBamIndexColObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByIndexIdx( schema.getAuthorization(),
				TenantId,
				IndexId );
		}
		deepDisposeIndexColByIndexIdx( TenantId,
				IndexId );
	}

	public void deleteIndexColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamIndexColByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamIndexColByDefSchemaIdxKey,
				Map< YCFBamIndexColPKey, IYCFBamIndexColObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamIndexColPKey, IYCFBamIndexColObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamIndexColObj> iter = dict.values().iterator();
			IYCFBamIndexColObj obj;
			List<IYCFBamIndexColObj> toForget = new LinkedList<IYCFBamIndexColObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeIndexColByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteIndexColByColIdx( long TenantId,
		long ColumnId )
	{
		YCFBamIndexColByColIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newColIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredColumnId( ColumnId );
		if( indexByColIdx == null ) {
			indexByColIdx = new HashMap< YCFBamIndexColByColIdxKey,
				Map< YCFBamIndexColPKey, IYCFBamIndexColObj > >();
		}
		if( indexByColIdx.containsKey( key ) ) {
			Map<YCFBamIndexColPKey, IYCFBamIndexColObj> dict = indexByColIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByColIdx( schema.getAuthorization(),
				TenantId,
				ColumnId );
			Iterator<IYCFBamIndexColObj> iter = dict.values().iterator();
			IYCFBamIndexColObj obj;
			List<IYCFBamIndexColObj> toForget = new LinkedList<IYCFBamIndexColObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByColIdx( schema.getAuthorization(),
				TenantId,
				ColumnId );
		}
		deepDisposeIndexColByColIdx( TenantId,
				ColumnId );
	}

	public void deleteIndexColByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		YCFBamIndexColByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< YCFBamIndexColByPrevIdxKey,
				Map< YCFBamIndexColPKey, IYCFBamIndexColObj > >();
		}
		if( indexByPrevIdx.containsKey( key ) ) {
			Map<YCFBamIndexColPKey, IYCFBamIndexColObj> dict = indexByPrevIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			Iterator<IYCFBamIndexColObj> iter = dict.values().iterator();
			IYCFBamIndexColObj obj;
			List<IYCFBamIndexColObj> toForget = new LinkedList<IYCFBamIndexColObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
		}
		deepDisposeIndexColByPrevIdx( PrevTenantId,
				PrevId );
	}

	public void deleteIndexColByNextIdx( Long NextTenantId,
		Long NextId )
	{
		YCFBamIndexColByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< YCFBamIndexColByNextIdxKey,
				Map< YCFBamIndexColPKey, IYCFBamIndexColObj > >();
		}
		if( indexByNextIdx.containsKey( key ) ) {
			Map<YCFBamIndexColPKey, IYCFBamIndexColObj> dict = indexByNextIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			Iterator<IYCFBamIndexColObj> iter = dict.values().iterator();
			IYCFBamIndexColObj obj;
			List<IYCFBamIndexColObj> toForget = new LinkedList<IYCFBamIndexColObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByNextIdx( schema.getAuthorization(),
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
		YCFBamIndexColByIdxPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		key.setOptionalPrevId( PrevId );
		if( indexByIdxPrevIdx == null ) {
			indexByIdxPrevIdx = new HashMap< YCFBamIndexColByIdxPrevIdxKey,
				Map< YCFBamIndexColPKey, IYCFBamIndexColObj > >();
		}
		if( indexByIdxPrevIdx.containsKey( key ) ) {
			Map<YCFBamIndexColPKey, IYCFBamIndexColObj> dict = indexByIdxPrevIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByIdxPrevIdx( schema.getAuthorization(),
				TenantId,
				IndexId,
				PrevId );
			Iterator<IYCFBamIndexColObj> iter = dict.values().iterator();
			IYCFBamIndexColObj obj;
			List<IYCFBamIndexColObj> toForget = new LinkedList<IYCFBamIndexColObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByIdxPrevIdx( schema.getAuthorization(),
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
		YCFBamIndexColByIdxNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newIdxNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		key.setOptionalNextId( NextId );
		if( indexByIdxNextIdx == null ) {
			indexByIdxNextIdx = new HashMap< YCFBamIndexColByIdxNextIdxKey,
				Map< YCFBamIndexColPKey, IYCFBamIndexColObj > >();
		}
		if( indexByIdxNextIdx.containsKey( key ) ) {
			Map<YCFBamIndexColPKey, IYCFBamIndexColObj> dict = indexByIdxNextIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByIdxNextIdx( schema.getAuthorization(),
				TenantId,
				IndexId,
				NextId );
			Iterator<IYCFBamIndexColObj> iter = dict.values().iterator();
			IYCFBamIndexColObj obj;
			List<IYCFBamIndexColObj> toForget = new LinkedList<IYCFBamIndexColObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().deleteIndexColByIdxNextIdx( schema.getAuthorization(),
				TenantId,
				IndexId,
				NextId );
		}
		deepDisposeIndexColByIdxNextIdx( TenantId,
				IndexId,
				NextId );
	}

	/**
	 *	Move the YCFBamIndexColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamIndexColObj refreshed cache instance.
	 */
	public IYCFBamIndexColObj moveUpIndexCol( IYCFBamIndexColObj Obj ) {
		IYCFBamIndexColObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new YCFLibUsageException( getClass(),
				"moveUpIndexCol",
				"You cannot move an object that is being edited" );
		}
		YCFBamIndexColBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().moveBuffUp( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getIndexColTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
			obj.setBuff( buff );
			obj = (IYCFBamIndexColObj)obj.realise();
			IYCFBamIndexColObj prev = obj.getOptionalLookupPrev( true );
			IYCFBamIndexColObj next = obj.getOptionalLookupNext( true );
			if( next != null ) {
				IYCFBamIndexColObj gnext = next.getOptionalLookupNext( true );
			}
		}
		return( obj );
	}

	/**
	 *	Move the YCFBamIndexColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamIndexColObj refreshed cache instance.
	 */
	public IYCFBamIndexColObj moveDownIndexCol( IYCFBamIndexColObj Obj ) {
		IYCFBamIndexColObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new YCFLibUsageException( getClass(),
				"moveDownIndexCol",
				"You cannot move an object that is being edited" );
		}
		YCFBamIndexColBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().moveBuffDown( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getIndexColTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey() );
			obj.setBuff( buff );
			obj = (IYCFBamIndexColObj)obj.realise();
			IYCFBamIndexColObj prev = obj.getOptionalLookupPrev( true );
			if( prev != null ) {
				IYCFBamIndexColObj gprev = prev.getOptionalLookupPrev( true );
			}
			IYCFBamIndexColObj next = obj.getOptionalLookupNext( true );
		}
		return( obj );
	}
}
