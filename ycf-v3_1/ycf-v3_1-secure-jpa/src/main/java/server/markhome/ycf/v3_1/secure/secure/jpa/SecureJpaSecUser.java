// Description: Java 25 JPA implementation of a SecUser entity definition object.

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
	name = "SecUser", schema = "Secure31",
	indexes = {
		@Index(name = "SecUserIdIdx", columnList = "SecUserId", unique = true),
		@Index(name = "SecUserLoginIdx", columnList = "login_id", unique = true),
		@Index(name = "SecUserUEMailAddrIdx", columnList = "email_addr", unique = false)
	}
)
@Transactional(Transactional.TxType.REQUIRED)
@NamedQuery(name="secure31SecUser.countSysSecurityPermsByLoginId",
	query="select count(*) from ("
		+ "select sg0.requiredName as requiredName from SecureJpaSecSysGrp sg0 join sg0.optionalChildrenMembByGrp mb0 join mb0.requiredParentUser pu0 where sg0.requiredName = :parmPermName and pu0.requiredLoginId = :parmLoginId"
		+ " union select sg1.requiredName as requiredName from SecureJpaSecSysGrp sg1 join sg1.optionalComponentsIncByGrp ig1 join ig1.requiredParentSubGroup sg1a join sg1a.optionalChildrenMembByGrp mb1 join mb1.requiredParentUser pu1 where sg1.requiredName = :parmPermName and pu1.requiredLoginId = :parmLoginId"
		+ " union select sg2.requiredName as requiredName from SecureJpaSecSysGrp sg2 join sg2.optionalComponentsIncByGrp ig2 join ig2.requiredParentSubGroup sg2a join sg2a.optionalComponentsIncByGrp ig2a join ig2a.requiredParentSubGroup sg2b join sg2b.optionalChildrenMembByGrp mb2 join mb2.requiredParentUser pu2 where sg2.requiredName = :parmPermName and pu2.requiredLoginId = :parmLoginId"
		+ " union select sg3.requiredName as requiredName from SecureJpaSecSysGrp sg3 join sg3.optionalComponentsIncByGrp ig3 join ig3.requiredParentSubGroup sg3a join sg3a.optionalComponentsIncByGrp ig3a join ig3a.requiredParentSubGroup sg3b join sg3b.optionalComponentsIncByGrp ig3b join ig3b.requiredParentSubGroup sg3c join sg3c.optionalChildrenMembByGrp mb3 join mb3.requiredParentUser pu3 where sg3.requiredName = :parmPermName and pu3.requiredLoginId = :parmLoginId"
		+ " union select sg4.requiredName as requiredName from SecureJpaSecSysGrp sg4 join sg4.optionalComponentsIncByGrp ig4 join ig4.requiredParentSubGroup sg4a join sg4a.optionalComponentsIncByGrp ig4a join ig4a.requiredParentSubGroup sg4b join sg4b.optionalComponentsIncByGrp ig4b join ig4b.requiredParentSubGroup sg4c join sg4c.optionalComponentsIncByGrp ig4c join ig4c.requiredParentSubGroup sg4d join sg4d.optionalChildrenMembByGrp mb4 join mb4.requiredParentUser pu4 where sg4.requiredName = :parmPermName and pu4.requiredLoginId = :parmLoginId"
		+ " union select sg5.requiredName as requiredName from SecureJpaSecSysGrp sg5 join sg5.optionalComponentsIncByGrp ig5 join ig5.requiredParentSubGroup sg5a join sg5a.optionalComponentsIncByGrp ig5a join ig5a.requiredParentSubGroup sg5b join sg5b.optionalComponentsIncByGrp ig5b join ig5b.requiredParentSubGroup sg5c join sg5c.optionalComponentsIncByGrp ig5c join ig5c.requiredParentSubGroup sg5d join sg5d.optionalComponentsIncByGrp ig5d join ig5d.requiredParentSubGroup sg5e join sg5e.optionalChildrenMembByGrp mb5 join mb5.requiredParentUser pu5 where sg5.requiredName = :parmPermName and pu5.requiredLoginId = :parmLoginId"
		+ " union select sg6.requiredName as requiredName from SecureJpaSecSysGrp sg6 join sg6.optionalComponentsIncByGrp ig6 join ig6.requiredParentSubGroup sg6a join sg6a.optionalComponentsIncByGrp ig6a join ig6a.requiredParentSubGroup sg6b join sg6b.optionalComponentsIncByGrp ig6b join ig6b.requiredParentSubGroup sg6c join sg6c.optionalComponentsIncByGrp ig6c join ig6c.requiredParentSubGroup sg6d join sg6d.optionalComponentsIncByGrp ig6d join ig6d.requiredParentSubGroup sg6e join sg6e.optionalComponentsIncByGrp ig6e join ig6e.requiredParentSubGroup sg6f join sg6f.optionalChildrenMembByGrp mb6 join mb6.requiredParentUser pu6 where sg6.requiredName = :parmPermName and pu6.requiredLoginId = :parmLoginId"
		+ " union select sg7.requiredName as requiredName from SecureJpaSecSysGrp sg7 join sg7.optionalComponentsIncByGrp ig7 join ig7.requiredParentSubGroup sg7a join sg7a.optionalComponentsIncByGrp ig7a join ig7a.requiredParentSubGroup sg7b join sg7b.optionalComponentsIncByGrp ig7b join ig7b.requiredParentSubGroup sg7c join sg7c.optionalComponentsIncByGrp ig7c join ig7c.requiredParentSubGroup sg7d join sg7d.optionalComponentsIncByGrp ig7d join ig7d.requiredParentSubGroup sg7e join sg7e.optionalComponentsIncByGrp ig7e join ig7e.requiredParentSubGroup sg7f join sg7f.optionalComponentsIncByGrp ig7f join ig7f.requiredParentSubGroup sg7g join sg7g.optionalChildrenMembByGrp mb7 join mb7.requiredParentUser pu7 where sg7.requiredName = :parmPermName and pu7.requiredLoginId = :parmLoginId)")
