package com.example.springboot_jpa_learn.Entity.example_1;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
//there can't be 2 or more indistinct entity name
public class User1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int name;

}
