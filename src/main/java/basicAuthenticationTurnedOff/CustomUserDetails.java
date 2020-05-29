//package com.anri.weight.contr.app.weightcontrspbootapp.service;
//
//import com.anri.weight.contr.app.weightcontrspbootapp.model.User;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class CustomUserDetails implements UserDetails {
//
////    private String firsName;
//    private String email;
//    private String passwordUs;
//    private List<GrantedAuthority> authorities;
//
//    public CustomUserDetails(User user) {
////        this.email = user.getName();
//        this.email = user.getEmail();
//        this.passwordUs = user.getPassword();
//        this.authorities = user.getRoles().stream()
//                .map(role -> new SimpleGrantedAuthority("ROLE_" + role.getRole()))
//                .collect(Collectors.toList());
//
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return authorities;
//    }
////  @Override
////  public Collection<? extends GrantedAuthority> getAuthorities() {
////       return user.getRoles().stream()
////                   .map(role -> new SimpleGrantedAuthority("ROLE_" + role.getRole()))
////                   .collect(Collectors.toList());
////    }
//
//    @Override
//    public String getUsername() {
////        return firsName;
//        return email;
//    }
//
//    @Override
//    public String getPassword() {
//        return passwordUs;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }

    //-------------------

//    private User user;
//
//    public User getUser()  {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

//    @Override
//    public String getPassword() {
//        return user.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return user.getName();
//    }

   //}
