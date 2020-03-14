package com.example.springboot_jpa_learn.Entity.Example_5_Test;

import com.example.springboot_jpa_learn.Entity.example_4_jpaRepository.User4;
import com.example.springboot_jpa_learn.Repository.example_4.User4Repository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@SpringBootTest
@Transactional
@Slf4j
@Rollback(value = false)
public class SelfRepository {
    @Autowired
    private User4Repository user4Repository;
    @Autowired
     EntityManager manager;
    @Test
    public void my_repository_test(){

            User4 user=new User4();
            user.setName("crashed");
            user4Repository.save(user);
            user4Repository.refresh(user);
            log.debug("{}  {}",user.getId(),user.getInsert_time());
        }

    }

