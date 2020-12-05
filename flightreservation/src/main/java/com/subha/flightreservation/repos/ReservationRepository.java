package com.subha.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subha.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
