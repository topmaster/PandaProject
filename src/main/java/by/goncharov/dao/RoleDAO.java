package by.goncharov.dao;

import by.goncharov.entity.RoleEntity;

/**
 * RoleDAO.
 *
 * @author Mikita Hancharou <m.hancharou@gmail.com>
 * @package by.goncharov.controller
 */
public interface RoleDAO
{
	/**
	 * Saves.
	 *
	 * @param entity the roleEntity
	 */
	void save(RoleEntity entity);

	/**
	 * Deletes.
	 *
	 * @param entity the roleEntity
	 */
	void delete(RoleEntity entity);

	/**
	 * Finds by id.
	 *
	 * @param id the id
	 *
	 * @return the RoleEntity
	 */
	RoleEntity findById(Long id);
}
