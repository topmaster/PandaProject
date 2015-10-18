package by.goncharov.dao;

import by.goncharov.entity.Contact;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description of ContactDAOImpl class
 *
 * @author Mikita Hancharou
 * @created 26.06.13 10:47
 */
@Repository
public class ContactDAOImpl extends AbstractBaseDAO implements ContactDAO {

    @Transactional(readOnly = false)
    public void save(Contact contact) {
        super.save(contact);
    }

    @Transactional(readOnly = false)
    public void delete(Contact contact) {
        super.delete(contact);
    }

    @Transactional(readOnly = true)
    public Contact find(Long contactId) {
        return (Contact) super.find(Contact.class, contactId);
    }
}
