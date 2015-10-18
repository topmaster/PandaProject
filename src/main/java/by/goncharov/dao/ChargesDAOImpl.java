package by.goncharov.dao;

import by.goncharov.entity.Expenses;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description of ChargesDAOImpl class
 *
 * @author Mikita Hancharou
 * @created 24.05.13 10:33
 */
@Repository
public class ChargesDAOImpl extends AbstractBaseDAO implements ChargesDAO {

    @Transactional(readOnly = false)
    public void save(Expenses expenses) {
        super.save(expenses);
    }

    @Transactional(readOnly = false)
    public void delete(Expenses expenses) {
        super.delete(expenses);
    }

    @Transactional(readOnly = true)
    public Expenses find(Long chargesId) {
        return (Expenses) super.find(Expenses.class, chargesId);
    }
}
