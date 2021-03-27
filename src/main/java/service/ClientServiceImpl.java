package service;

import dao.ClientDao;
import dao.ClientDaoImpl;
import model.Client;

import java.util.List;

public class ClientServiceImpl implements ClientService {
    public void save(Client client) {
        ClientDao clientDao = new ClientDaoImpl();
        clientDao.save(client);
    }

    public Client getByID(long id) {
        ClientDao clientDao = new ClientDaoImpl();
        return clientDao.getById(id);
    }

    public void update(Client client) {
        ClientDao clientDao = new ClientDaoImpl();
        clientDao.update(client);
    }

    public void delete(Client client) {
        ClientDao clientDao = new ClientDaoImpl();
        clientDao.delete(client);
    }

    public List<Client> searchClientByPhoneNumber(long phone) {
        ClientDao clientDao = new ClientDaoImpl();
        return clientDao.searchClientByPhoneNumber(phone);
    }
}
