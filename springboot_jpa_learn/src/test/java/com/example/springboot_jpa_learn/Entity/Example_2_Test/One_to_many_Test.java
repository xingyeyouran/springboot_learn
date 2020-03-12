package com.example.springboot_jpa_learn.Entity.Example_2_Test;
import com.example.springboot_jpa_learn.Entity.exmaple_2_one_to_many.Address2;
import com.example.springboot_jpa_learn.Entity.exmaple_2_one_to_many.User02;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Slf4j
@SpringBootTest
@Transactional
@Rollback(value = false)
public class One_to_many_Test {
    @Autowired
    private EntityManager manager;
    @Test
    public void test_adduser(){
        User02 user1=new User02();
//        User02 user2=new User02();
        Address2 address1=new Address2();
        Address2 address2=new Address2();
        user1.setName("fff");
        address1.setAddress("foo");
        address2.setAddress("bar");
        manager.persist(user1);
        manager.persist(address1);
        manager.persist(address2);

    }
    @Test
    public void test_rel1(){
        Address2 address3=manager.find(Address2.class,1);
        User02 user3=manager.find(User02.class,1);
        address3.setUser(user3);
        Address2 address4=manager.find(Address2.class,2);
        address4.setUser(user3);
    }

}
