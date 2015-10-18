package by.goncharov.dao;

import by.goncharov.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description of UserDAOImpl class
 *
 * @author Mikita Hancharou
 * @created 23.05.13 12:51
 */
@Repository
public class UserDAOImpl extends AbstractBaseDAO implements UserDAO {

    @Transactional(readOnly = false)
    public void save(User user) {
        super.save(user);
    }

    @Transactional(readOnly = false)
    public void delete(User user) {
        super.delete(user);
    }

    @Transactional(readOnly = true)
    public User find(Long userId) {
        return (User) super.find(User.class, userId);
    }
}
