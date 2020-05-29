package com.anri.weight.contr.app.weightcontrspbootapp.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//For testing
@RestController
//@RequestMapping("/rest/auth/")
public class ApplicationController {

    @GetMapping("/")
    public String home() {
        return ("<h1>Welcome</h1>");
    }

    @GetMapping("/user/{name}")
    public String user(@PathVariable String name) {
        return (String.format("<h1>Welcome User, %s</h1>", name));
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin-admin")
    public String admin() {
        return ("<h1>Welcome Admin</h1>");
    }
}
