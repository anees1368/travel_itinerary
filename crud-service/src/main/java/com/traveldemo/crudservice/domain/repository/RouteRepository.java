package com.traveldemo.crudservice.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.traveldemo.crudservice.domain.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route,Long>{
	//@Query("select ln from Line ln left join ln.route r  where ln.origin.cityName=:cityName or r.city.cityName=:cityName")
	@Query("select r from Route r Where r.line in (select ro.line from Route ro where ro.city.cityName=:cityName) ")
	List<Route> getByCityName(@Param("cityName") String cityName) ;
}
