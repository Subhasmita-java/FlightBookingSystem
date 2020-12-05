package com.subha.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.subha.flightreservation.dto.ReservationRequest;
import com.subha.flightreservation.entities.Flight;
import com.subha.flightreservation.entities.Reservation;
import com.subha.flightreservation.repos.FlightRepository;
import com.subha.flightreservation.service.ReservationService;

@Controller
public class ReservationController {
	@Autowired
	FlightRepository flightRepo;
	@Autowired
	ReservationService reservtionService;
	
	@RequestMapping("showCompleteReservation")
	public String showCompleteReservationDetails(@RequestParam("flightId")long flightID,ModelMap modelMap) {
		Flight flight = flightRepo.findById(flightID).get();
		modelMap.addAttribute("flight", flight);
		return"completeReservationDetails";
	} 
	@RequestMapping(value = "completeReservation", method = RequestMethod.POST)
	public String flightRservationSatatus(ReservationRequest request, ModelMap modelMap) {
		Reservation reservation = reservtionService.bookFlight(request);
		modelMap.addAttribute("msg", "Flight Reservation is compeleted successfully with id "+reservation.getId());
		return "flightRservationSatatus";
	}
}
