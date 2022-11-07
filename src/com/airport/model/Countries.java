package com.airport.model;

import java.util.List;

public class Countries {

	private String id;
	private String code;
	private String name;
	private String continent;
	private List<Airports> airports;

	public Countries() {
		super();
	}

	public Countries(String id, String code, String name, String continent, List<Airports> airportList) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.continent = continent;
		this.airports = airportList;
	}

	public List<Airports> getAirports() {
		return airports;
	}

	public void setAirports(List<Airports> airports) {
		this.airports = airports;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "Countries [id=" + id + ", code=" + code + ", name=" + name + ", continent=" + continent + "]";
	}

}
