package dao;

import model.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class ClientDaoImpl implements ClientDao {
    public void save(Client client) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(client);
        transaction.commit();
        session.close();
    }

    public Client getById(long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        return session.byId(Client.class).getReference(id);
    }

    public void update(Client client) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Client updatedClient = session.getReference(Client.class, client.getId());
        session.getTransaction().begin();
        updatedClient.setName(client.getName());
        updatedClient.setEmail(client.getEmail());
        updatedClient.setPhone(client.getPhone());
        updatedClient.setAbout(client.getAbout());
        updatedClient.setAge(client.getAge());
        session.getTransaction().commit();
        session.close();
    }

    public void delete(Client client) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(client);
        transaction.commit();
        session.close();
    }

    public List<Client> searchClientByPhoneNumber(long phone) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        return (List<Client>) session.createQuery("FROM model.Client WHERE phone = :phone")
                .setParameter("phone", phone).list();
    }
}
