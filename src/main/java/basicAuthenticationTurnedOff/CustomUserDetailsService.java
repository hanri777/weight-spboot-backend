//package com.anri.weight.contr.app.weightcontrspbootapp.service;
//
//import com.anri.weight.contr.app.weightcontrspbootapp.model.User;
//import com.anri.weight.contr.app.weightcontrspbootapp.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        Optional<User> optionalUser = userRepository.findByEmail(email);
//
//        optionalUser.orElseThrow(() -> new UsernameNotFoundException("User Name: " + email + " Not Found"));
//
//        return optionalUser.map(CustomUserDetails::new).get();

        //------------------

//        CustomUserDetails customUserDatails = optionalUser
//                .map(user -> new CustomUserDetails(user)).get();
//        return customUserDatails;
//-------------------------------------------------
//        User user = userRepository.findByName(name);
//
//        CustomUserDetails customUserDetails = null;
//        if(user != null) {
//            customUserDetails = new CustomUserDetails();
//            customUserDetails.setUser(user);
//        }else {
//            throw new UsernameNotFoundException("User not exist with name: " + name);
//            //.orElseThrow(NotFoundException::new);
//        }
//        return customUserDetails;
   //    }
   //}
