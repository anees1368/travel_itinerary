package com.traveldemo.searchservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.traveldemo.searchservice.domain.Line;
import com.traveldemo.searchservice.proxy.CrudServiceProxy;

@RestController
public class SearchServiceController {
private Logger logger = LoggerFactory.getLogger(this.getClass()) ;
	
	@Autowired
	private CrudServiceProxy proxy;
	
	@GetMapping("/itinerary/from/{from}/to/{to}")
	@HystrixCommand(fallbackMethod="fallbackRetrieveConfiguration")
	public List<Line> converCurrencyFeign(@PathVariable String from, @PathVariable String to) {
		List<Line> response = proxy.retrieveExchangeValue(from);
		logger.info("{}", response);
		return response;
	}
	
	/**
	 * In case of any unavailability Hystrix will call this method
	 * @return
	 */
	public List<Line> fallbackRetrieveConfiguration() {
		return new ArrayList<>() ;
	}
}
