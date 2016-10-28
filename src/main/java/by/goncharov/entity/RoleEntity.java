package by.goncharov.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Set;

/**
 * RoleEntity.
 *
 * @author Mikita Hancharou <m.hancharou@gmail.com>
 * @package by.goncharov.controller
 */
@Entity
@Table(name = "role")
public class RoleEntity extends AbstractEntity implements Serializable
{
	@Column(unique = true, name = "role_name")
	private String roleName;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = true)
	private Set<UserEntity> userEntitySet;

	/**
	 * Sets new userEntitySet.
	 *
	 * @param userEntitySet New value of userEntitySet.
	 */
	public void setUserEntitySet(final Set<UserEntity> userEntitySet)
	{
		this.userEntitySet = userEntitySet;
	}

	/**
	 * Sets new roleName.
	 *
	 * @param roleName New value of roleName.
	 */
	public void setRoleName(final String roleName)
	{
		this.roleName = roleName;
	}

	/**
	 * Gets userEntitySet.
	 *
	 * @return Value of userEntitySet.
	 */
	public Set<UserEntity> getUserEntitySet()
	{
		return userEntitySet;
	}

	/**
	 * Gets roleName.
	 *
	 * @return Value of roleName.
	 */
	public String getRoleName()
	{
		return roleName;
	}
}
