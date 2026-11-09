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

public class CFBamSchemaDefTableObj
	implements ICFBamSchemaDefTableObj
{
	protected ICFBamSchemaObj schema;
	private Map<CFBamScopePKey, ICFBamSchemaDefObj> members;
	private Map<CFBamScopePKey, ICFBamSchemaDefObj> allSchemaDef;
	private Map< CFBamScopeByTenantIdxKey,
		Map<CFBamScopePKey, ICFBamSchemaDefObj > > indexByTenantIdx;
	private Map< CFBamSchemaDefByCTenantIdxKey,
		Map<CFBamScopePKey, ICFBamSchemaDefObj > > indexByCTenantIdx;
	private Map< CFBamSchemaDefByMinorVersionIdxKey,
		Map<CFBamScopePKey, ICFBamSchemaDefObj > > indexByMinorVersionIdx;
	private Map< CFBamSchemaDefByUNameIdxKey,
		ICFBamSchemaDefObj > indexByUNameIdx;
	private Map< CFBamSchemaDefByAuthEMailIdxKey,
		Map<CFBamScopePKey, ICFBamSchemaDefObj > > indexByAuthEMailIdx;
	private Map< CFBamSchemaDefByProjectURLIdxKey,
		Map<CFBamScopePKey, ICFBamSchemaDefObj > > indexByProjectURLIdx;
	private Map< CFBamSchemaDefByPubURIIdxKey,
		ICFBamSchemaDefObj > indexByPubURIIdx;
	public static String TABLE_NAME = "SchemaDef";
	public static String TABLE_DBNAME = "schemadef";

	public CFBamSchemaDefTableObj() {
		schema = null;
		members = new HashMap<CFBamScopePKey, ICFBamSchemaDefObj>();
		allSchemaDef = null;
		indexByTenantIdx = null;
		indexByCTenantIdx = null;
		indexByMinorVersionIdx = null;
		indexByUNameIdx = null;
		indexByAuthEMailIdx = null;
		indexByProjectURLIdx = null;
		indexByPubURIIdx = null;
	}

	public CFBamSchemaDefTableObj( ICFBamSchemaObj argSchema ) {
		schema = (ICFBamSchemaObj)argSchema;
		members = new HashMap<CFBamScopePKey, ICFBamSchemaDefObj>();
		allSchemaDef = null;
		indexByTenantIdx = null;
		indexByCTenantIdx = null;
		indexByMinorVersionIdx = null;
		indexByUNameIdx = null;
		indexByAuthEMailIdx = null;
		indexByProjectURLIdx = null;
		indexByPubURIIdx = null;
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
		return( ICFBamSubProjectObj.class );
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
		List<ICFBamSchemaDefObj> toForget = new LinkedList<ICFBamSchemaDefObj>();
		ICFBamSchemaDefObj cur = null;
		Iterator<ICFBamSchemaDefObj> iter = members.values().iterator();
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
	 *	CFBamSchemaDefObj.
	 */
	public ICFBamSchemaDefObj newInstance() {
		ICFBamSchemaDefObj inst = new CFBamSchemaDefObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamSchemaDefObj.
	 */
	public ICFBamSchemaDefEditObj newEditInstance( ICFBamSchemaDefObj orig ) {
		ICFBamSchemaDefEditObj edit = new CFBamSchemaDefEditObj( orig );
		return( edit );
	}

	public ICFBamSchemaDefObj realiseSchemaDef( ICFBamSchemaDefObj Obj ) {
		ICFBamSchemaDefObj obj = Obj;
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamSchemaDefObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFBamSchemaDefObj existingObj = members.get( pkey );
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
				Map<CFBamScopePKey, ICFBamSchemaDefObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByCTenantIdx != null ) {
				CFBamSchemaDefByCTenantIdxKey keyCTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newCTenantIdxKey();
				keyCTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamSchemaDefObj > mapCTenantIdx = indexByCTenantIdx.get( keyCTenantIdx );
				if( mapCTenantIdx != null ) {
					mapCTenantIdx.remove( keepObj.getPKey() );
					if( mapCTenantIdx.size() <= 0 ) {
						indexByCTenantIdx.remove( keyCTenantIdx );
					}
				}
			}

			if( indexByMinorVersionIdx != null ) {
				CFBamSchemaDefByMinorVersionIdxKey keyMinorVersionIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newMinorVersionIdxKey();
				keyMinorVersionIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMinorVersionIdx.setRequiredMinorVersionId( keepObj.getRequiredMinorVersionId() );
				Map<CFBamScopePKey, ICFBamSchemaDefObj > mapMinorVersionIdx = indexByMinorVersionIdx.get( keyMinorVersionIdx );
				if( mapMinorVersionIdx != null ) {
					mapMinorVersionIdx.remove( keepObj.getPKey() );
					if( mapMinorVersionIdx.size() <= 0 ) {
						indexByMinorVersionIdx.remove( keyMinorVersionIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamSchemaDefByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredMinorVersionId( keepObj.getRequiredMinorVersionId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByAuthEMailIdx != null ) {
				CFBamSchemaDefByAuthEMailIdxKey keyAuthEMailIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newAuthEMailIdxKey();
				keyAuthEMailIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyAuthEMailIdx.setRequiredAuthorEMail( keepObj.getRequiredAuthorEMail() );
				Map<CFBamScopePKey, ICFBamSchemaDefObj > mapAuthEMailIdx = indexByAuthEMailIdx.get( keyAuthEMailIdx );
				if( mapAuthEMailIdx != null ) {
					mapAuthEMailIdx.remove( keepObj.getPKey() );
					if( mapAuthEMailIdx.size() <= 0 ) {
						indexByAuthEMailIdx.remove( keyAuthEMailIdx );
					}
				}
			}

			if( indexByProjectURLIdx != null ) {
				CFBamSchemaDefByProjectURLIdxKey keyProjectURLIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newProjectURLIdxKey();
				keyProjectURLIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyProjectURLIdx.setRequiredProjectURL( keepObj.getRequiredProjectURL() );
				Map<CFBamScopePKey, ICFBamSchemaDefObj > mapProjectURLIdx = indexByProjectURLIdx.get( keyProjectURLIdx );
				if( mapProjectURLIdx != null ) {
					mapProjectURLIdx.remove( keepObj.getPKey() );
					if( mapProjectURLIdx.size() <= 0 ) {
						indexByProjectURLIdx.remove( keyProjectURLIdx );
					}
				}
			}

			if( indexByPubURIIdx != null ) {
				CFBamSchemaDefByPubURIIdxKey keyPubURIIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newPubURIIdxKey();
				keyPubURIIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyPubURIIdx.setRequiredPublishURI( keepObj.getRequiredPublishURI() );
				indexByPubURIIdx.remove( keyPubURIIdx );
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (ICFBamSchemaDefObj)schema.getScopeTableObj().realiseScope( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamSchemaDefObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCTenantIdx != null ) {
				CFBamSchemaDefByCTenantIdxKey keyCTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newCTenantIdxKey();
				keyCTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamSchemaDefObj > mapCTenantIdx = indexByCTenantIdx.get( keyCTenantIdx );
				if( mapCTenantIdx != null ) {
					mapCTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMinorVersionIdx != null ) {
				CFBamSchemaDefByMinorVersionIdxKey keyMinorVersionIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newMinorVersionIdxKey();
				keyMinorVersionIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMinorVersionIdx.setRequiredMinorVersionId( keepObj.getRequiredMinorVersionId() );
				Map<CFBamScopePKey, ICFBamSchemaDefObj > mapMinorVersionIdx = indexByMinorVersionIdx.get( keyMinorVersionIdx );
				if( mapMinorVersionIdx != null ) {
					mapMinorVersionIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamSchemaDefByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredMinorVersionId( keepObj.getRequiredMinorVersionId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByAuthEMailIdx != null ) {
				CFBamSchemaDefByAuthEMailIdxKey keyAuthEMailIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newAuthEMailIdxKey();
				keyAuthEMailIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyAuthEMailIdx.setRequiredAuthorEMail( keepObj.getRequiredAuthorEMail() );
				Map<CFBamScopePKey, ICFBamSchemaDefObj > mapAuthEMailIdx = indexByAuthEMailIdx.get( keyAuthEMailIdx );
				if( mapAuthEMailIdx != null ) {
					mapAuthEMailIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByProjectURLIdx != null ) {
				CFBamSchemaDefByProjectURLIdxKey keyProjectURLIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newProjectURLIdxKey();
				keyProjectURLIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyProjectURLIdx.setRequiredProjectURL( keepObj.getRequiredProjectURL() );
				Map<CFBamScopePKey, ICFBamSchemaDefObj > mapProjectURLIdx = indexByProjectURLIdx.get( keyProjectURLIdx );
				if( mapProjectURLIdx != null ) {
					mapProjectURLIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPubURIIdx != null ) {
				CFBamSchemaDefByPubURIIdxKey keyPubURIIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newPubURIIdxKey();
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
			keepObj = (ICFBamSchemaDefObj)schema.getScopeTableObj().realiseScope( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSchemaDef != null ) {
				allSchemaDef.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamSchemaDefObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCTenantIdx != null ) {
				CFBamSchemaDefByCTenantIdxKey keyCTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newCTenantIdxKey();
				keyCTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamSchemaDefObj > mapCTenantIdx = indexByCTenantIdx.get( keyCTenantIdx );
				if( mapCTenantIdx != null ) {
					mapCTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMinorVersionIdx != null ) {
				CFBamSchemaDefByMinorVersionIdxKey keyMinorVersionIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newMinorVersionIdxKey();
				keyMinorVersionIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMinorVersionIdx.setRequiredMinorVersionId( keepObj.getRequiredMinorVersionId() );
				Map<CFBamScopePKey, ICFBamSchemaDefObj > mapMinorVersionIdx = indexByMinorVersionIdx.get( keyMinorVersionIdx );
				if( mapMinorVersionIdx != null ) {
					mapMinorVersionIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamSchemaDefByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredMinorVersionId( keepObj.getRequiredMinorVersionId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByAuthEMailIdx != null ) {
				CFBamSchemaDefByAuthEMailIdxKey keyAuthEMailIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newAuthEMailIdxKey();
				keyAuthEMailIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyAuthEMailIdx.setRequiredAuthorEMail( keepObj.getRequiredAuthorEMail() );
				Map<CFBamScopePKey, ICFBamSchemaDefObj > mapAuthEMailIdx = indexByAuthEMailIdx.get( keyAuthEMailIdx );
				if( mapAuthEMailIdx != null ) {
					mapAuthEMailIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByProjectURLIdx != null ) {
				CFBamSchemaDefByProjectURLIdxKey keyProjectURLIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newProjectURLIdxKey();
				keyProjectURLIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyProjectURLIdx.setRequiredProjectURL( keepObj.getRequiredProjectURL() );
				Map<CFBamScopePKey, ICFBamSchemaDefObj > mapProjectURLIdx = indexByProjectURLIdx.get( keyProjectURLIdx );
				if( mapProjectURLIdx != null ) {
					mapProjectURLIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPubURIIdx != null ) {
				CFBamSchemaDefByPubURIIdxKey keyPubURIIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newPubURIIdxKey();
				keyPubURIIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyPubURIIdx.setRequiredPublishURI( keepObj.getRequiredPublishURI() );
				indexByPubURIIdx.put( keyPubURIIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public ICFBamSchemaDefObj createSchemaDef( ICFBamSchemaDefObj Obj ) {
		ICFBamSchemaDefObj obj = Obj;
		CFBamSchemaDefBuff buff = obj.getSchemaDefBuff();
		((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().createSchemaDef(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a802" ) ) {
			obj = (ICFBamSchemaDefObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public ICFBamSchemaDefObj readSchemaDef( CFBamScopePKey pkey ) {
		return( readSchemaDef( pkey, false ) );
	}

	public ICFBamSchemaDefObj readSchemaDef( CFBamScopePKey pkey, boolean forceRead ) {
		ICFBamSchemaDefObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFBamSchemaDefBuff readBuff = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (ICFBamSchemaDefObj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFBamSchemaDefObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamSchemaDefObj readCachedSchemaDef( CFBamScopePKey pkey ) {
		ICFBamSchemaDefObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSchemaDef( ICFBamSchemaDefObj obj )
	{
		final String S_ProcName = "CFBamSchemaDefTableObj.reallyDeepDisposeSchemaDef() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamSchemaDefObj existing = readCachedSchemaDef( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFBamSchemaDefByCTenantIdxKey keyCTenantIdx = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newCTenantIdxKey();
		keyCTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		CFBamSchemaDefByMinorVersionIdxKey keyMinorVersionIdx = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newMinorVersionIdxKey();
		keyMinorVersionIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyMinorVersionIdx.setRequiredMinorVersionId( existing.getRequiredMinorVersionId() );

		CFBamSchemaDefByUNameIdxKey keyUNameIdx = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredMinorVersionId( existing.getRequiredMinorVersionId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		CFBamSchemaDefByAuthEMailIdxKey keyAuthEMailIdx = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newAuthEMailIdxKey();
		keyAuthEMailIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyAuthEMailIdx.setRequiredAuthorEMail( existing.getRequiredAuthorEMail() );

		CFBamSchemaDefByProjectURLIdxKey keyProjectURLIdx = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newProjectURLIdxKey();
		keyProjectURLIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyProjectURLIdx.setRequiredProjectURL( existing.getRequiredProjectURL() );

		CFBamSchemaDefByPubURIIdxKey keyPubURIIdx = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newPubURIIdxKey();
		keyPubURIIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyPubURIIdx.setRequiredPublishURI( existing.getRequiredPublishURI() );


		ICFBamTableObj objDelTableMethods;
		List<ICFBamTableObj> arrDelTableMethods = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<ICFBamTableObj> iterDelTableMethods = arrDelTableMethods.iterator();
		while( iterDelTableMethods.hasNext() ) {
			objDelTableMethods = iterDelTableMethods.next();
			if( objDelTableMethods != null ) {
						schema.getServerMethodTableObj().deepDisposeServerMethodByMethTableIdx( objDelTableMethods.getRequiredTenantId(),
							objDelTableMethods.getRequiredId() );
			}
		}
		ICFBamTableObj objDelTableDelDep;
		List<ICFBamTableObj> arrDelTableDelDep = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<ICFBamTableObj> iterDelTableDelDep = arrDelTableDelDep.iterator();
		while( iterDelTableDelDep.hasNext() ) {
			objDelTableDelDep = iterDelTableDelDep.next();
			if( objDelTableDelDep != null ) {
						schema.getDelTopDepTableObj().deepDisposeDelTopDepByDelTopDepTblIdx( objDelTableDelDep.getRequiredTenantId(),
							objDelTableDelDep.getRequiredId() );
			}
		}
		ICFBamTableObj objDelTableClearDep;
		List<ICFBamTableObj> arrDelTableClearDep = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<ICFBamTableObj> iterDelTableClearDep = arrDelTableClearDep.iterator();
		while( iterDelTableClearDep.hasNext() ) {
			objDelTableClearDep = iterDelTableClearDep.next();
			if( objDelTableClearDep != null ) {
						schema.getClearTopDepTableObj().deepDisposeClearTopDepByClrTopDepTblIdx( objDelTableClearDep.getRequiredTenantId(),
							objDelTableClearDep.getRequiredId() );
			}
		}
		ICFBamTableObj objDelTableChain;
		List<ICFBamTableObj> arrDelTableChain = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<ICFBamTableObj> iterDelTableChain = arrDelTableChain.iterator();
		while( iterDelTableChain.hasNext() ) {
			objDelTableChain = iterDelTableChain.next();
			if( objDelTableChain != null ) {
						schema.getChainTableObj().deepDisposeChainByChainTableIdx( objDelTableChain.getRequiredTenantId(),
							objDelTableChain.getRequiredId() );
			}
		}
		ICFBamTableObj objDelTableRelationPopDep;
		List<ICFBamTableObj> arrDelTableRelationPopDep = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<ICFBamTableObj> iterDelTableRelationPopDep = arrDelTableRelationPopDep.iterator();
		while( iterDelTableRelationPopDep.hasNext() ) {
			objDelTableRelationPopDep = iterDelTableRelationPopDep.next();
			if( objDelTableRelationPopDep != null ) {
			ICFBamRelationObj objTableRelation;
			List<ICFBamRelationObj> arrTableRelation = schema.getRelationTableObj().readCachedRelationByRelTableIdx( objDelTableRelationPopDep.getRequiredTenantId(),
							objDelTableRelationPopDep.getRequiredId() );
			Iterator<ICFBamRelationObj> iterTableRelation = arrTableRelation.iterator();
			while( iterTableRelation.hasNext() ) {
				objTableRelation = iterTableRelation.next();
					schema.getPopTopDepTableObj().deepDisposePopTopDepByContRelIdx( objTableRelation.getRequiredTenantId(),
							objTableRelation.getRequiredId() );
			}
			}
		}
		ICFBamTableObj objDelTableRelationCol;
		List<ICFBamTableObj> arrDelTableRelationCol = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<ICFBamTableObj> iterDelTableRelationCol = arrDelTableRelationCol.iterator();
		while( iterDelTableRelationCol.hasNext() ) {
			objDelTableRelationCol = iterDelTableRelationCol.next();
			if( objDelTableRelationCol != null ) {
			ICFBamRelationObj objTableRelation;
			List<ICFBamRelationObj> arrTableRelation = schema.getRelationTableObj().readCachedRelationByRelTableIdx( objDelTableRelationCol.getRequiredTenantId(),
							objDelTableRelationCol.getRequiredId() );
			Iterator<ICFBamRelationObj> iterTableRelation = arrTableRelation.iterator();
			while( iterTableRelation.hasNext() ) {
				objTableRelation = iterTableRelation.next();
					schema.getRelationColTableObj().deepDisposeRelationColByRelationIdx( objTableRelation.getRequiredTenantId(),
							objTableRelation.getRequiredId() );
			}
			}
		}
		ICFBamTableObj objDelTableRelation;
		List<ICFBamTableObj> arrDelTableRelation = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<ICFBamTableObj> iterDelTableRelation = arrDelTableRelation.iterator();
		while( iterDelTableRelation.hasNext() ) {
			objDelTableRelation = iterDelTableRelation.next();
			if( objDelTableRelation != null ) {
						schema.getRelationTableObj().deepDisposeRelationByRelTableIdx( objDelTableRelation.getRequiredTenantId(),
							objDelTableRelation.getRequiredId() );
			}
		}
		ICFBamTableObj objDelTableIndexRefRelFmCol;
		List<ICFBamTableObj> arrDelTableIndexRefRelFmCol = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<ICFBamTableObj> iterDelTableIndexRefRelFmCol = arrDelTableIndexRefRelFmCol.iterator();
		while( iterDelTableIndexRefRelFmCol.hasNext() ) {
			objDelTableIndexRefRelFmCol = iterDelTableIndexRefRelFmCol.next();
			if( objDelTableIndexRefRelFmCol != null ) {
			ICFBamIndexObj objTableIndex;
			List<ICFBamIndexObj> arrTableIndex = schema.getIndexTableObj().readCachedIndexByIdxTableIdx( objDelTableIndexRefRelFmCol.getRequiredTenantId(),
							objDelTableIndexRefRelFmCol.getRequiredId() );
			Iterator<ICFBamIndexObj> iterTableIndex = arrTableIndex.iterator();
			while( iterTableIndex.hasNext() ) {
				objTableIndex = iterTableIndex.next();
			ICFBamIndexColObj objColumns;
			List<ICFBamIndexColObj> arrColumns = schema.getIndexColTableObj().readCachedIndexColByIndexIdx( objTableIndex.getRequiredTenantId(),
							objTableIndex.getRequiredId() );
			Iterator<ICFBamIndexColObj> iterColumns = arrColumns.iterator();
			while( iterColumns.hasNext() ) {
				objColumns = iterColumns.next();
					schema.getRelationColTableObj().deepDisposeRelationColByFromColIdx( objColumns.getRequiredTenantId(),
							objColumns.getRequiredId() );
			}
			}
			}
		}
		ICFBamTableObj objDelTableIndexRefRelToCol;
		List<ICFBamTableObj> arrDelTableIndexRefRelToCol = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<ICFBamTableObj> iterDelTableIndexRefRelToCol = arrDelTableIndexRefRelToCol.iterator();
		while( iterDelTableIndexRefRelToCol.hasNext() ) {
			objDelTableIndexRefRelToCol = iterDelTableIndexRefRelToCol.next();
			if( objDelTableIndexRefRelToCol != null ) {
			ICFBamIndexObj objTableIndex;
			List<ICFBamIndexObj> arrTableIndex = schema.getIndexTableObj().readCachedIndexByIdxTableIdx( objDelTableIndexRefRelToCol.getRequiredTenantId(),
							objDelTableIndexRefRelToCol.getRequiredId() );
			Iterator<ICFBamIndexObj> iterTableIndex = arrTableIndex.iterator();
			while( iterTableIndex.hasNext() ) {
				objTableIndex = iterTableIndex.next();
			ICFBamIndexColObj objColumns;
			List<ICFBamIndexColObj> arrColumns = schema.getIndexColTableObj().readCachedIndexColByIndexIdx( objTableIndex.getRequiredTenantId(),
							objTableIndex.getRequiredId() );
			Iterator<ICFBamIndexColObj> iterColumns = arrColumns.iterator();
			while( iterColumns.hasNext() ) {
				objColumns = iterColumns.next();
					schema.getRelationColTableObj().deepDisposeRelationColByToColIdx( objColumns.getRequiredTenantId(),
							objColumns.getRequiredId() );
			}
			}
			}
		}
		ICFBamTableObj objDelTableIndexCols;
		List<ICFBamTableObj> arrDelTableIndexCols = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<ICFBamTableObj> iterDelTableIndexCols = arrDelTableIndexCols.iterator();
		while( iterDelTableIndexCols.hasNext() ) {
			objDelTableIndexCols = iterDelTableIndexCols.next();
			if( objDelTableIndexCols != null ) {
			ICFBamIndexObj objTableIndex;
			List<ICFBamIndexObj> arrTableIndex = schema.getIndexTableObj().readCachedIndexByIdxTableIdx( objDelTableIndexCols.getRequiredTenantId(),
							objDelTableIndexCols.getRequiredId() );
			Iterator<ICFBamIndexObj> iterTableIndex = arrTableIndex.iterator();
			while( iterTableIndex.hasNext() ) {
				objTableIndex = iterTableIndex.next();
					schema.getIndexColTableObj().deepDisposeIndexColByIndexIdx( objTableIndex.getRequiredTenantId(),
							objTableIndex.getRequiredId() );
			}
			}
		}
		ICFBamTableObj objDelTableIndexes;
		List<ICFBamTableObj> arrDelTableIndexes = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<ICFBamTableObj> iterDelTableIndexes = arrDelTableIndexes.iterator();
		while( iterDelTableIndexes.hasNext() ) {
			objDelTableIndexes = iterDelTableIndexes.next();
			if( objDelTableIndexes != null ) {
						schema.getIndexTableObj().deepDisposeIndexByIdxTableIdx( objDelTableIndexes.getRequiredTenantId(),
							objDelTableIndexes.getRequiredId() );
			}
		}
		ICFBamTableObj objDelTableRefIndexColumns;
		List<ICFBamTableObj> arrDelTableRefIndexColumns = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<ICFBamTableObj> iterDelTableRefIndexColumns = arrDelTableRefIndexColumns.iterator();
		while( iterDelTableRefIndexColumns.hasNext() ) {
			objDelTableRefIndexColumns = iterDelTableRefIndexColumns.next();
			if( objDelTableRefIndexColumns != null ) {
			ICFBamValueObj objColumns;
			List<ICFBamValueObj> arrColumns = schema.getValueTableObj().readCachedValueByScopeIdx( objDelTableRefIndexColumns.getRequiredTenantId(),
							objDelTableRefIndexColumns.getRequiredId() );
			Iterator<ICFBamValueObj> iterColumns = arrColumns.iterator();
			while( iterColumns.hasNext() ) {
				objColumns = iterColumns.next();
					schema.getIndexColTableObj().deepDisposeIndexColByColIdx( objColumns.getRequiredTenantId(),
							objColumns.getRequiredId() );
			}
			}
		}
		ICFBamTableObj objDelTableColumns;
		List<ICFBamTableObj> arrDelTableColumns = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<ICFBamTableObj> iterDelTableColumns = arrDelTableColumns.iterator();
		while( iterDelTableColumns.hasNext() ) {
			objDelTableColumns = iterDelTableColumns.next();
			if( objDelTableColumns != null ) {
						schema.getValueTableObj().deepDisposeValueByScopeIdx( objDelTableColumns.getRequiredTenantId(),
							objDelTableColumns.getRequiredId() );
			}
		}
		ICFBamTableObj objDelTableDispensedId64Gen;
		List<ICFBamTableObj> arrDelTableDispensedId64Gen = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<ICFBamTableObj> iterDelTableDispensedId64Gen = arrDelTableDispensedId64Gen.iterator();
		while( iterDelTableDispensedId64Gen.hasNext() ) {
			objDelTableDispensedId64Gen = iterDelTableDispensedId64Gen.next();
			if( objDelTableDispensedId64Gen != null ) {
						schema.getId64GenTableObj().deepDisposeId64GenByDispIdx( objDelTableDispensedId64Gen.getRequiredTenantId(),
							objDelTableDispensedId64Gen.getRequiredId() );
			}
		}
		ICFBamTableObj objDelTableDispensedId32Gen;
		List<ICFBamTableObj> arrDelTableDispensedId32Gen = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<ICFBamTableObj> iterDelTableDispensedId32Gen = arrDelTableDispensedId32Gen.iterator();
		while( iterDelTableDispensedId32Gen.hasNext() ) {
			objDelTableDispensedId32Gen = iterDelTableDispensedId32Gen.next();
			if( objDelTableDispensedId32Gen != null ) {
						schema.getId32GenTableObj().deepDisposeId32GenByDispIdx( objDelTableDispensedId32Gen.getRequiredTenantId(),
							objDelTableDispensedId32Gen.getRequiredId() );
			}
		}
		ICFBamTableObj objDelTableDispensedId16Gen;
		List<ICFBamTableObj> arrDelTableDispensedId16Gen = schema.getTableTableObj().readCachedTableBySchemaDefIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<ICFBamTableObj> iterDelTableDispensedId16Gen = arrDelTableDispensedId16Gen.iterator();
		while( iterDelTableDispensedId16Gen.hasNext() ) {
			objDelTableDispensedId16Gen = iterDelTableDispensedId16Gen.next();
			if( objDelTableDispensedId16Gen != null ) {
						schema.getId16GenTableObj().deepDisposeId16GenByDispIdx( objDelTableDispensedId16Gen.getRequiredTenantId(),
							objDelTableDispensedId16Gen.getRequiredId() );
			}
		}
					schema.getTableTableObj().deepDisposeTableBySchemaDefIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );
		ICFBamValueObj objDelTypeRefs;
		List<ICFBamValueObj> arrDelTypeRefs = schema.getValueTableObj().readCachedValueByScopeIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<ICFBamValueObj> iterDelTypeRefs = arrDelTypeRefs.iterator();
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
	public void deepDisposeSchemaDef( CFBamScopePKey pkey ) {
		ICFBamSchemaDefObj obj = readCachedSchemaDef( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamSchemaDefObj lockSchemaDef( CFBamScopePKey pkey ) {
		ICFBamSchemaDefObj locked = null;
		CFBamSchemaDefBuff lockBuff = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (ICFBamSchemaDefObj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFBamSchemaDefObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockSchemaDef", pkey );
		}
		return( locked );
	}

	public List<ICFBamSchemaDefObj> readAllSchemaDef() {
		return( readAllSchemaDef( false ) );
	}

	public List<ICFBamSchemaDefObj> readAllSchemaDef( boolean forceRead ) {
		final String S_ProcName = "readAllSchemaDef";
		if( ( allSchemaDef == null ) || forceRead ) {
			Map<CFBamScopePKey, ICFBamSchemaDefObj> map = new HashMap<CFBamScopePKey,ICFBamSchemaDefObj>();
			allSchemaDef = map;
			CFBamSchemaDefBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().readAllDerived( schema.getAuthorization() );
			CFBamSchemaDefBuff buff;
			ICFBamSchemaDefObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamSchemaDefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamSchemaDefObj realised = (ICFBamSchemaDefObj)obj.realise();
			}
		}
		int len = allSchemaDef.size();
		ICFBamSchemaDefObj arr[] = new ICFBamSchemaDefObj[len];
		Iterator<ICFBamSchemaDefObj> valIter = allSchemaDef.values().iterator();
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
		ArrayList<ICFBamSchemaDefObj> arrayList = new ArrayList<ICFBamSchemaDefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamSchemaDefObj> cmp = new Comparator<ICFBamSchemaDefObj>() {
			public int compare( ICFBamSchemaDefObj lhs, ICFBamSchemaDefObj rhs ) {
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
		List<ICFBamSchemaDefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamSchemaDefObj> readCachedAllSchemaDef() {
		final String S_ProcName = "readCachedAllSchemaDef";
		ArrayList<ICFBamSchemaDefObj> arrayList = new ArrayList<ICFBamSchemaDefObj>();
		if( allSchemaDef != null ) {
			int len = allSchemaDef.size();
			ICFBamSchemaDefObj arr[] = new ICFBamSchemaDefObj[len];
			Iterator<ICFBamSchemaDefObj> valIter = allSchemaDef.values().iterator();
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
		Comparator<ICFBamSchemaDefObj> cmp = new Comparator<ICFBamSchemaDefObj>() {
			public int compare( ICFBamSchemaDefObj lhs, ICFBamSchemaDefObj rhs ) {
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

	public ICFBamSchemaDefObj readSchemaDefByIdIdx( long TenantId,
		long Id )
	{
		return( readSchemaDefByIdIdx( TenantId,
			Id,
			false ) );
	}

	public ICFBamSchemaDefObj readSchemaDefByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamSchemaDefObj obj = readSchemaDef( pkey, forceRead );
		return( obj );
	}

	public List<ICFBamSchemaDefObj> readSchemaDefByTenantIdx( long TenantId )
	{
		return( readSchemaDefByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFBamSchemaDefObj> readSchemaDefByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaDefByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFBamScopePKey, ICFBamSchemaDefObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamSchemaDefObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamSchemaDefObj>();
			ICFBamScopeObj obj;
			CFBamScopeBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamSchemaDefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamSchemaDefObj realised = (ICFBamSchemaDefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamSchemaDefObj arr[] = new ICFBamSchemaDefObj[len];
		Iterator<ICFBamSchemaDefObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamSchemaDefObj> arrayList = new ArrayList<ICFBamSchemaDefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamSchemaDefObj> cmp = new Comparator<ICFBamSchemaDefObj>() {
			public int compare( ICFBamSchemaDefObj lhs, ICFBamSchemaDefObj rhs ) {
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
		List<ICFBamSchemaDefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamSchemaDefObj> readSchemaDefByCTenantIdx( long TenantId )
	{
		return( readSchemaDefByCTenantIdx( TenantId,
			false ) );
	}

	public List<ICFBamSchemaDefObj> readSchemaDefByCTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaDefByCTenantIdx";
		CFBamSchemaDefByCTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newCTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFBamScopePKey, ICFBamSchemaDefObj> dict;
		if( indexByCTenantIdx == null ) {
			indexByCTenantIdx = new HashMap< CFBamSchemaDefByCTenantIdxKey,
				Map< CFBamScopePKey, ICFBamSchemaDefObj > >();
		}
		if( ( ! forceRead ) && indexByCTenantIdx.containsKey( key ) ) {
			dict = indexByCTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamSchemaDefObj>();
			ICFBamSchemaDefObj obj;
			CFBamSchemaDefBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().readDerivedByCTenantIdx( schema.getAuthorization(),
				TenantId );
			CFBamSchemaDefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamSchemaDefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamSchemaDefObj realised = (ICFBamSchemaDefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByCTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamSchemaDefObj arr[] = new ICFBamSchemaDefObj[len];
		Iterator<ICFBamSchemaDefObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamSchemaDefObj> arrayList = new ArrayList<ICFBamSchemaDefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamSchemaDefObj> cmp = new Comparator<ICFBamSchemaDefObj>() {
			public int compare( ICFBamSchemaDefObj lhs, ICFBamSchemaDefObj rhs ) {
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
		List<ICFBamSchemaDefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamSchemaDefObj> readSchemaDefByMinorVersionIdx( long TenantId,
		long MinorVersionId )
	{
		return( readSchemaDefByMinorVersionIdx( TenantId,
			MinorVersionId,
			false ) );
	}

	public List<ICFBamSchemaDefObj> readSchemaDefByMinorVersionIdx( long TenantId,
		long MinorVersionId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaDefByMinorVersionIdx";
		CFBamSchemaDefByMinorVersionIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newMinorVersionIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMinorVersionId( MinorVersionId );
		Map<CFBamScopePKey, ICFBamSchemaDefObj> dict;
		if( indexByMinorVersionIdx == null ) {
			indexByMinorVersionIdx = new HashMap< CFBamSchemaDefByMinorVersionIdxKey,
				Map< CFBamScopePKey, ICFBamSchemaDefObj > >();
		}
		if( ( ! forceRead ) && indexByMinorVersionIdx.containsKey( key ) ) {
			dict = indexByMinorVersionIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamSchemaDefObj>();
			ICFBamSchemaDefObj obj;
			CFBamSchemaDefBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().readDerivedByMinorVersionIdx( schema.getAuthorization(),
				TenantId,
				MinorVersionId );
			CFBamSchemaDefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamSchemaDefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamSchemaDefObj realised = (ICFBamSchemaDefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByMinorVersionIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamSchemaDefObj arr[] = new ICFBamSchemaDefObj[len];
		Iterator<ICFBamSchemaDefObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamSchemaDefObj> arrayList = new ArrayList<ICFBamSchemaDefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamSchemaDefObj> cmp = new Comparator<ICFBamSchemaDefObj>() {
			public int compare( ICFBamSchemaDefObj lhs, ICFBamSchemaDefObj rhs ) {
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
		List<ICFBamSchemaDefObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamSchemaDefObj readSchemaDefByUNameIdx( long TenantId,
		long MinorVersionId,
		String Name )
	{
		return( readSchemaDefByUNameIdx( TenantId,
			MinorVersionId,
			Name,
			false ) );
	}

	public ICFBamSchemaDefObj readSchemaDefByUNameIdx( long TenantId,
		long MinorVersionId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamSchemaDefByUNameIdxKey,
				ICFBamSchemaDefObj >();
		}
		CFBamSchemaDefByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMinorVersionId( MinorVersionId );
		key.setRequiredName( Name );
		ICFBamSchemaDefObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			CFBamSchemaDefBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				MinorVersionId,
				Name );
			if( buff != null ) {
				obj = (ICFBamSchemaDefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamSchemaDefObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<ICFBamSchemaDefObj> readSchemaDefByAuthEMailIdx( long TenantId,
		String AuthorEMail )
	{
		return( readSchemaDefByAuthEMailIdx( TenantId,
			AuthorEMail,
			false ) );
	}

	public List<ICFBamSchemaDefObj> readSchemaDefByAuthEMailIdx( long TenantId,
		String AuthorEMail,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaDefByAuthEMailIdx";
		CFBamSchemaDefByAuthEMailIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newAuthEMailIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredAuthorEMail( AuthorEMail );
		Map<CFBamScopePKey, ICFBamSchemaDefObj> dict;
		if( indexByAuthEMailIdx == null ) {
			indexByAuthEMailIdx = new HashMap< CFBamSchemaDefByAuthEMailIdxKey,
				Map< CFBamScopePKey, ICFBamSchemaDefObj > >();
		}
		if( ( ! forceRead ) && indexByAuthEMailIdx.containsKey( key ) ) {
			dict = indexByAuthEMailIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamSchemaDefObj>();
			ICFBamSchemaDefObj obj;
			CFBamSchemaDefBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().readDerivedByAuthEMailIdx( schema.getAuthorization(),
				TenantId,
				AuthorEMail );
			CFBamSchemaDefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamSchemaDefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamSchemaDefObj realised = (ICFBamSchemaDefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByAuthEMailIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamSchemaDefObj arr[] = new ICFBamSchemaDefObj[len];
		Iterator<ICFBamSchemaDefObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamSchemaDefObj> arrayList = new ArrayList<ICFBamSchemaDefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamSchemaDefObj> cmp = new Comparator<ICFBamSchemaDefObj>() {
			public int compare( ICFBamSchemaDefObj lhs, ICFBamSchemaDefObj rhs ) {
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
		List<ICFBamSchemaDefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamSchemaDefObj> readSchemaDefByProjectURLIdx( long TenantId,
		String ProjectURL )
	{
		return( readSchemaDefByProjectURLIdx( TenantId,
			ProjectURL,
			false ) );
	}

	public List<ICFBamSchemaDefObj> readSchemaDefByProjectURLIdx( long TenantId,
		String ProjectURL,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaDefByProjectURLIdx";
		CFBamSchemaDefByProjectURLIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newProjectURLIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredProjectURL( ProjectURL );
		Map<CFBamScopePKey, ICFBamSchemaDefObj> dict;
		if( indexByProjectURLIdx == null ) {
			indexByProjectURLIdx = new HashMap< CFBamSchemaDefByProjectURLIdxKey,
				Map< CFBamScopePKey, ICFBamSchemaDefObj > >();
		}
		if( ( ! forceRead ) && indexByProjectURLIdx.containsKey( key ) ) {
			dict = indexByProjectURLIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamSchemaDefObj>();
			ICFBamSchemaDefObj obj;
			CFBamSchemaDefBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().readDerivedByProjectURLIdx( schema.getAuthorization(),
				TenantId,
				ProjectURL );
			CFBamSchemaDefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamSchemaDefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamSchemaDefObj realised = (ICFBamSchemaDefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByProjectURLIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamSchemaDefObj arr[] = new ICFBamSchemaDefObj[len];
		Iterator<ICFBamSchemaDefObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamSchemaDefObj> arrayList = new ArrayList<ICFBamSchemaDefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamSchemaDefObj> cmp = new Comparator<ICFBamSchemaDefObj>() {
			public int compare( ICFBamSchemaDefObj lhs, ICFBamSchemaDefObj rhs ) {
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
		List<ICFBamSchemaDefObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamSchemaDefObj readSchemaDefByPubURIIdx( long TenantId,
		String PublishURI )
	{
		return( readSchemaDefByPubURIIdx( TenantId,
			PublishURI,
			false ) );
	}

	public ICFBamSchemaDefObj readSchemaDefByPubURIIdx( long TenantId,
		String PublishURI, boolean forceRead )
	{
		if( indexByPubURIIdx == null ) {
			indexByPubURIIdx = new HashMap< CFBamSchemaDefByPubURIIdxKey,
				ICFBamSchemaDefObj >();
		}
		CFBamSchemaDefByPubURIIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newPubURIIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredPublishURI( PublishURI );
		ICFBamSchemaDefObj obj = null;
		if( ( ! forceRead ) && indexByPubURIIdx.containsKey( key ) ) {
			obj = indexByPubURIIdx.get( key );
		}
		else {
			CFBamSchemaDefBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().readDerivedByPubURIIdx( schema.getAuthorization(),
				TenantId,
				PublishURI );
			if( buff != null ) {
				obj = (ICFBamSchemaDefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamSchemaDefObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamSchemaDefObj readCachedSchemaDefByIdIdx( long TenantId,
		long Id )
	{
		ICFBamSchemaDefObj obj = null;
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedSchemaDef( pkey );
		return( obj );
	}

	public List<ICFBamSchemaDefObj> readCachedSchemaDefByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedSchemaDefByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFBamSchemaDefObj> arrayList = new ArrayList<ICFBamSchemaDefObj>();
		if( indexByTenantIdx != null ) {
			Map<CFBamScopePKey, ICFBamSchemaDefObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFBamSchemaDefObj arr[] = new ICFBamSchemaDefObj[len];
				Iterator<ICFBamSchemaDefObj> valIter = dict.values().iterator();
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
			ICFBamSchemaDefObj obj;
			Iterator<ICFBamSchemaDefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamSchemaDefObj> cmp = new Comparator<ICFBamSchemaDefObj>() {
			public int compare( ICFBamSchemaDefObj lhs, ICFBamSchemaDefObj rhs ) {
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

	public List<ICFBamSchemaDefObj> readCachedSchemaDefByCTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedSchemaDefByCTenantIdx";
		CFBamSchemaDefByCTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newCTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFBamSchemaDefObj> arrayList = new ArrayList<ICFBamSchemaDefObj>();
		if( indexByCTenantIdx != null ) {
			Map<CFBamScopePKey, ICFBamSchemaDefObj> dict;
			if( indexByCTenantIdx.containsKey( key ) ) {
				dict = indexByCTenantIdx.get( key );
				int len = dict.size();
				ICFBamSchemaDefObj arr[] = new ICFBamSchemaDefObj[len];
				Iterator<ICFBamSchemaDefObj> valIter = dict.values().iterator();
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
			ICFBamSchemaDefObj obj;
			Iterator<ICFBamSchemaDefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamSchemaDefObj> cmp = new Comparator<ICFBamSchemaDefObj>() {
			public int compare( ICFBamSchemaDefObj lhs, ICFBamSchemaDefObj rhs ) {
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

	public List<ICFBamSchemaDefObj> readCachedSchemaDefByMinorVersionIdx( long TenantId,
		long MinorVersionId )
	{
		final String S_ProcName = "readCachedSchemaDefByMinorVersionIdx";
		CFBamSchemaDefByMinorVersionIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newMinorVersionIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMinorVersionId( MinorVersionId );
		ArrayList<ICFBamSchemaDefObj> arrayList = new ArrayList<ICFBamSchemaDefObj>();
		if( indexByMinorVersionIdx != null ) {
			Map<CFBamScopePKey, ICFBamSchemaDefObj> dict;
			if( indexByMinorVersionIdx.containsKey( key ) ) {
				dict = indexByMinorVersionIdx.get( key );
				int len = dict.size();
				ICFBamSchemaDefObj arr[] = new ICFBamSchemaDefObj[len];
				Iterator<ICFBamSchemaDefObj> valIter = dict.values().iterator();
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
			ICFBamSchemaDefObj obj;
			Iterator<ICFBamSchemaDefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamSchemaDefObj> cmp = new Comparator<ICFBamSchemaDefObj>() {
			public int compare( ICFBamSchemaDefObj lhs, ICFBamSchemaDefObj rhs ) {
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

	public ICFBamSchemaDefObj readCachedSchemaDefByUNameIdx( long TenantId,
		long MinorVersionId,
		String Name )
	{
		ICFBamSchemaDefObj obj = null;
		CFBamSchemaDefByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMinorVersionId( MinorVersionId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<ICFBamSchemaDefObj> valIter = members.values().iterator();
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
			Iterator<ICFBamSchemaDefObj> valIter = members.values().iterator();
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

	public List<ICFBamSchemaDefObj> readCachedSchemaDefByAuthEMailIdx( long TenantId,
		String AuthorEMail )
	{
		final String S_ProcName = "readCachedSchemaDefByAuthEMailIdx";
		CFBamSchemaDefByAuthEMailIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newAuthEMailIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredAuthorEMail( AuthorEMail );
		ArrayList<ICFBamSchemaDefObj> arrayList = new ArrayList<ICFBamSchemaDefObj>();
		if( indexByAuthEMailIdx != null ) {
			Map<CFBamScopePKey, ICFBamSchemaDefObj> dict;
			if( indexByAuthEMailIdx.containsKey( key ) ) {
				dict = indexByAuthEMailIdx.get( key );
				int len = dict.size();
				ICFBamSchemaDefObj arr[] = new ICFBamSchemaDefObj[len];
				Iterator<ICFBamSchemaDefObj> valIter = dict.values().iterator();
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
			ICFBamSchemaDefObj obj;
			Iterator<ICFBamSchemaDefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamSchemaDefObj> cmp = new Comparator<ICFBamSchemaDefObj>() {
			public int compare( ICFBamSchemaDefObj lhs, ICFBamSchemaDefObj rhs ) {
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

	public List<ICFBamSchemaDefObj> readCachedSchemaDefByProjectURLIdx( long TenantId,
		String ProjectURL )
	{
		final String S_ProcName = "readCachedSchemaDefByProjectURLIdx";
		CFBamSchemaDefByProjectURLIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newProjectURLIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredProjectURL( ProjectURL );
		ArrayList<ICFBamSchemaDefObj> arrayList = new ArrayList<ICFBamSchemaDefObj>();
		if( indexByProjectURLIdx != null ) {
			Map<CFBamScopePKey, ICFBamSchemaDefObj> dict;
			if( indexByProjectURLIdx.containsKey( key ) ) {
				dict = indexByProjectURLIdx.get( key );
				int len = dict.size();
				ICFBamSchemaDefObj arr[] = new ICFBamSchemaDefObj[len];
				Iterator<ICFBamSchemaDefObj> valIter = dict.values().iterator();
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
			ICFBamSchemaDefObj obj;
			Iterator<ICFBamSchemaDefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamSchemaDefObj> cmp = new Comparator<ICFBamSchemaDefObj>() {
			public int compare( ICFBamSchemaDefObj lhs, ICFBamSchemaDefObj rhs ) {
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

	public ICFBamSchemaDefObj readCachedSchemaDefByPubURIIdx( long TenantId,
		String PublishURI )
	{
		ICFBamSchemaDefObj obj = null;
		CFBamSchemaDefByPubURIIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newPubURIIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredPublishURI( PublishURI );
		if( indexByPubURIIdx != null ) {
			if( indexByPubURIIdx.containsKey( key ) ) {
				obj = indexByPubURIIdx.get( key );
			}
			else {
				Iterator<ICFBamSchemaDefObj> valIter = members.values().iterator();
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
			Iterator<ICFBamSchemaDefObj> valIter = members.values().iterator();
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
		ICFBamSchemaDefObj obj = readCachedSchemaDefByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSchemaDefByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeSchemaDefByTenantIdx";
		ICFBamSchemaDefObj obj;
		List<ICFBamSchemaDefObj> arrayList = readCachedSchemaDefByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFBamSchemaDefObj> arrayIter = arrayList.iterator();
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
		ICFBamSchemaDefObj obj;
		List<ICFBamSchemaDefObj> arrayList = readCachedSchemaDefByCTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFBamSchemaDefObj> arrayIter = arrayList.iterator();
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
		ICFBamSchemaDefObj obj;
		List<ICFBamSchemaDefObj> arrayList = readCachedSchemaDefByMinorVersionIdx( TenantId,
				MinorVersionId );
		if( arrayList != null )  {
			Iterator<ICFBamSchemaDefObj> arrayIter = arrayList.iterator();
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
		ICFBamSchemaDefObj obj = readCachedSchemaDefByUNameIdx( TenantId,
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
		ICFBamSchemaDefObj obj;
		List<ICFBamSchemaDefObj> arrayList = readCachedSchemaDefByAuthEMailIdx( TenantId,
				AuthorEMail );
		if( arrayList != null )  {
			Iterator<ICFBamSchemaDefObj> arrayIter = arrayList.iterator();
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
		ICFBamSchemaDefObj obj;
		List<ICFBamSchemaDefObj> arrayList = readCachedSchemaDefByProjectURLIdx( TenantId,
				ProjectURL );
		if( arrayList != null )  {
			Iterator<ICFBamSchemaDefObj> arrayIter = arrayList.iterator();
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
		ICFBamSchemaDefObj obj = readCachedSchemaDefByPubURIIdx( TenantId,
				PublishURI );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamSchemaDefObj updateSchemaDef( ICFBamSchemaDefObj Obj ) {
		ICFBamSchemaDefObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().updateSchemaDef( schema.getAuthorization(),
			Obj.getSchemaDefBuff() );
		if( Obj.getClassCode().equals( "a802" ) ) {
			obj = (ICFBamSchemaDefObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteSchemaDef( ICFBamSchemaDefObj Obj ) {
		ICFBamSchemaDefObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDef( schema.getAuthorization(),
			obj.getSchemaDefBuff() );
		Obj.forget();
	}

	public void deleteSchemaDefByIdIdx( long TenantId,
		long Id )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamSchemaDefObj obj = readSchemaDef( pkey );
		if( obj != null ) {
			ICFBamSchemaDefEditObj editObj = (ICFBamSchemaDefEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFBamSchemaDefEditObj)obj.beginEdit();
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
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamSchemaDefObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamSchemaDefObj> dict = indexByTenantIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFBamSchemaDefObj> iter = dict.values().iterator();
			ICFBamSchemaDefObj obj;
			List<ICFBamSchemaDefObj> toForget = new LinkedList<ICFBamSchemaDefObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeSchemaDefByTenantIdx( TenantId );
	}

	public void deleteSchemaDefByCTenantIdx( long TenantId )
	{
		CFBamSchemaDefByCTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newCTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByCTenantIdx == null ) {
			indexByCTenantIdx = new HashMap< CFBamSchemaDefByCTenantIdxKey,
				Map< CFBamScopePKey, ICFBamSchemaDefObj > >();
		}
		if( indexByCTenantIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamSchemaDefObj> dict = indexByCTenantIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByCTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFBamSchemaDefObj> iter = dict.values().iterator();
			ICFBamSchemaDefObj obj;
			List<ICFBamSchemaDefObj> toForget = new LinkedList<ICFBamSchemaDefObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByCTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeSchemaDefByCTenantIdx( TenantId );
	}

	public void deleteSchemaDefByMinorVersionIdx( long TenantId,
		long MinorVersionId )
	{
		CFBamSchemaDefByMinorVersionIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newMinorVersionIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMinorVersionId( MinorVersionId );
		if( indexByMinorVersionIdx == null ) {
			indexByMinorVersionIdx = new HashMap< CFBamSchemaDefByMinorVersionIdxKey,
				Map< CFBamScopePKey, ICFBamSchemaDefObj > >();
		}
		if( indexByMinorVersionIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamSchemaDefObj> dict = indexByMinorVersionIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByMinorVersionIdx( schema.getAuthorization(),
				TenantId,
				MinorVersionId );
			Iterator<ICFBamSchemaDefObj> iter = dict.values().iterator();
			ICFBamSchemaDefObj obj;
			List<ICFBamSchemaDefObj> toForget = new LinkedList<ICFBamSchemaDefObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByMinorVersionIdx( schema.getAuthorization(),
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
			indexByUNameIdx = new HashMap< CFBamSchemaDefByUNameIdxKey,
				ICFBamSchemaDefObj >();
		}
		CFBamSchemaDefByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMinorVersionId( MinorVersionId );
		key.setRequiredName( Name );
		ICFBamSchemaDefObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByUNameIdx( schema.getAuthorization(),
				TenantId,
				MinorVersionId,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByUNameIdx( schema.getAuthorization(),
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
		CFBamSchemaDefByAuthEMailIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newAuthEMailIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredAuthorEMail( AuthorEMail );
		if( indexByAuthEMailIdx == null ) {
			indexByAuthEMailIdx = new HashMap< CFBamSchemaDefByAuthEMailIdxKey,
				Map< CFBamScopePKey, ICFBamSchemaDefObj > >();
		}
		if( indexByAuthEMailIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamSchemaDefObj> dict = indexByAuthEMailIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByAuthEMailIdx( schema.getAuthorization(),
				TenantId,
				AuthorEMail );
			Iterator<ICFBamSchemaDefObj> iter = dict.values().iterator();
			ICFBamSchemaDefObj obj;
			List<ICFBamSchemaDefObj> toForget = new LinkedList<ICFBamSchemaDefObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByAuthEMailIdx( schema.getAuthorization(),
				TenantId,
				AuthorEMail );
		}
		deepDisposeSchemaDefByAuthEMailIdx( TenantId,
				AuthorEMail );
	}

	public void deleteSchemaDefByProjectURLIdx( long TenantId,
		String ProjectURL )
	{
		CFBamSchemaDefByProjectURLIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newProjectURLIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredProjectURL( ProjectURL );
		if( indexByProjectURLIdx == null ) {
			indexByProjectURLIdx = new HashMap< CFBamSchemaDefByProjectURLIdxKey,
				Map< CFBamScopePKey, ICFBamSchemaDefObj > >();
		}
		if( indexByProjectURLIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamSchemaDefObj> dict = indexByProjectURLIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByProjectURLIdx( schema.getAuthorization(),
				TenantId,
				ProjectURL );
			Iterator<ICFBamSchemaDefObj> iter = dict.values().iterator();
			ICFBamSchemaDefObj obj;
			List<ICFBamSchemaDefObj> toForget = new LinkedList<ICFBamSchemaDefObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByProjectURLIdx( schema.getAuthorization(),
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
			indexByPubURIIdx = new HashMap< CFBamSchemaDefByPubURIIdxKey,
				ICFBamSchemaDefObj >();
		}
		CFBamSchemaDefByPubURIIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newPubURIIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredPublishURI( PublishURI );
		ICFBamSchemaDefObj obj = null;
		if( indexByPubURIIdx.containsKey( key ) ) {
			obj = indexByPubURIIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByPubURIIdx( schema.getAuthorization(),
				TenantId,
				PublishURI );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaDef().deleteSchemaDefByPubURIIdx( schema.getAuthorization(),
				TenantId,
				PublishURI );
		}
		deepDisposeSchemaDefByPubURIIdx( TenantId,
				PublishURI );
	}
}