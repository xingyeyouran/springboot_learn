package com.example.springboot_jpa_learn.Entity.exapmle_6;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class User06 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
    private List<Address06> addresses;
}
