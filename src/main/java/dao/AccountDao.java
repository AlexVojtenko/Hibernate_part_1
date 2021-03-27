package dao;

import model.Account;

public interface AccountDao {

    void save(Account account);

    Account getById(long id);

    void update(Account account);

    void delete(Account account);
}
