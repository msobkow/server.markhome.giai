
// Description: Java 11 in-memory RAM DbIO implementation for GenFile.

/*
 *	org.mssycf.mssycf.YCFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory YCFCore 2.13 Generation Knowledgebase
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbRam;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;

/*
 *	YCFGenKbRamGenFileTable in-memory RAM DbIO implementation
 *	for GenFile.
 */
public class YCFGenKbRamGenFileTable
	implements IYCFGenKbGenFileTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbGenItemPKey,
				YCFGenKbGenFileBuff > dictByPKey
		= new HashMap< YCFGenKbGenItemPKey,
				YCFGenKbGenFileBuff >();
	private Map< YCFGenKbGenFileByXSrcBundleKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenFileBuff >> dictByXSrcBundle
		= new HashMap< YCFGenKbGenFileByXSrcBundleKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenFileBuff >>();
	private Map< YCFGenKbGenFileByXModNameKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenFileBuff >> dictByXModName
		= new HashMap< YCFGenKbGenFileByXModNameKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenFileBuff >>();
	private Map< YCFGenKbGenFileByXBasePkgKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenFileBuff >> dictByXBasePkg
		= new HashMap< YCFGenKbGenFileByXBasePkgKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenFileBuff >>();
	private Map< YCFGenKbGenFileByXSubPkgKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenFileBuff >> dictByXSubPkg
		= new HashMap< YCFGenKbGenFileByXSubPkgKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenFileBuff >>();
	private Map< YCFGenKbGenFileByXExpClsNameKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenFileBuff >> dictByXExpClsName
		= new HashMap< YCFGenKbGenFileByXExpClsNameKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenFileBuff >>();
	private Map< YCFGenKbGenFileByXExpKeyNameKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenFileBuff >> dictByXExpKeyName
		= new HashMap< YCFGenKbGenFileByXExpKeyNameKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenFileBuff >>();
	private Map< YCFGenKbGenFileByXExpFileNameKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenFileBuff >> dictByXExpFileName
		= new HashMap< YCFGenKbGenFileByXExpFileNameKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenFileBuff >>();

	public YCFGenKbRamGenFileTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createGenFile( YCFGenKbAuthorization Authorization,
		YCFGenKbGenFileBuff Buff )
	{
		final String S_ProcName = "createGenFile";
		schema.getTableGenRule().createGenRule( Authorization,
			Buff );
		YCFGenKbGenItemPKey pkey = schema.getFactoryGenItem().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredCartridgeId( Buff.getRequiredCartridgeId() );
		pkey.setRequiredItemId( Buff.getRequiredItemId() );
		YCFGenKbGenFileByXSrcBundleKey keyXSrcBundle = schema.getFactoryGenFile().newXSrcBundleKey();
		keyXSrcBundle.setOptionalSourceBundleTenantId( Buff.getOptionalSourceBundleTenantId() );
		keyXSrcBundle.setOptionalSourceBundleGelCacheId( Buff.getOptionalSourceBundleGelCacheId() );
		keyXSrcBundle.setOptionalSourceBundleGelId( Buff.getOptionalSourceBundleGelId() );

		YCFGenKbGenFileByXModNameKey keyXModName = schema.getFactoryGenFile().newXModNameKey();
		keyXModName.setOptionalModuleNameTenantId( Buff.getOptionalModuleNameTenantId() );
		keyXModName.setOptionalModuleNameGelCacheId( Buff.getOptionalModuleNameGelCacheId() );
		keyXModName.setOptionalModuleNameGelId( Buff.getOptionalModuleNameGelId() );

		YCFGenKbGenFileByXBasePkgKey keyXBasePkg = schema.getFactoryGenFile().newXBasePkgKey();
		keyXBasePkg.setOptionalBasePackageTenantId( Buff.getOptionalBasePackageTenantId() );
		keyXBasePkg.setOptionalBasePackageGelCacheId( Buff.getOptionalBasePackageGelCacheId() );
		keyXBasePkg.setOptionalBasePackageGelId( Buff.getOptionalBasePackageGelId() );

		YCFGenKbGenFileByXSubPkgKey keyXSubPkg = schema.getFactoryGenFile().newXSubPkgKey();
		keyXSubPkg.setOptionalSubPackageTenantId( Buff.getOptionalSubPackageTenantId() );
		keyXSubPkg.setOptionalSubPackageGelCacheId( Buff.getOptionalSubPackageGelCacheId() );
		keyXSubPkg.setOptionalSubPackageGelId( Buff.getOptionalSubPackageGelId() );

		YCFGenKbGenFileByXExpClsNameKey keyXExpClsName = schema.getFactoryGenFile().newXExpClsNameKey();
		keyXExpClsName.setOptionalExpansionClassNameTenantId( Buff.getOptionalExpansionClassNameTenantId() );
		keyXExpClsName.setOptionalExpansionClassNameGelCacheId( Buff.getOptionalExpansionClassNameGelCacheId() );
		keyXExpClsName.setOptionalExpansionClassNameGelId( Buff.getOptionalExpansionClassNameGelId() );

		YCFGenKbGenFileByXExpKeyNameKey keyXExpKeyName = schema.getFactoryGenFile().newXExpKeyNameKey();
		keyXExpKeyName.setOptionalExpansionKeyNameTenantId( Buff.getOptionalExpansionKeyNameTenantId() );
		keyXExpKeyName.setOptionalExpansionKeyNameGelCacheId( Buff.getOptionalExpansionKeyNameGelCacheId() );
		keyXExpKeyName.setOptionalExpansionKeyNameGelId( Buff.getOptionalExpansionKeyNameGelId() );

		YCFGenKbGenFileByXExpFileNameKey keyXExpFileName = schema.getFactoryGenFile().newXExpFileNameKey();
		keyXExpFileName.setOptionalExpansionFileNameTenantId( Buff.getOptionalExpansionFileNameTenantId() );
		keyXExpFileName.setOptionalExpansionFileNameGelCacheId( Buff.getOptionalExpansionFileNameGelCacheId() );
		keyXExpFileName.setOptionalExpansionFileNameGelId( Buff.getOptionalExpansionFileNameGelId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableGenRule().readDerivedByItemIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredCartridgeId(),
						Buff.getRequiredItemId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Superclass",
						"SuperClass",
						"GenRule",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff > subdictXSrcBundle;
		if( dictByXSrcBundle.containsKey( keyXSrcBundle ) ) {
			subdictXSrcBundle = dictByXSrcBundle.get( keyXSrcBundle );
		}
		else {
			subdictXSrcBundle = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff >();
			dictByXSrcBundle.put( keyXSrcBundle, subdictXSrcBundle );
		}
		subdictXSrcBundle.put( pkey, Buff );

		Map< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff > subdictXModName;
		if( dictByXModName.containsKey( keyXModName ) ) {
			subdictXModName = dictByXModName.get( keyXModName );
		}
		else {
			subdictXModName = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff >();
			dictByXModName.put( keyXModName, subdictXModName );
		}
		subdictXModName.put( pkey, Buff );

		Map< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff > subdictXBasePkg;
		if( dictByXBasePkg.containsKey( keyXBasePkg ) ) {
			subdictXBasePkg = dictByXBasePkg.get( keyXBasePkg );
		}
		else {
			subdictXBasePkg = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff >();
			dictByXBasePkg.put( keyXBasePkg, subdictXBasePkg );
		}
		subdictXBasePkg.put( pkey, Buff );

		Map< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff > subdictXSubPkg;
		if( dictByXSubPkg.containsKey( keyXSubPkg ) ) {
			subdictXSubPkg = dictByXSubPkg.get( keyXSubPkg );
		}
		else {
			subdictXSubPkg = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff >();
			dictByXSubPkg.put( keyXSubPkg, subdictXSubPkg );
		}
		subdictXSubPkg.put( pkey, Buff );

		Map< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff > subdictXExpClsName;
		if( dictByXExpClsName.containsKey( keyXExpClsName ) ) {
			subdictXExpClsName = dictByXExpClsName.get( keyXExpClsName );
		}
		else {
			subdictXExpClsName = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff >();
			dictByXExpClsName.put( keyXExpClsName, subdictXExpClsName );
		}
		subdictXExpClsName.put( pkey, Buff );

		Map< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff > subdictXExpKeyName;
		if( dictByXExpKeyName.containsKey( keyXExpKeyName ) ) {
			subdictXExpKeyName = dictByXExpKeyName.get( keyXExpKeyName );
		}
		else {
			subdictXExpKeyName = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff >();
			dictByXExpKeyName.put( keyXExpKeyName, subdictXExpKeyName );
		}
		subdictXExpKeyName.put( pkey, Buff );

		Map< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff > subdictXExpFileName;
		if( dictByXExpFileName.containsKey( keyXExpFileName ) ) {
			subdictXExpFileName = dictByXExpFileName.get( keyXExpFileName );
		}
		else {
			subdictXExpFileName = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff >();
			dictByXExpFileName.put( keyXExpFileName, subdictXExpFileName );
		}
		subdictXExpFileName.put( pkey, Buff );

	}

	public YCFGenKbGenFileBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGenFile.readDerived";
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredCartridgeId( PKey.getRequiredCartridgeId() );
		key.setRequiredItemId( PKey.getRequiredItemId() );
		YCFGenKbGenFileBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenFileBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGenFile.readDerived";
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredCartridgeId( PKey.getRequiredCartridgeId() );
		key.setRequiredItemId( PKey.getRequiredItemId() );
		YCFGenKbGenFileBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenFileBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamGenFile.readAllDerived";
		YCFGenKbGenFileBuff[] retList = new YCFGenKbGenFileBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbGenFileBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbGenFileBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByTenantIdx";
		YCFGenKbGenItemBuff buffList[] = schema.getTableGenItem().readDerivedByTenantIdx( Authorization,
			TenantId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFGenKbGenItemBuff buff;
			ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenFileBuff ) ) {
					filteredList.add( (YCFGenKbGenFileBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
		}
	}

	public YCFGenKbGenFileBuff[] readDerivedByCartIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByCartIdx";
		YCFGenKbGenItemBuff buffList[] = schema.getTableGenItem().readDerivedByCartIdx( Authorization,
			TenantId,
			CartridgeId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFGenKbGenItemBuff buff;
			ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenFileBuff ) ) {
					filteredList.add( (YCFGenKbGenFileBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
		}
	}

	public YCFGenKbGenFileBuff[] readDerivedByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		short RuleTypeId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByRuleTypeIdx";
		YCFGenKbGenItemBuff buffList[] = schema.getTableGenItem().readDerivedByRuleTypeIdx( Authorization,
			RuleTypeId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFGenKbGenItemBuff buff;
			ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenFileBuff ) ) {
					filteredList.add( (YCFGenKbGenFileBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
		}
	}

	public YCFGenKbGenFileBuff[] readDerivedByToolSetIdx( YCFGenKbAuthorization Authorization,
		short ToolSetId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByToolSetIdx";
		YCFGenKbGenItemBuff buffList[] = schema.getTableGenItem().readDerivedByToolSetIdx( Authorization,
			ToolSetId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFGenKbGenItemBuff buff;
			ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenFileBuff ) ) {
					filteredList.add( (YCFGenKbGenFileBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
		}
	}

	public YCFGenKbGenFileBuff[] readDerivedByScopeIdx( YCFGenKbAuthorization Authorization,
		Short ScopeDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByScopeIdx";
		YCFGenKbGenItemBuff buffList[] = schema.getTableGenItem().readDerivedByScopeIdx( Authorization,
			ScopeDefId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFGenKbGenItemBuff buff;
			ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenFileBuff ) ) {
					filteredList.add( (YCFGenKbGenFileBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
		}
	}

	public YCFGenKbGenFileBuff[] readDerivedByGenDefIdx( YCFGenKbAuthorization Authorization,
		short GenDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByGenDefIdx";
		YCFGenKbGenItemBuff buffList[] = schema.getTableGenItem().readDerivedByGenDefIdx( Authorization,
			GenDefId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFGenKbGenItemBuff buff;
			ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenFileBuff ) ) {
					filteredList.add( (YCFGenKbGenFileBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
		}
	}

	public YCFGenKbGenFileBuff readDerivedByAltIdx( YCFGenKbAuthorization Authorization,
		String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByAltIdx";
		YCFGenKbGenItemBuff buff = schema.getTableGenItem().readDerivedByAltIdx( Authorization,
			Name,
			ToolSetId,
			ScopeDefId,
			GenDefId );
		if( buff == null ) {
			return( null );
		}
		else if( buff instanceof YCFGenKbGenFileBuff ) {
			return( (YCFGenKbGenFileBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGenFileBuff[] readDerivedByGelExecIdx( YCFGenKbAuthorization Authorization,
		Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByGelExecIdx";
		YCFGenKbGenItemBuff buffList[] = schema.getTableGenItem().readDerivedByGelExecIdx( Authorization,
			GelExecutableTenantId,
			GelExecutableGelCacheId,
			GelExecutableId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFGenKbGenItemBuff buff;
			ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenFileBuff ) ) {
					filteredList.add( (YCFGenKbGenFileBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
		}
	}

	public YCFGenKbGenFileBuff[] readDerivedByProbeIdx( YCFGenKbAuthorization Authorization,
		Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByProbeIdx";
		YCFGenKbGenItemBuff buffList[] = schema.getTableGenItem().readDerivedByProbeIdx( Authorization,
			ProbeTenantId,
			ProbeCartridgeId,
			ProbeGenItemId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFGenKbGenItemBuff buff;
			ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenFileBuff ) ) {
					filteredList.add( (YCFGenKbGenFileBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
		}
	}

	public YCFGenKbGenFileBuff[] readDerivedByBodyIdx( YCFGenKbAuthorization Authorization,
		Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId )
	{
		final String S_ProcName = "YCFGenKbRamGenRule.readDerivedByBodyIdx";
		YCFGenKbGenRuleBuff buffList[] = schema.getTableGenRule().readDerivedByBodyIdx( Authorization,
			BodyTenantId,
			BodyGelCacheId,
			BodyGelId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFGenKbGenRuleBuff buff;
			ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenFileBuff ) ) {
					filteredList.add( (YCFGenKbGenFileBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
		}
	}

	public YCFGenKbGenFileBuff[] readDerivedByXSrcBundle( YCFGenKbAuthorization Authorization,
		Long SourceBundleTenantId,
		Long SourceBundleGelCacheId,
		Long SourceBundleGelId )
	{
		final String S_ProcName = "YCFGenKbRamGenFile.readDerivedByXSrcBundle";
		YCFGenKbGenFileByXSrcBundleKey key = schema.getFactoryGenFile().newXSrcBundleKey();
		key.setOptionalSourceBundleTenantId( SourceBundleTenantId );
		key.setOptionalSourceBundleGelCacheId( SourceBundleGelCacheId );
		key.setOptionalSourceBundleGelId( SourceBundleGelId );

		YCFGenKbGenFileBuff[] recArray;
		if( dictByXSrcBundle.containsKey( key ) ) {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff > subdictXSrcBundle
				= dictByXSrcBundle.get( key );
			recArray = new YCFGenKbGenFileBuff[ subdictXSrcBundle.size() ];
			Iterator< YCFGenKbGenFileBuff > iter = subdictXSrcBundle.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff > subdictXSrcBundle
				= new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff >();
			dictByXSrcBundle.put( key, subdictXSrcBundle );
			recArray = new YCFGenKbGenFileBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGenFileBuff[] readDerivedByXModName( YCFGenKbAuthorization Authorization,
		Long ModuleNameTenantId,
		Long ModuleNameGelCacheId,
		Long ModuleNameGelId )
	{
		final String S_ProcName = "YCFGenKbRamGenFile.readDerivedByXModName";
		YCFGenKbGenFileByXModNameKey key = schema.getFactoryGenFile().newXModNameKey();
		key.setOptionalModuleNameTenantId( ModuleNameTenantId );
		key.setOptionalModuleNameGelCacheId( ModuleNameGelCacheId );
		key.setOptionalModuleNameGelId( ModuleNameGelId );

		YCFGenKbGenFileBuff[] recArray;
		if( dictByXModName.containsKey( key ) ) {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff > subdictXModName
				= dictByXModName.get( key );
			recArray = new YCFGenKbGenFileBuff[ subdictXModName.size() ];
			Iterator< YCFGenKbGenFileBuff > iter = subdictXModName.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff > subdictXModName
				= new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff >();
			dictByXModName.put( key, subdictXModName );
			recArray = new YCFGenKbGenFileBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGenFileBuff[] readDerivedByXBasePkg( YCFGenKbAuthorization Authorization,
		Long BasePackageTenantId,
		Long BasePackageGelCacheId,
		Long BasePackageGelId )
	{
		final String S_ProcName = "YCFGenKbRamGenFile.readDerivedByXBasePkg";
		YCFGenKbGenFileByXBasePkgKey key = schema.getFactoryGenFile().newXBasePkgKey();
		key.setOptionalBasePackageTenantId( BasePackageTenantId );
		key.setOptionalBasePackageGelCacheId( BasePackageGelCacheId );
		key.setOptionalBasePackageGelId( BasePackageGelId );

		YCFGenKbGenFileBuff[] recArray;
		if( dictByXBasePkg.containsKey( key ) ) {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff > subdictXBasePkg
				= dictByXBasePkg.get( key );
			recArray = new YCFGenKbGenFileBuff[ subdictXBasePkg.size() ];
			Iterator< YCFGenKbGenFileBuff > iter = subdictXBasePkg.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff > subdictXBasePkg
				= new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff >();
			dictByXBasePkg.put( key, subdictXBasePkg );
			recArray = new YCFGenKbGenFileBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGenFileBuff[] readDerivedByXSubPkg( YCFGenKbAuthorization Authorization,
		Long SubPackageTenantId,
		Long SubPackageGelCacheId,
		Long SubPackageGelId )
	{
		final String S_ProcName = "YCFGenKbRamGenFile.readDerivedByXSubPkg";
		YCFGenKbGenFileByXSubPkgKey key = schema.getFactoryGenFile().newXSubPkgKey();
		key.setOptionalSubPackageTenantId( SubPackageTenantId );
		key.setOptionalSubPackageGelCacheId( SubPackageGelCacheId );
		key.setOptionalSubPackageGelId( SubPackageGelId );

		YCFGenKbGenFileBuff[] recArray;
		if( dictByXSubPkg.containsKey( key ) ) {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff > subdictXSubPkg
				= dictByXSubPkg.get( key );
			recArray = new YCFGenKbGenFileBuff[ subdictXSubPkg.size() ];
			Iterator< YCFGenKbGenFileBuff > iter = subdictXSubPkg.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff > subdictXSubPkg
				= new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff >();
			dictByXSubPkg.put( key, subdictXSubPkg );
			recArray = new YCFGenKbGenFileBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGenFileBuff[] readDerivedByXExpClsName( YCFGenKbAuthorization Authorization,
		Long ExpansionClassNameTenantId,
		Long ExpansionClassNameGelCacheId,
		Long ExpansionClassNameGelId )
	{
		final String S_ProcName = "YCFGenKbRamGenFile.readDerivedByXExpClsName";
		YCFGenKbGenFileByXExpClsNameKey key = schema.getFactoryGenFile().newXExpClsNameKey();
		key.setOptionalExpansionClassNameTenantId( ExpansionClassNameTenantId );
		key.setOptionalExpansionClassNameGelCacheId( ExpansionClassNameGelCacheId );
		key.setOptionalExpansionClassNameGelId( ExpansionClassNameGelId );

		YCFGenKbGenFileBuff[] recArray;
		if( dictByXExpClsName.containsKey( key ) ) {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff > subdictXExpClsName
				= dictByXExpClsName.get( key );
			recArray = new YCFGenKbGenFileBuff[ subdictXExpClsName.size() ];
			Iterator< YCFGenKbGenFileBuff > iter = subdictXExpClsName.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff > subdictXExpClsName
				= new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff >();
			dictByXExpClsName.put( key, subdictXExpClsName );
			recArray = new YCFGenKbGenFileBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGenFileBuff[] readDerivedByXExpKeyName( YCFGenKbAuthorization Authorization,
		Long ExpansionKeyNameTenantId,
		Long ExpansionKeyNameGelCacheId,
		Long ExpansionKeyNameGelId )
	{
		final String S_ProcName = "YCFGenKbRamGenFile.readDerivedByXExpKeyName";
		YCFGenKbGenFileByXExpKeyNameKey key = schema.getFactoryGenFile().newXExpKeyNameKey();
		key.setOptionalExpansionKeyNameTenantId( ExpansionKeyNameTenantId );
		key.setOptionalExpansionKeyNameGelCacheId( ExpansionKeyNameGelCacheId );
		key.setOptionalExpansionKeyNameGelId( ExpansionKeyNameGelId );

		YCFGenKbGenFileBuff[] recArray;
		if( dictByXExpKeyName.containsKey( key ) ) {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff > subdictXExpKeyName
				= dictByXExpKeyName.get( key );
			recArray = new YCFGenKbGenFileBuff[ subdictXExpKeyName.size() ];
			Iterator< YCFGenKbGenFileBuff > iter = subdictXExpKeyName.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff > subdictXExpKeyName
				= new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff >();
			dictByXExpKeyName.put( key, subdictXExpKeyName );
			recArray = new YCFGenKbGenFileBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGenFileBuff[] readDerivedByXExpFileName( YCFGenKbAuthorization Authorization,
		Long ExpansionFileNameTenantId,
		Long ExpansionFileNameGelCacheId,
		Long ExpansionFileNameGelId )
	{
		final String S_ProcName = "YCFGenKbRamGenFile.readDerivedByXExpFileName";
		YCFGenKbGenFileByXExpFileNameKey key = schema.getFactoryGenFile().newXExpFileNameKey();
		key.setOptionalExpansionFileNameTenantId( ExpansionFileNameTenantId );
		key.setOptionalExpansionFileNameGelCacheId( ExpansionFileNameGelCacheId );
		key.setOptionalExpansionFileNameGelId( ExpansionFileNameGelId );

		YCFGenKbGenFileBuff[] recArray;
		if( dictByXExpFileName.containsKey( key ) ) {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff > subdictXExpFileName
				= dictByXExpFileName.get( key );
			recArray = new YCFGenKbGenFileBuff[ subdictXExpFileName.size() ];
			Iterator< YCFGenKbGenFileBuff > iter = subdictXExpFileName.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff > subdictXExpFileName
				= new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff >();
			dictByXExpFileName.put( key, subdictXExpFileName );
			recArray = new YCFGenKbGenFileBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGenFileBuff readDerivedByItemIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId,
		long ItemId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByItemIdIdx() ";
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		key.setRequiredItemId( ItemId );

		YCFGenKbGenFileBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenFileBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGenFile.readBuff";
		YCFGenKbGenFileBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a932" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenFileBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbGenFileBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a932" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenFileBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamGenFile.readAllBuff";
		YCFGenKbGenFileBuff buff;
		ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
		YCFGenKbGenFileBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a932" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
	}

	public YCFGenKbGenFileBuff readBuffByItemIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId,
		long ItemId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByItemIdIdx() ";
		YCFGenKbGenFileBuff buff = readDerivedByItemIdIdx( Authorization,
			TenantId,
			CartridgeId,
			ItemId );
		if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
			return( (YCFGenKbGenFileBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGenFileBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByTenantIdx() ";
		YCFGenKbGenFileBuff buff;
		ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
		YCFGenKbGenFileBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenFileBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
	}

	public YCFGenKbGenFileBuff[] readBuffByCartIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByCartIdx() ";
		YCFGenKbGenFileBuff buff;
		ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
		YCFGenKbGenFileBuff[] buffList = readDerivedByCartIdx( Authorization,
			TenantId,
			CartridgeId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenFileBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
	}

	public YCFGenKbGenFileBuff[] readBuffByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		short RuleTypeId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByRuleTypeIdx() ";
		YCFGenKbGenFileBuff buff;
		ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
		YCFGenKbGenFileBuff[] buffList = readDerivedByRuleTypeIdx( Authorization,
			RuleTypeId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenFileBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
	}

	public YCFGenKbGenFileBuff[] readBuffByToolSetIdx( YCFGenKbAuthorization Authorization,
		short ToolSetId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByToolSetIdx() ";
		YCFGenKbGenFileBuff buff;
		ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
		YCFGenKbGenFileBuff[] buffList = readDerivedByToolSetIdx( Authorization,
			ToolSetId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenFileBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
	}

	public YCFGenKbGenFileBuff[] readBuffByScopeIdx( YCFGenKbAuthorization Authorization,
		Short ScopeDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByScopeIdx() ";
		YCFGenKbGenFileBuff buff;
		ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
		YCFGenKbGenFileBuff[] buffList = readDerivedByScopeIdx( Authorization,
			ScopeDefId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenFileBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
	}

	public YCFGenKbGenFileBuff[] readBuffByGenDefIdx( YCFGenKbAuthorization Authorization,
		short GenDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByGenDefIdx() ";
		YCFGenKbGenFileBuff buff;
		ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
		YCFGenKbGenFileBuff[] buffList = readDerivedByGenDefIdx( Authorization,
			GenDefId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenFileBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
	}

	public YCFGenKbGenFileBuff readBuffByAltIdx( YCFGenKbAuthorization Authorization,
		String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByAltIdx() ";
		YCFGenKbGenFileBuff buff = readDerivedByAltIdx( Authorization,
			Name,
			ToolSetId,
			ScopeDefId,
			GenDefId );
		if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
			return( (YCFGenKbGenFileBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGenFileBuff[] readBuffByGelExecIdx( YCFGenKbAuthorization Authorization,
		Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByGelExecIdx() ";
		YCFGenKbGenFileBuff buff;
		ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
		YCFGenKbGenFileBuff[] buffList = readDerivedByGelExecIdx( Authorization,
			GelExecutableTenantId,
			GelExecutableGelCacheId,
			GelExecutableId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenFileBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
	}

	public YCFGenKbGenFileBuff[] readBuffByProbeIdx( YCFGenKbAuthorization Authorization,
		Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByProbeIdx() ";
		YCFGenKbGenFileBuff buff;
		ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
		YCFGenKbGenFileBuff[] buffList = readDerivedByProbeIdx( Authorization,
			ProbeTenantId,
			ProbeCartridgeId,
			ProbeGenItemId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenFileBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
	}

	public YCFGenKbGenFileBuff[] readBuffByBodyIdx( YCFGenKbAuthorization Authorization,
		Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId )
	{
		final String S_ProcName = "YCFGenKbRamGenRule.readBuffByBodyIdx() ";
		YCFGenKbGenFileBuff buff;
		ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
		YCFGenKbGenFileBuff[] buffList = readDerivedByBodyIdx( Authorization,
			BodyTenantId,
			BodyGelCacheId,
			BodyGelId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a923" ) ) {
				filteredList.add( (YCFGenKbGenFileBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
	}

	public YCFGenKbGenFileBuff[] readBuffByXSrcBundle( YCFGenKbAuthorization Authorization,
		Long SourceBundleTenantId,
		Long SourceBundleGelCacheId,
		Long SourceBundleGelId )
	{
		final String S_ProcName = "YCFGenKbRamGenFile.readBuffByXSrcBundle() ";
		YCFGenKbGenFileBuff buff;
		ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
		YCFGenKbGenFileBuff[] buffList = readDerivedByXSrcBundle( Authorization,
			SourceBundleTenantId,
			SourceBundleGelCacheId,
			SourceBundleGelId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a932" ) ) {
				filteredList.add( (YCFGenKbGenFileBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
	}

	public YCFGenKbGenFileBuff[] readBuffByXModName( YCFGenKbAuthorization Authorization,
		Long ModuleNameTenantId,
		Long ModuleNameGelCacheId,
		Long ModuleNameGelId )
	{
		final String S_ProcName = "YCFGenKbRamGenFile.readBuffByXModName() ";
		YCFGenKbGenFileBuff buff;
		ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
		YCFGenKbGenFileBuff[] buffList = readDerivedByXModName( Authorization,
			ModuleNameTenantId,
			ModuleNameGelCacheId,
			ModuleNameGelId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a932" ) ) {
				filteredList.add( (YCFGenKbGenFileBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
	}

	public YCFGenKbGenFileBuff[] readBuffByXBasePkg( YCFGenKbAuthorization Authorization,
		Long BasePackageTenantId,
		Long BasePackageGelCacheId,
		Long BasePackageGelId )
	{
		final String S_ProcName = "YCFGenKbRamGenFile.readBuffByXBasePkg() ";
		YCFGenKbGenFileBuff buff;
		ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
		YCFGenKbGenFileBuff[] buffList = readDerivedByXBasePkg( Authorization,
			BasePackageTenantId,
			BasePackageGelCacheId,
			BasePackageGelId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a932" ) ) {
				filteredList.add( (YCFGenKbGenFileBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
	}

	public YCFGenKbGenFileBuff[] readBuffByXSubPkg( YCFGenKbAuthorization Authorization,
		Long SubPackageTenantId,
		Long SubPackageGelCacheId,
		Long SubPackageGelId )
	{
		final String S_ProcName = "YCFGenKbRamGenFile.readBuffByXSubPkg() ";
		YCFGenKbGenFileBuff buff;
		ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
		YCFGenKbGenFileBuff[] buffList = readDerivedByXSubPkg( Authorization,
			SubPackageTenantId,
			SubPackageGelCacheId,
			SubPackageGelId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a932" ) ) {
				filteredList.add( (YCFGenKbGenFileBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
	}

	public YCFGenKbGenFileBuff[] readBuffByXExpClsName( YCFGenKbAuthorization Authorization,
		Long ExpansionClassNameTenantId,
		Long ExpansionClassNameGelCacheId,
		Long ExpansionClassNameGelId )
	{
		final String S_ProcName = "YCFGenKbRamGenFile.readBuffByXExpClsName() ";
		YCFGenKbGenFileBuff buff;
		ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
		YCFGenKbGenFileBuff[] buffList = readDerivedByXExpClsName( Authorization,
			ExpansionClassNameTenantId,
			ExpansionClassNameGelCacheId,
			ExpansionClassNameGelId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a932" ) ) {
				filteredList.add( (YCFGenKbGenFileBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
	}

	public YCFGenKbGenFileBuff[] readBuffByXExpKeyName( YCFGenKbAuthorization Authorization,
		Long ExpansionKeyNameTenantId,
		Long ExpansionKeyNameGelCacheId,
		Long ExpansionKeyNameGelId )
	{
		final String S_ProcName = "YCFGenKbRamGenFile.readBuffByXExpKeyName() ";
		YCFGenKbGenFileBuff buff;
		ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
		YCFGenKbGenFileBuff[] buffList = readDerivedByXExpKeyName( Authorization,
			ExpansionKeyNameTenantId,
			ExpansionKeyNameGelCacheId,
			ExpansionKeyNameGelId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a932" ) ) {
				filteredList.add( (YCFGenKbGenFileBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
	}

	public YCFGenKbGenFileBuff[] readBuffByXExpFileName( YCFGenKbAuthorization Authorization,
		Long ExpansionFileNameTenantId,
		Long ExpansionFileNameGelCacheId,
		Long ExpansionFileNameGelId )
	{
		final String S_ProcName = "YCFGenKbRamGenFile.readBuffByXExpFileName() ";
		YCFGenKbGenFileBuff buff;
		ArrayList<YCFGenKbGenFileBuff> filteredList = new ArrayList<YCFGenKbGenFileBuff>();
		YCFGenKbGenFileBuff[] buffList = readDerivedByXExpFileName( Authorization,
			ExpansionFileNameTenantId,
			ExpansionFileNameGelCacheId,
			ExpansionFileNameGelId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a932" ) ) {
				filteredList.add( (YCFGenKbGenFileBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenFileBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific GenFile buffer instances identified by the duplicate key BodyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argBodyTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGenFileBuff[] pageBuffByBodyIdx( YCFGenKbAuthorization Authorization,
		Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId,
		Long priorTenantId,
		Long priorCartridgeId,
		Long priorItemId )
	{
		final String S_ProcName = "pageBuffByBodyIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific GenFile buffer instances identified by the duplicate key XSrcBundle.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSourceBundleTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argSourceBundleGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argSourceBundleGelId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGenFileBuff[] pageBuffByXSrcBundle( YCFGenKbAuthorization Authorization,
		Long SourceBundleTenantId,
		Long SourceBundleGelCacheId,
		Long SourceBundleGelId,
		Long priorTenantId,
		Long priorCartridgeId,
		Long priorItemId )
	{
		final String S_ProcName = "pageBuffByXSrcBundle";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific GenFile buffer instances identified by the duplicate key XModName.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argModuleNameTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argModuleNameGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argModuleNameGelId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGenFileBuff[] pageBuffByXModName( YCFGenKbAuthorization Authorization,
		Long ModuleNameTenantId,
		Long ModuleNameGelCacheId,
		Long ModuleNameGelId,
		Long priorTenantId,
		Long priorCartridgeId,
		Long priorItemId )
	{
		final String S_ProcName = "pageBuffByXModName";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific GenFile buffer instances identified by the duplicate key XBasePkg.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argBasePackageTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argBasePackageGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argBasePackageGelId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGenFileBuff[] pageBuffByXBasePkg( YCFGenKbAuthorization Authorization,
		Long BasePackageTenantId,
		Long BasePackageGelCacheId,
		Long BasePackageGelId,
		Long priorTenantId,
		Long priorCartridgeId,
		Long priorItemId )
	{
		final String S_ProcName = "pageBuffByXBasePkg";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific GenFile buffer instances identified by the duplicate key XSubPkg.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSubPackageTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argSubPackageGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argSubPackageGelId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGenFileBuff[] pageBuffByXSubPkg( YCFGenKbAuthorization Authorization,
		Long SubPackageTenantId,
		Long SubPackageGelCacheId,
		Long SubPackageGelId,
		Long priorTenantId,
		Long priorCartridgeId,
		Long priorItemId )
	{
		final String S_ProcName = "pageBuffByXSubPkg";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific GenFile buffer instances identified by the duplicate key XExpClsName.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpansionClassNameTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argExpansionClassNameGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argExpansionClassNameGelId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGenFileBuff[] pageBuffByXExpClsName( YCFGenKbAuthorization Authorization,
		Long ExpansionClassNameTenantId,
		Long ExpansionClassNameGelCacheId,
		Long ExpansionClassNameGelId,
		Long priorTenantId,
		Long priorCartridgeId,
		Long priorItemId )
	{
		final String S_ProcName = "pageBuffByXExpClsName";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific GenFile buffer instances identified by the duplicate key XExpKeyName.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpansionKeyNameTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argExpansionKeyNameGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argExpansionKeyNameGelId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGenFileBuff[] pageBuffByXExpKeyName( YCFGenKbAuthorization Authorization,
		Long ExpansionKeyNameTenantId,
		Long ExpansionKeyNameGelCacheId,
		Long ExpansionKeyNameGelId,
		Long priorTenantId,
		Long priorCartridgeId,
		Long priorItemId )
	{
		final String S_ProcName = "pageBuffByXExpKeyName";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific GenFile buffer instances identified by the duplicate key XExpFileName.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpansionFileNameTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argExpansionFileNameGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argExpansionFileNameGelId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGenFileBuff[] pageBuffByXExpFileName( YCFGenKbAuthorization Authorization,
		Long ExpansionFileNameTenantId,
		Long ExpansionFileNameGelCacheId,
		Long ExpansionFileNameGelId,
		Long priorTenantId,
		Long priorCartridgeId,
		Long priorItemId )
	{
		final String S_ProcName = "pageBuffByXExpFileName";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateGenFile( YCFGenKbAuthorization Authorization,
		YCFGenKbGenFileBuff Buff )
	{
		schema.getTableGenRule().updateGenRule( Authorization,
			Buff );
		YCFGenKbGenItemPKey pkey = schema.getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredCartridgeId( Buff.getRequiredCartridgeId() );
		pkey.setRequiredItemId( Buff.getRequiredItemId() );
		YCFGenKbGenFileBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateGenFile",
				"Existing record not found",
				"GenFile",
				pkey );
		}
		YCFGenKbGenFileByXSrcBundleKey existingKeyXSrcBundle = schema.getFactoryGenFile().newXSrcBundleKey();
		existingKeyXSrcBundle.setOptionalSourceBundleTenantId( existing.getOptionalSourceBundleTenantId() );
		existingKeyXSrcBundle.setOptionalSourceBundleGelCacheId( existing.getOptionalSourceBundleGelCacheId() );
		existingKeyXSrcBundle.setOptionalSourceBundleGelId( existing.getOptionalSourceBundleGelId() );

		YCFGenKbGenFileByXSrcBundleKey newKeyXSrcBundle = schema.getFactoryGenFile().newXSrcBundleKey();
		newKeyXSrcBundle.setOptionalSourceBundleTenantId( Buff.getOptionalSourceBundleTenantId() );
		newKeyXSrcBundle.setOptionalSourceBundleGelCacheId( Buff.getOptionalSourceBundleGelCacheId() );
		newKeyXSrcBundle.setOptionalSourceBundleGelId( Buff.getOptionalSourceBundleGelId() );

		YCFGenKbGenFileByXModNameKey existingKeyXModName = schema.getFactoryGenFile().newXModNameKey();
		existingKeyXModName.setOptionalModuleNameTenantId( existing.getOptionalModuleNameTenantId() );
		existingKeyXModName.setOptionalModuleNameGelCacheId( existing.getOptionalModuleNameGelCacheId() );
		existingKeyXModName.setOptionalModuleNameGelId( existing.getOptionalModuleNameGelId() );

		YCFGenKbGenFileByXModNameKey newKeyXModName = schema.getFactoryGenFile().newXModNameKey();
		newKeyXModName.setOptionalModuleNameTenantId( Buff.getOptionalModuleNameTenantId() );
		newKeyXModName.setOptionalModuleNameGelCacheId( Buff.getOptionalModuleNameGelCacheId() );
		newKeyXModName.setOptionalModuleNameGelId( Buff.getOptionalModuleNameGelId() );

		YCFGenKbGenFileByXBasePkgKey existingKeyXBasePkg = schema.getFactoryGenFile().newXBasePkgKey();
		existingKeyXBasePkg.setOptionalBasePackageTenantId( existing.getOptionalBasePackageTenantId() );
		existingKeyXBasePkg.setOptionalBasePackageGelCacheId( existing.getOptionalBasePackageGelCacheId() );
		existingKeyXBasePkg.setOptionalBasePackageGelId( existing.getOptionalBasePackageGelId() );

		YCFGenKbGenFileByXBasePkgKey newKeyXBasePkg = schema.getFactoryGenFile().newXBasePkgKey();
		newKeyXBasePkg.setOptionalBasePackageTenantId( Buff.getOptionalBasePackageTenantId() );
		newKeyXBasePkg.setOptionalBasePackageGelCacheId( Buff.getOptionalBasePackageGelCacheId() );
		newKeyXBasePkg.setOptionalBasePackageGelId( Buff.getOptionalBasePackageGelId() );

		YCFGenKbGenFileByXSubPkgKey existingKeyXSubPkg = schema.getFactoryGenFile().newXSubPkgKey();
		existingKeyXSubPkg.setOptionalSubPackageTenantId( existing.getOptionalSubPackageTenantId() );
		existingKeyXSubPkg.setOptionalSubPackageGelCacheId( existing.getOptionalSubPackageGelCacheId() );
		existingKeyXSubPkg.setOptionalSubPackageGelId( existing.getOptionalSubPackageGelId() );

		YCFGenKbGenFileByXSubPkgKey newKeyXSubPkg = schema.getFactoryGenFile().newXSubPkgKey();
		newKeyXSubPkg.setOptionalSubPackageTenantId( Buff.getOptionalSubPackageTenantId() );
		newKeyXSubPkg.setOptionalSubPackageGelCacheId( Buff.getOptionalSubPackageGelCacheId() );
		newKeyXSubPkg.setOptionalSubPackageGelId( Buff.getOptionalSubPackageGelId() );

		YCFGenKbGenFileByXExpClsNameKey existingKeyXExpClsName = schema.getFactoryGenFile().newXExpClsNameKey();
		existingKeyXExpClsName.setOptionalExpansionClassNameTenantId( existing.getOptionalExpansionClassNameTenantId() );
		existingKeyXExpClsName.setOptionalExpansionClassNameGelCacheId( existing.getOptionalExpansionClassNameGelCacheId() );
		existingKeyXExpClsName.setOptionalExpansionClassNameGelId( existing.getOptionalExpansionClassNameGelId() );

		YCFGenKbGenFileByXExpClsNameKey newKeyXExpClsName = schema.getFactoryGenFile().newXExpClsNameKey();
		newKeyXExpClsName.setOptionalExpansionClassNameTenantId( Buff.getOptionalExpansionClassNameTenantId() );
		newKeyXExpClsName.setOptionalExpansionClassNameGelCacheId( Buff.getOptionalExpansionClassNameGelCacheId() );
		newKeyXExpClsName.setOptionalExpansionClassNameGelId( Buff.getOptionalExpansionClassNameGelId() );

		YCFGenKbGenFileByXExpKeyNameKey existingKeyXExpKeyName = schema.getFactoryGenFile().newXExpKeyNameKey();
		existingKeyXExpKeyName.setOptionalExpansionKeyNameTenantId( existing.getOptionalExpansionKeyNameTenantId() );
		existingKeyXExpKeyName.setOptionalExpansionKeyNameGelCacheId( existing.getOptionalExpansionKeyNameGelCacheId() );
		existingKeyXExpKeyName.setOptionalExpansionKeyNameGelId( existing.getOptionalExpansionKeyNameGelId() );

		YCFGenKbGenFileByXExpKeyNameKey newKeyXExpKeyName = schema.getFactoryGenFile().newXExpKeyNameKey();
		newKeyXExpKeyName.setOptionalExpansionKeyNameTenantId( Buff.getOptionalExpansionKeyNameTenantId() );
		newKeyXExpKeyName.setOptionalExpansionKeyNameGelCacheId( Buff.getOptionalExpansionKeyNameGelCacheId() );
		newKeyXExpKeyName.setOptionalExpansionKeyNameGelId( Buff.getOptionalExpansionKeyNameGelId() );

		YCFGenKbGenFileByXExpFileNameKey existingKeyXExpFileName = schema.getFactoryGenFile().newXExpFileNameKey();
		existingKeyXExpFileName.setOptionalExpansionFileNameTenantId( existing.getOptionalExpansionFileNameTenantId() );
		existingKeyXExpFileName.setOptionalExpansionFileNameGelCacheId( existing.getOptionalExpansionFileNameGelCacheId() );
		existingKeyXExpFileName.setOptionalExpansionFileNameGelId( existing.getOptionalExpansionFileNameGelId() );

		YCFGenKbGenFileByXExpFileNameKey newKeyXExpFileName = schema.getFactoryGenFile().newXExpFileNameKey();
		newKeyXExpFileName.setOptionalExpansionFileNameTenantId( Buff.getOptionalExpansionFileNameTenantId() );
		newKeyXExpFileName.setOptionalExpansionFileNameGelCacheId( Buff.getOptionalExpansionFileNameGelCacheId() );
		newKeyXExpFileName.setOptionalExpansionFileNameGelId( Buff.getOptionalExpansionFileNameGelId() );

		// Check unique indexes

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableGenRule().readDerivedByItemIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredCartridgeId(),
						Buff.getRequiredItemId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateGenFile",
						"Superclass",
						"SuperClass",
						"GenRule",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByXSrcBundle.get( existingKeyXSrcBundle );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByXSrcBundle.containsKey( newKeyXSrcBundle ) ) {
			subdict = dictByXSrcBundle.get( newKeyXSrcBundle );
		}
		else {
			subdict = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff >();
			dictByXSrcBundle.put( newKeyXSrcBundle, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByXModName.get( existingKeyXModName );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByXModName.containsKey( newKeyXModName ) ) {
			subdict = dictByXModName.get( newKeyXModName );
		}
		else {
			subdict = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff >();
			dictByXModName.put( newKeyXModName, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByXBasePkg.get( existingKeyXBasePkg );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByXBasePkg.containsKey( newKeyXBasePkg ) ) {
			subdict = dictByXBasePkg.get( newKeyXBasePkg );
		}
		else {
			subdict = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff >();
			dictByXBasePkg.put( newKeyXBasePkg, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByXSubPkg.get( existingKeyXSubPkg );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByXSubPkg.containsKey( newKeyXSubPkg ) ) {
			subdict = dictByXSubPkg.get( newKeyXSubPkg );
		}
		else {
			subdict = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff >();
			dictByXSubPkg.put( newKeyXSubPkg, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByXExpClsName.get( existingKeyXExpClsName );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByXExpClsName.containsKey( newKeyXExpClsName ) ) {
			subdict = dictByXExpClsName.get( newKeyXExpClsName );
		}
		else {
			subdict = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff >();
			dictByXExpClsName.put( newKeyXExpClsName, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByXExpKeyName.get( existingKeyXExpKeyName );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByXExpKeyName.containsKey( newKeyXExpKeyName ) ) {
			subdict = dictByXExpKeyName.get( newKeyXExpKeyName );
		}
		else {
			subdict = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff >();
			dictByXExpKeyName.put( newKeyXExpKeyName, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByXExpFileName.get( existingKeyXExpFileName );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByXExpFileName.containsKey( newKeyXExpFileName ) ) {
			subdict = dictByXExpFileName.get( newKeyXExpFileName );
		}
		else {
			subdict = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff >();
			dictByXExpFileName.put( newKeyXExpFileName, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteGenFile( YCFGenKbAuthorization Authorization,
		YCFGenKbGenFileBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamGenFileTable.deleteGenFile() ";
		String classCode;
		YCFGenKbGenItemPKey pkey = schema.getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredCartridgeId( Buff.getRequiredCartridgeId() );
		pkey.setRequiredItemId( Buff.getRequiredItemId() );
		YCFGenKbGenFileBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteGenFile",
				pkey );
		}
		// Short circuit self-referential code to prevent stack overflows
		if( null != schema.getTableGelExecutable().readDerivedByPIdx( Authorization,
						existing.getOptionalSourceBundleTenantId(),
						existing.getOptionalSourceBundleGelCacheId(),
						existing.getOptionalSourceBundleGelId() ) ) {
			schema.getTableGelExecutable().deleteGelExecutableByPIdx( Authorization,
						existing.getOptionalSourceBundleTenantId(),
						existing.getOptionalSourceBundleGelCacheId(),
						existing.getOptionalSourceBundleGelId() );
		}
		// Short circuit self-referential code to prevent stack overflows
		if( null != schema.getTableGelExecutable().readDerivedByPIdx( Authorization,
						existing.getOptionalBasePackageTenantId(),
						existing.getOptionalBasePackageGelCacheId(),
						existing.getOptionalBasePackageGelId() ) ) {
			schema.getTableGelExecutable().deleteGelExecutableByPIdx( Authorization,
						existing.getOptionalBasePackageTenantId(),
						existing.getOptionalBasePackageGelCacheId(),
						existing.getOptionalBasePackageGelId() );
		}
		// Short circuit self-referential code to prevent stack overflows
		if( null != schema.getTableGelExecutable().readDerivedByPIdx( Authorization,
						existing.getOptionalModuleNameTenantId(),
						existing.getOptionalModuleNameGelCacheId(),
						existing.getOptionalModuleNameGelId() ) ) {
			schema.getTableGelExecutable().deleteGelExecutableByPIdx( Authorization,
						existing.getOptionalModuleNameTenantId(),
						existing.getOptionalModuleNameGelCacheId(),
						existing.getOptionalModuleNameGelId() );
		}
		// Short circuit self-referential code to prevent stack overflows
		if( null != schema.getTableGelExecutable().readDerivedByPIdx( Authorization,
						existing.getOptionalSubPackageTenantId(),
						existing.getOptionalSubPackageGelCacheId(),
						existing.getOptionalSubPackageGelId() ) ) {
			schema.getTableGelExecutable().deleteGelExecutableByPIdx( Authorization,
						existing.getOptionalSubPackageTenantId(),
						existing.getOptionalSubPackageGelCacheId(),
						existing.getOptionalSubPackageGelId() );
		}
		// Short circuit self-referential code to prevent stack overflows
		if( null != schema.getTableGelExecutable().readDerivedByPIdx( Authorization,
						existing.getOptionalExpansionClassNameTenantId(),
						existing.getOptionalExpansionClassNameGelCacheId(),
						existing.getOptionalExpansionClassNameGelId() ) ) {
			schema.getTableGelExecutable().deleteGelExecutableByPIdx( Authorization,
						existing.getOptionalExpansionClassNameTenantId(),
						existing.getOptionalExpansionClassNameGelCacheId(),
						existing.getOptionalExpansionClassNameGelId() );
		}
		// Short circuit self-referential code to prevent stack overflows
		if( null != schema.getTableGelExecutable().readDerivedByPIdx( Authorization,
						existing.getOptionalExpansionKeyNameTenantId(),
						existing.getOptionalExpansionKeyNameGelCacheId(),
						existing.getOptionalExpansionKeyNameGelId() ) ) {
			schema.getTableGelExecutable().deleteGelExecutableByPIdx( Authorization,
						existing.getOptionalExpansionKeyNameTenantId(),
						existing.getOptionalExpansionKeyNameGelCacheId(),
						existing.getOptionalExpansionKeyNameGelId() );
		}
		// Short circuit self-referential code to prevent stack overflows
		if( null != schema.getTableGelExecutable().readDerivedByPIdx( Authorization,
						existing.getOptionalExpansionFileNameTenantId(),
						existing.getOptionalExpansionFileNameGelCacheId(),
						existing.getOptionalExpansionFileNameGelId() ) ) {
			schema.getTableGelExecutable().deleteGelExecutableByPIdx( Authorization,
						existing.getOptionalExpansionFileNameTenantId(),
						existing.getOptionalExpansionFileNameGelCacheId(),
						existing.getOptionalExpansionFileNameGelId() );
		}
		// Short circuit self-referential code to prevent stack overflows
		if( null != schema.getTableGelExecutable().readDerivedByPIdx( Authorization,
						existing.getOptionalBodyTenantId(),
						existing.getOptionalBodyGelCacheId(),
						existing.getOptionalBodyGelId() ) ) {
			schema.getTableGelExecutable().deleteGelExecutableByPIdx( Authorization,
						existing.getOptionalBodyTenantId(),
						existing.getOptionalBodyGelCacheId(),
						existing.getOptionalBodyGelId() );
		}
		// Short circuit self-referential code to prevent stack overflows
		if( null != schema.getTableGelExecutable().readDerivedByPIdx( Authorization,
						existing.getOptionalGelExecutableTenantId(),
						existing.getOptionalGelExecutableGelCacheId(),
						existing.getOptionalGelExecutableId() ) ) {
			schema.getTableGelExecutable().deleteGelExecutableByPIdx( Authorization,
						existing.getOptionalGelExecutableTenantId(),
						existing.getOptionalGelExecutableGelCacheId(),
						existing.getOptionalGelExecutableId() );
		}
		YCFGenKbGenFileByXSrcBundleKey keyXSrcBundle = schema.getFactoryGenFile().newXSrcBundleKey();
		keyXSrcBundle.setOptionalSourceBundleTenantId( existing.getOptionalSourceBundleTenantId() );
		keyXSrcBundle.setOptionalSourceBundleGelCacheId( existing.getOptionalSourceBundleGelCacheId() );
		keyXSrcBundle.setOptionalSourceBundleGelId( existing.getOptionalSourceBundleGelId() );

		YCFGenKbGenFileByXModNameKey keyXModName = schema.getFactoryGenFile().newXModNameKey();
		keyXModName.setOptionalModuleNameTenantId( existing.getOptionalModuleNameTenantId() );
		keyXModName.setOptionalModuleNameGelCacheId( existing.getOptionalModuleNameGelCacheId() );
		keyXModName.setOptionalModuleNameGelId( existing.getOptionalModuleNameGelId() );

		YCFGenKbGenFileByXBasePkgKey keyXBasePkg = schema.getFactoryGenFile().newXBasePkgKey();
		keyXBasePkg.setOptionalBasePackageTenantId( existing.getOptionalBasePackageTenantId() );
		keyXBasePkg.setOptionalBasePackageGelCacheId( existing.getOptionalBasePackageGelCacheId() );
		keyXBasePkg.setOptionalBasePackageGelId( existing.getOptionalBasePackageGelId() );

		YCFGenKbGenFileByXSubPkgKey keyXSubPkg = schema.getFactoryGenFile().newXSubPkgKey();
		keyXSubPkg.setOptionalSubPackageTenantId( existing.getOptionalSubPackageTenantId() );
		keyXSubPkg.setOptionalSubPackageGelCacheId( existing.getOptionalSubPackageGelCacheId() );
		keyXSubPkg.setOptionalSubPackageGelId( existing.getOptionalSubPackageGelId() );

		YCFGenKbGenFileByXExpClsNameKey keyXExpClsName = schema.getFactoryGenFile().newXExpClsNameKey();
		keyXExpClsName.setOptionalExpansionClassNameTenantId( existing.getOptionalExpansionClassNameTenantId() );
		keyXExpClsName.setOptionalExpansionClassNameGelCacheId( existing.getOptionalExpansionClassNameGelCacheId() );
		keyXExpClsName.setOptionalExpansionClassNameGelId( existing.getOptionalExpansionClassNameGelId() );

		YCFGenKbGenFileByXExpKeyNameKey keyXExpKeyName = schema.getFactoryGenFile().newXExpKeyNameKey();
		keyXExpKeyName.setOptionalExpansionKeyNameTenantId( existing.getOptionalExpansionKeyNameTenantId() );
		keyXExpKeyName.setOptionalExpansionKeyNameGelCacheId( existing.getOptionalExpansionKeyNameGelCacheId() );
		keyXExpKeyName.setOptionalExpansionKeyNameGelId( existing.getOptionalExpansionKeyNameGelId() );

		YCFGenKbGenFileByXExpFileNameKey keyXExpFileName = schema.getFactoryGenFile().newXExpFileNameKey();
		keyXExpFileName.setOptionalExpansionFileNameTenantId( existing.getOptionalExpansionFileNameTenantId() );
		keyXExpFileName.setOptionalExpansionFileNameGelCacheId( existing.getOptionalExpansionFileNameGelCacheId() );
		keyXExpFileName.setOptionalExpansionFileNameGelId( existing.getOptionalExpansionFileNameGelId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbGenItemPKey, YCFGenKbGenFileBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByXSrcBundle.get( keyXSrcBundle );
		subdict.remove( pkey );

		subdict = dictByXModName.get( keyXModName );
		subdict.remove( pkey );

		subdict = dictByXBasePkg.get( keyXBasePkg );
		subdict.remove( pkey );

		subdict = dictByXSubPkg.get( keyXSubPkg );
		subdict.remove( pkey );

		subdict = dictByXExpClsName.get( keyXExpClsName );
		subdict.remove( pkey );

		subdict = dictByXExpKeyName.get( keyXExpKeyName );
		subdict.remove( pkey );

		subdict = dictByXExpFileName.get( keyXExpFileName );
		subdict.remove( pkey );

		schema.getTableGenRule().deleteGenRule( Authorization,
			Buff );
	}
	public void deleteGenFileByXSrcBundle( YCFGenKbAuthorization Authorization,
		Long argSourceBundleTenantId,
		Long argSourceBundleGelCacheId,
		Long argSourceBundleGelId )
	{
		YCFGenKbGenFileByXSrcBundleKey key = schema.getFactoryGenFile().newXSrcBundleKey();
		key.setOptionalSourceBundleTenantId( argSourceBundleTenantId );
		key.setOptionalSourceBundleGelCacheId( argSourceBundleGelCacheId );
		key.setOptionalSourceBundleGelId( argSourceBundleGelId );
		deleteGenFileByXSrcBundle( Authorization, key );
	}

	public void deleteGenFileByXSrcBundle( YCFGenKbAuthorization Authorization,
		YCFGenKbGenFileByXSrcBundleKey argKey )
	{
		YCFGenKbGenFileBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalSourceBundleTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalSourceBundleGelCacheId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalSourceBundleGelId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenFileBuff> matchSet = new LinkedList<YCFGenKbGenFileBuff>();
		Iterator<YCFGenKbGenFileBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenFileBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenFile().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenFile( Authorization, cur );
		}
	}

	public void deleteGenFileByXModName( YCFGenKbAuthorization Authorization,
		Long argModuleNameTenantId,
		Long argModuleNameGelCacheId,
		Long argModuleNameGelId )
	{
		YCFGenKbGenFileByXModNameKey key = schema.getFactoryGenFile().newXModNameKey();
		key.setOptionalModuleNameTenantId( argModuleNameTenantId );
		key.setOptionalModuleNameGelCacheId( argModuleNameGelCacheId );
		key.setOptionalModuleNameGelId( argModuleNameGelId );
		deleteGenFileByXModName( Authorization, key );
	}

	public void deleteGenFileByXModName( YCFGenKbAuthorization Authorization,
		YCFGenKbGenFileByXModNameKey argKey )
	{
		YCFGenKbGenFileBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalModuleNameTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalModuleNameGelCacheId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalModuleNameGelId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenFileBuff> matchSet = new LinkedList<YCFGenKbGenFileBuff>();
		Iterator<YCFGenKbGenFileBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenFileBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenFile().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenFile( Authorization, cur );
		}
	}

	public void deleteGenFileByXBasePkg( YCFGenKbAuthorization Authorization,
		Long argBasePackageTenantId,
		Long argBasePackageGelCacheId,
		Long argBasePackageGelId )
	{
		YCFGenKbGenFileByXBasePkgKey key = schema.getFactoryGenFile().newXBasePkgKey();
		key.setOptionalBasePackageTenantId( argBasePackageTenantId );
		key.setOptionalBasePackageGelCacheId( argBasePackageGelCacheId );
		key.setOptionalBasePackageGelId( argBasePackageGelId );
		deleteGenFileByXBasePkg( Authorization, key );
	}

	public void deleteGenFileByXBasePkg( YCFGenKbAuthorization Authorization,
		YCFGenKbGenFileByXBasePkgKey argKey )
	{
		YCFGenKbGenFileBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalBasePackageTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalBasePackageGelCacheId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalBasePackageGelId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenFileBuff> matchSet = new LinkedList<YCFGenKbGenFileBuff>();
		Iterator<YCFGenKbGenFileBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenFileBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenFile().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenFile( Authorization, cur );
		}
	}

	public void deleteGenFileByXSubPkg( YCFGenKbAuthorization Authorization,
		Long argSubPackageTenantId,
		Long argSubPackageGelCacheId,
		Long argSubPackageGelId )
	{
		YCFGenKbGenFileByXSubPkgKey key = schema.getFactoryGenFile().newXSubPkgKey();
		key.setOptionalSubPackageTenantId( argSubPackageTenantId );
		key.setOptionalSubPackageGelCacheId( argSubPackageGelCacheId );
		key.setOptionalSubPackageGelId( argSubPackageGelId );
		deleteGenFileByXSubPkg( Authorization, key );
	}

	public void deleteGenFileByXSubPkg( YCFGenKbAuthorization Authorization,
		YCFGenKbGenFileByXSubPkgKey argKey )
	{
		YCFGenKbGenFileBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalSubPackageTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalSubPackageGelCacheId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalSubPackageGelId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenFileBuff> matchSet = new LinkedList<YCFGenKbGenFileBuff>();
		Iterator<YCFGenKbGenFileBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenFileBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenFile().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenFile( Authorization, cur );
		}
	}

	public void deleteGenFileByXExpClsName( YCFGenKbAuthorization Authorization,
		Long argExpansionClassNameTenantId,
		Long argExpansionClassNameGelCacheId,
		Long argExpansionClassNameGelId )
	{
		YCFGenKbGenFileByXExpClsNameKey key = schema.getFactoryGenFile().newXExpClsNameKey();
		key.setOptionalExpansionClassNameTenantId( argExpansionClassNameTenantId );
		key.setOptionalExpansionClassNameGelCacheId( argExpansionClassNameGelCacheId );
		key.setOptionalExpansionClassNameGelId( argExpansionClassNameGelId );
		deleteGenFileByXExpClsName( Authorization, key );
	}

	public void deleteGenFileByXExpClsName( YCFGenKbAuthorization Authorization,
		YCFGenKbGenFileByXExpClsNameKey argKey )
	{
		YCFGenKbGenFileBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalExpansionClassNameTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalExpansionClassNameGelCacheId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalExpansionClassNameGelId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenFileBuff> matchSet = new LinkedList<YCFGenKbGenFileBuff>();
		Iterator<YCFGenKbGenFileBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenFileBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenFile().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenFile( Authorization, cur );
		}
	}

	public void deleteGenFileByXExpKeyName( YCFGenKbAuthorization Authorization,
		Long argExpansionKeyNameTenantId,
		Long argExpansionKeyNameGelCacheId,
		Long argExpansionKeyNameGelId )
	{
		YCFGenKbGenFileByXExpKeyNameKey key = schema.getFactoryGenFile().newXExpKeyNameKey();
		key.setOptionalExpansionKeyNameTenantId( argExpansionKeyNameTenantId );
		key.setOptionalExpansionKeyNameGelCacheId( argExpansionKeyNameGelCacheId );
		key.setOptionalExpansionKeyNameGelId( argExpansionKeyNameGelId );
		deleteGenFileByXExpKeyName( Authorization, key );
	}

	public void deleteGenFileByXExpKeyName( YCFGenKbAuthorization Authorization,
		YCFGenKbGenFileByXExpKeyNameKey argKey )
	{
		YCFGenKbGenFileBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalExpansionKeyNameTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalExpansionKeyNameGelCacheId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalExpansionKeyNameGelId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenFileBuff> matchSet = new LinkedList<YCFGenKbGenFileBuff>();
		Iterator<YCFGenKbGenFileBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenFileBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenFile().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenFile( Authorization, cur );
		}
	}

	public void deleteGenFileByXExpFileName( YCFGenKbAuthorization Authorization,
		Long argExpansionFileNameTenantId,
		Long argExpansionFileNameGelCacheId,
		Long argExpansionFileNameGelId )
	{
		YCFGenKbGenFileByXExpFileNameKey key = schema.getFactoryGenFile().newXExpFileNameKey();
		key.setOptionalExpansionFileNameTenantId( argExpansionFileNameTenantId );
		key.setOptionalExpansionFileNameGelCacheId( argExpansionFileNameGelCacheId );
		key.setOptionalExpansionFileNameGelId( argExpansionFileNameGelId );
		deleteGenFileByXExpFileName( Authorization, key );
	}

	public void deleteGenFileByXExpFileName( YCFGenKbAuthorization Authorization,
		YCFGenKbGenFileByXExpFileNameKey argKey )
	{
		YCFGenKbGenFileBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalExpansionFileNameTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalExpansionFileNameGelCacheId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalExpansionFileNameGelId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenFileBuff> matchSet = new LinkedList<YCFGenKbGenFileBuff>();
		Iterator<YCFGenKbGenFileBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenFileBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenFile().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenFile( Authorization, cur );
		}
	}

	public void deleteGenFileByBodyIdx( YCFGenKbAuthorization Authorization,
		Long argBodyTenantId,
		Long argBodyGelCacheId,
		Long argBodyGelId )
	{
		YCFGenKbGenRuleByBodyIdxKey key = schema.getFactoryGenRule().newBodyIdxKey();
		key.setOptionalBodyTenantId( argBodyTenantId );
		key.setOptionalBodyGelCacheId( argBodyGelCacheId );
		key.setOptionalBodyGelId( argBodyGelId );
		deleteGenFileByBodyIdx( Authorization, key );
	}

	public void deleteGenFileByBodyIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenRuleByBodyIdxKey argKey )
	{
		YCFGenKbGenFileBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalBodyTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalBodyGelCacheId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalBodyGelId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenFileBuff> matchSet = new LinkedList<YCFGenKbGenFileBuff>();
		Iterator<YCFGenKbGenFileBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenFileBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenFile().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenFile( Authorization, cur );
		}
	}

	public void deleteGenFileByItemIdIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argCartridgeId,
		long argItemId )
	{
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredCartridgeId( argCartridgeId );
		key.setRequiredItemId( argItemId );
		deleteGenFileByItemIdIdx( Authorization, key );
	}

	public void deleteGenFileByItemIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbGenFileBuff cur;
		LinkedList<YCFGenKbGenFileBuff> matchSet = new LinkedList<YCFGenKbGenFileBuff>();
		Iterator<YCFGenKbGenFileBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenFileBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenFile().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenFile( Authorization, cur );
		}
	}

	public void deleteGenFileByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId )
	{
		YCFGenKbGenItemByTenantIdxKey key = schema.getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteGenFileByTenantIdx( Authorization, key );
	}

	public void deleteGenFileByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByTenantIdxKey argKey )
	{
		YCFGenKbGenFileBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenFileBuff> matchSet = new LinkedList<YCFGenKbGenFileBuff>();
		Iterator<YCFGenKbGenFileBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenFileBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenFile().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenFile( Authorization, cur );
		}
	}

	public void deleteGenFileByCartIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argCartridgeId )
	{
		YCFGenKbGenItemByCartIdxKey key = schema.getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredCartridgeId( argCartridgeId );
		deleteGenFileByCartIdx( Authorization, key );
	}

	public void deleteGenFileByCartIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByCartIdxKey argKey )
	{
		YCFGenKbGenFileBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenFileBuff> matchSet = new LinkedList<YCFGenKbGenFileBuff>();
		Iterator<YCFGenKbGenFileBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenFileBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenFile().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenFile( Authorization, cur );
		}
	}

	public void deleteGenFileByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		short argRuleTypeId )
	{
		YCFGenKbGenItemByRuleTypeIdxKey key = schema.getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( argRuleTypeId );
		deleteGenFileByRuleTypeIdx( Authorization, key );
	}

	public void deleteGenFileByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByRuleTypeIdxKey argKey )
	{
		YCFGenKbGenFileBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenFileBuff> matchSet = new LinkedList<YCFGenKbGenFileBuff>();
		Iterator<YCFGenKbGenFileBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenFileBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenFile().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenFile( Authorization, cur );
		}
	}

	public void deleteGenFileByToolSetIdx( YCFGenKbAuthorization Authorization,
		short argToolSetId )
	{
		YCFGenKbGenItemByToolSetIdxKey key = schema.getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( argToolSetId );
		deleteGenFileByToolSetIdx( Authorization, key );
	}

	public void deleteGenFileByToolSetIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByToolSetIdxKey argKey )
	{
		YCFGenKbGenFileBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenFileBuff> matchSet = new LinkedList<YCFGenKbGenFileBuff>();
		Iterator<YCFGenKbGenFileBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenFileBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenFile().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenFile( Authorization, cur );
		}
	}

	public void deleteGenFileByScopeIdx( YCFGenKbAuthorization Authorization,
		Short argScopeDefId )
	{
		YCFGenKbGenItemByScopeIdxKey key = schema.getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( argScopeDefId );
		deleteGenFileByScopeIdx( Authorization, key );
	}

	public void deleteGenFileByScopeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByScopeIdxKey argKey )
	{
		YCFGenKbGenFileBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalScopeDefId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenFileBuff> matchSet = new LinkedList<YCFGenKbGenFileBuff>();
		Iterator<YCFGenKbGenFileBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenFileBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenFile().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenFile( Authorization, cur );
		}
	}

	public void deleteGenFileByGenDefIdx( YCFGenKbAuthorization Authorization,
		short argGenDefId )
	{
		YCFGenKbGenItemByGenDefIdxKey key = schema.getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( argGenDefId );
		deleteGenFileByGenDefIdx( Authorization, key );
	}

	public void deleteGenFileByGenDefIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByGenDefIdxKey argKey )
	{
		YCFGenKbGenFileBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenFileBuff> matchSet = new LinkedList<YCFGenKbGenFileBuff>();
		Iterator<YCFGenKbGenFileBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenFileBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenFile().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenFile( Authorization, cur );
		}
	}

	public void deleteGenFileByAltIdx( YCFGenKbAuthorization Authorization,
		String argName,
		short argToolSetId,
		Short argScopeDefId,
		short argGenDefId )
	{
		YCFGenKbGenItemByAltIdxKey key = schema.getFactoryGenItem().newAltIdxKey();
		key.setRequiredName( argName );
		key.setRequiredToolSetId( argToolSetId );
		key.setOptionalScopeDefId( argScopeDefId );
		key.setRequiredGenDefId( argGenDefId );
		deleteGenFileByAltIdx( Authorization, key );
	}

	public void deleteGenFileByAltIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByAltIdxKey argKey )
	{
		YCFGenKbGenFileBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( argKey.getOptionalScopeDefId() != null ) {
			anyNotNull = true;
		}
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenFileBuff> matchSet = new LinkedList<YCFGenKbGenFileBuff>();
		Iterator<YCFGenKbGenFileBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenFileBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenFile().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenFile( Authorization, cur );
		}
	}

	public void deleteGenFileByGelExecIdx( YCFGenKbAuthorization Authorization,
		Long argGelExecutableTenantId,
		Long argGelExecutableGelCacheId,
		Long argGelExecutableId )
	{
		YCFGenKbGenItemByGelExecIdxKey key = schema.getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( argGelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( argGelExecutableGelCacheId );
		key.setOptionalGelExecutableId( argGelExecutableId );
		deleteGenFileByGelExecIdx( Authorization, key );
	}

	public void deleteGenFileByGelExecIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByGelExecIdxKey argKey )
	{
		YCFGenKbGenFileBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalGelExecutableTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalGelExecutableGelCacheId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalGelExecutableId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenFileBuff> matchSet = new LinkedList<YCFGenKbGenFileBuff>();
		Iterator<YCFGenKbGenFileBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenFileBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenFile().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenFile( Authorization, cur );
		}
	}

	public void deleteGenFileByProbeIdx( YCFGenKbAuthorization Authorization,
		Long argProbeTenantId,
		Long argProbeCartridgeId,
		Long argProbeGenItemId )
	{
		YCFGenKbGenItemByProbeIdxKey key = schema.getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( argProbeTenantId );
		key.setOptionalProbeCartridgeId( argProbeCartridgeId );
		key.setOptionalProbeGenItemId( argProbeGenItemId );
		deleteGenFileByProbeIdx( Authorization, key );
	}

	public void deleteGenFileByProbeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByProbeIdxKey argKey )
	{
		YCFGenKbGenFileBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalProbeTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalProbeCartridgeId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalProbeGenItemId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenFileBuff> matchSet = new LinkedList<YCFGenKbGenFileBuff>();
		Iterator<YCFGenKbGenFileBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenFileBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenFile().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenFile( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
