package service;

import model.Client;

import java.util.List;

public interface ClientService {

    void save(Client client);

    Client getByID(long id);

    void update(Client client);

    void delete(Client client);

    List<Client> searchClientByPhoneNumber(long phone);
}
