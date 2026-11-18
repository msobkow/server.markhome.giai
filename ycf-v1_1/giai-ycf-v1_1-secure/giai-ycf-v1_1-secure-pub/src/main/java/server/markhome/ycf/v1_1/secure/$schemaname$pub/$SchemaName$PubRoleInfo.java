// Description: Java 25 $SchemaName$ Public Role Information Implementation

$MssSourceLicense$

package server.markhome.ycf.v3_1.secure.$schemaname$pub;

import java.io.Serializable;

/*
 *	The $SchemaName$PubRoleInfo objects are passed in to the $SchemaName$ schema implementation to be bound
 *	to the security system.  Their natural order is to compare by dependency first, and by name second.
 */
public class $SchemaName$PubRoleInfo implements Serializable, Comparable<$SchemaName$PubRoleInfo>
{
	protected final String roleName;
	protected final String roleScope;
	protected final String enables;
	protected final String includes;

	public $SchemaName$PubRoleInfo(String roleName, String roleScope, String enables, String includes) {
		this.roleName = roleName;
		this.roleScope = roleScope;
		this.enables = enables;
		this.includes = includes;
	}

	public String getRoleName() {
		return roleName;
	}

	public String getRoleScope() {
		return roleScope;
	}

	public String getEnables() {
		return enables;
	}

	public String getIncludes() {
		return includes;
	}
	
	@Override
	public int compareTo( $SchemaName$PubRoleInfo rhs ) {
		if( rhs == null ) {
			return( 1 );
		}
		else {
			String lhsName = getRoleName();
			String rhsName = rhs.getRoleName();

			String lhsEnables = getEnables();
			String rhsEnables = rhs.getEnables();
			String lhsEnablesArr[] = lhsEnables.split(" ");
			String rhsEnablesArr[] = rhsEnables.split(" ");
			boolean rhsEnablesLhs = false;
			boolean lhsEnablesRhs = false;
			for (String v: lhsEnablesArr) {
				if (rhsName.equals(v)) {
					lhsEnablesRhs = true;
					break;
				}
			}
			for (String v: rhsEnablesArr) {
				if (lhsName.equals(v)) {
					rhsEnablesLhs = true;
					break;
				}
			}

			String lhsIncludes = getIncludes();
			String rhsIncludes = rhs.getIncludes();
			String lhsIncludesArr[] = lhsIncludes.split(" ");
			String rhsIncludesArr[] = rhsIncludes.split(" ");
			boolean rhsIncludesLhs = false;
			boolean lhsIncludesRhs = false;
			for (String v: lhsIncludesArr) {
				if (rhsName.equals(v)) {
					lhsIncludesRhs = true;
					break;
				}
			}
			for (String v: rhsIncludesArr) {
				if (lhsName.equals(v)) {
					rhsIncludesLhs = true;
					break;
				}
			}

			int ret;

			if (lhsEnablesRhs) {
				if (rhsEnablesLhs) {
					if (lhsIncludesRhs) {
						if (rhsIncludesLhs) {
							ret = lhsName.compareTo(rhsName);
						}
						else {
							ret = 1;
						}
					}
					else {
						if (rhsIncludesLhs) {
							ret = -1;
						}
						else {
							ret = lhsName.compareTo(rhsName);
						}
					}
				}
				else {
					ret = 1;
				}
			}
			else {
				if (rhsEnablesLhs) {
					ret = -1;
				}
				else {
					if (lhsIncludesRhs) {
						if (rhsIncludesLhs) {
							ret = lhsName.compareTo(rhsName);
						}
						else {
							ret = 1;
						}
					}
					else {
						if (rhsIncludesLhs) {
							ret = -1;
						}
						else {
							ret = lhsName.compareTo(rhsName);
						}
					}
				}
			}
			return( ret );
		}
	}
}
