package by.goncharov.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * AbstractBaseDAO.
 *
 * @author Mikita Hancharou <m.hancharou@gmail.com>
 * @package by.goncharov.controller
 */
@Component
public abstract class AbstractBaseDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * Gets Current Session.
	 *
	 * @return the Session
	 */
	protected Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	/**
	 * Saves object.
	 *
	 * @param object the object
	 */
	protected void save(final Object object)
	{
		getCurrentSession().saveOrUpdate(object);
	}

	/**
	 * Merges object.
	 *
	 * @param object the object
	 *
	 * @return the object
	 */
	protected Object merge(final Object object)
	{
		return getCurrentSession().merge(object);
	}

	/**
	 * Deletes object.
	 *
	 * @param object the object
	 */
	protected void delete(final Object object)
	{
		getCurrentSession().delete(object);
	}

	/**
	 * Finds by id.
	 *
	 * @param clazz the clazz
	 * @param id    the id
	 *
	 * @return the object
	 */
	protected Object findById(final Class<?> clazz, final Long id)
	{
		return getCurrentSession().get(clazz, id);
	}

	/**
	 * Saves All.
	 *
	 * @param objects the lis of objects
	 */
	protected void saveAll(final List<?> objects)
	{
		Session session = getCurrentSession();
		for (final Object object : objects)
		{
			session.saveOrUpdate(object);
		}
	}
}
