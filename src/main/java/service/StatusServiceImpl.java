package service;

import dao.StatusDao;
import dao.StatusDaoImpl;
import model.Status;

public class StatusServiceImpl implements StatusService {

    public void save(Status status) {
        StatusDao statusDao = new StatusDaoImpl();
        statusDao.save(status);
    }

    public Status getByID(long id) {
        StatusDao statusDao = new StatusDaoImpl();
        return statusDao.getById(id);
    }

    public void update(Status status) {
        StatusDao statusDao = new StatusDaoImpl();
        statusDao.update(status);
    }

    public void delete(Status status) {
        StatusDao statusDao = new StatusDaoImpl();
        statusDao.delete(status);
    }
}
