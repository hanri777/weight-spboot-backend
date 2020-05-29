package com.anri.weight.contr.app.weightcontrspbootapp.jwt;

import com.anri.weight.contr.app.weightcontrspbootapp.model.User;
import com.anri.weight.contr.app.weightcontrspbootapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JwtInMemoryUserDetailsService implements UserDetailsService {

    //static List<JwtUserDetails> inMemoryUserList = new ArrayList<>();

    @Autowired
    private UserRepository userRepository;

//    static {
//        inMemoryUserList.add(new JwtUserDetails(1L, "in28minutes",
//                "$2a$10$3zHzb.Npv1hfZbLEU5qsdOju/tk2je6W6PnNnY.c1ujWPcZh4PL6e", "ROLE_USER_2"));
//
//        // create new user
//        inMemoryUserList.add(new JwtUserDetails(2L, "ranga",
//                "$2a$10$zk9i/PvZyaJp243E9My0he/U/pZWm8mor9susnB/lgg3ag/QEFsTG", "ROLE_USER_2"));
//    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Optional<User> optionalUser = userRepository.findByEmail(email);
        optionalUser.orElseThrow(() -> new UsernameNotFoundException("User Name: " + email + " Not Found"));
        return optionalUser.map(JwtUserDetails::new).get();

//        Optional<JwtUserDetails> findFirst = inMemoryUserList.stream()
//                .filter(user -> user.getUsername().equals(username)).findFirst();

//        if (!findFirst.isPresent()) {
//            throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
//        }

//        return findFirst.get();
    }

}

