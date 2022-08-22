package com.example.SpringBoot2.dao;

import com.example.SpringBoot2.model.User;

import java.util.List;

public interface UserDao {
    void userAdditions(User user); // добавление юзера

    void deleteUser(User user); // удаление

    void updateUser(User user); // изменять

    User getUserById(int id); // получение юзера по id

    List<User> showAllUsers(); // показать всех юзеров
}
