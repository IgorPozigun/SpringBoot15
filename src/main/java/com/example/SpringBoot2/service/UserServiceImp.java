package com.example.SpringBoot2.service;

import com.example.SpringBoot2.model.Role;
import com.example.SpringBoot2.model.User;
import com.example.SpringBoot2.repository.RoleRepository;
import com.example.SpringBoot2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    private final RoleRepository roleRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;

    }

    @Override
    @Transactional
    public void createUser(User user) {
        userRepository.save(user);
    }

//    @Override
//    @Transactional
//    public List<Role> getAllRoles() {
//        return roleRepository.findAll();
//    }
//
//    @Override
//    @Transactional
//    public List<Role> findRolesByName(String roleName) {
//        List<Role> roles = new ArrayList<>();
//        for (Role role : getAllRoles()) {
//            if (roleName.contains(role.getName()))
//                roles.add(role);
//        }
//        return roles;
//    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    @Transactional
    public User getUserById(Long id) {
        return userRepository.getById(id);

    }

    @Override
    @Transactional
    public List<User> showAllUsers() {
        return userRepository.findAll();

    }
}
