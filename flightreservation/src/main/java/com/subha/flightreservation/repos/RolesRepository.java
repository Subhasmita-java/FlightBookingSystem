package com.subha.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subha.flightreservation.entities.Role;

public interface RolesRepository extends JpaRepository<Role, Long> {

}
