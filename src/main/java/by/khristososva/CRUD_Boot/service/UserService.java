package by.khristososva.CRUD_Boot.service;


import by.khristososva.CRUD_Boot.models.User;

import java.util.List;

public interface UserService {
    List<User> AllListUser();

    void add(User user);

    void edit(int id, User user);

    void delete(int id);

    User getById(int id);
}
