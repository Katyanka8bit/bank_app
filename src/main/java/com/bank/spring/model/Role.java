package com.bank.spring.model;


import jakarta.persistence.*;

/**
 * Simple JavaBean domain object that represents Role
 */
@Entity
@Table(name="roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

 //TODO нужно добавить поля
}
