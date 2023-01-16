package com.bank.spring.repository;


import com.bank.spring.model.Balance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for {@link Balance} class
 */
@Repository
public interface BalanceRepository extends JpaRepository<Balance, Integer> {
    Balance getBalanceByUserId(Integer id);
}
