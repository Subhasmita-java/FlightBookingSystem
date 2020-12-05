package com.subha.flightreservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.subha.flightreservation.dto.ReservationRequest;
import com.subha.flightreservation.dto.UpdateReservationRequest;
import com.subha.flightreservation.entities.Flight;
import com.subha.flightreservation.entities.Passenger;
import com.subha.flightreservation.entities.Reservation;
import com.subha.flightreservation.repos.FlightRepository;
import com.subha.flightreservation.repos.ReservationRepository;
import com.subha.flightreservation.util.EmailUtility;
import com.subha.flightreservation.util.PDFGenerator;
@Service
public class ReservationServiceImpl implements ReservationService {
	@Value("${com.subha.flightreservation.util.dir}")
	private String PDF_DIR;
	@Autowired
	FlightRepository flightRepo;
	@Autowired
	ReservationRepository reservationRepo;
	@Autowired
	PDFGenerator pdfGenerator;
	@Autowired
	EmailUtility emailUtility;
	@Override
	@Transactional
	public Reservation bookFlight(ReservationRequest request) {
		
		Long flightId = request.getFlightId();
		Flight flight = flightRepo.getOne(flightId);
		
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getPassangerFirstName());
		passenger.setLastName(request.getPassangerLastName());
		passenger.setEmail(request.getPassangerEmail());
		passenger.setPhone(request.getPassangerContactNo());
		
		Reservation reservation = new Reservation();
		reservation.setPassenger(passenger);
		reservation.setFlight(flight);
		reservation.setCheckedIn(false);
		
		reservationRepo.save(reservation);
		
		String filePath = PDF_DIR+reservation.getId()+".pdf";
		pdfGenerator.generateIternary(reservation, filePath);
		
		emailUtility.sendEmail(reservation.getPassenger().getEmail(), filePath);
		
		return reservation;
	}
	
	@Override
	public Reservation updateReservationDetails(UpdateReservationRequest updateRequest) {
		Reservation reservation = reservationRepo.getOne(updateRequest.getId());
		reservation.setCheckedIn(updateRequest.getCheckedIn());
		reservation.setNumberOfBags(updateRequest.getNoOfBags());
		
		reservationRepo.save(reservation);
		
		return reservation;
	}

}
