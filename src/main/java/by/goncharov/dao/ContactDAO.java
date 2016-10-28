package by.goncharov.dao;

import by.goncharov.entity.ContactEntity;

/**
 * ContactDAO.
 *
 * @author Mikita Hancharou <m.hancharou@gmail.com>
 * @package by.goncharov.controller
 */
public interface ContactDAO
{
	/**
	 * Saves.
	 *
	 * @param entity the entity
	 */
	void save(ContactEntity entity);

	/**
	 * Deletes.
	 *
	 * @param entity the entity
	 */
	void delete(ContactEntity entity);

	/**
	 * Finds By Id.
	 *
	 * @param id the id
	 *
	 * @return the ContactEntity
	 */
	ContactEntity findById(Long id);
}
