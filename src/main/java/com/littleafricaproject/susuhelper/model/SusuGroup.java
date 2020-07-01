package com.littleafricaproject.susuhelper.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class SusuGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private boolean active;

    @OneToMany(mappedBy = "susuGroup", targetEntity = User.class)
    private Set<User> groupMembers;


    @OneToMany
    private Set<Susu> susus;

}
