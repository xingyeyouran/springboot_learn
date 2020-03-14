package com.example.springboot_jpa_learn.Entity.Example_3_Test;

import com.example.springboot_jpa_learn.Entity.example_3_many_to_many.Course3;
import com.example.springboot_jpa_learn.Entity.example_3_many_to_many.Selection3;
import com.example.springboot_jpa_learn.Entity.example_3_many_to_many.Student3;
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
public class Many_to_many_Test {
    @Autowired
   private EntityManager manager;
    @Test
    public void test_init(){
        Student3 s1=new Student3();
        s1.setName("John");
        Student3 s2=new Student3();
        s1.setName("Pertain");
        Course3 c1=new Course3();
        c1.setName("Thermal Mechanics");
        manager.persist(s1);
        manager.persist(s2);
        manager.persist(c1);
    }
    @Test
    public void test_rel(){
        Student3 s3=manager.find(Student3.class,2);
        Course3 c3=manager.find(Course3.class,1);
        Selection3 selection=new Selection3();
        selection.setCourse(c3);
        selection.setStudent(s3);
        manager.persist(selection);
    }
}
