package com.example.redditclone.entity;

import com.example.redditclone.enums.VoteType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private VoteType voteType;
    @ManyToOne
    private Post post;
    @ManyToOne
    private User user;
}
