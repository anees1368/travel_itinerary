package com.traveldemo.crudservice.domain.resource;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.traveldemo.crudservice.domain.Line;
import com.traveldemo.crudservice.domain.service.TravelService;
import com.traveldemo.crudservice.exception.CityNotFoundException;

@RestController
public class TravelController {
	private Logger logger = LoggerFactory.getLogger(this.getClass()) ;
	
	@Autowired
	private TravelService travelService;
	
	@GetMapping("/all/{cityName}")
	@HystrixCommand(fallbackMethod="fallbackRetrieveConfiguration")
	public List<Line> getAllItineraryForCity(@PathVariable String cityName) {
		List<Line> lineList = travelService.getItineraryForCity(cityName);
		if(lineList == null || lineList.isEmpty()) {
			throw new CityNotFoundException("city="+ cityName) ;
		}
		return lineList;
	}
	
	/**
	 * In case of any unavailability Hystrix will call this method
	 * @return
	 */
	public List<Line> fallbackRetrieveConfiguration() {
		return new ArrayList<>() ;
	}

}
