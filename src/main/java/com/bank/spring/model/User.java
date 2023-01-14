package com.bank.spring.model;


import jakarta.persistence.*;

/**
 * Simple JavaBean domain object that represents User
 */
@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //TODO нужно добавить поля для сущности User (firstName, lastName, email, roles, password)
}
