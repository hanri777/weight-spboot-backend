package com.anri.weight.contr.app.weightcontrspbootapp.repository;

import com.anri.weight.contr.app.weightcontrspbootapp.model.TrackUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TrackUserJpaRepository extends JpaRepository<TrackUser, Integer> {

    List<TrackUser> findByUserId(Integer id);

    @Override
    Optional<TrackUser> findById(Integer integer);

    @Override
    List<TrackUser> findAll();

    @Override
    void delete(TrackUser trackUser);

//    @Override
//    void deleteInBatch(Iterable<TrackUser> iterable);

    @Override
    void deleteAll(Iterable<? extends TrackUser> iterable);
    //internally uses
    //    for (T entity("TrackUser") : entities("tracksOfUser")) {
    //        delete(entity);
    //    }


}