@NamedQuery(name="secure31SecUser.countSysSecurityPermsByUserId",
	query="select count(*) from ("
		+ "select sg0.requiredName as requiredName from SecureJpaSecSysGrp sg0 join sg0.optionalChildrenMembByGrp mb0 join mb0.requiredParentUser pu0 where sg0.requiredName = :parmPermName and pu0.requiredSecUserId = :parmUserId"
		+ " union select sg1.requiredName as requiredName from SecureJpaSecSysGrp sg1 join sg1.optionalComponentsIncByGrp ig1 join ig1.requiredParentSubGroup sg1a join sg1a.optionalChildrenMembByGrp mb1 join mb1.requiredParentUser pu1 where sg1.requiredName = :parmPermName and pu1.requiredSecUserId = :parmUserId"
		+ " union select sg2.requiredName as requiredName from SecureJpaSecSysGrp sg2 join sg2.optionalComponentsIncByGrp ig2 join ig2.requiredParentSubGroup sg2a join sg2a.optionalComponentsIncByGrp ig2a join ig2a.requiredParentSubGroup sg2b join sg2b.optionalChildrenMembByGrp mb2 join mb2.requiredParentUser pu2 where sg2.requiredName = :parmPermName and pu2.requiredSecUserId = :parmUserId"
		+ " union select sg3.requiredName as requiredName from SecureJpaSecSysGrp sg3 join sg3.optionalComponentsIncByGrp ig3 join ig3.requiredParentSubGroup sg3a join sg3a.optionalComponentsIncByGrp ig3a join ig3a.requiredParentSubGroup sg3b join sg3b.optionalComponentsIncByGrp ig3b join ig3b.requiredParentSubGroup sg3c join sg3c.optionalChildrenMembByGrp mb3 join mb3.requiredParentUser pu3 where sg3.requiredName = :parmPermName and pu3.requiredSecUserId = :parmUserId"
		+ " union select sg4.requiredName as requiredName from SecureJpaSecSysGrp sg4 join sg4.optionalComponentsIncByGrp ig4 join ig4.requiredParentSubGroup sg4a join sg4a.optionalComponentsIncByGrp ig4a join ig4a.requiredParentSubGroup sg4b join sg4b.optionalComponentsIncByGrp ig4b join ig4b.requiredParentSubGroup sg4c join sg4c.optionalComponentsIncByGrp ig4c join ig4c.requiredParentSubGroup sg4d join sg4d.optionalChildrenMembByGrp mb4 join mb4.requiredParentUser pu4 where sg4.requiredName = :parmPermName and pu4.requiredSecUserId = :parmUserId"
		+ " union select sg5.requiredName as requiredName from SecureJpaSecSysGrp sg5 join sg5.optionalComponentsIncByGrp ig5 join ig5.requiredParentSubGroup sg5a join sg5a.optionalComponentsIncByGrp ig5a join ig5a.requiredParentSubGroup sg5b join sg5b.optionalComponentsIncByGrp ig5b join ig5b.requiredParentSubGroup sg5c join sg5c.optionalComponentsIncByGrp ig5c join ig5c.requiredParentSubGroup sg5d join sg5d.optionalComponentsIncByGrp ig5d join ig5d.requiredParentSubGroup sg5e join sg5e.optionalChildrenMembByGrp mb5 join mb5.requiredParentUser pu5 where sg5.requiredName = :parmPermName and pu5.requiredSecUserId = :parmUserId"
		+ " union select sg6.requiredName as requiredName from SecureJpaSecSysGrp sg6 join sg6.optionalComponentsIncByGrp ig6 join ig6.requiredParentSubGroup sg6a join sg6a.optionalComponentsIncByGrp ig6a join ig6a.requiredParentSubGroup sg6b join sg6b.optionalComponentsIncByGrp ig6b join ig6b.requiredParentSubGroup sg6c join sg6c.optionalComponentsIncByGrp ig6c join ig6c.requiredParentSubGroup sg6d join sg6d.optionalComponentsIncByGrp ig6d join ig6d.requiredParentSubGroup sg6e join sg6e.optionalComponentsIncByGrp ig6e join ig6e.requiredParentSubGroup sg6f join sg6f.optionalChildrenMembByGrp mb6 join mb6.requiredParentUser pu6 where sg6.requiredName = :parmPermName and pu6.requiredSecUserId = :parmUserId"
		+ " union select sg7.requiredName as requiredName from SecureJpaSecSysGrp sg7 join sg7.optionalComponentsIncByGrp ig7 join ig7.requiredParentSubGroup sg7a join sg7a.optionalComponentsIncByGrp ig7a join ig7a.requiredParentSubGroup sg7b join sg7b.optionalComponentsIncByGrp ig7b join ig7b.requiredParentSubGroup sg7c join sg7c.optionalComponentsIncByGrp ig7c join ig7c.requiredParentSubGroup sg7d join sg7d.optionalComponentsIncByGrp ig7d join ig7d.requiredParentSubGroup sg7e join sg7e.optionalComponentsIncByGrp ig7e join ig7e.requiredParentSubGroup sg7f join sg7f.optionalComponentsIncByGrp ig7f join ig7f.requiredParentSubGroup sg7g join sg7g.optionalChildrenMembByGrp mb7 join mb7.requiredParentUser pu7 where sg7.requiredName = :parmPermName and pu7.requiredSecUserId = :parmUserId)")
