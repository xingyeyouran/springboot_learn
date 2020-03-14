package com.example.springboot_jpa_learn.Entity.exapmle_6;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Address06 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String info;
    @ManyToOne
    private User06 user;
}
