package by.goncharov.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import by.goncharov.dao.RoleDAO;
import by.goncharov.entity.RoleEntity;
/**
 * Role DAO Implementation.
 *
 * @author Mikita Hancharou <m.hancharou@gmail.com>
 * @package by.goncharov.controller
 */
@Repository
public class RoleDAOImpl extends AbstractBaseDAO implements RoleDAO
{
	/**
	 * {@inheritDoc}
	 */
	@Transactional(readOnly = false)
	public void save(final RoleEntity roleEntity)
	{
		super.save(roleEntity);
	}

	/**
	 * {@inheritDoc}
	 */
	@Transactional(readOnly = false)
	public void delete(final RoleEntity roleEntity)
	{
		super.delete(roleEntity);
	}

	/**
	 * {@inheritDoc}
	 */
	@Transactional(readOnly = true)
	public RoleEntity findById(final Long id)
	{
		return (RoleEntity) super.findById(RoleEntity.class, id);
	}
}
