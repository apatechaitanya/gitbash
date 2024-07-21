package com.userlogin.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class RegistrationDto {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
}