@NamedQuery(name="secure31SecUser.countClusSecurityPermsByLoginId",
	query="select count(*) from ("
		+ "select sg0.requiredName as requiredName from SecureJpaSecSysGrp sg0 join sg0.optionalComponentsImplClusGrp cg0 join cg0.optionalChildrenMembByGrp mb0 join cg0.requiredOwnerCluster cl0 join mb0.requiredParentUser pu0 where sg0.requiredName = :parmPermName and pu0.requiredLoginId = :parmLoginId and cl0.requiredId = :parmClusterId"
		+ " union select sg1.requiredName as requiredName from SecureJpaSecSysGrp sg1 join sg1.optionalComponentsIncByGrp ig1 join ig1.requiredParentSubGroup sg1a join sg1a.optionalComponentsImplClusGrp cg1 join cg1.optionalChildrenMembByGrp mb1 join cg1.requiredOwnerCluster cl1 join mb1.requiredParentUser pu1 where sg1.requiredName = :parmPermName and pu1.requiredLoginId = :parmLoginId and cl1.requiredId = :parmClusterId"
		+ " union select sg2.requiredName as requiredName from SecureJpaSecSysGrp sg2 join sg2.optionalComponentsIncByGrp ig2 join ig2.requiredParentSubGroup sg2a join sg2a.optionalComponentsIncByGrp ig2a join ig2a.requiredParentSubGroup sg2b join sg2b.optionalComponentsImplClusGrp cg2 join cg2.optionalChildrenMembByGrp mb2 join cg2.requiredOwnerCluster cl2  join mb2.requiredParentUser pu2 where sg2.requiredName = :parmPermName and pu2.requiredLoginId = :parmLoginId and cl2.requiredId = :parmClusterId"
		+ " union select sg3.requiredName as requiredName from SecureJpaSecSysGrp sg3 join sg3.optionalComponentsIncByGrp ig3 join ig3.requiredParentSubGroup sg3a join sg3a.optionalComponentsIncByGrp ig3a join ig3a.requiredParentSubGroup sg3b join sg3b.optionalComponentsIncByGrp ig3b join ig3b.requiredParentSubGroup sg3c join sg3c.optionalComponentsImplClusGrp cg3 join cg3.optionalChildrenMembByGrp mb3 join cg3.requiredOwnerCluster cl3  join mb3.requiredParentUser pu3 where sg3.requiredName = :parmPermName and pu3.requiredLoginId = :parmLoginId and cl3.requiredId = :parmClusterId"
		+ " union select sg4.requiredName as requiredName from SecureJpaSecSysGrp sg4 join sg4.optionalComponentsIncByGrp ig4 join ig4.requiredParentSubGroup sg4a join sg4a.optionalComponentsIncByGrp ig4a join ig4a.requiredParentSubGroup sg4b join sg4b.optionalComponentsIncByGrp ig4b join ig4b.requiredParentSubGroup sg4c join sg4c.optionalComponentsIncByGrp ig4c join ig4c.requiredParentSubGroup sg4d join sg4d.optionalComponentsImplClusGrp cg4 join cg4.optionalChildrenMembByGrp mb4 join mb4.requiredParentUser pu4 join cg4.requiredOwnerCluster cl4 where sg4.requiredName = :parmPermName and pu4.requiredLoginId = :parmLoginId and cl4.requiredId = :parmClusterId"
		+ " union select sg5.requiredName as requiredName from SecureJpaSecSysGrp sg5 join sg5.optionalComponentsIncByGrp ig5 join ig5.requiredParentSubGroup sg5a join sg5a.optionalComponentsIncByGrp ig5a join ig5a.requiredParentSubGroup sg5b join sg5b.optionalComponentsIncByGrp ig5b join ig5b.requiredParentSubGroup sg5c join sg5c.optionalComponentsIncByGrp ig5c join ig5c.requiredParentSubGroup sg5d join sg5d.optionalComponentsIncByGrp ig5d join ig5d.requiredParentSubGroup sg5e join sg5e.optionalComponentsImplClusGrp cg5 join cg5.optionalChildrenMembByGrp mb5 join mb5.requiredParentUser pu5 join cg5.requiredOwnerCluster cl5 where sg5.requiredName = :parmPermName and pu5.requiredLoginId = :parmLoginId and cl5.requiredId = :parmClusterId"
		+ " union select sg6.requiredName as requiredName from SecureJpaSecSysGrp sg6 join sg6.optionalComponentsIncByGrp ig6 join ig6.requiredParentSubGroup sg6a join sg6a.optionalComponentsIncByGrp ig6a join ig6a.requiredParentSubGroup sg6b join sg6b.optionalComponentsIncByGrp ig6b join ig6b.requiredParentSubGroup sg6c join sg6c.optionalComponentsIncByGrp ig6c join ig6c.requiredParentSubGroup sg6d join sg6d.optionalComponentsIncByGrp ig6d join ig6d.requiredParentSubGroup sg6e join sg6e.optionalComponentsIncByGrp ig6e join ig6e.requiredParentSubGroup sg6f join sg6f.optionalComponentsImplClusGrp cg6 join cg6.optionalChildrenMembByGrp mb6 join cg6.requiredOwnerCluster cl6 join mb6.requiredParentUser pu6 where sg6.requiredName = :parmPermName and pu6.requiredLoginId = :parmLoginId and cl6.requiredId = :parmClusterId"
		+ " union select sg7.requiredName as requiredName from SecureJpaSecSysGrp sg7 join sg7.optionalComponentsIncByGrp ig7 join ig7.requiredParentSubGroup sg7a join sg7a.optionalComponentsIncByGrp ig7a join ig7a.requiredParentSubGroup sg7b join sg7b.optionalComponentsIncByGrp ig7b join ig7b.requiredParentSubGroup sg7c join sg7c.optionalComponentsIncByGrp ig7c join ig7c.requiredParentSubGroup sg7d join sg7d.optionalComponentsIncByGrp ig7d join ig7d.requiredParentSubGroup sg7e join sg7e.optionalComponentsIncByGrp ig7e join ig7e.requiredParentSubGroup sg7f join sg7f.optionalComponentsIncByGrp ig7f join ig7f.requiredParentSubGroup sg7g join sg7g.optionalComponentsImplClusGrp cg7 join cg7.optionalChildrenMembByGrp mb7 join cg7.requiredOwnerCluster cl7 join mb7.requiredParentUser pu7 where sg7.requiredName = :parmPermName and pu7.requiredLoginId = :parmLoginId and cl7.requiredId = :parmClusterId)")
