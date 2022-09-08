package com.example.redditclone.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @NotBlank(message = "Message text can not be blank!!")
    private String text;
    @ManyToOne
    private Post post;
    private Instant createdDate;
    private LocalDate updatedDate;
    @ManyToOne
    private User user;
}
