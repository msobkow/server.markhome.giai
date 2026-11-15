// Description: Java 25 JPA implementation of a SecUserEMConf entity definition object.

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

@Entity
@Table(
	name = "secusremcnf", schema = "Secure31",
	indexes = {
		@Index(name = "SecUserEMConfIdIdx", columnList = "SecUserId", unique = true),
		@Index(name = "SecUserEMConfUuid6Idx", columnList = "conf_uuid6", unique = true),
		@Index(name = "SecUserEMConfConfirmingAddrIdx", columnList = "conf_emailaddr", unique = false),
		@Index(name = "SecUserEMConfSentStampIdx", columnList = "conf_sent", unique = false),
		@Index(name = "SecUserEMConfNewAcctIdx", columnList = "conf_newacct", unique = false),
		@Index(name = "SecUserEMConfIdIdxUser", columnList = "SecUserIdUser", unique = true)
	}
)
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "SecurePU")
public class SecureJpaSecUserEMConf
	implements Comparable<Object>,
		ISecureSecUserEMConf,
		Serializable
{
	@Id
	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="SecUserId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 requiredSecUserId;
	@OneToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn( name="SecUserIdUser", referencedColumnName="SecUserId" )
	protected SecureJpaSecUser requiredContainerUser;
	protected int requiredRevision;


	@AttributeOverrides({
		@AttributeOverride( name="bytes", column = @Column( name="CreatedByUserId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected CFDbKeyHash256 createdByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_CREATED_BY);

	@AttributeOverrides({
		@AttributeOverride( name="bytes", column = @Column( name="CreatedBySessionId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected CFDbKeyHash256 createdBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);

	@Column(name="CreatedAt", nullable=false)
	protected LocalDateTime createdAt = LocalDateTime.now();

	@AttributeOverrides({
		@AttributeOverride( name="bytes", column= @Column( name="UpdatedByUserId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected CFDbKeyHash256 updatedByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_UPDATED_BY);

	@AttributeOverrides({
		@AttributeOverride( name="bytes", column= @Column( name="UpdatedBySessionId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected CFDbKeyHash256 updatedBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);

	@Column(name="UpdatedAt", nullable=false)
	protected LocalDateTime updatedAt = LocalDateTime.now();
	@Column( name="conf_emailaddr", nullable=false, length=512 )
	protected String requiredConfirmEMailAddr;
	@Column( name="conf_sent", nullable=false )
	protected LocalDateTime requiredEMailSentStamp;
	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="conf_uuid6", nullable=false, length=ICFUuid6.TOTAL_BYTES ) )
	})
	protected ICFUuid6 requiredEMConfirmationUuid6;
	@Column( name="conf_newacct", nullable=false )
	protected boolean requiredNewAccount;

	public BusModelJpaSecUserEMConf() {
		requiredSecUserId = CFDbKeyHash256.fromHex( ISecureProtSecUserEMConf.SECUSERID_INIT_VALUE.toString() );
		requiredConfirmEMailAddr = ISecureProtSecUserEMConf.CONFIRMEMAILADDR_INIT_VALUE;
		requiredEMailSentStamp = CFXmlUtil.parseTimestamp("2020-01-01T00:00:00");
		requiredNewAccount = ISecureProtSecUserEMConf.NEWACCOUNT_INIT_VALUE;
	}

	@Override
	public int getClassCode() {
		return( ISecureSecUserEMConf.CLASS_CODE );
	}

	@Override
	public ISecureSecUser getRequiredContainerUser() {
		return(requiredContainerUser);
	}

	@Override
	public void setRequiredContainerUser(ISecureSecUser argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerUser", 1, "argObj");
		}
		else if (argObj instanceof SecureJpaSecUser) {
			requiredContainerUser = (SecureJpaSecUser)argObj;
			if (requiredContainerUser != null) {
				requiredSecUserId = requiredContainerUser.getRequiredSecUserId();
			}
			else {
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setContainerUser", "argObj", argObj, "SecureJpaSecUser");
		}
	
	}

	@Override
	public void setRequiredContainerUser(ISecureProtSecUser argObj) {
		setRequiredContainerUser(argObj.getRequiredSecUserId());
	}

	@Override
	public void setRequiredContainerUser(ISecurePubSecUser argObj) {
		setRequiredContainerUser(argObj.getRequiredSecUserId());
	}

	@Override
	public void setRequiredContainerUser(ICFKeyHash256 argSecUserId) {
		ISecureSchema targetBackingSchema = ISecureSchema.getBackingSecure();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerUser", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecUserTable targetTable = targetBackingSchema.getTableSecUser();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerUser", 0, "ISecureSchema.getBackingSecure().getTableSecUser()");
		}
		ISecureSecUser targetRec = targetTable.readDerivedByIdIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argSecUserId);
		setRequiredContainerUser(targetRec);
	}

	@Override
	public CFDbKeyHash256 getCreatedByUserId() {
		return( createdByUserId );
	}

	@Override
	public void setCreatedByUserId( CFDbKeyHash256 value ) {
		if (value == null || value.isNull()) {
			throw new CFNullArgumentException(getClass(), "setCreatedByUserId", 1, "value");
		}
		createdByUserId = value;
	}

	@Override
	public LocalDateTime getCreatedAt() {
		return( createdAt );
	}

	@Override
	public void setCreatedAt( LocalDateTime value ) {
		if (value == null) {
			throw new CFNullArgumentException(getClass(), "setCreatedAt", 1, "value");
		}
		createdAt = value;
	}

	@Override
	public CFDbKeyHash256 getUpdatedByUserId() {
		return( updatedByUserId );
	}

	@Override
	public void setUpdatedByUserId( CFDbKeyHash256 value ) {
		if (value == null || value.isNull()) {
			throw new CFNullArgumentException(getClass(), "setUpdatedByUserId", 1, "value");
		}
		updatedByUserId = value;
	}

	@Override
	public LocalDateTime getUpdatedAt() {
		return( updatedAt );
	}

	@Override
	public void setUpdatedAt( LocalDateTime value ) {
		if (value == null) {
			throw new CFNullArgumentException(getClass(), "setUpdatedAt", 1, "value");
		}
		updatedAt = value;
	}

	@Override
	public $implCommaIJavaOptAtomType$ getPKey() {
		return getRequiredSecUserId();
	}

	@Override
	public void setPKey($implCommaIJavaOptAtomType$ requiredSecUserId) {
		setRequiredContainerUser(requiredSecUserId);
	}

	@Override
	public ICFKeyHash256 getRequiredSecUserId() {
		return(getPKey().getRequiredSecUserId());
	}

	public void setRequiredSecUserId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSecUserId",
				1,
				"value" );
		}
		getPKey().setRequiredSecUserId(value);
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
	public String getRequiredConfirmEMailAddr() {
		return(requiredConfirmEMailAddr);
	}

	public void setRequiredConfirmEMailAddr( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredConfirmEMailAddr",
				1,
				"value" );
		}
		else if( value.length() > 512 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredConfirmEMailAddr",
				1,
				"value.length()",
				value.length(),
				512 );
		}
		requiredConfirmEMailAddr = value;
	}

	@Override
	public LocalDateTime getRequiredEMailSentStamp() {
		return(requiredEMailSentStamp);
	}

	public void setRequiredEMailSentStamp( LocalDateTime value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredEMailSentStamp",
				1,
				"value" );
		}
		requiredEMailSentStamp = value;
	}

	@Override
	public ICFUuid6 getRequiredEMConfirmationUuid6() {
		return(requiredEMConfirmationUuid6);
	}

	public void setRequiredEMConfirmationUuid6( ICFUuid6 value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredEMConfirmationUuid6",
				1,
				"value" );
		}
		requiredEMConfirmationUuid6 = value;
	}

	@Override
	public boolean getRequiredNewAccount() {
		return(requiredNewAccount);
	}

	public void setRequiredNewAccount( boolean value ) {
		requiredNewAccount = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if (obj == null) {
			return( false );
		}
		else if (obj instanceof ISecureSecUserEMConf) {
			ISecureSecUserEMConf rhs = (ISecureSecUserEMConf)obj;
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
			if( getRequiredSecUserId() != null ) {
				if( rhs.getRequiredSecUserId() != null ) {
					if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecUserId() != null ) {
					return( false );
				}
			}
			if( getRequiredConfirmEMailAddr() != null ) {
				if( rhs.getRequiredConfirmEMailAddr() != null ) {
					if( ! getRequiredConfirmEMailAddr().equals( rhs.getRequiredConfirmEMailAddr() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredConfirmEMailAddr() != null ) {
					return( false );
				}
			}
			if( getRequiredEMailSentStamp() != null ) {
				if( rhs.getRequiredEMailSentStamp() != null ) {
					if( ! getRequiredEMailSentStamp().equals( rhs.getRequiredEMailSentStamp() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredEMailSentStamp() != null ) {
					return( false );
				}
			}
			if( getRequiredEMConfirmationUuid6() != null ) {
				if( rhs.getRequiredEMConfirmationUuid6() != null ) {
					if( ! getRequiredEMConfirmationUuid6().equals( rhs.getRequiredEMConfirmationUuid6() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredEMConfirmationUuid6() != null ) {
					return( false );
				}
			}
			if( getRequiredNewAccount() != rhs.getRequiredNewAccount() ) {
				return( false );
			}
			return( true );
		}
		else if (obj instanceof ISecureSecUserEMConfH) {
			ISecureSecUserEMConfH rhs = (ISecureSecUserEMConfH)obj;
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
			if( getRequiredSecUserId() != null ) {
				if( rhs.getRequiredSecUserId() != null ) {
					if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecUserId() != null ) {
					return( false );
				}
			}
			if( getRequiredConfirmEMailAddr() != null ) {
				if( rhs.getRequiredConfirmEMailAddr() != null ) {
					if( ! getRequiredConfirmEMailAddr().equals( rhs.getRequiredConfirmEMailAddr() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredConfirmEMailAddr() != null ) {
					return( false );
				}
			}
			if( getRequiredEMailSentStamp() != null ) {
				if( rhs.getRequiredEMailSentStamp() != null ) {
					if( ! getRequiredEMailSentStamp().equals( rhs.getRequiredEMailSentStamp() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredEMailSentStamp() != null ) {
					return( false );
				}
			}
			if( getRequiredEMConfirmationUuid6() != null ) {
				if( rhs.getRequiredEMConfirmationUuid6() != null ) {
					if( ! getRequiredEMConfirmationUuid6().equals( rhs.getRequiredEMConfirmationUuid6() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredEMConfirmationUuid6() != null ) {
					return( false );
				}
			}
			if( getRequiredNewAccount() != rhs.getRequiredNewAccount() ) {
				return( false );
			}
			return( true );
		}
		else if (obj instanceof ISecureSecUserEMConfHPKey) {
			ISecureSecUserEMConfHPKey rhs = (ISecureSecUserEMConfHPKey)obj;
			if( getRequiredSecUserId() != null ) {
				if( rhs.getRequiredSecUserId() != null ) {
					if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecUserId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecUserEMConfByUUuid6IdxKey) {
			ISecureSecUserEMConfByUUuid6IdxKey rhs = (ISecureSecUserEMConfByUUuid6IdxKey)obj;
			if( getRequiredEMConfirmationUuid6() != null ) {
				if( rhs.getRequiredEMConfirmationUuid6() != null ) {
					if( ! getRequiredEMConfirmationUuid6().equals( rhs.getRequiredEMConfirmationUuid6() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredEMConfirmationUuid6() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecUserEMConfByConfEMAddrIdxKey) {
			ISecureSecUserEMConfByConfEMAddrIdxKey rhs = (ISecureSecUserEMConfByConfEMAddrIdxKey)obj;
			if( getRequiredConfirmEMailAddr() != null ) {
				if( rhs.getRequiredConfirmEMailAddr() != null ) {
					if( ! getRequiredConfirmEMailAddr().equals( rhs.getRequiredConfirmEMailAddr() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredConfirmEMailAddr() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecUserEMConfBySentStampIdxKey) {
			ISecureSecUserEMConfBySentStampIdxKey rhs = (ISecureSecUserEMConfBySentStampIdxKey)obj;
			if( getRequiredEMailSentStamp() != null ) {
				if( rhs.getRequiredEMailSentStamp() != null ) {
					if( ! getRequiredEMailSentStamp().equals( rhs.getRequiredEMailSentStamp() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredEMailSentStamp() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecUserEMConfByNewAcctIdxKey) {
			ISecureSecUserEMConfByNewAcctIdxKey rhs = (ISecureSecUserEMConfByNewAcctIdxKey)obj;
			if( getRequiredNewAccount() != rhs.getRequiredNewAccount() ) {
				return( false );
			}
			return( true );
		}
		else {
			return( false );
		}
	}

	@Override
	public int hashCode() {
		int hashCode = getPKey().hashCode();
		hashCode = hashCode + getCreatedByUserId().hashCode();
		hashCode = hashCode + getCreatedAt().hashCode();
		hashCode = hashCode + getUpdatedByUserId().hashCode();
		hashCode = hashCode + getUpdatedAt().hashCode();
		hashCode = hashCode + getRequiredSecUserId().hashCode();
		if( getRequiredConfirmEMailAddr() != null ) {
			hashCode = hashCode + getRequiredConfirmEMailAddr().hashCode();
		}
		if( getRequiredEMailSentStamp() != null ) {
			hashCode = hashCode + getRequiredEMailSentStamp().hashCode();
		}
		hashCode = hashCode + getRequiredEMConfirmationUuid6().hashCode();
		if( getRequiredNewAccount() ) {
			hashCode = ( hashCode * 2 ) + 1;
		}
		else {
			hashCode = hashCode * 2;
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if (obj == null) {
			return( 1 );
		}
		else if (obj instanceof ISecureSecUserEMConf) {
			ISecureSecUserEMConf rhs = (ISecureSecUserEMConf)obj;
			if (getPKey() == null) {
				if (rhs.getPKey() != null) {
					return( -1 );
				}
			}
			else {
				if (rhs.getPKey() == null) {
					return( 1 );
				}
				else {
					cmp = getPKey().compareTo(rhs.getPKey());
					if (cmp != 0) {
						return( cmp );
					}
				}
			}
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
			if (getRequiredConfirmEMailAddr() != null) {
				if (rhs.getRequiredConfirmEMailAddr() != null) {
					cmp = getRequiredConfirmEMailAddr().compareTo( rhs.getRequiredConfirmEMailAddr() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredConfirmEMailAddr() != null) {
				return( -1 );
			}
			if (getRequiredEMailSentStamp() != null) {
				if (rhs.getRequiredEMailSentStamp() != null) {
					cmp = getRequiredEMailSentStamp().compareTo( rhs.getRequiredEMailSentStamp() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredEMailSentStamp() != null) {
				return( -1 );
			}
			if (getRequiredEMConfirmationUuid6() != null) {
				if (rhs.getRequiredEMConfirmationUuid6() != null) {
					cmp = getRequiredEMConfirmationUuid6().compareTo( rhs.getRequiredEMConfirmationUuid6() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredEMConfirmationUuid6() != null) {
				return( -1 );
			}
			if( getRequiredNewAccount() ) {
				if( ! rhs.getRequiredNewAccount() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredNewAccount() ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSecUserEMConfHPKey) {
			ISecureSecUserEMConfHPKey rhs = (ISecureSecUserEMConfHPKey)obj;
			if (getRequiredSecUserId() != null) {
				if (rhs.getRequiredSecUserId() != null) {
					cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecUserId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecureSecUserEMConfH ) {
			ISecureSecUserEMConfH rhs = (ISecureSecUserEMConfH)obj;
			if (getRequiredSecUserId() != null) {
				if (rhs.getRequiredSecUserId() != null) {
					cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecUserId() != null) {
				return( -1 );
			}
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
			if (getRequiredConfirmEMailAddr() != null) {
				if (rhs.getRequiredConfirmEMailAddr() != null) {
					cmp = getRequiredConfirmEMailAddr().compareTo( rhs.getRequiredConfirmEMailAddr() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredConfirmEMailAddr() != null) {
				return( -1 );
			}
			if (getRequiredEMailSentStamp() != null) {
				if (rhs.getRequiredEMailSentStamp() != null) {
					cmp = getRequiredEMailSentStamp().compareTo( rhs.getRequiredEMailSentStamp() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredEMailSentStamp() != null) {
				return( -1 );
			}
			if (getRequiredEMConfirmationUuid6() != null) {
				if (rhs.getRequiredEMConfirmationUuid6() != null) {
					cmp = getRequiredEMConfirmationUuid6().compareTo( rhs.getRequiredEMConfirmationUuid6() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredEMConfirmationUuid6() != null) {
				return( -1 );
			}
			if( getRequiredNewAccount() ) {
				if( ! rhs.getRequiredNewAccount() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredNewAccount() ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSecUserEMConfByUUuid6IdxKey) {
			ISecureSecUserEMConfByUUuid6IdxKey rhs = (ISecureSecUserEMConfByUUuid6IdxKey)obj;
			if (getRequiredEMConfirmationUuid6() != null) {
				if (rhs.getRequiredEMConfirmationUuid6() != null) {
					cmp = getRequiredEMConfirmationUuid6().compareTo( rhs.getRequiredEMConfirmationUuid6() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredEMConfirmationUuid6() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSecUserEMConfByConfEMAddrIdxKey) {
			ISecureSecUserEMConfByConfEMAddrIdxKey rhs = (ISecureSecUserEMConfByConfEMAddrIdxKey)obj;
			if (getRequiredConfirmEMailAddr() != null) {
				if (rhs.getRequiredConfirmEMailAddr() != null) {
					cmp = getRequiredConfirmEMailAddr().compareTo( rhs.getRequiredConfirmEMailAddr() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredConfirmEMailAddr() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSecUserEMConfBySentStampIdxKey) {
			ISecureSecUserEMConfBySentStampIdxKey rhs = (ISecureSecUserEMConfBySentStampIdxKey)obj;
			if (getRequiredEMailSentStamp() != null) {
				if (rhs.getRequiredEMailSentStamp() != null) {
					cmp = getRequiredEMailSentStamp().compareTo( rhs.getRequiredEMailSentStamp() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredEMailSentStamp() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSecUserEMConfByNewAcctIdxKey) {
			ISecureSecUserEMConfByNewAcctIdxKey rhs = (ISecureSecUserEMConfByNewAcctIdxKey)obj;
			if( getRequiredNewAccount() ) {
				if( ! rhs.getRequiredNewAccount() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredNewAccount() ) {
					return( -1 );
				}
			}
			return( 0 );
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
	public void set( ISecureSecUserEMConf src ) {
		setSecUserEMConf( src );
	}

	@Override
	public void setSecUserEMConf( ISecureSecUserEMConf src ) {
		setRequiredContainerUser(src.getRequiredContainerUser());
		setRequiredSecUserId(src.getRequiredSecUserId());
		setRequiredRevision( src.getRequiredRevision() );
		setCreatedByUserId( src.getCreatedByUserId() );
		setCreatedAt( src.getCreatedAt() );
		setUpdatedByUserId( src.getUpdatedByUserId() );
		setUpdatedAt( src.getUpdatedAt() );
		setRequiredConfirmEMailAddr(src.getRequiredConfirmEMailAddr());
		setRequiredEMailSentStamp(src.getRequiredEMailSentStamp());
		setRequiredEMConfirmationUuid6(src.getRequiredEMConfirmationUuid6());
		setRequiredNewAccount(src.getRequiredNewAccount());
	}

	@Override
	public void set( ISecureSecUserEMConfH src ) {
		setSecUserEMConf( src );
	}

	@Override
	public void setSecUserEMConf( ISecureSecUserEMConfH src ) {
		setRequiredContainerUser(src.getRequiredSecUserId());
		setRequiredSecUserId(src.getRequiredSecUserId());
		setRequiredConfirmEMailAddr(src.getRequiredConfirmEMailAddr());
		setRequiredEMailSentStamp(src.getRequiredEMailSentStamp());
		setRequiredEMConfirmationUuid6(src.getRequiredEMConfirmationUuid6());
		setRequiredNewAccount(src.getRequiredNewAccount());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = ""
			+ " RequiredSecUserId=" + "\"" + getRequiredSecUserId().toString() + "\""
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\""
			+ " RequiredSecUserId=" + "\"" + getRequiredSecUserId().toString() + "\""
			+ " RequiredConfirmEMailAddr=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredConfirmEMailAddr() ) + "\""
			+ " RequiredEMailSentStamp=" + "\"" + getRequiredEMailSentStamp().toString() + "\""
			+ " RequiredEMConfirmationUuid6=" + "\"" + getRequiredEMConfirmationUuid6().toString() + "\""
			+ " RequiredNewAccount=" + (( getRequiredNewAccount() ) ? "\"true\"" : "\"false\"" );
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureJpaSecUserEMConf" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
