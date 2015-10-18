package by.goncharov.dao;

import by.goncharov.entity.Role;

/**
 * Description of RoleDAO class
 *
 * @author Mikita Hancharou
 * @created 18.05.13 15:46
 */
public interface RoleDAO {

    void save(Role role);

    void delete(Role role);

    Role find(Long roleId);
}
