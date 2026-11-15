// Description: Java 25 JPA implementation of a SecSysGrpMemb history primary key object.

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

package server.markhome.ycf.v3_1.secure.secure.jpa;

import java.io.Serializable;
import java.math.*;
import java.time.*;
import java.util.*;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.CFXmlUtil;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.secure.secure.jpa.*;
import server.markhome.ycf.v3_1.intnet.intnet.jpa.*;

/**
 *	SecureJpaSecSysGrpMembHPKey History Primary Key for SecSysGrpMemb
 *		requiredSecSysGrpId	Required object attribute SecSysGrpId.
 *		requiredLoginId	Required object attribute LoginId.
 */
public class BusModelJpaSecSysGrpMembHPKey
	implements ISecureSecSysGrpMembHPKey, Comparable<Object>, Serializable
{
	@AttributeOverrides({
		@AttributeOverride(name="bytes", column=@Column(name="auditClusterId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH) )
	})
	protected CFDbKeyHash256 auditClusterId;

	@Column(name="auditStamp", nullable=false)
	protected LocalDateTime auditStamp;

	@Column(name="auditAction", nullable=false)
	protected short auditActionId;

	@Column(name="requiredRevision", nullable=false)
	protected int requiredRevision;

	@AttributeOverrides({
		@AttributeOverride(name="bytes", column=@Column(name="auditSessionId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH) )
	})
	protected CFDbKeyHash256 auditSessionId;

	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="SecSysGrpId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 requiredSecSysGrpId;
	@Column( name="login_id", nullable=false, length=32 )
	protected String requiredLoginId;

	public SecureJpaSecSysGrpMembHPKey() {
		auditClusterId = ISecureProtCluster.ID_INIT_VALUE;
		auditStamp = LocalDateTime.now();
		auditActionId = 0;
		requiredRevision = 1;
		auditSessionId = CFDbKeyHash256.nullGet();
		requiredSecSysGrpId = CFDbKeyHash256.fromHex( ISecureProtSecSysGrpMemb.SECSYSGRPID_INIT_VALUE.toString() );
		requiredLoginId = ISecureProtSecSysGrpMemb.LOGINID_INIT_VALUE;
	}

	@Override
	public CFDbKeyHash256 getAuditClusterId() {
		return( auditClusterId );
	}

	@Override
	public void setAuditClusterId( CFDbKeyHash256 value ) {
		auditClusterId = value;
	}

	@Override
	public LocalDateTime getAuditStamp() {
		return( auditStamp );
	}

	@Override
	public void setAuditStamp( LocalDateTime value ) {
		auditStamp = value;
	}

	@Override
	public short getAuditActionId() {
		return( auditActionId );
	}

	@Override
	public void setAuditActionId( short value ) {
		auditActionId = value;
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
	public CFDbKeyHash256 getAuditSessionId() {
		return( auditSessionId );
	}

	@Override
	public void setAuditSessionId( CFDbKeyHash256 value ) {
		auditSessionId = value;
	}

	@Override
	public ICFKeyHash256 getRequiredSecSysGrpId() {
		return(requiredSecSysGrpId);
	}

	public void setRequiredSecSysGrpId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSecSysGrpId",
				1,
				"value" );
		}
		requiredSecSysGrpId = value;
	}

	@Override
	public String getRequiredLoginId() {
		return(requiredLoginId);
	}

	public void setRequiredLoginId( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredLoginId",
				1,
				"value" );
		}
		else if( value.length() > 32 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredLoginId",
				1,
				"value.length()",
				value.length(),
				32 );
		}
		requiredLoginId = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if (obj == null) {
			return( false );
		}
		else if(obj == this) {
			return( true );
		}
		else if (obj instanceof ISecureSecSysGrpMembHPKey rhs) {
			if (getAuditClusterId() != null) {
				if (rhs.getAuditClusterId() != null) {
					if ( ! getAuditClusterId().equals(rhs.getAuditClusterId())) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else if (rhs.getAuditClusterId() != null) {
				return( false );
			}
			if (getAuditStamp() != null) {
				if (rhs.getAuditStamp() != null) {
					if ( ! getAuditStamp().equals(rhs.getAuditStamp())) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else if (rhs.getAuditStamp() != null) {
				return( false );
			}
			if( getAuditActionId() != rhs.getAuditActionId() ) {
				return( false );
			}
			if( getRequiredRevision() != rhs.getRequiredRevision() ) {
				return( false );
			}
			if (getAuditSessionId() != null && !getAuditSessionId().isNull() ) {
				if (rhs.getAuditSessionId() != null && !rhs.getAuditSessionId().isNull() ) {
					if ( ! getAuditSessionId().equals(rhs.getAuditSessionId())) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else if (rhs.getAuditSessionId() != null && !rhs.getAuditSessionId().isNull() ) {
				return( false );
			}
			if( getRequiredSecSysGrpId() != null ) {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					if( ! getRequiredSecSysGrpId().equals( rhs.getRequiredSecSysGrpId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					return( false );
				}
			}
			if( getRequiredLoginId() != null ) {
				if( rhs.getRequiredLoginId() != null ) {
					if( ! getRequiredLoginId().equals( rhs.getRequiredLoginId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredLoginId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecSysGrpMembPKey rhs) {
			if( getRequiredSecSysGrpId() != null ) {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					if( ! getRequiredSecSysGrpId().equals( rhs.getRequiredSecSysGrpId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					return( false );
				}
			}
			if( getRequiredLoginId() != null ) {
				if( rhs.getRequiredLoginId() != null ) {
					if( ! getRequiredLoginId().equals( rhs.getRequiredLoginId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredLoginId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecSysGrpMembH rhs) {
			if (getAuditClusterId() != null) {
				if (rhs.getAuditClusterId() != null) {
					if ( ! getAuditClusterId().equals(rhs.getAuditClusterId())) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else if (rhs.getAuditClusterId() != null) {
				return( false );
			}
			if (getAuditStamp() != null) {
				if (rhs.getAuditStamp() != null) {
					if ( ! getAuditStamp().equals(rhs.getAuditStamp())) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else if (rhs.getAuditStamp() != null) {
				return( false );
			}
			if( getAuditActionId() != rhs.getAuditActionId() ) {
				return( false );
			}
			if( getRequiredRevision() != rhs.getRequiredRevision() ) {
				return( false );
			}
			if (getAuditSessionId() != null && !getAuditSessionId().isNull() ) {
				if (rhs.getAuditSessionId() != null && !rhs.getAuditSessionId().isNull() ) {
					if ( ! getAuditSessionId().equals(rhs.getAuditSessionId())) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else if (rhs.getAuditSessionId() != null && !rhs.getAuditSessionId().isNull() ) {
				return( false );
			}
			if( getRequiredSecSysGrpId() != null ) {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					if( ! getRequiredSecSysGrpId().equals( rhs.getRequiredSecSysGrpId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					return( false );
				}
			}
			if( getRequiredLoginId() != null ) {
				if( rhs.getRequiredLoginId() != null ) {
					if( ! getRequiredLoginId().equals( rhs.getRequiredLoginId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredLoginId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecSysGrpMemb rhs) {
			if( getRequiredSecSysGrpId() != null ) {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					if( ! getRequiredSecSysGrpId().equals( rhs.getRequiredSecSysGrpId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					return( false );
				}
			}
			if( getRequiredLoginId() != null ) {
				if( rhs.getRequiredLoginId() != null ) {
					if( ! getRequiredLoginId().equals( rhs.getRequiredLoginId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredLoginId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureProtSecSysGrpMembHPKey rhs) {
			if (getAuditClusterId() != null) {
				if (rhs.getAuditClusterId() != null) {
					if ( ! getAuditClusterId().equals(rhs.getAuditClusterId())) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else if (rhs.getAuditClusterId() != null) {
				return( false );
			}
			if (getAuditStamp() != null) {
				if (rhs.getAuditStamp() != null) {
					if ( ! getAuditStamp().equals(rhs.getAuditStamp())) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else if (rhs.getAuditStamp() != null) {
				return( false );
			}
			if( getAuditActionId() != rhs.getAuditActionId() ) {
				return( false );
			}
			if( getRequiredRevision() != rhs.getRequiredRevision() ) {
				return( false );
			}
			if (getAuditSessionId() != null && !getAuditSessionId().isNull() ) {
				if (rhs.getAuditSessionId() != null && !rhs.getAuditSessionId().isNull() ) {
					if ( ! getAuditSessionId().equals(rhs.getAuditSessionId())) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else if (rhs.getAuditSessionId() != null && !rhs.getAuditSessionId().isNull() ) {
				return( false );
			}
			if( getRequiredSecSysGrpId() != null ) {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					if( ! getRequiredSecSysGrpId().equals( rhs.getRequiredSecSysGrpId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					return( false );
				}
			}
			if( getRequiredLoginId() != null ) {
				if( rhs.getRequiredLoginId() != null ) {
					if( ! getRequiredLoginId().equals( rhs.getRequiredLoginId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredLoginId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureProtSecSysGrpMembPKey rhs) {
			if( getRequiredSecSysGrpId() != null ) {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					if( ! getRequiredSecSysGrpId().equals( rhs.getRequiredSecSysGrpId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					return( false );
				}
			}
			if( getRequiredLoginId() != null ) {
				if( rhs.getRequiredLoginId() != null ) {
					if( ! getRequiredLoginId().equals( rhs.getRequiredLoginId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredLoginId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureProtSecSysGrpMembH rhs) {
			if (getAuditClusterId() != null) {
				if (rhs.getAuditClusterId() != null) {
					if ( ! getAuditClusterId().equals(rhs.getAuditClusterId())) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else if (rhs.getAuditClusterId() != null) {
				return( false );
			}
			if (getAuditStamp() != null) {
				if (rhs.getAuditStamp() != null) {
					if ( ! getAuditStamp().equals(rhs.getAuditStamp())) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else if (rhs.getAuditStamp() != null) {
				return( false );
			}
			if( getAuditActionId() != rhs.getAuditActionId() ) {
				return( false );
			}
			if( getRequiredRevision() != rhs.getRequiredRevision() ) {
				return( false );
			}
			if (getAuditSessionId() != null && !getAuditSessionId().isNull() ) {
				if (rhs.getAuditSessionId() != null && !rhs.getAuditSessionId().isNull() ) {
					if ( ! getAuditSessionId().equals(rhs.getAuditSessionId())) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else if (rhs.getAuditSessionId() != null && !rhs.getAuditSessionId().isNull() ) {
				return( false );
			}
			if( getRequiredSecSysGrpId() != null ) {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					if( ! getRequiredSecSysGrpId().equals( rhs.getRequiredSecSysGrpId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					return( false );
				}
			}
			if( getRequiredLoginId() != null ) {
				if( rhs.getRequiredLoginId() != null ) {
					if( ! getRequiredLoginId().equals( rhs.getRequiredLoginId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredLoginId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureProtSecSysGrpMemb rhs) {
			if( getRequiredSecSysGrpId() != null ) {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					if( ! getRequiredSecSysGrpId().equals( rhs.getRequiredSecSysGrpId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					return( false );
				}
			}
			if( getRequiredLoginId() != null ) {
				if( rhs.getRequiredLoginId() != null ) {
					if( ! getRequiredLoginId().equals( rhs.getRequiredLoginId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredLoginId() != null ) {
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
		if( auditClusterId != null ) {
			hashCode = hashCode + auditClusterId.hashCode();
		}
		if( auditStamp != null ) {
			hashCode = hashCode + auditStamp.hashCode();
		}
		hashCode = hashCode + auditActionId;
		hashCode = hashCode + requiredRevision;
		if( auditSessionId != null ) {
			hashCode = hashCode + auditSessionId.hashCode();
		}
		hashCode = hashCode + getRequiredSecSysGrpId().hashCode();
		if( getRequiredLoginId() != null ) {
			hashCode = hashCode + getRequiredLoginId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if (obj == null) {
			return( 1 );
		}
		if (obj == this) {
			return( 0 );
		}
		else if (obj instanceof ISecureSecSysGrpMembHPKey rhs) {
			if( getAuditClusterId() == null ) {
				if( rhs.getAuditClusterId() != null ) {
					return( -1 );
				}
			}
			else if( rhs.getAuditClusterId() == null ) {
				return( 1 );
			}
			else {
				cmp = getAuditClusterId().compareTo( rhs.getAuditClusterId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getAuditStamp() == null ) {
				if( rhs.getAuditStamp() != null ) {
					return( -1 );
				}
			}
			else if( rhs.getAuditStamp() == null ) {
				return( 1 );
			}
			else {
				cmp = getAuditStamp().compareTo( rhs.getAuditStamp() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getAuditActionId() < rhs.getAuditActionId() ) {
				return( -1 );
			}
			else if( getAuditActionId() > rhs.getAuditActionId() ) {
				return( 1 );
			}
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if( getAuditSessionId() == null ) {
				if( rhs.getAuditSessionId() != null ) {
					return( -1 );
				}
			}
			else if( rhs.getAuditSessionId() == null ) {
				return( 1 );
			}
			else {
				cmp = getAuditSessionId().compareTo( rhs.getAuditSessionId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if (getRequiredSecSysGrpId() != null) {
				if (rhs.getRequiredSecSysGrpId() != null) {
					cmp = getRequiredSecSysGrpId().compareTo( rhs.getRequiredSecSysGrpId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecSysGrpId() != null) {
				return( -1 );
			}
			if (getRequiredLoginId() != null) {
				if (rhs.getRequiredLoginId() != null) {
					cmp = getRequiredLoginId().compareTo( rhs.getRequiredLoginId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredLoginId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSecSysGrpMembPKey rhs) {
			if (getRequiredSecSysGrpId() != null) {
				if (rhs.getRequiredSecSysGrpId() != null) {
					cmp = getRequiredSecSysGrpId().compareTo( rhs.getRequiredSecSysGrpId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecSysGrpId() != null) {
				return( -1 );
			}
			if (getRequiredLoginId() != null) {
				if (rhs.getRequiredLoginId() != null) {
					cmp = getRequiredLoginId().compareTo( rhs.getRequiredLoginId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredLoginId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSecSysGrpMembH) {
			ISecureSecSysGrpMembH rhs = (ISecureSecSysGrpMembH)obj;
			if( getAuditClusterId() == null ) {
				if( rhs.getAuditClusterId() != null ) {
					return( -1 );
				}
			}
			else if( rhs.getAuditClusterId() == null ) {
				return( 1 );
			}
			else {
				cmp = getAuditClusterId().compareTo( rhs.getAuditClusterId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getAuditStamp() == null ) {
				if( rhs.getAuditStamp() != null ) {
					return( -1 );
				}
			}
			else if( rhs.getAuditStamp() == null ) {
				return( 1 );
			}
			else {
				cmp = getAuditStamp().compareTo( rhs.getAuditStamp() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getAuditActionId() < rhs.getAuditActionId() ) {
				return( -1 );
			}
			else if( getAuditActionId() > rhs.getAuditActionId() ) {
				return( 1 );
			}
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if( getAuditSessionId() == null ) {
				if( rhs.getAuditSessionId() != null ) {
					return( -1 );
				}
			}
			else if( rhs.getAuditSessionId() == null ) {
				return( 1 );
			}
			else {
				cmp = getAuditSessionId().compareTo( rhs.getAuditSessionId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if (getRequiredSecSysGrpId() != null) {
				if (rhs.getRequiredSecSysGrpId() != null) {
					cmp = getRequiredSecSysGrpId().compareTo( rhs.getRequiredSecSysGrpId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecSysGrpId() != null) {
				return( -1 );
			}
			if (getRequiredLoginId() != null) {
				if (rhs.getRequiredLoginId() != null) {
					cmp = getRequiredLoginId().compareTo( rhs.getRequiredLoginId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredLoginId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSecSysGrpMemb rhs) {
			if (getRequiredSecSysGrpId() != null) {
				if (rhs.getRequiredSecSysGrpId() != null) {
					cmp = getRequiredSecSysGrpId().compareTo( rhs.getRequiredSecSysGrpId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecSysGrpId() != null) {
				return( -1 );
			}
			if (getRequiredLoginId() != null) {
				if (rhs.getRequiredLoginId() != null) {
					cmp = getRequiredLoginId().compareTo( rhs.getRequiredLoginId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredLoginId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureProtSecSysGrpMembHPKey rhs) {
			if( getAuditClusterId() == null ) {
				if( rhs.getAuditClusterId() != null ) {
					return( -1 );
				}
			}
			else if( rhs.getAuditClusterId() == null ) {
				return( 1 );
			}
			else {
				cmp = getAuditClusterId().compareTo( rhs.getAuditClusterId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getAuditStamp() == null ) {
				if( rhs.getAuditStamp() != null ) {
					return( -1 );
				}
			}
			else if( rhs.getAuditStamp() == null ) {
				return( 1 );
			}
			else {
				cmp = getAuditStamp().compareTo( rhs.getAuditStamp() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getAuditActionId() < rhs.getAuditActionId() ) {
				return( -1 );
			}
			else if( getAuditActionId() > rhs.getAuditActionId() ) {
				return( 1 );
			}
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if( getAuditSessionId() == null ) {
				if( rhs.getAuditSessionId() != null ) {
					return( -1 );
				}
			}
			else if( rhs.getAuditSessionId() == null ) {
				return( 1 );
			}
			else {
				cmp = getAuditSessionId().compareTo( rhs.getAuditSessionId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if (getRequiredSecSysGrpId() != null) {
				if (rhs.getRequiredSecSysGrpId() != null) {
					cmp = getRequiredSecSysGrpId().compareTo( rhs.getRequiredSecSysGrpId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecSysGrpId() != null) {
				return( -1 );
			}
			if (getRequiredLoginId() != null) {
				if (rhs.getRequiredLoginId() != null) {
					cmp = getRequiredLoginId().compareTo( rhs.getRequiredLoginId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredLoginId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureProtSecSysGrpMembPKey rhs) {
			if (getRequiredSecSysGrpId() != null) {
				if (rhs.getRequiredSecSysGrpId() != null) {
					cmp = getRequiredSecSysGrpId().compareTo( rhs.getRequiredSecSysGrpId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecSysGrpId() != null) {
				return( -1 );
			}
			if (getRequiredLoginId() != null) {
				if (rhs.getRequiredLoginId() != null) {
					cmp = getRequiredLoginId().compareTo( rhs.getRequiredLoginId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredLoginId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureProtSecSysGrpMembH rhs) {
			if( getAuditClusterId() == null ) {
				if( rhs.getAuditClusterId() != null ) {
					return( -1 );
				}
			}
			else if( rhs.getAuditClusterId() == null ) {
				return( 1 );
			}
			else {
				cmp = getAuditClusterId().compareTo( rhs.getAuditClusterId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getAuditStamp() == null ) {
				if( rhs.getAuditStamp() != null ) {
					return( -1 );
				}
			}
			else if( rhs.getAuditStamp() == null ) {
				return( 1 );
			}
			else {
				cmp = getAuditStamp().compareTo( rhs.getAuditStamp() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getAuditActionId() < rhs.getAuditActionId() ) {
				return( -1 );
			}
			else if( getAuditActionId() > rhs.getAuditActionId() ) {
				return( 1 );
			}
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if( getAuditSessionId() == null ) {
				if( rhs.getAuditSessionId() != null ) {
					return( -1 );
				}
			}
			else if( rhs.getAuditSessionId() == null ) {
				return( 1 );
			}
			else {
				cmp = getAuditSessionId().compareTo( rhs.getAuditSessionId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if (getRequiredSecSysGrpId() != null) {
				if (rhs.getRequiredSecSysGrpId() != null) {
					cmp = getRequiredSecSysGrpId().compareTo( rhs.getRequiredSecSysGrpId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecSysGrpId() != null) {
				return( -1 );
			}
			if (getRequiredLoginId() != null) {
				if (rhs.getRequiredLoginId() != null) {
					cmp = getRequiredLoginId().compareTo( rhs.getRequiredLoginId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredLoginId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureProtSecSysGrpMemb rhs) {
			if (getRequiredSecSysGrpId() != null) {
				if (rhs.getRequiredSecSysGrpId() != null) {
					cmp = getRequiredSecSysGrpId().compareTo( rhs.getRequiredSecSysGrpId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecSysGrpId() != null) {
				return( -1 );
			}
			if (getRequiredLoginId() != null) {
				if (rhs.getRequiredLoginId() != null) {
					cmp = getRequiredLoginId().compareTo( rhs.getRequiredLoginId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredLoginId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				"ISecureSecSysGrpMembPKey, ISecureSecSysGrpMemb, SecureSecSysGrpMembHPKey, SecureSecSysGrpMembH" );
		}
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = " auditClusterId=\"" + (auditClusterId != null ? auditClusterId.toString() : "null" ) + "\""
			+ " auditStamp=\"" + (auditStamp != null ? CFXmlUtil.formatTimestamp(auditStamp) : "null") + "\""
			+ " auditAction=\"" + auditActionId + "\""
			+ " requiredRevision=\"" + requiredRevision + "\""
			+ " auditSessionId=\"" + (getAuditSessionId() != null ? getAuditSessionId().toString() : "null") + "\""
			+ " RequiredSecSysGrpId=" + "\"" + getRequiredSecSysGrpId().toString() + "\""
			+ " RequiredLoginId=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredLoginId() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureJpaSecSysGrpMembHPKey" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
