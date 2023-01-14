package com.bank.spring.repository;


import com.bank.spring.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for {@link Role} class
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
