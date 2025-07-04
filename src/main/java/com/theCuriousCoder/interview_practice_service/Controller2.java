package com.theCuriousCoder.interview_practice_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {
    @Autowired
    private TwoFactorAuthenticationProperties twoFactorAuthenticationProperties;

    @Autowired
    private Environment environment;

    @GetMapping("/send2fa")
    public void send2faCode() {
        Boolean is2fa = environment.getProperty("feature.2fa.enabled", Boolean.class);
        String provider = environment.getProperty("feature.2fa.provider");
        if(is2fa) {
            if(provider.equals("sms")) {
                System.out.println("Sms flow triggered");
            } else if(provider.equals("email")) {
                System.out.println("Email flow triggered");
            }
        }

        // throw some error
    }
}
