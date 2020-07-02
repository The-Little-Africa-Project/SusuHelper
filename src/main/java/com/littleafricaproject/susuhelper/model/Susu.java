package com.littleafricaproject.susuhelper.model;


import com.littleafricaproject.susuhelper.enumeration.Frequency;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Susu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int totalHands;

    private int handsRemaining;

    private int handsCompleted;

    private boolean active;

    private boolean requireReserves;

    @Enumerated(value = EnumType.STRING)
    private Frequency handFrequency;

    @OneToMany(mappedBy = "susu", targetEntity = SusuHand.class)
    private Set<SusuHand> susuHands;

    @ManyToOne
    private SusuGroup group;



}
