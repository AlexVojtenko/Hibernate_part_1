package service;

import dao.AccountDao;
import dao.AccountDaoImpl;
import model.Account;

public class AccountServiceImpl implements AccountService {
    public void save(Account account) {
        AccountDao accountDao = new AccountDaoImpl();
        accountDao.save(account);
    }

    public Account getByID(long id) {
        AccountDao accountDao = new AccountDaoImpl();
        return accountDao.getById(id);
    }

    public void update(Account account) {
        AccountDao accountDao = new AccountDaoImpl();
        accountDao.update(account);
    }

    public void delete(Account account) {
        AccountDao accountDao = new AccountDaoImpl();
        accountDao.delete(account);
    }
}
