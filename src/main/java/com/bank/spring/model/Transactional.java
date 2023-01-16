package com.bank.spring.model;

import jakarta.persistence.*;

/**
 * Simple JavaBean domain object that represents Transaction
 */
@Entity
@Table(name = "transactions")
public class Transactional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Action action;

    private Double money;

    @OneToOne(mappedBy = "user_id", fetch = FetchType.LAZY)
    private User partner;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "modified_balance")
    private Balance balance;
}
