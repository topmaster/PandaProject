package by.goncharov.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import by.goncharov.dao.ExpensesDAO;
import by.goncharov.entity.ExpensesEntity;

/**
 * ExpensesEntity DAO Implementation.
 *
 * @author Mikita Hancharou <m.hancharou@gmail.com>
 * @package by.goncharov.controller
 */
@Repository
public class ExpensesDAOImpl extends AbstractBaseDAO implements ExpensesDAO
{
	/**
	 * {@inheritDoc}
	 */
	@Transactional(readOnly = false)
	public void save(final ExpensesEntity expensesEntity)
	{
		super.save(expensesEntity);
	}

	/**
	 * {@inheritDoc}
	 */
	@Transactional(readOnly = false)
	public void delete(final ExpensesEntity expensesEntity)
	{
		super.delete(expensesEntity);
	}

	/**
	 * {@inheritDoc}
	 */
	@Transactional(readOnly = true)
	public ExpensesEntity findById(final Long id)
	{
		return (ExpensesEntity) super.findById(ExpensesEntity.class, id);
	}
}
