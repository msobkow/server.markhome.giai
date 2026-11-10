// Description: Java 11 implementation of a YCFBam schema.

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

package org.mssycf.mssycf.v2_13.ycfbam.YCFBam;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.Tip.YCFTipClientHandler;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;

public class YCFBamSchema
	implements IYCFBamSchema,
		IYCFSecSchema,
		IYCFIntSchema
{
	protected YCFSecAuthorization authorization;
	protected IYCFSecTablePerms tablePerms;
	protected YCFSecConfigurationFile configuration;
	protected String jndiName;
	protected String schemaDbName = "YCFBam213";
	protected String lowerDbSchemaName = schemaDbName.toLowerCase();

	static HashMap<String,LoaderBehaviourEnum> lookupLoaderBehaviourEnum = null;

	public static LoaderBehaviourEnum parseLoaderBehaviourEnum( String value ) {
		LoaderBehaviourEnum retval = parseLoaderBehaviourEnum( YCFBamSchema.class.getName(), value );
		return( retval );
	}

	public static LoaderBehaviourEnum parseLoaderBehaviourEnum( String fieldOrClassName, String value ) {
		final String S_ProcName = "parseLoaderBehaviourEnum";
		if( lookupLoaderBehaviourEnum == null ) {
			HashMap<String,LoaderBehaviourEnum> newMap = new HashMap<String,LoaderBehaviourEnum>();
			newMap.put( "Insert", LoaderBehaviourEnum.Insert );
			newMap.put( "Update", LoaderBehaviourEnum.Update );
			newMap.put( "Replace", LoaderBehaviourEnum.Replace );
			lookupLoaderBehaviourEnum = newMap;
		}
		LoaderBehaviourEnum retval;
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			retval = null;
		}
		else {
			retval = lookupLoaderBehaviourEnum.get( value );
			if( retval == null ) {
				throw new YCFLibInvalidArgumentException( fieldOrClassName,
					S_ProcName,
					1,
					"value",
					"Invalid enum limb argument " + value );
			}
		}
		return( retval );
	}

	static HashMap<Integer,LoaderBehaviourEnum> lookupOrdinalLoaderBehaviourEnum = null;

	public static LoaderBehaviourEnum ordinalToLoaderBehaviourEnum( String fieldOrClassName, Short value ) {
		LoaderBehaviourEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToLoaderBehaviourEnum( fieldOrClassName, Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static LoaderBehaviourEnum ordinalToLoaderBehaviourEnum( Short value ) {
		LoaderBehaviourEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToLoaderBehaviourEnum( Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static LoaderBehaviourEnum ordinalToLoaderBehaviourEnum( Integer value ) {
		LoaderBehaviourEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToLoaderBehaviourEnum( YCFBamSchema.class.getName(), Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static LoaderBehaviourEnum ordinalToLoaderBehaviourEnum( String fieldOrClassName, Integer value ) {
		final String S_ProcName = "ordinalToLoaderBehaviourEnum";
		if( lookupOrdinalLoaderBehaviourEnum == null ) {
			HashMap<Integer,LoaderBehaviourEnum> newMap = new HashMap<Integer,LoaderBehaviourEnum>();
			newMap.put( Integer.valueOf( LoaderBehaviourEnum.Insert.ordinal() ), LoaderBehaviourEnum.Insert );
			newMap.put( Integer.valueOf( LoaderBehaviourEnum.Update.ordinal() ), LoaderBehaviourEnum.Update );
			newMap.put( Integer.valueOf( LoaderBehaviourEnum.Replace.ordinal() ), LoaderBehaviourEnum.Replace );
			lookupOrdinalLoaderBehaviourEnum = newMap;
		}
		LoaderBehaviourEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = lookupOrdinalLoaderBehaviourEnum.get( value );
			if( retval == null ) {
				throw new YCFLibInvalidArgumentException( fieldOrClassName,
					S_ProcName,
					1,
					"value",
					"Invalid enum ordinal argument " + value.toString() );
			}
		}
		return( retval );
	}

	static HashMap<String,RelationTypeEnum> lookupRelationTypeEnum = null;

	public static RelationTypeEnum parseRelationTypeEnum( String value ) {
		RelationTypeEnum retval = parseRelationTypeEnum( YCFBamSchema.class.getName(), value );
		return( retval );
	}

	public static RelationTypeEnum parseRelationTypeEnum( String fieldOrClassName, String value ) {
		final String S_ProcName = "parseRelationTypeEnum";
		if( lookupRelationTypeEnum == null ) {
			HashMap<String,RelationTypeEnum> newMap = new HashMap<String,RelationTypeEnum>();
			newMap.put( "Unknown", RelationTypeEnum.Unknown );
			newMap.put( "Lookup", RelationTypeEnum.Lookup );
			newMap.put( "Superclass", RelationTypeEnum.Superclass );
			newMap.put( "Container", RelationTypeEnum.Container );
			newMap.put( "Components", RelationTypeEnum.Components );
			newMap.put( "Owner", RelationTypeEnum.Owner );
			newMap.put( "Parent", RelationTypeEnum.Parent );
			newMap.put( "Children", RelationTypeEnum.Children );
			lookupRelationTypeEnum = newMap;
		}
		RelationTypeEnum retval;
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			retval = null;
		}
		else {
			retval = lookupRelationTypeEnum.get( value );
			if( retval == null ) {
				throw new YCFLibInvalidArgumentException( fieldOrClassName,
					S_ProcName,
					1,
					"value",
					"Invalid enum limb argument " + value );
			}
		}
		return( retval );
	}

	static HashMap<Integer,RelationTypeEnum> lookupOrdinalRelationTypeEnum = null;

	public static RelationTypeEnum ordinalToRelationTypeEnum( String fieldOrClassName, Short value ) {
		RelationTypeEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToRelationTypeEnum( fieldOrClassName, Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static RelationTypeEnum ordinalToRelationTypeEnum( Short value ) {
		RelationTypeEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToRelationTypeEnum( Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static RelationTypeEnum ordinalToRelationTypeEnum( Integer value ) {
		RelationTypeEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToRelationTypeEnum( YCFBamSchema.class.getName(), Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static RelationTypeEnum ordinalToRelationTypeEnum( String fieldOrClassName, Integer value ) {
		final String S_ProcName = "ordinalToRelationTypeEnum";
		if( lookupOrdinalRelationTypeEnum == null ) {
			HashMap<Integer,RelationTypeEnum> newMap = new HashMap<Integer,RelationTypeEnum>();
			newMap.put( Integer.valueOf( RelationTypeEnum.Unknown.ordinal() ), RelationTypeEnum.Unknown );
			newMap.put( Integer.valueOf( RelationTypeEnum.Lookup.ordinal() ), RelationTypeEnum.Lookup );
			newMap.put( Integer.valueOf( RelationTypeEnum.Superclass.ordinal() ), RelationTypeEnum.Superclass );
			newMap.put( Integer.valueOf( RelationTypeEnum.Container.ordinal() ), RelationTypeEnum.Container );
			newMap.put( Integer.valueOf( RelationTypeEnum.Components.ordinal() ), RelationTypeEnum.Components );
			newMap.put( Integer.valueOf( RelationTypeEnum.Owner.ordinal() ), RelationTypeEnum.Owner );
			newMap.put( Integer.valueOf( RelationTypeEnum.Parent.ordinal() ), RelationTypeEnum.Parent );
			newMap.put( Integer.valueOf( RelationTypeEnum.Children.ordinal() ), RelationTypeEnum.Children );
			lookupOrdinalRelationTypeEnum = newMap;
		}
		RelationTypeEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = lookupOrdinalRelationTypeEnum.get( value );
			if( retval == null ) {
				throw new YCFLibInvalidArgumentException( fieldOrClassName,
					S_ProcName,
					1,
					"value",
					"Invalid enum ordinal argument " + value.toString() );
			}
		}
		return( retval );
	}

	static HashMap<String,CodeVisibilityEnum> lookupCodeVisibilityEnum = null;

	public static CodeVisibilityEnum parseCodeVisibilityEnum( String value ) {
		CodeVisibilityEnum retval = parseCodeVisibilityEnum( YCFBamSchema.class.getName(), value );
		return( retval );
	}

	public static CodeVisibilityEnum parseCodeVisibilityEnum( String fieldOrClassName, String value ) {
		final String S_ProcName = "parseCodeVisibilityEnum";
		if( lookupCodeVisibilityEnum == null ) {
			HashMap<String,CodeVisibilityEnum> newMap = new HashMap<String,CodeVisibilityEnum>();
			newMap.put( "Public", CodeVisibilityEnum.Public );
			newMap.put( "Protected", CodeVisibilityEnum.Protected );
			newMap.put( "Private", CodeVisibilityEnum.Private );
			lookupCodeVisibilityEnum = newMap;
		}
		CodeVisibilityEnum retval;
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			retval = null;
		}
		else {
			retval = lookupCodeVisibilityEnum.get( value );
			if( retval == null ) {
				throw new YCFLibInvalidArgumentException( fieldOrClassName,
					S_ProcName,
					1,
					"value",
					"Invalid enum limb argument " + value );
			}
		}
		return( retval );
	}

	static HashMap<Integer,CodeVisibilityEnum> lookupOrdinalCodeVisibilityEnum = null;

	public static CodeVisibilityEnum ordinalToCodeVisibilityEnum( String fieldOrClassName, Short value ) {
		CodeVisibilityEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToCodeVisibilityEnum( fieldOrClassName, Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static CodeVisibilityEnum ordinalToCodeVisibilityEnum( Short value ) {
		CodeVisibilityEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToCodeVisibilityEnum( Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static CodeVisibilityEnum ordinalToCodeVisibilityEnum( Integer value ) {
		CodeVisibilityEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToCodeVisibilityEnum( YCFBamSchema.class.getName(), Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static CodeVisibilityEnum ordinalToCodeVisibilityEnum( String fieldOrClassName, Integer value ) {
		final String S_ProcName = "ordinalToCodeVisibilityEnum";
		if( lookupOrdinalCodeVisibilityEnum == null ) {
			HashMap<Integer,CodeVisibilityEnum> newMap = new HashMap<Integer,CodeVisibilityEnum>();
			newMap.put( Integer.valueOf( CodeVisibilityEnum.Public.ordinal() ), CodeVisibilityEnum.Public );
			newMap.put( Integer.valueOf( CodeVisibilityEnum.Protected.ordinal() ), CodeVisibilityEnum.Protected );
			newMap.put( Integer.valueOf( CodeVisibilityEnum.Private.ordinal() ), CodeVisibilityEnum.Private );
			lookupOrdinalCodeVisibilityEnum = newMap;
		}
		CodeVisibilityEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = lookupOrdinalCodeVisibilityEnum.get( value );
			if( retval == null ) {
				throw new YCFLibInvalidArgumentException( fieldOrClassName,
					S_ProcName,
					1,
					"value",
					"Invalid enum ordinal argument " + value.toString() );
			}
		}
		return( retval );
	}

	static HashMap<String,SecScopeEnum> lookupSecScopeEnum = null;

	public static SecScopeEnum parseSecScopeEnum( String value ) {
		SecScopeEnum retval = parseSecScopeEnum( YCFBamSchema.class.getName(), value );
		return( retval );
	}

	public static SecScopeEnum parseSecScopeEnum( String fieldOrClassName, String value ) {
		final String S_ProcName = "parseSecScopeEnum";
		if( lookupSecScopeEnum == null ) {
			HashMap<String,SecScopeEnum> newMap = new HashMap<String,SecScopeEnum>();
			newMap.put( "None", SecScopeEnum.None );
			newMap.put( "System", SecScopeEnum.System );
			newMap.put( "Global", SecScopeEnum.Global );
			newMap.put( "Cluster", SecScopeEnum.Cluster );
			newMap.put( "Tenant", SecScopeEnum.Tenant );
			newMap.put( "SystemGroup", SecScopeEnum.SystemGroup );
			newMap.put( "ClusterGroup", SecScopeEnum.ClusterGroup );
			newMap.put( "TenantGroup", SecScopeEnum.TenantGroup );
			lookupSecScopeEnum = newMap;
		}
		SecScopeEnum retval;
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			retval = null;
		}
		else {
			retval = lookupSecScopeEnum.get( value );
			if( retval == null ) {
				throw new YCFLibInvalidArgumentException( fieldOrClassName,
					S_ProcName,
					1,
					"value",
					"Invalid enum limb argument " + value );
			}
		}
		return( retval );
	}

	static HashMap<Integer,SecScopeEnum> lookupOrdinalSecScopeEnum = null;

	public static SecScopeEnum ordinalToSecScopeEnum( String fieldOrClassName, Short value ) {
		SecScopeEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToSecScopeEnum( fieldOrClassName, Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static SecScopeEnum ordinalToSecScopeEnum( Short value ) {
		SecScopeEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToSecScopeEnum( Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static SecScopeEnum ordinalToSecScopeEnum( Integer value ) {
		SecScopeEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToSecScopeEnum( YCFBamSchema.class.getName(), Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static SecScopeEnum ordinalToSecScopeEnum( String fieldOrClassName, Integer value ) {
		final String S_ProcName = "ordinalToSecScopeEnum";
		if( lookupOrdinalSecScopeEnum == null ) {
			HashMap<Integer,SecScopeEnum> newMap = new HashMap<Integer,SecScopeEnum>();
			newMap.put( Integer.valueOf( SecScopeEnum.None.ordinal() ), SecScopeEnum.None );
			newMap.put( Integer.valueOf( SecScopeEnum.System.ordinal() ), SecScopeEnum.System );
			newMap.put( Integer.valueOf( SecScopeEnum.Global.ordinal() ), SecScopeEnum.Global );
			newMap.put( Integer.valueOf( SecScopeEnum.Cluster.ordinal() ), SecScopeEnum.Cluster );
			newMap.put( Integer.valueOf( SecScopeEnum.Tenant.ordinal() ), SecScopeEnum.Tenant );
			newMap.put( Integer.valueOf( SecScopeEnum.SystemGroup.ordinal() ), SecScopeEnum.SystemGroup );
			newMap.put( Integer.valueOf( SecScopeEnum.ClusterGroup.ordinal() ), SecScopeEnum.ClusterGroup );
			newMap.put( Integer.valueOf( SecScopeEnum.TenantGroup.ordinal() ), SecScopeEnum.TenantGroup );
			lookupOrdinalSecScopeEnum = newMap;
		}
		SecScopeEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = lookupOrdinalSecScopeEnum.get( value );
			if( retval == null ) {
				throw new YCFLibInvalidArgumentException( fieldOrClassName,
					S_ProcName,
					1,
					"value",
					"Invalid enum ordinal argument " + value.toString() );
			}
		}
		return( retval );
	}

	static HashMap<String,RoleScopeEnum> lookupRoleScopeEnum = null;

	public static RoleScopeEnum parseRoleScopeEnum( String value ) {
		RoleScopeEnum retval = parseRoleScopeEnum( YCFBamSchema.class.getName(), value );
		return( retval );
	}

	public static RoleScopeEnum parseRoleScopeEnum( String fieldOrClassName, String value ) {
		final String S_ProcName = "parseRoleScopeEnum";
		if( lookupRoleScopeEnum == null ) {
			HashMap<String,RoleScopeEnum> newMap = new HashMap<String,RoleScopeEnum>();
			newMap.put( "SysRole", RoleScopeEnum.SysRole );
			newMap.put( "ClusRole", RoleScopeEnum.ClusRole );
			newMap.put( "TentRole", RoleScopeEnum.TentRole );
			lookupRoleScopeEnum = newMap;
		}
		RoleScopeEnum retval;
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			retval = null;
		}
		else {
			retval = lookupRoleScopeEnum.get( value );
			if( retval == null ) {
				throw new YCFLibInvalidArgumentException( fieldOrClassName,
					S_ProcName,
					1,
					"value",
					"Invalid enum limb argument " + value );
			}
		}
		return( retval );
	}

	static HashMap<Integer,RoleScopeEnum> lookupOrdinalRoleScopeEnum = null;

	public static RoleScopeEnum ordinalToRoleScopeEnum( String fieldOrClassName, Short value ) {
		RoleScopeEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToRoleScopeEnum( fieldOrClassName, Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static RoleScopeEnum ordinalToRoleScopeEnum( Short value ) {
		RoleScopeEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToRoleScopeEnum( Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static RoleScopeEnum ordinalToRoleScopeEnum( Integer value ) {
		RoleScopeEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToRoleScopeEnum( YCFBamSchema.class.getName(), Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static RoleScopeEnum ordinalToRoleScopeEnum( String fieldOrClassName, Integer value ) {
		final String S_ProcName = "ordinalToRoleScopeEnum";
		if( lookupOrdinalRoleScopeEnum == null ) {
			HashMap<Integer,RoleScopeEnum> newMap = new HashMap<Integer,RoleScopeEnum>();
			newMap.put( Integer.valueOf( RoleScopeEnum.SysRole.ordinal() ), RoleScopeEnum.SysRole );
			newMap.put( Integer.valueOf( RoleScopeEnum.ClusRole.ordinal() ), RoleScopeEnum.ClusRole );
			newMap.put( Integer.valueOf( RoleScopeEnum.TentRole.ordinal() ), RoleScopeEnum.TentRole );
			lookupOrdinalRoleScopeEnum = newMap;
		}
		RoleScopeEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = lookupOrdinalRoleScopeEnum.get( value );
			if( retval == null ) {
				throw new YCFLibInvalidArgumentException( fieldOrClassName,
					S_ProcName,
					1,
					"value",
					"Invalid enum ordinal argument " + value.toString() );
			}
		}
		return( retval );
	}

	protected IYCFBamAtomTable tableAtom;
	protected IYCFBamBlobColTable tableBlobCol;
	protected IYCFBamBlobDefTable tableBlobDef;
	protected IYCFBamBlobTypeTable tableBlobType;
	protected IYCFBamBoolColTable tableBoolCol;
	protected IYCFBamBoolDefTable tableBoolDef;
	protected IYCFBamBoolTypeTable tableBoolType;
	protected IYCFBamChainTable tableChain;
	protected IYCFBamClearDepTable tableClearDep;
	protected IYCFBamClearSubDep1Table tableClearSubDep1;
	protected IYCFBamClearSubDep2Table tableClearSubDep2;
	protected IYCFBamClearSubDep3Table tableClearSubDep3;
	protected IYCFBamClearTopDepTable tableClearTopDep;
	protected IYCFSecClusterTable tableCluster;
	protected IYCFBamDateColTable tableDateCol;
	protected IYCFBamDateDefTable tableDateDef;
	protected IYCFBamDateTypeTable tableDateType;
	protected IYCFBamDbKeyHash128ColTable tableDbKeyHash128Col;
	protected IYCFBamDbKeyHash128DefTable tableDbKeyHash128Def;
	protected IYCFBamDbKeyHash128GenTable tableDbKeyHash128Gen;
	protected IYCFBamDbKeyHash128TypeTable tableDbKeyHash128Type;
	protected IYCFBamDbKeyHash160ColTable tableDbKeyHash160Col;
	protected IYCFBamDbKeyHash160DefTable tableDbKeyHash160Def;
	protected IYCFBamDbKeyHash160GenTable tableDbKeyHash160Gen;
	protected IYCFBamDbKeyHash160TypeTable tableDbKeyHash160Type;
	protected IYCFBamDbKeyHash224ColTable tableDbKeyHash224Col;
	protected IYCFBamDbKeyHash224DefTable tableDbKeyHash224Def;
	protected IYCFBamDbKeyHash224GenTable tableDbKeyHash224Gen;
	protected IYCFBamDbKeyHash224TypeTable tableDbKeyHash224Type;
	protected IYCFBamDbKeyHash256ColTable tableDbKeyHash256Col;
	protected IYCFBamDbKeyHash256DefTable tableDbKeyHash256Def;
	protected IYCFBamDbKeyHash256GenTable tableDbKeyHash256Gen;
	protected IYCFBamDbKeyHash256TypeTable tableDbKeyHash256Type;
	protected IYCFBamDbKeyHash384ColTable tableDbKeyHash384Col;
	protected IYCFBamDbKeyHash384DefTable tableDbKeyHash384Def;
	protected IYCFBamDbKeyHash384GenTable tableDbKeyHash384Gen;
	protected IYCFBamDbKeyHash384TypeTable tableDbKeyHash384Type;
	protected IYCFBamDbKeyHash512ColTable tableDbKeyHash512Col;
	protected IYCFBamDbKeyHash512DefTable tableDbKeyHash512Def;
	protected IYCFBamDbKeyHash512GenTable tableDbKeyHash512Gen;
	protected IYCFBamDbKeyHash512TypeTable tableDbKeyHash512Type;
	protected IYCFBamDelDepTable tableDelDep;
	protected IYCFBamDelSubDep1Table tableDelSubDep1;
	protected IYCFBamDelSubDep2Table tableDelSubDep2;
	protected IYCFBamDelSubDep3Table tableDelSubDep3;
	protected IYCFBamDelTopDepTable tableDelTopDep;
	protected IYCFBamDoubleColTable tableDoubleCol;
	protected IYCFBamDoubleDefTable tableDoubleDef;
	protected IYCFBamDoubleTypeTable tableDoubleType;
	protected IYCFBamEnumDefTable tableEnumDef;
	protected IYCFBamEnumTagTable tableEnumTag;
	protected IYCFBamEnumTypeTable tableEnumType;
	protected IYCFBamFloatColTable tableFloatCol;
	protected IYCFBamFloatDefTable tableFloatDef;
	protected IYCFBamFloatTypeTable tableFloatType;
	protected IYCFSecHostNodeTable tableHostNode;
	protected IYCFSecISOCcyTable tableISOCcy;
	protected IYCFSecISOCtryTable tableISOCtry;
	protected IYCFSecISOCtryCcyTable tableISOCtryCcy;
	protected IYCFSecISOCtryLangTable tableISOCtryLang;
	protected IYCFSecISOLangTable tableISOLang;
	protected IYCFSecISOTZoneTable tableISOTZone;
	protected IYCFBamId16GenTable tableId16Gen;
	protected IYCFBamId32GenTable tableId32Gen;
	protected IYCFBamId64GenTable tableId64Gen;
	protected IYCFBamIndexTable tableIndex;
	protected IYCFBamIndexColTable tableIndexCol;
	protected IYCFBamIndexTweakTable tableIndexTweak;
	protected IYCFBamInt16ColTable tableInt16Col;
	protected IYCFBamInt16DefTable tableInt16Def;
	protected IYCFBamInt16TypeTable tableInt16Type;
	protected IYCFBamInt32ColTable tableInt32Col;
	protected IYCFBamInt32DefTable tableInt32Def;
	protected IYCFBamInt32TypeTable tableInt32Type;
	protected IYCFBamInt64ColTable tableInt64Col;
	protected IYCFBamInt64DefTable tableInt64Def;
	protected IYCFBamInt64TypeTable tableInt64Type;
	protected IYCFIntLicenseTable tableLicense;
	protected IYCFIntMajorVersionTable tableMajorVersion;
	protected IYCFIntMimeTypeTable tableMimeType;
	protected IYCFIntMinorVersionTable tableMinorVersion;
	protected IYCFBamNmTokenColTable tableNmTokenCol;
	protected IYCFBamNmTokenDefTable tableNmTokenDef;
	protected IYCFBamNmTokenTypeTable tableNmTokenType;
	protected IYCFBamNmTokensColTable tableNmTokensCol;
	protected IYCFBamNmTokensDefTable tableNmTokensDef;
	protected IYCFBamNmTokensTypeTable tableNmTokensType;
	protected IYCFBamNumberColTable tableNumberCol;
	protected IYCFBamNumberDefTable tableNumberDef;
	protected IYCFBamNumberTypeTable tableNumberType;
	protected IYCFBamParamTable tableParam;
	protected IYCFBamPopDepTable tablePopDep;
	protected IYCFBamPopSubDep1Table tablePopSubDep1;
	protected IYCFBamPopSubDep2Table tablePopSubDep2;
	protected IYCFBamPopSubDep3Table tablePopSubDep3;
	protected IYCFBamPopTopDepTable tablePopTopDep;
	protected IYCFBamRelationTable tableRelation;
	protected IYCFBamRelationColTable tableRelationCol;
	protected IYCFBamRoleDefTable tableRoleDef;
	protected IYCFBamSchemaDefTable tableSchemaDef;
	protected IYCFBamSchemaRefTable tableSchemaRef;
	protected IYCFBamSchemaRoleTable tableSchemaRole;
	protected IYCFBamSchemaTweakTable tableSchemaTweak;
	protected IYCFBamScopeTable tableScope;
	protected IYCFSecSecAppTable tableSecApp;
	protected IYCFSecSecDeviceTable tableSecDevice;
	protected IYCFSecSecFormTable tableSecForm;
	protected IYCFSecSecGroupTable tableSecGroup;
	protected IYCFSecSecGroupFormTable tableSecGroupForm;
	protected IYCFSecSecGrpIncTable tableSecGrpInc;
	protected IYCFSecSecGrpMembTable tableSecGrpMemb;
	protected IYCFSecSecSessionTable tableSecSession;
	protected IYCFSecSecUserTable tableSecUser;
	protected IYCFBamServerListFuncTable tableServerListFunc;
	protected IYCFBamServerMethodTable tableServerMethod;
	protected IYCFBamServerObjFuncTable tableServerObjFunc;
	protected IYCFBamServerProcTable tableServerProc;
	protected IYCFSecServiceTable tableService;
	protected IYCFSecServiceTypeTable tableServiceType;
	protected IYCFBamStringColTable tableStringCol;
	protected IYCFBamStringDefTable tableStringDef;
	protected IYCFBamStringTypeTable tableStringType;
	protected IYCFIntSubProjectTable tableSubProject;
	protected IYCFSecSysClusterTable tableSysCluster;
	protected IYCFSecTSecGroupTable tableTSecGroup;
	protected IYCFSecTSecGrpIncTable tableTSecGrpInc;
	protected IYCFSecTSecGrpMembTable tableTSecGrpMemb;
	protected IYCFBamTZDateColTable tableTZDateCol;
	protected IYCFBamTZDateDefTable tableTZDateDef;
	protected IYCFBamTZDateTypeTable tableTZDateType;
	protected IYCFBamTZTimeColTable tableTZTimeCol;
	protected IYCFBamTZTimeDefTable tableTZTimeDef;
	protected IYCFBamTZTimeTypeTable tableTZTimeType;
	protected IYCFBamTZTimestampColTable tableTZTimestampCol;
	protected IYCFBamTZTimestampDefTable tableTZTimestampDef;
	protected IYCFBamTZTimestampTypeTable tableTZTimestampType;
	protected IYCFBamTableTable tableTable;
	protected IYCFBamTableColTable tableTableCol;
	protected IYCFBamTableTweakTable tableTableTweak;
	protected IYCFSecTenantTable tableTenant;
	protected IYCFBamTextColTable tableTextCol;
	protected IYCFBamTextDefTable tableTextDef;
	protected IYCFBamTextTypeTable tableTextType;
	protected IYCFBamTimeColTable tableTimeCol;
	protected IYCFBamTimeDefTable tableTimeDef;
	protected IYCFBamTimeTypeTable tableTimeType;
	protected IYCFBamTimestampColTable tableTimestampCol;
	protected IYCFBamTimestampDefTable tableTimestampDef;
	protected IYCFBamTimestampTypeTable tableTimestampType;
	protected IYCFIntTldTable tableTld;
	protected IYCFBamTokenColTable tableTokenCol;
	protected IYCFBamTokenDefTable tableTokenDef;
	protected IYCFBamTokenTypeTable tableTokenType;
	protected IYCFIntTopDomainTable tableTopDomain;
	protected IYCFIntTopProjectTable tableTopProject;
	protected IYCFBamTweakTable tableTweak;
	protected IYCFBamUInt16ColTable tableUInt16Col;
	protected IYCFBamUInt16DefTable tableUInt16Def;
	protected IYCFBamUInt16TypeTable tableUInt16Type;
	protected IYCFBamUInt32ColTable tableUInt32Col;
	protected IYCFBamUInt32DefTable tableUInt32Def;
	protected IYCFBamUInt32TypeTable tableUInt32Type;
	protected IYCFBamUInt64ColTable tableUInt64Col;
	protected IYCFBamUInt64DefTable tableUInt64Def;
	protected IYCFBamUInt64TypeTable tableUInt64Type;
	protected IYCFIntURLProtocolTable tableURLProtocol;
	protected IYCFBamUuid6ColTable tableUuid6Col;
	protected IYCFBamUuid6DefTable tableUuid6Def;
	protected IYCFBamUuid6GenTable tableUuid6Gen;
	protected IYCFBamUuid6TypeTable tableUuid6Type;
	protected IYCFBamUuidColTable tableUuidCol;
	protected IYCFBamUuidDefTable tableUuidDef;
	protected IYCFBamUuidGenTable tableUuidGen;
	protected IYCFBamUuidTypeTable tableUuidType;
	protected IYCFBamValueTable tableValue;

	protected IYCFBamAtomFactory factoryAtom;
	protected IYCFBamBlobColFactory factoryBlobCol;
	protected IYCFBamBlobDefFactory factoryBlobDef;
	protected IYCFBamBlobTypeFactory factoryBlobType;
	protected IYCFBamBoolColFactory factoryBoolCol;
	protected IYCFBamBoolDefFactory factoryBoolDef;
	protected IYCFBamBoolTypeFactory factoryBoolType;
	protected IYCFBamChainFactory factoryChain;
	protected IYCFBamClearDepFactory factoryClearDep;
	protected IYCFBamClearSubDep1Factory factoryClearSubDep1;
	protected IYCFBamClearSubDep2Factory factoryClearSubDep2;
	protected IYCFBamClearSubDep3Factory factoryClearSubDep3;
	protected IYCFBamClearTopDepFactory factoryClearTopDep;
	protected IYCFSecClusterFactory factoryCluster;
	protected IYCFBamDateColFactory factoryDateCol;
	protected IYCFBamDateDefFactory factoryDateDef;
	protected IYCFBamDateTypeFactory factoryDateType;
	protected IYCFBamDbKeyHash128ColFactory factoryDbKeyHash128Col;
	protected IYCFBamDbKeyHash128DefFactory factoryDbKeyHash128Def;
	protected IYCFBamDbKeyHash128GenFactory factoryDbKeyHash128Gen;
	protected IYCFBamDbKeyHash128TypeFactory factoryDbKeyHash128Type;
	protected IYCFBamDbKeyHash160ColFactory factoryDbKeyHash160Col;
	protected IYCFBamDbKeyHash160DefFactory factoryDbKeyHash160Def;
	protected IYCFBamDbKeyHash160GenFactory factoryDbKeyHash160Gen;
	protected IYCFBamDbKeyHash160TypeFactory factoryDbKeyHash160Type;
	protected IYCFBamDbKeyHash224ColFactory factoryDbKeyHash224Col;
	protected IYCFBamDbKeyHash224DefFactory factoryDbKeyHash224Def;
	protected IYCFBamDbKeyHash224GenFactory factoryDbKeyHash224Gen;
	protected IYCFBamDbKeyHash224TypeFactory factoryDbKeyHash224Type;
	protected IYCFBamDbKeyHash256ColFactory factoryDbKeyHash256Col;
	protected IYCFBamDbKeyHash256DefFactory factoryDbKeyHash256Def;
	protected IYCFBamDbKeyHash256GenFactory factoryDbKeyHash256Gen;
	protected IYCFBamDbKeyHash256TypeFactory factoryDbKeyHash256Type;
	protected IYCFBamDbKeyHash384ColFactory factoryDbKeyHash384Col;
	protected IYCFBamDbKeyHash384DefFactory factoryDbKeyHash384Def;
	protected IYCFBamDbKeyHash384GenFactory factoryDbKeyHash384Gen;
	protected IYCFBamDbKeyHash384TypeFactory factoryDbKeyHash384Type;
	protected IYCFBamDbKeyHash512ColFactory factoryDbKeyHash512Col;
	protected IYCFBamDbKeyHash512DefFactory factoryDbKeyHash512Def;
	protected IYCFBamDbKeyHash512GenFactory factoryDbKeyHash512Gen;
	protected IYCFBamDbKeyHash512TypeFactory factoryDbKeyHash512Type;
	protected IYCFBamDelDepFactory factoryDelDep;
	protected IYCFBamDelSubDep1Factory factoryDelSubDep1;
	protected IYCFBamDelSubDep2Factory factoryDelSubDep2;
	protected IYCFBamDelSubDep3Factory factoryDelSubDep3;
	protected IYCFBamDelTopDepFactory factoryDelTopDep;
	protected IYCFBamDoubleColFactory factoryDoubleCol;
	protected IYCFBamDoubleDefFactory factoryDoubleDef;
	protected IYCFBamDoubleTypeFactory factoryDoubleType;
	protected IYCFBamEnumDefFactory factoryEnumDef;
	protected IYCFBamEnumTagFactory factoryEnumTag;
	protected IYCFBamEnumTypeFactory factoryEnumType;
	protected IYCFBamFloatColFactory factoryFloatCol;
	protected IYCFBamFloatDefFactory factoryFloatDef;
	protected IYCFBamFloatTypeFactory factoryFloatType;
	protected IYCFSecHostNodeFactory factoryHostNode;
	protected IYCFSecISOCcyFactory factoryISOCcy;
	protected IYCFSecISOCtryFactory factoryISOCtry;
	protected IYCFSecISOCtryCcyFactory factoryISOCtryCcy;
	protected IYCFSecISOCtryLangFactory factoryISOCtryLang;
	protected IYCFSecISOLangFactory factoryISOLang;
	protected IYCFSecISOTZoneFactory factoryISOTZone;
	protected IYCFBamId16GenFactory factoryId16Gen;
	protected IYCFBamId32GenFactory factoryId32Gen;
	protected IYCFBamId64GenFactory factoryId64Gen;
	protected IYCFBamIndexFactory factoryIndex;
	protected IYCFBamIndexColFactory factoryIndexCol;
	protected IYCFBamIndexTweakFactory factoryIndexTweak;
	protected IYCFBamInt16ColFactory factoryInt16Col;
	protected IYCFBamInt16DefFactory factoryInt16Def;
	protected IYCFBamInt16TypeFactory factoryInt16Type;
	protected IYCFBamInt32ColFactory factoryInt32Col;
	protected IYCFBamInt32DefFactory factoryInt32Def;
	protected IYCFBamInt32TypeFactory factoryInt32Type;
	protected IYCFBamInt64ColFactory factoryInt64Col;
	protected IYCFBamInt64DefFactory factoryInt64Def;
	protected IYCFBamInt64TypeFactory factoryInt64Type;
	protected IYCFIntLicenseFactory factoryLicense;
	protected IYCFIntMajorVersionFactory factoryMajorVersion;
	protected IYCFIntMimeTypeFactory factoryMimeType;
	protected IYCFIntMinorVersionFactory factoryMinorVersion;
	protected IYCFBamNmTokenColFactory factoryNmTokenCol;
	protected IYCFBamNmTokenDefFactory factoryNmTokenDef;
	protected IYCFBamNmTokenTypeFactory factoryNmTokenType;
	protected IYCFBamNmTokensColFactory factoryNmTokensCol;
	protected IYCFBamNmTokensDefFactory factoryNmTokensDef;
	protected IYCFBamNmTokensTypeFactory factoryNmTokensType;
	protected IYCFBamNumberColFactory factoryNumberCol;
	protected IYCFBamNumberDefFactory factoryNumberDef;
	protected IYCFBamNumberTypeFactory factoryNumberType;
	protected IYCFBamParamFactory factoryParam;
	protected IYCFBamPopDepFactory factoryPopDep;
	protected IYCFBamPopSubDep1Factory factoryPopSubDep1;
	protected IYCFBamPopSubDep2Factory factoryPopSubDep2;
	protected IYCFBamPopSubDep3Factory factoryPopSubDep3;
	protected IYCFBamPopTopDepFactory factoryPopTopDep;
	protected IYCFBamRelationFactory factoryRelation;
	protected IYCFBamRelationColFactory factoryRelationCol;
	protected IYCFBamRoleDefFactory factoryRoleDef;
	protected IYCFBamSchemaDefFactory factorySchemaDef;
	protected IYCFBamSchemaRefFactory factorySchemaRef;
	protected IYCFBamSchemaRoleFactory factorySchemaRole;
	protected IYCFBamSchemaTweakFactory factorySchemaTweak;
	protected IYCFBamScopeFactory factoryScope;
	protected IYCFSecSecAppFactory factorySecApp;
	protected IYCFSecSecDeviceFactory factorySecDevice;
	protected IYCFSecSecFormFactory factorySecForm;
	protected IYCFSecSecGroupFactory factorySecGroup;
	protected IYCFSecSecGroupFormFactory factorySecGroupForm;
	protected IYCFSecSecGrpIncFactory factorySecGrpInc;
	protected IYCFSecSecGrpMembFactory factorySecGrpMemb;
	protected IYCFSecSecSessionFactory factorySecSession;
	protected IYCFSecSecUserFactory factorySecUser;
	protected IYCFBamServerListFuncFactory factoryServerListFunc;
	protected IYCFBamServerMethodFactory factoryServerMethod;
	protected IYCFBamServerObjFuncFactory factoryServerObjFunc;
	protected IYCFBamServerProcFactory factoryServerProc;
	protected IYCFSecServiceFactory factoryService;
	protected IYCFSecServiceTypeFactory factoryServiceType;
	protected IYCFBamStringColFactory factoryStringCol;
	protected IYCFBamStringDefFactory factoryStringDef;
	protected IYCFBamStringTypeFactory factoryStringType;
	protected IYCFIntSubProjectFactory factorySubProject;
	protected IYCFSecSysClusterFactory factorySysCluster;
	protected IYCFSecTSecGroupFactory factoryTSecGroup;
	protected IYCFSecTSecGrpIncFactory factoryTSecGrpInc;
	protected IYCFSecTSecGrpMembFactory factoryTSecGrpMemb;
	protected IYCFBamTZDateColFactory factoryTZDateCol;
	protected IYCFBamTZDateDefFactory factoryTZDateDef;
	protected IYCFBamTZDateTypeFactory factoryTZDateType;
	protected IYCFBamTZTimeColFactory factoryTZTimeCol;
	protected IYCFBamTZTimeDefFactory factoryTZTimeDef;
	protected IYCFBamTZTimeTypeFactory factoryTZTimeType;
	protected IYCFBamTZTimestampColFactory factoryTZTimestampCol;
	protected IYCFBamTZTimestampDefFactory factoryTZTimestampDef;
	protected IYCFBamTZTimestampTypeFactory factoryTZTimestampType;
	protected IYCFBamTableFactory factoryTable;
	protected IYCFBamTableColFactory factoryTableCol;
	protected IYCFBamTableTweakFactory factoryTableTweak;
	protected IYCFSecTenantFactory factoryTenant;
	protected IYCFBamTextColFactory factoryTextCol;
	protected IYCFBamTextDefFactory factoryTextDef;
	protected IYCFBamTextTypeFactory factoryTextType;
	protected IYCFBamTimeColFactory factoryTimeCol;
	protected IYCFBamTimeDefFactory factoryTimeDef;
	protected IYCFBamTimeTypeFactory factoryTimeType;
	protected IYCFBamTimestampColFactory factoryTimestampCol;
	protected IYCFBamTimestampDefFactory factoryTimestampDef;
	protected IYCFBamTimestampTypeFactory factoryTimestampType;
	protected IYCFIntTldFactory factoryTld;
	protected IYCFBamTokenColFactory factoryTokenCol;
	protected IYCFBamTokenDefFactory factoryTokenDef;
	protected IYCFBamTokenTypeFactory factoryTokenType;
	protected IYCFIntTopDomainFactory factoryTopDomain;
	protected IYCFIntTopProjectFactory factoryTopProject;
	protected IYCFBamTweakFactory factoryTweak;
	protected IYCFBamUInt16ColFactory factoryUInt16Col;
	protected IYCFBamUInt16DefFactory factoryUInt16Def;
	protected IYCFBamUInt16TypeFactory factoryUInt16Type;
	protected IYCFBamUInt32ColFactory factoryUInt32Col;
	protected IYCFBamUInt32DefFactory factoryUInt32Def;
	protected IYCFBamUInt32TypeFactory factoryUInt32Type;
	protected IYCFBamUInt64ColFactory factoryUInt64Col;
	protected IYCFBamUInt64DefFactory factoryUInt64Def;
	protected IYCFBamUInt64TypeFactory factoryUInt64Type;
	protected IYCFIntURLProtocolFactory factoryURLProtocol;
	protected IYCFBamUuid6ColFactory factoryUuid6Col;
	protected IYCFBamUuid6DefFactory factoryUuid6Def;
	protected IYCFBamUuid6GenFactory factoryUuid6Gen;
	protected IYCFBamUuid6TypeFactory factoryUuid6Type;
	protected IYCFBamUuidColFactory factoryUuidCol;
	protected IYCFBamUuidDefFactory factoryUuidDef;
	protected IYCFBamUuidGenFactory factoryUuidGen;
	protected IYCFBamUuidTypeFactory factoryUuidType;
	protected IYCFBamValueFactory factoryValue;


	public YCFBamSchema() {
		configuration = null;
		jndiName = null;

		tableAtom = null;
		tableBlobCol = null;
		tableBlobDef = null;
		tableBlobType = null;
		tableBoolCol = null;
		tableBoolDef = null;
		tableBoolType = null;
		tableChain = null;
		tableClearDep = null;
		tableClearSubDep1 = null;
		tableClearSubDep2 = null;
		tableClearSubDep3 = null;
		tableClearTopDep = null;
		tableCluster = null;
		tableDateCol = null;
		tableDateDef = null;
		tableDateType = null;
		tableDbKeyHash128Col = null;
		tableDbKeyHash128Def = null;
		tableDbKeyHash128Gen = null;
		tableDbKeyHash128Type = null;
		tableDbKeyHash160Col = null;
		tableDbKeyHash160Def = null;
		tableDbKeyHash160Gen = null;
		tableDbKeyHash160Type = null;
		tableDbKeyHash224Col = null;
		tableDbKeyHash224Def = null;
		tableDbKeyHash224Gen = null;
		tableDbKeyHash224Type = null;
		tableDbKeyHash256Col = null;
		tableDbKeyHash256Def = null;
		tableDbKeyHash256Gen = null;
		tableDbKeyHash256Type = null;
		tableDbKeyHash384Col = null;
		tableDbKeyHash384Def = null;
		tableDbKeyHash384Gen = null;
		tableDbKeyHash384Type = null;
		tableDbKeyHash512Col = null;
		tableDbKeyHash512Def = null;
		tableDbKeyHash512Gen = null;
		tableDbKeyHash512Type = null;
		tableDelDep = null;
		tableDelSubDep1 = null;
		tableDelSubDep2 = null;
		tableDelSubDep3 = null;
		tableDelTopDep = null;
		tableDoubleCol = null;
		tableDoubleDef = null;
		tableDoubleType = null;
		tableEnumDef = null;
		tableEnumTag = null;
		tableEnumType = null;
		tableFloatCol = null;
		tableFloatDef = null;
		tableFloatType = null;
		tableHostNode = null;
		tableISOCcy = null;
		tableISOCtry = null;
		tableISOCtryCcy = null;
		tableISOCtryLang = null;
		tableISOLang = null;
		tableISOTZone = null;
		tableId16Gen = null;
		tableId32Gen = null;
		tableId64Gen = null;
		tableIndex = null;
		tableIndexCol = null;
		tableIndexTweak = null;
		tableInt16Col = null;
		tableInt16Def = null;
		tableInt16Type = null;
		tableInt32Col = null;
		tableInt32Def = null;
		tableInt32Type = null;
		tableInt64Col = null;
		tableInt64Def = null;
		tableInt64Type = null;
		tableLicense = null;
		tableMajorVersion = null;
		tableMimeType = null;
		tableMinorVersion = null;
		tableNmTokenCol = null;
		tableNmTokenDef = null;
		tableNmTokenType = null;
		tableNmTokensCol = null;
		tableNmTokensDef = null;
		tableNmTokensType = null;
		tableNumberCol = null;
		tableNumberDef = null;
		tableNumberType = null;
		tableParam = null;
		tablePopDep = null;
		tablePopSubDep1 = null;
		tablePopSubDep2 = null;
		tablePopSubDep3 = null;
		tablePopTopDep = null;
		tableRelation = null;
		tableRelationCol = null;
		tableRoleDef = null;
		tableSchemaDef = null;
		tableSchemaRef = null;
		tableSchemaRole = null;
		tableSchemaTweak = null;
		tableScope = null;
		tableSecApp = null;
		tableSecDevice = null;
		tableSecForm = null;
		tableSecGroup = null;
		tableSecGroupForm = null;
		tableSecGrpInc = null;
		tableSecGrpMemb = null;
		tableSecSession = null;
		tableSecUser = null;
		tableServerListFunc = null;
		tableServerMethod = null;
		tableServerObjFunc = null;
		tableServerProc = null;
		tableService = null;
		tableServiceType = null;
		tableStringCol = null;
		tableStringDef = null;
		tableStringType = null;
		tableSubProject = null;
		tableSysCluster = null;
		tableTSecGroup = null;
		tableTSecGrpInc = null;
		tableTSecGrpMemb = null;
		tableTZDateCol = null;
		tableTZDateDef = null;
		tableTZDateType = null;
		tableTZTimeCol = null;
		tableTZTimeDef = null;
		tableTZTimeType = null;
		tableTZTimestampCol = null;
		tableTZTimestampDef = null;
		tableTZTimestampType = null;
		tableTable = null;
		tableTableCol = null;
		tableTableTweak = null;
		tableTenant = null;
		tableTextCol = null;
		tableTextDef = null;
		tableTextType = null;
		tableTimeCol = null;
		tableTimeDef = null;
		tableTimeType = null;
		tableTimestampCol = null;
		tableTimestampDef = null;
		tableTimestampType = null;
		tableTld = null;
		tableTokenCol = null;
		tableTokenDef = null;
		tableTokenType = null;
		tableTopDomain = null;
		tableTopProject = null;
		tableTweak = null;
		tableUInt16Col = null;
		tableUInt16Def = null;
		tableUInt16Type = null;
		tableUInt32Col = null;
		tableUInt32Def = null;
		tableUInt32Type = null;
		tableUInt64Col = null;
		tableUInt64Def = null;
		tableUInt64Type = null;
		tableURLProtocol = null;
		tableUuid6Col = null;
		tableUuid6Def = null;
		tableUuid6Gen = null;
		tableUuid6Type = null;
		tableUuidCol = null;
		tableUuidDef = null;
		tableUuidGen = null;
		tableUuidType = null;
		tableValue = null;

		factoryAtom = new YCFBamAtomDefaultFactory();
		factoryBlobCol = new YCFBamBlobColDefaultFactory();
		factoryBlobDef = new YCFBamBlobDefDefaultFactory();
		factoryBlobType = new YCFBamBlobTypeDefaultFactory();
		factoryBoolCol = new YCFBamBoolColDefaultFactory();
		factoryBoolDef = new YCFBamBoolDefDefaultFactory();
		factoryBoolType = new YCFBamBoolTypeDefaultFactory();
		factoryChain = new YCFBamChainDefaultFactory();
		factoryClearDep = new YCFBamClearDepDefaultFactory();
		factoryClearSubDep1 = new YCFBamClearSubDep1DefaultFactory();
		factoryClearSubDep2 = new YCFBamClearSubDep2DefaultFactory();
		factoryClearSubDep3 = new YCFBamClearSubDep3DefaultFactory();
		factoryClearTopDep = new YCFBamClearTopDepDefaultFactory();
		factoryCluster = new YCFBamClusterDefaultFactory();
		factoryDateCol = new YCFBamDateColDefaultFactory();
		factoryDateDef = new YCFBamDateDefDefaultFactory();
		factoryDateType = new YCFBamDateTypeDefaultFactory();
		factoryDbKeyHash128Col = new YCFBamDbKeyHash128ColDefaultFactory();
		factoryDbKeyHash128Def = new YCFBamDbKeyHash128DefDefaultFactory();
		factoryDbKeyHash128Gen = new YCFBamDbKeyHash128GenDefaultFactory();
		factoryDbKeyHash128Type = new YCFBamDbKeyHash128TypeDefaultFactory();
		factoryDbKeyHash160Col = new YCFBamDbKeyHash160ColDefaultFactory();
		factoryDbKeyHash160Def = new YCFBamDbKeyHash160DefDefaultFactory();
		factoryDbKeyHash160Gen = new YCFBamDbKeyHash160GenDefaultFactory();
		factoryDbKeyHash160Type = new YCFBamDbKeyHash160TypeDefaultFactory();
		factoryDbKeyHash224Col = new YCFBamDbKeyHash224ColDefaultFactory();
		factoryDbKeyHash224Def = new YCFBamDbKeyHash224DefDefaultFactory();
		factoryDbKeyHash224Gen = new YCFBamDbKeyHash224GenDefaultFactory();
		factoryDbKeyHash224Type = new YCFBamDbKeyHash224TypeDefaultFactory();
		factoryDbKeyHash256Col = new YCFBamDbKeyHash256ColDefaultFactory();
		factoryDbKeyHash256Def = new YCFBamDbKeyHash256DefDefaultFactory();
		factoryDbKeyHash256Gen = new YCFBamDbKeyHash256GenDefaultFactory();
		factoryDbKeyHash256Type = new YCFBamDbKeyHash256TypeDefaultFactory();
		factoryDbKeyHash384Col = new YCFBamDbKeyHash384ColDefaultFactory();
		factoryDbKeyHash384Def = new YCFBamDbKeyHash384DefDefaultFactory();
		factoryDbKeyHash384Gen = new YCFBamDbKeyHash384GenDefaultFactory();
		factoryDbKeyHash384Type = new YCFBamDbKeyHash384TypeDefaultFactory();
		factoryDbKeyHash512Col = new YCFBamDbKeyHash512ColDefaultFactory();
		factoryDbKeyHash512Def = new YCFBamDbKeyHash512DefDefaultFactory();
		factoryDbKeyHash512Gen = new YCFBamDbKeyHash512GenDefaultFactory();
		factoryDbKeyHash512Type = new YCFBamDbKeyHash512TypeDefaultFactory();
		factoryDelDep = new YCFBamDelDepDefaultFactory();
		factoryDelSubDep1 = new YCFBamDelSubDep1DefaultFactory();
		factoryDelSubDep2 = new YCFBamDelSubDep2DefaultFactory();
		factoryDelSubDep3 = new YCFBamDelSubDep3DefaultFactory();
		factoryDelTopDep = new YCFBamDelTopDepDefaultFactory();
		factoryDoubleCol = new YCFBamDoubleColDefaultFactory();
		factoryDoubleDef = new YCFBamDoubleDefDefaultFactory();
		factoryDoubleType = new YCFBamDoubleTypeDefaultFactory();
		factoryEnumDef = new YCFBamEnumDefDefaultFactory();
		factoryEnumTag = new YCFBamEnumTagDefaultFactory();
		factoryEnumType = new YCFBamEnumTypeDefaultFactory();
		factoryFloatCol = new YCFBamFloatColDefaultFactory();
		factoryFloatDef = new YCFBamFloatDefDefaultFactory();
		factoryFloatType = new YCFBamFloatTypeDefaultFactory();
		factoryHostNode = new YCFBamHostNodeDefaultFactory();
		factoryISOCcy = new YCFBamISOCcyDefaultFactory();
		factoryISOCtry = new YCFBamISOCtryDefaultFactory();
		factoryISOCtryCcy = new YCFBamISOCtryCcyDefaultFactory();
		factoryISOCtryLang = new YCFBamISOCtryLangDefaultFactory();
		factoryISOLang = new YCFBamISOLangDefaultFactory();
		factoryISOTZone = new YCFBamISOTZoneDefaultFactory();
		factoryId16Gen = new YCFBamId16GenDefaultFactory();
		factoryId32Gen = new YCFBamId32GenDefaultFactory();
		factoryId64Gen = new YCFBamId64GenDefaultFactory();
		factoryIndex = new YCFBamIndexDefaultFactory();
		factoryIndexCol = new YCFBamIndexColDefaultFactory();
		factoryIndexTweak = new YCFBamIndexTweakDefaultFactory();
		factoryInt16Col = new YCFBamInt16ColDefaultFactory();
		factoryInt16Def = new YCFBamInt16DefDefaultFactory();
		factoryInt16Type = new YCFBamInt16TypeDefaultFactory();
		factoryInt32Col = new YCFBamInt32ColDefaultFactory();
		factoryInt32Def = new YCFBamInt32DefDefaultFactory();
		factoryInt32Type = new YCFBamInt32TypeDefaultFactory();
		factoryInt64Col = new YCFBamInt64ColDefaultFactory();
		factoryInt64Def = new YCFBamInt64DefDefaultFactory();
		factoryInt64Type = new YCFBamInt64TypeDefaultFactory();
		factoryLicense = new YCFBamLicenseDefaultFactory();
		factoryMajorVersion = new YCFBamMajorVersionDefaultFactory();
		factoryMimeType = new YCFBamMimeTypeDefaultFactory();
		factoryMinorVersion = new YCFBamMinorVersionDefaultFactory();
		factoryNmTokenCol = new YCFBamNmTokenColDefaultFactory();
		factoryNmTokenDef = new YCFBamNmTokenDefDefaultFactory();
		factoryNmTokenType = new YCFBamNmTokenTypeDefaultFactory();
		factoryNmTokensCol = new YCFBamNmTokensColDefaultFactory();
		factoryNmTokensDef = new YCFBamNmTokensDefDefaultFactory();
		factoryNmTokensType = new YCFBamNmTokensTypeDefaultFactory();
		factoryNumberCol = new YCFBamNumberColDefaultFactory();
		factoryNumberDef = new YCFBamNumberDefDefaultFactory();
		factoryNumberType = new YCFBamNumberTypeDefaultFactory();
		factoryParam = new YCFBamParamDefaultFactory();
		factoryPopDep = new YCFBamPopDepDefaultFactory();
		factoryPopSubDep1 = new YCFBamPopSubDep1DefaultFactory();
		factoryPopSubDep2 = new YCFBamPopSubDep2DefaultFactory();
		factoryPopSubDep3 = new YCFBamPopSubDep3DefaultFactory();
		factoryPopTopDep = new YCFBamPopTopDepDefaultFactory();
		factoryRelation = new YCFBamRelationDefaultFactory();
		factoryRelationCol = new YCFBamRelationColDefaultFactory();
		factoryRoleDef = new YCFBamRoleDefDefaultFactory();
		factorySchemaDef = new YCFBamSchemaDefDefaultFactory();
		factorySchemaRef = new YCFBamSchemaRefDefaultFactory();
		factorySchemaRole = new YCFBamSchemaRoleDefaultFactory();
		factorySchemaTweak = new YCFBamSchemaTweakDefaultFactory();
		factoryScope = new YCFBamScopeDefaultFactory();
		factorySecApp = new YCFBamSecAppDefaultFactory();
		factorySecDevice = new YCFBamSecDeviceDefaultFactory();
		factorySecForm = new YCFBamSecFormDefaultFactory();
		factorySecGroup = new YCFBamSecGroupDefaultFactory();
		factorySecGroupForm = new YCFBamSecGroupFormDefaultFactory();
		factorySecGrpInc = new YCFBamSecGrpIncDefaultFactory();
		factorySecGrpMemb = new YCFBamSecGrpMembDefaultFactory();
		factorySecSession = new YCFBamSecSessionDefaultFactory();
		factorySecUser = new YCFBamSecUserDefaultFactory();
		factoryServerListFunc = new YCFBamServerListFuncDefaultFactory();
		factoryServerMethod = new YCFBamServerMethodDefaultFactory();
		factoryServerObjFunc = new YCFBamServerObjFuncDefaultFactory();
		factoryServerProc = new YCFBamServerProcDefaultFactory();
		factoryService = new YCFBamServiceDefaultFactory();
		factoryServiceType = new YCFBamServiceTypeDefaultFactory();
		factoryStringCol = new YCFBamStringColDefaultFactory();
		factoryStringDef = new YCFBamStringDefDefaultFactory();
		factoryStringType = new YCFBamStringTypeDefaultFactory();
		factorySubProject = new YCFBamSubProjectDefaultFactory();
		factorySysCluster = new YCFBamSysClusterDefaultFactory();
		factoryTSecGroup = new YCFBamTSecGroupDefaultFactory();
		factoryTSecGrpInc = new YCFBamTSecGrpIncDefaultFactory();
		factoryTSecGrpMemb = new YCFBamTSecGrpMembDefaultFactory();
		factoryTZDateCol = new YCFBamTZDateColDefaultFactory();
		factoryTZDateDef = new YCFBamTZDateDefDefaultFactory();
		factoryTZDateType = new YCFBamTZDateTypeDefaultFactory();
		factoryTZTimeCol = new YCFBamTZTimeColDefaultFactory();
		factoryTZTimeDef = new YCFBamTZTimeDefDefaultFactory();
		factoryTZTimeType = new YCFBamTZTimeTypeDefaultFactory();
		factoryTZTimestampCol = new YCFBamTZTimestampColDefaultFactory();
		factoryTZTimestampDef = new YCFBamTZTimestampDefDefaultFactory();
		factoryTZTimestampType = new YCFBamTZTimestampTypeDefaultFactory();
		factoryTable = new YCFBamTableDefaultFactory();
		factoryTableCol = new YCFBamTableColDefaultFactory();
		factoryTableTweak = new YCFBamTableTweakDefaultFactory();
		factoryTenant = new YCFBamTenantDefaultFactory();
		factoryTextCol = new YCFBamTextColDefaultFactory();
		factoryTextDef = new YCFBamTextDefDefaultFactory();
		factoryTextType = new YCFBamTextTypeDefaultFactory();
		factoryTimeCol = new YCFBamTimeColDefaultFactory();
		factoryTimeDef = new YCFBamTimeDefDefaultFactory();
		factoryTimeType = new YCFBamTimeTypeDefaultFactory();
		factoryTimestampCol = new YCFBamTimestampColDefaultFactory();
		factoryTimestampDef = new YCFBamTimestampDefDefaultFactory();
		factoryTimestampType = new YCFBamTimestampTypeDefaultFactory();
		factoryTld = new YCFBamTldDefaultFactory();
		factoryTokenCol = new YCFBamTokenColDefaultFactory();
		factoryTokenDef = new YCFBamTokenDefDefaultFactory();
		factoryTokenType = new YCFBamTokenTypeDefaultFactory();
		factoryTopDomain = new YCFBamTopDomainDefaultFactory();
		factoryTopProject = new YCFBamTopProjectDefaultFactory();
		factoryTweak = new YCFBamTweakDefaultFactory();
		factoryUInt16Col = new YCFBamUInt16ColDefaultFactory();
		factoryUInt16Def = new YCFBamUInt16DefDefaultFactory();
		factoryUInt16Type = new YCFBamUInt16TypeDefaultFactory();
		factoryUInt32Col = new YCFBamUInt32ColDefaultFactory();
		factoryUInt32Def = new YCFBamUInt32DefDefaultFactory();
		factoryUInt32Type = new YCFBamUInt32TypeDefaultFactory();
		factoryUInt64Col = new YCFBamUInt64ColDefaultFactory();
		factoryUInt64Def = new YCFBamUInt64DefDefaultFactory();
		factoryUInt64Type = new YCFBamUInt64TypeDefaultFactory();
		factoryURLProtocol = new YCFBamURLProtocolDefaultFactory();
		factoryUuid6Col = new YCFBamUuid6ColDefaultFactory();
		factoryUuid6Def = new YCFBamUuid6DefDefaultFactory();
		factoryUuid6Gen = new YCFBamUuid6GenDefaultFactory();
		factoryUuid6Type = new YCFBamUuid6TypeDefaultFactory();
		factoryUuidCol = new YCFBamUuidColDefaultFactory();
		factoryUuidDef = new YCFBamUuidDefDefaultFactory();
		factoryUuidGen = new YCFBamUuidGenDefaultFactory();
		factoryUuidType = new YCFBamUuidTypeDefaultFactory();
		factoryValue = new YCFBamValueDefaultFactory();	}

	public YCFBamSchema( YCFSecConfigurationFile conf ) {
		if( conf == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"YCFBamSchema-constructor",
				1,
				"conf" );
		}
		configuration = conf;
		jndiName = null;

		tableAtom = null;
		tableBlobCol = null;
		tableBlobDef = null;
		tableBlobType = null;
		tableBoolCol = null;
		tableBoolDef = null;
		tableBoolType = null;
		tableChain = null;
		tableClearDep = null;
		tableClearSubDep1 = null;
		tableClearSubDep2 = null;
		tableClearSubDep3 = null;
		tableClearTopDep = null;
		tableCluster = null;
		tableDateCol = null;
		tableDateDef = null;
		tableDateType = null;
		tableDbKeyHash128Col = null;
		tableDbKeyHash128Def = null;
		tableDbKeyHash128Gen = null;
		tableDbKeyHash128Type = null;
		tableDbKeyHash160Col = null;
		tableDbKeyHash160Def = null;
		tableDbKeyHash160Gen = null;
		tableDbKeyHash160Type = null;
		tableDbKeyHash224Col = null;
		tableDbKeyHash224Def = null;
		tableDbKeyHash224Gen = null;
		tableDbKeyHash224Type = null;
		tableDbKeyHash256Col = null;
		tableDbKeyHash256Def = null;
		tableDbKeyHash256Gen = null;
		tableDbKeyHash256Type = null;
		tableDbKeyHash384Col = null;
		tableDbKeyHash384Def = null;
		tableDbKeyHash384Gen = null;
		tableDbKeyHash384Type = null;
		tableDbKeyHash512Col = null;
		tableDbKeyHash512Def = null;
		tableDbKeyHash512Gen = null;
		tableDbKeyHash512Type = null;
		tableDelDep = null;
		tableDelSubDep1 = null;
		tableDelSubDep2 = null;
		tableDelSubDep3 = null;
		tableDelTopDep = null;
		tableDoubleCol = null;
		tableDoubleDef = null;
		tableDoubleType = null;
		tableEnumDef = null;
		tableEnumTag = null;
		tableEnumType = null;
		tableFloatCol = null;
		tableFloatDef = null;
		tableFloatType = null;
		tableHostNode = null;
		tableISOCcy = null;
		tableISOCtry = null;
		tableISOCtryCcy = null;
		tableISOCtryLang = null;
		tableISOLang = null;
		tableISOTZone = null;
		tableId16Gen = null;
		tableId32Gen = null;
		tableId64Gen = null;
		tableIndex = null;
		tableIndexCol = null;
		tableIndexTweak = null;
		tableInt16Col = null;
		tableInt16Def = null;
		tableInt16Type = null;
		tableInt32Col = null;
		tableInt32Def = null;
		tableInt32Type = null;
		tableInt64Col = null;
		tableInt64Def = null;
		tableInt64Type = null;
		tableLicense = null;
		tableMajorVersion = null;
		tableMimeType = null;
		tableMinorVersion = null;
		tableNmTokenCol = null;
		tableNmTokenDef = null;
		tableNmTokenType = null;
		tableNmTokensCol = null;
		tableNmTokensDef = null;
		tableNmTokensType = null;
		tableNumberCol = null;
		tableNumberDef = null;
		tableNumberType = null;
		tableParam = null;
		tablePopDep = null;
		tablePopSubDep1 = null;
		tablePopSubDep2 = null;
		tablePopSubDep3 = null;
		tablePopTopDep = null;
		tableRelation = null;
		tableRelationCol = null;
		tableRoleDef = null;
		tableSchemaDef = null;
		tableSchemaRef = null;
		tableSchemaRole = null;
		tableSchemaTweak = null;
		tableScope = null;
		tableSecApp = null;
		tableSecDevice = null;
		tableSecForm = null;
		tableSecGroup = null;
		tableSecGroupForm = null;
		tableSecGrpInc = null;
		tableSecGrpMemb = null;
		tableSecSession = null;
		tableSecUser = null;
		tableServerListFunc = null;
		tableServerMethod = null;
		tableServerObjFunc = null;
		tableServerProc = null;
		tableService = null;
		tableServiceType = null;
		tableStringCol = null;
		tableStringDef = null;
		tableStringType = null;
		tableSubProject = null;
		tableSysCluster = null;
		tableTSecGroup = null;
		tableTSecGrpInc = null;
		tableTSecGrpMemb = null;
		tableTZDateCol = null;
		tableTZDateDef = null;
		tableTZDateType = null;
		tableTZTimeCol = null;
		tableTZTimeDef = null;
		tableTZTimeType = null;
		tableTZTimestampCol = null;
		tableTZTimestampDef = null;
		tableTZTimestampType = null;
		tableTable = null;
		tableTableCol = null;
		tableTableTweak = null;
		tableTenant = null;
		tableTextCol = null;
		tableTextDef = null;
		tableTextType = null;
		tableTimeCol = null;
		tableTimeDef = null;
		tableTimeType = null;
		tableTimestampCol = null;
		tableTimestampDef = null;
		tableTimestampType = null;
		tableTld = null;
		tableTokenCol = null;
		tableTokenDef = null;
		tableTokenType = null;
		tableTopDomain = null;
		tableTopProject = null;
		tableTweak = null;
		tableUInt16Col = null;
		tableUInt16Def = null;
		tableUInt16Type = null;
		tableUInt32Col = null;
		tableUInt32Def = null;
		tableUInt32Type = null;
		tableUInt64Col = null;
		tableUInt64Def = null;
		tableUInt64Type = null;
		tableURLProtocol = null;
		tableUuid6Col = null;
		tableUuid6Def = null;
		tableUuid6Gen = null;
		tableUuid6Type = null;
		tableUuidCol = null;
		tableUuidDef = null;
		tableUuidGen = null;
		tableUuidType = null;
		tableValue = null;

		factoryAtom = new YCFBamAtomDefaultFactory();
		factoryBlobCol = new YCFBamBlobColDefaultFactory();
		factoryBlobDef = new YCFBamBlobDefDefaultFactory();
		factoryBlobType = new YCFBamBlobTypeDefaultFactory();
		factoryBoolCol = new YCFBamBoolColDefaultFactory();
		factoryBoolDef = new YCFBamBoolDefDefaultFactory();
		factoryBoolType = new YCFBamBoolTypeDefaultFactory();
		factoryChain = new YCFBamChainDefaultFactory();
		factoryClearDep = new YCFBamClearDepDefaultFactory();
		factoryClearSubDep1 = new YCFBamClearSubDep1DefaultFactory();
		factoryClearSubDep2 = new YCFBamClearSubDep2DefaultFactory();
		factoryClearSubDep3 = new YCFBamClearSubDep3DefaultFactory();
		factoryClearTopDep = new YCFBamClearTopDepDefaultFactory();
		factoryCluster = new YCFBamClusterDefaultFactory();
		factoryDateCol = new YCFBamDateColDefaultFactory();
		factoryDateDef = new YCFBamDateDefDefaultFactory();
		factoryDateType = new YCFBamDateTypeDefaultFactory();
		factoryDbKeyHash128Col = new YCFBamDbKeyHash128ColDefaultFactory();
		factoryDbKeyHash128Def = new YCFBamDbKeyHash128DefDefaultFactory();
		factoryDbKeyHash128Gen = new YCFBamDbKeyHash128GenDefaultFactory();
		factoryDbKeyHash128Type = new YCFBamDbKeyHash128TypeDefaultFactory();
		factoryDbKeyHash160Col = new YCFBamDbKeyHash160ColDefaultFactory();
		factoryDbKeyHash160Def = new YCFBamDbKeyHash160DefDefaultFactory();
		factoryDbKeyHash160Gen = new YCFBamDbKeyHash160GenDefaultFactory();
		factoryDbKeyHash160Type = new YCFBamDbKeyHash160TypeDefaultFactory();
		factoryDbKeyHash224Col = new YCFBamDbKeyHash224ColDefaultFactory();
		factoryDbKeyHash224Def = new YCFBamDbKeyHash224DefDefaultFactory();
		factoryDbKeyHash224Gen = new YCFBamDbKeyHash224GenDefaultFactory();
		factoryDbKeyHash224Type = new YCFBamDbKeyHash224TypeDefaultFactory();
		factoryDbKeyHash256Col = new YCFBamDbKeyHash256ColDefaultFactory();
		factoryDbKeyHash256Def = new YCFBamDbKeyHash256DefDefaultFactory();
		factoryDbKeyHash256Gen = new YCFBamDbKeyHash256GenDefaultFactory();
		factoryDbKeyHash256Type = new YCFBamDbKeyHash256TypeDefaultFactory();
		factoryDbKeyHash384Col = new YCFBamDbKeyHash384ColDefaultFactory();
		factoryDbKeyHash384Def = new YCFBamDbKeyHash384DefDefaultFactory();
		factoryDbKeyHash384Gen = new YCFBamDbKeyHash384GenDefaultFactory();
		factoryDbKeyHash384Type = new YCFBamDbKeyHash384TypeDefaultFactory();
		factoryDbKeyHash512Col = new YCFBamDbKeyHash512ColDefaultFactory();
		factoryDbKeyHash512Def = new YCFBamDbKeyHash512DefDefaultFactory();
		factoryDbKeyHash512Gen = new YCFBamDbKeyHash512GenDefaultFactory();
		factoryDbKeyHash512Type = new YCFBamDbKeyHash512TypeDefaultFactory();
		factoryDelDep = new YCFBamDelDepDefaultFactory();
		factoryDelSubDep1 = new YCFBamDelSubDep1DefaultFactory();
		factoryDelSubDep2 = new YCFBamDelSubDep2DefaultFactory();
		factoryDelSubDep3 = new YCFBamDelSubDep3DefaultFactory();
		factoryDelTopDep = new YCFBamDelTopDepDefaultFactory();
		factoryDoubleCol = new YCFBamDoubleColDefaultFactory();
		factoryDoubleDef = new YCFBamDoubleDefDefaultFactory();
		factoryDoubleType = new YCFBamDoubleTypeDefaultFactory();
		factoryEnumDef = new YCFBamEnumDefDefaultFactory();
		factoryEnumTag = new YCFBamEnumTagDefaultFactory();
		factoryEnumType = new YCFBamEnumTypeDefaultFactory();
		factoryFloatCol = new YCFBamFloatColDefaultFactory();
		factoryFloatDef = new YCFBamFloatDefDefaultFactory();
		factoryFloatType = new YCFBamFloatTypeDefaultFactory();
		factoryHostNode = new YCFBamHostNodeDefaultFactory();
		factoryISOCcy = new YCFBamISOCcyDefaultFactory();
		factoryISOCtry = new YCFBamISOCtryDefaultFactory();
		factoryISOCtryCcy = new YCFBamISOCtryCcyDefaultFactory();
		factoryISOCtryLang = new YCFBamISOCtryLangDefaultFactory();
		factoryISOLang = new YCFBamISOLangDefaultFactory();
		factoryISOTZone = new YCFBamISOTZoneDefaultFactory();
		factoryId16Gen = new YCFBamId16GenDefaultFactory();
		factoryId32Gen = new YCFBamId32GenDefaultFactory();
		factoryId64Gen = new YCFBamId64GenDefaultFactory();
		factoryIndex = new YCFBamIndexDefaultFactory();
		factoryIndexCol = new YCFBamIndexColDefaultFactory();
		factoryIndexTweak = new YCFBamIndexTweakDefaultFactory();
		factoryInt16Col = new YCFBamInt16ColDefaultFactory();
		factoryInt16Def = new YCFBamInt16DefDefaultFactory();
		factoryInt16Type = new YCFBamInt16TypeDefaultFactory();
		factoryInt32Col = new YCFBamInt32ColDefaultFactory();
		factoryInt32Def = new YCFBamInt32DefDefaultFactory();
		factoryInt32Type = new YCFBamInt32TypeDefaultFactory();
		factoryInt64Col = new YCFBamInt64ColDefaultFactory();
		factoryInt64Def = new YCFBamInt64DefDefaultFactory();
		factoryInt64Type = new YCFBamInt64TypeDefaultFactory();
		factoryLicense = new YCFBamLicenseDefaultFactory();
		factoryMajorVersion = new YCFBamMajorVersionDefaultFactory();
		factoryMimeType = new YCFBamMimeTypeDefaultFactory();
		factoryMinorVersion = new YCFBamMinorVersionDefaultFactory();
		factoryNmTokenCol = new YCFBamNmTokenColDefaultFactory();
		factoryNmTokenDef = new YCFBamNmTokenDefDefaultFactory();
		factoryNmTokenType = new YCFBamNmTokenTypeDefaultFactory();
		factoryNmTokensCol = new YCFBamNmTokensColDefaultFactory();
		factoryNmTokensDef = new YCFBamNmTokensDefDefaultFactory();
		factoryNmTokensType = new YCFBamNmTokensTypeDefaultFactory();
		factoryNumberCol = new YCFBamNumberColDefaultFactory();
		factoryNumberDef = new YCFBamNumberDefDefaultFactory();
		factoryNumberType = new YCFBamNumberTypeDefaultFactory();
		factoryParam = new YCFBamParamDefaultFactory();
		factoryPopDep = new YCFBamPopDepDefaultFactory();
		factoryPopSubDep1 = new YCFBamPopSubDep1DefaultFactory();
		factoryPopSubDep2 = new YCFBamPopSubDep2DefaultFactory();
		factoryPopSubDep3 = new YCFBamPopSubDep3DefaultFactory();
		factoryPopTopDep = new YCFBamPopTopDepDefaultFactory();
		factoryRelation = new YCFBamRelationDefaultFactory();
		factoryRelationCol = new YCFBamRelationColDefaultFactory();
		factoryRoleDef = new YCFBamRoleDefDefaultFactory();
		factorySchemaDef = new YCFBamSchemaDefDefaultFactory();
		factorySchemaRef = new YCFBamSchemaRefDefaultFactory();
		factorySchemaRole = new YCFBamSchemaRoleDefaultFactory();
		factorySchemaTweak = new YCFBamSchemaTweakDefaultFactory();
		factoryScope = new YCFBamScopeDefaultFactory();
		factorySecApp = new YCFBamSecAppDefaultFactory();
		factorySecDevice = new YCFBamSecDeviceDefaultFactory();
		factorySecForm = new YCFBamSecFormDefaultFactory();
		factorySecGroup = new YCFBamSecGroupDefaultFactory();
		factorySecGroupForm = new YCFBamSecGroupFormDefaultFactory();
		factorySecGrpInc = new YCFBamSecGrpIncDefaultFactory();
		factorySecGrpMemb = new YCFBamSecGrpMembDefaultFactory();
		factorySecSession = new YCFBamSecSessionDefaultFactory();
		factorySecUser = new YCFBamSecUserDefaultFactory();
		factoryServerListFunc = new YCFBamServerListFuncDefaultFactory();
		factoryServerMethod = new YCFBamServerMethodDefaultFactory();
		factoryServerObjFunc = new YCFBamServerObjFuncDefaultFactory();
		factoryServerProc = new YCFBamServerProcDefaultFactory();
		factoryService = new YCFBamServiceDefaultFactory();
		factoryServiceType = new YCFBamServiceTypeDefaultFactory();
		factoryStringCol = new YCFBamStringColDefaultFactory();
		factoryStringDef = new YCFBamStringDefDefaultFactory();
		factoryStringType = new YCFBamStringTypeDefaultFactory();
		factorySubProject = new YCFBamSubProjectDefaultFactory();
		factorySysCluster = new YCFBamSysClusterDefaultFactory();
		factoryTSecGroup = new YCFBamTSecGroupDefaultFactory();
		factoryTSecGrpInc = new YCFBamTSecGrpIncDefaultFactory();
		factoryTSecGrpMemb = new YCFBamTSecGrpMembDefaultFactory();
		factoryTZDateCol = new YCFBamTZDateColDefaultFactory();
		factoryTZDateDef = new YCFBamTZDateDefDefaultFactory();
		factoryTZDateType = new YCFBamTZDateTypeDefaultFactory();
		factoryTZTimeCol = new YCFBamTZTimeColDefaultFactory();
		factoryTZTimeDef = new YCFBamTZTimeDefDefaultFactory();
		factoryTZTimeType = new YCFBamTZTimeTypeDefaultFactory();
		factoryTZTimestampCol = new YCFBamTZTimestampColDefaultFactory();
		factoryTZTimestampDef = new YCFBamTZTimestampDefDefaultFactory();
		factoryTZTimestampType = new YCFBamTZTimestampTypeDefaultFactory();
		factoryTable = new YCFBamTableDefaultFactory();
		factoryTableCol = new YCFBamTableColDefaultFactory();
		factoryTableTweak = new YCFBamTableTweakDefaultFactory();
		factoryTenant = new YCFBamTenantDefaultFactory();
		factoryTextCol = new YCFBamTextColDefaultFactory();
		factoryTextDef = new YCFBamTextDefDefaultFactory();
		factoryTextType = new YCFBamTextTypeDefaultFactory();
		factoryTimeCol = new YCFBamTimeColDefaultFactory();
		factoryTimeDef = new YCFBamTimeDefDefaultFactory();
		factoryTimeType = new YCFBamTimeTypeDefaultFactory();
		factoryTimestampCol = new YCFBamTimestampColDefaultFactory();
		factoryTimestampDef = new YCFBamTimestampDefDefaultFactory();
		factoryTimestampType = new YCFBamTimestampTypeDefaultFactory();
		factoryTld = new YCFBamTldDefaultFactory();
		factoryTokenCol = new YCFBamTokenColDefaultFactory();
		factoryTokenDef = new YCFBamTokenDefDefaultFactory();
		factoryTokenType = new YCFBamTokenTypeDefaultFactory();
		factoryTopDomain = new YCFBamTopDomainDefaultFactory();
		factoryTopProject = new YCFBamTopProjectDefaultFactory();
		factoryTweak = new YCFBamTweakDefaultFactory();
		factoryUInt16Col = new YCFBamUInt16ColDefaultFactory();
		factoryUInt16Def = new YCFBamUInt16DefDefaultFactory();
		factoryUInt16Type = new YCFBamUInt16TypeDefaultFactory();
		factoryUInt32Col = new YCFBamUInt32ColDefaultFactory();
		factoryUInt32Def = new YCFBamUInt32DefDefaultFactory();
		factoryUInt32Type = new YCFBamUInt32TypeDefaultFactory();
		factoryUInt64Col = new YCFBamUInt64ColDefaultFactory();
		factoryUInt64Def = new YCFBamUInt64DefDefaultFactory();
		factoryUInt64Type = new YCFBamUInt64TypeDefaultFactory();
		factoryURLProtocol = new YCFBamURLProtocolDefaultFactory();
		factoryUuid6Col = new YCFBamUuid6ColDefaultFactory();
		factoryUuid6Def = new YCFBamUuid6DefDefaultFactory();
		factoryUuid6Gen = new YCFBamUuid6GenDefaultFactory();
		factoryUuid6Type = new YCFBamUuid6TypeDefaultFactory();
		factoryUuidCol = new YCFBamUuidColDefaultFactory();
		factoryUuidDef = new YCFBamUuidDefDefaultFactory();
		factoryUuidGen = new YCFBamUuidGenDefaultFactory();
		factoryUuidType = new YCFBamUuidTypeDefaultFactory();
		factoryValue = new YCFBamValueDefaultFactory();	}

	public YCFBamSchema( String argJndiName ) {
		if( ( argJndiName == null ) || ( argJndiName.length() <= 0 ) ) {
			throw new YCFLibEmptyArgumentException( getClass(),
				"YCFBamSchema-constructor",
				1,
				"argJndiName" );
		}
		configuration = null;
		jndiName = argJndiName;

		tableAtom = null;
		tableBlobCol = null;
		tableBlobDef = null;
		tableBlobType = null;
		tableBoolCol = null;
		tableBoolDef = null;
		tableBoolType = null;
		tableChain = null;
		tableClearDep = null;
		tableClearSubDep1 = null;
		tableClearSubDep2 = null;
		tableClearSubDep3 = null;
		tableClearTopDep = null;
		tableCluster = null;
		tableDateCol = null;
		tableDateDef = null;
		tableDateType = null;
		tableDbKeyHash128Col = null;
		tableDbKeyHash128Def = null;
		tableDbKeyHash128Gen = null;
		tableDbKeyHash128Type = null;
		tableDbKeyHash160Col = null;
		tableDbKeyHash160Def = null;
		tableDbKeyHash160Gen = null;
		tableDbKeyHash160Type = null;
		tableDbKeyHash224Col = null;
		tableDbKeyHash224Def = null;
		tableDbKeyHash224Gen = null;
		tableDbKeyHash224Type = null;
		tableDbKeyHash256Col = null;
		tableDbKeyHash256Def = null;
		tableDbKeyHash256Gen = null;
		tableDbKeyHash256Type = null;
		tableDbKeyHash384Col = null;
		tableDbKeyHash384Def = null;
		tableDbKeyHash384Gen = null;
		tableDbKeyHash384Type = null;
		tableDbKeyHash512Col = null;
		tableDbKeyHash512Def = null;
		tableDbKeyHash512Gen = null;
		tableDbKeyHash512Type = null;
		tableDelDep = null;
		tableDelSubDep1 = null;
		tableDelSubDep2 = null;
		tableDelSubDep3 = null;
		tableDelTopDep = null;
		tableDoubleCol = null;
		tableDoubleDef = null;
		tableDoubleType = null;
		tableEnumDef = null;
		tableEnumTag = null;
		tableEnumType = null;
		tableFloatCol = null;
		tableFloatDef = null;
		tableFloatType = null;
		tableHostNode = null;
		tableISOCcy = null;
		tableISOCtry = null;
		tableISOCtryCcy = null;
		tableISOCtryLang = null;
		tableISOLang = null;
		tableISOTZone = null;
		tableId16Gen = null;
		tableId32Gen = null;
		tableId64Gen = null;
		tableIndex = null;
		tableIndexCol = null;
		tableIndexTweak = null;
		tableInt16Col = null;
		tableInt16Def = null;
		tableInt16Type = null;
		tableInt32Col = null;
		tableInt32Def = null;
		tableInt32Type = null;
		tableInt64Col = null;
		tableInt64Def = null;
		tableInt64Type = null;
		tableLicense = null;
		tableMajorVersion = null;
		tableMimeType = null;
		tableMinorVersion = null;
		tableNmTokenCol = null;
		tableNmTokenDef = null;
		tableNmTokenType = null;
		tableNmTokensCol = null;
		tableNmTokensDef = null;
		tableNmTokensType = null;
		tableNumberCol = null;
		tableNumberDef = null;
		tableNumberType = null;
		tableParam = null;
		tablePopDep = null;
		tablePopSubDep1 = null;
		tablePopSubDep2 = null;
		tablePopSubDep3 = null;
		tablePopTopDep = null;
		tableRelation = null;
		tableRelationCol = null;
		tableRoleDef = null;
		tableSchemaDef = null;
		tableSchemaRef = null;
		tableSchemaRole = null;
		tableSchemaTweak = null;
		tableScope = null;
		tableSecApp = null;
		tableSecDevice = null;
		tableSecForm = null;
		tableSecGroup = null;
		tableSecGroupForm = null;
		tableSecGrpInc = null;
		tableSecGrpMemb = null;
		tableSecSession = null;
		tableSecUser = null;
		tableServerListFunc = null;
		tableServerMethod = null;
		tableServerObjFunc = null;
		tableServerProc = null;
		tableService = null;
		tableServiceType = null;
		tableStringCol = null;
		tableStringDef = null;
		tableStringType = null;
		tableSubProject = null;
		tableSysCluster = null;
		tableTSecGroup = null;
		tableTSecGrpInc = null;
		tableTSecGrpMemb = null;
		tableTZDateCol = null;
		tableTZDateDef = null;
		tableTZDateType = null;
		tableTZTimeCol = null;
		tableTZTimeDef = null;
		tableTZTimeType = null;
		tableTZTimestampCol = null;
		tableTZTimestampDef = null;
		tableTZTimestampType = null;
		tableTable = null;
		tableTableCol = null;
		tableTableTweak = null;
		tableTenant = null;
		tableTextCol = null;
		tableTextDef = null;
		tableTextType = null;
		tableTimeCol = null;
		tableTimeDef = null;
		tableTimeType = null;
		tableTimestampCol = null;
		tableTimestampDef = null;
		tableTimestampType = null;
		tableTld = null;
		tableTokenCol = null;
		tableTokenDef = null;
		tableTokenType = null;
		tableTopDomain = null;
		tableTopProject = null;
		tableTweak = null;
		tableUInt16Col = null;
		tableUInt16Def = null;
		tableUInt16Type = null;
		tableUInt32Col = null;
		tableUInt32Def = null;
		tableUInt32Type = null;
		tableUInt64Col = null;
		tableUInt64Def = null;
		tableUInt64Type = null;
		tableURLProtocol = null;
		tableUuid6Col = null;
		tableUuid6Def = null;
		tableUuid6Gen = null;
		tableUuid6Type = null;
		tableUuidCol = null;
		tableUuidDef = null;
		tableUuidGen = null;
		tableUuidType = null;
		tableValue = null;

		factoryAtom = new YCFBamAtomDefaultFactory();
		factoryBlobCol = new YCFBamBlobColDefaultFactory();
		factoryBlobDef = new YCFBamBlobDefDefaultFactory();
		factoryBlobType = new YCFBamBlobTypeDefaultFactory();
		factoryBoolCol = new YCFBamBoolColDefaultFactory();
		factoryBoolDef = new YCFBamBoolDefDefaultFactory();
		factoryBoolType = new YCFBamBoolTypeDefaultFactory();
		factoryChain = new YCFBamChainDefaultFactory();
		factoryClearDep = new YCFBamClearDepDefaultFactory();
		factoryClearSubDep1 = new YCFBamClearSubDep1DefaultFactory();
		factoryClearSubDep2 = new YCFBamClearSubDep2DefaultFactory();
		factoryClearSubDep3 = new YCFBamClearSubDep3DefaultFactory();
		factoryClearTopDep = new YCFBamClearTopDepDefaultFactory();
		factoryCluster = new YCFBamClusterDefaultFactory();
		factoryDateCol = new YCFBamDateColDefaultFactory();
		factoryDateDef = new YCFBamDateDefDefaultFactory();
		factoryDateType = new YCFBamDateTypeDefaultFactory();
		factoryDbKeyHash128Col = new YCFBamDbKeyHash128ColDefaultFactory();
		factoryDbKeyHash128Def = new YCFBamDbKeyHash128DefDefaultFactory();
		factoryDbKeyHash128Gen = new YCFBamDbKeyHash128GenDefaultFactory();
		factoryDbKeyHash128Type = new YCFBamDbKeyHash128TypeDefaultFactory();
		factoryDbKeyHash160Col = new YCFBamDbKeyHash160ColDefaultFactory();
		factoryDbKeyHash160Def = new YCFBamDbKeyHash160DefDefaultFactory();
		factoryDbKeyHash160Gen = new YCFBamDbKeyHash160GenDefaultFactory();
		factoryDbKeyHash160Type = new YCFBamDbKeyHash160TypeDefaultFactory();
		factoryDbKeyHash224Col = new YCFBamDbKeyHash224ColDefaultFactory();
		factoryDbKeyHash224Def = new YCFBamDbKeyHash224DefDefaultFactory();
		factoryDbKeyHash224Gen = new YCFBamDbKeyHash224GenDefaultFactory();
		factoryDbKeyHash224Type = new YCFBamDbKeyHash224TypeDefaultFactory();
		factoryDbKeyHash256Col = new YCFBamDbKeyHash256ColDefaultFactory();
		factoryDbKeyHash256Def = new YCFBamDbKeyHash256DefDefaultFactory();
		factoryDbKeyHash256Gen = new YCFBamDbKeyHash256GenDefaultFactory();
		factoryDbKeyHash256Type = new YCFBamDbKeyHash256TypeDefaultFactory();
		factoryDbKeyHash384Col = new YCFBamDbKeyHash384ColDefaultFactory();
		factoryDbKeyHash384Def = new YCFBamDbKeyHash384DefDefaultFactory();
		factoryDbKeyHash384Gen = new YCFBamDbKeyHash384GenDefaultFactory();
		factoryDbKeyHash384Type = new YCFBamDbKeyHash384TypeDefaultFactory();
		factoryDbKeyHash512Col = new YCFBamDbKeyHash512ColDefaultFactory();
		factoryDbKeyHash512Def = new YCFBamDbKeyHash512DefDefaultFactory();
		factoryDbKeyHash512Gen = new YCFBamDbKeyHash512GenDefaultFactory();
		factoryDbKeyHash512Type = new YCFBamDbKeyHash512TypeDefaultFactory();
		factoryDelDep = new YCFBamDelDepDefaultFactory();
		factoryDelSubDep1 = new YCFBamDelSubDep1DefaultFactory();
		factoryDelSubDep2 = new YCFBamDelSubDep2DefaultFactory();
		factoryDelSubDep3 = new YCFBamDelSubDep3DefaultFactory();
		factoryDelTopDep = new YCFBamDelTopDepDefaultFactory();
		factoryDoubleCol = new YCFBamDoubleColDefaultFactory();
		factoryDoubleDef = new YCFBamDoubleDefDefaultFactory();
		factoryDoubleType = new YCFBamDoubleTypeDefaultFactory();
		factoryEnumDef = new YCFBamEnumDefDefaultFactory();
		factoryEnumTag = new YCFBamEnumTagDefaultFactory();
		factoryEnumType = new YCFBamEnumTypeDefaultFactory();
		factoryFloatCol = new YCFBamFloatColDefaultFactory();
		factoryFloatDef = new YCFBamFloatDefDefaultFactory();
		factoryFloatType = new YCFBamFloatTypeDefaultFactory();
		factoryHostNode = new YCFBamHostNodeDefaultFactory();
		factoryISOCcy = new YCFBamISOCcyDefaultFactory();
		factoryISOCtry = new YCFBamISOCtryDefaultFactory();
		factoryISOCtryCcy = new YCFBamISOCtryCcyDefaultFactory();
		factoryISOCtryLang = new YCFBamISOCtryLangDefaultFactory();
		factoryISOLang = new YCFBamISOLangDefaultFactory();
		factoryISOTZone = new YCFBamISOTZoneDefaultFactory();
		factoryId16Gen = new YCFBamId16GenDefaultFactory();
		factoryId32Gen = new YCFBamId32GenDefaultFactory();
		factoryId64Gen = new YCFBamId64GenDefaultFactory();
		factoryIndex = new YCFBamIndexDefaultFactory();
		factoryIndexCol = new YCFBamIndexColDefaultFactory();
		factoryIndexTweak = new YCFBamIndexTweakDefaultFactory();
		factoryInt16Col = new YCFBamInt16ColDefaultFactory();
		factoryInt16Def = new YCFBamInt16DefDefaultFactory();
		factoryInt16Type = new YCFBamInt16TypeDefaultFactory();
		factoryInt32Col = new YCFBamInt32ColDefaultFactory();
		factoryInt32Def = new YCFBamInt32DefDefaultFactory();
		factoryInt32Type = new YCFBamInt32TypeDefaultFactory();
		factoryInt64Col = new YCFBamInt64ColDefaultFactory();
		factoryInt64Def = new YCFBamInt64DefDefaultFactory();
		factoryInt64Type = new YCFBamInt64TypeDefaultFactory();
		factoryLicense = new YCFBamLicenseDefaultFactory();
		factoryMajorVersion = new YCFBamMajorVersionDefaultFactory();
		factoryMimeType = new YCFBamMimeTypeDefaultFactory();
		factoryMinorVersion = new YCFBamMinorVersionDefaultFactory();
		factoryNmTokenCol = new YCFBamNmTokenColDefaultFactory();
		factoryNmTokenDef = new YCFBamNmTokenDefDefaultFactory();
		factoryNmTokenType = new YCFBamNmTokenTypeDefaultFactory();
		factoryNmTokensCol = new YCFBamNmTokensColDefaultFactory();
		factoryNmTokensDef = new YCFBamNmTokensDefDefaultFactory();
		factoryNmTokensType = new YCFBamNmTokensTypeDefaultFactory();
		factoryNumberCol = new YCFBamNumberColDefaultFactory();
		factoryNumberDef = new YCFBamNumberDefDefaultFactory();
		factoryNumberType = new YCFBamNumberTypeDefaultFactory();
		factoryParam = new YCFBamParamDefaultFactory();
		factoryPopDep = new YCFBamPopDepDefaultFactory();
		factoryPopSubDep1 = new YCFBamPopSubDep1DefaultFactory();
		factoryPopSubDep2 = new YCFBamPopSubDep2DefaultFactory();
		factoryPopSubDep3 = new YCFBamPopSubDep3DefaultFactory();
		factoryPopTopDep = new YCFBamPopTopDepDefaultFactory();
		factoryRelation = new YCFBamRelationDefaultFactory();
		factoryRelationCol = new YCFBamRelationColDefaultFactory();
		factoryRoleDef = new YCFBamRoleDefDefaultFactory();
		factorySchemaDef = new YCFBamSchemaDefDefaultFactory();
		factorySchemaRef = new YCFBamSchemaRefDefaultFactory();
		factorySchemaRole = new YCFBamSchemaRoleDefaultFactory();
		factorySchemaTweak = new YCFBamSchemaTweakDefaultFactory();
		factoryScope = new YCFBamScopeDefaultFactory();
		factorySecApp = new YCFBamSecAppDefaultFactory();
		factorySecDevice = new YCFBamSecDeviceDefaultFactory();
		factorySecForm = new YCFBamSecFormDefaultFactory();
		factorySecGroup = new YCFBamSecGroupDefaultFactory();
		factorySecGroupForm = new YCFBamSecGroupFormDefaultFactory();
		factorySecGrpInc = new YCFBamSecGrpIncDefaultFactory();
		factorySecGrpMemb = new YCFBamSecGrpMembDefaultFactory();
		factorySecSession = new YCFBamSecSessionDefaultFactory();
		factorySecUser = new YCFBamSecUserDefaultFactory();
		factoryServerListFunc = new YCFBamServerListFuncDefaultFactory();
		factoryServerMethod = new YCFBamServerMethodDefaultFactory();
		factoryServerObjFunc = new YCFBamServerObjFuncDefaultFactory();
		factoryServerProc = new YCFBamServerProcDefaultFactory();
		factoryService = new YCFBamServiceDefaultFactory();
		factoryServiceType = new YCFBamServiceTypeDefaultFactory();
		factoryStringCol = new YCFBamStringColDefaultFactory();
		factoryStringDef = new YCFBamStringDefDefaultFactory();
		factoryStringType = new YCFBamStringTypeDefaultFactory();
		factorySubProject = new YCFBamSubProjectDefaultFactory();
		factorySysCluster = new YCFBamSysClusterDefaultFactory();
		factoryTSecGroup = new YCFBamTSecGroupDefaultFactory();
		factoryTSecGrpInc = new YCFBamTSecGrpIncDefaultFactory();
		factoryTSecGrpMemb = new YCFBamTSecGrpMembDefaultFactory();
		factoryTZDateCol = new YCFBamTZDateColDefaultFactory();
		factoryTZDateDef = new YCFBamTZDateDefDefaultFactory();
		factoryTZDateType = new YCFBamTZDateTypeDefaultFactory();
		factoryTZTimeCol = new YCFBamTZTimeColDefaultFactory();
		factoryTZTimeDef = new YCFBamTZTimeDefDefaultFactory();
		factoryTZTimeType = new YCFBamTZTimeTypeDefaultFactory();
		factoryTZTimestampCol = new YCFBamTZTimestampColDefaultFactory();
		factoryTZTimestampDef = new YCFBamTZTimestampDefDefaultFactory();
		factoryTZTimestampType = new YCFBamTZTimestampTypeDefaultFactory();
		factoryTable = new YCFBamTableDefaultFactory();
		factoryTableCol = new YCFBamTableColDefaultFactory();
		factoryTableTweak = new YCFBamTableTweakDefaultFactory();
		factoryTenant = new YCFBamTenantDefaultFactory();
		factoryTextCol = new YCFBamTextColDefaultFactory();
		factoryTextDef = new YCFBamTextDefDefaultFactory();
		factoryTextType = new YCFBamTextTypeDefaultFactory();
		factoryTimeCol = new YCFBamTimeColDefaultFactory();
		factoryTimeDef = new YCFBamTimeDefDefaultFactory();
		factoryTimeType = new YCFBamTimeTypeDefaultFactory();
		factoryTimestampCol = new YCFBamTimestampColDefaultFactory();
		factoryTimestampDef = new YCFBamTimestampDefDefaultFactory();
		factoryTimestampType = new YCFBamTimestampTypeDefaultFactory();
		factoryTld = new YCFBamTldDefaultFactory();
		factoryTokenCol = new YCFBamTokenColDefaultFactory();
		factoryTokenDef = new YCFBamTokenDefDefaultFactory();
		factoryTokenType = new YCFBamTokenTypeDefaultFactory();
		factoryTopDomain = new YCFBamTopDomainDefaultFactory();
		factoryTopProject = new YCFBamTopProjectDefaultFactory();
		factoryTweak = new YCFBamTweakDefaultFactory();
		factoryUInt16Col = new YCFBamUInt16ColDefaultFactory();
		factoryUInt16Def = new YCFBamUInt16DefDefaultFactory();
		factoryUInt16Type = new YCFBamUInt16TypeDefaultFactory();
		factoryUInt32Col = new YCFBamUInt32ColDefaultFactory();
		factoryUInt32Def = new YCFBamUInt32DefDefaultFactory();
		factoryUInt32Type = new YCFBamUInt32TypeDefaultFactory();
		factoryUInt64Col = new YCFBamUInt64ColDefaultFactory();
		factoryUInt64Def = new YCFBamUInt64DefDefaultFactory();
		factoryUInt64Type = new YCFBamUInt64TypeDefaultFactory();
		factoryURLProtocol = new YCFBamURLProtocolDefaultFactory();
		factoryUuid6Col = new YCFBamUuid6ColDefaultFactory();
		factoryUuid6Def = new YCFBamUuid6DefDefaultFactory();
		factoryUuid6Gen = new YCFBamUuid6GenDefaultFactory();
		factoryUuid6Type = new YCFBamUuid6TypeDefaultFactory();
		factoryUuidCol = new YCFBamUuidColDefaultFactory();
		factoryUuidDef = new YCFBamUuidDefDefaultFactory();
		factoryUuidGen = new YCFBamUuidGenDefaultFactory();
		factoryUuidType = new YCFBamUuidTypeDefaultFactory();
		factoryValue = new YCFBamValueDefaultFactory();	}

	/**
	 *	The majority of cases do not have a YCFTipClientHandler
	 *	associated with it's persistence implementation.
	 *	Only the XMsg client implementations overload this
	 *	to return the actual YCFTipClientHandler associated
	 *	with the connection instance.
	 */
	public YCFTipClientHandler getYCFTipClientHandler() {
		return( null );
	}

	public String getServerURL() {
		return( null );
	}

	public void setServerURL( String value ) {
	}

	public YCFSecConfigurationFile getConfigurationFile() {
		return( configuration );
	}

	public void setConfigurationFile( YCFSecConfigurationFile value ) {
		if( value == null ) {
			configuration = null;
		}
		else {
			configuration = value;
			jndiName = null;
		}
	}

	public YCFSecAuthorization getAuthorization() {
		return( authorization );
	}

	public void setAuthorization( YCFSecAuthorization value ) {
		authorization = value;
	}

	public String getJndiName() {
		return( jndiName );
	}

	public void setJndiName( String value ) {
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			jndiName = null;
		}
		else {
			configuration = null;
			jndiName = value;
		}
	}

	public boolean isConnected() {
		throw new YCFLibMustOverrideException( getClass(), "isConnected" );
	}

	public boolean connect() {
		throw new YCFLibMustOverrideException( getClass(), "connect" );
	}

	public boolean connect( String username, String password ) {
		throw new YCFLibMustOverrideException( getClass(), "connect-userpw" );
	}

	public boolean connect( String loginId, String password, String clusterName, String tenantName ) {
		throw new YCFLibMustOverrideException( getClass(), "connect-full" );
	}

	public void disconnect( boolean doCommit ) {
		throw new YCFLibMustOverrideException( getClass(), "disconnect" );
	}

	public void logout( YCFSecAuthorization auth ) {
		throw new YCFLibMustOverrideException( getClass(), "logout" );
	}

	public IYCFBamSchema newSchema() {
		throw new YCFLibMustOverrideException( getClass(), "newSchema" );
	}

	/**
	 *	Import the contents of the specified file name
	 *	and file contents by applying a SAX Loader parse.
	 */
	public String fileImport( YCFSecAuthorization auth, String fileName, String fileContent ) {
		final String S_ProcName = "fileImport";
		throw new YCFLibNotImplementedYetException( getClass(),
			S_ProcName,
			"You must overload this method to apply a SAX Parser to the file contents" );
	}

	public short nextISOCcyIdGen() {
		throw new YCFLibNotImplementedYetException( getClass(), "nextISOCcyIdGen" );
	}

	public short nextISOCtryIdGen() {
		throw new YCFLibNotImplementedYetException( getClass(), "nextISOCtryIdGen" );
	}

	public short nextISOLangIdGen() {
		throw new YCFLibNotImplementedYetException( getClass(), "nextISOLangIdGen" );
	}

	public short nextISOTZoneIdGen() {
		throw new YCFLibNotImplementedYetException( getClass(), "nextISOTZoneIdGen" );
	}

	public int nextServiceTypeIdGen() {
		throw new YCFLibNotImplementedYetException( getClass(), "nextServiceTypeIdGen" );
	}

	public int nextMimeTypeIdGen() {
		throw new YCFLibNotImplementedYetException( getClass(), "nextMimeTypeIdGen" );
	}

	public int nextURLProtocolIdGen() {
		throw new YCFLibNotImplementedYetException( getClass(), "nextURLProtocolIdGen" );
	}

	public long nextClusterIdGen() {
		throw new YCFLibNotImplementedYetException( getClass(), "nextClusterIdGen" );
	}

	public long nextTenantIdGen() {
		throw new YCFLibNotImplementedYetException( getClass(), "nextTenantIdGen" );
	}

	public UUID nextSecSessionIdGen() {
		UUID retval = UUID.randomUUID();
		return( retval );
	}

	public UUID nextSecUserIdGen() {
		UUID retval = UUID.randomUUID();
		return( retval );
	}

	public IYCFBamAtomTable getTableAtom() {
		return( tableAtom );
	}

	public void setTableAtom( IYCFBamAtomTable value ) {
		tableAtom = value;
	}

	public IYCFBamAtomFactory getFactoryAtom() {
		return( factoryAtom );
	}

	public void setFactoryAtom( IYCFBamAtomFactory value ) {
		factoryAtom = value;
	}

	public IYCFBamBlobColTable getTableBlobCol() {
		return( tableBlobCol );
	}

	public void setTableBlobCol( IYCFBamBlobColTable value ) {
		tableBlobCol = value;
	}

	public IYCFBamBlobColFactory getFactoryBlobCol() {
		return( factoryBlobCol );
	}

	public void setFactoryBlobCol( IYCFBamBlobColFactory value ) {
		factoryBlobCol = value;
	}

	public IYCFBamBlobDefTable getTableBlobDef() {
		return( tableBlobDef );
	}

	public void setTableBlobDef( IYCFBamBlobDefTable value ) {
		tableBlobDef = value;
	}

	public IYCFBamBlobDefFactory getFactoryBlobDef() {
		return( factoryBlobDef );
	}

	public void setFactoryBlobDef( IYCFBamBlobDefFactory value ) {
		factoryBlobDef = value;
	}

	public IYCFBamBlobTypeTable getTableBlobType() {
		return( tableBlobType );
	}

	public void setTableBlobType( IYCFBamBlobTypeTable value ) {
		tableBlobType = value;
	}

	public IYCFBamBlobTypeFactory getFactoryBlobType() {
		return( factoryBlobType );
	}

	public void setFactoryBlobType( IYCFBamBlobTypeFactory value ) {
		factoryBlobType = value;
	}

	public IYCFBamBoolColTable getTableBoolCol() {
		return( tableBoolCol );
	}

	public void setTableBoolCol( IYCFBamBoolColTable value ) {
		tableBoolCol = value;
	}

	public IYCFBamBoolColFactory getFactoryBoolCol() {
		return( factoryBoolCol );
	}

	public void setFactoryBoolCol( IYCFBamBoolColFactory value ) {
		factoryBoolCol = value;
	}

	public IYCFBamBoolDefTable getTableBoolDef() {
		return( tableBoolDef );
	}

	public void setTableBoolDef( IYCFBamBoolDefTable value ) {
		tableBoolDef = value;
	}

	public IYCFBamBoolDefFactory getFactoryBoolDef() {
		return( factoryBoolDef );
	}

	public void setFactoryBoolDef( IYCFBamBoolDefFactory value ) {
		factoryBoolDef = value;
	}

	public IYCFBamBoolTypeTable getTableBoolType() {
		return( tableBoolType );
	}

	public void setTableBoolType( IYCFBamBoolTypeTable value ) {
		tableBoolType = value;
	}

	public IYCFBamBoolTypeFactory getFactoryBoolType() {
		return( factoryBoolType );
	}

	public void setFactoryBoolType( IYCFBamBoolTypeFactory value ) {
		factoryBoolType = value;
	}

	public IYCFBamChainTable getTableChain() {
		return( tableChain );
	}

	public void setTableChain( IYCFBamChainTable value ) {
		tableChain = value;
	}

	public IYCFBamChainFactory getFactoryChain() {
		return( factoryChain );
	}

	public void setFactoryChain( IYCFBamChainFactory value ) {
		factoryChain = value;
	}

	public IYCFBamClearDepTable getTableClearDep() {
		return( tableClearDep );
	}

	public void setTableClearDep( IYCFBamClearDepTable value ) {
		tableClearDep = value;
	}

	public IYCFBamClearDepFactory getFactoryClearDep() {
		return( factoryClearDep );
	}

	public void setFactoryClearDep( IYCFBamClearDepFactory value ) {
		factoryClearDep = value;
	}

	public IYCFBamClearSubDep1Table getTableClearSubDep1() {
		return( tableClearSubDep1 );
	}

	public void setTableClearSubDep1( IYCFBamClearSubDep1Table value ) {
		tableClearSubDep1 = value;
	}

	public IYCFBamClearSubDep1Factory getFactoryClearSubDep1() {
		return( factoryClearSubDep1 );
	}

	public void setFactoryClearSubDep1( IYCFBamClearSubDep1Factory value ) {
		factoryClearSubDep1 = value;
	}

	public IYCFBamClearSubDep2Table getTableClearSubDep2() {
		return( tableClearSubDep2 );
	}

	public void setTableClearSubDep2( IYCFBamClearSubDep2Table value ) {
		tableClearSubDep2 = value;
	}

	public IYCFBamClearSubDep2Factory getFactoryClearSubDep2() {
		return( factoryClearSubDep2 );
	}

	public void setFactoryClearSubDep2( IYCFBamClearSubDep2Factory value ) {
		factoryClearSubDep2 = value;
	}

	public IYCFBamClearSubDep3Table getTableClearSubDep3() {
		return( tableClearSubDep3 );
	}

	public void setTableClearSubDep3( IYCFBamClearSubDep3Table value ) {
		tableClearSubDep3 = value;
	}

	public IYCFBamClearSubDep3Factory getFactoryClearSubDep3() {
		return( factoryClearSubDep3 );
	}

	public void setFactoryClearSubDep3( IYCFBamClearSubDep3Factory value ) {
		factoryClearSubDep3 = value;
	}

	public IYCFBamClearTopDepTable getTableClearTopDep() {
		return( tableClearTopDep );
	}

	public void setTableClearTopDep( IYCFBamClearTopDepTable value ) {
		tableClearTopDep = value;
	}

	public IYCFBamClearTopDepFactory getFactoryClearTopDep() {
		return( factoryClearTopDep );
	}

	public void setFactoryClearTopDep( IYCFBamClearTopDepFactory value ) {
		factoryClearTopDep = value;
	}

	public IYCFSecClusterTable getTableCluster() {
		return( tableCluster );
	}

	public void setTableCluster( IYCFSecClusterTable value ) {
		tableCluster = value;
	}

	public IYCFSecClusterFactory getFactoryCluster() {
		return( factoryCluster );
	}

	public void setFactoryCluster( IYCFSecClusterFactory value ) {
		factoryCluster = value;
	}

	public IYCFBamDateColTable getTableDateCol() {
		return( tableDateCol );
	}

	public void setTableDateCol( IYCFBamDateColTable value ) {
		tableDateCol = value;
	}

	public IYCFBamDateColFactory getFactoryDateCol() {
		return( factoryDateCol );
	}

	public void setFactoryDateCol( IYCFBamDateColFactory value ) {
		factoryDateCol = value;
	}

	public IYCFBamDateDefTable getTableDateDef() {
		return( tableDateDef );
	}

	public void setTableDateDef( IYCFBamDateDefTable value ) {
		tableDateDef = value;
	}

	public IYCFBamDateDefFactory getFactoryDateDef() {
		return( factoryDateDef );
	}

	public void setFactoryDateDef( IYCFBamDateDefFactory value ) {
		factoryDateDef = value;
	}

	public IYCFBamDateTypeTable getTableDateType() {
		return( tableDateType );
	}

	public void setTableDateType( IYCFBamDateTypeTable value ) {
		tableDateType = value;
	}

	public IYCFBamDateTypeFactory getFactoryDateType() {
		return( factoryDateType );
	}

	public void setFactoryDateType( IYCFBamDateTypeFactory value ) {
		factoryDateType = value;
	}

	public IYCFBamDbKeyHash128ColTable getTableDbKeyHash128Col() {
		return( tableDbKeyHash128Col );
	}

	public void setTableDbKeyHash128Col( IYCFBamDbKeyHash128ColTable value ) {
		tableDbKeyHash128Col = value;
	}

	public IYCFBamDbKeyHash128ColFactory getFactoryDbKeyHash128Col() {
		return( factoryDbKeyHash128Col );
	}

	public void setFactoryDbKeyHash128Col( IYCFBamDbKeyHash128ColFactory value ) {
		factoryDbKeyHash128Col = value;
	}

	public IYCFBamDbKeyHash128DefTable getTableDbKeyHash128Def() {
		return( tableDbKeyHash128Def );
	}

	public void setTableDbKeyHash128Def( IYCFBamDbKeyHash128DefTable value ) {
		tableDbKeyHash128Def = value;
	}

	public IYCFBamDbKeyHash128DefFactory getFactoryDbKeyHash128Def() {
		return( factoryDbKeyHash128Def );
	}

	public void setFactoryDbKeyHash128Def( IYCFBamDbKeyHash128DefFactory value ) {
		factoryDbKeyHash128Def = value;
	}

	public IYCFBamDbKeyHash128GenTable getTableDbKeyHash128Gen() {
		return( tableDbKeyHash128Gen );
	}

	public void setTableDbKeyHash128Gen( IYCFBamDbKeyHash128GenTable value ) {
		tableDbKeyHash128Gen = value;
	}

	public IYCFBamDbKeyHash128GenFactory getFactoryDbKeyHash128Gen() {
		return( factoryDbKeyHash128Gen );
	}

	public void setFactoryDbKeyHash128Gen( IYCFBamDbKeyHash128GenFactory value ) {
		factoryDbKeyHash128Gen = value;
	}

	public IYCFBamDbKeyHash128TypeTable getTableDbKeyHash128Type() {
		return( tableDbKeyHash128Type );
	}

	public void setTableDbKeyHash128Type( IYCFBamDbKeyHash128TypeTable value ) {
		tableDbKeyHash128Type = value;
	}

	public IYCFBamDbKeyHash128TypeFactory getFactoryDbKeyHash128Type() {
		return( factoryDbKeyHash128Type );
	}

	public void setFactoryDbKeyHash128Type( IYCFBamDbKeyHash128TypeFactory value ) {
		factoryDbKeyHash128Type = value;
	}

	public IYCFBamDbKeyHash160ColTable getTableDbKeyHash160Col() {
		return( tableDbKeyHash160Col );
	}

	public void setTableDbKeyHash160Col( IYCFBamDbKeyHash160ColTable value ) {
		tableDbKeyHash160Col = value;
	}

	public IYCFBamDbKeyHash160ColFactory getFactoryDbKeyHash160Col() {
		return( factoryDbKeyHash160Col );
	}

	public void setFactoryDbKeyHash160Col( IYCFBamDbKeyHash160ColFactory value ) {
		factoryDbKeyHash160Col = value;
	}

	public IYCFBamDbKeyHash160DefTable getTableDbKeyHash160Def() {
		return( tableDbKeyHash160Def );
	}

	public void setTableDbKeyHash160Def( IYCFBamDbKeyHash160DefTable value ) {
		tableDbKeyHash160Def = value;
	}

	public IYCFBamDbKeyHash160DefFactory getFactoryDbKeyHash160Def() {
		return( factoryDbKeyHash160Def );
	}

	public void setFactoryDbKeyHash160Def( IYCFBamDbKeyHash160DefFactory value ) {
		factoryDbKeyHash160Def = value;
	}

	public IYCFBamDbKeyHash160GenTable getTableDbKeyHash160Gen() {
		return( tableDbKeyHash160Gen );
	}

	public void setTableDbKeyHash160Gen( IYCFBamDbKeyHash160GenTable value ) {
		tableDbKeyHash160Gen = value;
	}

	public IYCFBamDbKeyHash160GenFactory getFactoryDbKeyHash160Gen() {
		return( factoryDbKeyHash160Gen );
	}

	public void setFactoryDbKeyHash160Gen( IYCFBamDbKeyHash160GenFactory value ) {
		factoryDbKeyHash160Gen = value;
	}

	public IYCFBamDbKeyHash160TypeTable getTableDbKeyHash160Type() {
		return( tableDbKeyHash160Type );
	}

	public void setTableDbKeyHash160Type( IYCFBamDbKeyHash160TypeTable value ) {
		tableDbKeyHash160Type = value;
	}

	public IYCFBamDbKeyHash160TypeFactory getFactoryDbKeyHash160Type() {
		return( factoryDbKeyHash160Type );
	}

	public void setFactoryDbKeyHash160Type( IYCFBamDbKeyHash160TypeFactory value ) {
		factoryDbKeyHash160Type = value;
	}

	public IYCFBamDbKeyHash224ColTable getTableDbKeyHash224Col() {
		return( tableDbKeyHash224Col );
	}

	public void setTableDbKeyHash224Col( IYCFBamDbKeyHash224ColTable value ) {
		tableDbKeyHash224Col = value;
	}

	public IYCFBamDbKeyHash224ColFactory getFactoryDbKeyHash224Col() {
		return( factoryDbKeyHash224Col );
	}

	public void setFactoryDbKeyHash224Col( IYCFBamDbKeyHash224ColFactory value ) {
		factoryDbKeyHash224Col = value;
	}

	public IYCFBamDbKeyHash224DefTable getTableDbKeyHash224Def() {
		return( tableDbKeyHash224Def );
	}

	public void setTableDbKeyHash224Def( IYCFBamDbKeyHash224DefTable value ) {
		tableDbKeyHash224Def = value;
	}

	public IYCFBamDbKeyHash224DefFactory getFactoryDbKeyHash224Def() {
		return( factoryDbKeyHash224Def );
	}

	public void setFactoryDbKeyHash224Def( IYCFBamDbKeyHash224DefFactory value ) {
		factoryDbKeyHash224Def = value;
	}

	public IYCFBamDbKeyHash224GenTable getTableDbKeyHash224Gen() {
		return( tableDbKeyHash224Gen );
	}

	public void setTableDbKeyHash224Gen( IYCFBamDbKeyHash224GenTable value ) {
		tableDbKeyHash224Gen = value;
	}

	public IYCFBamDbKeyHash224GenFactory getFactoryDbKeyHash224Gen() {
		return( factoryDbKeyHash224Gen );
	}

	public void setFactoryDbKeyHash224Gen( IYCFBamDbKeyHash224GenFactory value ) {
		factoryDbKeyHash224Gen = value;
	}

	public IYCFBamDbKeyHash224TypeTable getTableDbKeyHash224Type() {
		return( tableDbKeyHash224Type );
	}

	public void setTableDbKeyHash224Type( IYCFBamDbKeyHash224TypeTable value ) {
		tableDbKeyHash224Type = value;
	}

	public IYCFBamDbKeyHash224TypeFactory getFactoryDbKeyHash224Type() {
		return( factoryDbKeyHash224Type );
	}

	public void setFactoryDbKeyHash224Type( IYCFBamDbKeyHash224TypeFactory value ) {
		factoryDbKeyHash224Type = value;
	}

	public IYCFBamDbKeyHash256ColTable getTableDbKeyHash256Col() {
		return( tableDbKeyHash256Col );
	}

	public void setTableDbKeyHash256Col( IYCFBamDbKeyHash256ColTable value ) {
		tableDbKeyHash256Col = value;
	}

	public IYCFBamDbKeyHash256ColFactory getFactoryDbKeyHash256Col() {
		return( factoryDbKeyHash256Col );
	}

	public void setFactoryDbKeyHash256Col( IYCFBamDbKeyHash256ColFactory value ) {
		factoryDbKeyHash256Col = value;
	}

	public IYCFBamDbKeyHash256DefTable getTableDbKeyHash256Def() {
		return( tableDbKeyHash256Def );
	}

	public void setTableDbKeyHash256Def( IYCFBamDbKeyHash256DefTable value ) {
		tableDbKeyHash256Def = value;
	}

	public IYCFBamDbKeyHash256DefFactory getFactoryDbKeyHash256Def() {
		return( factoryDbKeyHash256Def );
	}

	public void setFactoryDbKeyHash256Def( IYCFBamDbKeyHash256DefFactory value ) {
		factoryDbKeyHash256Def = value;
	}

	public IYCFBamDbKeyHash256GenTable getTableDbKeyHash256Gen() {
		return( tableDbKeyHash256Gen );
	}

	public void setTableDbKeyHash256Gen( IYCFBamDbKeyHash256GenTable value ) {
		tableDbKeyHash256Gen = value;
	}

	public IYCFBamDbKeyHash256GenFactory getFactoryDbKeyHash256Gen() {
		return( factoryDbKeyHash256Gen );
	}

	public void setFactoryDbKeyHash256Gen( IYCFBamDbKeyHash256GenFactory value ) {
		factoryDbKeyHash256Gen = value;
	}

	public IYCFBamDbKeyHash256TypeTable getTableDbKeyHash256Type() {
		return( tableDbKeyHash256Type );
	}

	public void setTableDbKeyHash256Type( IYCFBamDbKeyHash256TypeTable value ) {
		tableDbKeyHash256Type = value;
	}

	public IYCFBamDbKeyHash256TypeFactory getFactoryDbKeyHash256Type() {
		return( factoryDbKeyHash256Type );
	}

	public void setFactoryDbKeyHash256Type( IYCFBamDbKeyHash256TypeFactory value ) {
		factoryDbKeyHash256Type = value;
	}

	public IYCFBamDbKeyHash384ColTable getTableDbKeyHash384Col() {
		return( tableDbKeyHash384Col );
	}

	public void setTableDbKeyHash384Col( IYCFBamDbKeyHash384ColTable value ) {
		tableDbKeyHash384Col = value;
	}

	public IYCFBamDbKeyHash384ColFactory getFactoryDbKeyHash384Col() {
		return( factoryDbKeyHash384Col );
	}

	public void setFactoryDbKeyHash384Col( IYCFBamDbKeyHash384ColFactory value ) {
		factoryDbKeyHash384Col = value;
	}

	public IYCFBamDbKeyHash384DefTable getTableDbKeyHash384Def() {
		return( tableDbKeyHash384Def );
	}

	public void setTableDbKeyHash384Def( IYCFBamDbKeyHash384DefTable value ) {
		tableDbKeyHash384Def = value;
	}

	public IYCFBamDbKeyHash384DefFactory getFactoryDbKeyHash384Def() {
		return( factoryDbKeyHash384Def );
	}

	public void setFactoryDbKeyHash384Def( IYCFBamDbKeyHash384DefFactory value ) {
		factoryDbKeyHash384Def = value;
	}

	public IYCFBamDbKeyHash384GenTable getTableDbKeyHash384Gen() {
		return( tableDbKeyHash384Gen );
	}

	public void setTableDbKeyHash384Gen( IYCFBamDbKeyHash384GenTable value ) {
		tableDbKeyHash384Gen = value;
	}

	public IYCFBamDbKeyHash384GenFactory getFactoryDbKeyHash384Gen() {
		return( factoryDbKeyHash384Gen );
	}

	public void setFactoryDbKeyHash384Gen( IYCFBamDbKeyHash384GenFactory value ) {
		factoryDbKeyHash384Gen = value;
	}

	public IYCFBamDbKeyHash384TypeTable getTableDbKeyHash384Type() {
		return( tableDbKeyHash384Type );
	}

	public void setTableDbKeyHash384Type( IYCFBamDbKeyHash384TypeTable value ) {
		tableDbKeyHash384Type = value;
	}

	public IYCFBamDbKeyHash384TypeFactory getFactoryDbKeyHash384Type() {
		return( factoryDbKeyHash384Type );
	}

	public void setFactoryDbKeyHash384Type( IYCFBamDbKeyHash384TypeFactory value ) {
		factoryDbKeyHash384Type = value;
	}

	public IYCFBamDbKeyHash512ColTable getTableDbKeyHash512Col() {
		return( tableDbKeyHash512Col );
	}

	public void setTableDbKeyHash512Col( IYCFBamDbKeyHash512ColTable value ) {
		tableDbKeyHash512Col = value;
	}

	public IYCFBamDbKeyHash512ColFactory getFactoryDbKeyHash512Col() {
		return( factoryDbKeyHash512Col );
	}

	public void setFactoryDbKeyHash512Col( IYCFBamDbKeyHash512ColFactory value ) {
		factoryDbKeyHash512Col = value;
	}

	public IYCFBamDbKeyHash512DefTable getTableDbKeyHash512Def() {
		return( tableDbKeyHash512Def );
	}

	public void setTableDbKeyHash512Def( IYCFBamDbKeyHash512DefTable value ) {
		tableDbKeyHash512Def = value;
	}

	public IYCFBamDbKeyHash512DefFactory getFactoryDbKeyHash512Def() {
		return( factoryDbKeyHash512Def );
	}

	public void setFactoryDbKeyHash512Def( IYCFBamDbKeyHash512DefFactory value ) {
		factoryDbKeyHash512Def = value;
	}

	public IYCFBamDbKeyHash512GenTable getTableDbKeyHash512Gen() {
		return( tableDbKeyHash512Gen );
	}

	public void setTableDbKeyHash512Gen( IYCFBamDbKeyHash512GenTable value ) {
		tableDbKeyHash512Gen = value;
	}

	public IYCFBamDbKeyHash512GenFactory getFactoryDbKeyHash512Gen() {
		return( factoryDbKeyHash512Gen );
	}

	public void setFactoryDbKeyHash512Gen( IYCFBamDbKeyHash512GenFactory value ) {
		factoryDbKeyHash512Gen = value;
	}

	public IYCFBamDbKeyHash512TypeTable getTableDbKeyHash512Type() {
		return( tableDbKeyHash512Type );
	}

	public void setTableDbKeyHash512Type( IYCFBamDbKeyHash512TypeTable value ) {
		tableDbKeyHash512Type = value;
	}

	public IYCFBamDbKeyHash512TypeFactory getFactoryDbKeyHash512Type() {
		return( factoryDbKeyHash512Type );
	}

	public void setFactoryDbKeyHash512Type( IYCFBamDbKeyHash512TypeFactory value ) {
		factoryDbKeyHash512Type = value;
	}

	public IYCFBamDelDepTable getTableDelDep() {
		return( tableDelDep );
	}

	public void setTableDelDep( IYCFBamDelDepTable value ) {
		tableDelDep = value;
	}

	public IYCFBamDelDepFactory getFactoryDelDep() {
		return( factoryDelDep );
	}

	public void setFactoryDelDep( IYCFBamDelDepFactory value ) {
		factoryDelDep = value;
	}

	public IYCFBamDelSubDep1Table getTableDelSubDep1() {
		return( tableDelSubDep1 );
	}

	public void setTableDelSubDep1( IYCFBamDelSubDep1Table value ) {
		tableDelSubDep1 = value;
	}

	public IYCFBamDelSubDep1Factory getFactoryDelSubDep1() {
		return( factoryDelSubDep1 );
	}

	public void setFactoryDelSubDep1( IYCFBamDelSubDep1Factory value ) {
		factoryDelSubDep1 = value;
	}

	public IYCFBamDelSubDep2Table getTableDelSubDep2() {
		return( tableDelSubDep2 );
	}

	public void setTableDelSubDep2( IYCFBamDelSubDep2Table value ) {
		tableDelSubDep2 = value;
	}

	public IYCFBamDelSubDep2Factory getFactoryDelSubDep2() {
		return( factoryDelSubDep2 );
	}

	public void setFactoryDelSubDep2( IYCFBamDelSubDep2Factory value ) {
		factoryDelSubDep2 = value;
	}

	public IYCFBamDelSubDep3Table getTableDelSubDep3() {
		return( tableDelSubDep3 );
	}

	public void setTableDelSubDep3( IYCFBamDelSubDep3Table value ) {
		tableDelSubDep3 = value;
	}

	public IYCFBamDelSubDep3Factory getFactoryDelSubDep3() {
		return( factoryDelSubDep3 );
	}

	public void setFactoryDelSubDep3( IYCFBamDelSubDep3Factory value ) {
		factoryDelSubDep3 = value;
	}

	public IYCFBamDelTopDepTable getTableDelTopDep() {
		return( tableDelTopDep );
	}

	public void setTableDelTopDep( IYCFBamDelTopDepTable value ) {
		tableDelTopDep = value;
	}

	public IYCFBamDelTopDepFactory getFactoryDelTopDep() {
		return( factoryDelTopDep );
	}

	public void setFactoryDelTopDep( IYCFBamDelTopDepFactory value ) {
		factoryDelTopDep = value;
	}

	public IYCFBamDoubleColTable getTableDoubleCol() {
		return( tableDoubleCol );
	}

	public void setTableDoubleCol( IYCFBamDoubleColTable value ) {
		tableDoubleCol = value;
	}

	public IYCFBamDoubleColFactory getFactoryDoubleCol() {
		return( factoryDoubleCol );
	}

	public void setFactoryDoubleCol( IYCFBamDoubleColFactory value ) {
		factoryDoubleCol = value;
	}

	public IYCFBamDoubleDefTable getTableDoubleDef() {
		return( tableDoubleDef );
	}

	public void setTableDoubleDef( IYCFBamDoubleDefTable value ) {
		tableDoubleDef = value;
	}

	public IYCFBamDoubleDefFactory getFactoryDoubleDef() {
		return( factoryDoubleDef );
	}

	public void setFactoryDoubleDef( IYCFBamDoubleDefFactory value ) {
		factoryDoubleDef = value;
	}

	public IYCFBamDoubleTypeTable getTableDoubleType() {
		return( tableDoubleType );
	}

	public void setTableDoubleType( IYCFBamDoubleTypeTable value ) {
		tableDoubleType = value;
	}

	public IYCFBamDoubleTypeFactory getFactoryDoubleType() {
		return( factoryDoubleType );
	}

	public void setFactoryDoubleType( IYCFBamDoubleTypeFactory value ) {
		factoryDoubleType = value;
	}

	public IYCFBamEnumDefTable getTableEnumDef() {
		return( tableEnumDef );
	}

	public void setTableEnumDef( IYCFBamEnumDefTable value ) {
		tableEnumDef = value;
	}

	public IYCFBamEnumDefFactory getFactoryEnumDef() {
		return( factoryEnumDef );
	}

	public void setFactoryEnumDef( IYCFBamEnumDefFactory value ) {
		factoryEnumDef = value;
	}

	public IYCFBamEnumTagTable getTableEnumTag() {
		return( tableEnumTag );
	}

	public void setTableEnumTag( IYCFBamEnumTagTable value ) {
		tableEnumTag = value;
	}

	public IYCFBamEnumTagFactory getFactoryEnumTag() {
		return( factoryEnumTag );
	}

	public void setFactoryEnumTag( IYCFBamEnumTagFactory value ) {
		factoryEnumTag = value;
	}

	public IYCFBamEnumTypeTable getTableEnumType() {
		return( tableEnumType );
	}

	public void setTableEnumType( IYCFBamEnumTypeTable value ) {
		tableEnumType = value;
	}

	public IYCFBamEnumTypeFactory getFactoryEnumType() {
		return( factoryEnumType );
	}

	public void setFactoryEnumType( IYCFBamEnumTypeFactory value ) {
		factoryEnumType = value;
	}

	public IYCFBamFloatColTable getTableFloatCol() {
		return( tableFloatCol );
	}

	public void setTableFloatCol( IYCFBamFloatColTable value ) {
		tableFloatCol = value;
	}

	public IYCFBamFloatColFactory getFactoryFloatCol() {
		return( factoryFloatCol );
	}

	public void setFactoryFloatCol( IYCFBamFloatColFactory value ) {
		factoryFloatCol = value;
	}

	public IYCFBamFloatDefTable getTableFloatDef() {
		return( tableFloatDef );
	}

	public void setTableFloatDef( IYCFBamFloatDefTable value ) {
		tableFloatDef = value;
	}

	public IYCFBamFloatDefFactory getFactoryFloatDef() {
		return( factoryFloatDef );
	}

	public void setFactoryFloatDef( IYCFBamFloatDefFactory value ) {
		factoryFloatDef = value;
	}

	public IYCFBamFloatTypeTable getTableFloatType() {
		return( tableFloatType );
	}

	public void setTableFloatType( IYCFBamFloatTypeTable value ) {
		tableFloatType = value;
	}

	public IYCFBamFloatTypeFactory getFactoryFloatType() {
		return( factoryFloatType );
	}

	public void setFactoryFloatType( IYCFBamFloatTypeFactory value ) {
		factoryFloatType = value;
	}

	public IYCFSecHostNodeTable getTableHostNode() {
		return( tableHostNode );
	}

	public void setTableHostNode( IYCFSecHostNodeTable value ) {
		tableHostNode = value;
	}

	public IYCFSecHostNodeFactory getFactoryHostNode() {
		return( factoryHostNode );
	}

	public void setFactoryHostNode( IYCFSecHostNodeFactory value ) {
		factoryHostNode = value;
	}

	public IYCFSecISOCcyTable getTableISOCcy() {
		return( tableISOCcy );
	}

	public void setTableISOCcy( IYCFSecISOCcyTable value ) {
		tableISOCcy = value;
	}

	public IYCFSecISOCcyFactory getFactoryISOCcy() {
		return( factoryISOCcy );
	}

	public void setFactoryISOCcy( IYCFSecISOCcyFactory value ) {
		factoryISOCcy = value;
	}

	public IYCFSecISOCtryTable getTableISOCtry() {
		return( tableISOCtry );
	}

	public void setTableISOCtry( IYCFSecISOCtryTable value ) {
		tableISOCtry = value;
	}

	public IYCFSecISOCtryFactory getFactoryISOCtry() {
		return( factoryISOCtry );
	}

	public void setFactoryISOCtry( IYCFSecISOCtryFactory value ) {
		factoryISOCtry = value;
	}

	public IYCFSecISOCtryCcyTable getTableISOCtryCcy() {
		return( tableISOCtryCcy );
	}

	public void setTableISOCtryCcy( IYCFSecISOCtryCcyTable value ) {
		tableISOCtryCcy = value;
	}

	public IYCFSecISOCtryCcyFactory getFactoryISOCtryCcy() {
		return( factoryISOCtryCcy );
	}

	public void setFactoryISOCtryCcy( IYCFSecISOCtryCcyFactory value ) {
		factoryISOCtryCcy = value;
	}

	public IYCFSecISOCtryLangTable getTableISOCtryLang() {
		return( tableISOCtryLang );
	}

	public void setTableISOCtryLang( IYCFSecISOCtryLangTable value ) {
		tableISOCtryLang = value;
	}

	public IYCFSecISOCtryLangFactory getFactoryISOCtryLang() {
		return( factoryISOCtryLang );
	}

	public void setFactoryISOCtryLang( IYCFSecISOCtryLangFactory value ) {
		factoryISOCtryLang = value;
	}

	public IYCFSecISOLangTable getTableISOLang() {
		return( tableISOLang );
	}

	public void setTableISOLang( IYCFSecISOLangTable value ) {
		tableISOLang = value;
	}

	public IYCFSecISOLangFactory getFactoryISOLang() {
		return( factoryISOLang );
	}

	public void setFactoryISOLang( IYCFSecISOLangFactory value ) {
		factoryISOLang = value;
	}

	public IYCFSecISOTZoneTable getTableISOTZone() {
		return( tableISOTZone );
	}

	public void setTableISOTZone( IYCFSecISOTZoneTable value ) {
		tableISOTZone = value;
	}

	public IYCFSecISOTZoneFactory getFactoryISOTZone() {
		return( factoryISOTZone );
	}

	public void setFactoryISOTZone( IYCFSecISOTZoneFactory value ) {
		factoryISOTZone = value;
	}

	public IYCFBamId16GenTable getTableId16Gen() {
		return( tableId16Gen );
	}

	public void setTableId16Gen( IYCFBamId16GenTable value ) {
		tableId16Gen = value;
	}

	public IYCFBamId16GenFactory getFactoryId16Gen() {
		return( factoryId16Gen );
	}

	public void setFactoryId16Gen( IYCFBamId16GenFactory value ) {
		factoryId16Gen = value;
	}

	public IYCFBamId32GenTable getTableId32Gen() {
		return( tableId32Gen );
	}

	public void setTableId32Gen( IYCFBamId32GenTable value ) {
		tableId32Gen = value;
	}

	public IYCFBamId32GenFactory getFactoryId32Gen() {
		return( factoryId32Gen );
	}

	public void setFactoryId32Gen( IYCFBamId32GenFactory value ) {
		factoryId32Gen = value;
	}

	public IYCFBamId64GenTable getTableId64Gen() {
		return( tableId64Gen );
	}

	public void setTableId64Gen( IYCFBamId64GenTable value ) {
		tableId64Gen = value;
	}

	public IYCFBamId64GenFactory getFactoryId64Gen() {
		return( factoryId64Gen );
	}

	public void setFactoryId64Gen( IYCFBamId64GenFactory value ) {
		factoryId64Gen = value;
	}

	public IYCFBamIndexTable getTableIndex() {
		return( tableIndex );
	}

	public void setTableIndex( IYCFBamIndexTable value ) {
		tableIndex = value;
	}

	public IYCFBamIndexFactory getFactoryIndex() {
		return( factoryIndex );
	}

	public void setFactoryIndex( IYCFBamIndexFactory value ) {
		factoryIndex = value;
	}

	public IYCFBamIndexColTable getTableIndexCol() {
		return( tableIndexCol );
	}

	public void setTableIndexCol( IYCFBamIndexColTable value ) {
		tableIndexCol = value;
	}

	public IYCFBamIndexColFactory getFactoryIndexCol() {
		return( factoryIndexCol );
	}

	public void setFactoryIndexCol( IYCFBamIndexColFactory value ) {
		factoryIndexCol = value;
	}

	public IYCFBamIndexTweakTable getTableIndexTweak() {
		return( tableIndexTweak );
	}

	public void setTableIndexTweak( IYCFBamIndexTweakTable value ) {
		tableIndexTweak = value;
	}

	public IYCFBamIndexTweakFactory getFactoryIndexTweak() {
		return( factoryIndexTweak );
	}

	public void setFactoryIndexTweak( IYCFBamIndexTweakFactory value ) {
		factoryIndexTweak = value;
	}

	public IYCFBamInt16ColTable getTableInt16Col() {
		return( tableInt16Col );
	}

	public void setTableInt16Col( IYCFBamInt16ColTable value ) {
		tableInt16Col = value;
	}

	public IYCFBamInt16ColFactory getFactoryInt16Col() {
		return( factoryInt16Col );
	}

	public void setFactoryInt16Col( IYCFBamInt16ColFactory value ) {
		factoryInt16Col = value;
	}

	public IYCFBamInt16DefTable getTableInt16Def() {
		return( tableInt16Def );
	}

	public void setTableInt16Def( IYCFBamInt16DefTable value ) {
		tableInt16Def = value;
	}

	public IYCFBamInt16DefFactory getFactoryInt16Def() {
		return( factoryInt16Def );
	}

	public void setFactoryInt16Def( IYCFBamInt16DefFactory value ) {
		factoryInt16Def = value;
	}

	public IYCFBamInt16TypeTable getTableInt16Type() {
		return( tableInt16Type );
	}

	public void setTableInt16Type( IYCFBamInt16TypeTable value ) {
		tableInt16Type = value;
	}

	public IYCFBamInt16TypeFactory getFactoryInt16Type() {
		return( factoryInt16Type );
	}

	public void setFactoryInt16Type( IYCFBamInt16TypeFactory value ) {
		factoryInt16Type = value;
	}

	public IYCFBamInt32ColTable getTableInt32Col() {
		return( tableInt32Col );
	}

	public void setTableInt32Col( IYCFBamInt32ColTable value ) {
		tableInt32Col = value;
	}

	public IYCFBamInt32ColFactory getFactoryInt32Col() {
		return( factoryInt32Col );
	}

	public void setFactoryInt32Col( IYCFBamInt32ColFactory value ) {
		factoryInt32Col = value;
	}

	public IYCFBamInt32DefTable getTableInt32Def() {
		return( tableInt32Def );
	}

	public void setTableInt32Def( IYCFBamInt32DefTable value ) {
		tableInt32Def = value;
	}

	public IYCFBamInt32DefFactory getFactoryInt32Def() {
		return( factoryInt32Def );
	}

	public void setFactoryInt32Def( IYCFBamInt32DefFactory value ) {
		factoryInt32Def = value;
	}

	public IYCFBamInt32TypeTable getTableInt32Type() {
		return( tableInt32Type );
	}

	public void setTableInt32Type( IYCFBamInt32TypeTable value ) {
		tableInt32Type = value;
	}

	public IYCFBamInt32TypeFactory getFactoryInt32Type() {
		return( factoryInt32Type );
	}

	public void setFactoryInt32Type( IYCFBamInt32TypeFactory value ) {
		factoryInt32Type = value;
	}

	public IYCFBamInt64ColTable getTableInt64Col() {
		return( tableInt64Col );
	}

	public void setTableInt64Col( IYCFBamInt64ColTable value ) {
		tableInt64Col = value;
	}

	public IYCFBamInt64ColFactory getFactoryInt64Col() {
		return( factoryInt64Col );
	}

	public void setFactoryInt64Col( IYCFBamInt64ColFactory value ) {
		factoryInt64Col = value;
	}

	public IYCFBamInt64DefTable getTableInt64Def() {
		return( tableInt64Def );
	}

	public void setTableInt64Def( IYCFBamInt64DefTable value ) {
		tableInt64Def = value;
	}

	public IYCFBamInt64DefFactory getFactoryInt64Def() {
		return( factoryInt64Def );
	}

	public void setFactoryInt64Def( IYCFBamInt64DefFactory value ) {
		factoryInt64Def = value;
	}

	public IYCFBamInt64TypeTable getTableInt64Type() {
		return( tableInt64Type );
	}

	public void setTableInt64Type( IYCFBamInt64TypeTable value ) {
		tableInt64Type = value;
	}

	public IYCFBamInt64TypeFactory getFactoryInt64Type() {
		return( factoryInt64Type );
	}

	public void setFactoryInt64Type( IYCFBamInt64TypeFactory value ) {
		factoryInt64Type = value;
	}

	public IYCFIntLicenseTable getTableLicense() {
		return( tableLicense );
	}

	public void setTableLicense( IYCFIntLicenseTable value ) {
		tableLicense = value;
	}

	public IYCFIntLicenseFactory getFactoryLicense() {
		return( factoryLicense );
	}

	public void setFactoryLicense( IYCFIntLicenseFactory value ) {
		factoryLicense = value;
	}

	public IYCFIntMajorVersionTable getTableMajorVersion() {
		return( tableMajorVersion );
	}

	public void setTableMajorVersion( IYCFIntMajorVersionTable value ) {
		tableMajorVersion = value;
	}

	public IYCFIntMajorVersionFactory getFactoryMajorVersion() {
		return( factoryMajorVersion );
	}

	public void setFactoryMajorVersion( IYCFIntMajorVersionFactory value ) {
		factoryMajorVersion = value;
	}

	public IYCFIntMimeTypeTable getTableMimeType() {
		return( tableMimeType );
	}

	public void setTableMimeType( IYCFIntMimeTypeTable value ) {
		tableMimeType = value;
	}

	public IYCFIntMimeTypeFactory getFactoryMimeType() {
		return( factoryMimeType );
	}

	public void setFactoryMimeType( IYCFIntMimeTypeFactory value ) {
		factoryMimeType = value;
	}

	public IYCFIntMinorVersionTable getTableMinorVersion() {
		return( tableMinorVersion );
	}

	public void setTableMinorVersion( IYCFIntMinorVersionTable value ) {
		tableMinorVersion = value;
	}

	public IYCFIntMinorVersionFactory getFactoryMinorVersion() {
		return( factoryMinorVersion );
	}

	public void setFactoryMinorVersion( IYCFIntMinorVersionFactory value ) {
		factoryMinorVersion = value;
	}

	public IYCFBamNmTokenColTable getTableNmTokenCol() {
		return( tableNmTokenCol );
	}

	public void setTableNmTokenCol( IYCFBamNmTokenColTable value ) {
		tableNmTokenCol = value;
	}

	public IYCFBamNmTokenColFactory getFactoryNmTokenCol() {
		return( factoryNmTokenCol );
	}

	public void setFactoryNmTokenCol( IYCFBamNmTokenColFactory value ) {
		factoryNmTokenCol = value;
	}

	public IYCFBamNmTokenDefTable getTableNmTokenDef() {
		return( tableNmTokenDef );
	}

	public void setTableNmTokenDef( IYCFBamNmTokenDefTable value ) {
		tableNmTokenDef = value;
	}

	public IYCFBamNmTokenDefFactory getFactoryNmTokenDef() {
		return( factoryNmTokenDef );
	}

	public void setFactoryNmTokenDef( IYCFBamNmTokenDefFactory value ) {
		factoryNmTokenDef = value;
	}

	public IYCFBamNmTokenTypeTable getTableNmTokenType() {
		return( tableNmTokenType );
	}

	public void setTableNmTokenType( IYCFBamNmTokenTypeTable value ) {
		tableNmTokenType = value;
	}

	public IYCFBamNmTokenTypeFactory getFactoryNmTokenType() {
		return( factoryNmTokenType );
	}

	public void setFactoryNmTokenType( IYCFBamNmTokenTypeFactory value ) {
		factoryNmTokenType = value;
	}

	public IYCFBamNmTokensColTable getTableNmTokensCol() {
		return( tableNmTokensCol );
	}

	public void setTableNmTokensCol( IYCFBamNmTokensColTable value ) {
		tableNmTokensCol = value;
	}

	public IYCFBamNmTokensColFactory getFactoryNmTokensCol() {
		return( factoryNmTokensCol );
	}

	public void setFactoryNmTokensCol( IYCFBamNmTokensColFactory value ) {
		factoryNmTokensCol = value;
	}

	public IYCFBamNmTokensDefTable getTableNmTokensDef() {
		return( tableNmTokensDef );
	}

	public void setTableNmTokensDef( IYCFBamNmTokensDefTable value ) {
		tableNmTokensDef = value;
	}

	public IYCFBamNmTokensDefFactory getFactoryNmTokensDef() {
		return( factoryNmTokensDef );
	}

	public void setFactoryNmTokensDef( IYCFBamNmTokensDefFactory value ) {
		factoryNmTokensDef = value;
	}

	public IYCFBamNmTokensTypeTable getTableNmTokensType() {
		return( tableNmTokensType );
	}

	public void setTableNmTokensType( IYCFBamNmTokensTypeTable value ) {
		tableNmTokensType = value;
	}

	public IYCFBamNmTokensTypeFactory getFactoryNmTokensType() {
		return( factoryNmTokensType );
	}

	public void setFactoryNmTokensType( IYCFBamNmTokensTypeFactory value ) {
		factoryNmTokensType = value;
	}

	public IYCFBamNumberColTable getTableNumberCol() {
		return( tableNumberCol );
	}

	public void setTableNumberCol( IYCFBamNumberColTable value ) {
		tableNumberCol = value;
	}

	public IYCFBamNumberColFactory getFactoryNumberCol() {
		return( factoryNumberCol );
	}

	public void setFactoryNumberCol( IYCFBamNumberColFactory value ) {
		factoryNumberCol = value;
	}

	public IYCFBamNumberDefTable getTableNumberDef() {
		return( tableNumberDef );
	}

	public void setTableNumberDef( IYCFBamNumberDefTable value ) {
		tableNumberDef = value;
	}

	public IYCFBamNumberDefFactory getFactoryNumberDef() {
		return( factoryNumberDef );
	}

	public void setFactoryNumberDef( IYCFBamNumberDefFactory value ) {
		factoryNumberDef = value;
	}

	public IYCFBamNumberTypeTable getTableNumberType() {
		return( tableNumberType );
	}

	public void setTableNumberType( IYCFBamNumberTypeTable value ) {
		tableNumberType = value;
	}

	public IYCFBamNumberTypeFactory getFactoryNumberType() {
		return( factoryNumberType );
	}

	public void setFactoryNumberType( IYCFBamNumberTypeFactory value ) {
		factoryNumberType = value;
	}

	public IYCFBamParamTable getTableParam() {
		return( tableParam );
	}

	public void setTableParam( IYCFBamParamTable value ) {
		tableParam = value;
	}

	public IYCFBamParamFactory getFactoryParam() {
		return( factoryParam );
	}

	public void setFactoryParam( IYCFBamParamFactory value ) {
		factoryParam = value;
	}

	public IYCFBamPopDepTable getTablePopDep() {
		return( tablePopDep );
	}

	public void setTablePopDep( IYCFBamPopDepTable value ) {
		tablePopDep = value;
	}

	public IYCFBamPopDepFactory getFactoryPopDep() {
		return( factoryPopDep );
	}

	public void setFactoryPopDep( IYCFBamPopDepFactory value ) {
		factoryPopDep = value;
	}

	public IYCFBamPopSubDep1Table getTablePopSubDep1() {
		return( tablePopSubDep1 );
	}

	public void setTablePopSubDep1( IYCFBamPopSubDep1Table value ) {
		tablePopSubDep1 = value;
	}

	public IYCFBamPopSubDep1Factory getFactoryPopSubDep1() {
		return( factoryPopSubDep1 );
	}

	public void setFactoryPopSubDep1( IYCFBamPopSubDep1Factory value ) {
		factoryPopSubDep1 = value;
	}

	public IYCFBamPopSubDep2Table getTablePopSubDep2() {
		return( tablePopSubDep2 );
	}

	public void setTablePopSubDep2( IYCFBamPopSubDep2Table value ) {
		tablePopSubDep2 = value;
	}

	public IYCFBamPopSubDep2Factory getFactoryPopSubDep2() {
		return( factoryPopSubDep2 );
	}

	public void setFactoryPopSubDep2( IYCFBamPopSubDep2Factory value ) {
		factoryPopSubDep2 = value;
	}

	public IYCFBamPopSubDep3Table getTablePopSubDep3() {
		return( tablePopSubDep3 );
	}

	public void setTablePopSubDep3( IYCFBamPopSubDep3Table value ) {
		tablePopSubDep3 = value;
	}

	public IYCFBamPopSubDep3Factory getFactoryPopSubDep3() {
		return( factoryPopSubDep3 );
	}

	public void setFactoryPopSubDep3( IYCFBamPopSubDep3Factory value ) {
		factoryPopSubDep3 = value;
	}

	public IYCFBamPopTopDepTable getTablePopTopDep() {
		return( tablePopTopDep );
	}

	public void setTablePopTopDep( IYCFBamPopTopDepTable value ) {
		tablePopTopDep = value;
	}

	public IYCFBamPopTopDepFactory getFactoryPopTopDep() {
		return( factoryPopTopDep );
	}

	public void setFactoryPopTopDep( IYCFBamPopTopDepFactory value ) {
		factoryPopTopDep = value;
	}

	public IYCFBamRelationTable getTableRelation() {
		return( tableRelation );
	}

	public void setTableRelation( IYCFBamRelationTable value ) {
		tableRelation = value;
	}

	public IYCFBamRelationFactory getFactoryRelation() {
		return( factoryRelation );
	}

	public void setFactoryRelation( IYCFBamRelationFactory value ) {
		factoryRelation = value;
	}

	public IYCFBamRelationColTable getTableRelationCol() {
		return( tableRelationCol );
	}

	public void setTableRelationCol( IYCFBamRelationColTable value ) {
		tableRelationCol = value;
	}

	public IYCFBamRelationColFactory getFactoryRelationCol() {
		return( factoryRelationCol );
	}

	public void setFactoryRelationCol( IYCFBamRelationColFactory value ) {
		factoryRelationCol = value;
	}

	public IYCFBamRoleDefTable getTableRoleDef() {
		return( tableRoleDef );
	}

	public void setTableRoleDef( IYCFBamRoleDefTable value ) {
		tableRoleDef = value;
	}

	public IYCFBamRoleDefFactory getFactoryRoleDef() {
		return( factoryRoleDef );
	}

	public void setFactoryRoleDef( IYCFBamRoleDefFactory value ) {
		factoryRoleDef = value;
	}

	public IYCFBamSchemaDefTable getTableSchemaDef() {
		return( tableSchemaDef );
	}

	public void setTableSchemaDef( IYCFBamSchemaDefTable value ) {
		tableSchemaDef = value;
	}

	public IYCFBamSchemaDefFactory getFactorySchemaDef() {
		return( factorySchemaDef );
	}

	public void setFactorySchemaDef( IYCFBamSchemaDefFactory value ) {
		factorySchemaDef = value;
	}

	public IYCFBamSchemaRefTable getTableSchemaRef() {
		return( tableSchemaRef );
	}

	public void setTableSchemaRef( IYCFBamSchemaRefTable value ) {
		tableSchemaRef = value;
	}

	public IYCFBamSchemaRefFactory getFactorySchemaRef() {
		return( factorySchemaRef );
	}

	public void setFactorySchemaRef( IYCFBamSchemaRefFactory value ) {
		factorySchemaRef = value;
	}

	public IYCFBamSchemaRoleTable getTableSchemaRole() {
		return( tableSchemaRole );
	}

	public void setTableSchemaRole( IYCFBamSchemaRoleTable value ) {
		tableSchemaRole = value;
	}

	public IYCFBamSchemaRoleFactory getFactorySchemaRole() {
		return( factorySchemaRole );
	}

	public void setFactorySchemaRole( IYCFBamSchemaRoleFactory value ) {
		factorySchemaRole = value;
	}

	public IYCFBamSchemaTweakTable getTableSchemaTweak() {
		return( tableSchemaTweak );
	}

	public void setTableSchemaTweak( IYCFBamSchemaTweakTable value ) {
		tableSchemaTweak = value;
	}

	public IYCFBamSchemaTweakFactory getFactorySchemaTweak() {
		return( factorySchemaTweak );
	}

	public void setFactorySchemaTweak( IYCFBamSchemaTweakFactory value ) {
		factorySchemaTweak = value;
	}

	public IYCFBamScopeTable getTableScope() {
		return( tableScope );
	}

	public void setTableScope( IYCFBamScopeTable value ) {
		tableScope = value;
	}

	public IYCFBamScopeFactory getFactoryScope() {
		return( factoryScope );
	}

	public void setFactoryScope( IYCFBamScopeFactory value ) {
		factoryScope = value;
	}

	public IYCFSecSecAppTable getTableSecApp() {
		return( tableSecApp );
	}

	public void setTableSecApp( IYCFSecSecAppTable value ) {
		tableSecApp = value;
	}

	public IYCFSecSecAppFactory getFactorySecApp() {
		return( factorySecApp );
	}

	public void setFactorySecApp( IYCFSecSecAppFactory value ) {
		factorySecApp = value;
	}

	public IYCFSecSecDeviceTable getTableSecDevice() {
		return( tableSecDevice );
	}

	public void setTableSecDevice( IYCFSecSecDeviceTable value ) {
		tableSecDevice = value;
	}

	public IYCFSecSecDeviceFactory getFactorySecDevice() {
		return( factorySecDevice );
	}

	public void setFactorySecDevice( IYCFSecSecDeviceFactory value ) {
		factorySecDevice = value;
	}

	public IYCFSecSecFormTable getTableSecForm() {
		return( tableSecForm );
	}

	public void setTableSecForm( IYCFSecSecFormTable value ) {
		tableSecForm = value;
	}

	public IYCFSecSecFormFactory getFactorySecForm() {
		return( factorySecForm );
	}

	public void setFactorySecForm( IYCFSecSecFormFactory value ) {
		factorySecForm = value;
	}

	public IYCFSecSecGroupTable getTableSecGroup() {
		return( tableSecGroup );
	}

	public void setTableSecGroup( IYCFSecSecGroupTable value ) {
		tableSecGroup = value;
	}

	public IYCFSecSecGroupFactory getFactorySecGroup() {
		return( factorySecGroup );
	}

	public void setFactorySecGroup( IYCFSecSecGroupFactory value ) {
		factorySecGroup = value;
	}

	public IYCFSecSecGroupFormTable getTableSecGroupForm() {
		return( tableSecGroupForm );
	}

	public void setTableSecGroupForm( IYCFSecSecGroupFormTable value ) {
		tableSecGroupForm = value;
	}

	public IYCFSecSecGroupFormFactory getFactorySecGroupForm() {
		return( factorySecGroupForm );
	}

	public void setFactorySecGroupForm( IYCFSecSecGroupFormFactory value ) {
		factorySecGroupForm = value;
	}

	public IYCFSecSecGrpIncTable getTableSecGrpInc() {
		return( tableSecGrpInc );
	}

	public void setTableSecGrpInc( IYCFSecSecGrpIncTable value ) {
		tableSecGrpInc = value;
	}

	public IYCFSecSecGrpIncFactory getFactorySecGrpInc() {
		return( factorySecGrpInc );
	}

	public void setFactorySecGrpInc( IYCFSecSecGrpIncFactory value ) {
		factorySecGrpInc = value;
	}

	public IYCFSecSecGrpMembTable getTableSecGrpMemb() {
		return( tableSecGrpMemb );
	}

	public void setTableSecGrpMemb( IYCFSecSecGrpMembTable value ) {
		tableSecGrpMemb = value;
	}

	public IYCFSecSecGrpMembFactory getFactorySecGrpMemb() {
		return( factorySecGrpMemb );
	}

	public void setFactorySecGrpMemb( IYCFSecSecGrpMembFactory value ) {
		factorySecGrpMemb = value;
	}

	public IYCFSecSecSessionTable getTableSecSession() {
		return( tableSecSession );
	}

	public void setTableSecSession( IYCFSecSecSessionTable value ) {
		tableSecSession = value;
	}

	public IYCFSecSecSessionFactory getFactorySecSession() {
		return( factorySecSession );
	}

	public void setFactorySecSession( IYCFSecSecSessionFactory value ) {
		factorySecSession = value;
	}

	public IYCFSecSecUserTable getTableSecUser() {
		return( tableSecUser );
	}

	public void setTableSecUser( IYCFSecSecUserTable value ) {
		tableSecUser = value;
	}

	public IYCFSecSecUserFactory getFactorySecUser() {
		return( factorySecUser );
	}

	public void setFactorySecUser( IYCFSecSecUserFactory value ) {
		factorySecUser = value;
	}

	public IYCFBamServerListFuncTable getTableServerListFunc() {
		return( tableServerListFunc );
	}

	public void setTableServerListFunc( IYCFBamServerListFuncTable value ) {
		tableServerListFunc = value;
	}

	public IYCFBamServerListFuncFactory getFactoryServerListFunc() {
		return( factoryServerListFunc );
	}

	public void setFactoryServerListFunc( IYCFBamServerListFuncFactory value ) {
		factoryServerListFunc = value;
	}

	public IYCFBamServerMethodTable getTableServerMethod() {
		return( tableServerMethod );
	}

	public void setTableServerMethod( IYCFBamServerMethodTable value ) {
		tableServerMethod = value;
	}

	public IYCFBamServerMethodFactory getFactoryServerMethod() {
		return( factoryServerMethod );
	}

	public void setFactoryServerMethod( IYCFBamServerMethodFactory value ) {
		factoryServerMethod = value;
	}

	public IYCFBamServerObjFuncTable getTableServerObjFunc() {
		return( tableServerObjFunc );
	}

	public void setTableServerObjFunc( IYCFBamServerObjFuncTable value ) {
		tableServerObjFunc = value;
	}

	public IYCFBamServerObjFuncFactory getFactoryServerObjFunc() {
		return( factoryServerObjFunc );
	}

	public void setFactoryServerObjFunc( IYCFBamServerObjFuncFactory value ) {
		factoryServerObjFunc = value;
	}

	public IYCFBamServerProcTable getTableServerProc() {
		return( tableServerProc );
	}

	public void setTableServerProc( IYCFBamServerProcTable value ) {
		tableServerProc = value;
	}

	public IYCFBamServerProcFactory getFactoryServerProc() {
		return( factoryServerProc );
	}

	public void setFactoryServerProc( IYCFBamServerProcFactory value ) {
		factoryServerProc = value;
	}

	public IYCFSecServiceTable getTableService() {
		return( tableService );
	}

	public void setTableService( IYCFSecServiceTable value ) {
		tableService = value;
	}

	public IYCFSecServiceFactory getFactoryService() {
		return( factoryService );
	}

	public void setFactoryService( IYCFSecServiceFactory value ) {
		factoryService = value;
	}

	public IYCFSecServiceTypeTable getTableServiceType() {
		return( tableServiceType );
	}

	public void setTableServiceType( IYCFSecServiceTypeTable value ) {
		tableServiceType = value;
	}

	public IYCFSecServiceTypeFactory getFactoryServiceType() {
		return( factoryServiceType );
	}

	public void setFactoryServiceType( IYCFSecServiceTypeFactory value ) {
		factoryServiceType = value;
	}

	public IYCFBamStringColTable getTableStringCol() {
		return( tableStringCol );
	}

	public void setTableStringCol( IYCFBamStringColTable value ) {
		tableStringCol = value;
	}

	public IYCFBamStringColFactory getFactoryStringCol() {
		return( factoryStringCol );
	}

	public void setFactoryStringCol( IYCFBamStringColFactory value ) {
		factoryStringCol = value;
	}

	public IYCFBamStringDefTable getTableStringDef() {
		return( tableStringDef );
	}

	public void setTableStringDef( IYCFBamStringDefTable value ) {
		tableStringDef = value;
	}

	public IYCFBamStringDefFactory getFactoryStringDef() {
		return( factoryStringDef );
	}

	public void setFactoryStringDef( IYCFBamStringDefFactory value ) {
		factoryStringDef = value;
	}

	public IYCFBamStringTypeTable getTableStringType() {
		return( tableStringType );
	}

	public void setTableStringType( IYCFBamStringTypeTable value ) {
		tableStringType = value;
	}

	public IYCFBamStringTypeFactory getFactoryStringType() {
		return( factoryStringType );
	}

	public void setFactoryStringType( IYCFBamStringTypeFactory value ) {
		factoryStringType = value;
	}

	public IYCFIntSubProjectTable getTableSubProject() {
		return( tableSubProject );
	}

	public void setTableSubProject( IYCFIntSubProjectTable value ) {
		tableSubProject = value;
	}

	public IYCFIntSubProjectFactory getFactorySubProject() {
		return( factorySubProject );
	}

	public void setFactorySubProject( IYCFIntSubProjectFactory value ) {
		factorySubProject = value;
	}

	public IYCFSecSysClusterTable getTableSysCluster() {
		return( tableSysCluster );
	}

	public void setTableSysCluster( IYCFSecSysClusterTable value ) {
		tableSysCluster = value;
	}

	public IYCFSecSysClusterFactory getFactorySysCluster() {
		return( factorySysCluster );
	}

	public void setFactorySysCluster( IYCFSecSysClusterFactory value ) {
		factorySysCluster = value;
	}

	public IYCFSecTSecGroupTable getTableTSecGroup() {
		return( tableTSecGroup );
	}

	public void setTableTSecGroup( IYCFSecTSecGroupTable value ) {
		tableTSecGroup = value;
	}

	public IYCFSecTSecGroupFactory getFactoryTSecGroup() {
		return( factoryTSecGroup );
	}

	public void setFactoryTSecGroup( IYCFSecTSecGroupFactory value ) {
		factoryTSecGroup = value;
	}

	public IYCFSecTSecGrpIncTable getTableTSecGrpInc() {
		return( tableTSecGrpInc );
	}

	public void setTableTSecGrpInc( IYCFSecTSecGrpIncTable value ) {
		tableTSecGrpInc = value;
	}

	public IYCFSecTSecGrpIncFactory getFactoryTSecGrpInc() {
		return( factoryTSecGrpInc );
	}

	public void setFactoryTSecGrpInc( IYCFSecTSecGrpIncFactory value ) {
		factoryTSecGrpInc = value;
	}

	public IYCFSecTSecGrpMembTable getTableTSecGrpMemb() {
		return( tableTSecGrpMemb );
	}

	public void setTableTSecGrpMemb( IYCFSecTSecGrpMembTable value ) {
		tableTSecGrpMemb = value;
	}

	public IYCFSecTSecGrpMembFactory getFactoryTSecGrpMemb() {
		return( factoryTSecGrpMemb );
	}

	public void setFactoryTSecGrpMemb( IYCFSecTSecGrpMembFactory value ) {
		factoryTSecGrpMemb = value;
	}

	public IYCFBamTZDateColTable getTableTZDateCol() {
		return( tableTZDateCol );
	}

	public void setTableTZDateCol( IYCFBamTZDateColTable value ) {
		tableTZDateCol = value;
	}

	public IYCFBamTZDateColFactory getFactoryTZDateCol() {
		return( factoryTZDateCol );
	}

	public void setFactoryTZDateCol( IYCFBamTZDateColFactory value ) {
		factoryTZDateCol = value;
	}

	public IYCFBamTZDateDefTable getTableTZDateDef() {
		return( tableTZDateDef );
	}

	public void setTableTZDateDef( IYCFBamTZDateDefTable value ) {
		tableTZDateDef = value;
	}

	public IYCFBamTZDateDefFactory getFactoryTZDateDef() {
		return( factoryTZDateDef );
	}

	public void setFactoryTZDateDef( IYCFBamTZDateDefFactory value ) {
		factoryTZDateDef = value;
	}

	public IYCFBamTZDateTypeTable getTableTZDateType() {
		return( tableTZDateType );
	}

	public void setTableTZDateType( IYCFBamTZDateTypeTable value ) {
		tableTZDateType = value;
	}

	public IYCFBamTZDateTypeFactory getFactoryTZDateType() {
		return( factoryTZDateType );
	}

	public void setFactoryTZDateType( IYCFBamTZDateTypeFactory value ) {
		factoryTZDateType = value;
	}

	public IYCFBamTZTimeColTable getTableTZTimeCol() {
		return( tableTZTimeCol );
	}

	public void setTableTZTimeCol( IYCFBamTZTimeColTable value ) {
		tableTZTimeCol = value;
	}

	public IYCFBamTZTimeColFactory getFactoryTZTimeCol() {
		return( factoryTZTimeCol );
	}

	public void setFactoryTZTimeCol( IYCFBamTZTimeColFactory value ) {
		factoryTZTimeCol = value;
	}

	public IYCFBamTZTimeDefTable getTableTZTimeDef() {
		return( tableTZTimeDef );
	}

	public void setTableTZTimeDef( IYCFBamTZTimeDefTable value ) {
		tableTZTimeDef = value;
	}

	public IYCFBamTZTimeDefFactory getFactoryTZTimeDef() {
		return( factoryTZTimeDef );
	}

	public void setFactoryTZTimeDef( IYCFBamTZTimeDefFactory value ) {
		factoryTZTimeDef = value;
	}

	public IYCFBamTZTimeTypeTable getTableTZTimeType() {
		return( tableTZTimeType );
	}

	public void setTableTZTimeType( IYCFBamTZTimeTypeTable value ) {
		tableTZTimeType = value;
	}

	public IYCFBamTZTimeTypeFactory getFactoryTZTimeType() {
		return( factoryTZTimeType );
	}

	public void setFactoryTZTimeType( IYCFBamTZTimeTypeFactory value ) {
		factoryTZTimeType = value;
	}

	public IYCFBamTZTimestampColTable getTableTZTimestampCol() {
		return( tableTZTimestampCol );
	}

	public void setTableTZTimestampCol( IYCFBamTZTimestampColTable value ) {
		tableTZTimestampCol = value;
	}

	public IYCFBamTZTimestampColFactory getFactoryTZTimestampCol() {
		return( factoryTZTimestampCol );
	}

	public void setFactoryTZTimestampCol( IYCFBamTZTimestampColFactory value ) {
		factoryTZTimestampCol = value;
	}

	public IYCFBamTZTimestampDefTable getTableTZTimestampDef() {
		return( tableTZTimestampDef );
	}

	public void setTableTZTimestampDef( IYCFBamTZTimestampDefTable value ) {
		tableTZTimestampDef = value;
	}

	public IYCFBamTZTimestampDefFactory getFactoryTZTimestampDef() {
		return( factoryTZTimestampDef );
	}

	public void setFactoryTZTimestampDef( IYCFBamTZTimestampDefFactory value ) {
		factoryTZTimestampDef = value;
	}

	public IYCFBamTZTimestampTypeTable getTableTZTimestampType() {
		return( tableTZTimestampType );
	}

	public void setTableTZTimestampType( IYCFBamTZTimestampTypeTable value ) {
		tableTZTimestampType = value;
	}

	public IYCFBamTZTimestampTypeFactory getFactoryTZTimestampType() {
		return( factoryTZTimestampType );
	}

	public void setFactoryTZTimestampType( IYCFBamTZTimestampTypeFactory value ) {
		factoryTZTimestampType = value;
	}

	public IYCFBamTableTable getTableTable() {
		return( tableTable );
	}

	public void setTableTable( IYCFBamTableTable value ) {
		tableTable = value;
	}

	public IYCFBamTableFactory getFactoryTable() {
		return( factoryTable );
	}

	public void setFactoryTable( IYCFBamTableFactory value ) {
		factoryTable = value;
	}

	public IYCFBamTableColTable getTableTableCol() {
		return( tableTableCol );
	}

	public void setTableTableCol( IYCFBamTableColTable value ) {
		tableTableCol = value;
	}

	public IYCFBamTableColFactory getFactoryTableCol() {
		return( factoryTableCol );
	}

	public void setFactoryTableCol( IYCFBamTableColFactory value ) {
		factoryTableCol = value;
	}

	public IYCFBamTableTweakTable getTableTableTweak() {
		return( tableTableTweak );
	}

	public void setTableTableTweak( IYCFBamTableTweakTable value ) {
		tableTableTweak = value;
	}

	public IYCFBamTableTweakFactory getFactoryTableTweak() {
		return( factoryTableTweak );
	}

	public void setFactoryTableTweak( IYCFBamTableTweakFactory value ) {
		factoryTableTweak = value;
	}

	public IYCFSecTenantTable getTableTenant() {
		return( tableTenant );
	}

	public void setTableTenant( IYCFSecTenantTable value ) {
		tableTenant = value;
	}

	public IYCFSecTenantFactory getFactoryTenant() {
		return( factoryTenant );
	}

	public void setFactoryTenant( IYCFSecTenantFactory value ) {
		factoryTenant = value;
	}

	public IYCFBamTextColTable getTableTextCol() {
		return( tableTextCol );
	}

	public void setTableTextCol( IYCFBamTextColTable value ) {
		tableTextCol = value;
	}

	public IYCFBamTextColFactory getFactoryTextCol() {
		return( factoryTextCol );
	}

	public void setFactoryTextCol( IYCFBamTextColFactory value ) {
		factoryTextCol = value;
	}

	public IYCFBamTextDefTable getTableTextDef() {
		return( tableTextDef );
	}

	public void setTableTextDef( IYCFBamTextDefTable value ) {
		tableTextDef = value;
	}

	public IYCFBamTextDefFactory getFactoryTextDef() {
		return( factoryTextDef );
	}

	public void setFactoryTextDef( IYCFBamTextDefFactory value ) {
		factoryTextDef = value;
	}

	public IYCFBamTextTypeTable getTableTextType() {
		return( tableTextType );
	}

	public void setTableTextType( IYCFBamTextTypeTable value ) {
		tableTextType = value;
	}

	public IYCFBamTextTypeFactory getFactoryTextType() {
		return( factoryTextType );
	}

	public void setFactoryTextType( IYCFBamTextTypeFactory value ) {
		factoryTextType = value;
	}

	public IYCFBamTimeColTable getTableTimeCol() {
		return( tableTimeCol );
	}

	public void setTableTimeCol( IYCFBamTimeColTable value ) {
		tableTimeCol = value;
	}

	public IYCFBamTimeColFactory getFactoryTimeCol() {
		return( factoryTimeCol );
	}

	public void setFactoryTimeCol( IYCFBamTimeColFactory value ) {
		factoryTimeCol = value;
	}

	public IYCFBamTimeDefTable getTableTimeDef() {
		return( tableTimeDef );
	}

	public void setTableTimeDef( IYCFBamTimeDefTable value ) {
		tableTimeDef = value;
	}

	public IYCFBamTimeDefFactory getFactoryTimeDef() {
		return( factoryTimeDef );
	}

	public void setFactoryTimeDef( IYCFBamTimeDefFactory value ) {
		factoryTimeDef = value;
	}

	public IYCFBamTimeTypeTable getTableTimeType() {
		return( tableTimeType );
	}

	public void setTableTimeType( IYCFBamTimeTypeTable value ) {
		tableTimeType = value;
	}

	public IYCFBamTimeTypeFactory getFactoryTimeType() {
		return( factoryTimeType );
	}

	public void setFactoryTimeType( IYCFBamTimeTypeFactory value ) {
		factoryTimeType = value;
	}

	public IYCFBamTimestampColTable getTableTimestampCol() {
		return( tableTimestampCol );
	}

	public void setTableTimestampCol( IYCFBamTimestampColTable value ) {
		tableTimestampCol = value;
	}

	public IYCFBamTimestampColFactory getFactoryTimestampCol() {
		return( factoryTimestampCol );
	}

	public void setFactoryTimestampCol( IYCFBamTimestampColFactory value ) {
		factoryTimestampCol = value;
	}

	public IYCFBamTimestampDefTable getTableTimestampDef() {
		return( tableTimestampDef );
	}

	public void setTableTimestampDef( IYCFBamTimestampDefTable value ) {
		tableTimestampDef = value;
	}

	public IYCFBamTimestampDefFactory getFactoryTimestampDef() {
		return( factoryTimestampDef );
	}

	public void setFactoryTimestampDef( IYCFBamTimestampDefFactory value ) {
		factoryTimestampDef = value;
	}

	public IYCFBamTimestampTypeTable getTableTimestampType() {
		return( tableTimestampType );
	}

	public void setTableTimestampType( IYCFBamTimestampTypeTable value ) {
		tableTimestampType = value;
	}

	public IYCFBamTimestampTypeFactory getFactoryTimestampType() {
		return( factoryTimestampType );
	}

	public void setFactoryTimestampType( IYCFBamTimestampTypeFactory value ) {
		factoryTimestampType = value;
	}

	public IYCFIntTldTable getTableTld() {
		return( tableTld );
	}

	public void setTableTld( IYCFIntTldTable value ) {
		tableTld = value;
	}

	public IYCFIntTldFactory getFactoryTld() {
		return( factoryTld );
	}

	public void setFactoryTld( IYCFIntTldFactory value ) {
		factoryTld = value;
	}

	public IYCFBamTokenColTable getTableTokenCol() {
		return( tableTokenCol );
	}

	public void setTableTokenCol( IYCFBamTokenColTable value ) {
		tableTokenCol = value;
	}

	public IYCFBamTokenColFactory getFactoryTokenCol() {
		return( factoryTokenCol );
	}

	public void setFactoryTokenCol( IYCFBamTokenColFactory value ) {
		factoryTokenCol = value;
	}

	public IYCFBamTokenDefTable getTableTokenDef() {
		return( tableTokenDef );
	}

	public void setTableTokenDef( IYCFBamTokenDefTable value ) {
		tableTokenDef = value;
	}

	public IYCFBamTokenDefFactory getFactoryTokenDef() {
		return( factoryTokenDef );
	}

	public void setFactoryTokenDef( IYCFBamTokenDefFactory value ) {
		factoryTokenDef = value;
	}

	public IYCFBamTokenTypeTable getTableTokenType() {
		return( tableTokenType );
	}

	public void setTableTokenType( IYCFBamTokenTypeTable value ) {
		tableTokenType = value;
	}

	public IYCFBamTokenTypeFactory getFactoryTokenType() {
		return( factoryTokenType );
	}

	public void setFactoryTokenType( IYCFBamTokenTypeFactory value ) {
		factoryTokenType = value;
	}

	public IYCFIntTopDomainTable getTableTopDomain() {
		return( tableTopDomain );
	}

	public void setTableTopDomain( IYCFIntTopDomainTable value ) {
		tableTopDomain = value;
	}

	public IYCFIntTopDomainFactory getFactoryTopDomain() {
		return( factoryTopDomain );
	}

	public void setFactoryTopDomain( IYCFIntTopDomainFactory value ) {
		factoryTopDomain = value;
	}

	public IYCFIntTopProjectTable getTableTopProject() {
		return( tableTopProject );
	}

	public void setTableTopProject( IYCFIntTopProjectTable value ) {
		tableTopProject = value;
	}

	public IYCFIntTopProjectFactory getFactoryTopProject() {
		return( factoryTopProject );
	}

	public void setFactoryTopProject( IYCFIntTopProjectFactory value ) {
		factoryTopProject = value;
	}

	public IYCFBamTweakTable getTableTweak() {
		return( tableTweak );
	}

	public void setTableTweak( IYCFBamTweakTable value ) {
		tableTweak = value;
	}

	public IYCFBamTweakFactory getFactoryTweak() {
		return( factoryTweak );
	}

	public void setFactoryTweak( IYCFBamTweakFactory value ) {
		factoryTweak = value;
	}

	public IYCFBamUInt16ColTable getTableUInt16Col() {
		return( tableUInt16Col );
	}

	public void setTableUInt16Col( IYCFBamUInt16ColTable value ) {
		tableUInt16Col = value;
	}

	public IYCFBamUInt16ColFactory getFactoryUInt16Col() {
		return( factoryUInt16Col );
	}

	public void setFactoryUInt16Col( IYCFBamUInt16ColFactory value ) {
		factoryUInt16Col = value;
	}

	public IYCFBamUInt16DefTable getTableUInt16Def() {
		return( tableUInt16Def );
	}

	public void setTableUInt16Def( IYCFBamUInt16DefTable value ) {
		tableUInt16Def = value;
	}

	public IYCFBamUInt16DefFactory getFactoryUInt16Def() {
		return( factoryUInt16Def );
	}

	public void setFactoryUInt16Def( IYCFBamUInt16DefFactory value ) {
		factoryUInt16Def = value;
	}

	public IYCFBamUInt16TypeTable getTableUInt16Type() {
		return( tableUInt16Type );
	}

	public void setTableUInt16Type( IYCFBamUInt16TypeTable value ) {
		tableUInt16Type = value;
	}

	public IYCFBamUInt16TypeFactory getFactoryUInt16Type() {
		return( factoryUInt16Type );
	}

	public void setFactoryUInt16Type( IYCFBamUInt16TypeFactory value ) {
		factoryUInt16Type = value;
	}

	public IYCFBamUInt32ColTable getTableUInt32Col() {
		return( tableUInt32Col );
	}

	public void setTableUInt32Col( IYCFBamUInt32ColTable value ) {
		tableUInt32Col = value;
	}

	public IYCFBamUInt32ColFactory getFactoryUInt32Col() {
		return( factoryUInt32Col );
	}

	public void setFactoryUInt32Col( IYCFBamUInt32ColFactory value ) {
		factoryUInt32Col = value;
	}

	public IYCFBamUInt32DefTable getTableUInt32Def() {
		return( tableUInt32Def );
	}

	public void setTableUInt32Def( IYCFBamUInt32DefTable value ) {
		tableUInt32Def = value;
	}

	public IYCFBamUInt32DefFactory getFactoryUInt32Def() {
		return( factoryUInt32Def );
	}

	public void setFactoryUInt32Def( IYCFBamUInt32DefFactory value ) {
		factoryUInt32Def = value;
	}

	public IYCFBamUInt32TypeTable getTableUInt32Type() {
		return( tableUInt32Type );
	}

	public void setTableUInt32Type( IYCFBamUInt32TypeTable value ) {
		tableUInt32Type = value;
	}

	public IYCFBamUInt32TypeFactory getFactoryUInt32Type() {
		return( factoryUInt32Type );
	}

	public void setFactoryUInt32Type( IYCFBamUInt32TypeFactory value ) {
		factoryUInt32Type = value;
	}

	public IYCFBamUInt64ColTable getTableUInt64Col() {
		return( tableUInt64Col );
	}

	public void setTableUInt64Col( IYCFBamUInt64ColTable value ) {
		tableUInt64Col = value;
	}

	public IYCFBamUInt64ColFactory getFactoryUInt64Col() {
		return( factoryUInt64Col );
	}

	public void setFactoryUInt64Col( IYCFBamUInt64ColFactory value ) {
		factoryUInt64Col = value;
	}

	public IYCFBamUInt64DefTable getTableUInt64Def() {
		return( tableUInt64Def );
	}

	public void setTableUInt64Def( IYCFBamUInt64DefTable value ) {
		tableUInt64Def = value;
	}

	public IYCFBamUInt64DefFactory getFactoryUInt64Def() {
		return( factoryUInt64Def );
	}

	public void setFactoryUInt64Def( IYCFBamUInt64DefFactory value ) {
		factoryUInt64Def = value;
	}

	public IYCFBamUInt64TypeTable getTableUInt64Type() {
		return( tableUInt64Type );
	}

	public void setTableUInt64Type( IYCFBamUInt64TypeTable value ) {
		tableUInt64Type = value;
	}

	public IYCFBamUInt64TypeFactory getFactoryUInt64Type() {
		return( factoryUInt64Type );
	}

	public void setFactoryUInt64Type( IYCFBamUInt64TypeFactory value ) {
		factoryUInt64Type = value;
	}

	public IYCFIntURLProtocolTable getTableURLProtocol() {
		return( tableURLProtocol );
	}

	public void setTableURLProtocol( IYCFIntURLProtocolTable value ) {
		tableURLProtocol = value;
	}

	public IYCFIntURLProtocolFactory getFactoryURLProtocol() {
		return( factoryURLProtocol );
	}

	public void setFactoryURLProtocol( IYCFIntURLProtocolFactory value ) {
		factoryURLProtocol = value;
	}

	public IYCFBamUuid6ColTable getTableUuid6Col() {
		return( tableUuid6Col );
	}

	public void setTableUuid6Col( IYCFBamUuid6ColTable value ) {
		tableUuid6Col = value;
	}

	public IYCFBamUuid6ColFactory getFactoryUuid6Col() {
		return( factoryUuid6Col );
	}

	public void setFactoryUuid6Col( IYCFBamUuid6ColFactory value ) {
		factoryUuid6Col = value;
	}

	public IYCFBamUuid6DefTable getTableUuid6Def() {
		return( tableUuid6Def );
	}

	public void setTableUuid6Def( IYCFBamUuid6DefTable value ) {
		tableUuid6Def = value;
	}

	public IYCFBamUuid6DefFactory getFactoryUuid6Def() {
		return( factoryUuid6Def );
	}

	public void setFactoryUuid6Def( IYCFBamUuid6DefFactory value ) {
		factoryUuid6Def = value;
	}

	public IYCFBamUuid6GenTable getTableUuid6Gen() {
		return( tableUuid6Gen );
	}

	public void setTableUuid6Gen( IYCFBamUuid6GenTable value ) {
		tableUuid6Gen = value;
	}

	public IYCFBamUuid6GenFactory getFactoryUuid6Gen() {
		return( factoryUuid6Gen );
	}

	public void setFactoryUuid6Gen( IYCFBamUuid6GenFactory value ) {
		factoryUuid6Gen = value;
	}

	public IYCFBamUuid6TypeTable getTableUuid6Type() {
		return( tableUuid6Type );
	}

	public void setTableUuid6Type( IYCFBamUuid6TypeTable value ) {
		tableUuid6Type = value;
	}

	public IYCFBamUuid6TypeFactory getFactoryUuid6Type() {
		return( factoryUuid6Type );
	}

	public void setFactoryUuid6Type( IYCFBamUuid6TypeFactory value ) {
		factoryUuid6Type = value;
	}

	public IYCFBamUuidColTable getTableUuidCol() {
		return( tableUuidCol );
	}

	public void setTableUuidCol( IYCFBamUuidColTable value ) {
		tableUuidCol = value;
	}

	public IYCFBamUuidColFactory getFactoryUuidCol() {
		return( factoryUuidCol );
	}

	public void setFactoryUuidCol( IYCFBamUuidColFactory value ) {
		factoryUuidCol = value;
	}

	public IYCFBamUuidDefTable getTableUuidDef() {
		return( tableUuidDef );
	}

	public void setTableUuidDef( IYCFBamUuidDefTable value ) {
		tableUuidDef = value;
	}

	public IYCFBamUuidDefFactory getFactoryUuidDef() {
		return( factoryUuidDef );
	}

	public void setFactoryUuidDef( IYCFBamUuidDefFactory value ) {
		factoryUuidDef = value;
	}

	public IYCFBamUuidGenTable getTableUuidGen() {
		return( tableUuidGen );
	}

	public void setTableUuidGen( IYCFBamUuidGenTable value ) {
		tableUuidGen = value;
	}

	public IYCFBamUuidGenFactory getFactoryUuidGen() {
		return( factoryUuidGen );
	}

	public void setFactoryUuidGen( IYCFBamUuidGenFactory value ) {
		factoryUuidGen = value;
	}

	public IYCFBamUuidTypeTable getTableUuidType() {
		return( tableUuidType );
	}

	public void setTableUuidType( IYCFBamUuidTypeTable value ) {
		tableUuidType = value;
	}

	public IYCFBamUuidTypeFactory getFactoryUuidType() {
		return( factoryUuidType );
	}

	public void setFactoryUuidType( IYCFBamUuidTypeFactory value ) {
		factoryUuidType = value;
	}

	public IYCFBamValueTable getTableValue() {
		return( tableValue );
	}

	public void setTableValue( IYCFBamValueTable value ) {
		tableValue = value;
	}

	public IYCFBamValueFactory getFactoryValue() {
		return( factoryValue );
	}

	public void setFactoryValue( IYCFBamValueFactory value ) {
		factoryValue = value;
	}

	public boolean isTransactionOpen() {
		throw new YCFLibMustOverrideException( getClass(), "isTransactionOpen" );
	}

	public boolean beginTransaction() {
		throw new YCFLibMustOverrideException( getClass(), "beginTransaction" );
	}

	public void commit() {
		throw new YCFLibMustOverrideException( getClass(), "commit" );
	}

	public void rollback() {
		throw new YCFLibMustOverrideException( getClass(), "rollback" );
	}

	public IYCFSecTablePerms getTablePerms() {
		return( tablePerms );
	}

	public void setTablePerms( IYCFSecTablePerms value ) {
		tablePerms = value;
	}

	public static String xmlEncodeString( String val ) {
		StringBuffer buff = new StringBuffer();
		int len = val.length();
		for( int idx = 0; idx < len; idx ++ ) {
			char c = val.charAt( idx );
			switch( c ) {
				case '&':
					buff.append( "&amp;" );
					break;
				case '<':
					buff.append( "&lt;" );
					break;
				case '>':
					buff.append( "&gt;" );
					break;
				case '"':
					buff.append( "&quot;" );
					break;
				case '\'':
					buff.append( "&apos;" );
					break;
				default:
					buff.append( c );
					break;
			}
		}
		return( buff.toString() );
	}

	/**
	 *	Release any prepared statements bound to this database instance, such
	 *	that the value of schemaDbName has to be re-evaluated for all future
	 *	invocations.
	 */
	public void releasePreparedStatements() {
	}

	/**
	 *	When you first connect to a database, you can opt to specify a database
	 *	schema name to be used by the session.  The implementation code must always
	 *	be dynamically based on the invocation of <tt>String getDbSchemaName()</tt>
	 *	at runtime.
	 *	<p>
	 *	The initial value is defined by the implementing schema model which has inherited
	 *	the expression of the current schema model being expanded.  That is, it is specified
	 *	in the DbSchemaName attribute of a SchemaDef instance.
	 */
	public String getDbSchemaName() {
		return( schemaDbName );
	}

	public String getLowerDbSchemaName() {
		return( lowerDbSchemaName );
	}

	/**
	 *	The database is expected to override this implementation and invoke the
	 *	<tt>super.setDbSchemaName( String argDbSchemaName )</tt> early
	 *	on in the implementation of the cust body.  You should let the exceptions
	 *	which can be thrown by this implementation pass unimpeded.
	 *	<pg>
	 *	When you set the database schema name, the database-specific implementation
	 *	of this method does a "commit; use database"-type sequence to change
	 *	to the target database.  This should be specified globally for all
	 *	database connections in a given cluster, so that all of
	 *	the application implementation clients are using the same database instance
	 *	regardless of what's been provided by the cust client implementation,
	 *	be it as a Java application or a web interface written using JEE.
	 */
	public void setDbSchemaName( String argDbSchemaName ) {
		final String S_ProcName = "setDbSchemaName";
		if( ( argDbSchemaName == null ) || ( argDbSchemaName.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"argDbSchemaName" );
		}
		schemaDbName = argDbSchemaName;
		lowerDbSchemaName = schemaDbName.toLowerCase();
	}
}
