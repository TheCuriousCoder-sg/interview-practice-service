package com.theCuriousCoder.interview_practice_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private TwoFactorAuthenticationProperties twoFactorAuthenticationProperties;

    @GetMapping("/message")
    public String getMessage() {
        return "Hello World";
    }

    @GetMapping("/2fa")
    public Boolean is2faEnabled() {
        return twoFactorAuthenticationProperties.isEnabled();
    }
}
