package com.example.springboot_jpa_learn.Repository.example_7;

import com.example.springboot_jpa_learn.Repository.example_5.BaseRepository;
import com.example.springboot_jpa_learn.example_7_JQL.User07;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface User07Repository extends BaseRepository<User07,Integer> {
    @Query("from User07 u where u.name=:name")
    List<User07> list(@Param("name") String name);
}
