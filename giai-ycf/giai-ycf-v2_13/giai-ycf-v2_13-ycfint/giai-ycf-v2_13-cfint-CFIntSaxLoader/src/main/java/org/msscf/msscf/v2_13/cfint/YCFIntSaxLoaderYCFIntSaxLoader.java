// Description: Java 11 XML SAX Parser for YCFInt.

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

package org.mssycf.mssycf.v2_13.ycfint.YCFIntSaxLoader;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.*;
import java.math.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.*;
import java.text.*;
import java.util.*;
import javax.naming.*;
import javax.sql.*;
import org.apache.commons.codec.binary.Base64;
import org.xml.sax.*;

import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;

public class YCFIntSaxLoader
	extends YCFLibXmlCoreSaxParser
	implements ContentHandler
{

	// The namespace URI of the supported schema
	public final static String	SCHEMA_XMLNS = "http://mycf.markhome.server/mssycf/2.0.13/xsd/ycfint-structured.xsd";

	// The source for loading the supported schema
	public final static String	SCHEMA_URI = "http://mycf.markhome.server/mssycf/2.0.13/xsd/ycfint-structured.xsd";
	public final static String	SCHEMA_ROOT_URI = "http://mycf.markhome.server/mssycf/2.0.13/xsd/ycfint-structured.xsd";

	public final static String	YCFSEC_XMLNS = "http://mycf.markhome.server/mssycf/2.0.13/xsd/ycfsec-structured.xsd";
	public final static String	YCFSEC_URI = "http://mycf.markhome.server/mssycf/2.0.13/xsd/ycfsec-structured.xsd";
	public final static String	YCFSEC_ROOT_URI = "http://mycf.markhome.server/mssycf/2.0.13/xsd/ycfsec-structured.xsd";

	// The schema instance to load in to

	private IYCFIntSchemaObj schemaObj = null;

	// The cluster to use for loading

	private IYCFSecClusterObj useCluster = null;

	public IYCFSecClusterObj getUseCluster() {
		return( useCluster );
	}

	public void setUseCluster( IYCFSecClusterObj value ) {
		useCluster = value;
	}

	// The tenant to use for loading

	private IYCFSecTenantObj useTenant = null;

	public IYCFSecTenantObj getUseTenant() {
		return( useTenant );
	}

	public void setUseTenant( IYCFSecTenantObj value ) {
		useTenant = value;
	}

	// Loader behaviour configuration attributes

	public enum LoaderBehaviourEnum {
		Insert,
		Update,
		Replace
	};
	private LoaderBehaviourEnum clusterLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum hostNodeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum iSOCcyLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum iSOCtryLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum iSOCtryCcyLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum iSOCtryLangLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum iSOLangLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum iSOTZoneLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum licenseLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum majorVersionLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum mimeTypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum minorVersionLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum secAppLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum secDeviceLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum secFormLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum secGroupLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum secGroupFormLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum secGrpIncLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum secGrpMembLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum secSessionLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum secUserLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum serviceLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum serviceTypeLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum subProjectLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum sysClusterLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum tSecGroupLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum tSecGrpIncLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum tSecGrpMembLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum tenantLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum tldLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum topDomainLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum topProjectLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum uRLProtocolLoaderBehaviour = LoaderBehaviourEnum.Update;


	// Constructors

	public YCFIntSaxLoader() {
		super();
		setRootElementHandler( getSaxRootHandler() );
		initParser();
	}

	public YCFIntSaxLoader( IYCFLibMessageLog logger ) {
		super( logger );
		setRootElementHandler( getSaxRootHandler() );
		initParser();
	}

	// Element Handler instances

	private YCFIntSaxLoaderCluster clusterHandler = null;
	private YCFIntSaxLoaderHostNode hostNodeHandler = null;
	private YCFIntSaxLoaderISOCcy iSOCcyHandler = null;
	private YCFIntSaxLoaderISOCtry iSOCtryHandler = null;
	private YCFIntSaxLoaderISOCtryCcy iSOCtryCcyHandler = null;
	private YCFIntSaxLoaderISOCtryLang iSOCtryLangHandler = null;
	private YCFIntSaxLoaderISOLang iSOLangHandler = null;
	private YCFIntSaxLoaderISOTZone iSOTZoneHandler = null;
	private YCFIntSaxLoaderLicense licenseHandler = null;
	private YCFIntSaxLoaderMajorVersion majorVersionHandler = null;
	private YCFIntSaxLoaderMimeType mimeTypeHandler = null;
	private YCFIntSaxLoaderMinorVersion minorVersionHandler = null;
	private YCFIntSaxLoaderSecApp secAppHandler = null;
	private YCFIntSaxLoaderSecDevice secDeviceHandler = null;
	private YCFIntSaxLoaderSecForm secFormHandler = null;
	private YCFIntSaxLoaderSecGroup secGroupHandler = null;
	private YCFIntSaxLoaderSecGroupForm secGroupFormHandler = null;
	private YCFIntSaxLoaderSecGrpInc secGrpIncHandler = null;
	private YCFIntSaxLoaderSecGrpMemb secGrpMembHandler = null;
	private YCFIntSaxLoaderSecSession secSessionHandler = null;
	private YCFIntSaxLoaderSecUser secUserHandler = null;
	private YCFIntSaxLoaderService serviceHandler = null;
	private YCFIntSaxLoaderServiceType serviceTypeHandler = null;
	private YCFIntSaxLoaderSubProject subProjectHandler = null;
	private YCFIntSaxLoaderSysCluster sysClusterHandler = null;
	private YCFIntSaxLoaderTSecGroup tSecGroupHandler = null;
	private YCFIntSaxLoaderTSecGrpInc tSecGrpIncHandler = null;
	private YCFIntSaxLoaderTSecGrpMemb tSecGrpMembHandler = null;
	private YCFIntSaxLoaderTenant tenantHandler = null;
	private YCFIntSaxLoaderTld tldHandler = null;
	private YCFIntSaxLoaderTopDomain topDomainHandler = null;
	private YCFIntSaxLoaderTopProject topProjectHandler = null;
	private YCFIntSaxLoaderURLProtocol uRLProtocolHandler = null;
	private YCFIntSaxRootHandler saxRootHandler = null;

	private YCFIntSaxDocHandler saxDocHandler = null;

	// Schema object accessors

	// SchemaObj accessors

	public IYCFIntSchemaObj getSchemaObj() {
		return( schemaObj );
	}

	public void setSchemaObj( IYCFIntSchemaObj value ) {
		schemaObj = value;
	}

	// Element Handler Resolver Factories

	protected YCFIntSaxLoaderCluster getClusterHandler() {
		if( clusterHandler == null ) {
			clusterHandler = new YCFIntSaxLoaderCluster( this );
			clusterHandler.addElementHandler( "HostNode", getHostNodeHandler() );
			clusterHandler.addElementHandler( "Tenant", getTenantHandler() );
			clusterHandler.addElementHandler( "SecApp", getSecAppHandler() );
			clusterHandler.addElementHandler( "SecGroup", getSecGroupHandler() );
			clusterHandler.addElementHandler( "SysCluster", getSysClusterHandler() );
		}
		return( clusterHandler );
	}
	protected YCFIntSaxLoaderHostNode getHostNodeHandler() {
		if( hostNodeHandler == null ) {
			hostNodeHandler = new YCFIntSaxLoaderHostNode( this );
			hostNodeHandler.addElementHandler( "Service", getServiceHandler() );
		}
		return( hostNodeHandler );
	}
	protected YCFIntSaxLoaderISOCcy getISOCcyHandler() {
		if( iSOCcyHandler == null ) {
			iSOCcyHandler = new YCFIntSaxLoaderISOCcy( this );
		}
		return( iSOCcyHandler );
	}
	protected YCFIntSaxLoaderISOCtry getISOCtryHandler() {
		if( iSOCtryHandler == null ) {
			iSOCtryHandler = new YCFIntSaxLoaderISOCtry( this );
			iSOCtryHandler.addElementHandler( "ISOCtryCcy", getISOCtryCcyHandler() );
			iSOCtryHandler.addElementHandler( "ISOCtryLang", getISOCtryLangHandler() );
		}
		return( iSOCtryHandler );
	}
	protected YCFIntSaxLoaderISOCtryCcy getISOCtryCcyHandler() {
		if( iSOCtryCcyHandler == null ) {
			iSOCtryCcyHandler = new YCFIntSaxLoaderISOCtryCcy( this );
		}
		return( iSOCtryCcyHandler );
	}
	protected YCFIntSaxLoaderISOCtryLang getISOCtryLangHandler() {
		if( iSOCtryLangHandler == null ) {
			iSOCtryLangHandler = new YCFIntSaxLoaderISOCtryLang( this );
		}
		return( iSOCtryLangHandler );
	}
	protected YCFIntSaxLoaderISOLang getISOLangHandler() {
		if( iSOLangHandler == null ) {
			iSOLangHandler = new YCFIntSaxLoaderISOLang( this );
		}
		return( iSOLangHandler );
	}
	protected YCFIntSaxLoaderISOTZone getISOTZoneHandler() {
		if( iSOTZoneHandler == null ) {
			iSOTZoneHandler = new YCFIntSaxLoaderISOTZone( this );
		}
		return( iSOTZoneHandler );
	}
	protected YCFIntSaxLoaderLicense getLicenseHandler() {
		if( licenseHandler == null ) {
			licenseHandler = new YCFIntSaxLoaderLicense( this );
		}
		return( licenseHandler );
	}
	protected YCFIntSaxLoaderMajorVersion getMajorVersionHandler() {
		if( majorVersionHandler == null ) {
			majorVersionHandler = new YCFIntSaxLoaderMajorVersion( this );
			majorVersionHandler.addElementHandler( "MinorVersion", getMinorVersionHandler() );
		}
		return( majorVersionHandler );
	}
	protected YCFIntSaxLoaderMimeType getMimeTypeHandler() {
		if( mimeTypeHandler == null ) {
			mimeTypeHandler = new YCFIntSaxLoaderMimeType( this );
		}
		return( mimeTypeHandler );
	}
	protected YCFIntSaxLoaderMinorVersion getMinorVersionHandler() {
		if( minorVersionHandler == null ) {
			minorVersionHandler = new YCFIntSaxLoaderMinorVersion( this );
		}
		return( minorVersionHandler );
	}
	protected YCFIntSaxLoaderSecApp getSecAppHandler() {
		if( secAppHandler == null ) {
			secAppHandler = new YCFIntSaxLoaderSecApp( this );
			secAppHandler.addElementHandler( "SecForm", getSecFormHandler() );
		}
		return( secAppHandler );
	}
	protected YCFIntSaxLoaderSecDevice getSecDeviceHandler() {
		if( secDeviceHandler == null ) {
			secDeviceHandler = new YCFIntSaxLoaderSecDevice( this );
		}
		return( secDeviceHandler );
	}
	protected YCFIntSaxLoaderSecForm getSecFormHandler() {
		if( secFormHandler == null ) {
			secFormHandler = new YCFIntSaxLoaderSecForm( this );
		}
		return( secFormHandler );
	}
	protected YCFIntSaxLoaderSecGroup getSecGroupHandler() {
		if( secGroupHandler == null ) {
			secGroupHandler = new YCFIntSaxLoaderSecGroup( this );
			secGroupHandler.addElementHandler( "SecGrpInc", getSecGrpIncHandler() );
			secGroupHandler.addElementHandler( "SecGrpMemb", getSecGrpMembHandler() );
			secGroupHandler.addElementHandler( "SecGroupForm", getSecGroupFormHandler() );
		}
		return( secGroupHandler );
	}
	protected YCFIntSaxLoaderSecGroupForm getSecGroupFormHandler() {
		if( secGroupFormHandler == null ) {
			secGroupFormHandler = new YCFIntSaxLoaderSecGroupForm( this );
		}
		return( secGroupFormHandler );
	}
	protected YCFIntSaxLoaderSecGrpInc getSecGrpIncHandler() {
		if( secGrpIncHandler == null ) {
			secGrpIncHandler = new YCFIntSaxLoaderSecGrpInc( this );
		}
		return( secGrpIncHandler );
	}
	protected YCFIntSaxLoaderSecGrpMemb getSecGrpMembHandler() {
		if( secGrpMembHandler == null ) {
			secGrpMembHandler = new YCFIntSaxLoaderSecGrpMemb( this );
		}
		return( secGrpMembHandler );
	}
	protected YCFIntSaxLoaderSecSession getSecSessionHandler() {
		if( secSessionHandler == null ) {
			secSessionHandler = new YCFIntSaxLoaderSecSession( this );
		}
		return( secSessionHandler );
	}
	protected YCFIntSaxLoaderSecUser getSecUserHandler() {
		if( secUserHandler == null ) {
			secUserHandler = new YCFIntSaxLoaderSecUser( this );
			secUserHandler.addElementHandler( "SecDevice", getSecDeviceHandler() );
			secUserHandler.addElementHandler( "SecSession", getSecSessionHandler() );
		}
		return( secUserHandler );
	}
	protected YCFIntSaxLoaderService getServiceHandler() {
		if( serviceHandler == null ) {
			serviceHandler = new YCFIntSaxLoaderService( this );
		}
		return( serviceHandler );
	}
	protected YCFIntSaxLoaderServiceType getServiceTypeHandler() {
		if( serviceTypeHandler == null ) {
			serviceTypeHandler = new YCFIntSaxLoaderServiceType( this );
		}
		return( serviceTypeHandler );
	}
	protected YCFIntSaxLoaderSubProject getSubProjectHandler() {
		if( subProjectHandler == null ) {
			subProjectHandler = new YCFIntSaxLoaderSubProject( this );
			subProjectHandler.addElementHandler( "MajorVersion", getMajorVersionHandler() );
		}
		return( subProjectHandler );
	}
	protected YCFIntSaxLoaderSysCluster getSysClusterHandler() {
		if( sysClusterHandler == null ) {
			sysClusterHandler = new YCFIntSaxLoaderSysCluster( this );
		}
		return( sysClusterHandler );
	}
	protected YCFIntSaxLoaderTSecGroup getTSecGroupHandler() {
		if( tSecGroupHandler == null ) {
			tSecGroupHandler = new YCFIntSaxLoaderTSecGroup( this );
			tSecGroupHandler.addElementHandler( "TSecGrpInc", getTSecGrpIncHandler() );
			tSecGroupHandler.addElementHandler( "TSecGrpMemb", getTSecGrpMembHandler() );
		}
		return( tSecGroupHandler );
	}
	protected YCFIntSaxLoaderTSecGrpInc getTSecGrpIncHandler() {
		if( tSecGrpIncHandler == null ) {
			tSecGrpIncHandler = new YCFIntSaxLoaderTSecGrpInc( this );
		}
		return( tSecGrpIncHandler );
	}
	protected YCFIntSaxLoaderTSecGrpMemb getTSecGrpMembHandler() {
		if( tSecGrpMembHandler == null ) {
			tSecGrpMembHandler = new YCFIntSaxLoaderTSecGrpMemb( this );
		}
		return( tSecGrpMembHandler );
	}
	protected YCFIntSaxLoaderTenant getTenantHandler() {
		if( tenantHandler == null ) {
			tenantHandler = new YCFIntSaxLoaderTenant( this );
			tenantHandler.addElementHandler( "TSecGroup", getTSecGroupHandler() );
			tenantHandler.addElementHandler( "Tld", getTldHandler() );
		}
		return( tenantHandler );
	}
	protected YCFIntSaxLoaderTld getTldHandler() {
		if( tldHandler == null ) {
			tldHandler = new YCFIntSaxLoaderTld( this );
			tldHandler.addElementHandler( "TopDomain", getTopDomainHandler() );
		}
		return( tldHandler );
	}
	protected YCFIntSaxLoaderTopDomain getTopDomainHandler() {
		if( topDomainHandler == null ) {
			topDomainHandler = new YCFIntSaxLoaderTopDomain( this );
			topDomainHandler.addElementHandler( "License", getLicenseHandler() );
			topDomainHandler.addElementHandler( "TopProject", getTopProjectHandler() );
		}
		return( topDomainHandler );
	}
	protected YCFIntSaxLoaderTopProject getTopProjectHandler() {
		if( topProjectHandler == null ) {
			topProjectHandler = new YCFIntSaxLoaderTopProject( this );
			topProjectHandler.addElementHandler( "SubProject", getSubProjectHandler() );
		}
		return( topProjectHandler );
	}
	protected YCFIntSaxLoaderURLProtocol getURLProtocolHandler() {
		if( uRLProtocolHandler == null ) {
			uRLProtocolHandler = new YCFIntSaxLoaderURLProtocol( this );
		}
		return( uRLProtocolHandler );
	}
	// Root Element Handler Resolver Factory

	protected YCFIntSaxRootHandler getSaxRootHandler() {
		if( saxRootHandler == null ) {
			saxRootHandler = new YCFIntSaxRootHandler( this );
			saxRootHandler.addElementHandler( "YCFInt", getSaxDocHandler() );
			saxRootHandler.addElementHandler( "YCFSec", getSaxDocHandler() );
		}
		return( saxRootHandler );
	}

	// Root Element Handler

	/*
	 *	YCFIntSaxRootHandler XML SAX Root Element Handler implementation
	 */
	public class YCFIntSaxRootHandler
		extends YCFLibXmlCoreElementHandler
	{
		public YCFIntSaxRootHandler( YCFIntSaxLoader saxLoader ) {
			super( saxLoader );
		}

		public void startElement(
			String		uri,
			String		localName,
			String		qName,
			Attributes	attrs )
		throws SAXException
		{
		}

		public void endElement(
			String		uri,
			String		localName,
			String		qName )
		throws SAXException
		{
		}
	}

	// Document Element Handler Resolver Factory

	protected YCFIntSaxDocHandler getSaxDocHandler() {
		if( saxDocHandler == null ) {
			saxDocHandler = new YCFIntSaxDocHandler( this );
			saxDocHandler.addElementHandler( "Cluster", getClusterHandler() );
			saxDocHandler.addElementHandler( "ISOCcy", getISOCcyHandler() );
			saxDocHandler.addElementHandler( "ISOCtry", getISOCtryHandler() );
			saxDocHandler.addElementHandler( "ISOLang", getISOLangHandler() );
			saxDocHandler.addElementHandler( "ISOTZone", getISOTZoneHandler() );
			saxDocHandler.addElementHandler( "MimeType", getMimeTypeHandler() );
			saxDocHandler.addElementHandler( "SecUser", getSecUserHandler() );
			saxDocHandler.addElementHandler( "ServiceType", getServiceTypeHandler() );
			saxDocHandler.addElementHandler( "URLProtocol", getURLProtocolHandler() );
		}
		return( saxDocHandler );
	}

	// Document Element Handler

	/*
	 *	YCFIntSaxDocHandler XML SAX Doc Element Handler implementation
	 */
	public class YCFIntSaxDocHandler
		extends YCFLibXmlCoreElementHandler
	{
		public YCFIntSaxDocHandler( YCFIntSaxLoader saxLoader ) {
			super( saxLoader );
		}

		public void startElement(
			String		uri,
			String		localName,
			String		qName,
			Attributes	attrs )
		throws SAXException
		{
		}

		public void endElement(
			String		uri,
			String		localName,
			String		qName )
		throws SAXException
		{
		}
	}

	// Loader behaviour configuration accessors

	public LoaderBehaviourEnum getClusterLoaderBehaviour() {
		return( clusterLoaderBehaviour );
	}

	public void setClusterLoaderBehaviour( LoaderBehaviourEnum value ) {
		clusterLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getHostNodeLoaderBehaviour() {
		return( hostNodeLoaderBehaviour );
	}

	public void setHostNodeLoaderBehaviour( LoaderBehaviourEnum value ) {
		hostNodeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getISOCcyLoaderBehaviour() {
		return( iSOCcyLoaderBehaviour );
	}

	public void setISOCcyLoaderBehaviour( LoaderBehaviourEnum value ) {
		iSOCcyLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getISOCtryLoaderBehaviour() {
		return( iSOCtryLoaderBehaviour );
	}

	public void setISOCtryLoaderBehaviour( LoaderBehaviourEnum value ) {
		iSOCtryLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getISOCtryCcyLoaderBehaviour() {
		return( iSOCtryCcyLoaderBehaviour );
	}

	public void setISOCtryCcyLoaderBehaviour( LoaderBehaviourEnum value ) {
		iSOCtryCcyLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getISOCtryLangLoaderBehaviour() {
		return( iSOCtryLangLoaderBehaviour );
	}

	public void setISOCtryLangLoaderBehaviour( LoaderBehaviourEnum value ) {
		iSOCtryLangLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getISOLangLoaderBehaviour() {
		return( iSOLangLoaderBehaviour );
	}

	public void setISOLangLoaderBehaviour( LoaderBehaviourEnum value ) {
		iSOLangLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getISOTZoneLoaderBehaviour() {
		return( iSOTZoneLoaderBehaviour );
	}

	public void setISOTZoneLoaderBehaviour( LoaderBehaviourEnum value ) {
		iSOTZoneLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getLicenseLoaderBehaviour() {
		return( licenseLoaderBehaviour );
	}

	public void setLicenseLoaderBehaviour( LoaderBehaviourEnum value ) {
		licenseLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getMajorVersionLoaderBehaviour() {
		return( majorVersionLoaderBehaviour );
	}

	public void setMajorVersionLoaderBehaviour( LoaderBehaviourEnum value ) {
		majorVersionLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getMimeTypeLoaderBehaviour() {
		return( mimeTypeLoaderBehaviour );
	}

	public void setMimeTypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		mimeTypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getMinorVersionLoaderBehaviour() {
		return( minorVersionLoaderBehaviour );
	}

	public void setMinorVersionLoaderBehaviour( LoaderBehaviourEnum value ) {
		minorVersionLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSecAppLoaderBehaviour() {
		return( secAppLoaderBehaviour );
	}

	public void setSecAppLoaderBehaviour( LoaderBehaviourEnum value ) {
		secAppLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSecDeviceLoaderBehaviour() {
		return( secDeviceLoaderBehaviour );
	}

	public void setSecDeviceLoaderBehaviour( LoaderBehaviourEnum value ) {
		secDeviceLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSecFormLoaderBehaviour() {
		return( secFormLoaderBehaviour );
	}

	public void setSecFormLoaderBehaviour( LoaderBehaviourEnum value ) {
		secFormLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSecGroupLoaderBehaviour() {
		return( secGroupLoaderBehaviour );
	}

	public void setSecGroupLoaderBehaviour( LoaderBehaviourEnum value ) {
		secGroupLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSecGroupFormLoaderBehaviour() {
		return( secGroupFormLoaderBehaviour );
	}

	public void setSecGroupFormLoaderBehaviour( LoaderBehaviourEnum value ) {
		secGroupFormLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSecGrpIncLoaderBehaviour() {
		return( secGrpIncLoaderBehaviour );
	}

	public void setSecGrpIncLoaderBehaviour( LoaderBehaviourEnum value ) {
		secGrpIncLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSecGrpMembLoaderBehaviour() {
		return( secGrpMembLoaderBehaviour );
	}

	public void setSecGrpMembLoaderBehaviour( LoaderBehaviourEnum value ) {
		secGrpMembLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSecSessionLoaderBehaviour() {
		return( secSessionLoaderBehaviour );
	}

	public void setSecSessionLoaderBehaviour( LoaderBehaviourEnum value ) {
		secSessionLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSecUserLoaderBehaviour() {
		return( secUserLoaderBehaviour );
	}

	public void setSecUserLoaderBehaviour( LoaderBehaviourEnum value ) {
		secUserLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getServiceLoaderBehaviour() {
		return( serviceLoaderBehaviour );
	}

	public void setServiceLoaderBehaviour( LoaderBehaviourEnum value ) {
		serviceLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getServiceTypeLoaderBehaviour() {
		return( serviceTypeLoaderBehaviour );
	}

	public void setServiceTypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		serviceTypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSubProjectLoaderBehaviour() {
		return( subProjectLoaderBehaviour );
	}

	public void setSubProjectLoaderBehaviour( LoaderBehaviourEnum value ) {
		subProjectLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSysClusterLoaderBehaviour() {
		return( sysClusterLoaderBehaviour );
	}

	public void setSysClusterLoaderBehaviour( LoaderBehaviourEnum value ) {
		sysClusterLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTSecGroupLoaderBehaviour() {
		return( tSecGroupLoaderBehaviour );
	}

	public void setTSecGroupLoaderBehaviour( LoaderBehaviourEnum value ) {
		tSecGroupLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTSecGrpIncLoaderBehaviour() {
		return( tSecGrpIncLoaderBehaviour );
	}

	public void setTSecGrpIncLoaderBehaviour( LoaderBehaviourEnum value ) {
		tSecGrpIncLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTSecGrpMembLoaderBehaviour() {
		return( tSecGrpMembLoaderBehaviour );
	}

	public void setTSecGrpMembLoaderBehaviour( LoaderBehaviourEnum value ) {
		tSecGrpMembLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTenantLoaderBehaviour() {
		return( tenantLoaderBehaviour );
	}

	public void setTenantLoaderBehaviour( LoaderBehaviourEnum value ) {
		tenantLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTldLoaderBehaviour() {
		return( tldLoaderBehaviour );
	}

	public void setTldLoaderBehaviour( LoaderBehaviourEnum value ) {
		tldLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTopDomainLoaderBehaviour() {
		return( topDomainLoaderBehaviour );
	}

	public void setTopDomainLoaderBehaviour( LoaderBehaviourEnum value ) {
		topDomainLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTopProjectLoaderBehaviour() {
		return( topProjectLoaderBehaviour );
	}

	public void setTopProjectLoaderBehaviour( LoaderBehaviourEnum value ) {
		topProjectLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getURLProtocolLoaderBehaviour() {
		return( uRLProtocolLoaderBehaviour );
	}

	public void setURLProtocolLoaderBehaviour( LoaderBehaviourEnum value ) {
		uRLProtocolLoaderBehaviour = value;
	}

	// Parse a file

	public void parseFile( String url ) {
		parse( url );
	}
}
