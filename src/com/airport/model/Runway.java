package com.airport.model;

public class Runway {

	private String id;
	private String airportRef;
	private String airportIdent;
	private String lengthFt;
	private String widthFt;
	private String surface;
	private String lighted;
	private String closed;
	private String leIdent;

//	private String latitudeDeg;
//	private String longitudeDeg;
//	private String elevationFt;
//	private String headingDegT;
//	private String displacedThresholdFt;
//	private String heIdent;
//	private String heLatitudeDeg;
//	private String heLongitudeDeg;
//	private String heElevationFt;
//	private String heHeadingDegT;
//	private String heDisplacedThresholdFt;
	public Runway(String id, String airportRef, String airportIdent, String lengthFt, String widthFt, String surface,
			String lighted, String closed) {
		super();
		this.id = id;
		this.airportRef = airportRef;
		this.airportIdent = airportIdent;
		this.lengthFt = lengthFt;
		this.widthFt = widthFt;
		this.surface = surface;
		this.lighted = lighted;
		this.closed = closed;
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

	public String getLengthFt() {
		return lengthFt;
	}

	public void setLengthFt(String lengthFt) {
		this.lengthFt = lengthFt;
	}

	public String getWidthFt() {
		return widthFt;
	}

	public void setWidthFt(String widthFt) {
		this.widthFt = widthFt;
	}

	public String getSurface() {
		return surface;
	}

	public void setSurface(String surface) {
		this.surface = surface;
	}

	public String getLighted() {
		return lighted;
	}

	public void setLighted(String lighted) {
		this.lighted = lighted;
	}

	public String getClosed() {
		return closed;
	}

	public void setClosed(String closed) {
		this.closed = closed;
	}

	@Override
	public String toString() {
		return "Runway [id=" + id + ", airportRef=" + airportRef + ", airportIdent=" + airportIdent + ", lengthFt="
				+ lengthFt + ", widthFt=" + widthFt + ", surface=" + surface + ", lighted=" + lighted + ", closed="
				+ closed + "]";
	}

}
