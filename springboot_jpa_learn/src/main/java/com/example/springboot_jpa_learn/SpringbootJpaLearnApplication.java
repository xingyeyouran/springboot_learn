package com.example.springboot_jpa_learn;

import com.example.springboot_jpa_learn.RepositoryImple.example_5.BaseRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = BaseRepositoryImpl.class)
public class SpringbootJpaLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJpaLearnApplication.class, args);
    }

}
