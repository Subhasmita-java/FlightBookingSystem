package com.subha.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subha.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
