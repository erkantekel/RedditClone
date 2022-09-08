package com.example.redditclone.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.Instant;

@Entity
@Getter
@Setter
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @NotBlank(message = "Username can not be blank!!")
    private String userName;
    @NotBlank(message = "Name can not be blank!!")
    private String name;
    @NotBlank(message = "SurName can not be blank!!")
    private String surName;
    @NotBlank(message = "Password can not be blank!!")
    private String password;
    @Email
    @NotBlank(message = "Email can not be blank!!")
    private String email;
    private Instant createdDate;
    private Boolean active;
}
