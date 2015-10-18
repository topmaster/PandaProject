package by.goncharov.dao;

import by.goncharov.entity.Expenses;

/**
 * Description of ChargesDAO class
 *
 * @author Mikita Hancharou
 * @created 24.05.13 10:31
 */
public interface ChargesDAO {

    void save(Expenses expenses);

    void delete(Expenses expenses);

    Expenses find(Long chargesId);
}
