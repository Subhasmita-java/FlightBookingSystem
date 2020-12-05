package com.subha.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subha.flightreservation.dto.UpdateReservationRequest;
import com.subha.flightreservation.entities.Reservation;
import com.subha.flightreservation.repos.ReservationRepository;
import com.subha.flightreservation.service.ReservationService;


@RestController
@CrossOrigin
@RequestMapping("/reservations")
public class ReservationRestController {
	@Autowired
	ReservationRepository reservationRepo;
	@Autowired
	ReservationService reservationService;
	
	@GetMapping("/{id}")
	public Reservation findReservation(@PathVariable("id") long id){
		Reservation reservation = reservationRepo.findById(id).get();
		return reservation;
	}
	
	@PostMapping
	public Reservation updateReservation(@RequestBody UpdateReservationRequest updateRequest) {
		Reservation reservation = reservationService.updateReservationDetails(updateRequest);
		return reservation;
	}
}
