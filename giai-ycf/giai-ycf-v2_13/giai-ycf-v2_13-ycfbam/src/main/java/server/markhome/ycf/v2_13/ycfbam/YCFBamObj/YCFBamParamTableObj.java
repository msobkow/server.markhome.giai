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

public class YCFBamParamTableObj
	implements IYCFBamParamTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamParamPKey, IYCFBamParamObj> members;
	private Map<YCFBamParamPKey, IYCFBamParamObj> allParam;
	private Map< YCFBamParamByUNameIdxKey,
		IYCFBamParamObj > indexByUNameIdx;
	private Map< YCFBamParamByValTentIdxKey,
		Map<YCFBamParamPKey, IYCFBamParamObj > > indexByValTentIdx;
	private Map< YCFBamParamByServerMethodIdxKey,
		Map<YCFBamParamPKey, IYCFBamParamObj > > indexByServerMethodIdx;
	private Map< YCFBamParamByDefSchemaIdxKey,
		Map<YCFBamParamPKey, IYCFBamParamObj > > indexByDefSchemaIdx;
	private Map< YCFBamParamByServerTypeIdxKey,
		Map<YCFBamParamPKey, IYCFBamParamObj > > indexByServerTypeIdx;
	private Map< YCFBamParamByPrevIdxKey,
		Map<YCFBamParamPKey, IYCFBamParamObj > > indexByPrevIdx;
	private Map< YCFBamParamByNextIdxKey,
		Map<YCFBamParamPKey, IYCFBamParamObj > > indexByNextIdx;
	private Map< YCFBamParamByContPrevIdxKey,
		Map<YCFBamParamPKey, IYCFBamParamObj > > indexByContPrevIdx;
	private Map< YCFBamParamByContNextIdxKey,
		Map<YCFBamParamPKey, IYCFBamParamObj > > indexByContNextIdx;
	public static String TABLE_NAME = "Param";
	public static String TABLE_DBNAME = "srvprm";

	public YCFBamParamTableObj() {
		schema = null;
		members = new HashMap<YCFBamParamPKey, IYCFBamParamObj>();
		allParam = null;
		indexByUNameIdx = null;
		indexByValTentIdx = null;
		indexByServerMethodIdx = null;
		indexByDefSchemaIdx = null;
		indexByServerTypeIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
		indexByContPrevIdx = null;
		indexByContNextIdx = null;
	}

	public YCFBamParamTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamParamPKey, IYCFBamParamObj>();
		allParam = null;
		indexByUNameIdx = null;
		indexByValTentIdx = null;
		indexByServerMethodIdx = null;
		indexByDefSchemaIdx = null;
		indexByServerTypeIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
		indexByContPrevIdx = null;
		indexByContNextIdx = null;
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
		allParam = null;
		indexByUNameIdx = null;
		indexByValTentIdx = null;
		indexByServerMethodIdx = null;
		indexByDefSchemaIdx = null;
		indexByServerTypeIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
		indexByContPrevIdx = null;
		indexByContNextIdx = null;
		List<IYCFBamParamObj> toForget = new LinkedList<IYCFBamParamObj>();
		IYCFBamParamObj cur = null;
		Iterator<IYCFBamParamObj> iter = members.values().iterator();
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
	 *	YCFBamParamObj.
	 */
	public IYCFBamParamObj newInstance() {
		IYCFBamParamObj inst = new YCFBamParamObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamParamObj.
	 */
	public IYCFBamParamEditObj newEditInstance( IYCFBamParamObj orig ) {
		IYCFBamParamEditObj edit = new YCFBamParamEditObj( orig );
		return( edit );
	}

	public IYCFBamParamObj realiseParam( IYCFBamParamObj Obj ) {
		IYCFBamParamObj obj = Obj;
		YCFBamParamPKey pkey = obj.getPKey();
		IYCFBamParamObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamParamObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByUNameIdx != null ) {
				YCFBamParamByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredServerMethodId( keepObj.getRequiredServerMethodId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByValTentIdx != null ) {
				YCFBamParamByValTentIdxKey keyValTentIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newValTentIdxKey();
				keyValTentIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamParamPKey, IYCFBamParamObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.remove( keepObj.getPKey() );
					if( mapValTentIdx.size() <= 0 ) {
						indexByValTentIdx.remove( keyValTentIdx );
					}
				}
			}

			if( indexByServerMethodIdx != null ) {
				YCFBamParamByServerMethodIdxKey keyServerMethodIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newServerMethodIdxKey();
				keyServerMethodIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyServerMethodIdx.setRequiredServerMethodId( keepObj.getRequiredServerMethodId() );
				Map<YCFBamParamPKey, IYCFBamParamObj > mapServerMethodIdx = indexByServerMethodIdx.get( keyServerMethodIdx );
				if( mapServerMethodIdx != null ) {
					mapServerMethodIdx.remove( keepObj.getPKey() );
					if( mapServerMethodIdx.size() <= 0 ) {
						indexByServerMethodIdx.remove( keyServerMethodIdx );
					}
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamParamByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamParamPKey, IYCFBamParamObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.remove( keepObj.getPKey() );
					if( mapDefSchemaIdx.size() <= 0 ) {
						indexByDefSchemaIdx.remove( keyDefSchemaIdx );
					}
				}
			}

			if( indexByServerTypeIdx != null ) {
				YCFBamParamByServerTypeIdxKey keyServerTypeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newServerTypeIdxKey();
				keyServerTypeIdx.setOptionalTypeTenantId( keepObj.getOptionalTypeTenantId() );
				keyServerTypeIdx.setOptionalTypeId( keepObj.getOptionalTypeId() );
				Map<YCFBamParamPKey, IYCFBamParamObj > mapServerTypeIdx = indexByServerTypeIdx.get( keyServerTypeIdx );
				if( mapServerTypeIdx != null ) {
					mapServerTypeIdx.remove( keepObj.getPKey() );
					if( mapServerTypeIdx.size() <= 0 ) {
						indexByServerTypeIdx.remove( keyServerTypeIdx );
					}
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamParamByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamParamPKey, IYCFBamParamObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.remove( keepObj.getPKey() );
					if( mapPrevIdx.size() <= 0 ) {
						indexByPrevIdx.remove( keyPrevIdx );
					}
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamParamByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamParamPKey, IYCFBamParamObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.remove( keepObj.getPKey() );
					if( mapNextIdx.size() <= 0 ) {
						indexByNextIdx.remove( keyNextIdx );
					}
				}
			}

			if( indexByContPrevIdx != null ) {
				YCFBamParamByContPrevIdxKey keyContPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newContPrevIdxKey();
				keyContPrevIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyContPrevIdx.setRequiredServerMethodId( keepObj.getRequiredServerMethodId() );
				keyContPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamParamPKey, IYCFBamParamObj > mapContPrevIdx = indexByContPrevIdx.get( keyContPrevIdx );
				if( mapContPrevIdx != null ) {
					mapContPrevIdx.remove( keepObj.getPKey() );
					if( mapContPrevIdx.size() <= 0 ) {
						indexByContPrevIdx.remove( keyContPrevIdx );
					}
				}
			}

			if( indexByContNextIdx != null ) {
				YCFBamParamByContNextIdxKey keyContNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newContNextIdxKey();
				keyContNextIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyContNextIdx.setRequiredServerMethodId( keepObj.getRequiredServerMethodId() );
				keyContNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamParamPKey, IYCFBamParamObj > mapContNextIdx = indexByContNextIdx.get( keyContNextIdx );
				if( mapContNextIdx != null ) {
					mapContNextIdx.remove( keepObj.getPKey() );
					if( mapContNextIdx.size() <= 0 ) {
						indexByContNextIdx.remove( keyContNextIdx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByUNameIdx != null ) {
				YCFBamParamByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredServerMethodId( keepObj.getRequiredServerMethodId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByValTentIdx != null ) {
				YCFBamParamByValTentIdxKey keyValTentIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newValTentIdxKey();
				keyValTentIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamParamPKey, IYCFBamParamObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByServerMethodIdx != null ) {
				YCFBamParamByServerMethodIdxKey keyServerMethodIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newServerMethodIdxKey();
				keyServerMethodIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyServerMethodIdx.setRequiredServerMethodId( keepObj.getRequiredServerMethodId() );
				Map<YCFBamParamPKey, IYCFBamParamObj > mapServerMethodIdx = indexByServerMethodIdx.get( keyServerMethodIdx );
				if( mapServerMethodIdx != null ) {
					mapServerMethodIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamParamByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamParamPKey, IYCFBamParamObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByServerTypeIdx != null ) {
				YCFBamParamByServerTypeIdxKey keyServerTypeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newServerTypeIdxKey();
				keyServerTypeIdx.setOptionalTypeTenantId( keepObj.getOptionalTypeTenantId() );
				keyServerTypeIdx.setOptionalTypeId( keepObj.getOptionalTypeId() );
				Map<YCFBamParamPKey, IYCFBamParamObj > mapServerTypeIdx = indexByServerTypeIdx.get( keyServerTypeIdx );
				if( mapServerTypeIdx != null ) {
					mapServerTypeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamParamByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamParamPKey, IYCFBamParamObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamParamByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamParamPKey, IYCFBamParamObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByContPrevIdx != null ) {
				YCFBamParamByContPrevIdxKey keyContPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newContPrevIdxKey();
				keyContPrevIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyContPrevIdx.setRequiredServerMethodId( keepObj.getRequiredServerMethodId() );
				keyContPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamParamPKey, IYCFBamParamObj > mapContPrevIdx = indexByContPrevIdx.get( keyContPrevIdx );
				if( mapContPrevIdx != null ) {
					mapContPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByContNextIdx != null ) {
				YCFBamParamByContNextIdxKey keyContNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newContNextIdxKey();
				keyContNextIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyContNextIdx.setRequiredServerMethodId( keepObj.getRequiredServerMethodId() );
				keyContNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamParamPKey, IYCFBamParamObj > mapContNextIdx = indexByContNextIdx.get( keyContNextIdx );
				if( mapContNextIdx != null ) {
					mapContNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allParam != null ) {
				allParam.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allParam != null ) {
				allParam.put( keepObj.getPKey(), keepObj );
			}

			if( indexByUNameIdx != null ) {
				YCFBamParamByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredServerMethodId( keepObj.getRequiredServerMethodId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByValTentIdx != null ) {
				YCFBamParamByValTentIdxKey keyValTentIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newValTentIdxKey();
				keyValTentIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamParamPKey, IYCFBamParamObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByServerMethodIdx != null ) {
				YCFBamParamByServerMethodIdxKey keyServerMethodIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newServerMethodIdxKey();
				keyServerMethodIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyServerMethodIdx.setRequiredServerMethodId( keepObj.getRequiredServerMethodId() );
				Map<YCFBamParamPKey, IYCFBamParamObj > mapServerMethodIdx = indexByServerMethodIdx.get( keyServerMethodIdx );
				if( mapServerMethodIdx != null ) {
					mapServerMethodIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamParamByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamParamPKey, IYCFBamParamObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByServerTypeIdx != null ) {
				YCFBamParamByServerTypeIdxKey keyServerTypeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newServerTypeIdxKey();
				keyServerTypeIdx.setOptionalTypeTenantId( keepObj.getOptionalTypeTenantId() );
				keyServerTypeIdx.setOptionalTypeId( keepObj.getOptionalTypeId() );
				Map<YCFBamParamPKey, IYCFBamParamObj > mapServerTypeIdx = indexByServerTypeIdx.get( keyServerTypeIdx );
				if( mapServerTypeIdx != null ) {
					mapServerTypeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamParamByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamParamPKey, IYCFBamParamObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamParamByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamParamPKey, IYCFBamParamObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByContPrevIdx != null ) {
				YCFBamParamByContPrevIdxKey keyContPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newContPrevIdxKey();
				keyContPrevIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyContPrevIdx.setRequiredServerMethodId( keepObj.getRequiredServerMethodId() );
				keyContPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamParamPKey, IYCFBamParamObj > mapContPrevIdx = indexByContPrevIdx.get( keyContPrevIdx );
				if( mapContPrevIdx != null ) {
					mapContPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByContNextIdx != null ) {
				YCFBamParamByContNextIdxKey keyContNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newContNextIdxKey();
				keyContNextIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyContNextIdx.setRequiredServerMethodId( keepObj.getRequiredServerMethodId() );
				keyContNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamParamPKey, IYCFBamParamObj > mapContNextIdx = indexByContNextIdx.get( keyContNextIdx );
				if( mapContNextIdx != null ) {
					mapContNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamParamObj createParam( IYCFBamParamObj Obj ) {
		IYCFBamParamObj obj = Obj;
		YCFBamParamBuff buff = obj.getParamBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableParam().createParam(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		IYCFBamParamObj prev = obj.getOptionalLookupPrev();
		if( prev != null ) {
			prev.read( true );
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamParamObj readParam( YCFBamParamPKey pkey ) {
		return( readParam( pkey, false ) );
	}

	public IYCFBamParamObj readParam( YCFBamParamPKey pkey, boolean forceRead ) {
		IYCFBamParamObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamParamBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableParam().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getParamTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamParamObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamParamObj readCachedParam( YCFBamParamPKey pkey ) {
		IYCFBamParamObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeParam( IYCFBamParamObj obj )
	{
		final String S_ProcName = "YCFBamParamTableObj.reallyDeepDisposeParam() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamParamPKey pkey = obj.getPKey();
		IYCFBamParamObj existing = readCachedParam( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamParamByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredServerMethodId( existing.getRequiredServerMethodId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamParamByValTentIdxKey keyValTentIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newValTentIdxKey();
		keyValTentIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamParamByServerMethodIdxKey keyServerMethodIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newServerMethodIdxKey();
		keyServerMethodIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyServerMethodIdx.setRequiredServerMethodId( existing.getRequiredServerMethodId() );

		YCFBamParamByDefSchemaIdxKey keyDefSchemaIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamParamByServerTypeIdxKey keyServerTypeIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newServerTypeIdxKey();
		keyServerTypeIdx.setOptionalTypeTenantId( existing.getOptionalTypeTenantId() );
		keyServerTypeIdx.setOptionalTypeId( existing.getOptionalTypeId() );

		YCFBamParamByPrevIdxKey keyPrevIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamParamByNextIdxKey keyNextIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newNextIdxKey();
		keyNextIdx.setOptionalNextTenantId( existing.getOptionalNextTenantId() );
		keyNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		YCFBamParamByContPrevIdxKey keyContPrevIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newContPrevIdxKey();
		keyContPrevIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyContPrevIdx.setRequiredServerMethodId( existing.getRequiredServerMethodId() );
		keyContPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamParamByContNextIdxKey keyContNextIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newContNextIdxKey();
		keyContNextIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyContNextIdx.setRequiredServerMethodId( existing.getRequiredServerMethodId() );
		keyContNextIdx.setOptionalNextId( existing.getOptionalNextId() );



		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}

		if( indexByValTentIdx != null ) {
			if( indexByValTentIdx.containsKey( keyValTentIdx ) ) {
				indexByValTentIdx.get( keyValTentIdx ).remove( pkey );
				if( indexByValTentIdx.get( keyValTentIdx ).size() <= 0 ) {
					indexByValTentIdx.remove( keyValTentIdx );
				}
			}
		}

		if( indexByServerMethodIdx != null ) {
			if( indexByServerMethodIdx.containsKey( keyServerMethodIdx ) ) {
				indexByServerMethodIdx.get( keyServerMethodIdx ).remove( pkey );
				if( indexByServerMethodIdx.get( keyServerMethodIdx ).size() <= 0 ) {
					indexByServerMethodIdx.remove( keyServerMethodIdx );
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

		if( indexByServerTypeIdx != null ) {
			if( indexByServerTypeIdx.containsKey( keyServerTypeIdx ) ) {
				indexByServerTypeIdx.get( keyServerTypeIdx ).remove( pkey );
				if( indexByServerTypeIdx.get( keyServerTypeIdx ).size() <= 0 ) {
					indexByServerTypeIdx.remove( keyServerTypeIdx );
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

		if( indexByContPrevIdx != null ) {
			if( indexByContPrevIdx.containsKey( keyContPrevIdx ) ) {
				indexByContPrevIdx.get( keyContPrevIdx ).remove( pkey );
				if( indexByContPrevIdx.get( keyContPrevIdx ).size() <= 0 ) {
					indexByContPrevIdx.remove( keyContPrevIdx );
				}
			}
		}

		if( indexByContNextIdx != null ) {
			if( indexByContNextIdx.containsKey( keyContNextIdx ) ) {
				indexByContNextIdx.get( keyContNextIdx ).remove( pkey );
				if( indexByContNextIdx.get( keyContNextIdx ).size() <= 0 ) {
					indexByContNextIdx.remove( keyContNextIdx );
				}
			}
		}


	}
	public void deepDisposeParam( YCFBamParamPKey pkey ) {
		IYCFBamParamObj obj = readCachedParam( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamParamObj lockParam( YCFBamParamPKey pkey ) {
		IYCFBamParamObj locked = null;
		YCFBamParamBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableParam().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getParamTableObj().newInstance();
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamParamObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockParam", pkey );
		}
		return( locked );
	}

	public List<IYCFBamParamObj> readAllParam() {
		return( readAllParam( false ) );
	}

	public List<IYCFBamParamObj> readAllParam( boolean forceRead ) {
		final String S_ProcName = "readAllParam";
		if( ( allParam == null ) || forceRead ) {
			Map<YCFBamParamPKey, IYCFBamParamObj> map = new HashMap<YCFBamParamPKey,IYCFBamParamObj>();
			allParam = map;
			YCFBamParamBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableParam().readAllDerived( schema.getAuthorization() );
			YCFBamParamBuff buff;
			IYCFBamParamObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newPKey() );
				obj.setBuff( buff );
				IYCFBamParamObj realised = (IYCFBamParamObj)obj.realise();
			}
		}
		int len = allParam.size();
		IYCFBamParamObj arr[] = new IYCFBamParamObj[len];
		Iterator<IYCFBamParamObj> valIter = allParam.values().iterator();
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
		ArrayList<IYCFBamParamObj> arrayList = new ArrayList<IYCFBamParamObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamParamObj> cmp = new Comparator<IYCFBamParamObj>() {
			public int compare( IYCFBamParamObj lhs, IYCFBamParamObj rhs ) {
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
					YCFBamParamPKey lhsPKey = lhs.getPKey();
					YCFBamParamPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamParamObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamParamObj> readCachedAllParam() {
		final String S_ProcName = "readCachedAllParam";
		ArrayList<IYCFBamParamObj> arrayList = new ArrayList<IYCFBamParamObj>();
		if( allParam != null ) {
			int len = allParam.size();
			IYCFBamParamObj arr[] = new IYCFBamParamObj[len];
			Iterator<IYCFBamParamObj> valIter = allParam.values().iterator();
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
		Comparator<IYCFBamParamObj> cmp = new Comparator<IYCFBamParamObj>() {
			public int compare( IYCFBamParamObj lhs, IYCFBamParamObj rhs ) {
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
					YCFBamParamPKey lhsPKey = lhs.getPKey();
					YCFBamParamPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFBamParamObj readParamByIdIdx( long TenantId,
		long Id )
	{
		return( readParamByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamParamObj readParamByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamParamPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamParamObj obj = readParam( pkey, forceRead );
		return( obj );
	}

	public IYCFBamParamObj readParamByUNameIdx( long TenantId,
		long ServerMethodId,
		String Name )
	{
		return( readParamByUNameIdx( TenantId,
			ServerMethodId,
			Name,
			false ) );
	}

	public IYCFBamParamObj readParamByUNameIdx( long TenantId,
		long ServerMethodId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamParamByUNameIdxKey,
				IYCFBamParamObj >();
		}
		YCFBamParamByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredServerMethodId( ServerMethodId );
		key.setRequiredName( Name );
		IYCFBamParamObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamParamBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableParam().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				ServerMethodId,
				Name );
			if( buff != null ) {
				obj = schema.getParamTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamParamObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamParamObj> readParamByValTentIdx( long TenantId )
	{
		return( readParamByValTentIdx( TenantId,
			false ) );
	}

	public List<IYCFBamParamObj> readParamByValTentIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readParamByValTentIdx";
		YCFBamParamByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamParamPKey, IYCFBamParamObj> dict;
		if( indexByValTentIdx == null ) {
			indexByValTentIdx = new HashMap< YCFBamParamByValTentIdxKey,
				Map< YCFBamParamPKey, IYCFBamParamObj > >();
		}
		if( ( ! forceRead ) && indexByValTentIdx.containsKey( key ) ) {
			dict = indexByValTentIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamParamPKey, IYCFBamParamObj>();
			IYCFBamParamObj obj;
			YCFBamParamBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableParam().readDerivedByValTentIdx( schema.getAuthorization(),
				TenantId );
			YCFBamParamBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getParamTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newPKey() );
				obj.setBuff( buff );
				IYCFBamParamObj realised = (IYCFBamParamObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByValTentIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamParamObj arr[] = new IYCFBamParamObj[len];
		Iterator<IYCFBamParamObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamParamObj> arrayList = new ArrayList<IYCFBamParamObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamParamObj> cmp = new Comparator<IYCFBamParamObj>() {
			public int compare( IYCFBamParamObj lhs, IYCFBamParamObj rhs ) {
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
					YCFBamParamPKey lhsPKey = lhs.getPKey();
					YCFBamParamPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamParamObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamParamObj> readParamByServerMethodIdx( long TenantId,
		long ServerMethodId )
	{
		return( readParamByServerMethodIdx( TenantId,
			ServerMethodId,
			false ) );
	}

	public List<IYCFBamParamObj> readParamByServerMethodIdx( long TenantId,
		long ServerMethodId,
		boolean forceRead )
	{
		final String S_ProcName = "readParamByServerMethodIdx";
		YCFBamParamByServerMethodIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newServerMethodIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredServerMethodId( ServerMethodId );
		Map<YCFBamParamPKey, IYCFBamParamObj> dict;
		if( indexByServerMethodIdx == null ) {
			indexByServerMethodIdx = new HashMap< YCFBamParamByServerMethodIdxKey,
				Map< YCFBamParamPKey, IYCFBamParamObj > >();
		}
		if( ( ! forceRead ) && indexByServerMethodIdx.containsKey( key ) ) {
			dict = indexByServerMethodIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamParamPKey, IYCFBamParamObj>();
			IYCFBamParamObj obj;
			YCFBamParamBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableParam().readDerivedByServerMethodIdx( schema.getAuthorization(),
				TenantId,
				ServerMethodId );
			YCFBamParamBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getParamTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newPKey() );
				obj.setBuff( buff );
				IYCFBamParamObj realised = (IYCFBamParamObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByServerMethodIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamParamObj arr[] = new IYCFBamParamObj[len];
		Iterator<IYCFBamParamObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamParamObj> arrayList = new ArrayList<IYCFBamParamObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamParamObj> cmp = new Comparator<IYCFBamParamObj>() {
			public int compare( IYCFBamParamObj lhs, IYCFBamParamObj rhs ) {
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
					YCFBamParamPKey lhsPKey = lhs.getPKey();
					YCFBamParamPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamParamObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamParamObj> readParamByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readParamByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamParamObj> readParamByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readParamByDefSchemaIdx";
		YCFBamParamByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamParamPKey, IYCFBamParamObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamParamByDefSchemaIdxKey,
				Map< YCFBamParamPKey, IYCFBamParamObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamParamPKey, IYCFBamParamObj>();
			IYCFBamParamObj obj;
			YCFBamParamBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableParam().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamParamBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getParamTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newPKey() );
				obj.setBuff( buff );
				IYCFBamParamObj realised = (IYCFBamParamObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamParamObj arr[] = new IYCFBamParamObj[len];
		Iterator<IYCFBamParamObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamParamObj> arrayList = new ArrayList<IYCFBamParamObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamParamObj> cmp = new Comparator<IYCFBamParamObj>() {
			public int compare( IYCFBamParamObj lhs, IYCFBamParamObj rhs ) {
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
					YCFBamParamPKey lhsPKey = lhs.getPKey();
					YCFBamParamPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamParamObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamParamObj> readParamByServerTypeIdx( Long TypeTenantId,
		Long TypeId )
	{
		return( readParamByServerTypeIdx( TypeTenantId,
			TypeId,
			false ) );
	}

	public List<IYCFBamParamObj> readParamByServerTypeIdx( Long TypeTenantId,
		Long TypeId,
		boolean forceRead )
	{
		final String S_ProcName = "readParamByServerTypeIdx";
		YCFBamParamByServerTypeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newServerTypeIdxKey();
		key.setOptionalTypeTenantId( TypeTenantId );
		key.setOptionalTypeId( TypeId );
		Map<YCFBamParamPKey, IYCFBamParamObj> dict;
		if( indexByServerTypeIdx == null ) {
			indexByServerTypeIdx = new HashMap< YCFBamParamByServerTypeIdxKey,
				Map< YCFBamParamPKey, IYCFBamParamObj > >();
		}
		if( ( ! forceRead ) && indexByServerTypeIdx.containsKey( key ) ) {
			dict = indexByServerTypeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamParamPKey, IYCFBamParamObj>();
			IYCFBamParamObj obj;
			YCFBamParamBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableParam().readDerivedByServerTypeIdx( schema.getAuthorization(),
				TypeTenantId,
				TypeId );
			YCFBamParamBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getParamTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newPKey() );
				obj.setBuff( buff );
				IYCFBamParamObj realised = (IYCFBamParamObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByServerTypeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamParamObj arr[] = new IYCFBamParamObj[len];
		Iterator<IYCFBamParamObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamParamObj> arrayList = new ArrayList<IYCFBamParamObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamParamObj> cmp = new Comparator<IYCFBamParamObj>() {
			public int compare( IYCFBamParamObj lhs, IYCFBamParamObj rhs ) {
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
					YCFBamParamPKey lhsPKey = lhs.getPKey();
					YCFBamParamPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamParamObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamParamObj> readParamByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		return( readParamByPrevIdx( PrevTenantId,
			PrevId,
			false ) );
	}

	public List<IYCFBamParamObj> readParamByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead )
	{
		final String S_ProcName = "readParamByPrevIdx";
		YCFBamParamByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		Map<YCFBamParamPKey, IYCFBamParamObj> dict;
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< YCFBamParamByPrevIdxKey,
				Map< YCFBamParamPKey, IYCFBamParamObj > >();
		}
		if( ( ! forceRead ) && indexByPrevIdx.containsKey( key ) ) {
			dict = indexByPrevIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamParamPKey, IYCFBamParamObj>();
			IYCFBamParamObj obj;
			YCFBamParamBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableParam().readDerivedByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			YCFBamParamBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getParamTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newPKey() );
				obj.setBuff( buff );
				IYCFBamParamObj realised = (IYCFBamParamObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPrevIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamParamObj arr[] = new IYCFBamParamObj[len];
		Iterator<IYCFBamParamObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamParamObj> arrayList = new ArrayList<IYCFBamParamObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamParamObj> cmp = new Comparator<IYCFBamParamObj>() {
			public int compare( IYCFBamParamObj lhs, IYCFBamParamObj rhs ) {
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
					YCFBamParamPKey lhsPKey = lhs.getPKey();
					YCFBamParamPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamParamObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamParamObj> readParamByNextIdx( Long NextTenantId,
		Long NextId )
	{
		return( readParamByNextIdx( NextTenantId,
			NextId,
			false ) );
	}

	public List<IYCFBamParamObj> readParamByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead )
	{
		final String S_ProcName = "readParamByNextIdx";
		YCFBamParamByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		Map<YCFBamParamPKey, IYCFBamParamObj> dict;
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< YCFBamParamByNextIdxKey,
				Map< YCFBamParamPKey, IYCFBamParamObj > >();
		}
		if( ( ! forceRead ) && indexByNextIdx.containsKey( key ) ) {
			dict = indexByNextIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamParamPKey, IYCFBamParamObj>();
			IYCFBamParamObj obj;
			YCFBamParamBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableParam().readDerivedByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			YCFBamParamBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getParamTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newPKey() );
				obj.setBuff( buff );
				IYCFBamParamObj realised = (IYCFBamParamObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByNextIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamParamObj arr[] = new IYCFBamParamObj[len];
		Iterator<IYCFBamParamObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamParamObj> arrayList = new ArrayList<IYCFBamParamObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamParamObj> cmp = new Comparator<IYCFBamParamObj>() {
			public int compare( IYCFBamParamObj lhs, IYCFBamParamObj rhs ) {
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
					YCFBamParamPKey lhsPKey = lhs.getPKey();
					YCFBamParamPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamParamObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamParamObj> readParamByContPrevIdx( long TenantId,
		long ServerMethodId,
		Long PrevId )
	{
		return( readParamByContPrevIdx( TenantId,
			ServerMethodId,
			PrevId,
			false ) );
	}

	public List<IYCFBamParamObj> readParamByContPrevIdx( long TenantId,
		long ServerMethodId,
		Long PrevId,
		boolean forceRead )
	{
		final String S_ProcName = "readParamByContPrevIdx";
		YCFBamParamByContPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newContPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredServerMethodId( ServerMethodId );
		key.setOptionalPrevId( PrevId );
		Map<YCFBamParamPKey, IYCFBamParamObj> dict;
		if( indexByContPrevIdx == null ) {
			indexByContPrevIdx = new HashMap< YCFBamParamByContPrevIdxKey,
				Map< YCFBamParamPKey, IYCFBamParamObj > >();
		}
		if( ( ! forceRead ) && indexByContPrevIdx.containsKey( key ) ) {
			dict = indexByContPrevIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamParamPKey, IYCFBamParamObj>();
			IYCFBamParamObj obj;
			YCFBamParamBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableParam().readDerivedByContPrevIdx( schema.getAuthorization(),
				TenantId,
				ServerMethodId,
				PrevId );
			YCFBamParamBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getParamTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newPKey() );
				obj.setBuff( buff );
				IYCFBamParamObj realised = (IYCFBamParamObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByContPrevIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamParamObj arr[] = new IYCFBamParamObj[len];
		Iterator<IYCFBamParamObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamParamObj> arrayList = new ArrayList<IYCFBamParamObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamParamObj> cmp = new Comparator<IYCFBamParamObj>() {
			public int compare( IYCFBamParamObj lhs, IYCFBamParamObj rhs ) {
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
					YCFBamParamPKey lhsPKey = lhs.getPKey();
					YCFBamParamPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamParamObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamParamObj> readParamByContNextIdx( long TenantId,
		long ServerMethodId,
		Long NextId )
	{
		return( readParamByContNextIdx( TenantId,
			ServerMethodId,
			NextId,
			false ) );
	}

	public List<IYCFBamParamObj> readParamByContNextIdx( long TenantId,
		long ServerMethodId,
		Long NextId,
		boolean forceRead )
	{
		final String S_ProcName = "readParamByContNextIdx";
		YCFBamParamByContNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newContNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredServerMethodId( ServerMethodId );
		key.setOptionalNextId( NextId );
		Map<YCFBamParamPKey, IYCFBamParamObj> dict;
		if( indexByContNextIdx == null ) {
			indexByContNextIdx = new HashMap< YCFBamParamByContNextIdxKey,
				Map< YCFBamParamPKey, IYCFBamParamObj > >();
		}
		if( ( ! forceRead ) && indexByContNextIdx.containsKey( key ) ) {
			dict = indexByContNextIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamParamPKey, IYCFBamParamObj>();
			IYCFBamParamObj obj;
			YCFBamParamBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableParam().readDerivedByContNextIdx( schema.getAuthorization(),
				TenantId,
				ServerMethodId,
				NextId );
			YCFBamParamBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getParamTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newPKey() );
				obj.setBuff( buff );
				IYCFBamParamObj realised = (IYCFBamParamObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByContNextIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamParamObj arr[] = new IYCFBamParamObj[len];
		Iterator<IYCFBamParamObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamParamObj> arrayList = new ArrayList<IYCFBamParamObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamParamObj> cmp = new Comparator<IYCFBamParamObj>() {
			public int compare( IYCFBamParamObj lhs, IYCFBamParamObj rhs ) {
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
					YCFBamParamPKey lhsPKey = lhs.getPKey();
					YCFBamParamPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamParamObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamParamObj readCachedParamByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamParamObj obj = null;
		YCFBamParamPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedParam( pkey );
		return( obj );
	}

	public IYCFBamParamObj readCachedParamByUNameIdx( long TenantId,
		long ServerMethodId,
		String Name )
	{
		IYCFBamParamObj obj = null;
		YCFBamParamByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredServerMethodId( ServerMethodId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamParamObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamParamObj> valIter = members.values().iterator();
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

	public List<IYCFBamParamObj> readCachedParamByValTentIdx( long TenantId )
	{
		final String S_ProcName = "readCachedParamByValTentIdx";
		YCFBamParamByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamParamObj> arrayList = new ArrayList<IYCFBamParamObj>();
		if( indexByValTentIdx != null ) {
			Map<YCFBamParamPKey, IYCFBamParamObj> dict;
			if( indexByValTentIdx.containsKey( key ) ) {
				dict = indexByValTentIdx.get( key );
				int len = dict.size();
				IYCFBamParamObj arr[] = new IYCFBamParamObj[len];
				Iterator<IYCFBamParamObj> valIter = dict.values().iterator();
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
			IYCFBamParamObj obj;
			Iterator<IYCFBamParamObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamParamObj> cmp = new Comparator<IYCFBamParamObj>() {
			public int compare( IYCFBamParamObj lhs, IYCFBamParamObj rhs ) {
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
					YCFBamParamPKey lhsPKey = lhs.getPKey();
					YCFBamParamPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamParamObj> readCachedParamByServerMethodIdx( long TenantId,
		long ServerMethodId )
	{
		final String S_ProcName = "readCachedParamByServerMethodIdx";
		YCFBamParamByServerMethodIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newServerMethodIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredServerMethodId( ServerMethodId );
		ArrayList<IYCFBamParamObj> arrayList = new ArrayList<IYCFBamParamObj>();
		if( indexByServerMethodIdx != null ) {
			Map<YCFBamParamPKey, IYCFBamParamObj> dict;
			if( indexByServerMethodIdx.containsKey( key ) ) {
				dict = indexByServerMethodIdx.get( key );
				int len = dict.size();
				IYCFBamParamObj arr[] = new IYCFBamParamObj[len];
				Iterator<IYCFBamParamObj> valIter = dict.values().iterator();
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
			IYCFBamParamObj obj;
			Iterator<IYCFBamParamObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamParamObj> cmp = new Comparator<IYCFBamParamObj>() {
			public int compare( IYCFBamParamObj lhs, IYCFBamParamObj rhs ) {
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
					YCFBamParamPKey lhsPKey = lhs.getPKey();
					YCFBamParamPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamParamObj> readCachedParamByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedParamByDefSchemaIdx";
		YCFBamParamByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamParamObj> arrayList = new ArrayList<IYCFBamParamObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamParamPKey, IYCFBamParamObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamParamObj arr[] = new IYCFBamParamObj[len];
				Iterator<IYCFBamParamObj> valIter = dict.values().iterator();
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
			IYCFBamParamObj obj;
			Iterator<IYCFBamParamObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamParamObj> cmp = new Comparator<IYCFBamParamObj>() {
			public int compare( IYCFBamParamObj lhs, IYCFBamParamObj rhs ) {
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
					YCFBamParamPKey lhsPKey = lhs.getPKey();
					YCFBamParamPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamParamObj> readCachedParamByServerTypeIdx( Long TypeTenantId,
		Long TypeId )
	{
		final String S_ProcName = "readCachedParamByServerTypeIdx";
		YCFBamParamByServerTypeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newServerTypeIdxKey();
		key.setOptionalTypeTenantId( TypeTenantId );
		key.setOptionalTypeId( TypeId );
		ArrayList<IYCFBamParamObj> arrayList = new ArrayList<IYCFBamParamObj>();
		if( indexByServerTypeIdx != null ) {
			Map<YCFBamParamPKey, IYCFBamParamObj> dict;
			if( indexByServerTypeIdx.containsKey( key ) ) {
				dict = indexByServerTypeIdx.get( key );
				int len = dict.size();
				IYCFBamParamObj arr[] = new IYCFBamParamObj[len];
				Iterator<IYCFBamParamObj> valIter = dict.values().iterator();
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
			IYCFBamParamObj obj;
			Iterator<IYCFBamParamObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamParamObj> cmp = new Comparator<IYCFBamParamObj>() {
			public int compare( IYCFBamParamObj lhs, IYCFBamParamObj rhs ) {
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
					YCFBamParamPKey lhsPKey = lhs.getPKey();
					YCFBamParamPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamParamObj> readCachedParamByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "readCachedParamByPrevIdx";
		YCFBamParamByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		ArrayList<IYCFBamParamObj> arrayList = new ArrayList<IYCFBamParamObj>();
		if( indexByPrevIdx != null ) {
			Map<YCFBamParamPKey, IYCFBamParamObj> dict;
			if( indexByPrevIdx.containsKey( key ) ) {
				dict = indexByPrevIdx.get( key );
				int len = dict.size();
				IYCFBamParamObj arr[] = new IYCFBamParamObj[len];
				Iterator<IYCFBamParamObj> valIter = dict.values().iterator();
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
			IYCFBamParamObj obj;
			Iterator<IYCFBamParamObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamParamObj> cmp = new Comparator<IYCFBamParamObj>() {
			public int compare( IYCFBamParamObj lhs, IYCFBamParamObj rhs ) {
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
					YCFBamParamPKey lhsPKey = lhs.getPKey();
					YCFBamParamPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamParamObj> readCachedParamByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "readCachedParamByNextIdx";
		YCFBamParamByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		ArrayList<IYCFBamParamObj> arrayList = new ArrayList<IYCFBamParamObj>();
		if( indexByNextIdx != null ) {
			Map<YCFBamParamPKey, IYCFBamParamObj> dict;
			if( indexByNextIdx.containsKey( key ) ) {
				dict = indexByNextIdx.get( key );
				int len = dict.size();
				IYCFBamParamObj arr[] = new IYCFBamParamObj[len];
				Iterator<IYCFBamParamObj> valIter = dict.values().iterator();
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
			IYCFBamParamObj obj;
			Iterator<IYCFBamParamObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamParamObj> cmp = new Comparator<IYCFBamParamObj>() {
			public int compare( IYCFBamParamObj lhs, IYCFBamParamObj rhs ) {
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
					YCFBamParamPKey lhsPKey = lhs.getPKey();
					YCFBamParamPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamParamObj> readCachedParamByContPrevIdx( long TenantId,
		long ServerMethodId,
		Long PrevId )
	{
		final String S_ProcName = "readCachedParamByContPrevIdx";
		YCFBamParamByContPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newContPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredServerMethodId( ServerMethodId );
		key.setOptionalPrevId( PrevId );
		ArrayList<IYCFBamParamObj> arrayList = new ArrayList<IYCFBamParamObj>();
		if( indexByContPrevIdx != null ) {
			Map<YCFBamParamPKey, IYCFBamParamObj> dict;
			if( indexByContPrevIdx.containsKey( key ) ) {
				dict = indexByContPrevIdx.get( key );
				int len = dict.size();
				IYCFBamParamObj arr[] = new IYCFBamParamObj[len];
				Iterator<IYCFBamParamObj> valIter = dict.values().iterator();
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
			IYCFBamParamObj obj;
			Iterator<IYCFBamParamObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamParamObj> cmp = new Comparator<IYCFBamParamObj>() {
			public int compare( IYCFBamParamObj lhs, IYCFBamParamObj rhs ) {
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
					YCFBamParamPKey lhsPKey = lhs.getPKey();
					YCFBamParamPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamParamObj> readCachedParamByContNextIdx( long TenantId,
		long ServerMethodId,
		Long NextId )
	{
		final String S_ProcName = "readCachedParamByContNextIdx";
		YCFBamParamByContNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newContNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredServerMethodId( ServerMethodId );
		key.setOptionalNextId( NextId );
		ArrayList<IYCFBamParamObj> arrayList = new ArrayList<IYCFBamParamObj>();
		if( indexByContNextIdx != null ) {
			Map<YCFBamParamPKey, IYCFBamParamObj> dict;
			if( indexByContNextIdx.containsKey( key ) ) {
				dict = indexByContNextIdx.get( key );
				int len = dict.size();
				IYCFBamParamObj arr[] = new IYCFBamParamObj[len];
				Iterator<IYCFBamParamObj> valIter = dict.values().iterator();
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
			IYCFBamParamObj obj;
			Iterator<IYCFBamParamObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamParamObj> cmp = new Comparator<IYCFBamParamObj>() {
			public int compare( IYCFBamParamObj lhs, IYCFBamParamObj rhs ) {
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
					YCFBamParamPKey lhsPKey = lhs.getPKey();
					YCFBamParamPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeParamByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamParamObj obj = readCachedParamByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeParamByUNameIdx( long TenantId,
		long ServerMethodId,
		String Name )
	{
		IYCFBamParamObj obj = readCachedParamByUNameIdx( TenantId,
				ServerMethodId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeParamByValTentIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeParamByValTentIdx";
		IYCFBamParamObj obj;
		List<IYCFBamParamObj> arrayList = readCachedParamByValTentIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamParamObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeParamByServerMethodIdx( long TenantId,
		long ServerMethodId )
	{
		final String S_ProcName = "deepDisposeParamByServerMethodIdx";
		IYCFBamParamObj obj;
		List<IYCFBamParamObj> arrayList = readCachedParamByServerMethodIdx( TenantId,
				ServerMethodId );
		if( arrayList != null )  {
			Iterator<IYCFBamParamObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeParamByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeParamByDefSchemaIdx";
		IYCFBamParamObj obj;
		List<IYCFBamParamObj> arrayList = readCachedParamByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamParamObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeParamByServerTypeIdx( Long TypeTenantId,
		Long TypeId )
	{
		final String S_ProcName = "deepDisposeParamByServerTypeIdx";
		IYCFBamParamObj obj;
		List<IYCFBamParamObj> arrayList = readCachedParamByServerTypeIdx( TypeTenantId,
				TypeId );
		if( arrayList != null )  {
			Iterator<IYCFBamParamObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeParamByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "deepDisposeParamByPrevIdx";
		IYCFBamParamObj obj;
		List<IYCFBamParamObj> arrayList = readCachedParamByPrevIdx( PrevTenantId,
				PrevId );
		if( arrayList != null )  {
			Iterator<IYCFBamParamObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeParamByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "deepDisposeParamByNextIdx";
		IYCFBamParamObj obj;
		List<IYCFBamParamObj> arrayList = readCachedParamByNextIdx( NextTenantId,
				NextId );
		if( arrayList != null )  {
			Iterator<IYCFBamParamObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeParamByContPrevIdx( long TenantId,
		long ServerMethodId,
		Long PrevId )
	{
		final String S_ProcName = "deepDisposeParamByContPrevIdx";
		IYCFBamParamObj obj;
		List<IYCFBamParamObj> arrayList = readCachedParamByContPrevIdx( TenantId,
				ServerMethodId,
				PrevId );
		if( arrayList != null )  {
			Iterator<IYCFBamParamObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeParamByContNextIdx( long TenantId,
		long ServerMethodId,
		Long NextId )
	{
		final String S_ProcName = "deepDisposeParamByContNextIdx";
		IYCFBamParamObj obj;
		List<IYCFBamParamObj> arrayList = readCachedParamByContNextIdx( TenantId,
				ServerMethodId,
				NextId );
		if( arrayList != null )  {
			Iterator<IYCFBamParamObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamParamObj updateParam( IYCFBamParamObj Obj ) {
		IYCFBamParamObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableParam().updateParam( schema.getAuthorization(),
			Obj.getParamBuff() );
		obj = (IYCFBamParamObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteParam( IYCFBamParamObj Obj ) {
		IYCFBamParamObj obj = Obj;
		IYCFBamParamObj prev = obj.getOptionalLookupPrev();
		IYCFBamParamObj next = obj.getOptionalLookupNext();
		((IYCFBamSchema)schema.getBackingStore()).getTableParam().deleteParam( schema.getAuthorization(),
			obj.getParamBuff() );
		Obj.forget();
		if( prev != null ) {
			prev.read( true );
		}
		if( next != null ) {
			next.read( true );
		}
	}

	public void deleteParamByIdIdx( long TenantId,
		long Id )
	{
		YCFBamParamPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamParamObj obj = readParam( pkey );
		if( obj != null ) {
			IYCFBamParamEditObj editObj = (IYCFBamParamEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamParamEditObj)obj.beginEdit();
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
		deepDisposeParamByIdIdx( TenantId,
				Id );
	}

	public void deleteParamByUNameIdx( long TenantId,
		long ServerMethodId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamParamByUNameIdxKey,
				IYCFBamParamObj >();
		}
		YCFBamParamByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredServerMethodId( ServerMethodId );
		key.setRequiredName( Name );
		IYCFBamParamObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableParam().deleteParamByUNameIdx( schema.getAuthorization(),
				TenantId,
				ServerMethodId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableParam().deleteParamByUNameIdx( schema.getAuthorization(),
				TenantId,
				ServerMethodId,
				Name );
		}
		deepDisposeParamByUNameIdx( TenantId,
				ServerMethodId,
				Name );
	}

	public void deleteParamByValTentIdx( long TenantId )
	{
		YCFBamParamByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByValTentIdx == null ) {
			indexByValTentIdx = new HashMap< YCFBamParamByValTentIdxKey,
				Map< YCFBamParamPKey, IYCFBamParamObj > >();
		}
		if( indexByValTentIdx.containsKey( key ) ) {
			Map<YCFBamParamPKey, IYCFBamParamObj> dict = indexByValTentIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableParam().deleteParamByValTentIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamParamObj> iter = dict.values().iterator();
			IYCFBamParamObj obj;
			List<IYCFBamParamObj> toForget = new LinkedList<IYCFBamParamObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByValTentIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableParam().deleteParamByValTentIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeParamByValTentIdx( TenantId );
	}

	public void deleteParamByServerMethodIdx( long TenantId,
		long ServerMethodId )
	{
		YCFBamParamByServerMethodIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newServerMethodIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredServerMethodId( ServerMethodId );
		if( indexByServerMethodIdx == null ) {
			indexByServerMethodIdx = new HashMap< YCFBamParamByServerMethodIdxKey,
				Map< YCFBamParamPKey, IYCFBamParamObj > >();
		}
		if( indexByServerMethodIdx.containsKey( key ) ) {
			Map<YCFBamParamPKey, IYCFBamParamObj> dict = indexByServerMethodIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableParam().deleteParamByServerMethodIdx( schema.getAuthorization(),
				TenantId,
				ServerMethodId );
			Iterator<IYCFBamParamObj> iter = dict.values().iterator();
			IYCFBamParamObj obj;
			List<IYCFBamParamObj> toForget = new LinkedList<IYCFBamParamObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByServerMethodIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableParam().deleteParamByServerMethodIdx( schema.getAuthorization(),
				TenantId,
				ServerMethodId );
		}
		deepDisposeParamByServerMethodIdx( TenantId,
				ServerMethodId );
	}

	public void deleteParamByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamParamByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamParamByDefSchemaIdxKey,
				Map< YCFBamParamPKey, IYCFBamParamObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamParamPKey, IYCFBamParamObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableParam().deleteParamByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamParamObj> iter = dict.values().iterator();
			IYCFBamParamObj obj;
			List<IYCFBamParamObj> toForget = new LinkedList<IYCFBamParamObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableParam().deleteParamByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeParamByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteParamByServerTypeIdx( Long TypeTenantId,
		Long TypeId )
	{
		YCFBamParamByServerTypeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newServerTypeIdxKey();
		key.setOptionalTypeTenantId( TypeTenantId );
		key.setOptionalTypeId( TypeId );
		if( indexByServerTypeIdx == null ) {
			indexByServerTypeIdx = new HashMap< YCFBamParamByServerTypeIdxKey,
				Map< YCFBamParamPKey, IYCFBamParamObj > >();
		}
		if( indexByServerTypeIdx.containsKey( key ) ) {
			Map<YCFBamParamPKey, IYCFBamParamObj> dict = indexByServerTypeIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableParam().deleteParamByServerTypeIdx( schema.getAuthorization(),
				TypeTenantId,
				TypeId );
			Iterator<IYCFBamParamObj> iter = dict.values().iterator();
			IYCFBamParamObj obj;
			List<IYCFBamParamObj> toForget = new LinkedList<IYCFBamParamObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByServerTypeIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableParam().deleteParamByServerTypeIdx( schema.getAuthorization(),
				TypeTenantId,
				TypeId );
		}
		deepDisposeParamByServerTypeIdx( TypeTenantId,
				TypeId );
	}

	public void deleteParamByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		YCFBamParamByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< YCFBamParamByPrevIdxKey,
				Map< YCFBamParamPKey, IYCFBamParamObj > >();
		}
		if( indexByPrevIdx.containsKey( key ) ) {
			Map<YCFBamParamPKey, IYCFBamParamObj> dict = indexByPrevIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableParam().deleteParamByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			Iterator<IYCFBamParamObj> iter = dict.values().iterator();
			IYCFBamParamObj obj;
			List<IYCFBamParamObj> toForget = new LinkedList<IYCFBamParamObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableParam().deleteParamByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
		}
		deepDisposeParamByPrevIdx( PrevTenantId,
				PrevId );
	}

	public void deleteParamByNextIdx( Long NextTenantId,
		Long NextId )
	{
		YCFBamParamByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< YCFBamParamByNextIdxKey,
				Map< YCFBamParamPKey, IYCFBamParamObj > >();
		}
		if( indexByNextIdx.containsKey( key ) ) {
			Map<YCFBamParamPKey, IYCFBamParamObj> dict = indexByNextIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableParam().deleteParamByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			Iterator<IYCFBamParamObj> iter = dict.values().iterator();
			IYCFBamParamObj obj;
			List<IYCFBamParamObj> toForget = new LinkedList<IYCFBamParamObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableParam().deleteParamByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
		}
		deepDisposeParamByNextIdx( NextTenantId,
				NextId );
	}

	public void deleteParamByContPrevIdx( long TenantId,
		long ServerMethodId,
		Long PrevId )
	{
		YCFBamParamByContPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newContPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredServerMethodId( ServerMethodId );
		key.setOptionalPrevId( PrevId );
		if( indexByContPrevIdx == null ) {
			indexByContPrevIdx = new HashMap< YCFBamParamByContPrevIdxKey,
				Map< YCFBamParamPKey, IYCFBamParamObj > >();
		}
		if( indexByContPrevIdx.containsKey( key ) ) {
			Map<YCFBamParamPKey, IYCFBamParamObj> dict = indexByContPrevIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableParam().deleteParamByContPrevIdx( schema.getAuthorization(),
				TenantId,
				ServerMethodId,
				PrevId );
			Iterator<IYCFBamParamObj> iter = dict.values().iterator();
			IYCFBamParamObj obj;
			List<IYCFBamParamObj> toForget = new LinkedList<IYCFBamParamObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByContPrevIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableParam().deleteParamByContPrevIdx( schema.getAuthorization(),
				TenantId,
				ServerMethodId,
				PrevId );
		}
		deepDisposeParamByContPrevIdx( TenantId,
				ServerMethodId,
				PrevId );
	}

	public void deleteParamByContNextIdx( long TenantId,
		long ServerMethodId,
		Long NextId )
	{
		YCFBamParamByContNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newContNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredServerMethodId( ServerMethodId );
		key.setOptionalNextId( NextId );
		if( indexByContNextIdx == null ) {
			indexByContNextIdx = new HashMap< YCFBamParamByContNextIdxKey,
				Map< YCFBamParamPKey, IYCFBamParamObj > >();
		}
		if( indexByContNextIdx.containsKey( key ) ) {
			Map<YCFBamParamPKey, IYCFBamParamObj> dict = indexByContNextIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableParam().deleteParamByContNextIdx( schema.getAuthorization(),
				TenantId,
				ServerMethodId,
				NextId );
			Iterator<IYCFBamParamObj> iter = dict.values().iterator();
			IYCFBamParamObj obj;
			List<IYCFBamParamObj> toForget = new LinkedList<IYCFBamParamObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByContNextIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableParam().deleteParamByContNextIdx( schema.getAuthorization(),
				TenantId,
				ServerMethodId,
				NextId );
		}
		deepDisposeParamByContNextIdx( TenantId,
				ServerMethodId,
				NextId );
	}

	/**
	 *	Move the YCFBamParamObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamParamObj refreshed cache instance.
	 */
	public IYCFBamParamObj moveUpParam( IYCFBamParamObj Obj ) {
		IYCFBamParamObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new YCFLibUsageException( getClass(),
				"moveUpParam",
				"You cannot move an object that is being edited" );
		}
		YCFBamParamBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableParam().moveBuffUp( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getParamTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newPKey() );
			obj.setBuff( buff );
			obj = (IYCFBamParamObj)obj.realise();
			IYCFBamParamObj prev = obj.getOptionalLookupPrev( true );
			IYCFBamParamObj next = obj.getOptionalLookupNext( true );
			if( next != null ) {
				IYCFBamParamObj gnext = next.getOptionalLookupNext( true );
			}
		}
		return( obj );
	}

	/**
	 *	Move the YCFBamParamObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamParamObj refreshed cache instance.
	 */
	public IYCFBamParamObj moveDownParam( IYCFBamParamObj Obj ) {
		IYCFBamParamObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new YCFLibUsageException( getClass(),
				"moveDownParam",
				"You cannot move an object that is being edited" );
		}
		YCFBamParamBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableParam().moveBuffDown( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getParamTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newPKey() );
			obj.setBuff( buff );
			obj = (IYCFBamParamObj)obj.realise();
			IYCFBamParamObj prev = obj.getOptionalLookupPrev( true );
			if( prev != null ) {
				IYCFBamParamObj gprev = prev.getOptionalLookupPrev( true );
			}
			IYCFBamParamObj next = obj.getOptionalLookupNext( true );
		}
		return( obj );
	}
}
