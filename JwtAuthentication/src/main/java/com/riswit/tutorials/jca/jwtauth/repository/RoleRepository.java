package com.riswit.tutorials.jca.jwtauth.repository;

import java.util.Optional;

import com.riswit.tutorials.jca.jwtauth.model.Role;
import com.riswit.tutorials.jca.jwtauth.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}