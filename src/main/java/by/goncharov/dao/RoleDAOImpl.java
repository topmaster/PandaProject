package by.goncharov.dao;

import by.goncharov.entity.Role;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description of RoleDAOImpl class
 *
 * @author Mikita Hancharou
 * @created 18.05.13 15:48
 */
@Repository
public class RoleDAOImpl extends AbstractBaseDAO implements RoleDAO {

    @Transactional(readOnly = false)
    public void save(Role role) {
        super.save(role);
    }

    @Transactional(readOnly = false)
    public void delete(Role role) {
        super.delete(role);
    }

    @Transactional(readOnly = true)
    public Role find(Long roleId) {
        return (Role) super.find(Role.class, roleId);
    }
}
