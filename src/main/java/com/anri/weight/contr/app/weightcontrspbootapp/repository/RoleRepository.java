package com.anri.weight.contr.app.weightcontrspbootapp.repository;

import com.anri.weight.contr.app.weightcontrspbootapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
