package com.bank.spring.service;


import com.bank.spring.model.User;

import java.util.List;

public interface UserService {
    //INNERS METHOD
    User saveUser(User user);
    void deleteUser(Integer id);
    List<User> getAllUsers();
    User getUserById(Integer id);
    User getUserByBalanceId(Integer id);
    User getUserByEmail(String email);
    User addUser(User user);
    User updateUser(User user);


}
