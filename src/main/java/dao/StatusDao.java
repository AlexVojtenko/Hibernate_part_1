package dao;

import model.Status;

public interface StatusDao {

    void save(Status status);

    Status getById(long id);

    void update(Status status);

    void delete(Status status);
}
