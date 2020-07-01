package com.littleafricaproject.susuhelper.model;


import com.littleafricaproject.susuhelper.enumeration.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    private String firstName;

    private String lastName;

    @Column( unique = true, nullable = false)
    private String userName;

    private String password;

    private Role role;

    private boolean active;


    @ManyToOne
    private SusuGroup susuGroup;




}
