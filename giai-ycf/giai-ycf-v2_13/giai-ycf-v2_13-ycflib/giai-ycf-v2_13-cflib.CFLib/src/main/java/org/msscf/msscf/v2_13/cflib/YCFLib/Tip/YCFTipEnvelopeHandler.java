/*
 *	MSS Code Factory YCFLib 2.13 Common Application Functionality
 *
 *	Copyright (C) 2016-2026 Mark Stephen Sobkow (mailto:mark.sobkow@gmail.com)
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

package org.mssycf.mssycf.v2_13.ycflib.YCFLib.Tip;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.xml.sax.*;
import org.apache.commons.codec.binary.Base64;
// import org.apache.xerces.xni.grammars.Grammar;

import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.YCFLibXmlUtil;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.YCFLibXmlCoreElementHandler;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.YCFLibXmlCoreSaxParser;

public class YCFTipEnvelopeHandler
	extends YCFLibXmlCoreSaxParser
{
	// The namespace URI of the supported schema
	public final static String	SCHEMA_XMLNS = "http://mssycf.org:8088/mssycf/2.0.13/ycftipenvelope";

	// The source for loading the supported schema
	public final static String	SCHEMA_URI = "http://mssycf.org:8088/mssycf/2.0.13/xsd/ycftip-2.13-envelope.xsd";
	public final static String	SCHEMA_ROOT_URI = "/xsd/ycftip-2.13-envelope.xsd";

	// protected static Grammar myGrammar = null;

	// Constructors

	public YCFTipEnvelopeHandler() {
		super();
		setRootElementHandler( getSaxRqstRootHandler() );
		// if( myGrammar == null ) {
		// 	InputStream input;
		// 	File file = new File( SCHEMA_URI );
		// 	if( file.exists() ) {
		// 		try {
		// 			input = new FileInputStream( file );
		// 		}
		// 		catch( Exception e ) {
		// 			input = null;
		// 		}
		// 		if( input != null ) {
		// 			myGrammar = addToGrammarPool( SCHEMA_URI, input );
		// 		}
		// 	}
		// 	else {
		// 		input = getClass().getResourceAsStream( SCHEMA_ROOT_URI );
		// 		if( input != null ) {
		// 			myGrammar = addToGrammarPool( SCHEMA_ROOT_URI, input );
		// 		}
		// 	}
		// }
		initParser();
	}

	public YCFTipEnvelopeHandler( IYCFLibMessageLog logger ) {
		super( logger );
		setRootElementHandler( getSaxRqstRootHandler() );
		// if( myGrammar == null ) {
		// 	InputStream input;
		// 	File file = new File( SCHEMA_URI );
		// 	if( file.exists() ) {
		// 		try {
		// 			input = new FileInputStream( file );
		// 		}
		// 		catch( Exception e ) {
		// 			input = null;
		// 		}
		// 		if( input != null ) {
		// 			myGrammar = addToGrammarPool( SCHEMA_URI, input );
		// 		}
		// 	}
		// 	else {
		// 		input = getClass().getResourceAsStream( SCHEMA_ROOT_URI );
		// 		if( input != null ) {
		// 			myGrammar = addToGrammarPool( SCHEMA_ROOT_URI, input );
		// 		}
		// 	}
		// }
		initParser();
	}

	// The Request Handler for the incoming AppRequest and LoginRequest messages

	private IYCFTipRequestHandler requestHandler = null;

	public IYCFTipRequestHandler getRequestHandler() {
		return( requestHandler );
	}

	public void setRequestHandler( IYCFTipRequestHandler value ) {
		final String S_ProcName = "setRequestHandler";
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"value" );
		}
		requestHandler = value;
	}

	// The formatter for processing exceptions
	
	private IYCFTipThrowableFormatter throwableFormatter = null;
	
	public IYCFTipThrowableFormatter getThrowableFormatter() {
		return( throwableFormatter );
	}
	
	public void setThrowableFormatter( IYCFTipThrowableFormatter value ) {
		final String S_ProcName = "setThrowableFormatter";
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"value" );
		}
		throwableFormatter = value;
	}
	
	// Accessors for invoker

	private String response = "";

	public String getResponse() {
		return( response );
	}

	void setResponse( String str ) {
		if( str == null ) {
			response = "";
		}
		else {
			response = str;
		}
	}

	// Server Information

	private YCFTipServerInfo serverInfo = null;

	public YCFTipServerInfo getServerInfo() {
		return( serverInfo );
	}

	public void setServerInfo( YCFTipServerInfo value ) {
		final String S_ProcName = "setServerInfo";
		
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"value" );
		}
		
		serverInfo = value;
	}

	// Encryption Support

	// Session key and accessors
	
	private SecretKey sessionKey = null;

	public void setEncodedSessionKey( byte encoded[] )
	throws NoSuchAlgorithmException,
		NoSuchPaddingException,
		InvalidKeyException,
		InvalidKeySpecException
	{
		sessionKey = new SecretKeySpec( encoded, "AES" );
	}

	public byte[] encryptWithSessionKey( IvParameterSpec ivspec, byte value[] )
	throws InvalidKeyException,
		NoSuchAlgorithmException,
		NoSuchPaddingException,
		IllegalBlockSizeException,
		BadPaddingException,
		InvalidAlgorithmParameterException
	{
		final String S_ProcName = "encryptWithClientPrivateKey";

		if( sessionKey == null ) {
			throw new YCFLibUsageException( getClass(),
				S_ProcName,
				"Session key must be initialized by setEncodedSessionKey()" );
		}

		Cipher cipher = Cipher.getInstance( "AES/CBC/PKCS5Padding" );
		if( cipher == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				0,
				"cipher" );
		}

		cipher.init( Cipher.ENCRYPT_MODE, sessionKey, ivspec );

		byte encrypted[] = cipher.doFinal( value );

		return( encrypted );
	}

	public byte[] decryptWithSessionKey( IvParameterSpec ivspec, byte value[] )
	throws NoSuchAlgorithmException,
		NoSuchPaddingException,
		InvalidKeyException,
		IllegalBlockSizeException,
		BadPaddingException,
		InvalidAlgorithmParameterException
	{
		final String S_ProcName = "decryptWithClientPrivateKey";

		if( sessionKey == null ) {
			throw new YCFLibUsageException( getClass(),
				S_ProcName,
				"Session key must be initialized by setEncodedSessionKey()" );
		}

		Cipher cipher = Cipher.getInstance( "AES/CBC/PKCS5Padding" );
		if( cipher == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				0,
				"cipher" );
		}

		cipher.init( Cipher.DECRYPT_MODE, sessionKey, ivspec );
		
		byte decrypted[] = cipher.doFinal( value );

		return( decrypted );
	}

	// Client device public key for decrypting password hash
	
	private PublicKey clientPublicKey = null;
	
	public void setEncodedClientPublicKey( byte encoded[] )
	throws NoSuchAlgorithmException,
		NoSuchPaddingException,
		InvalidKeyException,
		InvalidKeySpecException
	{
		X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec( encoded );
		KeyFactory kf = KeyFactory.getInstance( "RSA" );
		clientPublicKey = kf.generatePublic( x509KeySpec );
	}

	public byte[] decryptWithClientPublicKey( byte value[] )
	throws NoSuchAlgorithmException,
		NoSuchPaddingException,
		InvalidKeyException,
		IllegalBlockSizeException,
		BadPaddingException
	{
		final String S_ProcName = "decryptWithClientPublicKey";

		if( clientPublicKey == null ) {
			throw new YCFLibUsageException( getClass(),
				S_ProcName,
				"Client public key must be set by calling setEncodedClientPublicKey() first" );
		}

		Cipher cipher = Cipher.getInstance( "RSA/ECB/PKCS1Padding" );
		if( cipher == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				0,
				"cipher" );
		}

		cipher.init( Cipher.DECRYPT_MODE, clientPublicKey );
		
		byte decrypted[] = cipher.doFinal( value );

		return( decrypted );
	}
	
	// Element Handler instances

	private YCFTipQueryServerInfoHandler queryServerInfoHandler = null;
	private YCFTipAppRequestHandler appRequestHandler = null;
	private YCFTipLoginRequestHandler loginRequestHandler = null;
	private YCFTipSaxEnvelopeDocHandler saxEnvelopeDocHandler = null;
	private YCFTipSaxEnvelopeRootHandler saxEnvelopeRootHandler = null;
	
	// Element Handler Resolver Factories

	protected YCFTipQueryServerInfoHandler getQueryServerInfoHandler() {
		if( queryServerInfoHandler == null ) {
			queryServerInfoHandler = new YCFTipQueryServerInfoHandler( this );
		}
		return( queryServerInfoHandler );
	}

	protected YCFTipAppRequestHandler getAppRequestHandler() {
		if( appRequestHandler == null ) {
			appRequestHandler = new YCFTipAppRequestHandler( this );
		}
		return( appRequestHandler );
	}

	protected YCFTipLoginRequestHandler getLoginRequestHandler() {
		if( loginRequestHandler == null ) {
			loginRequestHandler = new YCFTipLoginRequestHandler( this );
		}
		return( loginRequestHandler );
	}

	protected YCFTipSaxEnvelopeDocHandler getSaxEnvelopeDocHandler() {
		if( saxEnvelopeDocHandler == null ) {
			saxEnvelopeDocHandler = new YCFTipSaxEnvelopeDocHandler( this );
			saxEnvelopeDocHandler.addElementHandler( "AppRequest", getAppRequestHandler() );
			saxEnvelopeDocHandler.addElementHandler( "LoginRequest", getLoginRequestHandler() );
			saxEnvelopeDocHandler.addElementHandler( "QueryServerInfo", getQueryServerInfoHandler() );
		}
		return( saxEnvelopeDocHandler );
	}

	// Root Element Handler Resolver Factory

	protected YCFTipSaxEnvelopeRootHandler getSaxRqstRootHandler() {
		if( saxEnvelopeRootHandler == null ) {
			saxEnvelopeRootHandler = new YCFTipSaxEnvelopeRootHandler( this );
			saxEnvelopeRootHandler.addElementHandler( "YCFTIPEnvelope", getSaxEnvelopeDocHandler() );
		}
		return( saxEnvelopeRootHandler );
	}

	// Root Element Handler

	/*
	 *	YCFTipSaxEnvelopeRootHandler XML SAX Root Element Handler implementation
	 */
	public class YCFTipSaxEnvelopeRootHandler
		extends YCFLibXmlCoreElementHandler
	{
		public YCFTipSaxEnvelopeRootHandler( YCFTipEnvelopeHandler xmsgRqstHandler ) {
			super( xmsgRqstHandler );
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

	// Document Element Handler

	/*
	 *	YCFTipSaxEnvelopeDocHandler XML SAX Doc Element Handler implementation
	 */
	public class YCFTipSaxEnvelopeDocHandler
		extends YCFLibXmlCoreElementHandler
	{
		public YCFTipSaxEnvelopeDocHandler( YCFTipEnvelopeHandler xmsgRqstHandler ) {
			super( xmsgRqstHandler );
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

	// Parse XML string contents

	public void parseStringContents( String str ) {
		setResponse( "" );
		try {
			super.parseStringContents( str );
		}
		catch( RuntimeException e ) {
			IYCFLibMessageLog log = getLog();
			if( log != null ) {
				PrintStream printStream = log.getPrintStream();
				log.message( "Caught " + e.getClass().getName() + " -- " + e.getMessage() );
				e.printStackTrace( printStream );
			}
			else {
				e.printStackTrace();
			}
			setResponse( "" );
		}
		catch( Error e ) {
			IYCFLibMessageLog log = getLog();
			if( log != null ) {
				PrintStream printStream = log.getPrintStream();
				log.message( "Caught " + e.getClass().getName() + " -- " + e.getMessage() );
				e.printStackTrace( printStream );
			}
			else {
				e.printStackTrace();
			}
			setResponse( "" );
		}
	}

	// Parse a URL

	public void parse( String url ) {
		setResponse( "" );
		try {
			super.parse( url );
		}
		catch( RuntimeException e ) {
			IYCFLibMessageLog log = getLog();
			if( log != null ) {
				PrintStream printStream = log.getPrintStream();
				log.message( "Caught " + e.getClass().getName() + " -- " + e.getMessage() );
				e.printStackTrace( printStream );
			}
			else {
				e.printStackTrace();
			}
			setResponse( "" );
		}
		catch( Error e ) {
			IYCFLibMessageLog log = getLog();
			if( log != null ) {
				PrintStream printStream = log.getPrintStream();
				log.message( "Caught " + e.getClass().getName() + " -- " + e.getMessage() );
				e.printStackTrace( printStream );
			}
			else {
				e.printStackTrace();
			}
			setResponse( "" );
		}
	}

	// Parse a file

	public void parseFile( String url ) {
		setResponse( "" );
		try {
			super.parse( url );
		}
		catch( RuntimeException e ) {
			IYCFLibMessageLog log = getLog();
			if( log != null ) {
				PrintStream printStream = log.getPrintStream();
				log.message( "Caught " + e.getClass().getName() + " -- " + e.getMessage() );
				e.printStackTrace( printStream );
			}
			else {
				e.printStackTrace();
			}
			setResponse( "" );
		}
		catch( Error e ) {
			IYCFLibMessageLog log = getLog();
			if( log != null ) {
				PrintStream printStream = log.getPrintStream();
				log.message( "Caught " + e.getClass().getName() + " -- " + e.getMessage() );
				e.printStackTrace( printStream );
			}
			else {
				e.printStackTrace();
			}
			setResponse( "" );
		}
	}

	/*
	 *	YCFTipQueryServerInfoHandler XML SAX Element Handler implementation
	 */
	public class YCFTipQueryServerInfoHandler
		extends YCFLibXmlCoreElementHandler
	{
		public YCFTipQueryServerInfoHandler( YCFTipEnvelopeHandler envelopeHandler ) {
			super( envelopeHandler );
		}
	
		public void startElement(
			String		uri,
			String		localName,
			String		qName,
			Attributes	attrs )
		throws SAXException
		{
			final String S_ProcName = "startElement";
			final String S_LocalName = "LocalName";
	
			YCFTipEnvelopeHandler envelopeHandler = (YCFTipEnvelopeHandler)getParser();
			if( envelopeHandler == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"getParser()" );
			}
	
			try {
				// Common XML Attributes
				String	attrId = null;
				// Request Attributes
				// Attribute Extraction
				String	attrLocalName;
				int		numAttrs;
				int		idxAttr;
	
				assert qName.equals( "QueryServerInfo" );
	
				// Extract Attributes
				numAttrs = attrs.getLength();
				for( idxAttr = 0; idxAttr < numAttrs; idxAttr++ ) {
					attrLocalName = attrs.getLocalName( idxAttr );
					if( attrLocalName.equals( "Id" ) ) {
						if( attrId != null ) {
							throw new YCFLibUniqueIndexViolationException( getClass(),
								S_ProcName,
								S_LocalName,
								attrLocalName );
						}
						attrId = attrs.getValue( idxAttr );
					}
					else if( attrLocalName.equals( "schemaLocation" ) ) {
						// ignored
					}
					else {
						throw new YCFLibUnrecognizedAttributeException( getClass(),
							S_ProcName,
							getParser().getLocationInfo(),
							attrLocalName );
					}
				}
	
				// Prepare the server information response message
	
				YCFTipServerInfo serverInfo = envelopeHandler.getServerInfo();
				String clusterURL = serverInfo.getClusterURL();
				String clusterDescr = serverInfo.getClusterDescr();
				String schemaName = serverInfo.getSchemaName();
				String schemaDescr = serverInfo.getSchemaDescr();
				YCFTipServerInfo.AltSchema altSchemas[] = serverInfo.getAltSchemas();
				String serverLoginKey = serverInfo.getServerLoginKey();
				int numSchemas = altSchemas.length;
				YCFTipServerInfo.AltSchema altSchema;
				String altSchemaName;
				String altSchemaDescr;
	
				StringBuffer buff = new StringBuffer();
				buff.append(
						"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"
					+	"<YCFTipServerInfo\n"
					+	"\t\txmlns=\"uri://org.mssycf.mssycf/YCFTipServerInfo\"\n"
					+	"\t\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n"
					+	"\t\txmlns:xs=\"http://www.w3.org/2001/XMLSchema\"\n"
					+	"\t\txsi:schemaLocation=\"uri://org.mssycf.mssycf/YCFTipServerInfo http://gitlab.marhome.server:8088/mssycf/2.0.13/xsd/ycftip-2.13-serverinfo.xsd\""
					+	"\t\tClusterURL=\"" + YCFLibXmlUtil.formatXmlString( clusterURL ) + "\"\n"
					+	"\t\tClusterDescr=\"" + YCFLibXmlUtil.formatXmlString( clusterDescr ) + "\"\n"
					+	"\t\tSchemaName=\"" + YCFLibXmlUtil.formatXmlString( schemaName ) + "\"\n"
					+	"\t\tSchemaDescr=\"" + YCFLibXmlUtil.formatXmlString( schemaDescr ) + "\"\n"
					+	"\t\tServerLoginKey=\"" + YCFLibXmlUtil.formatXmlString( serverLoginKey ) + "\" >\n" );
	
				for( int idx = 0; idx < numSchemas; idx ++ ) {
					altSchema = altSchemas[idx];
					if( altSchema != null ) {
						altSchemaName = altSchema.getSchemaName();
						altSchemaDescr = altSchema.getSchemaDescr();
						buff.append(
								"\t<AltSchema SchemaName=\""
							+		YCFLibXmlUtil.formatXmlString( altSchemaName )
							+		"\" SchemaDescr=\""
							+		YCFLibXmlUtil.formatXmlString( altSchemaDescr )
							+		"\" />\n" );
					}
				}
	
				buff.append(
						"</YCFTipServerInfo>\n" );
	
				envelopeHandler.setResponse( buff.toString() );
			}
			catch( RuntimeException e ) {
				IYCFLibMessageLog log = getLog();
				if( log != null ) {
					PrintStream printStream = log.getPrintStream();
					log.message( "Caught " + e.getClass().getName() + " -- " + e.getMessage() );
					e.printStackTrace( printStream );
				}
				else {
					e.printStackTrace();
				}
				envelopeHandler.setResponse( "" );
			}
			catch( Error e ) {
				IYCFLibMessageLog log = getLog();
				if( log != null ) {
					PrintStream printStream = log.getPrintStream();
					log.message( "Caught " + e.getClass().getName() + " -- " + e.getMessage() );
					e.printStackTrace( printStream );
				}
				else {
					e.printStackTrace();
				}
				envelopeHandler.setResponse( "" );
			}
		}
	
		public void endElement(
			String		uri,
			String		localName,
			String		qName )
		throws SAXException
		{
		}
	}

	/*
	 *	YCFTipQueryServerInfoHandler XML SAX Element Handler implementation
	 */
	public class YCFTipLoginRequestHandler
		extends YCFLibXmlCoreElementHandler
	{
		public YCFTipLoginRequestHandler( YCFTipEnvelopeHandler envelopeHandler ) {
			super( envelopeHandler );
		}
	
		public void startElement(
			String		uri,
			String		localName,
			String		qName,
			Attributes	attrs )
		throws SAXException
		{
			final String S_ProcName = "startElement";
			final String S_LocalName = "LocalName";
	
			YCFTipEnvelopeHandler envelopeHandler = (YCFTipEnvelopeHandler)getParser();
			if( envelopeHandler == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"getParser()" );
			}
	
			IYCFTipRequestHandler rqstHandler = envelopeHandler.getRequestHandler();
			if( rqstHandler == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"getParser().getRequestHandler()" );
			}

			IvParameterSpec ivspec = null;

			try {
				// Common XML Attributes
				String	attrId = null;
				// Request Attributes
				String	attrMessageIV = null;
				String	attrAES256Key = null;
				String	attrPayload = null;
				// Attribute Extraction
				String	attrLocalName;
				int		numAttrs;
				int		idxAttr;
	
				assert qName.equals( "LoginRequest" );
	
				// Extract Attributes
				numAttrs = attrs.getLength();
				for( idxAttr = 0; idxAttr < numAttrs; idxAttr++ ) {
					attrLocalName = attrs.getLocalName( idxAttr );
					if( attrLocalName.equals( "Id" ) ) {
						if( attrId != null ) {
							throw new YCFLibUniqueIndexViolationException( getClass(),
								S_ProcName,
								S_LocalName,
								attrLocalName );
						}
						attrId = attrs.getValue( idxAttr );
					}
					else if( attrLocalName.equals( "MessageIV" ) ) {
						if( attrMessageIV != null ) {
							throw new YCFLibUniqueIndexViolationException( getClass(),
								S_ProcName,
								S_LocalName,
								attrLocalName );
						}
						attrMessageIV = attrs.getValue( idxAttr );
					}
					else if( attrLocalName.equals( "AES256Key" ) ) {
						if( attrAES256Key != null ) {
							throw new YCFLibUniqueIndexViolationException( getClass(),
								S_ProcName,
								S_LocalName,
								attrLocalName );
						}
						attrAES256Key = attrs.getValue( idxAttr );
					}
					else if( attrLocalName.equals( "Payload" ) ) {
						if( attrPayload != null ) {
							throw new YCFLibUniqueIndexViolationException( getClass(),
								S_ProcName,
								S_LocalName,
								attrLocalName );
						}
						attrPayload = attrs.getValue( idxAttr );
					}
					else if( attrLocalName.equals( "schemaLocation" ) ) {
						// ignored
					}
					else {
						throw new YCFLibUnrecognizedAttributeException( getClass(),
							S_ProcName,
							getParser().getLocationInfo(),
							attrLocalName );
					}
				}
	
				// Verify that the key and payload was provided

				if( ( attrMessageIV == null ) || ( attrMessageIV.length() <= 0 ) ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"MessageIV" );
				}

				if( ( attrAES256Key == null ) || ( attrAES256Key.length() <= 0 ) ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"AES256Key" );
				}

				if( ( attrPayload == null ) || ( attrPayload.length() <= 0 ) ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"Payload" );
				}

				// Unmarshall the IV
				
				byte[] iv = Base64.decodeBase64( attrMessageIV );
				ivspec = new IvParameterSpec( iv );

				// Convert the AES256Key string from Base64 to a byte array
				
				byte[] base64AES256Key = Base64.decodeBase64( attrAES256Key );
				byte[] decryptedAES256Key = serverInfo.decryptWithServerPrivateKey( base64AES256Key );
				envelopeHandler.setEncodedSessionKey( decryptedAES256Key );

				// Convert the payload from Base64 to a byte array
				
				byte payload[] = Base64.decodeBase64( attrPayload );
				
				// Decrypt the payload using the application session private key
				
				byte decrypted[] = envelopeHandler.decryptWithSessionKey( ivspec, payload );

				// The payload's password and client public key are further encrypted by the device key,
				// but that processing is handled by the request parser

				// Process the decrypted payload using the envelope's request handler

				String rqst;
				String rspn;
				try {
					rqst = new String( decrypted );
					rqstHandler.parseStringContents( rqst );
					rspn = rqstHandler.getResponse();
					if( rspn == null ) {
						rspn = "";
					}
				}
				catch( Throwable t ) {
					if( throwableFormatter != null ) {
						rspn = throwableFormatter.formatResponseThrowable( t );
					}
					else {
						rspn = "";
					}
				}

				// Encrypt the response using the session private key to prevent MITM attacks
				
				byte bytes[] = rspn.getBytes();

				byte encrypted[] = envelopeHandler.encryptWithSessionKey( ivspec, bytes );
				
				// Encode the encrypted response as Base64
				
				String rspnString = new String( Base64.encodeBase64( encrypted ) );

				envelopeHandler.setResponse( rspnString );
			}
			catch( RuntimeException e ) {
				IYCFLibMessageLog log = getLog();
				if( log != null ) {
					PrintStream printStream = log.getPrintStream();
					log.message( "Caught " + e.getClass().getName() + " -- " + e.getMessage() );
					e.printStackTrace( printStream );
				}
				else {
					e.printStackTrace();
				}

				String rspn;
				if( throwableFormatter != null ) {
					rspn = throwableFormatter.formatResponseThrowable( e );
				}
				else {
					rspn = "";
				}

				// Encrypt the response using the session private key to prevent MITM attacks
			
				byte bytes[] = rspn.getBytes();

				byte encrypted[];
				try {
					encrypted = envelopeHandler.encryptWithSessionKey( ivspec, bytes );
				}
				catch ( InvalidKeyException
					| NoSuchAlgorithmException
					| NoSuchPaddingException
					| IllegalBlockSizeException
					| BadPaddingException
					| InvalidAlgorithmParameterException x )
				{
					encrypted = new byte[0];
				}
			
				// Encode the encrypted response as Base64
			
				String rspnString = new String( Base64.encodeBase64( encrypted ) );

				envelopeHandler.setResponse( rspnString );
			}
			catch( Error e ) {
				IYCFLibMessageLog log = getLog();
				if( log != null ) {
					PrintStream printStream = log.getPrintStream();
					log.message( "Caught " + e.getClass().getName() + " -- " + e.getMessage() );
					e.printStackTrace( printStream );
				}
				else {
					e.printStackTrace();
				}

				String rspn;
				if( throwableFormatter != null ) {
					rspn = throwableFormatter.formatResponseThrowable( e );
				}
				else {
					rspn = "";
				}

				// Encrypt the response using the session private key to prevent MITM attacks
			
				byte bytes[] = rspn.getBytes();

				byte encrypted[];
				try {
					encrypted = envelopeHandler.encryptWithSessionKey( ivspec, bytes );
				}
				catch ( InvalidKeyException
					| NoSuchAlgorithmException
					| NoSuchPaddingException
					| IllegalBlockSizeException
					| BadPaddingException
					| InvalidAlgorithmParameterException x )
				{
					encrypted = new byte[0];
				}
			
				// Encode the encrypted response as Base64
			
				String rspnString = new String( Base64.encodeBase64( encrypted ) );

				envelopeHandler.setResponse( rspnString );
			}
			catch( InvalidKeyException e ) {
				IYCFLibMessageLog log = getLog();
				if( log != null ) {
					PrintStream printStream = log.getPrintStream();
					log.message( "Caught InvalidKeyException -- " + e.getMessage() );
					e.printStackTrace( printStream );
				}
				else {
					e.printStackTrace();
				}

				String rspn;
				if( throwableFormatter != null ) {
					rspn = throwableFormatter.formatResponseThrowable( e );
				}
				else {
					rspn = "";
				}

				// Encrypt the response using the session private key to prevent MITM attacks
			
				byte bytes[] = rspn.getBytes();

				byte encrypted[];
				try {
					encrypted = envelopeHandler.encryptWithSessionKey( ivspec, bytes );
				}
				catch ( InvalidKeyException
					| NoSuchAlgorithmException
					| NoSuchPaddingException
					| IllegalBlockSizeException
					| BadPaddingException
					| InvalidAlgorithmParameterException x )
				{
					encrypted = new byte[0];
				}
			
				// Encode the encrypted response as Base64
			
				String rspnString = new String( Base64.encodeBase64( encrypted ) );

				envelopeHandler.setResponse( rspnString );
			}
			catch( NoSuchAlgorithmException e ) {
				IYCFLibMessageLog log = getLog();
				if( log != null ) {
					PrintStream printStream = log.getPrintStream();
					log.message( "Caught NoSuchAlgorithmException -- " + e.getMessage() );
					e.printStackTrace( printStream );
				}
				else {
					e.printStackTrace();
				}

				String rspn;
				if( throwableFormatter != null ) {
					rspn = throwableFormatter.formatResponseThrowable( e );
				}
				else {
					rspn = "";
				}

				// Encrypt the response using the session private key to prevent MITM attacks
			
				byte bytes[] = rspn.getBytes();

				byte encrypted[];
				try {
					encrypted = envelopeHandler.encryptWithSessionKey( ivspec, bytes );
				}
				catch ( InvalidKeyException
					| NoSuchAlgorithmException
					| NoSuchPaddingException
					| IllegalBlockSizeException
					| BadPaddingException
					| InvalidAlgorithmParameterException x )
				{
					encrypted = new byte[0];
				}
			
				// Encode the encrypted response as Base64
			
				String rspnString = new String( Base64.encodeBase64( encrypted ) );

				envelopeHandler.setResponse( rspnString );
			}
			catch( NoSuchPaddingException e ) {
				IYCFLibMessageLog log = getLog();
				if( log != null ) {
					PrintStream printStream = log.getPrintStream();
					log.message( "Caught NoSuchPaddingException -- " + e.getMessage() );
					e.printStackTrace( printStream );
				}
				else {
					e.printStackTrace();
				}
				envelopeHandler.setResponse( "" );
			}
			catch( IllegalBlockSizeException e ) {
				IYCFLibMessageLog log = getLog();
				if( log != null ) {
					PrintStream printStream = log.getPrintStream();
					log.message( "Caught IllegalBlockSizeException -- " + e.getMessage() );
					e.printStackTrace( printStream );
				}
				else {
					e.printStackTrace();
				}

				String rspn;
				if( throwableFormatter != null ) {
					rspn = throwableFormatter.formatResponseThrowable( e );
				}
				else {
					rspn = "";
				}

				// Encrypt the response using the session private key to prevent MITM attacks
			
				byte bytes[] = rspn.getBytes();

				byte encrypted[];
				try {
					encrypted = envelopeHandler.encryptWithSessionKey( ivspec, bytes );
				}
				catch ( InvalidKeyException
					| NoSuchAlgorithmException
					| NoSuchPaddingException
					| IllegalBlockSizeException
					| BadPaddingException
					| InvalidAlgorithmParameterException x )
				{
					encrypted = new byte[0];
				}
			
				// Encode the encrypted response as Base64
			
				String rspnString = new String( Base64.encodeBase64( encrypted ) );

				envelopeHandler.setResponse( rspnString );
			}
			catch( BadPaddingException e ) {
				IYCFLibMessageLog log = getLog();
				if( log != null ) {
					PrintStream printStream = log.getPrintStream();
					log.message( "Caught BadPaddingException -- " + e.getMessage() );
					e.printStackTrace( printStream );
				}
				else {
					e.printStackTrace();
				}

				String rspn;
				if( throwableFormatter != null ) {
					rspn = throwableFormatter.formatResponseThrowable( e );
				}
				else {
					rspn = "";
				}

				// Encrypt the response using the session private key to prevent MITM attacks
			
				byte bytes[] = rspn.getBytes();

				byte encrypted[];
				try {
					encrypted = envelopeHandler.encryptWithSessionKey( ivspec, bytes );
				}
				catch ( InvalidKeyException
					| NoSuchAlgorithmException
					| NoSuchPaddingException
					| IllegalBlockSizeException
					| BadPaddingException
					| InvalidAlgorithmParameterException x )
				{
					encrypted = new byte[0];
				}
			
				// Encode the encrypted response as Base64
			
				String rspnString = new String( Base64.encodeBase64( encrypted ) );

				envelopeHandler.setResponse( rspnString );
			}
			catch (InvalidAlgorithmParameterException e) {
				IYCFLibMessageLog log = getLog();
				if( log != null ) {
					PrintStream printStream = log.getPrintStream();
					log.message( "Caught InvalidAlgorithmParameterException -- " + e.getMessage() );
					e.printStackTrace( printStream );
				}
				else {
					e.printStackTrace();
				}

				String rspn;
				if( throwableFormatter != null ) {
					rspn = throwableFormatter.formatResponseThrowable( e );
				}
				else {
					rspn = "";
				}

				// Encrypt the response using the session private key to prevent MITM attacks
			
				byte bytes[] = rspn.getBytes();

				byte encrypted[];
				try {
					encrypted = envelopeHandler.encryptWithSessionKey( ivspec, bytes );
				}
				catch ( InvalidKeyException
					| NoSuchAlgorithmException
					| NoSuchPaddingException
					| IllegalBlockSizeException
					| BadPaddingException
					| InvalidAlgorithmParameterException x )
				{
					encrypted = new byte[0];
				}
			
				// Encode the encrypted response as Base64
			
				String rspnString = new String( Base64.encodeBase64( encrypted ) );

				envelopeHandler.setResponse( rspnString );
			}
			catch( InvalidKeySpecException e ) {
				IYCFLibMessageLog log = getLog();
				if( log != null ) {
					PrintStream printStream = log.getPrintStream();
					log.message( "Caught InvalidKeySpecException -- " + e.getMessage() );
					e.printStackTrace( printStream );
				}
				else {
					e.printStackTrace();
				}

				String rspn;
				if( throwableFormatter != null ) {
					rspn = throwableFormatter.formatResponseThrowable( e );
				}
				else {
					rspn = "";
				}

				// Encrypt the response using the session private key to prevent MITM attacks
			
				byte bytes[] = rspn.getBytes();

				byte encrypted[];
				try {
					encrypted = envelopeHandler.encryptWithSessionKey( ivspec, bytes );
				}
				catch ( InvalidKeyException
					| NoSuchAlgorithmException
					| NoSuchPaddingException
					| IllegalBlockSizeException
					| BadPaddingException
					| InvalidAlgorithmParameterException x )
				{
					encrypted = new byte[0];
				}
			
				// Encode the encrypted response as Base64
			
				String rspnString = new String( Base64.encodeBase64( encrypted ) );

				envelopeHandler.setResponse( rspnString );
			}
		}
	
		public void endElement(
			String		uri,
			String		localName,
			String		qName )
		throws SAXException
		{
		}
	}

	/*
	 *	YCFTipQueryServerInfoHandler XML SAX Element Handler implementation
	 */
	public class YCFTipAppRequestHandler
		extends YCFLibXmlCoreElementHandler
	{
		public YCFTipAppRequestHandler( YCFTipEnvelopeHandler envelopeHandler ) {
			super( envelopeHandler );
		}

		public void startElement(
			String		uri,
			String		localName,
			String		qName,
			Attributes	attrs )
		throws SAXException
		{
			final String S_ProcName = "startElement";
			final String S_LocalName = "LocalName";

			YCFTipEnvelopeHandler envelopeHandler = (YCFTipEnvelopeHandler)getParser();
			if( envelopeHandler == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"getParser()" );
			}

			IYCFTipRequestHandler rqstHandler = envelopeHandler.getRequestHandler();
			if( rqstHandler == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"getParser().getRequestHandler()" );
			}

			IvParameterSpec ivspec = null;
			
			try {
				// Common XML Attributes
				String	attrId = null;
				// Request Attributes
				String	attrMessageIV = null;
				String	attrPayload = null;
				// Attribute Extraction
				String	attrLocalName;
				int		numAttrs;
				int		idxAttr;

				assert qName.equals( "AppRequest" );

				// Extract Attributes
				numAttrs = attrs.getLength();
				for( idxAttr = 0; idxAttr < numAttrs; idxAttr++ ) {
					attrLocalName = attrs.getLocalName( idxAttr );
					if( attrLocalName.equals( "Id" ) ) {
						if( attrId != null ) {
							throw new YCFLibUniqueIndexViolationException( getClass(),
								S_ProcName,
								S_LocalName,
								attrLocalName );
						}
						attrId = attrs.getValue( idxAttr );
					}
					else if( attrLocalName.equals( "MessageIV" ) ) {
						if( attrMessageIV != null ) {
							throw new YCFLibUniqueIndexViolationException( getClass(),
								S_ProcName,
								S_LocalName,
								attrLocalName );
						}
						attrMessageIV = attrs.getValue( idxAttr );
					}
					else if( attrLocalName.equals( "Payload" ) ) {
						if( attrPayload != null ) {
							throw new YCFLibUniqueIndexViolationException( getClass(),
								S_ProcName,
								S_LocalName,
								attrLocalName );
						}
						attrPayload = attrs.getValue( idxAttr );
					}
					else if( attrLocalName.equals( "schemaLocation" ) ) {
						// ignored
					}
					else {
						throw new YCFLibUnrecognizedAttributeException( getClass(),
							S_ProcName,
							getParser().getLocationInfo(),
							attrLocalName );
					}
				}

				// Verify that a payload was provided

				if( ( attrMessageIV == null ) || ( attrMessageIV.length() <= 0 ) ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"MessageIV" );
				}
				
				if( ( attrPayload == null ) || ( attrPayload.length() <= 0 ) ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"Payload" );
				}

				// Unmarshall the IV
				
				byte[] iv = Base64.decodeBase64( attrMessageIV );
				ivspec = new IvParameterSpec( iv );

				// Convert the payload from Base64 to a byte array
				
				byte payload[] = Base64.decodeBase64( attrPayload );

				// Decrypt the payload using the application session private key
				
				byte decrypted[] = envelopeHandler.decryptWithSessionKey( ivspec, payload );
				
				// Process the decrypted payload using the envelope's request handler

				String rqst;
				String rspn;
				try {
					rqst = new String( decrypted );
					rqstHandler.parseStringContents( rqst );
					rspn = rqstHandler.getResponse();
					if( rspn == null ) {
						rspn = "";
					}
				}
				catch( Throwable t ) {
					if( throwableFormatter != null ) {
						rspn = throwableFormatter.formatResponseThrowable( t );
					}
					else {
						rspn = "";
					}
				}

				// Encrypt the response using the session private key to prevent MITM attacks
				
				byte bytes[] = rspn.getBytes();

				byte encrypted[] = envelopeHandler.encryptWithSessionKey( ivspec, bytes );
				
				// Encode the encrypted response as Base64
				
				String rspnString = new String( Base64.encodeBase64( encrypted ) );

				envelopeHandler.setResponse( rspnString );
			}
			catch( RuntimeException e ) {
				IYCFLibMessageLog log = getLog();
				if( log != null ) {
					PrintStream printStream = log.getPrintStream();
					log.message( "Caught " + e.getClass().getName() + " -- " + e.getMessage() );
					e.printStackTrace( printStream );
				}
				else {
					e.printStackTrace();
				}

				String rspn;
				if( throwableFormatter != null ) {
					rspn = throwableFormatter.formatResponseThrowable( e );
				}
				else {
					rspn = "";
				}

				// Encrypt the response using the session private key to prevent MITM attacks
			
				byte bytes[] = rspn.getBytes();

				byte encrypted[];
				try {
					if( ivspec != null ) {
						encrypted = envelopeHandler.encryptWithSessionKey( ivspec, bytes );
					}
					else {
						encrypted = new byte[0];
					}
				}
				catch ( InvalidKeyException
					| NoSuchAlgorithmException
					| NoSuchPaddingException
					| IllegalBlockSizeException
					| BadPaddingException
					| InvalidAlgorithmParameterException x )
				{
					encrypted = new byte[0];
				}
			
				// Encode the encrypted response as Base64
			
				String rspnString = new String( Base64.encodeBase64( encrypted ) );

				envelopeHandler.setResponse( rspnString );
			}
			catch( Error e ) {
				IYCFLibMessageLog log = getLog();
				if( log != null ) {
					PrintStream printStream = log.getPrintStream();
					log.message( "Caught " + e.getClass().getName() + " -- " + e.getMessage() );
					e.printStackTrace( printStream );
				}
				else {
					e.printStackTrace();
				}

				String rspn;
				if( throwableFormatter != null ) {
					rspn = throwableFormatter.formatResponseThrowable( e );
				}
				else {
					rspn = "";
				}

				// Encrypt the response using the session private key to prevent MITM attacks
			
				byte bytes[] = rspn.getBytes();

				byte encrypted[];
				try {
					encrypted = envelopeHandler.encryptWithSessionKey( ivspec, bytes );
				}
				catch ( InvalidKeyException
					| NoSuchAlgorithmException
					| NoSuchPaddingException
					| IllegalBlockSizeException
					| BadPaddingException
					| InvalidAlgorithmParameterException x )
				{
					encrypted = new byte[0];
				}
			
				// Encode the encrypted response as Base64
			
				String rspnString = new String( Base64.encodeBase64( encrypted ) );

				envelopeHandler.setResponse( rspnString );
			}
			catch( InvalidKeyException e ) {
				IYCFLibMessageLog log = getLog();
				if( log != null ) {
					PrintStream printStream = log.getPrintStream();
					log.message( "Caught InvalidKeyException -- " + e.getMessage() );
					e.printStackTrace( printStream );
				}
				else {
					e.printStackTrace();
				}

				String rspn;
				if( throwableFormatter != null ) {
					rspn = throwableFormatter.formatResponseThrowable( e );
				}
				else {
					rspn = "";
				}

				// Encrypt the response using the session private key to prevent MITM attacks
			
				byte bytes[] = rspn.getBytes();

				byte encrypted[];
				try {
					encrypted = envelopeHandler.encryptWithSessionKey( ivspec, bytes );
				}
				catch ( InvalidKeyException
					| NoSuchAlgorithmException
					| NoSuchPaddingException
					| IllegalBlockSizeException
					| BadPaddingException
					| InvalidAlgorithmParameterException x )
				{
					encrypted = new byte[0];
				}
			
				// Encode the encrypted response as Base64
			
				String rspnString = new String( Base64.encodeBase64( encrypted ) );

				envelopeHandler.setResponse( rspnString );
			}
			catch( NoSuchAlgorithmException e ) {
				IYCFLibMessageLog log = getLog();
				if( log != null ) {
					PrintStream printStream = log.getPrintStream();
					log.message( "Caught NoSuchAlgorithmException -- " + e.getMessage() );
					e.printStackTrace( printStream );
				}
				else {
					e.printStackTrace();
				}

				String rspn;
				if( throwableFormatter != null ) {
					rspn = throwableFormatter.formatResponseThrowable( e );
				}
				else {
					rspn = "";
				}

				// Encrypt the response using the session private key to prevent MITM attacks
			
				byte bytes[] = rspn.getBytes();

				byte encrypted[];
				try {
					encrypted = envelopeHandler.encryptWithSessionKey( ivspec, bytes );
				}
				catch ( InvalidKeyException
					| NoSuchAlgorithmException
					| NoSuchPaddingException
					| IllegalBlockSizeException
					| BadPaddingException
					| InvalidAlgorithmParameterException x )
				{
					encrypted = new byte[0];
				}
			
				// Encode the encrypted response as Base64
			
				String rspnString = new String( Base64.encodeBase64( encrypted ) );

				envelopeHandler.setResponse( rspnString );
			}
			catch( NoSuchPaddingException e ) {
				IYCFLibMessageLog log = getLog();
				if( log != null ) {
					PrintStream printStream = log.getPrintStream();
					log.message( "Caught NoSuchPaddingException -- " + e.getMessage() );
					e.printStackTrace( printStream );
				}
				else {
					e.printStackTrace();
				}
				envelopeHandler.setResponse( "" );
			}
			catch( IllegalBlockSizeException e ) {
				IYCFLibMessageLog log = getLog();
				if( log != null ) {
					PrintStream printStream = log.getPrintStream();
					log.message( "Caught IllegalBlockSizeException -- " + e.getMessage() );
					e.printStackTrace( printStream );
				}
				else {
					e.printStackTrace();
				}

				String rspn;
				if( throwableFormatter != null ) {
					rspn = throwableFormatter.formatResponseThrowable( e );
				}
				else {
					rspn = "";
				}

				// Encrypt the response using the session private key to prevent MITM attacks
			
				byte bytes[] = rspn.getBytes();

				byte encrypted[];
				try {
					encrypted = envelopeHandler.encryptWithSessionKey( ivspec, bytes );
				}
				catch ( InvalidKeyException
					| NoSuchAlgorithmException
					| NoSuchPaddingException
					| IllegalBlockSizeException
					| BadPaddingException
					| InvalidAlgorithmParameterException x )
				{
					encrypted = new byte[0];
				}
			
				// Encode the encrypted response as Base64
			
				String rspnString = new String( Base64.encodeBase64( encrypted ) );

				envelopeHandler.setResponse( rspnString );
			}
			catch( BadPaddingException e ) {
				IYCFLibMessageLog log = getLog();
				if( log != null ) {
					PrintStream printStream = log.getPrintStream();
					log.message( "Caught BadPaddingException -- " + e.getMessage() );
					e.printStackTrace( printStream );
				}
				else {
					e.printStackTrace();
				}

				String rspn;
				if( throwableFormatter != null ) {
					rspn = throwableFormatter.formatResponseThrowable( e );
				}
				else {
					rspn = "";
				}

				// Encrypt the response using the session private key to prevent MITM attacks
			
				byte bytes[] = rspn.getBytes();

				byte encrypted[];
				try {
					encrypted = envelopeHandler.encryptWithSessionKey( ivspec, bytes );
				}
				catch ( InvalidKeyException
					| NoSuchAlgorithmException
					| NoSuchPaddingException
					| IllegalBlockSizeException
					| BadPaddingException
					| InvalidAlgorithmParameterException x )
				{
					encrypted = new byte[0];
				}
			
				// Encode the encrypted response as Base64
			
				String rspnString = new String( Base64.encodeBase64( encrypted ) );

				envelopeHandler.setResponse( rspnString );
			}
			catch (InvalidAlgorithmParameterException e) {
				IYCFLibMessageLog log = getLog();
				if( log != null ) {
					PrintStream printStream = log.getPrintStream();
					log.message( "Caught InvalidAlgorithmParameterException -- " + e.getMessage() );
					e.printStackTrace( printStream );
				}
				else {
					e.printStackTrace();
				}

				String rspn;
				if( throwableFormatter != null ) {
					rspn = throwableFormatter.formatResponseThrowable( e );
				}
				else {
					rspn = "";
				}

				// Encrypt the response using the session private key to prevent MITM attacks
			
				byte bytes[] = rspn.getBytes();

				byte encrypted[];
				try {
					encrypted = envelopeHandler.encryptWithSessionKey( ivspec, bytes );
				}
				catch ( InvalidKeyException
					| NoSuchAlgorithmException
					| NoSuchPaddingException
					| IllegalBlockSizeException
					| BadPaddingException
					| InvalidAlgorithmParameterException x )
				{
					encrypted = new byte[0];
				}
			
				// Encode the encrypted response as Base64
			
				String rspnString = new String( Base64.encodeBase64( encrypted ) );

				envelopeHandler.setResponse( rspnString );
			}
		}

		public void endElement(
			String		uri,
			String		localName,
			String		qName )
		throws SAXException
		{
		}
	}
}
