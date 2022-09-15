package com.example.SpringBoot2.service;

import com.example.SpringBoot2.model.Role;
import com.example.SpringBoot2.model.User;

import java.util.List;

public interface UserService {
    void createUser(User user); // добавление юзера

    void deleteUser(Long id); // удаление

    void updateUser(User user); // изменять

    User getUserById(Long id); // получение юзера по id

    List<User> showAllUsers(); // показать всех юзеров

//    public List<Role> getAllRoles();// показать все role
//
//    public List<Role> findRolesByName(String roleName); // получить юзера по имени
}

