// Description: Java 11 base object instance implementation for YCFGenKb GenFile.

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

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.MssYCFEngine;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.MssYCFGelCompiler;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.MssYCFGenContext;

public class YCFGenKbGenFileObj
	extends YCFGenKbGenRuleObj
	implements IYCFGenKbGenFileObj
{
	public final static String CLASS_CODE = "a932";
	protected IYCFGenKbGelExecutableObj optionalComponentsSrcBundleGel;
	protected IYCFGenKbGelExecutableObj optionalComponentsBasePackageGel;
	protected IYCFGenKbGelExecutableObj optionalComponentsModuleNameGel;
	protected IYCFGenKbGelExecutableObj optionalComponentsSubPackageGel;
	protected IYCFGenKbGelExecutableObj optionalComponentsExpClassGel;
	protected IYCFGenKbGelExecutableObj optionalComponentsExpKeyNameGel;
	protected IYCFGenKbGelExecutableObj optionalComponentsExpFileNameGel;

	public YCFGenKbGenFileObj() {
		super();
	}

	public YCFGenKbGenFileObj( IYCFGenKbSchemaObj argSchema ) {
		super( argSchema );
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GenFile" );
	}

	public IYCFLibAnyObj getScope() {
		return( super.getScope() );
	}

	public IYCFLibAnyObj getObjScope() {
		return( super.getObjScope() );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredName();
		return( objName );
	}

	public IYCFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		IYCFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof IYCFGenKbClusterObj ) {
					break;
				}
				else if( container instanceof IYCFGenKbTenantObj ) {
					break;
				}
				else if( qualifyingClass.isInstance( container ) ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		else {
			while( container != null ) {
				if( container instanceof IYCFGenKbClusterObj ) {
					break;
				}
				else if( container instanceof IYCFGenKbTenantObj ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		return( container );
	}

	public IYCFLibAnyObj getNamedObject( String objName ) {
		String nextName;
		String remainingName;
		IYCFLibAnyObj subObj = null;
		IYCFLibAnyObj retObj;
		int nextDot = objName.indexOf( '.' );
		if( nextDot >= 0 ) {
			nextName = objName.substring( 0, nextDot );
			remainingName = objName.substring( nextDot + 1 );
		}
		else {
			nextName = objName;
			remainingName = null;
		}
		if( remainingName == null ) {
			retObj = subObj;
		}
		else if( subObj == null ) {
			retObj = null;
		}
		else {
			retObj = subObj.getNamedObject( remainingName );
		}
		return( retObj );
	}

	public String getObjQualifiedName() {
		String qualName = getObjName();
		IYCFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof IYCFGenKbClusterObj ) {
				container = null;
			}
			else if( container instanceof IYCFGenKbTenantObj ) {
				container = null;
			}
			else {
				containerName = container.getObjName();
				qualName = containerName + "." + qualName;
				container = container.getObjScope();
			}
		}
		return( qualName );
	}

	public IYCFGenKbGenItemObj realise() {
		IYCFGenKbGenFileObj retobj = ((IYCFGenKbSchemaObj)schema).getGenFileTableObj().realiseGenFile(
			(IYCFGenKbGenFileObj)this );
		return( (IYCFGenKbGenItemObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getGenFileTableObj().reallyDeepDisposeGenFile( (IYCFGenKbGenFileObj)this );
	}

	public IYCFGenKbGenItemObj read() {
		IYCFGenKbGenFileObj retobj = ((IYCFGenKbSchemaObj)schema).getGenFileTableObj().readGenFileByItemIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredCartridgeId(),
			getPKey().getRequiredItemId(), false );
		return( (IYCFGenKbGenItemObj)retobj );
	}

	public IYCFGenKbGenItemObj read( boolean forceRead ) {
		IYCFGenKbGenFileObj retobj = ((IYCFGenKbSchemaObj)schema).getGenFileTableObj().readGenFileByItemIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredCartridgeId(),
			getPKey().getRequiredItemId(), forceRead );
		return( (IYCFGenKbGenItemObj)retobj );
	}

	public IYCFGenKbGenFileTableObj getGenFileTable() {
		return( ((IYCFGenKbSchemaObj)schema).getGenFileTableObj() );
	}

	public YCFGenKbGenItemBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenFile().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenFile().readDerivedByItemIdIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredCartridgeId(),
						getPKey().getRequiredItemId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFGenKbGenItemBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbGenFileBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbGenFileBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerCartridge = null;
		requiredLookupRuleType = null;
		requiredLookupToolSet = null;
		optionalLookupScopeDef = null;
		requiredLookupGenDef = null;
		optionalLookupProbe = null;
	}

	public YCFGenKbGenFileBuff getGenFileBuff() {
		return( (YCFGenKbGenFileBuff)getBuff() );
	}

	public IYCFGenKbGenItemEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbGenFileObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbGenFileObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getGenFileTableObj().lockGenFile( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getGenFileTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbGenItemEditObj)edit );
	}

	public IYCFGenKbGenFileEditObj getEditAsGenFile() {
		return( (IYCFGenKbGenFileEditObj)edit );
	}

	public String getOptionalGenerateOnce() {
		return( getGenFileBuff().getOptionalGenerateOnce() );
	}

	public String getOptionalSourceBundle() {
		return( getGenFileBuff().getOptionalSourceBundle() );
	}

	public Long getOptionalSourceBundleTenantId() {
		return( getGenFileBuff().getOptionalSourceBundleTenantId() );
	}

	public Long getOptionalSourceBundleGelCacheId() {
		return( getGenFileBuff().getOptionalSourceBundleGelCacheId() );
	}

	public Long getOptionalSourceBundleGelId() {
		return( getGenFileBuff().getOptionalSourceBundleGelId() );
	}

	public String getOptionalModuleName() {
		return( getGenFileBuff().getOptionalModuleName() );
	}

	public Long getOptionalModuleNameTenantId() {
		return( getGenFileBuff().getOptionalModuleNameTenantId() );
	}

	public Long getOptionalModuleNameGelCacheId() {
		return( getGenFileBuff().getOptionalModuleNameGelCacheId() );
	}

	public Long getOptionalModuleNameGelId() {
		return( getGenFileBuff().getOptionalModuleNameGelId() );
	}

	public String getOptionalBasePackageName() {
		return( getGenFileBuff().getOptionalBasePackageName() );
	}

	public Long getOptionalBasePackageTenantId() {
		return( getGenFileBuff().getOptionalBasePackageTenantId() );
	}

	public Long getOptionalBasePackageGelCacheId() {
		return( getGenFileBuff().getOptionalBasePackageGelCacheId() );
	}

	public Long getOptionalBasePackageGelId() {
		return( getGenFileBuff().getOptionalBasePackageGelId() );
	}

	public String getOptionalSubPackageName() {
		return( getGenFileBuff().getOptionalSubPackageName() );
	}

	public Long getOptionalSubPackageTenantId() {
		return( getGenFileBuff().getOptionalSubPackageTenantId() );
	}

	public Long getOptionalSubPackageGelCacheId() {
		return( getGenFileBuff().getOptionalSubPackageGelCacheId() );
	}

	public Long getOptionalSubPackageGelId() {
		return( getGenFileBuff().getOptionalSubPackageGelId() );
	}

	public String getOptionalExpansionClassName() {
		return( getGenFileBuff().getOptionalExpansionClassName() );
	}

	public Long getOptionalExpansionClassNameTenantId() {
		return( getGenFileBuff().getOptionalExpansionClassNameTenantId() );
	}

	public Long getOptionalExpansionClassNameGelCacheId() {
		return( getGenFileBuff().getOptionalExpansionClassNameGelCacheId() );
	}

	public Long getOptionalExpansionClassNameGelId() {
		return( getGenFileBuff().getOptionalExpansionClassNameGelId() );
	}

	public String getOptionalExpansionKeyName() {
		return( getGenFileBuff().getOptionalExpansionKeyName() );
	}

	public Long getOptionalExpansionKeyNameTenantId() {
		return( getGenFileBuff().getOptionalExpansionKeyNameTenantId() );
	}

	public Long getOptionalExpansionKeyNameGelCacheId() {
		return( getGenFileBuff().getOptionalExpansionKeyNameGelCacheId() );
	}

	public Long getOptionalExpansionKeyNameGelId() {
		return( getGenFileBuff().getOptionalExpansionKeyNameGelId() );
	}

	public String getOptionalExpansionFileName() {
		return( getGenFileBuff().getOptionalExpansionFileName() );
	}

	public Long getOptionalExpansionFileNameTenantId() {
		return( getGenFileBuff().getOptionalExpansionFileNameTenantId() );
	}

	public Long getOptionalExpansionFileNameGelCacheId() {
		return( getGenFileBuff().getOptionalExpansionFileNameGelCacheId() );
	}

	public Long getOptionalExpansionFileNameGelId() {
		return( getGenFileBuff().getOptionalExpansionFileNameGelId() );
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsSrcBundleGel() {
		return( getOptionalComponentsSrcBundleGel( false ) );
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsSrcBundleGel( boolean forceRead ) {
		if( ( optionalComponentsSrcBundleGel == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGenFileBuff().getOptionalSourceBundleTenantId() == null ) {
				anyMissing = true;
			}
			if( getGenFileBuff().getOptionalSourceBundleGelCacheId() == null ) {
				anyMissing = true;
			}
			if( getGenFileBuff().getOptionalSourceBundleGelId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalComponentsSrcBundleGel = ((IYCFGenKbSchemaObj)schema).getGelExecutableTableObj().readGelExecutableByPIdx( getGenFileBuff().getOptionalSourceBundleTenantId(),
					getGenFileBuff().getOptionalSourceBundleGelCacheId(),
					getGenFileBuff().getOptionalSourceBundleGelId(), forceRead );
			}
		}
		return( optionalComponentsSrcBundleGel );
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsBasePackageGel() {
		return( getOptionalComponentsBasePackageGel( false ) );
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsBasePackageGel( boolean forceRead ) {
		if( ( optionalComponentsBasePackageGel == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGenFileBuff().getOptionalBasePackageTenantId() == null ) {
				anyMissing = true;
			}
			if( getGenFileBuff().getOptionalBasePackageGelCacheId() == null ) {
				anyMissing = true;
			}
			if( getGenFileBuff().getOptionalBasePackageGelId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalComponentsBasePackageGel = ((IYCFGenKbSchemaObj)schema).getGelExecutableTableObj().readGelExecutableByPIdx( getGenFileBuff().getOptionalBasePackageTenantId(),
					getGenFileBuff().getOptionalBasePackageGelCacheId(),
					getGenFileBuff().getOptionalBasePackageGelId(), forceRead );
			}
		}
		return( optionalComponentsBasePackageGel );
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsModuleNameGel() {
		return( getOptionalComponentsModuleNameGel( false ) );
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsModuleNameGel( boolean forceRead ) {
		if( ( optionalComponentsModuleNameGel == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGenFileBuff().getOptionalModuleNameTenantId() == null ) {
				anyMissing = true;
			}
			if( getGenFileBuff().getOptionalModuleNameGelCacheId() == null ) {
				anyMissing = true;
			}
			if( getGenFileBuff().getOptionalModuleNameGelId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalComponentsModuleNameGel = ((IYCFGenKbSchemaObj)schema).getGelExecutableTableObj().readGelExecutableByPIdx( getGenFileBuff().getOptionalModuleNameTenantId(),
					getGenFileBuff().getOptionalModuleNameGelCacheId(),
					getGenFileBuff().getOptionalModuleNameGelId(), forceRead );
			}
		}
		return( optionalComponentsModuleNameGel );
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsSubPackageGel() {
		return( getOptionalComponentsSubPackageGel( false ) );
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsSubPackageGel( boolean forceRead ) {
		if( ( optionalComponentsSubPackageGel == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGenFileBuff().getOptionalSubPackageTenantId() == null ) {
				anyMissing = true;
			}
			if( getGenFileBuff().getOptionalSubPackageGelCacheId() == null ) {
				anyMissing = true;
			}
			if( getGenFileBuff().getOptionalSubPackageGelId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalComponentsSubPackageGel = ((IYCFGenKbSchemaObj)schema).getGelExecutableTableObj().readGelExecutableByPIdx( getGenFileBuff().getOptionalSubPackageTenantId(),
					getGenFileBuff().getOptionalSubPackageGelCacheId(),
					getGenFileBuff().getOptionalSubPackageGelId(), forceRead );
			}
		}
		return( optionalComponentsSubPackageGel );
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsExpClassGel() {
		return( getOptionalComponentsExpClassGel( false ) );
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsExpClassGel( boolean forceRead ) {
		if( ( optionalComponentsExpClassGel == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGenFileBuff().getOptionalExpansionClassNameTenantId() == null ) {
				anyMissing = true;
			}
			if( getGenFileBuff().getOptionalExpansionClassNameGelCacheId() == null ) {
				anyMissing = true;
			}
			if( getGenFileBuff().getOptionalExpansionClassNameGelId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalComponentsExpClassGel = ((IYCFGenKbSchemaObj)schema).getGelExecutableTableObj().readGelExecutableByPIdx( getGenFileBuff().getOptionalExpansionClassNameTenantId(),
					getGenFileBuff().getOptionalExpansionClassNameGelCacheId(),
					getGenFileBuff().getOptionalExpansionClassNameGelId(), forceRead );
			}
		}
		return( optionalComponentsExpClassGel );
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsExpKeyNameGel() {
		return( getOptionalComponentsExpKeyNameGel( false ) );
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsExpKeyNameGel( boolean forceRead ) {
		if( ( optionalComponentsExpKeyNameGel == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGenFileBuff().getOptionalExpansionKeyNameTenantId() == null ) {
				anyMissing = true;
			}
			if( getGenFileBuff().getOptionalExpansionKeyNameGelCacheId() == null ) {
				anyMissing = true;
			}
			if( getGenFileBuff().getOptionalExpansionKeyNameGelId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalComponentsExpKeyNameGel = ((IYCFGenKbSchemaObj)schema).getGelExecutableTableObj().readGelExecutableByPIdx( getGenFileBuff().getOptionalExpansionKeyNameTenantId(),
					getGenFileBuff().getOptionalExpansionKeyNameGelCacheId(),
					getGenFileBuff().getOptionalExpansionKeyNameGelId(), forceRead );
			}
		}
		return( optionalComponentsExpKeyNameGel );
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsExpFileNameGel() {
		return( getOptionalComponentsExpFileNameGel( false ) );
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsExpFileNameGel( boolean forceRead ) {
		if( ( optionalComponentsExpFileNameGel == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGenFileBuff().getOptionalExpansionFileNameTenantId() == null ) {
				anyMissing = true;
			}
			if( getGenFileBuff().getOptionalExpansionFileNameGelCacheId() == null ) {
				anyMissing = true;
			}
			if( getGenFileBuff().getOptionalExpansionFileNameGelId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalComponentsExpFileNameGel = ((IYCFGenKbSchemaObj)schema).getGelExecutableTableObj().readGelExecutableByPIdx( getGenFileBuff().getOptionalExpansionFileNameTenantId(),
					getGenFileBuff().getOptionalExpansionFileNameGelCacheId(),
					getGenFileBuff().getOptionalExpansionFileNameGelId(), forceRead );
			}
		}
		return( optionalComponentsExpFileNameGel );
	}

	public static IYCFGenKbGelExecutableObj getSrcBundleBin( MssYCFGelCompiler gelCompiler, IYCFGenKbGenFileObj genFile ) {
		final String S_ProcName = "YCFGenKbGenFileObj.getSrcBundleBin() ";
		IYCFGenKbGelExecutableObj bin = genFile.getOptionalComponentsSrcBundleGel();
		if( bin == null ) {
			String execName = genFile.getRequiredLookupToolSet().getRequiredName()
				+ "::" + genFile.getRequiredLookupRuleType().getRequiredName()
				+ "::" + (( genFile.getOptionalLookupScopeDef() == null ) ? "Object" : genFile.getOptionalLookupScopeDef().getRequiredName() )
				+ "::" + genFile.getRequiredLookupGenDef().getRequiredName()
				+ "::" + genFile.getRequiredName()
				+ "::SrcBundle";
			String source = genFile.getOptionalSourceBundle();
			bin = gelCompiler.compileExecutable( execName, source );
			if( bin == null ) {
				throw new RuntimeException( S_ProcName + "Could not compile SrcBundle GEL executable from source \"" + source + "\"" );
			}

			IYCFGenKbGenFileEditObj editFile = genFile.getEditAsGenFile();
			if( editFile != null ) {
				editFile.setOptionalComponentsSrcBundleGel( bin );
			}
			else {
				editFile = (IYCFGenKbGenFileEditObj)genFile.beginEdit();
				editFile.setOptionalComponentsSrcBundleGel( bin );
				editFile.update();
				editFile = null;
			}
		}
		return( bin );
	}

	public static IYCFGenKbGelExecutableObj getBasePackageBin( MssYCFGelCompiler gelCompiler, IYCFGenKbGenFileObj genFile ) {
		final String S_ProcName = "YCFGenKbGenFileObj.getBasePackageBin() ";
		IYCFGenKbGelExecutableObj bin = genFile.getOptionalComponentsBasePackageGel();
		if( bin == null ) {
			String execName = genFile.getRequiredLookupToolSet().getRequiredName()
				+ "::" + genFile.getRequiredLookupRuleType().getRequiredName()
				+ "::" + (( genFile.getOptionalLookupScopeDef() == null ) ? "Object" : genFile.getOptionalLookupScopeDef().getRequiredName() )
				+ "::" + genFile.getRequiredLookupGenDef().getRequiredName()
				+ "::" + genFile.getRequiredName()
				+ "::BasePackage";
			String source = genFile.getOptionalBasePackageName();
			bin = gelCompiler.compileExecutable( execName, source );
			if( bin == null ) {
				throw new RuntimeException( S_ProcName + "Could not compile BasePackageName GEL executable from source \"" + source + "\"" );
			}

			IYCFGenKbGenFileEditObj editFile = genFile.getEditAsGenFile();
			if( editFile != null ) {
				editFile.setOptionalComponentsBasePackageGel( bin );
			}
			else {
				editFile = (IYCFGenKbGenFileEditObj)genFile.beginEdit();
				editFile.setOptionalComponentsBasePackageGel( bin );
				editFile.update();
				editFile = null;
			}
		}
		return( bin );
	}

	public static IYCFGenKbGelExecutableObj getModuleNameBin( MssYCFGelCompiler gelCompiler, IYCFGenKbGenFileObj genFile ) {
		final String S_Empty = "";
		final String S_ProcName = "YCFGenKbGenFileObj.getModuleNameBin() ";
		IYCFGenKbGelExecutableObj bin = genFile.getOptionalComponentsModuleNameGel();
		if( bin == null ) {
			String execName = genFile.getRequiredLookupToolSet().getRequiredName()
				+ "::" + genFile.getRequiredLookupRuleType().getRequiredName()
				+ "::" + (( genFile.getOptionalLookupScopeDef() == null ) ? "Object" : genFile.getOptionalLookupScopeDef().getRequiredName() )
				+ "::" + genFile.getRequiredLookupGenDef().getRequiredName()
				+ "::" + genFile.getRequiredName()
				+ "::ModuleName";
			String source = genFile.getOptionalModuleName();
			if( source == null ) {
				source = S_Empty;
			}

			bin = gelCompiler.compileExecutable( execName, source );
			if( bin == null ) {
				throw new RuntimeException( S_ProcName + "Could not compile ModuleName GEL executable from source \"" + source + "\"" );
			}

			IYCFGenKbGenFileEditObj editFile = genFile.getEditAsGenFile();
			if( editFile != null ) {
				editFile.setOptionalComponentsModuleNameGel( bin );
			}
			else {
				editFile = (IYCFGenKbGenFileEditObj)genFile.beginEdit();
				editFile.setOptionalComponentsModuleNameGel( bin );
				editFile.update();
				editFile = null;
			}
		}
		return( bin );
	}

	public static IYCFGenKbGelExecutableObj getSubPackageBin( MssYCFGelCompiler gelCompiler, IYCFGenKbGenFileObj genFile ) {
		final String S_ProcName = "YCFGenKbGenFileObj.getSubPackageBin() ";
		IYCFGenKbGelExecutableObj bin = genFile.getOptionalComponentsSubPackageGel();
		if( bin == null ) {
			String execName = genFile.getRequiredLookupToolSet().getRequiredName()
				+ "::" + genFile.getRequiredLookupRuleType().getRequiredName()
				+ "::" + (( genFile.getOptionalLookupScopeDef() == null ) ? "Object" : genFile.getOptionalLookupScopeDef().getRequiredName() )
				+ "::" + genFile.getRequiredLookupGenDef().getRequiredName()
				+ "::" + genFile.getRequiredName()
				+ "::SubPackage";
			String source = genFile.getOptionalSubPackageName();
			bin = gelCompiler.compileExecutable( execName, source );
			if( bin == null ) {
				throw new RuntimeException( S_ProcName + "Could not compile SubPackage GEL executable from source \"" + source + "\"" );
			}

			IYCFGenKbGenFileEditObj editFile = genFile.getEditAsGenFile();
			if( editFile != null ) {
				editFile.setOptionalComponentsSubPackageGel( bin );
			}
			else {
				editFile = (IYCFGenKbGenFileEditObj)genFile.beginEdit();
				editFile.setOptionalComponentsSubPackageGel( bin );
				editFile.update();
				editFile = null;
			}
		}
		return( bin );
	}

	public static IYCFGenKbGelExecutableObj getExpClassBin( MssYCFGelCompiler gelCompiler, IYCFGenKbGenFileObj genFile ) {
		final String S_ProcName = "YCFGenKbGenFileObj.getExpClassBin() ";
		IYCFGenKbGelExecutableObj bin = genFile.getOptionalComponentsExpClassGel();
		if( bin == null ) {
			String execName = genFile.getRequiredLookupToolSet().getRequiredName()
				+ "::" + genFile.getRequiredLookupRuleType().getRequiredName()
				+ "::" + (( genFile.getOptionalLookupScopeDef() == null ) ? "Object" : genFile.getOptionalLookupScopeDef().getRequiredName() )
				+ "::" + genFile.getRequiredLookupGenDef().getRequiredName()
				+ "::" + genFile.getRequiredName()
				+ "::ExpClass";
			String source = genFile.getOptionalExpansionClassName();
			bin = gelCompiler.compileExecutable( execName, source );
			if( bin == null ) {
				throw new RuntimeException( S_ProcName + "Could not compile ExpClass GEL executable from source \"" + source + "\"" );
			}

			IYCFGenKbGenFileEditObj editFile = genFile.getEditAsGenFile();
			if( editFile != null ) {
				editFile.setOptionalComponentsExpClassGel( bin );
			}
			else {
				editFile = (IYCFGenKbGenFileEditObj)genFile.beginEdit();
				editFile.setOptionalComponentsExpClassGel( bin );
				editFile.update();
				editFile = null;
			}
		}
		return( bin );
	}

	public static IYCFGenKbGelExecutableObj getExpKeyNameBin( MssYCFGelCompiler gelCompiler, IYCFGenKbGenFileObj genFile ) {
		final String S_ProcName = "YCFGenKbGenFileObj.getExpKeyNameBin() ";
		IYCFGenKbGelExecutableObj bin = genFile.getOptionalComponentsExpKeyNameGel();
		if( bin == null ) {
			String execName = genFile.getRequiredLookupToolSet().getRequiredName()
				+ "::" + genFile.getRequiredLookupRuleType().getRequiredName()
				+ "::" + (( genFile.getOptionalLookupScopeDef() == null ) ? "Object" : genFile.getOptionalLookupScopeDef().getRequiredName() )
				+ "::" + genFile.getRequiredLookupGenDef().getRequiredName()
				+ "::" + genFile.getRequiredName()
				+ "::ExpKeyName";
			String source = genFile.getOptionalExpansionKeyName();
			bin = gelCompiler.compileExecutable( execName, source );
			if( bin == null ) {
				throw new RuntimeException( S_ProcName + "Could not compile ExpKeyName GEL executable from source \"" + source + "\"" );
			}

			IYCFGenKbGenFileEditObj editFile = genFile.getEditAsGenFile();
			if( editFile != null ) {
				editFile.setOptionalComponentsExpKeyNameGel( bin );
			}
			else {
				editFile = (IYCFGenKbGenFileEditObj)genFile.beginEdit();
				editFile.setOptionalComponentsExpKeyNameGel( bin );
				editFile.update();
				editFile = null;
			}
		}
		return( bin );
	}

	public static IYCFGenKbGelExecutableObj getExpFileNameBin( MssYCFGelCompiler gelCompiler, IYCFGenKbGenFileObj genFile ) {
		final String S_ProcName = "YCFGenKbGenFileObj.getExpFileNameBin() ";
		IYCFGenKbGelExecutableObj bin = genFile.getOptionalComponentsExpFileNameGel();
		if( bin == null ) {
			String execName = genFile.getRequiredLookupToolSet().getRequiredName()
				+ "::" + genFile.getRequiredLookupRuleType().getRequiredName()
				+ "::" + (( genFile.getOptionalLookupScopeDef() == null ) ? "Object" : genFile.getOptionalLookupScopeDef().getRequiredName() )
				+ "::" + genFile.getRequiredLookupGenDef().getRequiredName()
				+ "::" + genFile.getRequiredName()
				+ "::ExpansionFileName";
			String source = genFile.getOptionalExpansionFileName();
			bin = gelCompiler.compileExecutable( execName, source );
			if( bin == null ) {
				throw new RuntimeException( S_ProcName + "Could not compile ExpFileName GEL executable from source \"" + source + "\"" );
			}

			IYCFGenKbGenFileEditObj editFile = genFile.getEditAsGenFile();
			if( editFile != null ) {
				editFile.setOptionalComponentsExpFileNameGel( bin );
			}
			else {
				editFile = (IYCFGenKbGenFileEditObj)genFile.beginEdit();
				editFile.setOptionalComponentsExpFileNameGel( bin );
				editFile.update();
				editFile = null;
			}
		}
		return( bin );
	}
}
