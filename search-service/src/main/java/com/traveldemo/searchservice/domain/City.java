package com.traveldemo.searchservice.domain;

public class City {
	
	private Long id;
	private String cityName;
	
	public City() {} 
	
	public City(String cityName) {
		super();
		this.cityName = cityName;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
}
