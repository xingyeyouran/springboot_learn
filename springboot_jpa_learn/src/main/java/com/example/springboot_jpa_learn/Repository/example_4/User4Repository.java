package com.example.springboot_jpa_learn.Repository.example_4;

import com.example.springboot_jpa_learn.Entity.example_4_jpaRepository.User4;
import com.example.springboot_jpa_learn.Repository.example_5.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User4Repository extends BaseRepository<User4, Integer> {
}
