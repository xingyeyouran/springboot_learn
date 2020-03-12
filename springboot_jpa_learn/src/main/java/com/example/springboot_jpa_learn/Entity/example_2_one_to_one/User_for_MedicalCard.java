package com.example.springboot_jpa_learn.Entity.example_2_one_to_one;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class User_for_MedicalCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToOne(mappedBy = "user")
    private MedicalCard cardID;


}
