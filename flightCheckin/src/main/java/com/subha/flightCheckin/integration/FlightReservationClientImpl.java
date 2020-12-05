package com.subha.flightCheckin.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.subha.flightCheckin.integration.dto.Reservation;
import com.subha.flightCheckin.integration.dto.UpdateReservationRequest;
@Component
public class FlightReservationClientImpl implements FlightReservationClient {
    private static final String FLIGHT_RESERVATION_URL = "http://localhost:8180/flightreservation/reservations/";
	
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject(FLIGHT_RESERVATION_URL +id, Reservation.class);
		return reservation;
	}

	
	public Reservation updateReservation(UpdateReservationRequest updateRequest) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject(FLIGHT_RESERVATION_URL, updateRequest, Reservation.class);
		return reservation;
	}

}
