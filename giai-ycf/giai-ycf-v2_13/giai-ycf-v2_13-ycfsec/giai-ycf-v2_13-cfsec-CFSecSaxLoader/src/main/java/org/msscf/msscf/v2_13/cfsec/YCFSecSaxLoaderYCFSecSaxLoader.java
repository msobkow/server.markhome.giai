// Description: Java 11 XML SAX Parser for YCFSec.

/*
 *	org.mssycf.mssycf.YCFSec
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
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

package org.mssycf.mssycf.v2_13.ycfsec.YCFSecSaxLoader;

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
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;

public class YCFSecSaxLoader
	extends YCFLibXmlCoreSaxParser
	implements ContentHandler
{

	// The namespace URI of the supported schema
	public final static String	SCHEMA_XMLNS = "http://mycf.markhome.server/mssycf/2.0.13/xsd/ycfsec-structured.xsd";

	// The source for loading the supported schema
	public final static String	SCHEMA_URI = "http://mycf.markhome.server/mssycf/2.0.13/xsd/ycfsec-structured.xsd";
	public final static String	SCHEMA_ROOT_URI = "http://mycf.markhome.server/mssycf/2.0.13/xsd/ycfsec-structured.xsd";

	// The schema instance to load in to

	private IYCFSecSchemaObj schemaObj = null;

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
	private LoaderBehaviourEnum sysClusterLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum tSecGroupLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum tSecGrpIncLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum tSecGrpMembLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum tenantLoaderBehaviour = LoaderBehaviourEnum.Insert;


	// Constructors

	public YCFSecSaxLoader() {
		super();
		setRootElementHandler( getSaxRootHandler() );
		initParser();
	}

	public YCFSecSaxLoader( IYCFLibMessageLog logger ) {
		super( logger );
		setRootElementHandler( getSaxRootHandler() );
		initParser();
	}

	// Element Handler instances

	private YCFSecSaxLoaderCluster clusterHandler = null;
	private YCFSecSaxLoaderHostNode hostNodeHandler = null;
	private YCFSecSaxLoaderISOCcy iSOCcyHandler = null;
	private YCFSecSaxLoaderISOCtry iSOCtryHandler = null;
	private YCFSecSaxLoaderISOCtryCcy iSOCtryCcyHandler = null;
	private YCFSecSaxLoaderISOCtryLang iSOCtryLangHandler = null;
	private YCFSecSaxLoaderISOLang iSOLangHandler = null;
	private YCFSecSaxLoaderISOTZone iSOTZoneHandler = null;
	private YCFSecSaxLoaderSecApp secAppHandler = null;
	private YCFSecSaxLoaderSecDevice secDeviceHandler = null;
	private YCFSecSaxLoaderSecForm secFormHandler = null;
	private YCFSecSaxLoaderSecGroup secGroupHandler = null;
	private YCFSecSaxLoaderSecGroupForm secGroupFormHandler = null;
	private YCFSecSaxLoaderSecGrpInc secGrpIncHandler = null;
	private YCFSecSaxLoaderSecGrpMemb secGrpMembHandler = null;
	private YCFSecSaxLoaderSecSession secSessionHandler = null;
	private YCFSecSaxLoaderSecUser secUserHandler = null;
	private YCFSecSaxLoaderService serviceHandler = null;
	private YCFSecSaxLoaderServiceType serviceTypeHandler = null;
	private YCFSecSaxLoaderSysCluster sysClusterHandler = null;
	private YCFSecSaxLoaderTSecGroup tSecGroupHandler = null;
	private YCFSecSaxLoaderTSecGrpInc tSecGrpIncHandler = null;
	private YCFSecSaxLoaderTSecGrpMemb tSecGrpMembHandler = null;
	private YCFSecSaxLoaderTenant tenantHandler = null;
	private YCFSecSaxRootHandler saxRootHandler = null;

	private YCFSecSaxDocHandler saxDocHandler = null;

	// Schema object accessors

	// SchemaObj accessors

	public IYCFSecSchemaObj getSchemaObj() {
		return( schemaObj );
	}

	public void setSchemaObj( IYCFSecSchemaObj value ) {
		schemaObj = value;
	}

	// Element Handler Resolver Factories

	protected YCFSecSaxLoaderCluster getClusterHandler() {
		if( clusterHandler == null ) {
			clusterHandler = new YCFSecSaxLoaderCluster( this );
			clusterHandler.addElementHandler( "HostNode", getHostNodeHandler() );
			clusterHandler.addElementHandler( "Tenant", getTenantHandler() );
			clusterHandler.addElementHandler( "SecApp", getSecAppHandler() );
			clusterHandler.addElementHandler( "SecGroup", getSecGroupHandler() );
			clusterHandler.addElementHandler( "SysCluster", getSysClusterHandler() );
		}
		return( clusterHandler );
	}
	protected YCFSecSaxLoaderHostNode getHostNodeHandler() {
		if( hostNodeHandler == null ) {
			hostNodeHandler = new YCFSecSaxLoaderHostNode( this );
			hostNodeHandler.addElementHandler( "Service", getServiceHandler() );
		}
		return( hostNodeHandler );
	}
	protected YCFSecSaxLoaderISOCcy getISOCcyHandler() {
		if( iSOCcyHandler == null ) {
			iSOCcyHandler = new YCFSecSaxLoaderISOCcy( this );
		}
		return( iSOCcyHandler );
	}
	protected YCFSecSaxLoaderISOCtry getISOCtryHandler() {
		if( iSOCtryHandler == null ) {
			iSOCtryHandler = new YCFSecSaxLoaderISOCtry( this );
			iSOCtryHandler.addElementHandler( "ISOCtryCcy", getISOCtryCcyHandler() );
			iSOCtryHandler.addElementHandler( "ISOCtryLang", getISOCtryLangHandler() );
		}
		return( iSOCtryHandler );
	}
	protected YCFSecSaxLoaderISOCtryCcy getISOCtryCcyHandler() {
		if( iSOCtryCcyHandler == null ) {
			iSOCtryCcyHandler = new YCFSecSaxLoaderISOCtryCcy( this );
		}
		return( iSOCtryCcyHandler );
	}
	protected YCFSecSaxLoaderISOCtryLang getISOCtryLangHandler() {
		if( iSOCtryLangHandler == null ) {
			iSOCtryLangHandler = new YCFSecSaxLoaderISOCtryLang( this );
		}
		return( iSOCtryLangHandler );
	}
	protected YCFSecSaxLoaderISOLang getISOLangHandler() {
		if( iSOLangHandler == null ) {
			iSOLangHandler = new YCFSecSaxLoaderISOLang( this );
		}
		return( iSOLangHandler );
	}
	protected YCFSecSaxLoaderISOTZone getISOTZoneHandler() {
		if( iSOTZoneHandler == null ) {
			iSOTZoneHandler = new YCFSecSaxLoaderISOTZone( this );
		}
		return( iSOTZoneHandler );
	}
	protected YCFSecSaxLoaderSecApp getSecAppHandler() {
		if( secAppHandler == null ) {
			secAppHandler = new YCFSecSaxLoaderSecApp( this );
			secAppHandler.addElementHandler( "SecForm", getSecFormHandler() );
		}
		return( secAppHandler );
	}
	protected YCFSecSaxLoaderSecDevice getSecDeviceHandler() {
		if( secDeviceHandler == null ) {
			secDeviceHandler = new YCFSecSaxLoaderSecDevice( this );
		}
		return( secDeviceHandler );
	}
	protected YCFSecSaxLoaderSecForm getSecFormHandler() {
		if( secFormHandler == null ) {
			secFormHandler = new YCFSecSaxLoaderSecForm( this );
		}
		return( secFormHandler );
	}
	protected YCFSecSaxLoaderSecGroup getSecGroupHandler() {
		if( secGroupHandler == null ) {
			secGroupHandler = new YCFSecSaxLoaderSecGroup( this );
			secGroupHandler.addElementHandler( "SecGrpInc", getSecGrpIncHandler() );
			secGroupHandler.addElementHandler( "SecGrpMemb", getSecGrpMembHandler() );
			secGroupHandler.addElementHandler( "SecGroupForm", getSecGroupFormHandler() );
		}
		return( secGroupHandler );
	}
	protected YCFSecSaxLoaderSecGroupForm getSecGroupFormHandler() {
		if( secGroupFormHandler == null ) {
			secGroupFormHandler = new YCFSecSaxLoaderSecGroupForm( this );
		}
		return( secGroupFormHandler );
	}
	protected YCFSecSaxLoaderSecGrpInc getSecGrpIncHandler() {
		if( secGrpIncHandler == null ) {
			secGrpIncHandler = new YCFSecSaxLoaderSecGrpInc( this );
		}
		return( secGrpIncHandler );
	}
	protected YCFSecSaxLoaderSecGrpMemb getSecGrpMembHandler() {
		if( secGrpMembHandler == null ) {
			secGrpMembHandler = new YCFSecSaxLoaderSecGrpMemb( this );
		}
		return( secGrpMembHandler );
	}
	protected YCFSecSaxLoaderSecSession getSecSessionHandler() {
		if( secSessionHandler == null ) {
			secSessionHandler = new YCFSecSaxLoaderSecSession( this );
		}
		return( secSessionHandler );
	}
	protected YCFSecSaxLoaderSecUser getSecUserHandler() {
		if( secUserHandler == null ) {
			secUserHandler = new YCFSecSaxLoaderSecUser( this );
			secUserHandler.addElementHandler( "SecDevice", getSecDeviceHandler() );
			secUserHandler.addElementHandler( "SecSession", getSecSessionHandler() );
		}
		return( secUserHandler );
	}
	protected YCFSecSaxLoaderService getServiceHandler() {
		if( serviceHandler == null ) {
			serviceHandler = new YCFSecSaxLoaderService( this );
		}
		return( serviceHandler );
	}
	protected YCFSecSaxLoaderServiceType getServiceTypeHandler() {
		if( serviceTypeHandler == null ) {
			serviceTypeHandler = new YCFSecSaxLoaderServiceType( this );
		}
		return( serviceTypeHandler );
	}
	protected YCFSecSaxLoaderSysCluster getSysClusterHandler() {
		if( sysClusterHandler == null ) {
			sysClusterHandler = new YCFSecSaxLoaderSysCluster( this );
		}
		return( sysClusterHandler );
	}
	protected YCFSecSaxLoaderTSecGroup getTSecGroupHandler() {
		if( tSecGroupHandler == null ) {
			tSecGroupHandler = new YCFSecSaxLoaderTSecGroup( this );
			tSecGroupHandler.addElementHandler( "TSecGrpInc", getTSecGrpIncHandler() );
			tSecGroupHandler.addElementHandler( "TSecGrpMemb", getTSecGrpMembHandler() );
		}
		return( tSecGroupHandler );
	}
	protected YCFSecSaxLoaderTSecGrpInc getTSecGrpIncHandler() {
		if( tSecGrpIncHandler == null ) {
			tSecGrpIncHandler = new YCFSecSaxLoaderTSecGrpInc( this );
		}
		return( tSecGrpIncHandler );
	}
	protected YCFSecSaxLoaderTSecGrpMemb getTSecGrpMembHandler() {
		if( tSecGrpMembHandler == null ) {
			tSecGrpMembHandler = new YCFSecSaxLoaderTSecGrpMemb( this );
		}
		return( tSecGrpMembHandler );
	}
	protected YCFSecSaxLoaderTenant getTenantHandler() {
		if( tenantHandler == null ) {
			tenantHandler = new YCFSecSaxLoaderTenant( this );
			tenantHandler.addElementHandler( "TSecGroup", getTSecGroupHandler() );
		}
		return( tenantHandler );
	}
	// Root Element Handler Resolver Factory

	protected YCFSecSaxRootHandler getSaxRootHandler() {
		if( saxRootHandler == null ) {
			saxRootHandler = new YCFSecSaxRootHandler( this );
			saxRootHandler.addElementHandler( "YCFSec", getSaxDocHandler() );
		}
		return( saxRootHandler );
	}

	// Root Element Handler

	/*
	 *	YCFSecSaxRootHandler XML SAX Root Element Handler implementation
	 */
	public class YCFSecSaxRootHandler
		extends YCFLibXmlCoreElementHandler
	{
		public YCFSecSaxRootHandler( YCFSecSaxLoader saxLoader ) {
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

	protected YCFSecSaxDocHandler getSaxDocHandler() {
		if( saxDocHandler == null ) {
			saxDocHandler = new YCFSecSaxDocHandler( this );
			saxDocHandler.addElementHandler( "Cluster", getClusterHandler() );
			saxDocHandler.addElementHandler( "ISOCcy", getISOCcyHandler() );
			saxDocHandler.addElementHandler( "ISOCtry", getISOCtryHandler() );
			saxDocHandler.addElementHandler( "ISOLang", getISOLangHandler() );
			saxDocHandler.addElementHandler( "ISOTZone", getISOTZoneHandler() );
			saxDocHandler.addElementHandler( "SecUser", getSecUserHandler() );
			saxDocHandler.addElementHandler( "ServiceType", getServiceTypeHandler() );
		}
		return( saxDocHandler );
	}

	// Document Element Handler

	/*
	 *	YCFSecSaxDocHandler XML SAX Doc Element Handler implementation
	 */
	public class YCFSecSaxDocHandler
		extends YCFLibXmlCoreElementHandler
	{
		public YCFSecSaxDocHandler( YCFSecSaxLoader saxLoader ) {
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

	// Parse a file

	public void parseFile( String url ) {
		parse( url );
	}
}
