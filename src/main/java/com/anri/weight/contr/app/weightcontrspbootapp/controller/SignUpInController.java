package com.anri.weight.contr.app.weightcontrspbootapp.controller;

import com.anri.weight.contr.app.weightcontrspbootapp.model.User;
import com.anri.weight.contr.app.weightcontrspbootapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/secure/rest")
@CrossOrigin(origins = "http://localhost:4200")
public class SignUpInController {
    @Autowired
    private UserRepository userRepository;

    //In order to encrypt password user.password
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    //@PreAuthorize("hasAnyRole('USER')")
    @PostMapping("/signup")
    public String signUpUser(@RequestBody User user) {

        //Encryption of password
        String pwd = user.getPassword();
        String encryptPwd = bCryptPasswordEncoder.encode(pwd);
        user.setPassword(encryptPwd);

        userRepository.save(user);
        return "user added successfully...";
    }

    //SignIn in Jwt
}
