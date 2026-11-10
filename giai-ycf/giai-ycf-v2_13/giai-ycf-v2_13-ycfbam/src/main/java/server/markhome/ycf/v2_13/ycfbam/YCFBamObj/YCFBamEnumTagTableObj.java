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

public class YCFBamEnumTagTableObj
	implements IYCFBamEnumTagTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj> members;
	private Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj> allEnumTag;
	private Map< YCFBamEnumTagByEnumTagTenantIdxKey,
		Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj > > indexByEnumTagTenantIdx;
	private Map< YCFBamEnumTagByEnumIdxKey,
		Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj > > indexByEnumIdx;
	private Map< YCFBamEnumTagByDefSchemaIdxKey,
		Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj > > indexByDefSchemaIdx;
	private Map< YCFBamEnumTagByEnumNameIdxKey,
		IYCFBamEnumTagObj > indexByEnumNameIdx;
	private Map< YCFBamEnumTagByPrevIdxKey,
		Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj > > indexByPrevIdx;
	private Map< YCFBamEnumTagByNextIdxKey,
		Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj > > indexByNextIdx;
	public static String TABLE_NAME = "EnumTag";
	public static String TABLE_DBNAME = "enum_tag";

	public YCFBamEnumTagTableObj() {
		schema = null;
		members = new HashMap<YCFBamEnumTagPKey, IYCFBamEnumTagObj>();
		allEnumTag = null;
		indexByEnumTagTenantIdx = null;
		indexByEnumIdx = null;
		indexByDefSchemaIdx = null;
		indexByEnumNameIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
	}

	public YCFBamEnumTagTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamEnumTagPKey, IYCFBamEnumTagObj>();
		allEnumTag = null;
		indexByEnumTagTenantIdx = null;
		indexByEnumIdx = null;
		indexByDefSchemaIdx = null;
		indexByEnumNameIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
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
		allEnumTag = null;
		indexByEnumTagTenantIdx = null;
		indexByEnumIdx = null;
		indexByDefSchemaIdx = null;
		indexByEnumNameIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
		List<IYCFBamEnumTagObj> toForget = new LinkedList<IYCFBamEnumTagObj>();
		IYCFBamEnumTagObj cur = null;
		Iterator<IYCFBamEnumTagObj> iter = members.values().iterator();
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
	 *	YCFBamEnumTagObj.
	 */
	public IYCFBamEnumTagObj newInstance() {
		IYCFBamEnumTagObj inst = new YCFBamEnumTagObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamEnumTagObj.
	 */
	public IYCFBamEnumTagEditObj newEditInstance( IYCFBamEnumTagObj orig ) {
		IYCFBamEnumTagEditObj edit = new YCFBamEnumTagEditObj( orig );
		return( edit );
	}

	public IYCFBamEnumTagObj realiseEnumTag( IYCFBamEnumTagObj Obj ) {
		IYCFBamEnumTagObj obj = Obj;
		YCFBamEnumTagPKey pkey = obj.getPKey();
		IYCFBamEnumTagObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamEnumTagObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByEnumTagTenantIdx != null ) {
				YCFBamEnumTagByEnumTagTenantIdxKey keyEnumTagTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newEnumTagTenantIdxKey();
				keyEnumTagTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj > mapEnumTagTenantIdx = indexByEnumTagTenantIdx.get( keyEnumTagTenantIdx );
				if( mapEnumTagTenantIdx != null ) {
					mapEnumTagTenantIdx.remove( keepObj.getPKey() );
					if( mapEnumTagTenantIdx.size() <= 0 ) {
						indexByEnumTagTenantIdx.remove( keyEnumTagTenantIdx );
					}
				}
			}

			if( indexByEnumIdx != null ) {
				YCFBamEnumTagByEnumIdxKey keyEnumIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newEnumIdxKey();
				keyEnumIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyEnumIdx.setRequiredEnumId( keepObj.getRequiredEnumId() );
				Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj > mapEnumIdx = indexByEnumIdx.get( keyEnumIdx );
				if( mapEnumIdx != null ) {
					mapEnumIdx.remove( keepObj.getPKey() );
					if( mapEnumIdx.size() <= 0 ) {
						indexByEnumIdx.remove( keyEnumIdx );
					}
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamEnumTagByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.remove( keepObj.getPKey() );
					if( mapDefSchemaIdx.size() <= 0 ) {
						indexByDefSchemaIdx.remove( keyDefSchemaIdx );
					}
				}
			}

			if( indexByEnumNameIdx != null ) {
				YCFBamEnumTagByEnumNameIdxKey keyEnumNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newEnumNameIdxKey();
				keyEnumNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyEnumNameIdx.setRequiredEnumId( keepObj.getRequiredEnumId() );
				keyEnumNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByEnumNameIdx.remove( keyEnumNameIdx );
			}

			if( indexByPrevIdx != null ) {
				YCFBamEnumTagByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.remove( keepObj.getPKey() );
					if( mapPrevIdx.size() <= 0 ) {
						indexByPrevIdx.remove( keyPrevIdx );
					}
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamEnumTagByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.remove( keepObj.getPKey() );
					if( mapNextIdx.size() <= 0 ) {
						indexByNextIdx.remove( keyNextIdx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByEnumTagTenantIdx != null ) {
				YCFBamEnumTagByEnumTagTenantIdxKey keyEnumTagTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newEnumTagTenantIdxKey();
				keyEnumTagTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj > mapEnumTagTenantIdx = indexByEnumTagTenantIdx.get( keyEnumTagTenantIdx );
				if( mapEnumTagTenantIdx != null ) {
					mapEnumTagTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByEnumIdx != null ) {
				YCFBamEnumTagByEnumIdxKey keyEnumIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newEnumIdxKey();
				keyEnumIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyEnumIdx.setRequiredEnumId( keepObj.getRequiredEnumId() );
				Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj > mapEnumIdx = indexByEnumIdx.get( keyEnumIdx );
				if( mapEnumIdx != null ) {
					mapEnumIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamEnumTagByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByEnumNameIdx != null ) {
				YCFBamEnumTagByEnumNameIdxKey keyEnumNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newEnumNameIdxKey();
				keyEnumNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyEnumNameIdx.setRequiredEnumId( keepObj.getRequiredEnumId() );
				keyEnumNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByEnumNameIdx.put( keyEnumNameIdx, keepObj );
			}

			if( indexByPrevIdx != null ) {
				YCFBamEnumTagByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamEnumTagByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allEnumTag != null ) {
				allEnumTag.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allEnumTag != null ) {
				allEnumTag.put( keepObj.getPKey(), keepObj );
			}

			if( indexByEnumTagTenantIdx != null ) {
				YCFBamEnumTagByEnumTagTenantIdxKey keyEnumTagTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newEnumTagTenantIdxKey();
				keyEnumTagTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj > mapEnumTagTenantIdx = indexByEnumTagTenantIdx.get( keyEnumTagTenantIdx );
				if( mapEnumTagTenantIdx != null ) {
					mapEnumTagTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByEnumIdx != null ) {
				YCFBamEnumTagByEnumIdxKey keyEnumIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newEnumIdxKey();
				keyEnumIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyEnumIdx.setRequiredEnumId( keepObj.getRequiredEnumId() );
				Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj > mapEnumIdx = indexByEnumIdx.get( keyEnumIdx );
				if( mapEnumIdx != null ) {
					mapEnumIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamEnumTagByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByEnumNameIdx != null ) {
				YCFBamEnumTagByEnumNameIdxKey keyEnumNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newEnumNameIdxKey();
				keyEnumNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyEnumNameIdx.setRequiredEnumId( keepObj.getRequiredEnumId() );
				keyEnumNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByEnumNameIdx.put( keyEnumNameIdx, keepObj );
			}

			if( indexByPrevIdx != null ) {
				YCFBamEnumTagByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamEnumTagByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamEnumTagObj createEnumTag( IYCFBamEnumTagObj Obj ) {
		IYCFBamEnumTagObj obj = Obj;
		YCFBamEnumTagBuff buff = obj.getEnumTagBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().createEnumTag(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		IYCFBamEnumTagObj prev = obj.getOptionalLookupPrev();
		if( prev != null ) {
			prev.read( true );
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamEnumTagObj readEnumTag( YCFBamEnumTagPKey pkey ) {
		return( readEnumTag( pkey, false ) );
	}

	public IYCFBamEnumTagObj readEnumTag( YCFBamEnumTagPKey pkey, boolean forceRead ) {
		IYCFBamEnumTagObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamEnumTagBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getEnumTagTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamEnumTagObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamEnumTagObj readCachedEnumTag( YCFBamEnumTagPKey pkey ) {
		IYCFBamEnumTagObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeEnumTag( IYCFBamEnumTagObj obj )
	{
		final String S_ProcName = "YCFBamEnumTagTableObj.reallyDeepDisposeEnumTag() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamEnumTagPKey pkey = obj.getPKey();
		IYCFBamEnumTagObj existing = readCachedEnumTag( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamEnumTagByEnumTagTenantIdxKey keyEnumTagTenantIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newEnumTagTenantIdxKey();
		keyEnumTagTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamEnumTagByEnumIdxKey keyEnumIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newEnumIdxKey();
		keyEnumIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyEnumIdx.setRequiredEnumId( existing.getRequiredEnumId() );

		YCFBamEnumTagByDefSchemaIdxKey keyDefSchemaIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamEnumTagByEnumNameIdxKey keyEnumNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newEnumNameIdxKey();
		keyEnumNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyEnumNameIdx.setRequiredEnumId( existing.getRequiredEnumId() );
		keyEnumNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamEnumTagByPrevIdxKey keyPrevIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamEnumTagByNextIdxKey keyNextIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newNextIdxKey();
		keyNextIdx.setOptionalNextTenantId( existing.getOptionalNextTenantId() );
		keyNextIdx.setOptionalNextId( existing.getOptionalNextId() );



		if( indexByEnumTagTenantIdx != null ) {
			if( indexByEnumTagTenantIdx.containsKey( keyEnumTagTenantIdx ) ) {
				indexByEnumTagTenantIdx.get( keyEnumTagTenantIdx ).remove( pkey );
				if( indexByEnumTagTenantIdx.get( keyEnumTagTenantIdx ).size() <= 0 ) {
					indexByEnumTagTenantIdx.remove( keyEnumTagTenantIdx );
				}
			}
		}

		if( indexByEnumIdx != null ) {
			if( indexByEnumIdx.containsKey( keyEnumIdx ) ) {
				indexByEnumIdx.get( keyEnumIdx ).remove( pkey );
				if( indexByEnumIdx.get( keyEnumIdx ).size() <= 0 ) {
					indexByEnumIdx.remove( keyEnumIdx );
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

		if( indexByEnumNameIdx != null ) {
			indexByEnumNameIdx.remove( keyEnumNameIdx );
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


	}
	public void deepDisposeEnumTag( YCFBamEnumTagPKey pkey ) {
		IYCFBamEnumTagObj obj = readCachedEnumTag( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamEnumTagObj lockEnumTag( YCFBamEnumTagPKey pkey ) {
		IYCFBamEnumTagObj locked = null;
		YCFBamEnumTagBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getEnumTagTableObj().newInstance();
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamEnumTagObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockEnumTag", pkey );
		}
		return( locked );
	}

	public List<IYCFBamEnumTagObj> readAllEnumTag() {
		return( readAllEnumTag( false ) );
	}

	public List<IYCFBamEnumTagObj> readAllEnumTag( boolean forceRead ) {
		final String S_ProcName = "readAllEnumTag";
		if( ( allEnumTag == null ) || forceRead ) {
			Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj> map = new HashMap<YCFBamEnumTagPKey,IYCFBamEnumTagObj>();
			allEnumTag = map;
			YCFBamEnumTagBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().readAllDerived( schema.getAuthorization() );
			YCFBamEnumTagBuff buff;
			IYCFBamEnumTagObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newPKey() );
				obj.setBuff( buff );
				IYCFBamEnumTagObj realised = (IYCFBamEnumTagObj)obj.realise();
			}
		}
		int len = allEnumTag.size();
		IYCFBamEnumTagObj arr[] = new IYCFBamEnumTagObj[len];
		Iterator<IYCFBamEnumTagObj> valIter = allEnumTag.values().iterator();
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
		ArrayList<IYCFBamEnumTagObj> arrayList = new ArrayList<IYCFBamEnumTagObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamEnumTagObj> cmp = new Comparator<IYCFBamEnumTagObj>() {
			public int compare( IYCFBamEnumTagObj lhs, IYCFBamEnumTagObj rhs ) {
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
					YCFBamEnumTagPKey lhsPKey = lhs.getPKey();
					YCFBamEnumTagPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamEnumTagObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamEnumTagObj> readCachedAllEnumTag() {
		final String S_ProcName = "readCachedAllEnumTag";
		ArrayList<IYCFBamEnumTagObj> arrayList = new ArrayList<IYCFBamEnumTagObj>();
		if( allEnumTag != null ) {
			int len = allEnumTag.size();
			IYCFBamEnumTagObj arr[] = new IYCFBamEnumTagObj[len];
			Iterator<IYCFBamEnumTagObj> valIter = allEnumTag.values().iterator();
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
		Comparator<IYCFBamEnumTagObj> cmp = new Comparator<IYCFBamEnumTagObj>() {
			public int compare( IYCFBamEnumTagObj lhs, IYCFBamEnumTagObj rhs ) {
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
					YCFBamEnumTagPKey lhsPKey = lhs.getPKey();
					YCFBamEnumTagPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFBamEnumTagObj readEnumTagByIdIdx( long TenantId,
		long Id )
	{
		return( readEnumTagByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamEnumTagObj readEnumTagByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamEnumTagPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamEnumTagObj obj = readEnumTag( pkey, forceRead );
		return( obj );
	}

	public List<IYCFBamEnumTagObj> readEnumTagByEnumTagTenantIdx( long TenantId )
	{
		return( readEnumTagByEnumTagTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamEnumTagObj> readEnumTagByEnumTagTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readEnumTagByEnumTagTenantIdx";
		YCFBamEnumTagByEnumTagTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newEnumTagTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj> dict;
		if( indexByEnumTagTenantIdx == null ) {
			indexByEnumTagTenantIdx = new HashMap< YCFBamEnumTagByEnumTagTenantIdxKey,
				Map< YCFBamEnumTagPKey, IYCFBamEnumTagObj > >();
		}
		if( ( ! forceRead ) && indexByEnumTagTenantIdx.containsKey( key ) ) {
			dict = indexByEnumTagTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamEnumTagPKey, IYCFBamEnumTagObj>();
			IYCFBamEnumTagObj obj;
			YCFBamEnumTagBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().readDerivedByEnumTagTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamEnumTagBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getEnumTagTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newPKey() );
				obj.setBuff( buff );
				IYCFBamEnumTagObj realised = (IYCFBamEnumTagObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByEnumTagTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamEnumTagObj arr[] = new IYCFBamEnumTagObj[len];
		Iterator<IYCFBamEnumTagObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamEnumTagObj> arrayList = new ArrayList<IYCFBamEnumTagObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamEnumTagObj> cmp = new Comparator<IYCFBamEnumTagObj>() {
			public int compare( IYCFBamEnumTagObj lhs, IYCFBamEnumTagObj rhs ) {
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
					YCFBamEnumTagPKey lhsPKey = lhs.getPKey();
					YCFBamEnumTagPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamEnumTagObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamEnumTagObj> readEnumTagByEnumIdx( long TenantId,
		long EnumId )
	{
		return( readEnumTagByEnumIdx( TenantId,
			EnumId,
			false ) );
	}

	public List<IYCFBamEnumTagObj> readEnumTagByEnumIdx( long TenantId,
		long EnumId,
		boolean forceRead )
	{
		final String S_ProcName = "readEnumTagByEnumIdx";
		YCFBamEnumTagByEnumIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newEnumIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredEnumId( EnumId );
		Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj> dict;
		if( indexByEnumIdx == null ) {
			indexByEnumIdx = new HashMap< YCFBamEnumTagByEnumIdxKey,
				Map< YCFBamEnumTagPKey, IYCFBamEnumTagObj > >();
		}
		if( ( ! forceRead ) && indexByEnumIdx.containsKey( key ) ) {
			dict = indexByEnumIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamEnumTagPKey, IYCFBamEnumTagObj>();
			IYCFBamEnumTagObj obj;
			YCFBamEnumTagBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().readDerivedByEnumIdx( schema.getAuthorization(),
				TenantId,
				EnumId );
			YCFBamEnumTagBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getEnumTagTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newPKey() );
				obj.setBuff( buff );
				IYCFBamEnumTagObj realised = (IYCFBamEnumTagObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByEnumIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamEnumTagObj arr[] = new IYCFBamEnumTagObj[len];
		Iterator<IYCFBamEnumTagObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamEnumTagObj> arrayList = new ArrayList<IYCFBamEnumTagObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamEnumTagObj> cmp = new Comparator<IYCFBamEnumTagObj>() {
			public int compare( IYCFBamEnumTagObj lhs, IYCFBamEnumTagObj rhs ) {
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
					YCFBamEnumTagPKey lhsPKey = lhs.getPKey();
					YCFBamEnumTagPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamEnumTagObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamEnumTagObj> readEnumTagByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readEnumTagByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamEnumTagObj> readEnumTagByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readEnumTagByDefSchemaIdx";
		YCFBamEnumTagByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamEnumTagByDefSchemaIdxKey,
				Map< YCFBamEnumTagPKey, IYCFBamEnumTagObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamEnumTagPKey, IYCFBamEnumTagObj>();
			IYCFBamEnumTagObj obj;
			YCFBamEnumTagBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamEnumTagBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getEnumTagTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newPKey() );
				obj.setBuff( buff );
				IYCFBamEnumTagObj realised = (IYCFBamEnumTagObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamEnumTagObj arr[] = new IYCFBamEnumTagObj[len];
		Iterator<IYCFBamEnumTagObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamEnumTagObj> arrayList = new ArrayList<IYCFBamEnumTagObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamEnumTagObj> cmp = new Comparator<IYCFBamEnumTagObj>() {
			public int compare( IYCFBamEnumTagObj lhs, IYCFBamEnumTagObj rhs ) {
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
					YCFBamEnumTagPKey lhsPKey = lhs.getPKey();
					YCFBamEnumTagPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamEnumTagObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamEnumTagObj readEnumTagByEnumNameIdx( long TenantId,
		long EnumId,
		String Name )
	{
		return( readEnumTagByEnumNameIdx( TenantId,
			EnumId,
			Name,
			false ) );
	}

	public IYCFBamEnumTagObj readEnumTagByEnumNameIdx( long TenantId,
		long EnumId,
		String Name, boolean forceRead )
	{
		if( indexByEnumNameIdx == null ) {
			indexByEnumNameIdx = new HashMap< YCFBamEnumTagByEnumNameIdxKey,
				IYCFBamEnumTagObj >();
		}
		YCFBamEnumTagByEnumNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newEnumNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredEnumId( EnumId );
		key.setRequiredName( Name );
		IYCFBamEnumTagObj obj = null;
		if( ( ! forceRead ) && indexByEnumNameIdx.containsKey( key ) ) {
			obj = indexByEnumNameIdx.get( key );
		}
		else {
			YCFBamEnumTagBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().readDerivedByEnumNameIdx( schema.getAuthorization(),
				TenantId,
				EnumId,
				Name );
			if( buff != null ) {
				obj = schema.getEnumTagTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamEnumTagObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamEnumTagObj> readEnumTagByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		return( readEnumTagByPrevIdx( PrevTenantId,
			PrevId,
			false ) );
	}

	public List<IYCFBamEnumTagObj> readEnumTagByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead )
	{
		final String S_ProcName = "readEnumTagByPrevIdx";
		YCFBamEnumTagByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj> dict;
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< YCFBamEnumTagByPrevIdxKey,
				Map< YCFBamEnumTagPKey, IYCFBamEnumTagObj > >();
		}
		if( ( ! forceRead ) && indexByPrevIdx.containsKey( key ) ) {
			dict = indexByPrevIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamEnumTagPKey, IYCFBamEnumTagObj>();
			IYCFBamEnumTagObj obj;
			YCFBamEnumTagBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().readDerivedByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			YCFBamEnumTagBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getEnumTagTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newPKey() );
				obj.setBuff( buff );
				IYCFBamEnumTagObj realised = (IYCFBamEnumTagObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPrevIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamEnumTagObj arr[] = new IYCFBamEnumTagObj[len];
		Iterator<IYCFBamEnumTagObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamEnumTagObj> arrayList = new ArrayList<IYCFBamEnumTagObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamEnumTagObj> cmp = new Comparator<IYCFBamEnumTagObj>() {
			public int compare( IYCFBamEnumTagObj lhs, IYCFBamEnumTagObj rhs ) {
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
					YCFBamEnumTagPKey lhsPKey = lhs.getPKey();
					YCFBamEnumTagPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamEnumTagObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamEnumTagObj> readEnumTagByNextIdx( Long NextTenantId,
		Long NextId )
	{
		return( readEnumTagByNextIdx( NextTenantId,
			NextId,
			false ) );
	}

	public List<IYCFBamEnumTagObj> readEnumTagByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead )
	{
		final String S_ProcName = "readEnumTagByNextIdx";
		YCFBamEnumTagByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj> dict;
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< YCFBamEnumTagByNextIdxKey,
				Map< YCFBamEnumTagPKey, IYCFBamEnumTagObj > >();
		}
		if( ( ! forceRead ) && indexByNextIdx.containsKey( key ) ) {
			dict = indexByNextIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamEnumTagPKey, IYCFBamEnumTagObj>();
			IYCFBamEnumTagObj obj;
			YCFBamEnumTagBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().readDerivedByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			YCFBamEnumTagBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getEnumTagTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newPKey() );
				obj.setBuff( buff );
				IYCFBamEnumTagObj realised = (IYCFBamEnumTagObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByNextIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamEnumTagObj arr[] = new IYCFBamEnumTagObj[len];
		Iterator<IYCFBamEnumTagObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamEnumTagObj> arrayList = new ArrayList<IYCFBamEnumTagObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamEnumTagObj> cmp = new Comparator<IYCFBamEnumTagObj>() {
			public int compare( IYCFBamEnumTagObj lhs, IYCFBamEnumTagObj rhs ) {
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
					YCFBamEnumTagPKey lhsPKey = lhs.getPKey();
					YCFBamEnumTagPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamEnumTagObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamEnumTagObj readCachedEnumTagByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamEnumTagObj obj = null;
		YCFBamEnumTagPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedEnumTag( pkey );
		return( obj );
	}

	public List<IYCFBamEnumTagObj> readCachedEnumTagByEnumTagTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedEnumTagByEnumTagTenantIdx";
		YCFBamEnumTagByEnumTagTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newEnumTagTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamEnumTagObj> arrayList = new ArrayList<IYCFBamEnumTagObj>();
		if( indexByEnumTagTenantIdx != null ) {
			Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj> dict;
			if( indexByEnumTagTenantIdx.containsKey( key ) ) {
				dict = indexByEnumTagTenantIdx.get( key );
				int len = dict.size();
				IYCFBamEnumTagObj arr[] = new IYCFBamEnumTagObj[len];
				Iterator<IYCFBamEnumTagObj> valIter = dict.values().iterator();
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
			IYCFBamEnumTagObj obj;
			Iterator<IYCFBamEnumTagObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamEnumTagObj> cmp = new Comparator<IYCFBamEnumTagObj>() {
			public int compare( IYCFBamEnumTagObj lhs, IYCFBamEnumTagObj rhs ) {
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
					YCFBamEnumTagPKey lhsPKey = lhs.getPKey();
					YCFBamEnumTagPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamEnumTagObj> readCachedEnumTagByEnumIdx( long TenantId,
		long EnumId )
	{
		final String S_ProcName = "readCachedEnumTagByEnumIdx";
		YCFBamEnumTagByEnumIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newEnumIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredEnumId( EnumId );
		ArrayList<IYCFBamEnumTagObj> arrayList = new ArrayList<IYCFBamEnumTagObj>();
		if( indexByEnumIdx != null ) {
			Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj> dict;
			if( indexByEnumIdx.containsKey( key ) ) {
				dict = indexByEnumIdx.get( key );
				int len = dict.size();
				IYCFBamEnumTagObj arr[] = new IYCFBamEnumTagObj[len];
				Iterator<IYCFBamEnumTagObj> valIter = dict.values().iterator();
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
			IYCFBamEnumTagObj obj;
			Iterator<IYCFBamEnumTagObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamEnumTagObj> cmp = new Comparator<IYCFBamEnumTagObj>() {
			public int compare( IYCFBamEnumTagObj lhs, IYCFBamEnumTagObj rhs ) {
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
					YCFBamEnumTagPKey lhsPKey = lhs.getPKey();
					YCFBamEnumTagPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamEnumTagObj> readCachedEnumTagByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedEnumTagByDefSchemaIdx";
		YCFBamEnumTagByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamEnumTagObj> arrayList = new ArrayList<IYCFBamEnumTagObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamEnumTagObj arr[] = new IYCFBamEnumTagObj[len];
				Iterator<IYCFBamEnumTagObj> valIter = dict.values().iterator();
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
			IYCFBamEnumTagObj obj;
			Iterator<IYCFBamEnumTagObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamEnumTagObj> cmp = new Comparator<IYCFBamEnumTagObj>() {
			public int compare( IYCFBamEnumTagObj lhs, IYCFBamEnumTagObj rhs ) {
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
					YCFBamEnumTagPKey lhsPKey = lhs.getPKey();
					YCFBamEnumTagPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFBamEnumTagObj readCachedEnumTagByEnumNameIdx( long TenantId,
		long EnumId,
		String Name )
	{
		IYCFBamEnumTagObj obj = null;
		YCFBamEnumTagByEnumNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newEnumNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredEnumId( EnumId );
		key.setRequiredName( Name );
		if( indexByEnumNameIdx != null ) {
			if( indexByEnumNameIdx.containsKey( key ) ) {
				obj = indexByEnumNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamEnumTagObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamEnumTagObj> valIter = members.values().iterator();
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

	public List<IYCFBamEnumTagObj> readCachedEnumTagByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "readCachedEnumTagByPrevIdx";
		YCFBamEnumTagByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		ArrayList<IYCFBamEnumTagObj> arrayList = new ArrayList<IYCFBamEnumTagObj>();
		if( indexByPrevIdx != null ) {
			Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj> dict;
			if( indexByPrevIdx.containsKey( key ) ) {
				dict = indexByPrevIdx.get( key );
				int len = dict.size();
				IYCFBamEnumTagObj arr[] = new IYCFBamEnumTagObj[len];
				Iterator<IYCFBamEnumTagObj> valIter = dict.values().iterator();
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
			IYCFBamEnumTagObj obj;
			Iterator<IYCFBamEnumTagObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamEnumTagObj> cmp = new Comparator<IYCFBamEnumTagObj>() {
			public int compare( IYCFBamEnumTagObj lhs, IYCFBamEnumTagObj rhs ) {
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
					YCFBamEnumTagPKey lhsPKey = lhs.getPKey();
					YCFBamEnumTagPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamEnumTagObj> readCachedEnumTagByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "readCachedEnumTagByNextIdx";
		YCFBamEnumTagByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		ArrayList<IYCFBamEnumTagObj> arrayList = new ArrayList<IYCFBamEnumTagObj>();
		if( indexByNextIdx != null ) {
			Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj> dict;
			if( indexByNextIdx.containsKey( key ) ) {
				dict = indexByNextIdx.get( key );
				int len = dict.size();
				IYCFBamEnumTagObj arr[] = new IYCFBamEnumTagObj[len];
				Iterator<IYCFBamEnumTagObj> valIter = dict.values().iterator();
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
			IYCFBamEnumTagObj obj;
			Iterator<IYCFBamEnumTagObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamEnumTagObj> cmp = new Comparator<IYCFBamEnumTagObj>() {
			public int compare( IYCFBamEnumTagObj lhs, IYCFBamEnumTagObj rhs ) {
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
					YCFBamEnumTagPKey lhsPKey = lhs.getPKey();
					YCFBamEnumTagPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeEnumTagByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamEnumTagObj obj = readCachedEnumTagByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeEnumTagByEnumTagTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeEnumTagByEnumTagTenantIdx";
		IYCFBamEnumTagObj obj;
		List<IYCFBamEnumTagObj> arrayList = readCachedEnumTagByEnumTagTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamEnumTagObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeEnumTagByEnumIdx( long TenantId,
		long EnumId )
	{
		final String S_ProcName = "deepDisposeEnumTagByEnumIdx";
		IYCFBamEnumTagObj obj;
		List<IYCFBamEnumTagObj> arrayList = readCachedEnumTagByEnumIdx( TenantId,
				EnumId );
		if( arrayList != null )  {
			Iterator<IYCFBamEnumTagObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeEnumTagByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeEnumTagByDefSchemaIdx";
		IYCFBamEnumTagObj obj;
		List<IYCFBamEnumTagObj> arrayList = readCachedEnumTagByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamEnumTagObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeEnumTagByEnumNameIdx( long TenantId,
		long EnumId,
		String Name )
	{
		IYCFBamEnumTagObj obj = readCachedEnumTagByEnumNameIdx( TenantId,
				EnumId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeEnumTagByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "deepDisposeEnumTagByPrevIdx";
		IYCFBamEnumTagObj obj;
		List<IYCFBamEnumTagObj> arrayList = readCachedEnumTagByPrevIdx( PrevTenantId,
				PrevId );
		if( arrayList != null )  {
			Iterator<IYCFBamEnumTagObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeEnumTagByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "deepDisposeEnumTagByNextIdx";
		IYCFBamEnumTagObj obj;
		List<IYCFBamEnumTagObj> arrayList = readCachedEnumTagByNextIdx( NextTenantId,
				NextId );
		if( arrayList != null )  {
			Iterator<IYCFBamEnumTagObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamEnumTagObj updateEnumTag( IYCFBamEnumTagObj Obj ) {
		IYCFBamEnumTagObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().updateEnumTag( schema.getAuthorization(),
			Obj.getEnumTagBuff() );
		obj = (IYCFBamEnumTagObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteEnumTag( IYCFBamEnumTagObj Obj ) {
		IYCFBamEnumTagObj obj = Obj;
		IYCFBamEnumTagObj prev = obj.getOptionalLookupPrev();
		IYCFBamEnumTagObj next = obj.getOptionalLookupNext();
		((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().deleteEnumTag( schema.getAuthorization(),
			obj.getEnumTagBuff() );
		Obj.forget();
		if( prev != null ) {
			prev.read( true );
		}
		if( next != null ) {
			next.read( true );
		}
	}

	public void deleteEnumTagByIdIdx( long TenantId,
		long Id )
	{
		YCFBamEnumTagPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamEnumTagObj obj = readEnumTag( pkey );
		if( obj != null ) {
			IYCFBamEnumTagEditObj editObj = (IYCFBamEnumTagEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamEnumTagEditObj)obj.beginEdit();
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
		deepDisposeEnumTagByIdIdx( TenantId,
				Id );
	}

	public void deleteEnumTagByEnumTagTenantIdx( long TenantId )
	{
		YCFBamEnumTagByEnumTagTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newEnumTagTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByEnumTagTenantIdx == null ) {
			indexByEnumTagTenantIdx = new HashMap< YCFBamEnumTagByEnumTagTenantIdxKey,
				Map< YCFBamEnumTagPKey, IYCFBamEnumTagObj > >();
		}
		if( indexByEnumTagTenantIdx.containsKey( key ) ) {
			Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj> dict = indexByEnumTagTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().deleteEnumTagByEnumTagTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamEnumTagObj> iter = dict.values().iterator();
			IYCFBamEnumTagObj obj;
			List<IYCFBamEnumTagObj> toForget = new LinkedList<IYCFBamEnumTagObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByEnumTagTenantIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().deleteEnumTagByEnumTagTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeEnumTagByEnumTagTenantIdx( TenantId );
	}

	public void deleteEnumTagByEnumIdx( long TenantId,
		long EnumId )
	{
		YCFBamEnumTagByEnumIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newEnumIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredEnumId( EnumId );
		if( indexByEnumIdx == null ) {
			indexByEnumIdx = new HashMap< YCFBamEnumTagByEnumIdxKey,
				Map< YCFBamEnumTagPKey, IYCFBamEnumTagObj > >();
		}
		if( indexByEnumIdx.containsKey( key ) ) {
			Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj> dict = indexByEnumIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().deleteEnumTagByEnumIdx( schema.getAuthorization(),
				TenantId,
				EnumId );
			Iterator<IYCFBamEnumTagObj> iter = dict.values().iterator();
			IYCFBamEnumTagObj obj;
			List<IYCFBamEnumTagObj> toForget = new LinkedList<IYCFBamEnumTagObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByEnumIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().deleteEnumTagByEnumIdx( schema.getAuthorization(),
				TenantId,
				EnumId );
		}
		deepDisposeEnumTagByEnumIdx( TenantId,
				EnumId );
	}

	public void deleteEnumTagByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamEnumTagByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamEnumTagByDefSchemaIdxKey,
				Map< YCFBamEnumTagPKey, IYCFBamEnumTagObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().deleteEnumTagByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamEnumTagObj> iter = dict.values().iterator();
			IYCFBamEnumTagObj obj;
			List<IYCFBamEnumTagObj> toForget = new LinkedList<IYCFBamEnumTagObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().deleteEnumTagByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeEnumTagByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteEnumTagByEnumNameIdx( long TenantId,
		long EnumId,
		String Name )
	{
		if( indexByEnumNameIdx == null ) {
			indexByEnumNameIdx = new HashMap< YCFBamEnumTagByEnumNameIdxKey,
				IYCFBamEnumTagObj >();
		}
		YCFBamEnumTagByEnumNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newEnumNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredEnumId( EnumId );
		key.setRequiredName( Name );
		IYCFBamEnumTagObj obj = null;
		if( indexByEnumNameIdx.containsKey( key ) ) {
			obj = indexByEnumNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().deleteEnumTagByEnumNameIdx( schema.getAuthorization(),
				TenantId,
				EnumId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().deleteEnumTagByEnumNameIdx( schema.getAuthorization(),
				TenantId,
				EnumId,
				Name );
		}
		deepDisposeEnumTagByEnumNameIdx( TenantId,
				EnumId,
				Name );
	}

	public void deleteEnumTagByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		YCFBamEnumTagByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< YCFBamEnumTagByPrevIdxKey,
				Map< YCFBamEnumTagPKey, IYCFBamEnumTagObj > >();
		}
		if( indexByPrevIdx.containsKey( key ) ) {
			Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj> dict = indexByPrevIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().deleteEnumTagByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			Iterator<IYCFBamEnumTagObj> iter = dict.values().iterator();
			IYCFBamEnumTagObj obj;
			List<IYCFBamEnumTagObj> toForget = new LinkedList<IYCFBamEnumTagObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().deleteEnumTagByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
		}
		deepDisposeEnumTagByPrevIdx( PrevTenantId,
				PrevId );
	}

	public void deleteEnumTagByNextIdx( Long NextTenantId,
		Long NextId )
	{
		YCFBamEnumTagByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< YCFBamEnumTagByNextIdxKey,
				Map< YCFBamEnumTagPKey, IYCFBamEnumTagObj > >();
		}
		if( indexByNextIdx.containsKey( key ) ) {
			Map<YCFBamEnumTagPKey, IYCFBamEnumTagObj> dict = indexByNextIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().deleteEnumTagByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			Iterator<IYCFBamEnumTagObj> iter = dict.values().iterator();
			IYCFBamEnumTagObj obj;
			List<IYCFBamEnumTagObj> toForget = new LinkedList<IYCFBamEnumTagObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().deleteEnumTagByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
		}
		deepDisposeEnumTagByNextIdx( NextTenantId,
				NextId );
	}

	/**
	 *	Move the YCFBamEnumTagObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamEnumTagObj refreshed cache instance.
	 */
	public IYCFBamEnumTagObj moveUpEnumTag( IYCFBamEnumTagObj Obj ) {
		IYCFBamEnumTagObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new YCFLibUsageException( getClass(),
				"moveUpEnumTag",
				"You cannot move an object that is being edited" );
		}
		YCFBamEnumTagBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().moveBuffUp( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getEnumTagTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newPKey() );
			obj.setBuff( buff );
			obj = (IYCFBamEnumTagObj)obj.realise();
			IYCFBamEnumTagObj prev = obj.getOptionalLookupPrev( true );
			IYCFBamEnumTagObj next = obj.getOptionalLookupNext( true );
			if( next != null ) {
				IYCFBamEnumTagObj gnext = next.getOptionalLookupNext( true );
			}
		}
		return( obj );
	}

	/**
	 *	Move the YCFBamEnumTagObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamEnumTagObj refreshed cache instance.
	 */
	public IYCFBamEnumTagObj moveDownEnumTag( IYCFBamEnumTagObj Obj ) {
		IYCFBamEnumTagObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new YCFLibUsageException( getClass(),
				"moveDownEnumTag",
				"You cannot move an object that is being edited" );
		}
		YCFBamEnumTagBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().moveBuffDown( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getEnumTagTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newPKey() );
			obj.setBuff( buff );
			obj = (IYCFBamEnumTagObj)obj.realise();
			IYCFBamEnumTagObj prev = obj.getOptionalLookupPrev( true );
			if( prev != null ) {
				IYCFBamEnumTagObj gprev = prev.getOptionalLookupPrev( true );
			}
			IYCFBamEnumTagObj next = obj.getOptionalLookupNext( true );
		}
		return( obj );
	}
}
