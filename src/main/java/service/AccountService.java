package service;

import model.Account;

public interface AccountService {

    void save(Account account);

    Account getByID(long id);

    void update(Account account);

    void delete(Account account);
}
