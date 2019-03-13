package com.traveldemo.crudservice.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.traveldemo.crudservice.domain.Line;

@Repository
public interface LineRepository extends JpaRepository<Line,Long>{
	@Query("select ln from Line ln where ln.origin.cityName=:cityName")
	//@Query("select ln from Line ln left join ln.route r  where ln.origin.cityName=:cityName or r.city.cityName=:cityName")
	List<Line> getByCityName(@Param("cityName") String cityName) ;
}