@NamedQuery(name="secure31SecUser.countClusSecurityPermsByUserId",
	query="select count(*) from ("
		+ "select sg0.requiredName as requiredName from SecureJpaSecSysGrp sg0 join sg0.optionalComponentsImplClusGrp cg0 join cg0.optionalChildrenMembByGrp mb0 join cg0.requiredOwnerCluster cl0 join mb0.requiredParentUser pu0 where sg0.requiredName = :parmPermName and pu0.requiredSecUserId = :parmUserId and cl0.requiredId = :parmClusterId"
		+ " union select sg1.requiredName as requiredName from SecureJpaSecSysGrp sg1 join sg1.optionalComponentsIncByGrp ig1 join ig1.requiredParentSubGroup sg1a join sg1a.optionalComponentsImplClusGrp cg1 join cg1.optionalChildrenMembByGrp mb1 join cg1.requiredOwnerCluster cl1 join mb1.requiredParentUser pu1 where sg1.requiredName = :parmPermName and pu1.requiredSecUserId = :parmUserId and cl1.requiredId = :parmClusterId"
		+ " union select sg2.requiredName as requiredName from SecureJpaSecSysGrp sg2 join sg2.optionalComponentsIncByGrp ig2 join ig2.requiredParentSubGroup sg2a join sg2a.optionalComponentsIncByGrp ig2a join ig2a.requiredParentSubGroup sg2b join sg2b.optionalComponentsImplClusGrp cg2 join cg2.optionalChildrenMembByGrp mb2 join cg2.requiredOwnerCluster cl2  join mb2.requiredParentUser pu2 where sg2.requiredName = :parmPermName and pu2.requiredSecUserId = :parmUserId and cl2.requiredId = :parmClusterId"
		+ " union select sg3.requiredName as requiredName from SecureJpaSecSysGrp sg3 join sg3.optionalComponentsIncByGrp ig3 join ig3.requiredParentSubGroup sg3a join sg3a.optionalComponentsIncByGrp ig3a join ig3a.requiredParentSubGroup sg3b join sg3b.optionalComponentsIncByGrp ig3b join ig3b.requiredParentSubGroup sg3c join sg3c.optionalComponentsImplClusGrp cg3 join cg3.optionalChildrenMembByGrp mb3 join cg3.requiredOwnerCluster cl3  join mb3.requiredParentUser pu3 where sg3.requiredName = :parmPermName and pu3.requiredSecUserId = :parmUserId and cl3.requiredId = :parmClusterId"
		+ " union select sg4.requiredName as requiredName from SecureJpaSecSysGrp sg4 join sg4.optionalComponentsIncByGrp ig4 join ig4.requiredParentSubGroup sg4a join sg4a.optionalComponentsIncByGrp ig4a join ig4a.requiredParentSubGroup sg4b join sg4b.optionalComponentsIncByGrp ig4b join ig4b.requiredParentSubGroup sg4c join sg4c.optionalComponentsIncByGrp ig4c join ig4c.requiredParentSubGroup sg4d join sg4d.optionalComponentsImplClusGrp cg4 join cg4.optionalChildrenMembByGrp mb4 join mb4.requiredParentUser pu4 join cg4.requiredOwnerCluster cl4 where sg4.requiredName = :parmPermName and pu4.requiredSecUserId = :parmUserId and cl4.requiredId = :parmClusterId"
		+ " union select sg5.requiredName as requiredName from SecureJpaSecSysGrp sg5 join sg5.optionalComponentsIncByGrp ig5 join ig5.requiredParentSubGroup sg5a join sg5a.optionalComponentsIncByGrp ig5a join ig5a.requiredParentSubGroup sg5b join sg5b.optionalComponentsIncByGrp ig5b join ig5b.requiredParentSubGroup sg5c join sg5c.optionalComponentsIncByGrp ig5c join ig5c.requiredParentSubGroup sg5d join sg5d.optionalComponentsIncByGrp ig5d join ig5d.requiredParentSubGroup sg5e join sg5e.optionalComponentsImplClusGrp cg5 join cg5.optionalChildrenMembByGrp mb5 join mb5.requiredParentUser pu5 join cg5.requiredOwnerCluster cl5 where sg5.requiredName = :parmPermName and pu5.requiredSecUserId = :parmUserId and cl5.requiredId = :parmClusterId"
		+ " union select sg6.requiredName as requiredName from SecureJpaSecSysGrp sg6 join sg6.optionalComponentsIncByGrp ig6 join ig6.requiredParentSubGroup sg6a join sg6a.optionalComponentsIncByGrp ig6a join ig6a.requiredParentSubGroup sg6b join sg6b.optionalComponentsIncByGrp ig6b join ig6b.requiredParentSubGroup sg6c join sg6c.optionalComponentsIncByGrp ig6c join ig6c.requiredParentSubGroup sg6d join sg6d.optionalComponentsIncByGrp ig6d join ig6d.requiredParentSubGroup sg6e join sg6e.optionalComponentsIncByGrp ig6e join ig6e.requiredParentSubGroup sg6f join sg6f.optionalComponentsImplClusGrp cg6 join cg6.optionalChildrenMembByGrp mb6 join cg6.requiredOwnerCluster cl6 join mb6.requiredParentUser pu6 where sg6.requiredName = :parmPermName and pu6.requiredSecUserId = :parmUserId and cl6.requiredId = :parmClusterId"
		+ " union select sg7.requiredName as requiredName from SecureJpaSecSysGrp sg7 join sg7.optionalComponentsIncByGrp ig7 join ig7.requiredParentSubGroup sg7a join sg7a.optionalComponentsIncByGrp ig7a join ig7a.requiredParentSubGroup sg7b join sg7b.optionalComponentsIncByGrp ig7b join ig7b.requiredParentSubGroup sg7c join sg7c.optionalComponentsIncByGrp ig7c join ig7c.requiredParentSubGroup sg7d join sg7d.optionalComponentsIncByGrp ig7d join ig7d.requiredParentSubGroup sg7e join sg7e.optionalComponentsIncByGrp ig7e join ig7e.requiredParentSubGroup sg7f join sg7f.optionalComponentsIncByGrp ig7f join ig7f.requiredParentSubGroup sg7g join sg7g.optionalComponentsImplClusGrp cg7 join cg7.optionalChildrenMembByGrp mb7 join cg7.requiredOwnerCluster cl7 join mb7.requiredParentUser pu7 where sg7.requiredName = :parmPermName and pu7.requiredSecUserId = :parmUserId and cl7.requiredId = :parmClusterId)")
@NamedQuery(name="secure31SecUser.countTentSecurityPermsByLoginId",
	query="select count(*) from ("
		+ "select sg0.requiredName as requiredName from SecureJpaSecSysGrp sg0 join sg0.optionalComponentsImplTentGrp tg0 join tg0.optionalChildrenMembByGrp mb0 join mb0.requiredParentUser pu0 join tg0.requiredOwnerTenant tn0 where sg0.requiredName = :parmPermName and pu0.requiredLoginId = :parmLoginId and tn0.requiredId = :parmTenantId"
		+ " union select sg1.requiredName as requiredName from SecureJpaSecSysGrp sg1 join sg1.optionalComponentsIncByGrp ig1 join ig1.requiredParentSubGroup sg1a join sg1a.optionalComponentsImplTentGrp tg1 join tg1.optionalChildrenMembByGrp mb1 join mb1.requiredParentUser pu1 join tg1.requiredOwnerTenant tn1 where sg1.requiredName = :parmPermName and pu1.requiredLoginId = :parmLoginId and tn1.requiredId = :parmTenantId"
		+ " union select sg2.requiredName as requiredName from SecureJpaSecSysGrp sg2 join sg2.optionalComponentsIncByGrp ig2 join ig2.requiredParentSubGroup sg2a join sg2a.optionalComponentsIncByGrp ig2a join ig2a.requiredParentSubGroup sg2b join sg2a.optionalComponentsImplTentGrp tg2 join tg2.optionalChildrenMembByGrp mb2 join mb2.requiredParentUser pu2 join tg2.requiredOwnerTenant tn2 where sg2.requiredName = :parmPermName and pu2.requiredLoginId = :parmLoginId and tn2.requiredId = :parmTenantId"
		+ " union select sg3.requiredName as requiredName from SecureJpaSecSysGrp sg3 join sg3.optionalComponentsIncByGrp ig3 join ig3.requiredParentSubGroup sg3a join sg3a.optionalComponentsIncByGrp ig3a join ig3a.requiredParentSubGroup sg3b join sg3b.optionalComponentsIncByGrp ig3b join ig3b.requiredParentSubGroup sg3c join sg3c.optionalComponentsImplTentGrp tg3 join tg3.optionalChildrenMembByGrp mb3 join mb3.requiredParentUser pu3 join tg3.requiredOwnerTenant tn3 where sg3.requiredName = :parmPermName and pu3.requiredLoginId = :parmLoginId and tn3.requiredId = :parmTenantId"
		+ " union select sg4.requiredName as requiredName from SecureJpaSecSysGrp sg4 join sg4.optionalComponentsIncByGrp ig4 join ig4.requiredParentSubGroup sg4a join sg4a.optionalComponentsIncByGrp ig4a join ig4a.requiredParentSubGroup sg4b join sg4b.optionalComponentsIncByGrp ig4b join ig4b.requiredParentSubGroup sg4c join sg4c.optionalComponentsIncByGrp ig4c join ig4c.requiredParentSubGroup sg4d join sg4d.optionalComponentsImplTentGrp tg4 join tg4.optionalChildrenMembByGrp mb4 join mb4.requiredParentUser pu4  join tg4.requiredOwnerTenant tn4 where sg4.requiredName = :parmPermName and pu4.requiredLoginId = :parmLoginId and tn4.requiredId = :parmTenantId"
		+ " union select sg5.requiredName as requiredName from SecureJpaSecSysGrp sg5 join sg5.optionalComponentsIncByGrp ig5 join ig5.requiredParentSubGroup sg5a join sg5a.optionalComponentsIncByGrp ig5a join ig5a.requiredParentSubGroup sg5b join sg5b.optionalComponentsIncByGrp ig5b join ig5b.requiredParentSubGroup sg5c join sg5c.optionalComponentsIncByGrp ig5c join ig5c.requiredParentSubGroup sg5d join sg5d.optionalComponentsIncByGrp ig5d join ig5d.requiredParentSubGroup sg5e join sg5e.optionalComponentsImplTentGrp tg5 join tg5.optionalChildrenMembByGrp mb5 join mb5.requiredParentUser pu5 join tg5.requiredOwnerTenant tn5 where sg5.requiredName = :parmPermName and pu5.requiredLoginId = :parmLoginId and tn5.requiredId = :parmTenantId"
		+ " union select sg6.requiredName as requiredName from SecureJpaSecSysGrp sg6 join sg6.optionalComponentsIncByGrp ig6 join ig6.requiredParentSubGroup sg6a join sg6a.optionalComponentsIncByGrp ig6a join ig6a.requiredParentSubGroup sg6b join sg6b.optionalComponentsIncByGrp ig6b join ig6b.requiredParentSubGroup sg6c join sg6c.optionalComponentsIncByGrp ig6c join ig6c.requiredParentSubGroup sg6d join sg6d.optionalComponentsIncByGrp ig6d join ig6d.requiredParentSubGroup sg6e join sg6e.optionalComponentsIncByGrp ig6e join ig6e.requiredParentSubGroup sg6f join sg6f.optionalComponentsImplTentGrp tg6 join tg6.optionalChildrenMembByGrp mb6 join mb6.requiredParentUser pu6 join tg6.requiredOwnerTenant tn6 where sg6.requiredName = :parmPermName and pu6.requiredLoginId = :parmLoginId and tn6.requiredId = :parmTenantId"
		+ " union select sg7.requiredName as requiredName from SecureJpaSecSysGrp sg7 join sg7.optionalComponentsIncByGrp ig7 join ig7.requiredParentSubGroup sg7a join sg7a.optionalComponentsIncByGrp ig7a join ig7a.requiredParentSubGroup sg7b join sg7b.optionalComponentsIncByGrp ig7b join ig7b.requiredParentSubGroup sg7c join sg7c.optionalComponentsIncByGrp ig7c join ig7c.requiredParentSubGroup sg7d join sg7d.optionalComponentsIncByGrp ig7d join ig7d.requiredParentSubGroup sg7e join sg7e.optionalComponentsIncByGrp ig7e join ig7e.requiredParentSubGroup sg7f join sg7f.optionalComponentsIncByGrp ig7f join ig7f.requiredParentSubGroup sg7g join sg7g.optionalComponentsImplTentGrp tg7 join tg7.optionalChildrenMembByGrp mb7 join mb7.requiredParentUser pu7 join tg7.requiredOwnerTenant tn7 where sg7.requiredName = :parmPermName and pu7.requiredLoginId = :parmLoginId and tn7.requiredId = :parmTenantId)")
