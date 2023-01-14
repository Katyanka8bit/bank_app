package com.bank.spring.model;


import jakarta.persistence.*;

/**
 * Simple JavaBean domain object that represents Balance
 */
@Entity
@Table(name = "balances")
public class Balance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //TODO нужно добавить поля
}
