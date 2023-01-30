package by.khristososva.CRUD_Boot.dao;


import by.khristososva.CRUD_Boot.models.User;

import java.util.List;

public interface UserDAO {
    List<User> AllListUser();

    void add(User user);

    void edit(int id, User user);

    void delete(int id);

    User getById(int id);
}

