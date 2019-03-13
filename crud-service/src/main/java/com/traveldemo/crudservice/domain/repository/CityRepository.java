package com.traveldemo.crudservice.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.traveldemo.crudservice.domain.City;

@Repository
public interface CityRepository extends JpaRepository<City,Long> {
	City findByCityName(String Cityame) ;
}
