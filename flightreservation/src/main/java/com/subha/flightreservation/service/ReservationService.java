package com.subha.flightreservation.service;

import com.subha.flightreservation.dto.ReservationRequest;
import com.subha.flightreservation.dto.UpdateReservationRequest;
import com.subha.flightreservation.entities.Reservation;

public interface ReservationService {

	Reservation bookFlight(ReservationRequest request);
	
	Reservation updateReservationDetails(UpdateReservationRequest updateRequest);
}
