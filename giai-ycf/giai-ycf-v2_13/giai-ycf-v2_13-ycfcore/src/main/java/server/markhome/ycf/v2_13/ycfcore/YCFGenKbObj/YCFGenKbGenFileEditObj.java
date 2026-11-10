// Description: Java 11 edit object instance implementation for YCFGenKb GenFile.

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

public class YCFGenKbGenFileEditObj
	extends YCFGenKbGenRuleEditObj

	implements IYCFGenKbGenFileEditObj
{
	protected IYCFGenKbGelExecutableObj optionalComponentsSrcBundleGel;
	protected IYCFGenKbGelExecutableObj optionalComponentsBasePackageGel;
	protected IYCFGenKbGelExecutableObj optionalComponentsModuleNameGel;
	protected IYCFGenKbGelExecutableObj optionalComponentsSubPackageGel;
	protected IYCFGenKbGelExecutableObj optionalComponentsExpClassGel;
	protected IYCFGenKbGelExecutableObj optionalComponentsExpKeyNameGel;
	protected IYCFGenKbGelExecutableObj optionalComponentsExpFileNameGel;

	public YCFGenKbGenFileEditObj( IYCFGenKbGenFileObj argOrig ) {
		super( argOrig );
	}

	public String getClassCode() {
		return( YCFGenKbGenFileObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbGenFileObj retobj = getSchema().getGenFileTableObj().realiseGenFile( (IYCFGenKbGenFileObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsGenFile().forget();
	}

	public IYCFGenKbGenItemObj create() {
		copyBuffToOrig();
		IYCFGenKbGenFileObj retobj = ((IYCFGenKbSchemaObj)getOrigAsGenFile().getSchema()).getGenFileTableObj().createGenFile( getOrigAsGenFile() );
		if( retobj == getOrigAsGenFile() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbGenItemEditObj update() {
		getSchema().getGenFileTableObj().updateGenFile( (IYCFGenKbGenFileObj)this );
		return( null );
	}

	public YCFGenKbGenItemEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getGenFileTableObj().deleteGenFile( getOrigAsGenFile() );
		return( null );
	}

	public IYCFGenKbGenFileTableObj getGenFileTable() {
		return( orig.getSchema().getGenFileTableObj() );
	}

	public IYCFGenKbGenFileEditObj getEditAsGenFile() {
		return( (IYCFGenKbGenFileEditObj)this );
	}

	public IYCFGenKbGenFileObj getOrigAsGenFile() {
		return( (IYCFGenKbGenFileObj)orig );
	}

	public YCFGenKbGenItemBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsGenFile().getSchema().getBackingStore()).getFactoryGenFile().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbGenItemBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
		}
	}

	public YCFGenKbGenFileBuff getGenFileBuff() {
		return( (YCFGenKbGenFileBuff)getBuff() );
	}

	public String getOptionalGenerateOnce() {
		return( getGenFileBuff().getOptionalGenerateOnce() );
	}

	public void setOptionalGenerateOnce( String value ) {
		if( getGenFileBuff().getOptionalGenerateOnce() != value ) {
			getGenFileBuff().setOptionalGenerateOnce( value );
		}
	}

	public String getOptionalSourceBundle() {
		return( getGenFileBuff().getOptionalSourceBundle() );
	}

	public void setOptionalSourceBundle( String value ) {
		if( getGenFileBuff().getOptionalSourceBundle() != value ) {
			getGenFileBuff().setOptionalSourceBundle( value );
		}
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

	public void setOptionalModuleName( String value ) {
		if( getGenFileBuff().getOptionalModuleName() != value ) {
			getGenFileBuff().setOptionalModuleName( value );
		}
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

	public void setOptionalBasePackageName( String value ) {
		if( getGenFileBuff().getOptionalBasePackageName() != value ) {
			getGenFileBuff().setOptionalBasePackageName( value );
		}
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

	public void setOptionalSubPackageName( String value ) {
		if( getGenFileBuff().getOptionalSubPackageName() != value ) {
			getGenFileBuff().setOptionalSubPackageName( value );
		}
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

	public void setOptionalExpansionClassName( String value ) {
		if( getGenFileBuff().getOptionalExpansionClassName() != value ) {
			getGenFileBuff().setOptionalExpansionClassName( value );
		}
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

	public void setOptionalExpansionKeyName( String value ) {
		if( getGenFileBuff().getOptionalExpansionKeyName() != value ) {
			getGenFileBuff().setOptionalExpansionKeyName( value );
		}
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

	public void setOptionalExpansionFileName( String value ) {
		if( getGenFileBuff().getOptionalExpansionFileName() != value ) {
			getGenFileBuff().setOptionalExpansionFileName( value );
		}
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
		if( forceRead || ( optionalComponentsSrcBundleGel == null ) ) {
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
				IYCFGenKbGelExecutableObj obj = ((IYCFGenKbSchemaObj)getOrigAsGenFile().getSchema()).getGelExecutableTableObj().readGelExecutableByPIdx( getGenFileBuff().getOptionalSourceBundleTenantId(),
					getGenFileBuff().getOptionalSourceBundleGelCacheId(),
					getGenFileBuff().getOptionalSourceBundleGelId() );
				optionalComponentsSrcBundleGel = obj;
			}
		}
		return( optionalComponentsSrcBundleGel );
	}

	public void setOptionalComponentsSrcBundleGel( IYCFGenKbGelExecutableObj value ) {
			if( buff == null ) {
				getGenFileBuff();
			}
			if( value != null ) {
				getGenFileBuff().setOptionalSourceBundleTenantId( value.getRequiredTenantId() );
				getGenFileBuff().setOptionalSourceBundleGelCacheId( value.getRequiredGelCacheId() );
				getGenFileBuff().setOptionalSourceBundleGelId( value.getRequiredGelInstId() );
			}
			else {
				getGenFileBuff().setOptionalSourceBundleTenantId( null );
				getGenFileBuff().setOptionalSourceBundleGelCacheId( null );
				getGenFileBuff().setOptionalSourceBundleGelId( null );
			}
			optionalComponentsSrcBundleGel = value;
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsBasePackageGel() {
		return( getOptionalComponentsBasePackageGel( false ) );
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsBasePackageGel( boolean forceRead ) {
		if( forceRead || ( optionalComponentsBasePackageGel == null ) ) {
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
				IYCFGenKbGelExecutableObj obj = ((IYCFGenKbSchemaObj)getOrigAsGenFile().getSchema()).getGelExecutableTableObj().readGelExecutableByPIdx( getGenFileBuff().getOptionalBasePackageTenantId(),
					getGenFileBuff().getOptionalBasePackageGelCacheId(),
					getGenFileBuff().getOptionalBasePackageGelId() );
				optionalComponentsBasePackageGel = obj;
			}
		}
		return( optionalComponentsBasePackageGel );
	}

	public void setOptionalComponentsBasePackageGel( IYCFGenKbGelExecutableObj value ) {
			if( buff == null ) {
				getGenFileBuff();
			}
			if( value != null ) {
				getGenFileBuff().setOptionalBasePackageTenantId( value.getRequiredTenantId() );
				getGenFileBuff().setOptionalBasePackageGelCacheId( value.getRequiredGelCacheId() );
				getGenFileBuff().setOptionalBasePackageGelId( value.getRequiredGelInstId() );
			}
			else {
				getGenFileBuff().setOptionalBasePackageTenantId( null );
				getGenFileBuff().setOptionalBasePackageGelCacheId( null );
				getGenFileBuff().setOptionalBasePackageGelId( null );
			}
			optionalComponentsBasePackageGel = value;
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsModuleNameGel() {
		return( getOptionalComponentsModuleNameGel( false ) );
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsModuleNameGel( boolean forceRead ) {
		if( forceRead || ( optionalComponentsModuleNameGel == null ) ) {
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
				IYCFGenKbGelExecutableObj obj = ((IYCFGenKbSchemaObj)getOrigAsGenFile().getSchema()).getGelExecutableTableObj().readGelExecutableByPIdx( getGenFileBuff().getOptionalModuleNameTenantId(),
					getGenFileBuff().getOptionalModuleNameGelCacheId(),
					getGenFileBuff().getOptionalModuleNameGelId() );
				optionalComponentsModuleNameGel = obj;
			}
		}
		return( optionalComponentsModuleNameGel );
	}

	public void setOptionalComponentsModuleNameGel( IYCFGenKbGelExecutableObj value ) {
			if( buff == null ) {
				getGenFileBuff();
			}
			if( value != null ) {
				getGenFileBuff().setOptionalModuleNameTenantId( value.getRequiredTenantId() );
				getGenFileBuff().setOptionalModuleNameGelCacheId( value.getRequiredGelCacheId() );
				getGenFileBuff().setOptionalModuleNameGelId( value.getRequiredGelInstId() );
			}
			else {
				getGenFileBuff().setOptionalModuleNameTenantId( null );
				getGenFileBuff().setOptionalModuleNameGelCacheId( null );
				getGenFileBuff().setOptionalModuleNameGelId( null );
			}
			optionalComponentsModuleNameGel = value;
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsSubPackageGel() {
		return( getOptionalComponentsSubPackageGel( false ) );
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsSubPackageGel( boolean forceRead ) {
		if( forceRead || ( optionalComponentsSubPackageGel == null ) ) {
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
				IYCFGenKbGelExecutableObj obj = ((IYCFGenKbSchemaObj)getOrigAsGenFile().getSchema()).getGelExecutableTableObj().readGelExecutableByPIdx( getGenFileBuff().getOptionalSubPackageTenantId(),
					getGenFileBuff().getOptionalSubPackageGelCacheId(),
					getGenFileBuff().getOptionalSubPackageGelId() );
				optionalComponentsSubPackageGel = obj;
			}
		}
		return( optionalComponentsSubPackageGel );
	}

	public void setOptionalComponentsSubPackageGel( IYCFGenKbGelExecutableObj value ) {
			if( buff == null ) {
				getGenFileBuff();
			}
			if( value != null ) {
				getGenFileBuff().setOptionalSubPackageTenantId( value.getRequiredTenantId() );
				getGenFileBuff().setOptionalSubPackageGelCacheId( value.getRequiredGelCacheId() );
				getGenFileBuff().setOptionalSubPackageGelId( value.getRequiredGelInstId() );
			}
			else {
				getGenFileBuff().setOptionalSubPackageTenantId( null );
				getGenFileBuff().setOptionalSubPackageGelCacheId( null );
				getGenFileBuff().setOptionalSubPackageGelId( null );
			}
			optionalComponentsSubPackageGel = value;
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsExpClassGel() {
		return( getOptionalComponentsExpClassGel( false ) );
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsExpClassGel( boolean forceRead ) {
		if( forceRead || ( optionalComponentsExpClassGel == null ) ) {
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
				IYCFGenKbGelExecutableObj obj = ((IYCFGenKbSchemaObj)getOrigAsGenFile().getSchema()).getGelExecutableTableObj().readGelExecutableByPIdx( getGenFileBuff().getOptionalExpansionClassNameTenantId(),
					getGenFileBuff().getOptionalExpansionClassNameGelCacheId(),
					getGenFileBuff().getOptionalExpansionClassNameGelId() );
				optionalComponentsExpClassGel = obj;
			}
		}
		return( optionalComponentsExpClassGel );
	}

	public void setOptionalComponentsExpClassGel( IYCFGenKbGelExecutableObj value ) {
			if( buff == null ) {
				getGenFileBuff();
			}
			if( value != null ) {
				getGenFileBuff().setOptionalExpansionClassNameTenantId( value.getRequiredTenantId() );
				getGenFileBuff().setOptionalExpansionClassNameGelCacheId( value.getRequiredGelCacheId() );
				getGenFileBuff().setOptionalExpansionClassNameGelId( value.getRequiredGelInstId() );
			}
			else {
				getGenFileBuff().setOptionalExpansionClassNameTenantId( null );
				getGenFileBuff().setOptionalExpansionClassNameGelCacheId( null );
				getGenFileBuff().setOptionalExpansionClassNameGelId( null );
			}
			optionalComponentsExpClassGel = value;
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsExpKeyNameGel() {
		return( getOptionalComponentsExpKeyNameGel( false ) );
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsExpKeyNameGel( boolean forceRead ) {
		if( forceRead || ( optionalComponentsExpKeyNameGel == null ) ) {
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
				IYCFGenKbGelExecutableObj obj = ((IYCFGenKbSchemaObj)getOrigAsGenFile().getSchema()).getGelExecutableTableObj().readGelExecutableByPIdx( getGenFileBuff().getOptionalExpansionKeyNameTenantId(),
					getGenFileBuff().getOptionalExpansionKeyNameGelCacheId(),
					getGenFileBuff().getOptionalExpansionKeyNameGelId() );
				optionalComponentsExpKeyNameGel = obj;
			}
		}
		return( optionalComponentsExpKeyNameGel );
	}

	public void setOptionalComponentsExpKeyNameGel( IYCFGenKbGelExecutableObj value ) {
			if( buff == null ) {
				getGenFileBuff();
			}
			if( value != null ) {
				getGenFileBuff().setOptionalExpansionKeyNameTenantId( value.getRequiredTenantId() );
				getGenFileBuff().setOptionalExpansionKeyNameGelCacheId( value.getRequiredGelCacheId() );
				getGenFileBuff().setOptionalExpansionKeyNameGelId( value.getRequiredGelInstId() );
			}
			else {
				getGenFileBuff().setOptionalExpansionKeyNameTenantId( null );
				getGenFileBuff().setOptionalExpansionKeyNameGelCacheId( null );
				getGenFileBuff().setOptionalExpansionKeyNameGelId( null );
			}
			optionalComponentsExpKeyNameGel = value;
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsExpFileNameGel() {
		return( getOptionalComponentsExpFileNameGel( false ) );
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsExpFileNameGel( boolean forceRead ) {
		if( forceRead || ( optionalComponentsExpFileNameGel == null ) ) {
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
				IYCFGenKbGelExecutableObj obj = ((IYCFGenKbSchemaObj)getOrigAsGenFile().getSchema()).getGelExecutableTableObj().readGelExecutableByPIdx( getGenFileBuff().getOptionalExpansionFileNameTenantId(),
					getGenFileBuff().getOptionalExpansionFileNameGelCacheId(),
					getGenFileBuff().getOptionalExpansionFileNameGelId() );
				optionalComponentsExpFileNameGel = obj;
			}
		}
		return( optionalComponentsExpFileNameGel );
	}

	public void setOptionalComponentsExpFileNameGel( IYCFGenKbGelExecutableObj value ) {
			if( buff == null ) {
				getGenFileBuff();
			}
			if( value != null ) {
				getGenFileBuff().setOptionalExpansionFileNameTenantId( value.getRequiredTenantId() );
				getGenFileBuff().setOptionalExpansionFileNameGelCacheId( value.getRequiredGelCacheId() );
				getGenFileBuff().setOptionalExpansionFileNameGelId( value.getRequiredGelInstId() );
			}
			else {
				getGenFileBuff().setOptionalExpansionFileNameTenantId( null );
				getGenFileBuff().setOptionalExpansionFileNameGelCacheId( null );
				getGenFileBuff().setOptionalExpansionFileNameGelId( null );
			}
			optionalComponentsExpFileNameGel = value;
	}

	public void copyBuffToOrig() {
		YCFGenKbGenFileBuff origBuff = getOrigAsGenFile().getGenFileBuff();
		YCFGenKbGenFileBuff myBuff = getGenFileBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbGenFileBuff origBuff = getOrigAsGenFile().getGenFileBuff();
		YCFGenKbGenFileBuff myBuff = getGenFileBuff();
		myBuff.set( origBuff );
	}
}
