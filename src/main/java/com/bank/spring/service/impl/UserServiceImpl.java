package com.bank.spring.service.impl;


import com.bank.spring.model.User;
import com.bank.spring.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

//    private final UserRepository userRepository;
//
//    @Autowired
//    public UserServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(Integer id) {
//        if (id!=null) {
//            userRepository.deleteUser(id);
//        }
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserById(Integer id) {
        return null;
    }

    @Override
    public User getUserByBalanceId(Integer id) {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
//        if (email!=null) {
//            return userRepository.getUserByEmail(email);
//        }
        return null;
    }

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }
}
