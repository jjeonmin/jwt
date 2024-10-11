package com.nhnacademy.auth.config;

import com.nhnacademy.auth.dto.Test;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtConfig {
    Test test;

    public Test getTest(String a) {
        boolean b = a.equals(test);
        if (b==false && a=="b"){
            return test;
        }
        else {
            b=true;
            return test;
        }
    }
}

