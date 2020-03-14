package com.example.springboot_jpa_learn.example_7_JQL;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Address07 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String info;
    @ManyToOne
    private User07 user;
}
