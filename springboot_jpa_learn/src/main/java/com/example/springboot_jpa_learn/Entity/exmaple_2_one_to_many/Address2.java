package com.example.springboot_jpa_learn.Entity.exmaple_2_one_to_many;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Address2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String address;
    @ManyToOne
    private User02 user;
}