@NamedQuery(name="secure31SecUser.countTentSecurityPermsByUserId",
	query="select count(*) from ("
		+ "select sg0.requiredName as requiredName from SecureJpaSecSysGrp sg0 join sg0.optionalComponentsImplTentGrp tg0 join tg0.optionalChildrenMembByGrp mb0 join mb0.requiredParentUser pu0 join tg0.requiredOwnerTenant tn0 where sg0.requiredName = :parmPermName and pu0.requiredSecUserId = :parmUserId and tn0.requiredId = :parmTenantId"
		+ " union select sg1.requiredName as requiredName from SecureJpaSecSysGrp sg1 join sg1.optionalComponentsIncByGrp ig1 join ig1.requiredParentSubGroup sg1a join sg1a.optionalComponentsImplTentGrp tg1 join tg1.optionalChildrenMembByGrp mb1 join mb1.requiredParentUser pu1 join tg1.requiredOwnerTenant tn1 where sg1.requiredName = :parmPermName and pu1.requiredSecUserId = :parmUserId and tn1.requiredId = :parmTenantId"
		+ " union select sg2.requiredName as requiredName from SecureJpaSecSysGrp sg2 join sg2.optionalComponentsIncByGrp ig2 join ig2.requiredParentSubGroup sg2a join sg2a.optionalComponentsIncByGrp ig2a join ig2a.requiredParentSubGroup sg2b join sg2a.optionalComponentsImplTentGrp tg2 join tg2.optionalChildrenMembByGrp mb2 join mb2.requiredParentUser pu2 join tg2.requiredOwnerTenant tn2 where sg2.requiredName = :parmPermName and pu2.requiredSecUserId = :parmUserId and tn2.requiredId = :parmTenantId"
		+ " union select sg3.requiredName as requiredName from SecureJpaSecSysGrp sg3 join sg3.optionalComponentsIncByGrp ig3 join ig3.requiredParentSubGroup sg3a join sg3a.optionalComponentsIncByGrp ig3a join ig3a.requiredParentSubGroup sg3b join sg3b.optionalComponentsIncByGrp ig3b join ig3b.requiredParentSubGroup sg3c join sg3c.optionalComponentsImplTentGrp tg3 join tg3.optionalChildrenMembByGrp mb3 join mb3.requiredParentUser pu3 join tg3.requiredOwnerTenant tn3 where sg3.requiredName = :parmPermName and pu3.requiredSecUserId = :parmUserId and tn3.requiredId = :parmTenantId"
		+ " union select sg4.requiredName as requiredName from SecureJpaSecSysGrp sg4 join sg4.optionalComponentsIncByGrp ig4 join ig4.requiredParentSubGroup sg4a join sg4a.optionalComponentsIncByGrp ig4a join ig4a.requiredParentSubGroup sg4b join sg4b.optionalComponentsIncByGrp ig4b join ig4b.requiredParentSubGroup sg4c join sg4c.optionalComponentsIncByGrp ig4c join ig4c.requiredParentSubGroup sg4d join sg4d.optionalComponentsImplTentGrp tg4 join tg4.optionalChildrenMembByGrp mb4 join mb4.requiredParentUser pu4  join tg4.requiredOwnerTenant tn4 where sg4.requiredName = :parmPermName and pu4.requiredSecUserId = :parmUserId and tn4.requiredId = :parmTenantId"
		+ " union select sg5.requiredName as requiredName from SecureJpaSecSysGrp sg5 join sg5.optionalComponentsIncByGrp ig5 join ig5.requiredParentSubGroup sg5a join sg5a.optionalComponentsIncByGrp ig5a join ig5a.requiredParentSubGroup sg5b join sg5b.optionalComponentsIncByGrp ig5b join ig5b.requiredParentSubGroup sg5c join sg5c.optionalComponentsIncByGrp ig5c join ig5c.requiredParentSubGroup sg5d join sg5d.optionalComponentsIncByGrp ig5d join ig5d.requiredParentSubGroup sg5e join sg5e.optionalComponentsImplTentGrp tg5 join tg5.optionalChildrenMembByGrp mb5 join mb5.requiredParentUser pu5 join tg5.requiredOwnerTenant tn5 where sg5.requiredName = :parmPermName and pu5.requiredSecUserId = :parmUserId and tn5.requiredId = :parmTenantId"
		+ " union select sg6.requiredName as requiredName from SecureJpaSecSysGrp sg6 join sg6.optionalComponentsIncByGrp ig6 join ig6.requiredParentSubGroup sg6a join sg6a.optionalComponentsIncByGrp ig6a join ig6a.requiredParentSubGroup sg6b join sg6b.optionalComponentsIncByGrp ig6b join ig6b.requiredParentSubGroup sg6c join sg6c.optionalComponentsIncByGrp ig6c join ig6c.requiredParentSubGroup sg6d join sg6d.optionalComponentsIncByGrp ig6d join ig6d.requiredParentSubGroup sg6e join sg6e.optionalComponentsIncByGrp ig6e join ig6e.requiredParentSubGroup sg6f join sg6f.optionalComponentsImplTentGrp tg6 join tg6.optionalChildrenMembByGrp mb6 join mb6.requiredParentUser pu6 join tg6.requiredOwnerTenant tn6 where sg6.requiredName = :parmPermName and pu6.requiredSecUserId = :parmUserId and tn6.requiredId = :parmTenantId"
		+ " union select sg7.requiredName as requiredName from SecureJpaSecSysGrp sg7 join sg7.optionalComponentsIncByGrp ig7 join ig7.requiredParentSubGroup sg7a join sg7a.optionalComponentsIncByGrp ig7a join ig7a.requiredParentSubGroup sg7b join sg7b.optionalComponentsIncByGrp ig7b join ig7b.requiredParentSubGroup sg7c join sg7c.optionalComponentsIncByGrp ig7c join ig7c.requiredParentSubGroup sg7d join sg7d.optionalComponentsIncByGrp ig7d join ig7d.requiredParentSubGroup sg7e join sg7e.optionalComponentsIncByGrp ig7e join ig7e.requiredParentSubGroup sg7f join sg7f.optionalComponentsIncByGrp ig7f join ig7f.requiredParentSubGroup sg7g join sg7g.optionalComponentsImplTentGrp tg7 join tg7.optionalChildrenMembByGrp mb7 join mb7.requiredParentUser pu7 join tg7.requiredOwnerTenant tn7 where sg7.requiredName = :parmPermName and pu7.requiredSecUserId = :parmUserId and tn7.requiredId = :parmTenantId)")
