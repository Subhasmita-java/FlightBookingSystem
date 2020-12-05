package com.subha.flightCheckin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.subha.flightCheckin.integration.FlightReservationClient;
import com.subha.flightCheckin.integration.dto.Reservation;
import com.subha.flightCheckin.integration.dto.UpdateReservationRequest;

@Controller
public class FlightCheckInController {
	
	@Autowired
	FlightReservationClient reservationClient;
	
	@RequestMapping("/ShowCheckIn")
	public String showCheckInPage() {
		return "ShowCheckInPange";
	}
	@RequestMapping("flightCheckIn")
	public String showCheckInDetails(@RequestParam("reservationID")Long id,ModelMap modelMap) {
		Reservation reservation = reservationClient.findReservation(id);
		modelMap.addAttribute("reservation", reservation);
		return "displayCheckInDetails";
	}
	@RequestMapping("checkIn")
	public String complateCheckIn(@RequestParam("reservationID")Long id,
			@RequestParam("numberOfBags")int noOfBags,ModelMap modelMap ) {
		UpdateReservationRequest updateRequest = new UpdateReservationRequest();
		updateRequest.setId(id);
		updateRequest.setNoOfBags(noOfBags);
		updateRequest.setCheckedIn(true);
		Reservation reservation = reservationClient.updateReservation(updateRequest);
		modelMap.addAttribute("reservation", reservation);
		return "confirmCheckIn";
	}
}
