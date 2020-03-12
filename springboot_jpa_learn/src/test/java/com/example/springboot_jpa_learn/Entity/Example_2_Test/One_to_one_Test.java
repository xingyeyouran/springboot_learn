package com.example.springboot_jpa_learn.Entity.Example_2_Test;

import com.example.springboot_jpa_learn.Entity.example_2_one_to_one.MedicalCard;
import com.example.springboot_jpa_learn.Entity.example_2_one_to_one.User_for_MedicalCard;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@SpringBootTest
@Slf4j
@Transactional
@Rollback(value = false)
public class One_to_one_Test {
    @Autowired
    private EntityManager manager;
    @Test
    public void test_one_to_one(){
        User_for_MedicalCard u1=new User_for_MedicalCard();
        MedicalCard m1=new MedicalCard();
        u1.setName("趙さん");
        m1.setDescription("趙さんのカッ");
        manager.persist(u1);
        manager.persist(m1);


    }
    @Test
    public void rel_test(){
        User_for_MedicalCard u2=manager.find(User_for_MedicalCard.class,1);
        MedicalCard m2=manager.find(MedicalCard.class,1);
        m2.setUser(u2);

    }
}
