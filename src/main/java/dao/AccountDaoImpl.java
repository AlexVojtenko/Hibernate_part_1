package dao;

import model.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class AccountDaoImpl implements AccountDao {

    public void save(Account account) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(account);
        transaction.commit();
        session.close();
    }

    public Account getById(long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        return session.byId(Account.class).getReference(id);
    }

    public void update(Account account) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Account updatedAccount = session.getReference(Account.class, account.getId());
        session.getTransaction().begin();
        updatedAccount.setClientId(account.getClientId());
        updatedAccount.setNumber(account.getNumber());
        updatedAccount.setValue(account.getValue());
        session.getTransaction().commit();
        session.close();
    }

    public void delete(Account account) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(account);
        transaction.commit();
        session.close();
    }
}
