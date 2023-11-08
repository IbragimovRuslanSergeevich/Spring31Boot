package ru.javafirst.Spring31Boot.dao;

import ru.javafirst.Spring31Boot.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getUsersList();

    User getUser(int id);

    void addUser(User user);

    void deleteUser(int id);

    void editUser(User user);

}
