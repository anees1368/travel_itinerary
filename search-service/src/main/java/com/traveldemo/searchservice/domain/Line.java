package com.traveldemo.searchservice.domain;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Mode of Travel")
public class Line {
	long serialVersionUID = 1L;
	private Long id;
	@ApiModelProperty(notes="Name/Id of travel mode")
	private String lineName;
	@ApiModelProperty(notes="Mode of Travel  - Air / Road / Train")
	private String lineMode;
	@ApiModelProperty(notes="Origin city")
	private City origin;
	@ApiModelProperty(notes="Destination city")
	private City destination;
	@ApiModelProperty(notes="Departure time from Origin city")
	private String departureTime;
	@ApiModelProperty(notes="Arrival time to Destination city")
	private String arrivalTime;
	private List<Route> route;
	
	public Line() {}
	public Line(String lineName, String lineMode, City origin, City destination, String departureTime,
			String arrivalTime, List<Route> route) {
		super();
		
		this.lineName = lineName;
		this.lineMode = lineMode;
		this.origin = origin;
		this.destination = destination;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.route = route;
	}
	
	public Line(Long id, String lineName, String lineMode, City origin, City destination, String departureTime,
			String arrivalTime, List<Route> route) {
		super();
		this.id = id;
		this.lineName = lineName;
		this.lineMode = lineMode;
		this.origin = origin;
		this.destination = destination;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.route = route;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLineName() {
		return lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}
	public String getLineMode() {
		return lineMode;
	}
	public void setLineMode(String lineMode) {
		this.lineMode = lineMode;
	}
	public City getOrigin() {
		return origin;
	}
	public void setOrigin(City origin) {
		this.origin = origin;
	}
	public City getDestination() {
		return destination;
	}
	public void setDestination(City destination) {
		this.destination = destination;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public List<Route> getRoute() {
		return route;
	}
	public void setRoute(List<Route> route) {
		this.route = route;
	}

	
}
