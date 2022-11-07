package com.airport.dto;

public class AirportsDTO {
	private String countryName;
	private String airportName;
	private int nrAirports;

	public AirportsDTO(String countryName, String airportName, int nrAirports) {
		super();
		this.countryName = countryName;
		this.airportName = airportName;
		this.nrAirports = nrAirports;
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

	public int getNrAirports() {
		return nrAirports;
	}

	public void setNrAirports(int nrAirports) {
		this.nrAirports = nrAirports;
	}

	@Override
	public String toString() {
		return "AirportsDTO [countryName=" + countryName + ", airportName=" + airportName + ", nrAirports=" + nrAirports
				+ "]";
	}
	

	
}
