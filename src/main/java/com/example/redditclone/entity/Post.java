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
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @NotBlank(message = "Post header can not be blank!!")
    private String header;
    @NotBlank(message = "Post description can not be blank!!")
    @Lob
    private String description;
    private Integer voteCount = 0;
    private Instant createdDate;
    private LocalDate updatedDate;
    @ManyToOne
    private SubReddit subReddit;


}
