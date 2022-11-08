package com.airport.dto;

public class AirportsDTO {
	private String countryName;
	private String airportName;

	public AirportsDTO(String countryName, String airportName) {
		super();
		this.countryName = countryName;
		this.airportName = airportName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	@Override
	public String toString() {
		return "AirportsDTO [countryName=" + countryName + ", airportName=" + airportName + ", nrAirports=" + "]";
	}

}
