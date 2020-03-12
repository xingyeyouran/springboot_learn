package com.example.springboot_jpa_learn.Entity.example_2_one_to_one;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class MedicalCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardID;
    private String description;
    @OneToOne
    @JoinColumn(unique = true)
    private User_for_MedicalCard user;


}
