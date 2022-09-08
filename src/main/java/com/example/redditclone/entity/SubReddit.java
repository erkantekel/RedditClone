package com.example.redditclone.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.Instant;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class SubReddit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @NotBlank(message = "SubReddit name can not be blank!!")
    private String name;
    @NotBlank(message = "SubReddit description can not be blank!!")
    private String description;
    @OneToMany(fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Post> posts;
    private Instant createdDate;
    @ManyToMany
    @ToString.Exclude
    private List<User> users;
}
