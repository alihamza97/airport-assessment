package com.airport.model;

import java.util.List;

public class Airports {

	private String id;
	private String ident;
	private String type;
	private String name;
	private String latitudeDeg;
	private String longitudeDeg;
	private String elevationFt;
	private String continent;
	private String country;
	private String isoRegion;
	private String municipality;
	private String scheduled_service;
	private List<Runway> runwayList;

	public List<Runway> getRunwayList() {
		return runwayList;
	}

	public void setRunwayList(List<Runway> runwayList) {
		this.runwayList = runwayList;
	}

	public Airports() {
		super();
	}

	public String getId() {
		return id;
	}

	public Airports(String id, String ident, String type, String name, String latitudeDeg, String longitudeDeg,
			String elevationFt, String continent, String country, String isoRegion, String municipality,
			String scheduled_service,List<Runway>runwayList) {
		super();
		this.id = id;
		this.ident = ident;
		this.type = type;
		this.name = name;
		this.latitudeDeg = latitudeDeg;
		this.longitudeDeg = longitudeDeg;
		this.elevationFt = elevationFt;
		this.continent = continent;
		this.country = country;
		this.isoRegion = isoRegion;
		this.municipality = municipality;
		this.scheduled_service = scheduled_service;
		this.runwayList=runwayList;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdent() {
		return ident;
	}

	public void setIdent(String ident) {
		this.ident = ident;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLatitudeDeg() {
		return latitudeDeg;
	}

	public void setLatitudeDeg(String latitudeDeg) {
		this.latitudeDeg = latitudeDeg;
	}

	public String getLongitudeDeg() {
		return longitudeDeg;
	}

	public void setLongitudeDeg(String longitudeDeg) {
		this.longitudeDeg = longitudeDeg;
	}

	public String getElevationFt() {
		return elevationFt;
	}

	public void setElevationFt(String elevationFt) {
		this.elevationFt = elevationFt;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getIsoRegion() {
		return isoRegion;
	}

	public void setIsoRegion(String isoRegion) {
		this.isoRegion = isoRegion;
	}

	public String getMunicipality() {
		return municipality;
	}

	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	public String getScheduled_service() {
		return scheduled_service;
	}

	public void setScheduled_service(String scheduled_service) {
		this.scheduled_service = scheduled_service;
	}

	@Override
	public String toString() {
		return "Airports [id=" + id + ", ident=" + ident + ", type=" + type + ", name=" + name + ", latitudeDeg="
				+ latitudeDeg + ", longitudeDeg=" + longitudeDeg + ", elevationFt=" + elevationFt + ", continent="
				+ continent + ", country=" + country + ", isoRegion=" + isoRegion + ", municipality=" + municipality
				+ ", scheduled_service=" + scheduled_service + "]";
	}

	

}
