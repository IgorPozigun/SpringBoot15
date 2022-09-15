//package com.example.SpringBoot2.dao;
//
//import com.example.SpringBoot2.model.User;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import java.util.List;
//
//@Repository
//@Transactional
//public class UserDaoImp implements UserDao {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//
//    @Override
//    public void userAdditions(User user) {
//        entityManager.persist(user);
//    }
//
////    @Override
////    public void deleteUser(User user) {
////        entityManager.remove(entityManager.find(User.class, user.getId()));
////    }
//
//    @Override
//    public void updateUser(User user) {
//        entityManager.merge(user);
//    }
//
//    @Override
//    @SuppressWarnings("unchecked")
//    public User getUserById(Long id) {
//        return entityManager.find(User.class, id);
//    }
//
//    @Override
//    @SuppressWarnings("unchecked")
//    public List<User> showAllUsers() {
//        return entityManager.createQuery("select u from User u", User.class).getResultList();
//    }
//}
