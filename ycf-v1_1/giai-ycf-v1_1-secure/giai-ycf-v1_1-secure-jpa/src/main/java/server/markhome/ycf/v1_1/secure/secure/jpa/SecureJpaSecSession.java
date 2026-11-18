// Description: Java 25 JPA implementation of a SecSession entity definition object.

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
	name = "SecSess", schema = "Secure31",
	indexes = {
		@Index(name = "SecSessionIdIdx", columnList = "SecSessionId", unique = true),
		@Index(name = "SessionSecUserIdx", columnList = "SecUserId", unique = false),
		@Index(name = "SessionStartIdx", columnList = "SecUserId, start_ts", unique = true),
		@Index(name = "SessionFinishIdx", columnList = "SecUserId, finish_ts", unique = false),
		@Index(name = "SessionSecProxyIdx", columnList = "SecProxyId", unique = false),
		@Index(name = "SessionSecUserIdxSecUser", columnList = "SecUserIdSecUser", unique = false),
		@Index(name = "SessionSecProxyIdxSecProxy", columnList = "SecProxyIdSecProxy", unique = false)
	}
)
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "SecurePU")
public class SecureJpaSecSession
	implements Comparable<Object>,
		ISecureSecSession,
		Serializable
{
	@Id
	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="SecSessionId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 requiredSecSessionId;
	protected int requiredRevision;

	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn( name="SecUserIdSecUser", referencedColumnName="SecUserId" )
	protected SecureJpaSecUser requiredContainerSecUser;
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn( name="SecProxyIdSecProxy", referencedColumnName="SecUserId" )
	protected SecureJpaSecUser requiredParentSecProxy;

	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="SecUserId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 requiredSecUserId;
	@Column( name="start_ts", nullable=false )
	protected LocalDateTime requiredStart;
	@Column( name="finish_ts", nullable=true )
	protected LocalDateTime optionalFinish;
	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="SecProxyId", nullable=true, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 optionalSecProxyId;

	public BusModelJpaSecSession() {
		requiredSecSessionId = CFDbKeyHash256.fromHex( ISecurePubSecSession.SECSESSIONID_INIT_VALUE.toString() );
		requiredSecUserId = CFDbKeyHash256.fromHex( ISecurePubSecSession.SECUSERID_INIT_VALUE.toString() );
		requiredStart = CFXmlUtil.parseTimestamp("2020-01-01T00:00:00");
		optionalFinish = null;
		optionalSecProxyId = CFDbKeyHash256.nullGet();
	}

	@Override
	public int getClassCode() {
		return( ISecureSecSession.CLASS_CODE );
	}

	@Override
	public ISecureSecUser getRequiredContainerSecUser() {
		return(requiredContainerSecUser);
	}

	@Override
	public void setRequiredContainerSecUser(ISecureSecUser argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerSecUser", 1, "argObj");
		}
		else if (argObj instanceof SecureJpaSecUser) {
			requiredContainerSecUser = (SecureJpaSecUser)argObj;
			if (requiredContainerSecUser != null) {
				requiredSecUserId = requiredContainerSecUser.getRequiredSecUserId();
			}
			else {
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setContainerSecUser", "argObj", argObj, "SecureJpaSecUser");
		}
	}

	@Override
	public void setRequiredContainerSecUser(ISecureProtSecUser argObj) {
		setRequiredContainerSecUser(argObj.getRequiredSecUserId());
	}

	@Override
	public void setRequiredContainerSecUser(ISecurePubSecUser argObj) {
		setRequiredContainerSecUser(argObj.getRequiredSecUserId());
	}

	@Override
	public void setRequiredContainerSecUser(ICFKeyHash256 argSecUserId) {
		ISecureSchema targetBackingSchema = ISecureSchema.getBackingSecure();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerSecUser", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecUserTable targetTable = targetBackingSchema.getTableSecUser();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerSecUser", 0, "ISecureSchema.getBackingSecure().getTableSecUser()");
		}
		ISecureSecUser targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argSecUserId);
		setRequiredContainerSecUser(targetRec);
	}

	@Override
	public ISecureSecUser getRequiredParentSecProxy() {
		return(requiredParentSecProxy);
	}

	@Override
	public void setRequiredParentSecProxy(ISecureSecUser argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setParentSecProxy", 1, "argObj");
		}
		else if (argObj instanceof SecureJpaSecUser) {
			requiredParentSecProxy = (SecureJpaSecUser)argObj;
			if (requiredParentSecProxy != null) {
				optionalSecProxyId = requiredParentSecProxy.getRequiredSecUserId();
			}
			else {
				optionalSecProxyId = null;
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setParentSecProxy", "argObj", argObj, "SecureJpaSecUser");
		}
	}

	@Override
	public void setRequiredParentSecProxy(ISecureProtSecUser argObj) {
		setRequiredParentSecProxy(argObj.getRequiredSecUserId());
	}

	@Override
	public void setRequiredParentSecProxy(ISecurePubSecUser argObj) {
		setRequiredParentSecProxy(argObj.getRequiredSecUserId());
	}

	@Override
	public void setRequiredParentSecProxy(ICFKeyHash256 argSecProxyId) {
		ISecureSchema targetBackingSchema = ISecureSchema.getBackingSecure();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredParentSecProxy", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecUserTable targetTable = targetBackingSchema.getTableSecUser();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredParentSecProxy", 0, "ISecureSchema.getBackingSecure().getTableSecUser()");
		}
		ISecureSecUser targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argSecProxyId);
		setRequiredParentSecProxy(targetRec);
	}

	@Override
	public $implCommaIJavaOptAtomType$ getPKey() {
		return getRequiredSecSessionId();
	}

	@Override
	public void setPKey($implCommaIJavaOptAtomType$ requiredSecSessionId) {
		this.requiredSecSessionId = requiredSecSessionId;
	}

	@Override
	public ICFKeyHash256 getRequiredSecSessionId() {
		return(getPKey().getRequiredSecSessionId());
	}

	public void setRequiredSecSessionId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSecSessionId",
				1,
				"value" );
		}
		getPKey().setRequiredSecSessionId(value);
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
	public ICFKeyHash256 getRequiredSecUserId() {
		return(requiredSecUserId);
	}

	public void setRequiredSecUserId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSecUserId",
				1,
				"value" );
		}
		requiredSecUserId = value;
	}

	@Override
	public LocalDateTime getRequiredStart() {
		return(requiredStart);
	}

	public void setRequiredStart( LocalDateTime value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredStart",
				1,
				"value" );
		}
		requiredStart = value;
	}

	@Override
	public LocalDateTime getOptionalFinish() {
		return(optionalFinish);
	}

	public void setOptionalFinish( LocalDateTime value ) {
		optionalFinish = value;
	}

	@Override
	public ICFKeyHash256 getOptionalSecProxyId() {
		return(optionalSecProxyId);
	}

	public void setOptionalSecProxyId( ICFKeyHash256 value ) {
		optionalSecProxyId = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if (obj == null) {
			return( false );
		}
		else if (obj instanceof ISecureSecSession) {
			ISecureSecSession rhs = (ISecureSecSession)obj;
			if( getRequiredSecSessionId() != null ) {
				if( rhs.getRequiredSecSessionId() != null ) {
					if( ! getRequiredSecSessionId().equals( rhs.getRequiredSecSessionId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecSessionId() != null ) {
					return( false );
				}
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
			if( getRequiredStart() != null ) {
				if( rhs.getRequiredStart() != null ) {
					if( ! getRequiredStart().equals( rhs.getRequiredStart() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredStart() != null ) {
					return( false );
				}
			}
			if( getOptionalFinish() != null ) {
				if( rhs.getOptionalFinish() != null ) {
					if( ! getOptionalFinish().equals( rhs.getOptionalFinish() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalFinish() != null ) {
					return( false );
				}
			}
			if( getOptionalSecProxyId() != null ) {
				if( rhs.getOptionalSecProxyId() != null ) {
					if( ! getOptionalSecProxyId().equals( rhs.getOptionalSecProxyId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalSecProxyId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecSessionH) {
			ISecureSecSessionH rhs = (ISecureSecSessionH)obj;
			if( getRequiredSecSessionId() != null ) {
				if( rhs.getRequiredSecSessionId() != null ) {
					if( ! getRequiredSecSessionId().equals( rhs.getRequiredSecSessionId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecSessionId() != null ) {
					return( false );
				}
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
			if( getRequiredStart() != null ) {
				if( rhs.getRequiredStart() != null ) {
					if( ! getRequiredStart().equals( rhs.getRequiredStart() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredStart() != null ) {
					return( false );
				}
			}
			if( getOptionalFinish() != null ) {
				if( rhs.getOptionalFinish() != null ) {
					if( ! getOptionalFinish().equals( rhs.getOptionalFinish() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalFinish() != null ) {
					return( false );
				}
			}
			if( getOptionalSecProxyId() != null ) {
				if( rhs.getOptionalSecProxyId() != null ) {
					if( ! getOptionalSecProxyId().equals( rhs.getOptionalSecProxyId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalSecProxyId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecSessionHPKey) {
			ISecureSecSessionHPKey rhs = (ISecureSecSessionHPKey)obj;
			if( getRequiredSecSessionId() != null ) {
				if( rhs.getRequiredSecSessionId() != null ) {
					if( ! getRequiredSecSessionId().equals( rhs.getRequiredSecSessionId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecSessionId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecSessionBySecUserIdxKey) {
			ISecureSecSessionBySecUserIdxKey rhs = (ISecureSecSessionBySecUserIdxKey)obj;
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
		else if (obj instanceof ISecureSecSessionByStartIdxKey) {
			ISecureSecSessionByStartIdxKey rhs = (ISecureSecSessionByStartIdxKey)obj;
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
			if( getRequiredStart() != null ) {
				if( rhs.getRequiredStart() != null ) {
					if( ! getRequiredStart().equals( rhs.getRequiredStart() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredStart() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecSessionByFinishIdxKey) {
			ISecureSecSessionByFinishIdxKey rhs = (ISecureSecSessionByFinishIdxKey)obj;
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
			if( getOptionalFinish() != null ) {
				if( rhs.getOptionalFinish() != null ) {
					if( ! getOptionalFinish().equals( rhs.getOptionalFinish() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalFinish() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecSessionBySecProxyIdxKey) {
			ISecureSecSessionBySecProxyIdxKey rhs = (ISecureSecSessionBySecProxyIdxKey)obj;
			if( getOptionalSecProxyId() != null ) {
				if( rhs.getOptionalSecProxyId() != null ) {
					if( ! getOptionalSecProxyId().equals( rhs.getOptionalSecProxyId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalSecProxyId() != null ) {
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
		int hashCode = getPKey().hashCode();
		hashCode = hashCode + getRequiredSecSessionId().hashCode();
		hashCode = hashCode + getRequiredSecUserId().hashCode();
		if( getRequiredStart() != null ) {
			hashCode = hashCode + getRequiredStart().hashCode();
		}
		if( getOptionalFinish() != null ) {
			hashCode = hashCode + getOptionalFinish().hashCode();
		}
		if( getOptionalSecProxyId() != null ) {
			hashCode = hashCode + getOptionalSecProxyId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if (obj == null) {
			return( 1 );
		}
		else if (obj instanceof ISecureSecSession) {
			ISecureSecSession rhs = (ISecureSecSession)obj;
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
			if (getRequiredStart() != null) {
				if (rhs.getRequiredStart() != null) {
					cmp = getRequiredStart().compareTo( rhs.getRequiredStart() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredStart() != null) {
				return( -1 );
			}
			if( getOptionalFinish() != null ) {
				if( rhs.getOptionalFinish() != null ) {
					cmp = getOptionalFinish().compareTo( rhs.getOptionalFinish() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalFinish() != null ) {
					return( -1 );
				}
			}
			if( getOptionalSecProxyId() != null ) {
				if( rhs.getOptionalSecProxyId() != null ) {
					cmp = getOptionalSecProxyId().compareTo( rhs.getOptionalSecProxyId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSecProxyId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSecSessionHPKey) {
			ISecureSecSessionHPKey rhs = (ISecureSecSessionHPKey)obj;
			if (getRequiredSecSessionId() != null) {
				if (rhs.getRequiredSecSessionId() != null) {
					cmp = getRequiredSecSessionId().compareTo( rhs.getRequiredSecSessionId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecSessionId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecureSecSessionH ) {
			ISecureSecSessionH rhs = (ISecureSecSessionH)obj;
			if (getRequiredSecSessionId() != null) {
				if (rhs.getRequiredSecSessionId() != null) {
					cmp = getRequiredSecSessionId().compareTo( rhs.getRequiredSecSessionId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecSessionId() != null) {
				return( -1 );
			}
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
			if (getRequiredStart() != null) {
				if (rhs.getRequiredStart() != null) {
					cmp = getRequiredStart().compareTo( rhs.getRequiredStart() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredStart() != null) {
				return( -1 );
			}
			if( getOptionalFinish() != null ) {
				if( rhs.getOptionalFinish() != null ) {
					cmp = getOptionalFinish().compareTo( rhs.getOptionalFinish() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalFinish() != null ) {
					return( -1 );
				}
			}
			if( getOptionalSecProxyId() != null ) {
				if( rhs.getOptionalSecProxyId() != null ) {
					cmp = getOptionalSecProxyId().compareTo( rhs.getOptionalSecProxyId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSecProxyId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSecSessionBySecUserIdxKey) {
			ISecureSecSessionBySecUserIdxKey rhs = (ISecureSecSessionBySecUserIdxKey)obj;
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
		else if (obj instanceof ISecureSecSessionByStartIdxKey) {
			ISecureSecSessionByStartIdxKey rhs = (ISecureSecSessionByStartIdxKey)obj;
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
			if (getRequiredStart() != null) {
				if (rhs.getRequiredStart() != null) {
					cmp = getRequiredStart().compareTo( rhs.getRequiredStart() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredStart() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSecSessionByFinishIdxKey) {
			ISecureSecSessionByFinishIdxKey rhs = (ISecureSecSessionByFinishIdxKey)obj;
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
			if( getOptionalFinish() != null ) {
				if( rhs.getOptionalFinish() != null ) {
					cmp = getOptionalFinish().compareTo( rhs.getOptionalFinish() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalFinish() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSecSessionBySecProxyIdxKey) {
			ISecureSecSessionBySecProxyIdxKey rhs = (ISecureSecSessionBySecProxyIdxKey)obj;
			if( getOptionalSecProxyId() != null ) {
				if( rhs.getOptionalSecProxyId() != null ) {
					cmp = getOptionalSecProxyId().compareTo( rhs.getOptionalSecProxyId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSecProxyId() != null ) {
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
	public void set( ISecureSecSession src ) {
		setSecSession( src );
	}

	@Override
	public void setSecSession( ISecureSecSession src ) {
		setRequiredSecSessionId(src.getRequiredSecSessionId());
		setRequiredRevision( src.getRequiredRevision() );
		setRequiredContainerSecUser(src.getRequiredContainerSecUser());
		setRequiredParentSecProxy(src.getRequiredParentSecProxy());
		setRequiredSecUserId(src.getRequiredSecUserId());
		setRequiredStart(src.getRequiredStart());
		setOptionalFinish(src.getOptionalFinish());
		setOptionalSecProxyId(src.getOptionalSecProxyId());
	}

	@Override
	public void set( ISecureSecSessionH src ) {
		setSecSession( src );
	}

	@Override
	public void setSecSession( ISecureSecSessionH src ) {
		setRequiredSecSessionId(src.getRequiredSecSessionId());
		setRequiredContainerSecUser(src.getRequiredSecUserId());
		setRequiredParentSecProxy(src.getOptionalSecProxyId());
		setRequiredSecUserId(src.getRequiredSecUserId());
		setRequiredStart(src.getRequiredStart());
		setOptionalFinish(src.getOptionalFinish());
		setOptionalSecProxyId(src.getOptionalSecProxyId());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = ""
			+ " RequiredSecSessionId=" + "\"" + getRequiredSecSessionId().toString() + "\""
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\""
			+ " RequiredSecSessionId=" + "\"" + getRequiredSecSessionId().toString() + "\""
			+ " RequiredSecUserId=" + "\"" + getRequiredSecUserId().toString() + "\""
			+ " RequiredStart=" + "\"" + getRequiredStart().toString() + "\""
			+ " OptionalFinish=" + ( ( getOptionalFinish() == null ) ? "null" : "\"" + getOptionalFinish().toString() + "\"" )
			+ " OptionalSecProxyId=" + ( ( getOptionalSecProxyId() == null ) ? "null" : "\"" + getOptionalSecProxyId().toString() + "\"" );
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureJpaSecSession" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
