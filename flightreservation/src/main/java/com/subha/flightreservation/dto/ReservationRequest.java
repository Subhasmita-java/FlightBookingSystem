package com.subha.flightreservation.dto;

public class ReservationRequest {

	private long flightId;
	private String passangerFirstName;
	private String passangerLastName;
	private String passangerEmail;
	private String passangerContactNo;
	private String nameOnCard;
	private String cardNumber;
	private String expiryDate;
	private String threeDigitCode;
	
	public long getFlightId() {
		return flightId;
	}
	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}
	public String getPassangerFirstName() {
		return passangerFirstName;
	}
	public void setPassangerFirstName(String passangerFirstName) {
		this.passangerFirstName = passangerFirstName;
	}
	public String getPassangerLastName() {
		return passangerLastName;
	}
	public void setPassangerLastName(String passangerLastName) {
		this.passangerLastName = passangerLastName;
	}
	public String getPassangerEmail() {
		return passangerEmail;
	}
	public void setPassangerEmail(String passangerEmail) {
		this.passangerEmail = passangerEmail;
	}
	public String getPassangerContactNo() {
		return passangerContactNo;
	}
	public void setPassangerContactNo(String passangerContactNo) {
		this.passangerContactNo = passangerContactNo;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getThreeDigitCode() {
		return threeDigitCode;
	}
	public void setThreeDigitCode(String threeDigitCode) {
		this.threeDigitCode = threeDigitCode;
	}
	
	
}
