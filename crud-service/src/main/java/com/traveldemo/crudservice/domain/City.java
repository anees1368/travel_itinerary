package com.traveldemo.crudservice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="city_name")
	private String cityName;
	
	public City() {} 
	
	public City(String cityName) {
		super();
		this.cityName = cityName;
	}

	public Long getId() {
		return id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
}
