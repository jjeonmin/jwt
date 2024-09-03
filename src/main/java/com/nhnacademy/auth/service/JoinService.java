package com.nhnacademy.auth.service;

import com.nhnacademy.auth.dto.JoinDto;
import org.springframework.stereotype.Service;

@Service
public class JoinService {
    public int joinProcess(JoinDto joinDto){
        int a= joinDto.getTest();
        return a;
    }
}
