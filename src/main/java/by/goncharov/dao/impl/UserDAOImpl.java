package by.goncharov.dao.impl;

import by.goncharov.dao.UserDAO;
import by.goncharov.entity.UserEntity;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;

/**
 * UserDAO Implementation.
 *
 * @author Mikita Hancharou <m.hancharou@gmail.com>
 * @package by.goncharov.controller
 */
@Repository
public class UserDAOImpl extends AbstractBaseDAO implements UserDAO
{
	private static final String GET_USER_BY_USERNAME_QUERY = "from User where username=?";

	/**
	 * {@inheritDoc}
	 */
	@Transactional(readOnly = false)
	public void save(final UserEntity userEntity)
	{
		super.save(userEntity);
	}

	/**
	 * {@inheritDoc}
	 */
	@Transactional(readOnly = false)
	public void delete(final UserEntity userEntity)
	{
		super.delete(userEntity);
	}

	/**
	 * {@inheritDoc}
	 */
	@Transactional(readOnly = true)
	public UserEntity findById(final Long id)
	{
		return (UserEntity) super.findById(UserEntity.class, id);
	}

	/**
	 * {@inheritDoc}
	 */
	@Transactional(readOnly = true)
	public UserEntity findUserByUsername(final String username)
	{
		return (UserEntity) getCurrentSession().createQuery(GET_USER_BY_USERNAME_QUERY).setParameter(0, username).uniqueResult();
	}
}
