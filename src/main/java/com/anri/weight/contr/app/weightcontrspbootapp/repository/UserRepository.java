package com.anri.weight.contr.app.weightcontrspbootapp.repository;

import com.anri.weight.contr.app.weightcontrspbootapp.model.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    // Or not Optional
    //Here "Name" = coloumn from database
    //Optional<User> findByName(String name);

    Optional<User> findByEmail(String email);

    @Override
    List<User> findAll();

    @Override
    void deleteById(Integer integer);
}
