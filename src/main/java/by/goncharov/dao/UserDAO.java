package by.goncharov.dao;

import by.goncharov.entity.UserEntity;

/**
 * UserDAO.
 *
 * @author Mikita Hancharou <m.hancharou@gmail.com>
 * @package by.goncharov.controller
 */
public interface UserDAO
{
	/**
	 * Saves.
	 *
	 * @param entity the user entity
	 */
	void save(UserEntity entity);

	/**
	 * Deletes.
	 *
	 * @param entity the userEntity
	 */
	void delete(UserEntity entity);

	/**
	 * Finds by id.
	 *
	 * @param id the id
	 *
	 * @return the UserEntity
	 */
	UserEntity findById(Long id);

	/**
	 * Finds User By Username.
	 *
	 * @param username the username
	 *
	 * @return the UserEntity
	 */
	UserEntity findUserByUsername(String username);
}
