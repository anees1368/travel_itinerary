package com.traveldemo.crudservice.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
/*
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
*/
public class Line {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="line_name")
	private String lineName;
	@Column(name="line_mode")
	private String lineMode;
	
	@ManyToOne
	private City origin;
	
	@ManyToOne
	private City destination;
	
	private String departureTime;
	private String arrivalTime;

	@OneToMany
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
	public Long getId() {
		return id;
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
