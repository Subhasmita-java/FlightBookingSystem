package com.subha.flightCheckin.integration;

import com.subha.flightCheckin.integration.dto.Reservation;
import com.subha.flightCheckin.integration.dto.UpdateReservationRequest;

public interface FlightReservationClient {

	Reservation findReservation(Long id);
	
	Reservation updateReservation(UpdateReservationRequest updateRequest);
}
