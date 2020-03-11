package com.example.springboot_jpa_learn.Entity.Example_1Test;

import com.example.springboot_jpa_learn.Entity.example_1.User2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.time.LocalDate;

@SpringBootTest
@Slf4j
@Transactional
@Rollback(value = false)
public class User {
//    P.S. The tutorial use @Autowired
//    However i wanna use PersistentContext
    @Autowired
    private EntityManager entityManager;
    @Test
    public void test_add_user(){
        User2 user= new User2();
        user.setName("fff");
        user.setTangjyubi(LocalDate.of(1998,2,2));
        entityManager.persist(user);
        log.debug("{}",user.getUuid());


    }
}
