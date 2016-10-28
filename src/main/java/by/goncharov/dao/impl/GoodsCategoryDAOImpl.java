package by.goncharov.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import by.goncharov.dao.GoodsCategoryDAO;
import by.goncharov.entity.GoodsCategoryEntity;

/**
 * Good's Category DAO Implementation.
 *
 * @author Mikita Hancharou <m.hancharou@gmail.com>
 * @package by.goncharov.controller
 */
@Repository
public class GoodsCategoryDAOImpl extends AbstractBaseDAO implements GoodsCategoryDAO
{
	/**
	 * {@inheritDoc}
	 */
	@Transactional(readOnly = false)
	public void save(final GoodsCategoryEntity goodsCategoryEntity)
	{
		super.save(goodsCategoryEntity);
	}

	/**
	 * {@inheritDoc}
	 */
	@Transactional(readOnly = false)
	public void delete(final GoodsCategoryEntity goodsCategoryEntity)
	{
		super.delete(goodsCategoryEntity);
	}

	/**
	 * {@inheritDoc}
	 */
	@Transactional(readOnly = true)
	public GoodsCategoryEntity findById(final Long id)
	{
		return (GoodsCategoryEntity) super.findById(GoodsCategoryEntity.class, id);
	}
}
