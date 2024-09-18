package com.nhnacademy.auth.service;

import com.nhnacademy.auth.dto.JoinDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JoinService {
    public int joinProcess(JoinDto joinDto){
        int a= joinDto.getTest();
        return a;
    }
}
