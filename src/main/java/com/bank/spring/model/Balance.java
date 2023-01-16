package com.bank.spring.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Simple JavaBean domain object that represents Balance
 */
@Entity
@Table(name = "balances")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Balance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "amount")
    private Double amount;

    @OneToOne(optional = false, mappedBy = "user_id")
    private User owner;

    @OneToMany(mappedBy = "balance", fetch = FetchType.LAZY)
    private List<Transactional> transactionalList;
}
