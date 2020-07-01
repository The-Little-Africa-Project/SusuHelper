package com.littleafricaproject.susuhelper.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class SusuHand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany(mappedBy = "susuHand", targetEntity = Transaction.class)
    private Set<Transaction> transactions;

    @ManyToOne
    private  Susu susu;
}
