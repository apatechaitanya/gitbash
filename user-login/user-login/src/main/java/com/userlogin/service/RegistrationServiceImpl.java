package com.userlogin.service;


import com.userlogin.dto.RegistrationDto;
import com.userlogin.entity.AppUser;
import com.userlogin.entity.ConfirmationToken;
import com.userlogin.enums.AppUserRole;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Log4j2
@Service
@AllArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {

    private final AppUserService appUserService;
    private final ConfirmationTokenService confirmationTokenService;
    @Override
    public String register(RegistrationDto registrationDto) {
        log.info("In register method");
        return appUserService.signUpUser(
                new AppUser(registrationDto.getFirstName(),
                        registrationDto.getLastName(),
                        registrationDto.getEmail(),
                        registrationDto.getPassword(),
                        AppUserRole.USER));
    }

    @Override
    @Transactional
    public String confirmToken(String token) {
        ConfirmationToken confirmationToken = confirmationTokenService
                .getToken(token)
                .orElseThrow(() ->
                        new IllegalStateException("token not found"));

        if (confirmationToken.getConfirmationAt() != null) {
            throw new IllegalStateException("email already confirmed");
        }

        LocalDateTime expiredAt = confirmationToken.getExpiredAt();

        if (expiredAt.isBefore(LocalDateTime.now())) {
            throw new IllegalStateException("token expired");
        }

        confirmationTokenService.setConfirmedAt(token);
        appUserService.enableAppUser(
                confirmationToken.getAppUser().getEmail());
        return "confirmed";
    }
}
