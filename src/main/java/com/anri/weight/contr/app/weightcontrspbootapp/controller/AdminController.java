package com.anri.weight.contr.app.weightcontrspbootapp.controller;

import com.anri.weight.contr.app.weightcontrspbootapp.model.User;
import com.anri.weight.contr.app.weightcontrspbootapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/secure/rest")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {

    @Autowired
    private UserRepository userRepository;

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping(path = "/admin")
    //@RequestMapping(value="/admin", method={RequestMethod.OPTIONS,RequestMethod.GET})
    public List<User> showUsersToAdmin() {
        System.out.println("showUsersToAdmin function");

        return userRepository.findAll();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping(path = "/admin/user/{email}")
    public Optional<User> showUserToAdmin(@PathVariable String email) {
        System.out.println("showUserToAdmin function");

        return userRepository.findByEmail(email);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping(path = "/admin/user/delete/{id}")
    public ResponseEntity<Void> deleteUserByAdminByEmail(@PathVariable Integer id) {
        System.out.println("deleteUserByAdminByEmail function");

        userRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }

    //In order to encrypt password user.password
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PreAuthorize("hasRole('ADMIN')")
    //Creating new Post
    @PostMapping("/admin/user/add")
    public ResponseEntity<User> addUserByAdmin(@RequestBody User user) {

        //Encryption of password
        String pwd = user.getPassword();
        String encryptPwd = bCryptPasswordEncoder.encode(pwd);
        user.setPassword(encryptPwd);

        userRepository.save(user);
        //return "user added by admin successfully...";
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    //Update - Put
    @PutMapping("/admin/user/edit")
//    public String editUserByAdmin(@RequestBody User user, @PathVariable String email) {
        //user.setEmail(email)

      public ResponseEntity<User> editUserByAdmin(@RequestBody User user) {

        //Encryption of password
//        String pwd = user.getPassword();
////        String encryptPwd = bCryptPasswordEncoder.encode(pwd);
////        user.setPassword(encryptPwd);

        userRepository.save(user);
//        return "user added by admin successfully...";
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

}
