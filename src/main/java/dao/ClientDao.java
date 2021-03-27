package dao;

import model.Client;

import java.util.List;

public interface ClientDao {

    void save(Client client);

    Client getById(long id);

    void update(Client client);

    void delete(Client client);

    List<Client> searchClientByPhoneNumber(long phone);
}
