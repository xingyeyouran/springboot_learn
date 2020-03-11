package com.example.springboot_jpa_learn.Util;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;
@SpringBootTest
@Slf4j
public class UUIDTest {
    @Test
    public void UUidT(){
        UUID uuid=UUID.randomUUID();
        log.debug("{}",uuid);
    }
}
