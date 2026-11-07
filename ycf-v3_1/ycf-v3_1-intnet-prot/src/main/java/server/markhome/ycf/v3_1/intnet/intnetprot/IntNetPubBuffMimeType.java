// Description: Java 17 implJustPubementation of a MimeType buffer

/*
 *	server.markhome.ycf.BusModel
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Yorkton Code Fractal BusModel 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of the Yorkton Code Fractal Business Model.
 *	
 *	Yorkton Code Fractal BusModel is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	Yorkton Code Fractal BusModel is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Yorkton Code Fractal BusModel is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Yorkton Code Fractal BusModel.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.ycf.v3_1.intnet.intnet.buff;

import java.lang.reflect.*;
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.CFXmlUtil;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

public class IntNetPubBuffMimeType
	implements IIntNetPubMimeType, Comparable<Object>, Serializable
{
	protected int requiredMimeTypeId;
	protected int requiredRevision;
	protected CFDbKeyHash256 createdByUserId = CFDbKeyHash256.fromHex(IIntNetPubSecUser.S_INIT_CREATED_BY);
	protected CFDbKeyHash256 createdBySessionId = CFDbKeyHash256.fromHex(IIntNetPubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime createdAt = LocalDateTime.now();
	protected CFDbKeyHash256 updatedByUserId = CFDbKeyHash256.fromHex(IIntNetPubSecUser.S_INIT_UPDATED_BY);
	protected CFDbKeyHash256 updatedBySessionId = CFDbKeyHash256.fromHex(IIntNetPubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime updatedAt = LocalDateTime.now();
	protected String requiredName;
	protected String optionalFileTypes;

	public BusModelPubBuffMimeType() {
		requiredMimeTypeId = IIntNetPubMimeType.MIMETYPEID_INIT_VALUE;
		requiredName = IIntNetPubMimeType.NAME_INIT_VALUE;
		optionalFileTypes = null;
	}

	@Override
	public Integer getPKey() {
		return (requiredMimeTypeId);
	}

	@Override
	public void setPKey(Integer requiredMimeTypeId) {
		if(requiredMimeTypeId != null) {
			this.requiredMimeTypeId = requiredMimeTypeId;
		}
	}

	@Override
	public int getRequiredMimeTypeId() {
		return(requiredMimeTypeId);
	}

	@Override
	public void setRequiredMimeTypeId( int value ) {
		if( value < IIntNetPubMimeType.MIMETYPEID_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				"setRequiredMimeTypeId",
				1,
				"value",
				value,
				IIntNetPubMimeType.MIMETYPEID_MIN_VALUE );
		}
		requiredMimeTypeId = value;
	}

	@Override
	public CFDbKeyHash256 getCreatedByUserId() {
		return( createdByUserId );
	}

	@Override
	public void setJustPubCreatedByUserId( CFDbKeyHash256 value ) {
		createdByUserId = value;
	}

	@Override
	public LocalDateTime getCreatedAt() {
		return( createdAt );
	}

	@Override
	public void setJustPubCreatedAt( LocalDateTime value ) {
		createdAt = value;
	}

	@Override
	public CFDbKeyHash256 getUpdatedByUserId() {
		return( updatedByUserId );
	}

	@Override
	public void setJustPubUpdatedByUserId( CFDbKeyHash256 value ) {
		updatedByUserId = value;
	}

	@Override
	public LocalDateTime getUpdatedAt() {
		return( updatedAt );
	}

	@Override
	public void setJustPubUpdatedAt( LocalDateTime value ) {
		updatedAt = value;
	}

	@Override
	public int getRequiredRevision() {
		return( requiredRevision );
	}

	@Override
	public void setRequiredRevision( int value ) {
		requiredRevision = value;
	}

	@Override
	public int getClassCode() {
		return( IIntNetPubMimeType.CLASS_CODE );
	}

	@Override
	public String getRequiredName() {
		return(requiredName);
	}

	public void setRequiredName( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredName",
				1,
				"value" );
		}
		else if( value.length() > 128 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredName",
				1,
				"value.length()",
				value.length(),
				128 );
		}
		requiredName = value;
	}

	@Override
	public String getOptionalFileTypes() {
		return(optionalFileTypes);
	}

	public void setOptionalFileTypes( String value ) {
		if( value != null && value.length() > 128 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalFileTypes",
				1,
				"value.length()",
				value.length(),
				128 );
		}
		optionalFileTypes = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof IIntNetPubMimeType rhs ) {
			if( ! getCreatedByUserId().equals( rhs.getCreatedByUserId() ) ) {
				return( false );
			}
			if( ! getCreatedAt().equals( rhs.getCreatedAt() ) ) {
				return( false );
			}
			if( ! getUpdatedByUserId().equals( rhs.getUpdatedByUserId() ) ) {
				return( false );
			}
			if( ! getUpdatedAt().equals( rhs.getUpdatedAt() ) ) {
				return( false );
			}
			if( getRequiredMimeTypeId() != rhs.getRequiredMimeTypeId() ) {
				return( false );
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			if( getOptionalFileTypes() != null ) {
				if( rhs.getOptionalFileTypes() != null ) {
					if( ! getOptionalFileTypes().equals( rhs.getOptionalFileTypes() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalFileTypes() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetPubMimeTypeH rhs ) {
			if( getRequiredMimeTypeId() != rhs.getRequiredMimeTypeId() ) {
				return( false );
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			if( getOptionalFileTypes() != null ) {
				if( rhs.getOptionalFileTypes() != null ) {
					if( ! getOptionalFileTypes().equals( rhs.getOptionalFileTypes() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalFileTypes() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetPubMimeTypeHPKey ) {
			IIntNetPubMimeTypeHPKey rhs = (IIntNetPubMimeTypeHPKey)obj;
			if( getRequiredMimeTypeId() != rhs.getRequiredMimeTypeId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof IIntNetPubMimeTypeByUNameIdxKey rhs ) {
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetPubMimeType rhs ) {
			if( ! getCreatedByUserId().equals( rhs.getCreatedByUserId() ) ) {
				return( false );
			}
			if( ! getCreatedAt().equals( rhs.getCreatedAt() ) ) {
				return( false );
			}
			if( ! getUpdatedByUserId().equals( rhs.getUpdatedByUserId() ) ) {
				return( false );
			}
			if( ! getUpdatedAt().equals( rhs.getUpdatedAt() ) ) {
				return( false );
			}
			if( getRequiredMimeTypeId() != rhs.getRequiredMimeTypeId() ) {
				return( false );
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			if( getOptionalFileTypes() != null ) {
				if( rhs.getOptionalFileTypes() != null ) {
					if( ! getOptionalFileTypes().equals( rhs.getOptionalFileTypes() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalFileTypes() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetPubMimeTypeH rhs ) {
			if( getRequiredMimeTypeId() != rhs.getRequiredMimeTypeId() ) {
				return( false );
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			if( getOptionalFileTypes() != null ) {
				if( rhs.getOptionalFileTypes() != null ) {
					if( ! getOptionalFileTypes().equals( rhs.getOptionalFileTypes() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalFileTypes() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetPubMimeTypeHPKey rhs ) {
			if( getRequiredMimeTypeId() != rhs.getRequiredMimeTypeId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof IIntNetPubMimeTypeByUNameIdxKey rhs ) {
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else {
			return( false );
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;
		hashCode = hashCode + getCreatedByUserId().hashCode();
		hashCode = hashCode + getCreatedAt().hashCode();
		hashCode = hashCode + getUpdatedByUserId().hashCode();
		hashCode = hashCode + getUpdatedAt().hashCode();
		hashCode = hashCode + getRequiredMimeTypeId();
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		if( getOptionalFileTypes() != null ) {
			hashCode = hashCode + getOptionalFileTypes().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof IIntNetPubMimeType rhs ) {
			cmp = 0;
			{
				cmp = getCreatedByUserId().compareTo( rhs.getCreatedByUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}

				cmp = getCreatedAt().compareTo( rhs.getCreatedAt() );
				if( cmp != 0 ) {
					return( cmp );
				}

				cmp = getUpdatedByUserId().compareTo( rhs.getUpdatedByUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}

				cmp = getUpdatedAt().compareTo( rhs.getUpdatedAt() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getRequiredMimeTypeId() < rhs.getRequiredMimeTypeId() ) {
				return( -1 );
			}
			else if( getRequiredMimeTypeId() > rhs.getRequiredMimeTypeId() ) {
				return( 1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			if( getOptionalFileTypes() != null ) {
				if( rhs.getOptionalFileTypes() != null ) {
					cmp = getOptionalFileTypes().compareTo( rhs.getOptionalFileTypes() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalFileTypes() != null ) {
					return( -1 );
				}
			}
			return( 0 );
 		}
		else if( obj instanceof IIntNetPubMimeTypeHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if( getRequiredMimeTypeId() < rhs.getRequiredMimeTypeId() ) {
				return( -1 );
			}
			else if( getRequiredMimeTypeId() > rhs.getRequiredMimeTypeId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof IIntNetPubMimeTypeH rhs ) {
			cmp = 0;
			if( getRequiredMimeTypeId() < rhs.getRequiredMimeTypeId() ) {
				return( -1 );
			}
			else if( getRequiredMimeTypeId() > rhs.getRequiredMimeTypeId() ) {
				return( 1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			if( getOptionalFileTypes() != null ) {
				if( rhs.getOptionalFileTypes() != null ) {
					cmp = getOptionalFileTypes().compareTo( rhs.getOptionalFileTypes() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalFileTypes() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof IIntNetPubMimeTypeByUNameIdxKey rhs ) {
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IIntNetPubMimeType rhs ) {
			cmp = 0;
			{
				cmp = getCreatedByUserId().compareTo( rhs.getCreatedByUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}

				cmp = getCreatedAt().compareTo( rhs.getCreatedAt() );
				if( cmp != 0 ) {
					return( cmp );
				}

				cmp = getUpdatedByUserId().compareTo( rhs.getUpdatedByUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}

				cmp = getUpdatedAt().compareTo( rhs.getUpdatedAt() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getRequiredMimeTypeId() < rhs.getRequiredMimeTypeId() ) {
				return( -1 );
			}
			else if( getRequiredMimeTypeId() > rhs.getRequiredMimeTypeId() ) {
				return( 1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			if( getOptionalFileTypes() != null ) {
				if( rhs.getOptionalFileTypes() != null ) {
					cmp = getOptionalFileTypes().compareTo( rhs.getOptionalFileTypes() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalFileTypes() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof IIntNetPubMimeTypeHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if( getRequiredMimeTypeId() < rhs.getRequiredMimeTypeId() ) {
				return( -1 );
			}
			else if( getRequiredMimeTypeId() > rhs.getRequiredMimeTypeId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof IIntNetPubMimeTypeH rhs ) {
			cmp = 0;
			if( getRequiredMimeTypeId() < rhs.getRequiredMimeTypeId() ) {
				return( -1 );
			}
			else if( getRequiredMimeTypeId() > rhs.getRequiredMimeTypeId() ) {
				return( 1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			if( getOptionalFileTypes() != null ) {
				if( rhs.getOptionalFileTypes() != null ) {
					cmp = getOptionalFileTypes().compareTo( rhs.getOptionalFileTypes() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalFileTypes() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof IIntNetPubMimeTypeByUNameIdxKey rhs ) {
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}			return( 0 );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				null );
		}
	}

	@Override
	public void set( IIntNetPubMimeType src ) {
		setJustPubMimeType( src );
	}

	@Override
	public void setMimeType( IIntNetPubMimeType src ) {
		setJustPubRequiredMimeTypeId(src.getRequiredMimeTypeId());
		setJustPubRequiredRevision( src.getRequiredRevision() );
		setJustPubCreatedByUserId( src.getCreatedByUserId() );
		setJustPubCreatedAt( src.getCreatedAt() );
		setJustPubUpdatedByUserId( src.getUpdatedByUserId() );
		setJustPubUpdatedAt( src.getUpdatedAt() );
		setJustPubRequiredName(src.getRequiredName());
		setJustPubOptionalFileTypes(src.getOptionalFileTypes());
	}

	@Override
	public void set( IIntNetPubMimeTypeH src ) {
		setJustPubMimeType( src );
	}

	@Override
	public void setMimeType( IIntNetPubMimeTypeH src ) {
		setJustPubRequiredMimeTypeId(src.getRequiredMimeTypeId());
		setJustPubRequiredName(src.getRequiredName());
		setJustPubOptionalFileTypes(src.getOptionalFileTypes());
	}

	@Override
	public void set( IIntNetPubMimeType src ) {
		setJustPubMimeType( src );
	}

	@Override
	public void setMimeType( IIntNetPubMimeType src ) {
		setJustPubRequiredMimeTypeId(src.getRequiredMimeTypeId());
		setJustPubRequiredRevision( src.getRequiredRevision() );
		setJustPubCreatedByUserId( src.getCreatedByUserId() );
		setJustPubCreatedAt( src.getCreatedAt() );
		setJustPubUpdatedByUserId( src.getUpdatedByUserId() );
		setJustPubUpdatedAt( src.getUpdatedAt() );
		setJustPubRequiredName(src.getRequiredName());
		setJustPubOptionalFileTypes(src.getOptionalFileTypes());
	}

	@Override
	public void set( IIntNetPubMimeTypeH src ) {
		setJustPubMimeType( src );
	}

	@Override
	public void setMimeType( IIntNetPubMimeTypeH src ) {
		setJustPubRequiredMimeTypeId(src.getRequiredMimeTypeId());
		setJustPubRequiredName(src.getRequiredName());
		setJustPubOptionalFileTypes(src.getOptionalFileTypes());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = pkey.getXmlAttrFragment()
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\"" + "\"" + Integer.toString( getRequiredMimeTypeId() ) + "\"" + "\"" + StringEscapeUtils.escapeXml11( getRequiredName() ) + "\"" + ( ( getOptionalFileTypes() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalFileTypes() ) + "\"" );
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<IntNetPubBuffMimeType" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
