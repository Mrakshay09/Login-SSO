package com.evault.ssologin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/")
    public String home(@AuthenticationPrincipal OidcUser oidcUser) {
        String userToken = "d0lWRkcveU8zNW1ncUI5b2NSbytyNUhobjBvZlAyUFhFaUFLT1d5SUZhTitZVFVKOEQyME5hV2xTcnRuMEt1SU1YMUlhZlA3RG9VN0NyNUxyZkVITFJ1VEFzYnF1NkhRbjZDRlhLWGVnSHk1MGphVkM1WlVsRmVPYzhSMEZPSGhsSjJDaFVSN3hDTWZJaFNJSjNnY2lVYU9NMWdtRWpha1ZuNXQzUUZJcWVnZmt2SnJxZGFiWkowRHgvcHNvUFJ10";


//        restTemplate.getForEntity(
//                "https://sso.rajasthan.gov.in:4443/SSOREST/GetTokenDetailJSON/" + userToken,
//                Object[].class);


        Map<String, Object> searchDocResponse = (Map<String, Object>) restTemplate.getForObject(
                "https://sso.rajasthan.gov.in:4443/SSOREST/GetTokenDetailJSON/" + userToken,
                Map.class);

        System.out.println(searchDocResponse);
//        String redirectPath = "http://localhost:58510/dept";
////        System.out.println("this is the base URL :---- " + redirectPath);
////        System.out.println("this is the base URL :---- " + (redirectPath + "?userId=" + userId));
//        RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
//        redirectStrategy.sendRedirect(httpRequest, httpResponse, redirectPath);
        return "Welcome, " + oidcUser.getAccessTokenHash() + "!";
    }

    @PostConstruct
    public String getData() {
        String userToken = "d0lWRkcveU8zNW1ncUI5b2NSbytyNUhobjBvZlAyUFhFaUFLT1d5SUZhTitZVFVKOEQyME5hV2xTcnRuMEt1SU1YMUlhZlA3RG9VN0NyNUxyZkVITFJ1VEFzYnF1NkhRbjZDRlhLWGVnSHk1MGphVkM1WlVsRmVPYzhSMEZPSGhsSjJDaFVSN3hDTWZJaFNJSjNnY2lVYU9NMWdtRWpha1ZuNXQzUUZJcWVnZmt2SnJxZGFiWkowRHgvcHNvUFJ1";


//        restTemplate.getForEntity(
//                "https://sso.rajasthan.gov.in:4443/SSOREST/GetTokenDetailJSON/" + userToken,
//                Object[].class);


        Map<String, Object> searchDocResponse = (Map<String, Object>) restTemplate.getForObject(
                "https://sso.rajasthan.gov.in:4443/SSOREST/GetTokenDetailJSON/" + userToken,
                Map.class);

        System.out.println(searchDocResponse);
//        String redirectPath = "http://localhost:58510/dept";
////        System.out.println("this is the base URL :---- " + redirectPath);
////        System.out.println("this is the base URL :---- " + (redirectPath + "?userId=" + userId));
//        RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
//        redirectStrategy.sendRedirect(httpRequest, httpResponse, redirectPath);
        return null;
    }
}