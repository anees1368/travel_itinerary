package com.traveldemo.searchservice.domain;

public class Route {
	
	private Long id;
	private Line line;
	private int stopNumber;
	private City city;
	private String arrivalTime;
	private String departureTime;
	
	public Route() {}
	public Route(Line line, int stopNumber, City city, String arrivalTime, String departureTime) {
		super();
		this.line = line;
		this.stopNumber = stopNumber;
		this.city = city;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}
	
	public Route(Long id, Line line, int stopNumber, City city, String arrivalTime, String departureTime) {
		super();
		this.id = id;
		this.line = line;
		this.stopNumber = stopNumber;
		this.city = city;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Line getLine() {
		return line;
	}
	public void setLine(Line line) {
		this.line = line;
	}
	public int getStopNumber() {
		return stopNumber;
	}
	public void setStopNumber(int stopNumber) {
		this.stopNumber = stopNumber;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	
	
}
