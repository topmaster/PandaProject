package by.goncharov.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import by.goncharov.dao.ContactDAO;
import by.goncharov.entity.ContactEntity;

/**
 * ContactEntity DAO Implementation.
 *
 * @author Mikita Hancharou <m.hancharou@gmail.com>
 * @package by.goncharov.controller
 */
@Repository
public class ContactDAOImpl extends AbstractBaseDAO implements ContactDAO
{
	/**
	 * {@inheritDoc}
	 */
	@Transactional(readOnly = false)
	public void save(final ContactEntity contactEntity)
	{
		super.save(contactEntity);
	}

	/**
	 * {@inheritDoc}
	 */
	@Transactional(readOnly = false)
	public void delete(final ContactEntity contactEntity)
	{
		super.delete(contactEntity);
	}

	/**
	 * {@inheritDoc}
	 */
	@Transactional(readOnly = true)
	public ContactEntity findById(final Long contactId)
	{
		return (ContactEntity) super.findById(ContactEntity.class, contactId);
	}
}
