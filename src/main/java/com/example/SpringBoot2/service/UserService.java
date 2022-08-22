package com.example.SpringBoot2.service;

import com.example.SpringBoot2.model.User;

import java.util.List;

public interface UserService {
    List<User> showAllUsers(); // выводит всех юзеров

    void userAdditions(User user); // добавление юзера

    void deleteUser(User user); // удаление

    void updateUser(User user); // изменять

    User getUserById(int id); // получение юзера по id

}
