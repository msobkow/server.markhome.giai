// Description: Java 11 Schema Object interface for YCFInt.

/*
 *	org.mssycf.mssycf.YCFInt
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFInt 2.13 Internet Essentials
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFInt.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfint.YCFIntObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;

public interface IYCFIntSchemaObj
	extends IYCFSecSchemaObj
{
	/**
	 *	Get the License interface for the schema.
	 *
	 *	@return	The IYCFIntLicenseTableObj interface implementation for the schema.
	 */
	IYCFIntLicenseTableObj getLicenseTableObj();

	/**
	 *	Get the MajorVersion interface for the schema.
	 *
	 *	@return	The IYCFIntMajorVersionTableObj interface implementation for the schema.
	 */
	IYCFIntMajorVersionTableObj getMajorVersionTableObj();

	/**
	 *	Get the MimeType interface for the schema.
	 *
	 *	@return	The IYCFIntMimeTypeTableObj interface implementation for the schema.
	 */
	IYCFIntMimeTypeTableObj getMimeTypeTableObj();

	/**
	 *	Get the MinorVersion interface for the schema.
	 *
	 *	@return	The IYCFIntMinorVersionTableObj interface implementation for the schema.
	 */
	IYCFIntMinorVersionTableObj getMinorVersionTableObj();

	/**
	 *	Get the SubProject interface for the schema.
	 *
	 *	@return	The IYCFIntSubProjectTableObj interface implementation for the schema.
	 */
	IYCFIntSubProjectTableObj getSubProjectTableObj();

	/**
	 *	Get the Tld interface for the schema.
	 *
	 *	@return	The IYCFIntTldTableObj interface implementation for the schema.
	 */
	IYCFIntTldTableObj getTldTableObj();

	/**
	 *	Get the TopDomain interface for the schema.
	 *
	 *	@return	The IYCFIntTopDomainTableObj interface implementation for the schema.
	 */
	IYCFIntTopDomainTableObj getTopDomainTableObj();

	/**
	 *	Get the TopProject interface for the schema.
	 *
	 *	@return	The IYCFIntTopProjectTableObj interface implementation for the schema.
	 */
	IYCFIntTopProjectTableObj getTopProjectTableObj();

	/**
	 *	Get the URLProtocol interface for the schema.
	 *
	 *	@return	The IYCFIntURLProtocolTableObj interface implementation for the schema.
	 */
	IYCFIntURLProtocolTableObj getURLProtocolTableObj();
}
