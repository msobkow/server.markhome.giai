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

public class YCFBamSchemaDefTableObj
	implements IYCFBamSchemaDefTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamScopePKey, IYCFBamSchemaDefObj> members;
	private Map<YCFBamScopePKey, IYCFBamSchemaDefObj> allSchemaDef;
	private Map< YCFBamScopeByTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamSchemaDefObj > > indexByTenantIdx;
	private Map< YCFBamSchemaDefByCTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamSchemaDefObj > > indexByCTenantIdx;
	private Map< YCFBamSchemaDefByMinorVersionIdxKey,
		Map<YCFBamScopePKey, IYCFBamSchemaDefObj > > indexByMinorVersionIdx;
	private Map< YCFBamSchemaDefByUNameIdxKey,
		IYCFBamSchemaDefObj > indexByUNameIdx;
	private Map< YCFBamSchemaDefByAuthEMailIdxKey,
		Map<YCFBamScopePKey, IYCFBamSchemaDefObj > > indexByAuthEMailIdx;
	private Map< YCFBamSchemaDefByProjectURLIdxKey,
		Map<YCFBamScopePKey, IYCFBamSchemaDefObj > > indexByProjectURLIdx;
	private Map< YCFBamSchemaDefByPubURIIdxKey,
		IYCFBamSchemaDefObj > indexByPubURIIdx;
	public static String TABLE_NAME = "SchemaDef";
	public static String TABLE_DBNAME = "schemadef";

	public YCFBamSchemaDefTableObj() {
		schema = null;
		members = new HashMap<YCFBamScopePKey, IYCFBamSchemaDefObj>();
		allSchemaDef = null;
		indexByTenantIdx = null;
		indexByCTenantIdx = null;
		indexByMinorVersionIdx = null;
		indexByUNameIdx = null;
		indexByAuthEMailIdx = null;
		indexByProjectURLIdx = null;
		indexByPubURIIdx = null;
	}

	public YCFBamSchemaDefTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamScopePKey, IYCFBamSchemaDefObj>();
		allSchemaDef = null;
		indexByTenantIdx = null;
		indexByCTenantIdx = null;
		indexByMinorVersionIdx = null;
		indexByUNameIdx = null;
		indexByAuthEMailIdx = null;
		indexByProjectURLIdx = null;
		indexByPubURIIdx = null;
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
		return( IYCFBamSubProjectObj.class );
	}


	public void minimizeMemory() {
		allSchemaDef = null;
		indexByTenantIdx = null;
		indexByCTenantIdx = null;
		indexByMinorVersionIdx = null;
		indexByUNameIdx = null;
		indexByAuthEMailIdx = null;
		indexByProjectURLIdx = null;
		indexByPubURIIdx = null;
		List<IYCFBamSchemaDefObj> toForget = new LinkedList<IYCFBamSchemaDefObj>();
		IYCFBamSchemaDefObj cur = null;
		Iterator<IYCFBamSchemaDefObj> iter = members.values().iterator();
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
	 *	YCFBamSchemaDefObj.
	 */
	public IYCFBamSchemaDefObj newInstance() {
		IYCFBamSchemaDefObj inst = new YCFBamSchemaDefObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamSchemaDefObj.
	 */
	public IYCFBamSchemaDefEditObj newEditInstance( IYCFBamSchemaDefObj orig ) {
		IYCFBamSchemaDefEditObj edit = new YCFBamSchemaDefEditObj( orig );
		return( edit );
	}

	public IYCFBamSchemaDefObj realiseSchemaDef( IYCFBamSchemaDefObj Obj ) {
		IYCFBamSchemaDefObj obj = Obj;
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamSchemaDefObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamSchemaDefObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamSchemaDefObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByCTenantIdx != null ) {
				YCFBamSchemaDefByCTenantIdxKey keyCTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newCTenantIdxKey();
				keyCTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamSchemaDefObj > mapCTenantIdx = indexByCTenantIdx.get( keyCTenantIdx );
				if( mapCTenantIdx != null ) {
					mapCTenantIdx.remove( keepObj.getPKey() );
					if( mapCTenantIdx.size() <= 0 ) {
						indexByCTenantIdx.remove( keyCTenantIdx );
					}
				}
			}

			if( indexByMinorVersionIdx != null ) {
				YCFBamSchemaDefByMinorVersionIdxKey keyMinorVersionIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newMinorVersionIdxKey();
				keyMinorVersionIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMinorVersionIdx.setRequiredMinorVersionId( keepObj.getRequiredMinorVersionId() );
				Map<YCFBamScopePKey, IYCFBamSchemaDefObj > mapMinorVersionIdx = indexByMinorVersionIdx.get( keyMinorVersionIdx );
				if( mapMinorVersionIdx != null ) {
					mapMinorVersionIdx.remove( keepObj.getPKey() );
					if( mapMinorVersionIdx.size() <= 0 ) {
						indexByMinorVersionIdx.remove( keyMinorVersionIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamSchemaDefByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredMinorVersionId( keepObj.getRequiredMinorVersionId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByAuthEMailIdx != null ) {
				YCFBamSchemaDefByAuthEMailIdxKey keyAuthEMailIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newAuthEMailIdxKey();
				keyAuthEMailIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyAuthEMailIdx.setRequiredAuthorEMail( keepObj.getRequiredAuthorEMail() );
				Map<YCFBamScopePKey, IYCFBamSchemaDefObj > mapAuthEMailIdx = indexByAuthEMailIdx.get( keyAuthEMailIdx );
				if( mapAuthEMailIdx != null ) {
					mapAuthEMailIdx.remove( keepObj.getPKey() );
					if( mapAuthEMailIdx.size() <= 0 ) {
						indexByAuthEMailIdx.remove( keyAuthEMailIdx );
					}
				}
			}

			if( indexByProjectURLIdx != null ) {
				YCFBamSchemaDefByProjectURLIdxKey keyProjectURLIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newProjectURLIdxKey();
				keyProjectURLIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyProjectURLIdx.setRequiredProjectURL( keepObj.getRequiredProjectURL() );
				Map<YCFBamScopePKey, IYCFBamSchemaDefObj > mapProjectURLIdx = indexByProjectURLIdx.get( keyProjectURLIdx );
				if( mapProjectURLIdx != null ) {
					mapProjectURLIdx.remove( keepObj.getPKey() );
					if( mapProjectURLIdx.size() <= 0 ) {
						indexByProjectURLIdx.remove( keyProjectURLIdx );
					}
				}
			}

			if( indexByPubURIIdx != null ) {
				YCFBamSchemaDefByPubURIIdxKey keyPubURIIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newPubURIIdxKey();
				keyPubURIIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyPubURIIdx.setRequiredPublishURI( keepObj.getRequiredPublishURI() );
				indexByPubURIIdx.remove( keyPubURIIdx );
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFBamSchemaDefObj)schema.getScopeTableObj().realiseScope( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamSchemaDefObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCTenantIdx != null ) {
				YCFBamSchemaDefByCTenantIdxKey keyCTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newCTenantIdxKey();
				keyCTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamSchemaDefObj > mapCTenantIdx = indexByCTenantIdx.get( keyCTenantIdx );
				if( mapCTenantIdx != null ) {
					mapCTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMinorVersionIdx != null ) {
				YCFBamSchemaDefByMinorVersionIdxKey keyMinorVersionIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newMinorVersionIdxKey();
				keyMinorVersionIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMinorVersionIdx.setRequiredMinorVersionId( keepObj.getRequiredMinorVersionId() );
				Map<YCFBamScopePKey, IYCFBamSchemaDefObj > mapMinorVersionIdx = indexByMinorVersionIdx.get( keyMinorVersionIdx );
				if( mapMinorVersionIdx != null ) {
					mapMinorVersionIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamSchemaDefByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredMinorVersionId( keepObj.getRequiredMinorVersionId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByAuthEMailIdx != null ) {
				YCFBamSchemaDefByAuthEMailIdxKey keyAuthEMailIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newAuthEMailIdxKey();
				keyAuthEMailIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyAuthEMailIdx.setRequiredAuthorEMail( keepObj.getRequiredAuthorEMail() );
				Map<YCFBamScopePKey, IYCFBamSchemaDefObj > mapAuthEMailIdx = indexByAuthEMailIdx.get( keyAuthEMailIdx );
				if( mapAuthEMailIdx != null ) {
					mapAuthEMailIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByProjectURLIdx != null ) {
				YCFBamSchemaDefByProjectURLIdxKey keyProjectURLIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newProjectURLIdxKey();
				keyProjectURLIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyProjectURLIdx.setRequiredProjectURL( keepObj.getRequiredProjectURL() );
				Map<YCFBamScopePKey, IYCFBamSchemaDefObj > mapProjectURLIdx = indexByProjectURLIdx.get( keyProjectURLIdx );
				if( mapProjectURLIdx != null ) {
					mapProjectURLIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPubURIIdx != null ) {
				YCFBamSchemaDefByPubURIIdxKey keyPubURIIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newPubURIIdxKey();
				keyPubURIIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyPubURIIdx.setRequiredPublishURI( keepObj.getRequiredPublishURI() );
				indexByPubURIIdx.put( keyPubURIIdx, keepObj );
			}

			if( allSchemaDef != null ) {
				allSchemaDef.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamSchemaDefObj)schema.getScopeTableObj().realiseScope( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSchemaDef != null ) {
				allSchemaDef.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamSchemaDefObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCTenantIdx != null ) {
				YCFBamSchemaDefByCTenantIdxKey keyCTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newCTenantIdxKey();
				keyCTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamSchemaDefObj > mapCTenantIdx = indexByCTenantIdx.get( keyCTenantIdx );
				if( mapCTenantIdx != null ) {
					mapCTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMinorVersionIdx != null ) {
				YCFBamSchemaDefByMinorVersionIdxKey keyMinorVersionIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newMinorVersionIdxKey();
				keyMinorVersionIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMinorVersionIdx.setRequiredMinorVersionId( keepObj.getRequiredMinorVersionId() );
				Map<YCFBamScopePKey, IYCFBamSchemaDefObj > mapMinorVersionIdx = indexByMinorVersionIdx.get( keyMinorVersionIdx );
				if( mapMinorVersionIdx != null ) {
					mapMinorVersionIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamSchemaDefByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredMinorVersionId( keepObj.getRequiredMinorVersionId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByAuthEMailIdx != null ) {
				YCFBamSchemaDefByAuthEMailIdxKey keyAuthEMailIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newAuthEMailIdxKey();
				keyAuthEMailIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyAuthEMailIdx.setRequiredAuthorEMail( keepObj.getRequiredAuthorEMail() );
				Map<YCFBamScopePKey, IYCFBamSchemaDefObj > mapAuthEMailIdx = indexByAuthEMailIdx.get( keyAuthEMailIdx );
				if( mapAuthEMailIdx != null ) {
					mapAuthEMailIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByProjectURLIdx != null ) {
				YCFBamSchemaDefByProjectURLIdxKey keyProjectURLIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newProjectURLIdxKey();
				keyProjectURLIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyProjectURLIdx.setRequiredProjectURL( keepObj.getRequiredProjectURL() );
				Map<YCFBamScopePKey, IYCFBamSchemaDefObj > mapProjectURLIdx = indexByProjectURLIdx.get( keyProjectURLIdx );
				if( mapProjectURLIdx != null ) {
					mapProjectURLIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPubURIIdx != null ) {
				YCFBamSchemaDefByPubURIIdxKey keyPubURIIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newPubURIIdxKey();
				keyPubURIIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyPubURIIdx.setRequiredPublishURI( keepObj.getRequiredPublishURI() );
				indexByPubURIIdx.put( keyPubURIIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFBamSchemaDefObj createSchemaDef( IYCFBamSchemaDefObj Obj ) {
		IYCFBamSchemaDefObj obj = Obj;
		YCFBamSchemaDefBuff buff = obj.getSchemaDefBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().createSchemaDef(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a802" ) ) {
			obj = (IYCFBamSchemaDefObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamSchemaDefObj readSchemaDef( YCFBamScopePKey pkey ) {
		return( readSchemaDef( pkey, false ) );
	}

	public IYCFBamSchemaDefObj readSchemaDef( YCFBamScopePKey pkey, boolean forceRead ) {
		IYCFBamSchemaDefObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamSchemaDefBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamSchemaDefObj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamSchemaDefObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamSchemaDefObj readCachedSchemaDef( YCFBamScopePKey pkey ) {
		IYCFBamSchemaDefObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSchemaDef( IYCFBamSchemaDefObj obj )
	{
		final String S_ProcName = "YCFBamSchemaDefTableObj.reallyDeepDisposeSchemaDef() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamSchemaDefObj existing = readCachedSchemaDef( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamSchemaDefByCTenantIdxKey keyCTenantIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newCTenantIdxKey();
		keyCTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamSchemaDefByMinorVersionIdxKey keyMinorVersionIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newMinorVersionIdxKey();
		keyMinorVersionIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyMinorVersionIdx.setRequiredMinorVersionId( existing.getRequiredMinorVersionId() );

		YCFBamSchemaDefByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredMinorVersionId( existing.getRequiredMinorVersionId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamSchemaDefByAuthEMailIdxKey keyAuthEMailIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newAuthEMailIdxKey();
		keyAuthEMailIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyAuthEMailIdx.setRequiredAuthorEMail( existing.getRequiredAuthorEMail() );

		YCFBamSchemaDefByProjectURLIdxKey keyProjectURLIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newProjectURLIdxKey();
		keyProjectURLIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyProjectURLIdx.setRequiredProjectURL( existing.getRequiredProjectURL() );

		YCFBamSchemaDefByPubURIIdxKey keyPubURIIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newPubURIIdxKey();
		keyPubURIIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyPubURIIdx.setRequiredPublishURI( existing.getRequiredPublishURI() );


		IYCFBamTableObj objDelTableMethods;
		List<IYCFBamTableObj> arrDelTableMethods = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<IYCFBamTableObj> iterDelTableMethods = arrDelTableMethods.iterator();
		while( iterDelTableMethods.hasNext() ) {
			objDelTableMethods = iterDelTableMethods.next();
			if( objDelTableMethods != null ) {
						schema.getServerMethodTableObj().deepDisposeServerMethodByMethTableIdx( objDelTableMethods.getRequiredTenantId(),
							objDelTableMethods.getRequiredId() );
			}
		}
		IYCFBamTableObj objDelTableDelDep;
		List<IYCFBamTableObj> arrDelTableDelDep = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<IYCFBamTableObj> iterDelTableDelDep = arrDelTableDelDep.iterator();
		while( iterDelTableDelDep.hasNext() ) {
			objDelTableDelDep = iterDelTableDelDep.next();
			if( objDelTableDelDep != null ) {
						schema.getDelTopDepTableObj().deepDisposeDelTopDepByDelTopDepTblIdx( objDelTableDelDep.getRequiredTenantId(),
							objDelTableDelDep.getRequiredId() );
			}
		}
		IYCFBamTableObj objDelTableClearDep;
		List<IYCFBamTableObj> arrDelTableClearDep = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<IYCFBamTableObj> iterDelTableClearDep = arrDelTableClearDep.iterator();
		while( iterDelTableClearDep.hasNext() ) {
			objDelTableClearDep = iterDelTableClearDep.next();
			if( objDelTableClearDep != null ) {
						schema.getClearTopDepTableObj().deepDisposeClearTopDepByClrTopDepTblIdx( objDelTableClearDep.getRequiredTenantId(),
							objDelTableClearDep.getRequiredId() );
			}
		}
		IYCFBamTableObj objDelTableChain;
		List<IYCFBamTableObj> arrDelTableChain = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<IYCFBamTableObj> iterDelTableChain = arrDelTableChain.iterator();
		while( iterDelTableChain.hasNext() ) {
			objDelTableChain = iterDelTableChain.next();
			if( objDelTableChain != null ) {
						schema.getChainTableObj().deepDisposeChainByChainTableIdx( objDelTableChain.getRequiredTenantId(),
							objDelTableChain.getRequiredId() );
			}
		}
		IYCFBamTableObj objDelTableRelationPopDep;
		List<IYCFBamTableObj> arrDelTableRelationPopDep = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<IYCFBamTableObj> iterDelTableRelationPopDep = arrDelTableRelationPopDep.iterator();
		while( iterDelTableRelationPopDep.hasNext() ) {
			objDelTableRelationPopDep = iterDelTableRelationPopDep.next();
			if( objDelTableRelationPopDep != null ) {
			IYCFBamRelationObj objTableRelation;
			List<IYCFBamRelationObj> arrTableRelation = schema.getRelationTableObj().readCachedRelationByRelTableIdx( objDelTableRelationPopDep.getRequiredTenantId(),
							objDelTableRelationPopDep.getRequiredId() );
			Iterator<IYCFBamRelationObj> iterTableRelation = arrTableRelation.iterator();
			while( iterTableRelation.hasNext() ) {
				objTableRelation = iterTableRelation.next();
					schema.getPopTopDepTableObj().deepDisposePopTopDepByContRelIdx( objTableRelation.getRequiredTenantId(),
							objTableRelation.getRequiredId() );
			}
			}
		}
		IYCFBamTableObj objDelTableRelationCol;
		List<IYCFBamTableObj> arrDelTableRelationCol = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<IYCFBamTableObj> iterDelTableRelationCol = arrDelTableRelationCol.iterator();
		while( iterDelTableRelationCol.hasNext() ) {
			objDelTableRelationCol = iterDelTableRelationCol.next();
			if( objDelTableRelationCol != null ) {
			IYCFBamRelationObj objTableRelation;
			List<IYCFBamRelationObj> arrTableRelation = schema.getRelationTableObj().readCachedRelationByRelTableIdx( objDelTableRelationCol.getRequiredTenantId(),
							objDelTableRelationCol.getRequiredId() );
			Iterator<IYCFBamRelationObj> iterTableRelation = arrTableRelation.iterator();
			while( iterTableRelation.hasNext() ) {
				objTableRelation = iterTableRelation.next();
					schema.getRelationColTableObj().deepDisposeRelationColByRelationIdx( objTableRelation.getRequiredTenantId(),
							objTableRelation.getRequiredId() );
			}
			}
		}
		IYCFBamTableObj objDelTableRelation;
		List<IYCFBamTableObj> arrDelTableRelation = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<IYCFBamTableObj> iterDelTableRelation = arrDelTableRelation.iterator();
		while( iterDelTableRelation.hasNext() ) {
			objDelTableRelation = iterDelTableRelation.next();
			if( objDelTableRelation != null ) {
						schema.getRelationTableObj().deepDisposeRelationByRelTableIdx( objDelTableRelation.getRequiredTenantId(),
							objDelTableRelation.getRequiredId() );
			}
		}
		IYCFBamTableObj objDelTableIndexRefRelFmCol;
		List<IYCFBamTableObj> arrDelTableIndexRefRelFmCol = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<IYCFBamTableObj> iterDelTableIndexRefRelFmCol = arrDelTableIndexRefRelFmCol.iterator();
		while( iterDelTableIndexRefRelFmCol.hasNext() ) {
			objDelTableIndexRefRelFmCol = iterDelTableIndexRefRelFmCol.next();
			if( objDelTableIndexRefRelFmCol != null ) {
			IYCFBamIndexObj objTableIndex;
			List<IYCFBamIndexObj> arrTableIndex = schema.getIndexTableObj().readCachedIndexByIdxTableIdx( objDelTableIndexRefRelFmCol.getRequiredTenantId(),
							objDelTableIndexRefRelFmCol.getRequiredId() );
			Iterator<IYCFBamIndexObj> iterTableIndex = arrTableIndex.iterator();
			while( iterTableIndex.hasNext() ) {
				objTableIndex = iterTableIndex.next();
			IYCFBamIndexColObj objColumns;
			List<IYCFBamIndexColObj> arrColumns = schema.getIndexColTableObj().readCachedIndexColByIndexIdx( objTableIndex.getRequiredTenantId(),
							objTableIndex.getRequiredId() );
			Iterator<IYCFBamIndexColObj> iterColumns = arrColumns.iterator();
			while( iterColumns.hasNext() ) {
				objColumns = iterColumns.next();
					schema.getRelationColTableObj().deepDisposeRelationColByFromColIdx( objColumns.getRequiredTenantId(),
							objColumns.getRequiredId() );
			}
			}
			}
		}
		IYCFBamTableObj objDelTableIndexRefRelToCol;
		List<IYCFBamTableObj> arrDelTableIndexRefRelToCol = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<IYCFBamTableObj> iterDelTableIndexRefRelToCol = arrDelTableIndexRefRelToCol.iterator();
		while( iterDelTableIndexRefRelToCol.hasNext() ) {
			objDelTableIndexRefRelToCol = iterDelTableIndexRefRelToCol.next();
			if( objDelTableIndexRefRelToCol != null ) {
			IYCFBamIndexObj objTableIndex;
			List<IYCFBamIndexObj> arrTableIndex = schema.getIndexTableObj().readCachedIndexByIdxTableIdx( objDelTableIndexRefRelToCol.getRequiredTenantId(),
							objDelTableIndexRefRelToCol.getRequiredId() );
			Iterator<IYCFBamIndexObj> iterTableIndex = arrTableIndex.iterator();
			while( iterTableIndex.hasNext() ) {
				objTableIndex = iterTableIndex.next();
			IYCFBamIndexColObj objColumns;
			List<IYCFBamIndexColObj> arrColumns = schema.getIndexColTableObj().readCachedIndexColByIndexIdx( objTableIndex.getRequiredTenantId(),
							objTableIndex.getRequiredId() );
			Iterator<IYCFBamIndexColObj> iterColumns = arrColumns.iterator();
			while( iterColumns.hasNext() ) {
				objColumns = iterColumns.next();
					schema.getRelationColTableObj().deepDisposeRelationColByToColIdx( objColumns.getRequiredTenantId(),
							objColumns.getRequiredId() );
			}
			}
			}
		}
		IYCFBamTableObj objDelTableIndexCols;
		List<IYCFBamTableObj> arrDelTableIndexCols = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<IYCFBamTableObj> iterDelTableIndexCols = arrDelTableIndexCols.iterator();
		while( iterDelTableIndexCols.hasNext() ) {
			objDelTableIndexCols = iterDelTableIndexCols.next();
			if( objDelTableIndexCols != null ) {
			IYCFBamIndexObj objTableIndex;
			List<IYCFBamIndexObj> arrTableIndex = schema.getIndexTableObj().readCachedIndexByIdxTableIdx( objDelTableIndexCols.getRequiredTenantId(),
							objDelTableIndexCols.getRequiredId() );
			Iterator<IYCFBamIndexObj> iterTableIndex = arrTableIndex.iterator();
			while( iterTableIndex.hasNext() ) {
				objTableIndex = iterTableIndex.next();
					schema.getIndexColTableObj().deepDisposeIndexColByIndexIdx( objTableIndex.getRequiredTenantId(),
							objTableIndex.getRequiredId() );
			}
			}
		}
		IYCFBamTableObj objDelTableIndexes;
		List<IYCFBamTableObj> arrDelTableIndexes = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<IYCFBamTableObj> iterDelTableIndexes = arrDelTableIndexes.iterator();
		while( iterDelTableIndexes.hasNext() ) {
			objDelTableIndexes = iterDelTableIndexes.next();
			if( objDelTableIndexes != null ) {
						schema.getIndexTableObj().deepDisposeIndexByIdxTableIdx( objDelTableIndexes.getRequiredTenantId(),
							objDelTableIndexes.getRequiredId() );
			}
		}
		IYCFBamTableObj objDelTableRefIndexColumns;
		List<IYCFBamTableObj> arrDelTableRefIndexColumns = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<IYCFBamTableObj> iterDelTableRefIndexColumns = arrDelTableRefIndexColumns.iterator();
		while( iterDelTableRefIndexColumns.hasNext() ) {
			objDelTableRefIndexColumns = iterDelTableRefIndexColumns.next();
			if( objDelTableRefIndexColumns != null ) {
			IYCFBamValueObj objColumns;
			List<IYCFBamValueObj> arrColumns = schema.getValueTableObj().readCachedValueByScopeIdx( objDelTableRefIndexColumns.getRequiredTenantId(),
							objDelTableRefIndexColumns.getRequiredId() );
			Iterator<IYCFBamValueObj> iterColumns = arrColumns.iterator();
			while( iterColumns.hasNext() ) {
				objColumns = iterColumns.next();
					schema.getIndexColTableObj().deepDisposeIndexColByColIdx( objColumns.getRequiredTenantId(),
							objColumns.getRequiredId() );
			}
			}
		}
		IYCFBamTableObj objDelTableColumns;
		List<IYCFBamTableObj> arrDelTableColumns = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<IYCFBamTableObj> iterDelTableColumns = arrDelTableColumns.iterator();
		while( iterDelTableColumns.hasNext() ) {
			objDelTableColumns = iterDelTableColumns.next();
			if( objDelTableColumns != null ) {
						schema.getValueTableObj().deepDisposeValueByScopeIdx( objDelTableColumns.getRequiredTenantId(),
							objDelTableColumns.getRequiredId() );
			}
		}
		IYCFBamTableObj objDelTableDispensedId64Gen;
		List<IYCFBamTableObj> arrDelTableDispensedId64Gen = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<IYCFBamTableObj> iterDelTableDispensedId64Gen = arrDelTableDispensedId64Gen.iterator();
		while( iterDelTableDispensedId64Gen.hasNext() ) {
			objDelTableDispensedId64Gen = iterDelTableDispensedId64Gen.next();
			if( objDelTableDispensedId64Gen != null ) {
						schema.getId64GenTableObj().deepDisposeId64GenByDispIdx( objDelTableDispensedId64Gen.getRequiredTenantId(),
							objDelTableDispensedId64Gen.getRequiredId() );
			}
		}
		IYCFBamTableObj objDelTableDispensedId32Gen;
		List<IYCFBamTableObj> arrDelTableDispensedId32Gen = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<IYCFBamTableObj> iterDelTableDispensedId32Gen = arrDelTableDispensedId32Gen.iterator();
		while( iterDelTableDispensedId32Gen.hasNext() ) {
			objDelTableDispensedId32Gen = iterDelTableDispensedId32Gen.next();
			if( objDelTableDispensedId32Gen != null ) {
						schema.getId32GenTableObj().deepDisposeId32GenByDispIdx( objDelTableDispensedId32Gen.getRequiredTenantId(),
							objDelTableDispensedId32Gen.getRequiredId() );
			}
		}
		IYCFBamTableObj objDelTableDispensedId16Gen;
		List<IYCFBamTableObj> arrDelTableDispensedId16Gen = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<IYCFBamTableObj> iterDelTableDispensedId16Gen = arrDelTableDispensedId16Gen.iterator();
		while( iterDelTableDispensedId16Gen.hasNext() ) {
			objDelTableDispensedId16Gen = iterDelTableDispensedId16Gen.next();
			if( objDelTableDispensedId16Gen != null ) {
						schema.getId16GenTableObj().deepDisposeId16GenByDispIdx( objDelTableDispensedId16Gen.getRequiredTenantId(),
							objDelTableDispensedId16Gen.getRequiredId() );
			}
		}
					schema.getTableTableObj().deepDisposeTableBySchemaDefIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );
		IYCFBamValueObj objDelTypeRefs;
		List<IYCFBamValueObj> arrDelTypeRefs = schema.getValueTableObj().readCachedValueByScopeIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<IYCFBamValueObj> iterDelTypeRefs = arrDelTypeRefs.iterator();
		while( iterDelTypeRefs.hasNext() ) {
			objDelTypeRefs = iterDelTypeRefs.next();
			if( objDelTypeRefs != null ) {
						schema.getTableColTableObj().deepDisposeTableColByDataIdx( objDelTypeRefs.getRequiredTenantId(),
							objDelTypeRefs.getRequiredId() );
			}
		}
					schema.getValueTableObj().deepDisposeValueByScopeIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByCTenantIdx != null ) {
			if( indexByCTenantIdx.containsKey( keyCTenantIdx ) ) {
				indexByCTenantIdx.get( keyCTenantIdx ).remove( pkey );
				if( indexByCTenantIdx.get( keyCTenantIdx ).size() <= 0 ) {
					indexByCTenantIdx.remove( keyCTenantIdx );
				}
			}
		}

		if( indexByMinorVersionIdx != null ) {
			if( indexByMinorVersionIdx.containsKey( keyMinorVersionIdx ) ) {
				indexByMinorVersionIdx.get( keyMinorVersionIdx ).remove( pkey );
				if( indexByMinorVersionIdx.get( keyMinorVersionIdx ).size() <= 0 ) {
					indexByMinorVersionIdx.remove( keyMinorVersionIdx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}

		if( indexByAuthEMailIdx != null ) {
			if( indexByAuthEMailIdx.containsKey( keyAuthEMailIdx ) ) {
				indexByAuthEMailIdx.get( keyAuthEMailIdx ).remove( pkey );
				if( indexByAuthEMailIdx.get( keyAuthEMailIdx ).size() <= 0 ) {
					indexByAuthEMailIdx.remove( keyAuthEMailIdx );
				}
			}
		}

		if( indexByProjectURLIdx != null ) {
			if( indexByProjectURLIdx.containsKey( keyProjectURLIdx ) ) {
				indexByProjectURLIdx.get( keyProjectURLIdx ).remove( pkey );
				if( indexByProjectURLIdx.get( keyProjectURLIdx ).size() <= 0 ) {
					indexByProjectURLIdx.remove( keyProjectURLIdx );
				}
			}
		}

		if( indexByPubURIIdx != null ) {
			indexByPubURIIdx.remove( keyPubURIIdx );
		}


		schema.getScopeTableObj().reallyDeepDisposeScope( obj );
	}
	public void deepDisposeSchemaDef( YCFBamScopePKey pkey ) {
		IYCFBamSchemaDefObj obj = readCachedSchemaDef( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamSchemaDefObj lockSchemaDef( YCFBamScopePKey pkey ) {
		IYCFBamSchemaDefObj locked = null;
		YCFBamSchemaDefBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamSchemaDefObj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamSchemaDefObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockSchemaDef", pkey );
		}
		return( locked );
	}

	public List<IYCFBamSchemaDefObj> readAllSchemaDef() {
		return( readAllSchemaDef( false ) );
	}

	public List<IYCFBamSchemaDefObj> readAllSchemaDef( boolean forceRead ) {
		final String S_ProcName = "readAllSchemaDef";
		if( ( allSchemaDef == null ) || forceRead ) {
			Map<YCFBamScopePKey, IYCFBamSchemaDefObj> map = new HashMap<YCFBamScopePKey,IYCFBamSchemaDefObj>();
			allSchemaDef = map;
			YCFBamSchemaDefBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().readAllDerived( schema.getAuthorization() );
			YCFBamSchemaDefBuff buff;
			IYCFBamSchemaDefObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamSchemaDefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamSchemaDefObj realised = (IYCFBamSchemaDefObj)obj.realise();
			}
		}
		int len = allSchemaDef.size();
		IYCFBamSchemaDefObj arr[] = new IYCFBamSchemaDefObj[len];
		Iterator<IYCFBamSchemaDefObj> valIter = allSchemaDef.values().iterator();
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
		ArrayList<IYCFBamSchemaDefObj> arrayList = new ArrayList<IYCFBamSchemaDefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamSchemaDefObj> cmp = new Comparator<IYCFBamSchemaDefObj>() {
			public int compare( IYCFBamSchemaDefObj lhs, IYCFBamSchemaDefObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamSchemaDefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamSchemaDefObj> readCachedAllSchemaDef() {
		final String S_ProcName = "readCachedAllSchemaDef";
		ArrayList<IYCFBamSchemaDefObj> arrayList = new ArrayList<IYCFBamSchemaDefObj>();
		if( allSchemaDef != null ) {
			int len = allSchemaDef.size();
			IYCFBamSchemaDefObj arr[] = new IYCFBamSchemaDefObj[len];
			Iterator<IYCFBamSchemaDefObj> valIter = allSchemaDef.values().iterator();
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
		Comparator<IYCFBamSchemaDefObj> cmp = new Comparator<IYCFBamSchemaDefObj>() {
			public int compare( IYCFBamSchemaDefObj lhs, IYCFBamSchemaDefObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFBamSchemaDefObj readSchemaDefByIdIdx( long TenantId,
		long Id )
	{
		return( readSchemaDefByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamSchemaDefObj readSchemaDefByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamSchemaDefObj obj = readSchemaDef( pkey, forceRead );
		return( obj );
	}

	public List<IYCFBamSchemaDefObj> readSchemaDefByTenantIdx( long TenantId )
	{
		return( readSchemaDefByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamSchemaDefObj> readSchemaDefByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaDefByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamSchemaDefObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamSchemaDefObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamSchemaDefObj>();
			IYCFBamScopeObj obj;
			YCFBamScopeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamSchemaDefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamSchemaDefObj realised = (IYCFBamSchemaDefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamSchemaDefObj arr[] = new IYCFBamSchemaDefObj[len];
		Iterator<IYCFBamSchemaDefObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamSchemaDefObj> arrayList = new ArrayList<IYCFBamSchemaDefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamSchemaDefObj> cmp = new Comparator<IYCFBamSchemaDefObj>() {
			public int compare( IYCFBamSchemaDefObj lhs, IYCFBamSchemaDefObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamSchemaDefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamSchemaDefObj> readSchemaDefByCTenantIdx( long TenantId )
	{
		return( readSchemaDefByCTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamSchemaDefObj> readSchemaDefByCTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaDefByCTenantIdx";
		YCFBamSchemaDefByCTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newCTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamSchemaDefObj> dict;
		if( indexByCTenantIdx == null ) {
			indexByCTenantIdx = new HashMap< YCFBamSchemaDefByCTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamSchemaDefObj > >();
		}
		if( ( ! forceRead ) && indexByCTenantIdx.containsKey( key ) ) {
			dict = indexByCTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamSchemaDefObj>();
			IYCFBamSchemaDefObj obj;
			YCFBamSchemaDefBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().readDerivedByCTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamSchemaDefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamSchemaDefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamSchemaDefObj realised = (IYCFBamSchemaDefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByCTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamSchemaDefObj arr[] = new IYCFBamSchemaDefObj[len];
		Iterator<IYCFBamSchemaDefObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamSchemaDefObj> arrayList = new ArrayList<IYCFBamSchemaDefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamSchemaDefObj> cmp = new Comparator<IYCFBamSchemaDefObj>() {
			public int compare( IYCFBamSchemaDefObj lhs, IYCFBamSchemaDefObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamSchemaDefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamSchemaDefObj> readSchemaDefByMinorVersionIdx( long TenantId,
		long MinorVersionId )
	{
		return( readSchemaDefByMinorVersionIdx( TenantId,
			MinorVersionId,
			false ) );
	}

	public List<IYCFBamSchemaDefObj> readSchemaDefByMinorVersionIdx( long TenantId,
		long MinorVersionId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaDefByMinorVersionIdx";
		YCFBamSchemaDefByMinorVersionIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newMinorVersionIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMinorVersionId( MinorVersionId );
		Map<YCFBamScopePKey, IYCFBamSchemaDefObj> dict;
		if( indexByMinorVersionIdx == null ) {
			indexByMinorVersionIdx = new HashMap< YCFBamSchemaDefByMinorVersionIdxKey,
				Map< YCFBamScopePKey, IYCFBamSchemaDefObj > >();
		}
		if( ( ! forceRead ) && indexByMinorVersionIdx.containsKey( key ) ) {
			dict = indexByMinorVersionIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamSchemaDefObj>();
			IYCFBamSchemaDefObj obj;
			YCFBamSchemaDefBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().readDerivedByMinorVersionIdx( schema.getAuthorization(),
				TenantId,
				MinorVersionId );
			YCFBamSchemaDefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamSchemaDefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamSchemaDefObj realised = (IYCFBamSchemaDefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByMinorVersionIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamSchemaDefObj arr[] = new IYCFBamSchemaDefObj[len];
		Iterator<IYCFBamSchemaDefObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamSchemaDefObj> arrayList = new ArrayList<IYCFBamSchemaDefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamSchemaDefObj> cmp = new Comparator<IYCFBamSchemaDefObj>() {
			public int compare( IYCFBamSchemaDefObj lhs, IYCFBamSchemaDefObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamSchemaDefObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamSchemaDefObj readSchemaDefByUNameIdx( long TenantId,
		long MinorVersionId,
		String Name )
	{
		return( readSchemaDefByUNameIdx( TenantId,
			MinorVersionId,
			Name,
			false ) );
	}

	public IYCFBamSchemaDefObj readSchemaDefByUNameIdx( long TenantId,
		long MinorVersionId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamSchemaDefByUNameIdxKey,
				IYCFBamSchemaDefObj >();
		}
		YCFBamSchemaDefByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMinorVersionId( MinorVersionId );
		key.setRequiredName( Name );
		IYCFBamSchemaDefObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamSchemaDefBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				MinorVersionId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamSchemaDefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamSchemaDefObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamSchemaDefObj> readSchemaDefByAuthEMailIdx( long TenantId,
		String AuthorEMail )
	{
		return( readSchemaDefByAuthEMailIdx( TenantId,
			AuthorEMail,
			false ) );
	}

	public List<IYCFBamSchemaDefObj> readSchemaDefByAuthEMailIdx( long TenantId,
		String AuthorEMail,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaDefByAuthEMailIdx";
		YCFBamSchemaDefByAuthEMailIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newAuthEMailIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredAuthorEMail( AuthorEMail );
		Map<YCFBamScopePKey, IYCFBamSchemaDefObj> dict;
		if( indexByAuthEMailIdx == null ) {
			indexByAuthEMailIdx = new HashMap< YCFBamSchemaDefByAuthEMailIdxKey,
				Map< YCFBamScopePKey, IYCFBamSchemaDefObj > >();
		}
		if( ( ! forceRead ) && indexByAuthEMailIdx.containsKey( key ) ) {
			dict = indexByAuthEMailIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamSchemaDefObj>();
			IYCFBamSchemaDefObj obj;
			YCFBamSchemaDefBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().readDerivedByAuthEMailIdx( schema.getAuthorization(),
				TenantId,
				AuthorEMail );
			YCFBamSchemaDefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamSchemaDefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamSchemaDefObj realised = (IYCFBamSchemaDefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByAuthEMailIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamSchemaDefObj arr[] = new IYCFBamSchemaDefObj[len];
		Iterator<IYCFBamSchemaDefObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamSchemaDefObj> arrayList = new ArrayList<IYCFBamSchemaDefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamSchemaDefObj> cmp = new Comparator<IYCFBamSchemaDefObj>() {
			public int compare( IYCFBamSchemaDefObj lhs, IYCFBamSchemaDefObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamSchemaDefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamSchemaDefObj> readSchemaDefByProjectURLIdx( long TenantId,
		String ProjectURL )
	{
		return( readSchemaDefByProjectURLIdx( TenantId,
			ProjectURL,
			false ) );
	}

	public List<IYCFBamSchemaDefObj> readSchemaDefByProjectURLIdx( long TenantId,
		String ProjectURL,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaDefByProjectURLIdx";
		YCFBamSchemaDefByProjectURLIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newProjectURLIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredProjectURL( ProjectURL );
		Map<YCFBamScopePKey, IYCFBamSchemaDefObj> dict;
		if( indexByProjectURLIdx == null ) {
			indexByProjectURLIdx = new HashMap< YCFBamSchemaDefByProjectURLIdxKey,
				Map< YCFBamScopePKey, IYCFBamSchemaDefObj > >();
		}
		if( ( ! forceRead ) && indexByProjectURLIdx.containsKey( key ) ) {
			dict = indexByProjectURLIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamSchemaDefObj>();
			IYCFBamSchemaDefObj obj;
			YCFBamSchemaDefBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().readDerivedByProjectURLIdx( schema.getAuthorization(),
				TenantId,
				ProjectURL );
			YCFBamSchemaDefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamSchemaDefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamSchemaDefObj realised = (IYCFBamSchemaDefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByProjectURLIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamSchemaDefObj arr[] = new IYCFBamSchemaDefObj[len];
		Iterator<IYCFBamSchemaDefObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamSchemaDefObj> arrayList = new ArrayList<IYCFBamSchemaDefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamSchemaDefObj> cmp = new Comparator<IYCFBamSchemaDefObj>() {
			public int compare( IYCFBamSchemaDefObj lhs, IYCFBamSchemaDefObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamSchemaDefObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamSchemaDefObj readSchemaDefByPubURIIdx( long TenantId,
		String PublishURI )
	{
		return( readSchemaDefByPubURIIdx( TenantId,
			PublishURI,
			false ) );
	}

	public IYCFBamSchemaDefObj readSchemaDefByPubURIIdx( long TenantId,
		String PublishURI, boolean forceRead )
	{
		if( indexByPubURIIdx == null ) {
			indexByPubURIIdx = new HashMap< YCFBamSchemaDefByPubURIIdxKey,
				IYCFBamSchemaDefObj >();
		}
		YCFBamSchemaDefByPubURIIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newPubURIIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredPublishURI( PublishURI );
		IYCFBamSchemaDefObj obj = null;
		if( ( ! forceRead ) && indexByPubURIIdx.containsKey( key ) ) {
			obj = indexByPubURIIdx.get( key );
		}
		else {
			YCFBamSchemaDefBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().readDerivedByPubURIIdx( schema.getAuthorization(),
				TenantId,
				PublishURI );
			if( buff != null ) {
				obj = (IYCFBamSchemaDefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamSchemaDefObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamSchemaDefObj readCachedSchemaDefByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamSchemaDefObj obj = null;
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedSchemaDef( pkey );
		return( obj );
	}

	public List<IYCFBamSchemaDefObj> readCachedSchemaDefByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedSchemaDefByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamSchemaDefObj> arrayList = new ArrayList<IYCFBamSchemaDefObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamSchemaDefObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFBamSchemaDefObj arr[] = new IYCFBamSchemaDefObj[len];
				Iterator<IYCFBamSchemaDefObj> valIter = dict.values().iterator();
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
			IYCFBamSchemaDefObj obj;
			Iterator<IYCFBamSchemaDefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamSchemaDefObj> cmp = new Comparator<IYCFBamSchemaDefObj>() {
			public int compare( IYCFBamSchemaDefObj lhs, IYCFBamSchemaDefObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamSchemaDefObj> readCachedSchemaDefByCTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedSchemaDefByCTenantIdx";
		YCFBamSchemaDefByCTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newCTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamSchemaDefObj> arrayList = new ArrayList<IYCFBamSchemaDefObj>();
		if( indexByCTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamSchemaDefObj> dict;
			if( indexByCTenantIdx.containsKey( key ) ) {
				dict = indexByCTenantIdx.get( key );
				int len = dict.size();
				IYCFBamSchemaDefObj arr[] = new IYCFBamSchemaDefObj[len];
				Iterator<IYCFBamSchemaDefObj> valIter = dict.values().iterator();
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
			IYCFBamSchemaDefObj obj;
			Iterator<IYCFBamSchemaDefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamSchemaDefObj> cmp = new Comparator<IYCFBamSchemaDefObj>() {
			public int compare( IYCFBamSchemaDefObj lhs, IYCFBamSchemaDefObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamSchemaDefObj> readCachedSchemaDefByMinorVersionIdx( long TenantId,
		long MinorVersionId )
	{
		final String S_ProcName = "readCachedSchemaDefByMinorVersionIdx";
		YCFBamSchemaDefByMinorVersionIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newMinorVersionIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMinorVersionId( MinorVersionId );
		ArrayList<IYCFBamSchemaDefObj> arrayList = new ArrayList<IYCFBamSchemaDefObj>();
		if( indexByMinorVersionIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamSchemaDefObj> dict;
			if( indexByMinorVersionIdx.containsKey( key ) ) {
				dict = indexByMinorVersionIdx.get( key );
				int len = dict.size();
				IYCFBamSchemaDefObj arr[] = new IYCFBamSchemaDefObj[len];
				Iterator<IYCFBamSchemaDefObj> valIter = dict.values().iterator();
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
			IYCFBamSchemaDefObj obj;
			Iterator<IYCFBamSchemaDefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamSchemaDefObj> cmp = new Comparator<IYCFBamSchemaDefObj>() {
			public int compare( IYCFBamSchemaDefObj lhs, IYCFBamSchemaDefObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFBamSchemaDefObj readCachedSchemaDefByUNameIdx( long TenantId,
		long MinorVersionId,
		String Name )
	{
		IYCFBamSchemaDefObj obj = null;
		YCFBamSchemaDefByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMinorVersionId( MinorVersionId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamSchemaDefObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamSchemaDefObj> valIter = members.values().iterator();
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

	public List<IYCFBamSchemaDefObj> readCachedSchemaDefByAuthEMailIdx( long TenantId,
		String AuthorEMail )
	{
		final String S_ProcName = "readCachedSchemaDefByAuthEMailIdx";
		YCFBamSchemaDefByAuthEMailIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newAuthEMailIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredAuthorEMail( AuthorEMail );
		ArrayList<IYCFBamSchemaDefObj> arrayList = new ArrayList<IYCFBamSchemaDefObj>();
		if( indexByAuthEMailIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamSchemaDefObj> dict;
			if( indexByAuthEMailIdx.containsKey( key ) ) {
				dict = indexByAuthEMailIdx.get( key );
				int len = dict.size();
				IYCFBamSchemaDefObj arr[] = new IYCFBamSchemaDefObj[len];
				Iterator<IYCFBamSchemaDefObj> valIter = dict.values().iterator();
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
			IYCFBamSchemaDefObj obj;
			Iterator<IYCFBamSchemaDefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamSchemaDefObj> cmp = new Comparator<IYCFBamSchemaDefObj>() {
			public int compare( IYCFBamSchemaDefObj lhs, IYCFBamSchemaDefObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamSchemaDefObj> readCachedSchemaDefByProjectURLIdx( long TenantId,
		String ProjectURL )
	{
		final String S_ProcName = "readCachedSchemaDefByProjectURLIdx";
		YCFBamSchemaDefByProjectURLIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newProjectURLIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredProjectURL( ProjectURL );
		ArrayList<IYCFBamSchemaDefObj> arrayList = new ArrayList<IYCFBamSchemaDefObj>();
		if( indexByProjectURLIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamSchemaDefObj> dict;
			if( indexByProjectURLIdx.containsKey( key ) ) {
				dict = indexByProjectURLIdx.get( key );
				int len = dict.size();
				IYCFBamSchemaDefObj arr[] = new IYCFBamSchemaDefObj[len];
				Iterator<IYCFBamSchemaDefObj> valIter = dict.values().iterator();
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
			IYCFBamSchemaDefObj obj;
			Iterator<IYCFBamSchemaDefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamSchemaDefObj> cmp = new Comparator<IYCFBamSchemaDefObj>() {
			public int compare( IYCFBamSchemaDefObj lhs, IYCFBamSchemaDefObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFBamSchemaDefObj readCachedSchemaDefByPubURIIdx( long TenantId,
		String PublishURI )
	{
		IYCFBamSchemaDefObj obj = null;
		YCFBamSchemaDefByPubURIIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newPubURIIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredPublishURI( PublishURI );
		if( indexByPubURIIdx != null ) {
			if( indexByPubURIIdx.containsKey( key ) ) {
				obj = indexByPubURIIdx.get( key );
			}
			else {
				Iterator<IYCFBamSchemaDefObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamSchemaDefObj> valIter = members.values().iterator();
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

	public void deepDisposeSchemaDefByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamSchemaDefObj obj = readCachedSchemaDefByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSchemaDefByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeSchemaDefByTenantIdx";
		IYCFBamSchemaDefObj obj;
		List<IYCFBamSchemaDefObj> arrayList = readCachedSchemaDefByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamSchemaDefObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSchemaDefByCTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeSchemaDefByCTenantIdx";
		IYCFBamSchemaDefObj obj;
		List<IYCFBamSchemaDefObj> arrayList = readCachedSchemaDefByCTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamSchemaDefObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSchemaDefByMinorVersionIdx( long TenantId,
		long MinorVersionId )
	{
		final String S_ProcName = "deepDisposeSchemaDefByMinorVersionIdx";
		IYCFBamSchemaDefObj obj;
		List<IYCFBamSchemaDefObj> arrayList = readCachedSchemaDefByMinorVersionIdx( TenantId,
				MinorVersionId );
		if( arrayList != null )  {
			Iterator<IYCFBamSchemaDefObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSchemaDefByUNameIdx( long TenantId,
		long MinorVersionId,
		String Name )
	{
		IYCFBamSchemaDefObj obj = readCachedSchemaDefByUNameIdx( TenantId,
				MinorVersionId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSchemaDefByAuthEMailIdx( long TenantId,
		String AuthorEMail )
	{
		final String S_ProcName = "deepDisposeSchemaDefByAuthEMailIdx";
		IYCFBamSchemaDefObj obj;
		List<IYCFBamSchemaDefObj> arrayList = readCachedSchemaDefByAuthEMailIdx( TenantId,
				AuthorEMail );
		if( arrayList != null )  {
			Iterator<IYCFBamSchemaDefObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSchemaDefByProjectURLIdx( long TenantId,
		String ProjectURL )
	{
		final String S_ProcName = "deepDisposeSchemaDefByProjectURLIdx";
		IYCFBamSchemaDefObj obj;
		List<IYCFBamSchemaDefObj> arrayList = readCachedSchemaDefByProjectURLIdx( TenantId,
				ProjectURL );
		if( arrayList != null )  {
			Iterator<IYCFBamSchemaDefObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSchemaDefByPubURIIdx( long TenantId,
		String PublishURI )
	{
		IYCFBamSchemaDefObj obj = readCachedSchemaDefByPubURIIdx( TenantId,
				PublishURI );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamSchemaDefObj updateSchemaDef( IYCFBamSchemaDefObj Obj ) {
		IYCFBamSchemaDefObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().updateSchemaDef( schema.getAuthorization(),
			Obj.getSchemaDefBuff() );
		if( Obj.getClassCode().equals( "a802" ) ) {
			obj = (IYCFBamSchemaDefObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteSchemaDef( IYCFBamSchemaDefObj Obj ) {
		IYCFBamSchemaDefObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDef( schema.getAuthorization(),
			obj.getSchemaDefBuff() );
		Obj.forget();
	}

	public void deleteSchemaDefByIdIdx( long TenantId,
		long Id )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamSchemaDefObj obj = readSchemaDef( pkey );
		if( obj != null ) {
			IYCFBamSchemaDefEditObj editObj = (IYCFBamSchemaDefEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamSchemaDefEditObj)obj.beginEdit();
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
		deepDisposeSchemaDefByIdIdx( TenantId,
				Id );
	}

	public void deleteSchemaDefByTenantIdx( long TenantId )
	{
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamSchemaDefObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamSchemaDefObj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamSchemaDefObj> iter = dict.values().iterator();
			IYCFBamSchemaDefObj obj;
			List<IYCFBamSchemaDefObj> toForget = new LinkedList<IYCFBamSchemaDefObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeSchemaDefByTenantIdx( TenantId );
	}

	public void deleteSchemaDefByCTenantIdx( long TenantId )
	{
		YCFBamSchemaDefByCTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newCTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByCTenantIdx == null ) {
			indexByCTenantIdx = new HashMap< YCFBamSchemaDefByCTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamSchemaDefObj > >();
		}
		if( indexByCTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamSchemaDefObj> dict = indexByCTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByCTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamSchemaDefObj> iter = dict.values().iterator();
			IYCFBamSchemaDefObj obj;
			List<IYCFBamSchemaDefObj> toForget = new LinkedList<IYCFBamSchemaDefObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByCTenantIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByCTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeSchemaDefByCTenantIdx( TenantId );
	}

	public void deleteSchemaDefByMinorVersionIdx( long TenantId,
		long MinorVersionId )
	{
		YCFBamSchemaDefByMinorVersionIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newMinorVersionIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMinorVersionId( MinorVersionId );
		if( indexByMinorVersionIdx == null ) {
			indexByMinorVersionIdx = new HashMap< YCFBamSchemaDefByMinorVersionIdxKey,
				Map< YCFBamScopePKey, IYCFBamSchemaDefObj > >();
		}
		if( indexByMinorVersionIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamSchemaDefObj> dict = indexByMinorVersionIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByMinorVersionIdx( schema.getAuthorization(),
				TenantId,
				MinorVersionId );
			Iterator<IYCFBamSchemaDefObj> iter = dict.values().iterator();
			IYCFBamSchemaDefObj obj;
			List<IYCFBamSchemaDefObj> toForget = new LinkedList<IYCFBamSchemaDefObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByMinorVersionIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByMinorVersionIdx( schema.getAuthorization(),
				TenantId,
				MinorVersionId );
		}
		deepDisposeSchemaDefByMinorVersionIdx( TenantId,
				MinorVersionId );
	}

	public void deleteSchemaDefByUNameIdx( long TenantId,
		long MinorVersionId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamSchemaDefByUNameIdxKey,
				IYCFBamSchemaDefObj >();
		}
		YCFBamSchemaDefByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMinorVersionId( MinorVersionId );
		key.setRequiredName( Name );
		IYCFBamSchemaDefObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByUNameIdx( schema.getAuthorization(),
				TenantId,
				MinorVersionId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByUNameIdx( schema.getAuthorization(),
				TenantId,
				MinorVersionId,
				Name );
		}
		deepDisposeSchemaDefByUNameIdx( TenantId,
				MinorVersionId,
				Name );
	}

	public void deleteSchemaDefByAuthEMailIdx( long TenantId,
		String AuthorEMail )
	{
		YCFBamSchemaDefByAuthEMailIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newAuthEMailIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredAuthorEMail( AuthorEMail );
		if( indexByAuthEMailIdx == null ) {
			indexByAuthEMailIdx = new HashMap< YCFBamSchemaDefByAuthEMailIdxKey,
				Map< YCFBamScopePKey, IYCFBamSchemaDefObj > >();
		}
		if( indexByAuthEMailIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamSchemaDefObj> dict = indexByAuthEMailIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByAuthEMailIdx( schema.getAuthorization(),
				TenantId,
				AuthorEMail );
			Iterator<IYCFBamSchemaDefObj> iter = dict.values().iterator();
			IYCFBamSchemaDefObj obj;
			List<IYCFBamSchemaDefObj> toForget = new LinkedList<IYCFBamSchemaDefObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByAuthEMailIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByAuthEMailIdx( schema.getAuthorization(),
				TenantId,
				AuthorEMail );
		}
		deepDisposeSchemaDefByAuthEMailIdx( TenantId,
				AuthorEMail );
	}

	public void deleteSchemaDefByProjectURLIdx( long TenantId,
		String ProjectURL )
	{
		YCFBamSchemaDefByProjectURLIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newProjectURLIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredProjectURL( ProjectURL );
		if( indexByProjectURLIdx == null ) {
			indexByProjectURLIdx = new HashMap< YCFBamSchemaDefByProjectURLIdxKey,
				Map< YCFBamScopePKey, IYCFBamSchemaDefObj > >();
		}
		if( indexByProjectURLIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamSchemaDefObj> dict = indexByProjectURLIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByProjectURLIdx( schema.getAuthorization(),
				TenantId,
				ProjectURL );
			Iterator<IYCFBamSchemaDefObj> iter = dict.values().iterator();
			IYCFBamSchemaDefObj obj;
			List<IYCFBamSchemaDefObj> toForget = new LinkedList<IYCFBamSchemaDefObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByProjectURLIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByProjectURLIdx( schema.getAuthorization(),
				TenantId,
				ProjectURL );
		}
		deepDisposeSchemaDefByProjectURLIdx( TenantId,
				ProjectURL );
	}

	public void deleteSchemaDefByPubURIIdx( long TenantId,
		String PublishURI )
	{
		if( indexByPubURIIdx == null ) {
			indexByPubURIIdx = new HashMap< YCFBamSchemaDefByPubURIIdxKey,
				IYCFBamSchemaDefObj >();
		}
		YCFBamSchemaDefByPubURIIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newPubURIIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredPublishURI( PublishURI );
		IYCFBamSchemaDefObj obj = null;
		if( indexByPubURIIdx.containsKey( key ) ) {
			obj = indexByPubURIIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByPubURIIdx( schema.getAuthorization(),
				TenantId,
				PublishURI );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByPubURIIdx( schema.getAuthorization(),
				TenantId,
				PublishURI );
		}
		deepDisposeSchemaDefByPubURIIdx( TenantId,
				PublishURI );
	}
}
