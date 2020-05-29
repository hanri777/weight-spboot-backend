package com.anri.weight.contr.app.weightcontrspbootapp.controller;

import com.anri.weight.contr.app.weightcontrspbootapp.model.TrackUser;
import com.anri.weight.contr.app.weightcontrspbootapp.model.User;
import com.anri.weight.contr.app.weightcontrspbootapp.repository.TrackUserJpaRepository;
import com.anri.weight.contr.app.weightcontrspbootapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TrackUserJpaRestController {

    @Autowired
    private TrackUserJpaRepository trackUserJpaRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/retrieve/user/{email}")
    public Optional<User> showUserToAdmin(@PathVariable String email) {
        System.out.println("showUserToAdmin function");

        return userRepository.findByEmail(email);
    }

    @PutMapping("/user/users/edit")
    public ResponseEntity<User> editUserByUser(@RequestBody User user) {
        userRepository.save(user);
        //return "user added by admin successfully...";
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

//    @PreAuthorize("hasRole('USER')")
    @GetMapping(path = "/user/tracks/{id}")
    public List<TrackUser> getUserTracksById(@PathVariable Integer id) {

        return trackUserJpaRepository.findByUserId(id);
    }

    @GetMapping(path = "/user/track/{id}")
    public TrackUser getUserTrackById (@PathVariable Integer id) {
//    public Optional<TrackUser> gerUserTrackById (@PathVariable Integer id) {
        //By using Optional( do not need get())
        //return trackUserJpaRepository.findById(id);

        // we need .get() - actual(TrackUser) value not Optional(Optional<TrackUser>)
        return trackUserJpaRepository.findById(id).get();
        //return trackUserJpaRepository.findById(id).orElse(null); - returns Optional<>
    }

    //Update - Put
    @PutMapping("/user/track/edit")
    public ResponseEntity<TrackUser> editUserTrack(@RequestBody TrackUser trackUser) {

        trackUserJpaRepository.save(trackUser);

        return new ResponseEntity<TrackUser>(trackUser, HttpStatus.OK);
    }

    @DeleteMapping(path = "/user/track/{id}")
    public ResponseEntity<Void> deleteUserTrackById(@PathVariable Integer id) {
        System.out.println("deleteUserTrackById function");

        trackUserJpaRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(path = "user/tracks/delete/start")
    //@Transactional
    public ResponseEntity<Void> deleteUserTracksBelowStart(@RequestBody List<TrackUser> tracksOfUser) {
        System.out.println("deleteUserTrackById function");

        trackUserJpaRepository.deleteAll(tracksOfUser);

        return ResponseEntity.noContent().build();
    }

    //Test temporary
    @DeleteMapping("user/track/delete")
//    public ResponseEntity<Void> deleteUserTrack(@RequestBody TrackUser userTrack) {
    public String deleteUserTrack(@RequestBody TrackUser userTrack) {
        //System.out.println("deleteUserTrackById function");

        trackUserJpaRepository.delete(userTrack);

//        return ResponseEntity.noContent().build();
        return "User has deleted...";
    }


    //Creating new - Post
    @PostMapping("/user/track/add")
    public ResponseEntity<TrackUser> addNewUserTrack(@RequestBody TrackUser trackUser) {

        trackUserJpaRepository.save(trackUser);

        System.out.println("track added successfully...");

        return new ResponseEntity<TrackUser>(trackUser, HttpStatus.OK);
    }

}
