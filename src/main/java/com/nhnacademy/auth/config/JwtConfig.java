package com.nhnacademy.auth.config;

import com.nhnacademy.auth.dto.Test;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtConfig {
    Test test;

    public Test getTest(String a, int c) {
        boolean b = a.equals(test);
        if (b==false && a.equals("b")){
            return test;
        }
        else {
            b=true;
            if(b==false){
                return test;
            }
            return test;
        }
    }
}

