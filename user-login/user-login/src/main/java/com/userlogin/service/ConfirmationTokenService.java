package com.userlogin.service;

import com.userlogin.entity.ConfirmationToken;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface ConfirmationTokenService {
    public ConfirmationToken saveToken(ConfirmationToken confirmationToken);

    Optional<ConfirmationToken> getToken(String token);

    int setConfirmedAt(String token);
}
