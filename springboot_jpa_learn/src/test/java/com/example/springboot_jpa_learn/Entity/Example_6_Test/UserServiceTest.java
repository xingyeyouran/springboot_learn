package com.example.springboot_jpa_learn.Entity.Example_6_Test;
import com.example.springboot_jpa_learn.Entity.exapmle_6.Address06;
import com.example.springboot_jpa_learn.Entity.exapmle_6.User06;
import com.example.springboot_jpa_learn.Repository.example_6.User06Repository;
import com.example.springboot_jpa_learn.Service.User06Service;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Criteria;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestClass;

@SpringBootTest
@Slf4j
public class UserServiceTest {
    @Autowired
    private User06Service service;
    @Test
    public void init(){
        User06 u1=new User06();
        u1.setName("foo");
        service.addUser(u1);
        Address06 a1=new Address06();
        a1.setInfo("tokyo");
        service.addAddress(a1);
        Address06 a2=new Address06();
        a2.setInfo("osaka");
        a2.setUser(u1);
        service.addAddress(a2);
    } 
    @Test
    public void test_fetch(){
       log.debug(service.getAddress(2).getUser().getName());
    }
    @Test
    public void test_fetch_addresses(){
        service.getUser(1)
                .getAddresses()
                .forEach(address06 ->
                    log.debug("{}", address06.getInfo()));
        //must setting Entity as eager_loading
    }
}
