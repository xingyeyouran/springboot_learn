package com.example.springboot_jpa_learn.Entity.Example_4_Test;

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
public class RepositoryTest {
    @Autowired
    private User4Repository user4Repository;
    @Autowired
    private EntityManager manager;
    @Test
    public void test_add_user(){
        User4 user4=new User4();
        user4.setName("feeble");
        user4Repository.save(user4);
        user4.setName("stunt");
//        follow method is no_needed
        user4Repository.save(user4);
        log.debug("qqq");

    }
    @Test
    public void test_alter(){
        user4Repository.findById(1).ifPresent(user -> user.setName("gin"));
    }
    @Test
    public void test_add_2(){
        User4 user4=new User4();
        user4.setId(2);
        user4Repository.save(user4);
    }
    @Test
    public void test_add_3(){
        User4 user=new User4();
        user.setName("hunter");
        user4Repository.save(user);
        log.debug("{}",user.getId());
        log.debug("{}",user.getInsert_time());
    }
    @Test
    public void refresh_test(){
        User4 user=new User4();
        user.setName("sucker");
        manager.persist(user);
        manager.refresh(user);
        log.debug("{}  {}",user.getId(),user.getInsert_time());
    }



}
