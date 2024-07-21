package com.userlogin.service;


import com.userlogin.dto.RegistrationDto;
import org.springframework.stereotype.Component;

@Component
public interface RegistrationService {
    String register(RegistrationDto registrationDto);

    String confirmToken(String token);
}
