package com.userlogin.controller;


import com.userlogin.dto.RegistrationDto;
import com.userlogin.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/userlogin/v1/registration")
public class RegistrationController {

    private final RegistrationService registrationService;

    public String register(@RequestBody RegistrationDto registrationDto){
        return registrationService.register(registrationDto);
    }

    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }
}