@PersistenceContext(unitName = "SecurePU")
public class SecureJpaSecUser
	implements Comparable<Object>,
		ISecureSecUser,
		Serializable
{
	@Id
	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="SecUserId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 requiredSecUserId;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="requiredContainerSecUser")
	protected Set<SecureJpaSecSession> optionalComponentsSecSess;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="requiredParentSecProxy")
	protected Set<SecureJpaSecSession> optionalChildrenSecProxy;
	@OneToOne(fetch=FetchType.LAZY, optional=true)
	@JoinColumn( name="SecUserId", referencedColumnName="SecUserId" )
	protected SecureJpaSecUserPassword optionalComponentsPassword;
	@OneToOne(fetch=FetchType.LAZY, optional=true)
	@JoinColumn( name="SecUserId", referencedColumnName="SecUserId" )
	protected SecureJpaSecUserEMConf optionalComponentsEMConf;
	@OneToOne(fetch=FetchType.LAZY, optional=true)
	@JoinColumn( name="SecUserId", referencedColumnName="SecUserId" )
	protected SecureJpaSecUserPWReset optionalComponentsPWReset;
	@OneToOne(fetch=FetchType.LAZY, optional=true)
	@JoinColumn( name="SecUserId", referencedColumnName="SecUserId" )
	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="SecUserId", nullable=false, unique=true, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected SecureJpaSecUserPWHistory optionalChildrenPWHistory;
	protected int requiredRevision;

	@OneToMany(fetch=FetchType.LAZY, mappedBy="requiredParentUser")
	protected Set<SecureJpaSecSysGrpMemb> optionalChildrenSysSecGrpMemb;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="requiredParentUser")
	protected Set<SecureJpaSecClusGrpMemb> optionalChildrenClusSecGrpMemb;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="requiredParentUser")
	protected Set<SecureJpaSecTentGrpMemb> optionalChildrenTentSecGrpMemb;

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
	@Column( name="login_id", nullable=false, length=32 )
	protected String requiredLoginId;
	@Column( name="acct_status", nullable=false )
	protected ISecurePubSchema.SecAccountStatusEnum requiredAccountStatus;
	@Column( name="dflt_sysgrp_nm", nullable=true, length=64 )
	protected String optionalDfltSysGrpName;
	@Column( name="dflt_clusgrp_nm", nullable=true, length=64 )
	protected String optionalDfltClusGrpName;
	@Column( name="dflt_tentgrp_nm", nullable=true, length=64 )
	protected String optionalDfltTentGrpName;
	@Column( name="email_addr", nullable=false, length=512 )
	protected String requiredEMailAddress;

	public BusModelJpaSecUser() {
		requiredSecUserId = CFDbKeyHash256.fromHex( ISecurePubSecUser.SECUSERID_INIT_VALUE.toString() );
		requiredLoginId = ISecurePubSecUser.LOGINID_INIT_VALUE;
		requiredAccountStatus = ISecurePubSecUser.ACCOUNTSTATUS_INIT_VALUE;
		optionalDfltSysGrpName = null;
		optionalDfltClusGrpName = null;
		optionalDfltTentGrpName = null;
		requiredEMailAddress = ISecureProtSecUser.EMAILADDRESS_INIT_VALUE;
	}

	@Override
	public int getClassCode() {
		return( ISecureSecUser.CLASS_CODE );
	}

	@Override
	public List<ISecureSecSession> getOptionalComponentsSecSess() {
		List<ISecureSecSession> retlist = (optionalComponentsSecSess != null) ? new ArrayList<>(optionalComponentsSecSess) : new ArrayList<>();
		return( retlist );
	}

	@Override
	public List<ISecureSecSession> getOptionalChildrenSecProxy() {
		List<ISecureSecSession> retlist = (optionalChildrenSecProxy != null) ? new ArrayList<>(optionalChildrenSecProxy) : new ArrayList<>();
		return( retlist );
	}

	@Override
	public ISecureSecUserPassword getOptionalComponentsPassword() {
		return(optionalComponentsPassword);
	}

	@Override
	public ISecureSecUserEMConf getOptionalComponentsEMConf() {
		return(optionalComponentsEMConf);
	}

	@Override
	public ISecureSecUserPWReset getOptionalComponentsPWReset() {
		return(optionalComponentsPWReset);
	}

	@Override
	public ISecureSecUserPWHistory getOptionalChildrenPWHistory() {
		return(optionalChildrenPWHistory);
	}

	@Override
	public List<ISecureSecSysGrpMemb> getOptionalChildrenSysSecGrpMemb() {
		List<ISecureSecSysGrpMemb> retlist = (optionalChildrenSysSecGrpMemb != null) ? new ArrayList<>(optionalChildrenSysSecGrpMemb) : new ArrayList<>();
		return( retlist );
	}

	@Override
	public List<ISecureSecClusGrpMemb> getOptionalChildrenClusSecGrpMemb() {
		List<ISecureSecClusGrpMemb> retlist = (optionalChildrenClusSecGrpMemb != null) ? new ArrayList<>(optionalChildrenClusSecGrpMemb) : new ArrayList<>();
		return( retlist );
	}

	@Override
	public List<ISecureSecTentGrpMemb> getOptionalChildrenTentSecGrpMemb() {
		List<ISecureSecTentGrpMemb> retlist = (optionalChildrenTentSecGrpMemb != null) ? new ArrayList<>(optionalChildrenTentSecGrpMemb) : new ArrayList<>();
		return( retlist );
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
		this.requiredSecUserId = requiredSecUserId;
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
	public ISecurePubSchema.SecAccountStatusEnum getRequiredAccountStatus() {
		return(requiredAccountStatus);
	}

	public void setRequiredAccountStatus( ISecurePubSchema.SecAccountStatusEnum value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredAccountStatus",
				1,
				"value" );
		}
		requiredAccountStatus = value;
	}

	@Override
	public String getOptionalDfltSysGrpName() {
		return(optionalDfltSysGrpName);
	}

	public void setOptionalDfltSysGrpName( String value ) {
		if( value != null && value.length() > 64 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalDfltSysGrpName",
				1,
				"value.length()",
				value.length(),
				64 );
		}
		optionalDfltSysGrpName = value;
	}

	@Override
	public String getOptionalDfltClusGrpName() {
		return(optionalDfltClusGrpName);
	}

	public void setOptionalDfltClusGrpName( String value ) {
		if( value != null && value.length() > 64 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalDfltClusGrpName",
				1,
				"value.length()",
				value.length(),
				64 );
		}
		optionalDfltClusGrpName = value;
	}

	@Override
	public String getOptionalDfltTentGrpName() {
		return(optionalDfltTentGrpName);
	}

	public void setOptionalDfltTentGrpName( String value ) {
		if( value != null && value.length() > 64 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalDfltTentGrpName",
				1,
				"value.length()",
				value.length(),
				64 );
		}
		optionalDfltTentGrpName = value;
	}

	@Override
	public String getRequiredEMailAddress() {
		return(requiredEMailAddress);
	}

	public void setRequiredEMailAddress( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredEMailAddress",
				1,
				"value" );
		}
		else if( value.length() > 512 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredEMailAddress",
				1,
				"value.length()",
				value.length(),
				512 );
		}
		requiredEMailAddress = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if (obj == null) {
			return( false );
		}
		else if (obj instanceof ISecureSecUser) {
			ISecureSecUser rhs = (ISecureSecUser)obj;
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
			if( getRequiredAccountStatus() != null ) {
				if( rhs.getRequiredAccountStatus() != null ) {
					if( ! getRequiredAccountStatus().equals( rhs.getRequiredAccountStatus() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredAccountStatus() != null ) {
					return( false );
				}
			}
			if( getOptionalDfltSysGrpName() != null ) {
				if( rhs.getOptionalDfltSysGrpName() != null ) {
					if( ! getOptionalDfltSysGrpName().equals( rhs.getOptionalDfltSysGrpName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDfltSysGrpName() != null ) {
					return( false );
				}
			}
			if( getOptionalDfltClusGrpName() != null ) {
				if( rhs.getOptionalDfltClusGrpName() != null ) {
					if( ! getOptionalDfltClusGrpName().equals( rhs.getOptionalDfltClusGrpName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDfltClusGrpName() != null ) {
					return( false );
				}
			}
			if( getOptionalDfltTentGrpName() != null ) {
				if( rhs.getOptionalDfltTentGrpName() != null ) {
					if( ! getOptionalDfltTentGrpName().equals( rhs.getOptionalDfltTentGrpName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDfltTentGrpName() != null ) {
					return( false );
				}
			}
			if( getRequiredEMailAddress() != null ) {
				if( rhs.getRequiredEMailAddress() != null ) {
					if( ! getRequiredEMailAddress().equals( rhs.getRequiredEMailAddress() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredEMailAddress() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecUserH) {
			ISecureSecUserH rhs = (ISecureSecUserH)obj;
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
			if( getRequiredAccountStatus() != null ) {
				if( rhs.getRequiredAccountStatus() != null ) {
					if( ! getRequiredAccountStatus().equals( rhs.getRequiredAccountStatus() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredAccountStatus() != null ) {
					return( false );
				}
			}
			if( getOptionalDfltSysGrpName() != null ) {
				if( rhs.getOptionalDfltSysGrpName() != null ) {
					if( ! getOptionalDfltSysGrpName().equals( rhs.getOptionalDfltSysGrpName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDfltSysGrpName() != null ) {
					return( false );
				}
			}
			if( getOptionalDfltClusGrpName() != null ) {
				if( rhs.getOptionalDfltClusGrpName() != null ) {
					if( ! getOptionalDfltClusGrpName().equals( rhs.getOptionalDfltClusGrpName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDfltClusGrpName() != null ) {
					return( false );
				}
			}
			if( getOptionalDfltTentGrpName() != null ) {
				if( rhs.getOptionalDfltTentGrpName() != null ) {
					if( ! getOptionalDfltTentGrpName().equals( rhs.getOptionalDfltTentGrpName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDfltTentGrpName() != null ) {
					return( false );
				}
			}
			if( getRequiredEMailAddress() != null ) {
				if( rhs.getRequiredEMailAddress() != null ) {
					if( ! getRequiredEMailAddress().equals( rhs.getRequiredEMailAddress() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredEMailAddress() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecUserHPKey) {
			ISecureSecUserHPKey rhs = (ISecureSecUserHPKey)obj;
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
		else if (obj instanceof ISecureSecUserByULoginIdxKey) {
			ISecureSecUserByULoginIdxKey rhs = (ISecureSecUserByULoginIdxKey)obj;
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
		else if (obj instanceof ISecureSecUserByEMAddrIdxKey) {
			ISecureSecUserByEMAddrIdxKey rhs = (ISecureSecUserByEMAddrIdxKey)obj;
			if( getRequiredEMailAddress() != null ) {
				if( rhs.getRequiredEMailAddress() != null ) {
					if( ! getRequiredEMailAddress().equals( rhs.getRequiredEMailAddress() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredEMailAddress() != null ) {
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
		hashCode = hashCode + getCreatedByUserId().hashCode();
		hashCode = hashCode + getCreatedAt().hashCode();
		hashCode = hashCode + getUpdatedByUserId().hashCode();
		hashCode = hashCode + getUpdatedAt().hashCode();
		hashCode = hashCode + getRequiredSecUserId().hashCode();
		if( getRequiredLoginId() != null ) {
			hashCode = hashCode + getRequiredLoginId().hashCode();
		}
		hashCode = ( hashCode * 0x10000 ) + getRequiredAccountStatus().ordinal();
		if( getOptionalDfltSysGrpName() != null ) {
			hashCode = hashCode + getOptionalDfltSysGrpName().hashCode();
		}
		if( getOptionalDfltClusGrpName() != null ) {
			hashCode = hashCode + getOptionalDfltClusGrpName().hashCode();
		}
		if( getOptionalDfltTentGrpName() != null ) {
			hashCode = hashCode + getOptionalDfltTentGrpName().hashCode();
		}
		if( getRequiredEMailAddress() != null ) {
			hashCode = hashCode + getRequiredEMailAddress().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if (obj == null) {
			return( 1 );
		}
		else if (obj instanceof ISecureSecUser) {
			ISecureSecUser rhs = (ISecureSecUser)obj;
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
			if (getRequiredAccountStatus() != null) {
				if (rhs.getRequiredAccountStatus() != null) {
					cmp = getRequiredAccountStatus().compareTo( rhs.getRequiredAccountStatus() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredAccountStatus() != null) {
				return( -1 );
			}
			if( getOptionalDfltSysGrpName() != null ) {
				if( rhs.getOptionalDfltSysGrpName() != null ) {
					cmp = getOptionalDfltSysGrpName().compareTo( rhs.getOptionalDfltSysGrpName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDfltSysGrpName() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDfltClusGrpName() != null ) {
				if( rhs.getOptionalDfltClusGrpName() != null ) {
					cmp = getOptionalDfltClusGrpName().compareTo( rhs.getOptionalDfltClusGrpName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDfltClusGrpName() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDfltTentGrpName() != null ) {
				if( rhs.getOptionalDfltTentGrpName() != null ) {
					cmp = getOptionalDfltTentGrpName().compareTo( rhs.getOptionalDfltTentGrpName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDfltTentGrpName() != null ) {
					return( -1 );
				}
			}
			if (getRequiredEMailAddress() != null) {
				if (rhs.getRequiredEMailAddress() != null) {
					cmp = getRequiredEMailAddress().compareTo( rhs.getRequiredEMailAddress() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredEMailAddress() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSecUserHPKey) {
			ISecureSecUserHPKey rhs = (ISecureSecUserHPKey)obj;
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
		else if( obj instanceof ISecureSecUserH ) {
			ISecureSecUserH rhs = (ISecureSecUserH)obj;
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
			if (getRequiredAccountStatus() != null) {
				if (rhs.getRequiredAccountStatus() != null) {
					cmp = getRequiredAccountStatus().compareTo( rhs.getRequiredAccountStatus() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredAccountStatus() != null) {
				return( -1 );
			}
			if( getOptionalDfltSysGrpName() != null ) {
				if( rhs.getOptionalDfltSysGrpName() != null ) {
					cmp = getOptionalDfltSysGrpName().compareTo( rhs.getOptionalDfltSysGrpName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDfltSysGrpName() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDfltClusGrpName() != null ) {
				if( rhs.getOptionalDfltClusGrpName() != null ) {
					cmp = getOptionalDfltClusGrpName().compareTo( rhs.getOptionalDfltClusGrpName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDfltClusGrpName() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDfltTentGrpName() != null ) {
				if( rhs.getOptionalDfltTentGrpName() != null ) {
					cmp = getOptionalDfltTentGrpName().compareTo( rhs.getOptionalDfltTentGrpName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDfltTentGrpName() != null ) {
					return( -1 );
				}
			}
			if (getRequiredEMailAddress() != null) {
				if (rhs.getRequiredEMailAddress() != null) {
					cmp = getRequiredEMailAddress().compareTo( rhs.getRequiredEMailAddress() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredEMailAddress() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSecUserByULoginIdxKey) {
			ISecureSecUserByULoginIdxKey rhs = (ISecureSecUserByULoginIdxKey)obj;
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
		else if (obj instanceof ISecureSecUserByEMAddrIdxKey) {
			ISecureSecUserByEMAddrIdxKey rhs = (ISecureSecUserByEMAddrIdxKey)obj;
			if (getRequiredEMailAddress() != null) {
				if (rhs.getRequiredEMailAddress() != null) {
					cmp = getRequiredEMailAddress().compareTo( rhs.getRequiredEMailAddress() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredEMailAddress() != null) {
				return( -1 );
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
	public void set( ISecureSecUser src ) {
		setSecUser( src );
	}

	@Override
	public void setSecUser( ISecureSecUser src ) {
		setRequiredSecUserId(src.getRequiredSecUserId());
		setRequiredRevision( src.getRequiredRevision() );
		setCreatedByUserId( src.getCreatedByUserId() );
		setCreatedAt( src.getCreatedAt() );
		setUpdatedByUserId( src.getUpdatedByUserId() );
		setUpdatedAt( src.getUpdatedAt() );
		setRequiredLoginId(src.getRequiredLoginId());
		setRequiredAccountStatus(src.getRequiredAccountStatus());
		setOptionalDfltSysGrpName(src.getOptionalDfltSysGrpName());
		setOptionalDfltClusGrpName(src.getOptionalDfltClusGrpName());
		setOptionalDfltTentGrpName(src.getOptionalDfltTentGrpName());
		setRequiredEMailAddress(src.getRequiredEMailAddress());
	}

	@Override
	public void set( ISecureSecUserH src ) {
		setSecUser( src );
	}

	@Override
	public void setSecUser( ISecureSecUserH src ) {
		setRequiredSecUserId(src.getRequiredSecUserId());
		setRequiredLoginId(src.getRequiredLoginId());
		setRequiredAccountStatus(src.getRequiredAccountStatus());
		setOptionalDfltSysGrpName(src.getOptionalDfltSysGrpName());
		setOptionalDfltClusGrpName(src.getOptionalDfltClusGrpName());
		setOptionalDfltTentGrpName(src.getOptionalDfltTentGrpName());
		setRequiredEMailAddress(src.getRequiredEMailAddress());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = ""
			+ " RequiredSecUserId=" + "\"" + getRequiredSecUserId().toString() + "\""
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\""
			+ " RequiredSecUserId=" + "\"" + getRequiredSecUserId().toString() + "\""
			+ " RequiredLoginId=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredLoginId() ) + "\""
			+ " RequiredAccountStatus=" + "\"" + getRequiredAccountStatus().toString() + "\""
			+ " OptionalDfltSysGrpName=" + ( ( getOptionalDfltSysGrpName() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalDfltSysGrpName() ) + "\"" )
			+ " OptionalDfltClusGrpName=" + ( ( getOptionalDfltClusGrpName() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalDfltClusGrpName() ) + "\"" )
			+ " OptionalDfltTentGrpName=" + ( ( getOptionalDfltTentGrpName() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalDfltTentGrpName() ) + "\"" )
			+ " RequiredEMailAddress=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredEMailAddress() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureJpaSecUser" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
