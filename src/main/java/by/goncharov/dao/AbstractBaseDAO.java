package by.goncharov.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * Description of AbstractBaseDAO class
 *
 * @author Mikita Hancharou
 * @created 20.05.13 11:05
 */
public abstract class AbstractBaseDAO implements Serializable {

    @Autowired
    private SessionFactory sessionFactory;

    protected AbstractBaseDAO() {
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected void save(Object obj) {
        sessionFactory.getCurrentSession().saveOrUpdate(obj);
    }

    public Object merge(Object entity) {
        return sessionFactory.getCurrentSession().merge(entity);
    }

    protected void delete(Object obj) {
        sessionFactory.getCurrentSession().delete(obj);
    }

    protected Object find(Class<?> clazz, Long id) {
        return sessionFactory.getCurrentSession().get(clazz, id);
    }

    public void saveAll(List<?> entities) {
        Session session = sessionFactory.getCurrentSession();
        for (final Object entity : entities) {
            session.saveOrUpdate(entity);
        }
    }
}
