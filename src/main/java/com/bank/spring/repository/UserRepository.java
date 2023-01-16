package com.bank.spring.repository;


import com.bank.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for {@link User} class
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User getUserByEmail(String email);
    void deleteUserByEmail(String email);
    void deleteUser(Integer id);
}
