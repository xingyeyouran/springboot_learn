package com.example.springboot_jpa_learn.Entity.example_4_jpaRepository;

import com.example.springboot_jpa_learn.Entity.example_3_many_to_many.Selection3;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
public class User4 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(columnDefinition ="timestamp default current_timestamp",insertable = false,updatable = false)
    private LocalDateTime insert_time;
}
