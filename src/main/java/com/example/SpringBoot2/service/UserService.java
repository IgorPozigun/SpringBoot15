package com.example.SpringBoot2.service;

import com.example.SpringBoot2.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers(); // выводит всех юзеров

    void addUser(User user); // добавление юзера

    void deleteUser(User user); // удаление

    void updateUser(User user); // изменять

    User getUserById(int id); // получение юзера по id

}
