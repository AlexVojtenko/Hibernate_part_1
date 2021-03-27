package service;

import model.Status;

public interface StatusService {

    void save(Status status);

    Status getByID(long id);

    void update(Status status);

    void delete(Status status);
}
