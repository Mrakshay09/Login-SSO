package com.evault.ssologin.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class LoginController {

    @GetMapping("/authorization/login")
    public String home(Principal user) {
        return "Welcome, " + user.getName() + "!";
    }
}