package com.nhnacademy.auth.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Test {
    @Id
    int student_num;
    String student_name;
}
