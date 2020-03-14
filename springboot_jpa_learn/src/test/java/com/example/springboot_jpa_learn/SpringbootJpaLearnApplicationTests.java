package com.example.springboot_jpa_learn;

import com.example.springboot_jpa_learn.RepositoryImple.example_5.BaseRepositoryImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootTest
@EnableJpaRepositories(repositoryBaseClass = BaseRepositoryImpl.class)
class SpringbootJpaLearnApplicationTests {

    @Test
    void contextLoads() {
    }

}
