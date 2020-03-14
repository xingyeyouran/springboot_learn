package com.example.springboot_jpa_learn.Service;

import com.example.springboot_jpa_learn.Entity.exapmle_6.Address06;
import com.example.springboot_jpa_learn.Entity.exapmle_6.User06;
import com.example.springboot_jpa_learn.Repository.example_6.Address06Repository;
import com.example.springboot_jpa_learn.Repository.example_6.User06Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class User06Service {
    @Autowired
    private User06Repository user06Repository;
    @Autowired
    private Address06Repository address06Repository;
    public void addUser(User06 user){
        user06Repository.save(user);
    }
    public void addAddress(Address06 address){
        address06Repository.save(address);
    }
    public User06 getUser(int id){
        return user06Repository.findById(id).orElse(null);
    }
    public Address06 getAddress(int id){
        return   address06Repository.findById(id).orElse(null);
    }
}
