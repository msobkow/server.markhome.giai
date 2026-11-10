/*
 *  MSS Code Factory YCFCore 2.13 MssYCF
 *
 *	Copyright (C) 2016-2026 Mark Stephen Sobkow
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
 *	along with this program.  If not, see &lt;https://www.gnu.org/licenses/&gt;.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package org.mssycf.mssycf.v2_13.ycfcore.MssYCF;

import java.lang.reflect.*;
import java.io.*;
import java.net.*;
import java.security.cert.*;
import java.text.*;
import java.util.*;

import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;

public class MssYCFGenFileObj
extends YCFGenKbGenFileObj
{
	public String evaluateProjectDirName( MssYCFGenContext genContext, IYCFLibAnyObj genDef ) {
		return( "overload_me_please" );
	}

	public MssYCFGenFileObj() {
		super();
	}

	public MssYCFGenFileObj(MssYCFEngine engine) {
		super( engine );
	}

	public String getBody( MssYCFGenContext genContext ) {
		final String S_ProcName = "MssYCFGenFileObj.getBody() ";
		IYCFGenKbGelInstructionObj bodyBin = YCFGenKbGenFileObj.getBodyBin( genContext.getGenEngine().getGelCompiler(), this);
		if( bodyBin == null ) {
			throw new RuntimeException( S_ProcName + "Could not resolve compiled Body GEL executable" );
		}
		String body = bodyBin.expand( genContext );
		return( body );
	}

	public String getSrcBundle( MssYCFGenContext genContext ) {
		IYCFGenKbGelInstructionObj sourceBundleBin = YCFGenKbGenFileObj.getSrcBundleBin(genContext.getGenEngine().getGelCompiler(), this);
		String sourceBundle = sourceBundleBin.expand( genContext );
		return( sourceBundle );
	}

	public String getModuleName( MssYCFGenContext genContext ) {
		IYCFGenKbGelInstructionObj moduleNameBin = YCFGenKbGenFileObj.getModuleNameBin(genContext.getGenEngine().getGelCompiler(), this);
		String moduleName = moduleNameBin.expand( genContext );
		return( moduleName );
	}

	public String getBasePackage( MssYCFGenContext genContext ) {
		IYCFGenKbGelInstructionObj basePackageBin = YCFGenKbGenFileObj.getBasePackageBin(genContext.getGenEngine().getGelCompiler(), this);
		String basePackage = basePackageBin.expand( genContext );
		return( basePackage );
	}

	public String getSubPackage( MssYCFGenContext genContext ) {
		IYCFGenKbGelInstructionObj subPackageBin = YCFGenKbGenFileObj.getSubPackageBin(genContext.getGenEngine().getGelCompiler(), this);
		String subPackage = subPackageBin.expand( genContext );
		return( subPackage );
	}

	public String getExpansionClassName( MssYCFGenContext genContext ) {
		IYCFGenKbGelInstructionObj expansionClassNameBin = YCFGenKbGenFileObj.getExpClassBin(genContext.getGenEngine().getGelCompiler(), this);
		String expansionClassName = expansionClassNameBin.expand( genContext );
		return( expansionClassName );
	}

	public String getExpansionKeyName( MssYCFGenContext genContext ) {
		IYCFGenKbGelInstructionObj expansionKeyNameBin = YCFGenKbGenFileObj.getExpKeyNameBin(genContext.getGenEngine().getGelCompiler(), this);
		String expansionKeyName = expansionKeyNameBin.expand( genContext );
		return( expansionKeyName );
	}

	public String getExpansionFileName( MssYCFGenContext genContext ) {
		IYCFGenKbGelInstructionObj expansionFileNameBin = YCFGenKbGenFileObj.getExpFileNameBin(genContext.getGenEngine().getGelCompiler(), this);
		String expansionFileName = expansionFileNameBin.expand( genContext );
		return( expansionFileName );
	}

	public String expandBody(MssYCFGenContext genContext)
	{
		Boolean needFile = false;
		final String S_ProcName = "MssYCFGenFile.expandBody() ";
		final String S_Empty = "";
		final String S_True = "true";
		final String S_False = "false";
		final String S_Yes = "yes";
		final String S_No = "no";

		String generateOnce = getOptionalGenerateOnce();

		String moduleName = getModuleName( genContext );
		// if( moduleName == null ) {
			moduleName = S_Empty;
		// }

		String rootGenDir = genContext.getRootGenDir();

		String sourceBundle = getSrcBundle( genContext );

		String basePackage = getBasePackage( genContext );
		if (basePackage == null) {
			throw new RuntimeException(S_ProcName + "Could not get base-package name for generating GenFile( \""
				+ getRequiredLookupToolSet().getRequiredName()
				+ "\", \""
				+ ((getOptionalLookupScopeDef() != null)
					? getOptionalLookupScopeDef().getRequiredName()
					: "")
				+ "\", \""
				+ getRequiredLookupGenDef().getRequiredName()
				+ "\", \""
				+ getRequiredName()
				+ "\" )");
		}

		String subPackage = getSubPackage( genContext );
		if ((subPackage != null) && (subPackage.length() == 0)) {
			subPackage = null;
		}

		String fileClass = getExpansionClassName( genContext );
		if ((fileClass == null) || (fileClass.length() == 0)) {
			throw new RuntimeException(S_ProcName + "Could not get class name for generating GenFile( \""
				+ getRequiredLookupToolSet().getRequiredName()
				+ "\", \""
				+ ((getOptionalLookupScopeDef() != null)
					? getOptionalLookupScopeDef().getRequiredName()
					: "")
				+ "\", \""
				+ getRequiredLookupGenDef().getRequiredName()
				+ "\", \""
				+ getRequiredName()
				+ "\" )");
		}

		String fileKey = getExpansionKeyName( genContext );
		if ((fileKey == null) || (fileKey.length() == 0)) {
			System.out.append(S_ProcName + "Could not get key for generating GenFile( \""
				+ getRequiredLookupToolSet().getRequiredName()
				+ "\", \""
				+ ((getOptionalLookupScopeDef() != null)
					? getOptionalLookupScopeDef().getRequiredName()
					: "")
				+ "\", \""
				+ getRequiredLookupGenDef().getRequiredName()
				+ "\", \""
				+ getRequiredName()
				+ "\" )");
			return (null);
		}

		String buildString = genContext.getGeneratingBuild();

		IYCFLibAnyObj genDef = genContext.getGenDef();
		if (genDef == null) {
			throw new RuntimeException(S_ProcName + "genContext.GenDef returned null");
		}

		String projectDirName = evaluateProjectDirName( genContext, genDef );
		if (projectDirName == null) {
			throw new RuntimeException(S_ProcName + "Could not get project directory name");
		}

		String dirSep = File.separator;

		String baseWorkDir;
		if ((sourceBundle != null) && (sourceBundle.length() > 0)) {
			baseWorkDir = sourceBundle + dirSep + projectDirName;
		}
		else {
			baseWorkDir = "src" + dirSep + projectDirName;
		}

		String baseGenDir;
		if( rootGenDir.endsWith( dirSep ) || rootGenDir.endsWith("/") || rootGenDir.endsWith("\\") ) {
			baseGenDir = rootGenDir + baseWorkDir;
		}
		else {
			baseGenDir = rootGenDir + dirSep + baseWorkDir;
		}

		String srcFileDir;
		String fullPackage;
		if ((basePackage != null) && (basePackage.length() != 0)) {
			if (subPackage != null) {
				fullPackage = basePackage + "." + subPackage;
				if( moduleName.length() > 0 ) {
					srcFileDir = basePackage + dirSep + moduleName.replace( '.', dirSep.charAt(0) ) + dirSep + subPackage.replace( '.', dirSep.charAt(0) );
				}
				else {
					srcFileDir = basePackage + dirSep + subPackage.replace( '.', dirSep.charAt(0) );
				}
			}
			else {
				fullPackage = basePackage;
				if( moduleName.length() > 0 ) {
					srcFileDir = basePackage + dirSep + moduleName.replace( '.', dirSep.charAt(0) );
				}
				else {
					srcFileDir = basePackage;
				}
			}
		}
		else {
			if (subPackage != null) {
				fullPackage = subPackage;
				if( moduleName.length() > 0 ) {
					srcFileDir = moduleName + dirSep + subPackage.replace( '.', dirSep.charAt(0) );
				}
				else {
					srcFileDir = subPackage.replace( '.', dirSep.charAt(0) );
				}
			}
			else {
				fullPackage = "";
				srcFileDir = "";
			}
		}

		String srcFileName = getExpansionFileName( genContext );
		if ((srcFileName == null) || (srcFileName.length() == 0)) {
			System.out.append(S_ProcName + "Could not get the file name for generating " + fileKey + " support\n");
			return (null);
		}

		needFile = true;
		if (!needFile) {
			return ("");
		}

		// Make sure we have a valid compile before opening the file at all
		IYCFGenKbGelInstructionObj bodyBin = YCFGenKbGenFileObj.getBodyBin( genContext.getGenEngine().getGelCompiler(), this);

		try {
			genContext.openSourceFile(this,
				fileClass,
				sourceBundle,
				moduleName,
				fullPackage,
				baseGenDir,
				baseWorkDir,
				srcFileDir,
				srcFileName,
				generateOnce );
		}
		catch (Exception e) {
			System.out.append(S_ProcName + "Could not open " + fileKey + " file for generation: " + e.getMessage() + "\n" );
			YCFLib.beep();
			return (null);
		}

		String fileContents = null;
		String ret = baseGenDir + dirSep + srcFileName;
		try {
			fileContents = bodyBin.expand( genContext );
			if( srcFileName.endsWith( ".bat" ) ) {
				fileContents = fileContents.replace( "\n", "\r\n" );
				fileContents = fileContents.replace( "\r\r", "\r" );
			}
		}
		catch (Exception e) {
			ret = null;
			String msg = e.getMessage();
			if( msg != null ) {
				System.out.append(S_ProcName
						+ e.getClass().getSimpleName()
						+ " exception generating "
						+ fileKey
						+ " file \""
						+ baseGenDir + dirSep + srcFileName
						+ "\" -- " + msg + " -- Stack trace follows\n" );
			}
			else {
				System.out.append(S_ProcName
						+ e.getClass().getSimpleName()
						+ " exception generating "
						+ fileKey
						+ " file \""
						+ baseGenDir + dirSep + srcFileName
						+ "\" -- Stack trace follows\n" );

			}
			YCFLib.beep();
	    	e.printStackTrace( /*_Log.getPrintStream()*/ );
		}

		//	If there were no problems expanding, write the contents of the file

		if (fileContents !=  null) {
			try {
				genContext.write(fileContents);
			}
			catch (Exception e) {
				ret = null;
				System.out.append(S_ProcName + "Error writing to " + fileKey + " file \""
					+ baseGenDir + dirSep + srcFileName
					+ "\" -- " + e.getMessage() + "\n" );
				YCFLib.beep();
			}
		}

		try {
			genContext.closeSourceFile();
		}
		catch (Exception e) {
			ret = null;
			System.out.append(S_ProcName + "Error closing " + fileKey + " file \""
				+ baseGenDir + dirSep + srcFileName
				+ "\" -- " + e.getMessage() + "\n" );
			YCFLib.beep();
		}

		return (ret);
	}
}
