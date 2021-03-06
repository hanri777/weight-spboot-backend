package com.anri.weight.contr.app.weightcontrspbootapp.jwt;

import com.anri.weight.contr.app.weightcontrspbootapp.model.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class JwtUserDetails implements UserDetails {

    private static final long serialVersionUID = 5155720064139820502L;

    //private final Long id;
    //private final String username;
        private String email;
    //private final String password;
        private String passwordUs;
    //private final Collection<? extends GrantedAuthority> authorities;
        private List<GrantedAuthority> authorities;

    public JwtUserDetails(User user) {
        //this.id = id;
        //this.username = username;
        this.email = user.getEmail();
        //this.password = password;
        this.passwordUs = user.getPassword();

        this.authorities = user.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority("ROLE_" + role.getRole()))
                .collect(Collectors.toList());

//        List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
//        authorities.add(new SimpleGrantedAuthority(role));
//
//        this.authorities = authorities;
    }

//    @JsonIgnore
//    public Long getId() {
//        return id;
//    }

    @Override
    public String getUsername() {
        //return username;
        return email;
    }

    @JsonIgnore
    @Override
    public String getPassword() {
    //    return password;
        return passwordUs;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }


    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
