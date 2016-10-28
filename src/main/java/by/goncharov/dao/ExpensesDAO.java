package by.goncharov.dao;

import by.goncharov.entity.ExpensesEntity;

/**
 * ExpensesDAO.
 *
 * @author Mikita Hancharou <m.hancharou@gmail.com>
 * @package by.goncharov.controller
 */
public interface ExpensesDAO
{
	/**
	 * Saves.
	 *
	 * @param entity the entity
	 */
	void save(ExpensesEntity entity);

	/**
	 * Deletes.
	 *
	 * @param entity the entity
	 */
	void delete(ExpensesEntity entity);

	/**
	 * Finds By Id.
	 *
	 * @param id the id
	 *
	 * @return the ExpensesEntity
	 */
	ExpensesEntity findById(Long id);
}
