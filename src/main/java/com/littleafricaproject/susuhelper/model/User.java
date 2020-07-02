package com.littleafricaproject.susuhelper.model;


import com.littleafricaproject.susuhelper.enumeration.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @Column(name = "user_name" , unique = true, nullable = false)
    private String userName;

    @NotNull
    @Size(min=8, max = 25)
    private String password;

    @Enumerated(value = EnumType.STRING)
    private Role role;

    private boolean active;


    @ManyToOne
    private SusuGroup susuGroup;




}
