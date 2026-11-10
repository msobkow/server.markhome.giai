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

public class YCFBamRelationColTableObj
	implements IYCFBamRelationColTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamRelationColPKey, IYCFBamRelationColObj> members;
	private Map<YCFBamRelationColPKey, IYCFBamRelationColObj> allRelationCol;
	private Map< YCFBamRelationColByUNameIdxKey,
		IYCFBamRelationColObj > indexByUNameIdx;
	private Map< YCFBamRelationColByRelColTenantIdxKey,
		Map<YCFBamRelationColPKey, IYCFBamRelationColObj > > indexByRelColTenantIdx;
	private Map< YCFBamRelationColByRelationIdxKey,
		Map<YCFBamRelationColPKey, IYCFBamRelationColObj > > indexByRelationIdx;
	private Map< YCFBamRelationColByDefSchemaIdxKey,
		Map<YCFBamRelationColPKey, IYCFBamRelationColObj > > indexByDefSchemaIdx;
	private Map< YCFBamRelationColByFromColIdxKey,
		Map<YCFBamRelationColPKey, IYCFBamRelationColObj > > indexByFromColIdx;
	private Map< YCFBamRelationColByToColIdxKey,
		Map<YCFBamRelationColPKey, IYCFBamRelationColObj > > indexByToColIdx;
	private Map< YCFBamRelationColByPrevIdxKey,
		Map<YCFBamRelationColPKey, IYCFBamRelationColObj > > indexByPrevIdx;
	private Map< YCFBamRelationColByNextIdxKey,
		Map<YCFBamRelationColPKey, IYCFBamRelationColObj > > indexByNextIdx;
	private Map< YCFBamRelationColByRelPrevIdxKey,
		Map<YCFBamRelationColPKey, IYCFBamRelationColObj > > indexByRelPrevIdx;
	private Map< YCFBamRelationColByRelNextIdxKey,
		Map<YCFBamRelationColPKey, IYCFBamRelationColObj > > indexByRelNextIdx;
	public static String TABLE_NAME = "RelationCol";
	public static String TABLE_DBNAME = "relcol";

	public YCFBamRelationColTableObj() {
		schema = null;
		members = new HashMap<YCFBamRelationColPKey, IYCFBamRelationColObj>();
		allRelationCol = null;
		indexByUNameIdx = null;
		indexByRelColTenantIdx = null;
		indexByRelationIdx = null;
		indexByDefSchemaIdx = null;
		indexByFromColIdx = null;
		indexByToColIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
		indexByRelPrevIdx = null;
		indexByRelNextIdx = null;
	}

	public YCFBamRelationColTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamRelationColPKey, IYCFBamRelationColObj>();
		allRelationCol = null;
		indexByUNameIdx = null;
		indexByRelColTenantIdx = null;
		indexByRelationIdx = null;
		indexByDefSchemaIdx = null;
		indexByFromColIdx = null;
		indexByToColIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
		indexByRelPrevIdx = null;
		indexByRelNextIdx = null;
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
		allRelationCol = null;
		indexByUNameIdx = null;
		indexByRelColTenantIdx = null;
		indexByRelationIdx = null;
		indexByDefSchemaIdx = null;
		indexByFromColIdx = null;
		indexByToColIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
		indexByRelPrevIdx = null;
		indexByRelNextIdx = null;
		List<IYCFBamRelationColObj> toForget = new LinkedList<IYCFBamRelationColObj>();
		IYCFBamRelationColObj cur = null;
		Iterator<IYCFBamRelationColObj> iter = members.values().iterator();
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
	 *	YCFBamRelationColObj.
	 */
	public IYCFBamRelationColObj newInstance() {
		IYCFBamRelationColObj inst = new YCFBamRelationColObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamRelationColObj.
	 */
	public IYCFBamRelationColEditObj newEditInstance( IYCFBamRelationColObj orig ) {
		IYCFBamRelationColEditObj edit = new YCFBamRelationColEditObj( orig );
		return( edit );
	}

	public IYCFBamRelationColObj realiseRelationCol( IYCFBamRelationColObj Obj ) {
		IYCFBamRelationColObj obj = Obj;
		YCFBamRelationColPKey pkey = obj.getPKey();
		IYCFBamRelationColObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamRelationColObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByUNameIdx != null ) {
				YCFBamRelationColByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByRelColTenantIdx != null ) {
				YCFBamRelationColByRelColTenantIdxKey keyRelColTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelColTenantIdxKey();
				keyRelColTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapRelColTenantIdx = indexByRelColTenantIdx.get( keyRelColTenantIdx );
				if( mapRelColTenantIdx != null ) {
					mapRelColTenantIdx.remove( keepObj.getPKey() );
					if( mapRelColTenantIdx.size() <= 0 ) {
						indexByRelColTenantIdx.remove( keyRelColTenantIdx );
					}
				}
			}

			if( indexByRelationIdx != null ) {
				YCFBamRelationColByRelationIdxKey keyRelationIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelationIdxKey();
				keyRelationIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyRelationIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapRelationIdx = indexByRelationIdx.get( keyRelationIdx );
				if( mapRelationIdx != null ) {
					mapRelationIdx.remove( keepObj.getPKey() );
					if( mapRelationIdx.size() <= 0 ) {
						indexByRelationIdx.remove( keyRelationIdx );
					}
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamRelationColByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.remove( keepObj.getPKey() );
					if( mapDefSchemaIdx.size() <= 0 ) {
						indexByDefSchemaIdx.remove( keyDefSchemaIdx );
					}
				}
			}

			if( indexByFromColIdx != null ) {
				YCFBamRelationColByFromColIdxKey keyFromColIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newFromColIdxKey();
				keyFromColIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyFromColIdx.setRequiredFromColId( keepObj.getRequiredFromColId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapFromColIdx = indexByFromColIdx.get( keyFromColIdx );
				if( mapFromColIdx != null ) {
					mapFromColIdx.remove( keepObj.getPKey() );
					if( mapFromColIdx.size() <= 0 ) {
						indexByFromColIdx.remove( keyFromColIdx );
					}
				}
			}

			if( indexByToColIdx != null ) {
				YCFBamRelationColByToColIdxKey keyToColIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newToColIdxKey();
				keyToColIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyToColIdx.setRequiredToColId( keepObj.getRequiredToColId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapToColIdx = indexByToColIdx.get( keyToColIdx );
				if( mapToColIdx != null ) {
					mapToColIdx.remove( keepObj.getPKey() );
					if( mapToColIdx.size() <= 0 ) {
						indexByToColIdx.remove( keyToColIdx );
					}
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamRelationColByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.remove( keepObj.getPKey() );
					if( mapPrevIdx.size() <= 0 ) {
						indexByPrevIdx.remove( keyPrevIdx );
					}
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamRelationColByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.remove( keepObj.getPKey() );
					if( mapNextIdx.size() <= 0 ) {
						indexByNextIdx.remove( keyNextIdx );
					}
				}
			}

			if( indexByRelPrevIdx != null ) {
				YCFBamRelationColByRelPrevIdxKey keyRelPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelPrevIdxKey();
				keyRelPrevIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyRelPrevIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				keyRelPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapRelPrevIdx = indexByRelPrevIdx.get( keyRelPrevIdx );
				if( mapRelPrevIdx != null ) {
					mapRelPrevIdx.remove( keepObj.getPKey() );
					if( mapRelPrevIdx.size() <= 0 ) {
						indexByRelPrevIdx.remove( keyRelPrevIdx );
					}
				}
			}

			if( indexByRelNextIdx != null ) {
				YCFBamRelationColByRelNextIdxKey keyRelNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelNextIdxKey();
				keyRelNextIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyRelNextIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				keyRelNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapRelNextIdx = indexByRelNextIdx.get( keyRelNextIdx );
				if( mapRelNextIdx != null ) {
					mapRelNextIdx.remove( keepObj.getPKey() );
					if( mapRelNextIdx.size() <= 0 ) {
						indexByRelNextIdx.remove( keyRelNextIdx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByUNameIdx != null ) {
				YCFBamRelationColByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByRelColTenantIdx != null ) {
				YCFBamRelationColByRelColTenantIdxKey keyRelColTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelColTenantIdxKey();
				keyRelColTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapRelColTenantIdx = indexByRelColTenantIdx.get( keyRelColTenantIdx );
				if( mapRelColTenantIdx != null ) {
					mapRelColTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRelationIdx != null ) {
				YCFBamRelationColByRelationIdxKey keyRelationIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelationIdxKey();
				keyRelationIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyRelationIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapRelationIdx = indexByRelationIdx.get( keyRelationIdx );
				if( mapRelationIdx != null ) {
					mapRelationIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamRelationColByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByFromColIdx != null ) {
				YCFBamRelationColByFromColIdxKey keyFromColIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newFromColIdxKey();
				keyFromColIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyFromColIdx.setRequiredFromColId( keepObj.getRequiredFromColId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapFromColIdx = indexByFromColIdx.get( keyFromColIdx );
				if( mapFromColIdx != null ) {
					mapFromColIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByToColIdx != null ) {
				YCFBamRelationColByToColIdxKey keyToColIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newToColIdxKey();
				keyToColIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyToColIdx.setRequiredToColId( keepObj.getRequiredToColId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapToColIdx = indexByToColIdx.get( keyToColIdx );
				if( mapToColIdx != null ) {
					mapToColIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamRelationColByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamRelationColByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRelPrevIdx != null ) {
				YCFBamRelationColByRelPrevIdxKey keyRelPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelPrevIdxKey();
				keyRelPrevIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyRelPrevIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				keyRelPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapRelPrevIdx = indexByRelPrevIdx.get( keyRelPrevIdx );
				if( mapRelPrevIdx != null ) {
					mapRelPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRelNextIdx != null ) {
				YCFBamRelationColByRelNextIdxKey keyRelNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelNextIdxKey();
				keyRelNextIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyRelNextIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				keyRelNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapRelNextIdx = indexByRelNextIdx.get( keyRelNextIdx );
				if( mapRelNextIdx != null ) {
					mapRelNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allRelationCol != null ) {
				allRelationCol.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allRelationCol != null ) {
				allRelationCol.put( keepObj.getPKey(), keepObj );
			}

			if( indexByUNameIdx != null ) {
				YCFBamRelationColByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByRelColTenantIdx != null ) {
				YCFBamRelationColByRelColTenantIdxKey keyRelColTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelColTenantIdxKey();
				keyRelColTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapRelColTenantIdx = indexByRelColTenantIdx.get( keyRelColTenantIdx );
				if( mapRelColTenantIdx != null ) {
					mapRelColTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRelationIdx != null ) {
				YCFBamRelationColByRelationIdxKey keyRelationIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelationIdxKey();
				keyRelationIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyRelationIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapRelationIdx = indexByRelationIdx.get( keyRelationIdx );
				if( mapRelationIdx != null ) {
					mapRelationIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamRelationColByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByFromColIdx != null ) {
				YCFBamRelationColByFromColIdxKey keyFromColIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newFromColIdxKey();
				keyFromColIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyFromColIdx.setRequiredFromColId( keepObj.getRequiredFromColId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapFromColIdx = indexByFromColIdx.get( keyFromColIdx );
				if( mapFromColIdx != null ) {
					mapFromColIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByToColIdx != null ) {
				YCFBamRelationColByToColIdxKey keyToColIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newToColIdxKey();
				keyToColIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyToColIdx.setRequiredToColId( keepObj.getRequiredToColId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapToColIdx = indexByToColIdx.get( keyToColIdx );
				if( mapToColIdx != null ) {
					mapToColIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamRelationColByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamRelationColByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRelPrevIdx != null ) {
				YCFBamRelationColByRelPrevIdxKey keyRelPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelPrevIdxKey();
				keyRelPrevIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyRelPrevIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				keyRelPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapRelPrevIdx = indexByRelPrevIdx.get( keyRelPrevIdx );
				if( mapRelPrevIdx != null ) {
					mapRelPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRelNextIdx != null ) {
				YCFBamRelationColByRelNextIdxKey keyRelNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelNextIdxKey();
				keyRelNextIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyRelNextIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				keyRelNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamRelationColPKey, IYCFBamRelationColObj > mapRelNextIdx = indexByRelNextIdx.get( keyRelNextIdx );
				if( mapRelNextIdx != null ) {
					mapRelNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamRelationColObj createRelationCol( IYCFBamRelationColObj Obj ) {
		IYCFBamRelationColObj obj = Obj;
		YCFBamRelationColBuff buff = obj.getRelationColBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().createRelationCol(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		IYCFBamRelationColObj prev = obj.getOptionalLookupPrev();
		if( prev != null ) {
			prev.read( true );
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamRelationColObj readRelationCol( YCFBamRelationColPKey pkey ) {
		return( readRelationCol( pkey, false ) );
	}

	public IYCFBamRelationColObj readRelationCol( YCFBamRelationColPKey pkey, boolean forceRead ) {
		IYCFBamRelationColObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamRelationColBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getRelationColTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamRelationColObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamRelationColObj readCachedRelationCol( YCFBamRelationColPKey pkey ) {
		IYCFBamRelationColObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeRelationCol( IYCFBamRelationColObj obj )
	{
		final String S_ProcName = "YCFBamRelationColTableObj.reallyDeepDisposeRelationCol() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamRelationColPKey pkey = obj.getPKey();
		IYCFBamRelationColObj existing = readCachedRelationCol( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamRelationColByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredRelationId( existing.getRequiredRelationId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamRelationColByRelColTenantIdxKey keyRelColTenantIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelColTenantIdxKey();
		keyRelColTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamRelationColByRelationIdxKey keyRelationIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelationIdxKey();
		keyRelationIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyRelationIdx.setRequiredRelationId( existing.getRequiredRelationId() );

		YCFBamRelationColByDefSchemaIdxKey keyDefSchemaIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamRelationColByFromColIdxKey keyFromColIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newFromColIdxKey();
		keyFromColIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyFromColIdx.setRequiredFromColId( existing.getRequiredFromColId() );

		YCFBamRelationColByToColIdxKey keyToColIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newToColIdxKey();
		keyToColIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyToColIdx.setRequiredToColId( existing.getRequiredToColId() );

		YCFBamRelationColByPrevIdxKey keyPrevIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamRelationColByNextIdxKey keyNextIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newNextIdxKey();
		keyNextIdx.setOptionalNextTenantId( existing.getOptionalNextTenantId() );
		keyNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		YCFBamRelationColByRelPrevIdxKey keyRelPrevIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelPrevIdxKey();
		keyRelPrevIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyRelPrevIdx.setRequiredRelationId( existing.getRequiredRelationId() );
		keyRelPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamRelationColByRelNextIdxKey keyRelNextIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelNextIdxKey();
		keyRelNextIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyRelNextIdx.setRequiredRelationId( existing.getRequiredRelationId() );
		keyRelNextIdx.setOptionalNextId( existing.getOptionalNextId() );



		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}

		if( indexByRelColTenantIdx != null ) {
			if( indexByRelColTenantIdx.containsKey( keyRelColTenantIdx ) ) {
				indexByRelColTenantIdx.get( keyRelColTenantIdx ).remove( pkey );
				if( indexByRelColTenantIdx.get( keyRelColTenantIdx ).size() <= 0 ) {
					indexByRelColTenantIdx.remove( keyRelColTenantIdx );
				}
			}
		}

		if( indexByRelationIdx != null ) {
			if( indexByRelationIdx.containsKey( keyRelationIdx ) ) {
				indexByRelationIdx.get( keyRelationIdx ).remove( pkey );
				if( indexByRelationIdx.get( keyRelationIdx ).size() <= 0 ) {
					indexByRelationIdx.remove( keyRelationIdx );
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

		if( indexByFromColIdx != null ) {
			if( indexByFromColIdx.containsKey( keyFromColIdx ) ) {
				indexByFromColIdx.get( keyFromColIdx ).remove( pkey );
				if( indexByFromColIdx.get( keyFromColIdx ).size() <= 0 ) {
					indexByFromColIdx.remove( keyFromColIdx );
				}
			}
		}

		if( indexByToColIdx != null ) {
			if( indexByToColIdx.containsKey( keyToColIdx ) ) {
				indexByToColIdx.get( keyToColIdx ).remove( pkey );
				if( indexByToColIdx.get( keyToColIdx ).size() <= 0 ) {
					indexByToColIdx.remove( keyToColIdx );
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

		if( indexByRelPrevIdx != null ) {
			if( indexByRelPrevIdx.containsKey( keyRelPrevIdx ) ) {
				indexByRelPrevIdx.get( keyRelPrevIdx ).remove( pkey );
				if( indexByRelPrevIdx.get( keyRelPrevIdx ).size() <= 0 ) {
					indexByRelPrevIdx.remove( keyRelPrevIdx );
				}
			}
		}

		if( indexByRelNextIdx != null ) {
			if( indexByRelNextIdx.containsKey( keyRelNextIdx ) ) {
				indexByRelNextIdx.get( keyRelNextIdx ).remove( pkey );
				if( indexByRelNextIdx.get( keyRelNextIdx ).size() <= 0 ) {
					indexByRelNextIdx.remove( keyRelNextIdx );
				}
			}
		}


	}
	public void deepDisposeRelationCol( YCFBamRelationColPKey pkey ) {
		IYCFBamRelationColObj obj = readCachedRelationCol( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamRelationColObj lockRelationCol( YCFBamRelationColPKey pkey ) {
		IYCFBamRelationColObj locked = null;
		YCFBamRelationColBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getRelationColTableObj().newInstance();
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamRelationColObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockRelationCol", pkey );
		}
		return( locked );
	}

	public List<IYCFBamRelationColObj> readAllRelationCol() {
		return( readAllRelationCol( false ) );
	}

	public List<IYCFBamRelationColObj> readAllRelationCol( boolean forceRead ) {
		final String S_ProcName = "readAllRelationCol";
		if( ( allRelationCol == null ) || forceRead ) {
			Map<YCFBamRelationColPKey, IYCFBamRelationColObj> map = new HashMap<YCFBamRelationColPKey,IYCFBamRelationColObj>();
			allRelationCol = map;
			YCFBamRelationColBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().readAllDerived( schema.getAuthorization() );
			YCFBamRelationColBuff buff;
			IYCFBamRelationColObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPKey() );
				obj.setBuff( buff );
				IYCFBamRelationColObj realised = (IYCFBamRelationColObj)obj.realise();
			}
		}
		int len = allRelationCol.size();
		IYCFBamRelationColObj arr[] = new IYCFBamRelationColObj[len];
		Iterator<IYCFBamRelationColObj> valIter = allRelationCol.values().iterator();
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
		ArrayList<IYCFBamRelationColObj> arrayList = new ArrayList<IYCFBamRelationColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamRelationColObj> cmp = new Comparator<IYCFBamRelationColObj>() {
			public int compare( IYCFBamRelationColObj lhs, IYCFBamRelationColObj rhs ) {
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
					YCFBamRelationColPKey lhsPKey = lhs.getPKey();
					YCFBamRelationColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamRelationColObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamRelationColObj> readCachedAllRelationCol() {
		final String S_ProcName = "readCachedAllRelationCol";
		ArrayList<IYCFBamRelationColObj> arrayList = new ArrayList<IYCFBamRelationColObj>();
		if( allRelationCol != null ) {
			int len = allRelationCol.size();
			IYCFBamRelationColObj arr[] = new IYCFBamRelationColObj[len];
			Iterator<IYCFBamRelationColObj> valIter = allRelationCol.values().iterator();
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
		Comparator<IYCFBamRelationColObj> cmp = new Comparator<IYCFBamRelationColObj>() {
			public int compare( IYCFBamRelationColObj lhs, IYCFBamRelationColObj rhs ) {
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
					YCFBamRelationColPKey lhsPKey = lhs.getPKey();
					YCFBamRelationColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFBamRelationColObj readRelationColByIdIdx( long TenantId,
		long Id )
	{
		return( readRelationColByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamRelationColObj readRelationColByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamRelationColPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamRelationColObj obj = readRelationCol( pkey, forceRead );
		return( obj );
	}

	public IYCFBamRelationColObj readRelationColByUNameIdx( long TenantId,
		long RelationId,
		String Name )
	{
		return( readRelationColByUNameIdx( TenantId,
			RelationId,
			Name,
			false ) );
	}

	public IYCFBamRelationColObj readRelationColByUNameIdx( long TenantId,
		long RelationId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamRelationColByUNameIdxKey,
				IYCFBamRelationColObj >();
		}
		YCFBamRelationColByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		key.setRequiredName( Name );
		IYCFBamRelationColObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamRelationColBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				RelationId,
				Name );
			if( buff != null ) {
				obj = schema.getRelationColTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamRelationColObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamRelationColObj> readRelationColByRelColTenantIdx( long TenantId )
	{
		return( readRelationColByRelColTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamRelationColObj> readRelationColByRelColTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationColByRelColTenantIdx";
		YCFBamRelationColByRelColTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelColTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict;
		if( indexByRelColTenantIdx == null ) {
			indexByRelColTenantIdx = new HashMap< YCFBamRelationColByRelColTenantIdxKey,
				Map< YCFBamRelationColPKey, IYCFBamRelationColObj > >();
		}
		if( ( ! forceRead ) && indexByRelColTenantIdx.containsKey( key ) ) {
			dict = indexByRelColTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamRelationColPKey, IYCFBamRelationColObj>();
			IYCFBamRelationColObj obj;
			YCFBamRelationColBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().readDerivedByRelColTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamRelationColBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getRelationColTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPKey() );
				obj.setBuff( buff );
				IYCFBamRelationColObj realised = (IYCFBamRelationColObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRelColTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamRelationColObj arr[] = new IYCFBamRelationColObj[len];
		Iterator<IYCFBamRelationColObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamRelationColObj> arrayList = new ArrayList<IYCFBamRelationColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamRelationColObj> cmp = new Comparator<IYCFBamRelationColObj>() {
			public int compare( IYCFBamRelationColObj lhs, IYCFBamRelationColObj rhs ) {
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
					YCFBamRelationColPKey lhsPKey = lhs.getPKey();
					YCFBamRelationColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamRelationColObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamRelationColObj> readRelationColByRelationIdx( long TenantId,
		long RelationId )
	{
		return( readRelationColByRelationIdx( TenantId,
			RelationId,
			false ) );
	}

	public List<IYCFBamRelationColObj> readRelationColByRelationIdx( long TenantId,
		long RelationId,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationColByRelationIdx";
		YCFBamRelationColByRelationIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelationIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict;
		if( indexByRelationIdx == null ) {
			indexByRelationIdx = new HashMap< YCFBamRelationColByRelationIdxKey,
				Map< YCFBamRelationColPKey, IYCFBamRelationColObj > >();
		}
		if( ( ! forceRead ) && indexByRelationIdx.containsKey( key ) ) {
			dict = indexByRelationIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamRelationColPKey, IYCFBamRelationColObj>();
			IYCFBamRelationColObj obj;
			YCFBamRelationColBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().readDerivedByRelationIdx( schema.getAuthorization(),
				TenantId,
				RelationId );
			YCFBamRelationColBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getRelationColTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPKey() );
				obj.setBuff( buff );
				IYCFBamRelationColObj realised = (IYCFBamRelationColObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRelationIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamRelationColObj arr[] = new IYCFBamRelationColObj[len];
		Iterator<IYCFBamRelationColObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamRelationColObj> arrayList = new ArrayList<IYCFBamRelationColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamRelationColObj> cmp = new Comparator<IYCFBamRelationColObj>() {
			public int compare( IYCFBamRelationColObj lhs, IYCFBamRelationColObj rhs ) {
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
					YCFBamRelationColPKey lhsPKey = lhs.getPKey();
					YCFBamRelationColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamRelationColObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamRelationColObj> readRelationColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readRelationColByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamRelationColObj> readRelationColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationColByDefSchemaIdx";
		YCFBamRelationColByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamRelationColByDefSchemaIdxKey,
				Map< YCFBamRelationColPKey, IYCFBamRelationColObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamRelationColPKey, IYCFBamRelationColObj>();
			IYCFBamRelationColObj obj;
			YCFBamRelationColBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamRelationColBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getRelationColTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPKey() );
				obj.setBuff( buff );
				IYCFBamRelationColObj realised = (IYCFBamRelationColObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamRelationColObj arr[] = new IYCFBamRelationColObj[len];
		Iterator<IYCFBamRelationColObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamRelationColObj> arrayList = new ArrayList<IYCFBamRelationColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamRelationColObj> cmp = new Comparator<IYCFBamRelationColObj>() {
			public int compare( IYCFBamRelationColObj lhs, IYCFBamRelationColObj rhs ) {
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
					YCFBamRelationColPKey lhsPKey = lhs.getPKey();
					YCFBamRelationColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamRelationColObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamRelationColObj> readRelationColByFromColIdx( long TenantId,
		long FromColId )
	{
		return( readRelationColByFromColIdx( TenantId,
			FromColId,
			false ) );
	}

	public List<IYCFBamRelationColObj> readRelationColByFromColIdx( long TenantId,
		long FromColId,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationColByFromColIdx";
		YCFBamRelationColByFromColIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newFromColIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredFromColId( FromColId );
		Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict;
		if( indexByFromColIdx == null ) {
			indexByFromColIdx = new HashMap< YCFBamRelationColByFromColIdxKey,
				Map< YCFBamRelationColPKey, IYCFBamRelationColObj > >();
		}
		if( ( ! forceRead ) && indexByFromColIdx.containsKey( key ) ) {
			dict = indexByFromColIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamRelationColPKey, IYCFBamRelationColObj>();
			IYCFBamRelationColObj obj;
			YCFBamRelationColBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().readDerivedByFromColIdx( schema.getAuthorization(),
				TenantId,
				FromColId );
			YCFBamRelationColBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getRelationColTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPKey() );
				obj.setBuff( buff );
				IYCFBamRelationColObj realised = (IYCFBamRelationColObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByFromColIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamRelationColObj arr[] = new IYCFBamRelationColObj[len];
		Iterator<IYCFBamRelationColObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamRelationColObj> arrayList = new ArrayList<IYCFBamRelationColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamRelationColObj> cmp = new Comparator<IYCFBamRelationColObj>() {
			public int compare( IYCFBamRelationColObj lhs, IYCFBamRelationColObj rhs ) {
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
					YCFBamRelationColPKey lhsPKey = lhs.getPKey();
					YCFBamRelationColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamRelationColObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamRelationColObj> readRelationColByToColIdx( long TenantId,
		long ToColId )
	{
		return( readRelationColByToColIdx( TenantId,
			ToColId,
			false ) );
	}

	public List<IYCFBamRelationColObj> readRelationColByToColIdx( long TenantId,
		long ToColId,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationColByToColIdx";
		YCFBamRelationColByToColIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newToColIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredToColId( ToColId );
		Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict;
		if( indexByToColIdx == null ) {
			indexByToColIdx = new HashMap< YCFBamRelationColByToColIdxKey,
				Map< YCFBamRelationColPKey, IYCFBamRelationColObj > >();
		}
		if( ( ! forceRead ) && indexByToColIdx.containsKey( key ) ) {
			dict = indexByToColIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamRelationColPKey, IYCFBamRelationColObj>();
			IYCFBamRelationColObj obj;
			YCFBamRelationColBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().readDerivedByToColIdx( schema.getAuthorization(),
				TenantId,
				ToColId );
			YCFBamRelationColBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getRelationColTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPKey() );
				obj.setBuff( buff );
				IYCFBamRelationColObj realised = (IYCFBamRelationColObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByToColIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamRelationColObj arr[] = new IYCFBamRelationColObj[len];
		Iterator<IYCFBamRelationColObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamRelationColObj> arrayList = new ArrayList<IYCFBamRelationColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamRelationColObj> cmp = new Comparator<IYCFBamRelationColObj>() {
			public int compare( IYCFBamRelationColObj lhs, IYCFBamRelationColObj rhs ) {
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
					YCFBamRelationColPKey lhsPKey = lhs.getPKey();
					YCFBamRelationColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamRelationColObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamRelationColObj> readRelationColByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		return( readRelationColByPrevIdx( PrevTenantId,
			PrevId,
			false ) );
	}

	public List<IYCFBamRelationColObj> readRelationColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationColByPrevIdx";
		YCFBamRelationColByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict;
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< YCFBamRelationColByPrevIdxKey,
				Map< YCFBamRelationColPKey, IYCFBamRelationColObj > >();
		}
		if( ( ! forceRead ) && indexByPrevIdx.containsKey( key ) ) {
			dict = indexByPrevIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamRelationColPKey, IYCFBamRelationColObj>();
			IYCFBamRelationColObj obj;
			YCFBamRelationColBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().readDerivedByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			YCFBamRelationColBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getRelationColTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPKey() );
				obj.setBuff( buff );
				IYCFBamRelationColObj realised = (IYCFBamRelationColObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPrevIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamRelationColObj arr[] = new IYCFBamRelationColObj[len];
		Iterator<IYCFBamRelationColObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamRelationColObj> arrayList = new ArrayList<IYCFBamRelationColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamRelationColObj> cmp = new Comparator<IYCFBamRelationColObj>() {
			public int compare( IYCFBamRelationColObj lhs, IYCFBamRelationColObj rhs ) {
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
					YCFBamRelationColPKey lhsPKey = lhs.getPKey();
					YCFBamRelationColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamRelationColObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamRelationColObj> readRelationColByNextIdx( Long NextTenantId,
		Long NextId )
	{
		return( readRelationColByNextIdx( NextTenantId,
			NextId,
			false ) );
	}

	public List<IYCFBamRelationColObj> readRelationColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationColByNextIdx";
		YCFBamRelationColByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict;
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< YCFBamRelationColByNextIdxKey,
				Map< YCFBamRelationColPKey, IYCFBamRelationColObj > >();
		}
		if( ( ! forceRead ) && indexByNextIdx.containsKey( key ) ) {
			dict = indexByNextIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamRelationColPKey, IYCFBamRelationColObj>();
			IYCFBamRelationColObj obj;
			YCFBamRelationColBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().readDerivedByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			YCFBamRelationColBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getRelationColTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPKey() );
				obj.setBuff( buff );
				IYCFBamRelationColObj realised = (IYCFBamRelationColObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByNextIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamRelationColObj arr[] = new IYCFBamRelationColObj[len];
		Iterator<IYCFBamRelationColObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamRelationColObj> arrayList = new ArrayList<IYCFBamRelationColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamRelationColObj> cmp = new Comparator<IYCFBamRelationColObj>() {
			public int compare( IYCFBamRelationColObj lhs, IYCFBamRelationColObj rhs ) {
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
					YCFBamRelationColPKey lhsPKey = lhs.getPKey();
					YCFBamRelationColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamRelationColObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamRelationColObj> readRelationColByRelPrevIdx( long TenantId,
		long RelationId,
		Long PrevId )
	{
		return( readRelationColByRelPrevIdx( TenantId,
			RelationId,
			PrevId,
			false ) );
	}

	public List<IYCFBamRelationColObj> readRelationColByRelPrevIdx( long TenantId,
		long RelationId,
		Long PrevId,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationColByRelPrevIdx";
		YCFBamRelationColByRelPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		key.setOptionalPrevId( PrevId );
		Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict;
		if( indexByRelPrevIdx == null ) {
			indexByRelPrevIdx = new HashMap< YCFBamRelationColByRelPrevIdxKey,
				Map< YCFBamRelationColPKey, IYCFBamRelationColObj > >();
		}
		if( ( ! forceRead ) && indexByRelPrevIdx.containsKey( key ) ) {
			dict = indexByRelPrevIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamRelationColPKey, IYCFBamRelationColObj>();
			IYCFBamRelationColObj obj;
			YCFBamRelationColBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().readDerivedByRelPrevIdx( schema.getAuthorization(),
				TenantId,
				RelationId,
				PrevId );
			YCFBamRelationColBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getRelationColTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPKey() );
				obj.setBuff( buff );
				IYCFBamRelationColObj realised = (IYCFBamRelationColObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRelPrevIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamRelationColObj arr[] = new IYCFBamRelationColObj[len];
		Iterator<IYCFBamRelationColObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamRelationColObj> arrayList = new ArrayList<IYCFBamRelationColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamRelationColObj> cmp = new Comparator<IYCFBamRelationColObj>() {
			public int compare( IYCFBamRelationColObj lhs, IYCFBamRelationColObj rhs ) {
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
					YCFBamRelationColPKey lhsPKey = lhs.getPKey();
					YCFBamRelationColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamRelationColObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamRelationColObj> readRelationColByRelNextIdx( long TenantId,
		long RelationId,
		Long NextId )
	{
		return( readRelationColByRelNextIdx( TenantId,
			RelationId,
			NextId,
			false ) );
	}

	public List<IYCFBamRelationColObj> readRelationColByRelNextIdx( long TenantId,
		long RelationId,
		Long NextId,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationColByRelNextIdx";
		YCFBamRelationColByRelNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		key.setOptionalNextId( NextId );
		Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict;
		if( indexByRelNextIdx == null ) {
			indexByRelNextIdx = new HashMap< YCFBamRelationColByRelNextIdxKey,
				Map< YCFBamRelationColPKey, IYCFBamRelationColObj > >();
		}
		if( ( ! forceRead ) && indexByRelNextIdx.containsKey( key ) ) {
			dict = indexByRelNextIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamRelationColPKey, IYCFBamRelationColObj>();
			IYCFBamRelationColObj obj;
			YCFBamRelationColBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().readDerivedByRelNextIdx( schema.getAuthorization(),
				TenantId,
				RelationId,
				NextId );
			YCFBamRelationColBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getRelationColTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPKey() );
				obj.setBuff( buff );
				IYCFBamRelationColObj realised = (IYCFBamRelationColObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRelNextIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamRelationColObj arr[] = new IYCFBamRelationColObj[len];
		Iterator<IYCFBamRelationColObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamRelationColObj> arrayList = new ArrayList<IYCFBamRelationColObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamRelationColObj> cmp = new Comparator<IYCFBamRelationColObj>() {
			public int compare( IYCFBamRelationColObj lhs, IYCFBamRelationColObj rhs ) {
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
					YCFBamRelationColPKey lhsPKey = lhs.getPKey();
					YCFBamRelationColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamRelationColObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamRelationColObj readCachedRelationColByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamRelationColObj obj = null;
		YCFBamRelationColPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedRelationCol( pkey );
		return( obj );
	}

	public IYCFBamRelationColObj readCachedRelationColByUNameIdx( long TenantId,
		long RelationId,
		String Name )
	{
		IYCFBamRelationColObj obj = null;
		YCFBamRelationColByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamRelationColObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamRelationColObj> valIter = members.values().iterator();
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

	public List<IYCFBamRelationColObj> readCachedRelationColByRelColTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedRelationColByRelColTenantIdx";
		YCFBamRelationColByRelColTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelColTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamRelationColObj> arrayList = new ArrayList<IYCFBamRelationColObj>();
		if( indexByRelColTenantIdx != null ) {
			Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict;
			if( indexByRelColTenantIdx.containsKey( key ) ) {
				dict = indexByRelColTenantIdx.get( key );
				int len = dict.size();
				IYCFBamRelationColObj arr[] = new IYCFBamRelationColObj[len];
				Iterator<IYCFBamRelationColObj> valIter = dict.values().iterator();
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
			IYCFBamRelationColObj obj;
			Iterator<IYCFBamRelationColObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamRelationColObj> cmp = new Comparator<IYCFBamRelationColObj>() {
			public int compare( IYCFBamRelationColObj lhs, IYCFBamRelationColObj rhs ) {
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
					YCFBamRelationColPKey lhsPKey = lhs.getPKey();
					YCFBamRelationColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamRelationColObj> readCachedRelationColByRelationIdx( long TenantId,
		long RelationId )
	{
		final String S_ProcName = "readCachedRelationColByRelationIdx";
		YCFBamRelationColByRelationIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelationIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		ArrayList<IYCFBamRelationColObj> arrayList = new ArrayList<IYCFBamRelationColObj>();
		if( indexByRelationIdx != null ) {
			Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict;
			if( indexByRelationIdx.containsKey( key ) ) {
				dict = indexByRelationIdx.get( key );
				int len = dict.size();
				IYCFBamRelationColObj arr[] = new IYCFBamRelationColObj[len];
				Iterator<IYCFBamRelationColObj> valIter = dict.values().iterator();
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
			IYCFBamRelationColObj obj;
			Iterator<IYCFBamRelationColObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamRelationColObj> cmp = new Comparator<IYCFBamRelationColObj>() {
			public int compare( IYCFBamRelationColObj lhs, IYCFBamRelationColObj rhs ) {
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
					YCFBamRelationColPKey lhsPKey = lhs.getPKey();
					YCFBamRelationColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamRelationColObj> readCachedRelationColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedRelationColByDefSchemaIdx";
		YCFBamRelationColByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamRelationColObj> arrayList = new ArrayList<IYCFBamRelationColObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamRelationColObj arr[] = new IYCFBamRelationColObj[len];
				Iterator<IYCFBamRelationColObj> valIter = dict.values().iterator();
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
			IYCFBamRelationColObj obj;
			Iterator<IYCFBamRelationColObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamRelationColObj> cmp = new Comparator<IYCFBamRelationColObj>() {
			public int compare( IYCFBamRelationColObj lhs, IYCFBamRelationColObj rhs ) {
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
					YCFBamRelationColPKey lhsPKey = lhs.getPKey();
					YCFBamRelationColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamRelationColObj> readCachedRelationColByFromColIdx( long TenantId,
		long FromColId )
	{
		final String S_ProcName = "readCachedRelationColByFromColIdx";
		YCFBamRelationColByFromColIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newFromColIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredFromColId( FromColId );
		ArrayList<IYCFBamRelationColObj> arrayList = new ArrayList<IYCFBamRelationColObj>();
		if( indexByFromColIdx != null ) {
			Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict;
			if( indexByFromColIdx.containsKey( key ) ) {
				dict = indexByFromColIdx.get( key );
				int len = dict.size();
				IYCFBamRelationColObj arr[] = new IYCFBamRelationColObj[len];
				Iterator<IYCFBamRelationColObj> valIter = dict.values().iterator();
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
			IYCFBamRelationColObj obj;
			Iterator<IYCFBamRelationColObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamRelationColObj> cmp = new Comparator<IYCFBamRelationColObj>() {
			public int compare( IYCFBamRelationColObj lhs, IYCFBamRelationColObj rhs ) {
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
					YCFBamRelationColPKey lhsPKey = lhs.getPKey();
					YCFBamRelationColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamRelationColObj> readCachedRelationColByToColIdx( long TenantId,
		long ToColId )
	{
		final String S_ProcName = "readCachedRelationColByToColIdx";
		YCFBamRelationColByToColIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newToColIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredToColId( ToColId );
		ArrayList<IYCFBamRelationColObj> arrayList = new ArrayList<IYCFBamRelationColObj>();
		if( indexByToColIdx != null ) {
			Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict;
			if( indexByToColIdx.containsKey( key ) ) {
				dict = indexByToColIdx.get( key );
				int len = dict.size();
				IYCFBamRelationColObj arr[] = new IYCFBamRelationColObj[len];
				Iterator<IYCFBamRelationColObj> valIter = dict.values().iterator();
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
			IYCFBamRelationColObj obj;
			Iterator<IYCFBamRelationColObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamRelationColObj> cmp = new Comparator<IYCFBamRelationColObj>() {
			public int compare( IYCFBamRelationColObj lhs, IYCFBamRelationColObj rhs ) {
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
					YCFBamRelationColPKey lhsPKey = lhs.getPKey();
					YCFBamRelationColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamRelationColObj> readCachedRelationColByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "readCachedRelationColByPrevIdx";
		YCFBamRelationColByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		ArrayList<IYCFBamRelationColObj> arrayList = new ArrayList<IYCFBamRelationColObj>();
		if( indexByPrevIdx != null ) {
			Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict;
			if( indexByPrevIdx.containsKey( key ) ) {
				dict = indexByPrevIdx.get( key );
				int len = dict.size();
				IYCFBamRelationColObj arr[] = new IYCFBamRelationColObj[len];
				Iterator<IYCFBamRelationColObj> valIter = dict.values().iterator();
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
			IYCFBamRelationColObj obj;
			Iterator<IYCFBamRelationColObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamRelationColObj> cmp = new Comparator<IYCFBamRelationColObj>() {
			public int compare( IYCFBamRelationColObj lhs, IYCFBamRelationColObj rhs ) {
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
					YCFBamRelationColPKey lhsPKey = lhs.getPKey();
					YCFBamRelationColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamRelationColObj> readCachedRelationColByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "readCachedRelationColByNextIdx";
		YCFBamRelationColByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		ArrayList<IYCFBamRelationColObj> arrayList = new ArrayList<IYCFBamRelationColObj>();
		if( indexByNextIdx != null ) {
			Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict;
			if( indexByNextIdx.containsKey( key ) ) {
				dict = indexByNextIdx.get( key );
				int len = dict.size();
				IYCFBamRelationColObj arr[] = new IYCFBamRelationColObj[len];
				Iterator<IYCFBamRelationColObj> valIter = dict.values().iterator();
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
			IYCFBamRelationColObj obj;
			Iterator<IYCFBamRelationColObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamRelationColObj> cmp = new Comparator<IYCFBamRelationColObj>() {
			public int compare( IYCFBamRelationColObj lhs, IYCFBamRelationColObj rhs ) {
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
					YCFBamRelationColPKey lhsPKey = lhs.getPKey();
					YCFBamRelationColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamRelationColObj> readCachedRelationColByRelPrevIdx( long TenantId,
		long RelationId,
		Long PrevId )
	{
		final String S_ProcName = "readCachedRelationColByRelPrevIdx";
		YCFBamRelationColByRelPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		key.setOptionalPrevId( PrevId );
		ArrayList<IYCFBamRelationColObj> arrayList = new ArrayList<IYCFBamRelationColObj>();
		if( indexByRelPrevIdx != null ) {
			Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict;
			if( indexByRelPrevIdx.containsKey( key ) ) {
				dict = indexByRelPrevIdx.get( key );
				int len = dict.size();
				IYCFBamRelationColObj arr[] = new IYCFBamRelationColObj[len];
				Iterator<IYCFBamRelationColObj> valIter = dict.values().iterator();
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
			IYCFBamRelationColObj obj;
			Iterator<IYCFBamRelationColObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamRelationColObj> cmp = new Comparator<IYCFBamRelationColObj>() {
			public int compare( IYCFBamRelationColObj lhs, IYCFBamRelationColObj rhs ) {
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
					YCFBamRelationColPKey lhsPKey = lhs.getPKey();
					YCFBamRelationColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamRelationColObj> readCachedRelationColByRelNextIdx( long TenantId,
		long RelationId,
		Long NextId )
	{
		final String S_ProcName = "readCachedRelationColByRelNextIdx";
		YCFBamRelationColByRelNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		key.setOptionalNextId( NextId );
		ArrayList<IYCFBamRelationColObj> arrayList = new ArrayList<IYCFBamRelationColObj>();
		if( indexByRelNextIdx != null ) {
			Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict;
			if( indexByRelNextIdx.containsKey( key ) ) {
				dict = indexByRelNextIdx.get( key );
				int len = dict.size();
				IYCFBamRelationColObj arr[] = new IYCFBamRelationColObj[len];
				Iterator<IYCFBamRelationColObj> valIter = dict.values().iterator();
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
			IYCFBamRelationColObj obj;
			Iterator<IYCFBamRelationColObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamRelationColObj> cmp = new Comparator<IYCFBamRelationColObj>() {
			public int compare( IYCFBamRelationColObj lhs, IYCFBamRelationColObj rhs ) {
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
					YCFBamRelationColPKey lhsPKey = lhs.getPKey();
					YCFBamRelationColPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeRelationColByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamRelationColObj obj = readCachedRelationColByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeRelationColByUNameIdx( long TenantId,
		long RelationId,
		String Name )
	{
		IYCFBamRelationColObj obj = readCachedRelationColByUNameIdx( TenantId,
				RelationId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeRelationColByRelColTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeRelationColByRelColTenantIdx";
		IYCFBamRelationColObj obj;
		List<IYCFBamRelationColObj> arrayList = readCachedRelationColByRelColTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamRelationColObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeRelationColByRelationIdx( long TenantId,
		long RelationId )
	{
		final String S_ProcName = "deepDisposeRelationColByRelationIdx";
		IYCFBamRelationColObj obj;
		List<IYCFBamRelationColObj> arrayList = readCachedRelationColByRelationIdx( TenantId,
				RelationId );
		if( arrayList != null )  {
			Iterator<IYCFBamRelationColObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeRelationColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeRelationColByDefSchemaIdx";
		IYCFBamRelationColObj obj;
		List<IYCFBamRelationColObj> arrayList = readCachedRelationColByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamRelationColObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeRelationColByFromColIdx( long TenantId,
		long FromColId )
	{
		final String S_ProcName = "deepDisposeRelationColByFromColIdx";
		IYCFBamRelationColObj obj;
		List<IYCFBamRelationColObj> arrayList = readCachedRelationColByFromColIdx( TenantId,
				FromColId );
		if( arrayList != null )  {
			Iterator<IYCFBamRelationColObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeRelationColByToColIdx( long TenantId,
		long ToColId )
	{
		final String S_ProcName = "deepDisposeRelationColByToColIdx";
		IYCFBamRelationColObj obj;
		List<IYCFBamRelationColObj> arrayList = readCachedRelationColByToColIdx( TenantId,
				ToColId );
		if( arrayList != null )  {
			Iterator<IYCFBamRelationColObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeRelationColByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "deepDisposeRelationColByPrevIdx";
		IYCFBamRelationColObj obj;
		List<IYCFBamRelationColObj> arrayList = readCachedRelationColByPrevIdx( PrevTenantId,
				PrevId );
		if( arrayList != null )  {
			Iterator<IYCFBamRelationColObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeRelationColByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "deepDisposeRelationColByNextIdx";
		IYCFBamRelationColObj obj;
		List<IYCFBamRelationColObj> arrayList = readCachedRelationColByNextIdx( NextTenantId,
				NextId );
		if( arrayList != null )  {
			Iterator<IYCFBamRelationColObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeRelationColByRelPrevIdx( long TenantId,
		long RelationId,
		Long PrevId )
	{
		final String S_ProcName = "deepDisposeRelationColByRelPrevIdx";
		IYCFBamRelationColObj obj;
		List<IYCFBamRelationColObj> arrayList = readCachedRelationColByRelPrevIdx( TenantId,
				RelationId,
				PrevId );
		if( arrayList != null )  {
			Iterator<IYCFBamRelationColObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeRelationColByRelNextIdx( long TenantId,
		long RelationId,
		Long NextId )
	{
		final String S_ProcName = "deepDisposeRelationColByRelNextIdx";
		IYCFBamRelationColObj obj;
		List<IYCFBamRelationColObj> arrayList = readCachedRelationColByRelNextIdx( TenantId,
				RelationId,
				NextId );
		if( arrayList != null )  {
			Iterator<IYCFBamRelationColObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamRelationColObj updateRelationCol( IYCFBamRelationColObj Obj ) {
		IYCFBamRelationColObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().updateRelationCol( schema.getAuthorization(),
			Obj.getRelationColBuff() );
		obj = (IYCFBamRelationColObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteRelationCol( IYCFBamRelationColObj Obj ) {
		IYCFBamRelationColObj obj = Obj;
		IYCFBamRelationColObj prev = obj.getOptionalLookupPrev();
		IYCFBamRelationColObj next = obj.getOptionalLookupNext();
		((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().deleteRelationCol( schema.getAuthorization(),
			obj.getRelationColBuff() );
		Obj.forget();
		if( prev != null ) {
			prev.read( true );
		}
		if( next != null ) {
			next.read( true );
		}
	}

	public void deleteRelationColByIdIdx( long TenantId,
		long Id )
	{
		YCFBamRelationColPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamRelationColObj obj = readRelationCol( pkey );
		if( obj != null ) {
			IYCFBamRelationColEditObj editObj = (IYCFBamRelationColEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamRelationColEditObj)obj.beginEdit();
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
		deepDisposeRelationColByIdIdx( TenantId,
				Id );
	}

	public void deleteRelationColByUNameIdx( long TenantId,
		long RelationId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamRelationColByUNameIdxKey,
				IYCFBamRelationColObj >();
		}
		YCFBamRelationColByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		key.setRequiredName( Name );
		IYCFBamRelationColObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().deleteRelationColByUNameIdx( schema.getAuthorization(),
				TenantId,
				RelationId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().deleteRelationColByUNameIdx( schema.getAuthorization(),
				TenantId,
				RelationId,
				Name );
		}
		deepDisposeRelationColByUNameIdx( TenantId,
				RelationId,
				Name );
	}

	public void deleteRelationColByRelColTenantIdx( long TenantId )
	{
		YCFBamRelationColByRelColTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelColTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByRelColTenantIdx == null ) {
			indexByRelColTenantIdx = new HashMap< YCFBamRelationColByRelColTenantIdxKey,
				Map< YCFBamRelationColPKey, IYCFBamRelationColObj > >();
		}
		if( indexByRelColTenantIdx.containsKey( key ) ) {
			Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict = indexByRelColTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().deleteRelationColByRelColTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamRelationColObj> iter = dict.values().iterator();
			IYCFBamRelationColObj obj;
			List<IYCFBamRelationColObj> toForget = new LinkedList<IYCFBamRelationColObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByRelColTenantIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().deleteRelationColByRelColTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeRelationColByRelColTenantIdx( TenantId );
	}

	public void deleteRelationColByRelationIdx( long TenantId,
		long RelationId )
	{
		YCFBamRelationColByRelationIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelationIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		if( indexByRelationIdx == null ) {
			indexByRelationIdx = new HashMap< YCFBamRelationColByRelationIdxKey,
				Map< YCFBamRelationColPKey, IYCFBamRelationColObj > >();
		}
		if( indexByRelationIdx.containsKey( key ) ) {
			Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict = indexByRelationIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().deleteRelationColByRelationIdx( schema.getAuthorization(),
				TenantId,
				RelationId );
			Iterator<IYCFBamRelationColObj> iter = dict.values().iterator();
			IYCFBamRelationColObj obj;
			List<IYCFBamRelationColObj> toForget = new LinkedList<IYCFBamRelationColObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByRelationIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().deleteRelationColByRelationIdx( schema.getAuthorization(),
				TenantId,
				RelationId );
		}
		deepDisposeRelationColByRelationIdx( TenantId,
				RelationId );
	}

	public void deleteRelationColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamRelationColByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamRelationColByDefSchemaIdxKey,
				Map< YCFBamRelationColPKey, IYCFBamRelationColObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().deleteRelationColByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamRelationColObj> iter = dict.values().iterator();
			IYCFBamRelationColObj obj;
			List<IYCFBamRelationColObj> toForget = new LinkedList<IYCFBamRelationColObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().deleteRelationColByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeRelationColByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteRelationColByFromColIdx( long TenantId,
		long FromColId )
	{
		YCFBamRelationColByFromColIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newFromColIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredFromColId( FromColId );
		if( indexByFromColIdx == null ) {
			indexByFromColIdx = new HashMap< YCFBamRelationColByFromColIdxKey,
				Map< YCFBamRelationColPKey, IYCFBamRelationColObj > >();
		}
		if( indexByFromColIdx.containsKey( key ) ) {
			Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict = indexByFromColIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().deleteRelationColByFromColIdx( schema.getAuthorization(),
				TenantId,
				FromColId );
			Iterator<IYCFBamRelationColObj> iter = dict.values().iterator();
			IYCFBamRelationColObj obj;
			List<IYCFBamRelationColObj> toForget = new LinkedList<IYCFBamRelationColObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByFromColIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().deleteRelationColByFromColIdx( schema.getAuthorization(),
				TenantId,
				FromColId );
		}
		deepDisposeRelationColByFromColIdx( TenantId,
				FromColId );
	}

	public void deleteRelationColByToColIdx( long TenantId,
		long ToColId )
	{
		YCFBamRelationColByToColIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newToColIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredToColId( ToColId );
		if( indexByToColIdx == null ) {
			indexByToColIdx = new HashMap< YCFBamRelationColByToColIdxKey,
				Map< YCFBamRelationColPKey, IYCFBamRelationColObj > >();
		}
		if( indexByToColIdx.containsKey( key ) ) {
			Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict = indexByToColIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().deleteRelationColByToColIdx( schema.getAuthorization(),
				TenantId,
				ToColId );
			Iterator<IYCFBamRelationColObj> iter = dict.values().iterator();
			IYCFBamRelationColObj obj;
			List<IYCFBamRelationColObj> toForget = new LinkedList<IYCFBamRelationColObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByToColIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().deleteRelationColByToColIdx( schema.getAuthorization(),
				TenantId,
				ToColId );
		}
		deepDisposeRelationColByToColIdx( TenantId,
				ToColId );
	}

	public void deleteRelationColByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		YCFBamRelationColByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< YCFBamRelationColByPrevIdxKey,
				Map< YCFBamRelationColPKey, IYCFBamRelationColObj > >();
		}
		if( indexByPrevIdx.containsKey( key ) ) {
			Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict = indexByPrevIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().deleteRelationColByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			Iterator<IYCFBamRelationColObj> iter = dict.values().iterator();
			IYCFBamRelationColObj obj;
			List<IYCFBamRelationColObj> toForget = new LinkedList<IYCFBamRelationColObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().deleteRelationColByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
		}
		deepDisposeRelationColByPrevIdx( PrevTenantId,
				PrevId );
	}

	public void deleteRelationColByNextIdx( Long NextTenantId,
		Long NextId )
	{
		YCFBamRelationColByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< YCFBamRelationColByNextIdxKey,
				Map< YCFBamRelationColPKey, IYCFBamRelationColObj > >();
		}
		if( indexByNextIdx.containsKey( key ) ) {
			Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict = indexByNextIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().deleteRelationColByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			Iterator<IYCFBamRelationColObj> iter = dict.values().iterator();
			IYCFBamRelationColObj obj;
			List<IYCFBamRelationColObj> toForget = new LinkedList<IYCFBamRelationColObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().deleteRelationColByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
		}
		deepDisposeRelationColByNextIdx( NextTenantId,
				NextId );
	}

	public void deleteRelationColByRelPrevIdx( long TenantId,
		long RelationId,
		Long PrevId )
	{
		YCFBamRelationColByRelPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		key.setOptionalPrevId( PrevId );
		if( indexByRelPrevIdx == null ) {
			indexByRelPrevIdx = new HashMap< YCFBamRelationColByRelPrevIdxKey,
				Map< YCFBamRelationColPKey, IYCFBamRelationColObj > >();
		}
		if( indexByRelPrevIdx.containsKey( key ) ) {
			Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict = indexByRelPrevIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().deleteRelationColByRelPrevIdx( schema.getAuthorization(),
				TenantId,
				RelationId,
				PrevId );
			Iterator<IYCFBamRelationColObj> iter = dict.values().iterator();
			IYCFBamRelationColObj obj;
			List<IYCFBamRelationColObj> toForget = new LinkedList<IYCFBamRelationColObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByRelPrevIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().deleteRelationColByRelPrevIdx( schema.getAuthorization(),
				TenantId,
				RelationId,
				PrevId );
		}
		deepDisposeRelationColByRelPrevIdx( TenantId,
				RelationId,
				PrevId );
	}

	public void deleteRelationColByRelNextIdx( long TenantId,
		long RelationId,
		Long NextId )
	{
		YCFBamRelationColByRelNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newRelNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		key.setOptionalNextId( NextId );
		if( indexByRelNextIdx == null ) {
			indexByRelNextIdx = new HashMap< YCFBamRelationColByRelNextIdxKey,
				Map< YCFBamRelationColPKey, IYCFBamRelationColObj > >();
		}
		if( indexByRelNextIdx.containsKey( key ) ) {
			Map<YCFBamRelationColPKey, IYCFBamRelationColObj> dict = indexByRelNextIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().deleteRelationColByRelNextIdx( schema.getAuthorization(),
				TenantId,
				RelationId,
				NextId );
			Iterator<IYCFBamRelationColObj> iter = dict.values().iterator();
			IYCFBamRelationColObj obj;
			List<IYCFBamRelationColObj> toForget = new LinkedList<IYCFBamRelationColObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByRelNextIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().deleteRelationColByRelNextIdx( schema.getAuthorization(),
				TenantId,
				RelationId,
				NextId );
		}
		deepDisposeRelationColByRelNextIdx( TenantId,
				RelationId,
				NextId );
	}

	/**
	 *	Move the YCFBamRelationColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamRelationColObj refreshed cache instance.
	 */
	public IYCFBamRelationColObj moveUpRelationCol( IYCFBamRelationColObj Obj ) {
		IYCFBamRelationColObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new YCFLibUsageException( getClass(),
				"moveUpRelationCol",
				"You cannot move an object that is being edited" );
		}
		YCFBamRelationColBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().moveBuffUp( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getRelationColTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPKey() );
			obj.setBuff( buff );
			obj = (IYCFBamRelationColObj)obj.realise();
			IYCFBamRelationColObj prev = obj.getOptionalLookupPrev( true );
			IYCFBamRelationColObj next = obj.getOptionalLookupNext( true );
			if( next != null ) {
				IYCFBamRelationColObj gnext = next.getOptionalLookupNext( true );
			}
		}
		return( obj );
	}

	/**
	 *	Move the YCFBamRelationColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamRelationColObj refreshed cache instance.
	 */
	public IYCFBamRelationColObj moveDownRelationCol( IYCFBamRelationColObj Obj ) {
		IYCFBamRelationColObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new YCFLibUsageException( getClass(),
				"moveDownRelationCol",
				"You cannot move an object that is being edited" );
		}
		YCFBamRelationColBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().moveBuffDown( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getRelationColTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPKey() );
			obj.setBuff( buff );
			obj = (IYCFBamRelationColObj)obj.realise();
			IYCFBamRelationColObj prev = obj.getOptionalLookupPrev( true );
			if( prev != null ) {
				IYCFBamRelationColObj gprev = prev.getOptionalLookupPrev( true );
			}
			IYCFBamRelationColObj next = obj.getOptionalLookupNext( true );
		}
		return( obj );
	}
}
