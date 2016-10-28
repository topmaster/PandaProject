package by.goncharov.dao;

import by.goncharov.entity.GoodsCategoryEntity;

/**
 * GoodsCategoryDAO.
 *
 * @author Mikita Hancharou <m.hancharou@gmail.com>
 * @package by.goncharov.controller
 */
public interface GoodsCategoryDAO
{
	/**
	 * Saves.
	 *
	 * @param entity the entity
	 */
	void save(GoodsCategoryEntity entity);

	/**
	 * Deletes.
	 *
	 * @param entity the entity
	 */
	void delete(GoodsCategoryEntity entity);

	/**
	 * Finds By Id.
	 *
	 * @param id the id
	 *
	 * @return the GoodsCategoryEntity
	 */
	GoodsCategoryEntity findById(Long id);
}
