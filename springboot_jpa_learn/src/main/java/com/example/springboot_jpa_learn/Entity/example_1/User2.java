package com.example.springboot_jpa_learn.Entity.example_1;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
public class User2 {
    @Id
    @GeneratedValue
    @Column(length = 16)
    private UUID uuid;
    private String name;
    private LocalDate tangjyubi;
    @Column(columnDefinition = "timestamp default current_timestamp ",
            insertable = false,
            updatable = false)
    private LocalDateTime insert_time;
    @Column(columnDefinition = "timestamp default current_timestamp " + "on update current_timestamp",
            insertable = false,
            updatable = false)
    private LocalDateTime update_time;
//      @Column(columnDefinition = "timestamp default current_timestamp",
//        insertable = false,
//        updatable = false)
//       private LocalDateTime insertTime;
//       @Column(columnDefinition = "timestamp default current_timestamp " +
//            "on update current_timestamp",
//            insertable = false,
//            updatable = false)
//       private LocalDateTime updateTime;

}
