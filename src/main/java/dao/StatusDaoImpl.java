package dao;

import model.Status;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class StatusDaoImpl implements StatusDao {
    public void save(Status status) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(status);
        transaction.commit();
        session.close();
    }

    public Status getById(long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        return session.byId(Status.class).getReference(id);
    }

    public void update(Status status) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Status updatedStatus = session.getReference(Status.class, status.getId());
        session.getTransaction().begin();
        updatedStatus.setAlias(status.getAlias());
        updatedStatus.setDescription(status.getDescription());
        session.getTransaction().commit();
        session.close();
    }

    public void delete(Status status) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(status);
        transaction.commit();
        session.close();
    }
}
