package by.goncharov.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Set;

/**
 * UserEntity.
 *
 * @author Mikita Hancharou <m.hancharou@gmail.com>
 * @package by.goncharov.controller
 */
@Entity
@Table(name = "users")
public class UserEntity extends AbstractEntity implements Serializable
{
	@Column(unique = true, name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_role_id", nullable = false)
	private RoleEntity roleEntity;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "charges_id", nullable = true)
	private Set<ExpensesEntity> expensesEntitySet;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "contact_id", nullable = true)
	private Set<ContactEntity> contactEntitySet;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "aim_id", nullable = true)
	private Set<AimEntity> aimEntitySet;

	/**
	 * Gets password.
	 *
	 * @return Value of password.
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * Sets new expensesEntitySet.
	 *
	 * @param expensesEntitySet New value of expensesEntitySet.
	 */
	public void setExpensesEntitySet(final Set<ExpensesEntity> expensesEntitySet)
	{
		this.expensesEntitySet = expensesEntitySet;
	}

	/**
	 * Sets new aimEntitySet.
	 *
	 * @param aimEntitySet New value of aimEntitySet.
	 */
	public void setAimEntitySet(final Set<AimEntity> aimEntitySet)
	{
		this.aimEntitySet = aimEntitySet;
	}

	/**
	 * Sets new username.
	 *
	 * @param username New value of username.
	 */
	public void setUsername(final String username)
	{
		this.username = username;
	}

	/**
	 * Gets expensesEntitySet.
	 *
	 * @return Value of expensesEntitySet.
	 */
	public Set<ExpensesEntity> getExpensesEntitySet()
	{
		return expensesEntitySet;
	}

	/**
	 * Sets new password.
	 *
	 * @param password New value of password.
	 */
	public void setPassword(final String password)
	{
		this.password = password;
	}

	/**
	 * Gets username.
	 *
	 * @return Value of username.
	 */
	public String getUsername()
	{
		return username;
	}

	/**
	 * Sets new contactEntitySet.
	 *
	 * @param contactEntitySet New value of contactEntitySet.
	 */
	public void setContactEntitySet(final Set<ContactEntity> contactEntitySet)
	{
		this.contactEntitySet = contactEntitySet;
	}

	/**
	 * Gets roleEntity.
	 *
	 * @return Value of roleEntity.
	 */
	public RoleEntity getRoleEntity()
	{
		return roleEntity;
	}

	/**
	 * Gets aimEntitySet.
	 *
	 * @return Value of aimEntitySet.
	 */
	public Set<AimEntity> getAimEntitySet()
	{
		return aimEntitySet;
	}

	/**
	 * Sets new roleEntity.
	 *
	 * @param roleEntity New value of roleEntity.
	 */
	public void setRoleEntity(final RoleEntity roleEntity)
	{
		this.roleEntity = roleEntity;
	}

	/**
	 * Gets contactEntitySet.
	 *
	 * @return Value of contactEntitySet.
	 */
	public Set<ContactEntity> getContactEntitySet()
	{
		return contactEntitySet;
	}
}
