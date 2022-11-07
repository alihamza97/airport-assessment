package com.airport.dto;

public class RunwayDTO {

	private String id;
	private String airportRef;
	private String airportIdent;
	private String lengthFt;
	private String widthFt;
	private String surface;
	private String country;
	private String airportName;

	public RunwayDTO(String id, String airportRef, String airportIdent, String lengthFt, String widthFt, String surface,
			String country, String airportName) {
		super();
		this.id = id;
		this.airportRef = airportRef;
		this.airportIdent = airportIdent;
		this.lengthFt = lengthFt;
		this.widthFt = widthFt;
		this.surface = surface;
		this.country = country;
		this.airportName = airportName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAirportRef() {
		return airportRef;
	}

	public void setAirportRef(String airportRef) {
		this.airportRef = airportRef;
	}

	public String getAirportIdent() {
		return airportIdent;
	}

	public void setAirportIdent(String airportIdent) {
		this.airportIdent = airportIdent;
	}

	public String getLength_ft() {
		return lengthFt;
	}

	public void setLength_ft(String length_ft) {
		this.lengthFt = length_ft;
	}

	public String getWidth_ft() {
		return widthFt;
	}

	public void setWidth_ft(String width_ft) {
		this.widthFt = width_ft;
	}

	public String getSurface() {
		return surface;
	}

	public void setSurface(String surface) {
		this.surface = surface;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	@Override
	public String toString() {
		return "Runways [id=" + id + ", airportRef=" + airportRef + ", airportIdent=" + airportIdent + ", lengthFt="
				+ lengthFt + ", widthFt=" + widthFt + ", surface=" + surface + ", country=" + country + ", airportName="
				+ airportName + "]";
	}

}
