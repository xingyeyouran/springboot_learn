package com.example.springboot_jpa_learn.Entity.example_3_many_to_many;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Selection3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToOne
    private Course3 course;
    @ManyToOne
    private Student3 student;

}
