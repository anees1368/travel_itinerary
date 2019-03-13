package com.traveldemo.crudservice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
*/
@Entity
public class Route {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private Line line;
	
	private int stopNumber;
	
	@ManyToOne
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
	public Long getId() {
		return id;
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
