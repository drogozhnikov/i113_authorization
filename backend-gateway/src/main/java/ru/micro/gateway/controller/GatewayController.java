package ru.micro.gateway.controller;

import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
public class GatewayController {

    @GetMapping("/user")
    public String index(Principal principal) {
        return principal.getName();
    }
}
