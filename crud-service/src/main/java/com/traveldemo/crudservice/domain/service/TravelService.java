package com.traveldemo.crudservice.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.traveldemo.crudservice.domain.Line;
import com.traveldemo.crudservice.domain.Route;
import com.traveldemo.crudservice.domain.repository.LineRepository;
import com.traveldemo.crudservice.domain.repository.RouteRepository;


@Service
public class TravelService {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass()) ;
	
	@Autowired
	private RouteRepository routeRepository;
	
	@Autowired
	private LineRepository lineRepository;
	
	public List<Line> getItineraryForCity(String cityName) {
		List<Line> lineList = lineRepository.getByCityName(cityName);
		logger.info("Lines :: " + new Gson().toJson(lineList)) ;
		List<Route> routeList= routeRepository.getByCityName(cityName);
		logger.info("ROUTES :: " +new Gson().toJson(routeList)) ;
		/* there will multiple routes for one line, fetch line object for route and reassign routes to it */
		Line line = null ;
		if(routeList != null && !routeList.isEmpty()) {
			List<Route> lineRoutes = new ArrayList<>();
			for(Route route : routeList) {
				if(line != null && line.getId() != route.getLine().getId()) {
					line.setRoute(lineRoutes);
					lineList.add(line);
					line = null ;
					lineRoutes = new ArrayList<>();
				}
				// first time line fetch
				if(line == null) {
					line = route.getLine(); 
				}
				Route rt = new Route();
				rt.setCity(route.getCity());
				rt.setArrivalTime(route.getArrivalTime()) ;
				rt.setDepartureTime(route.getDepartureTime());
				rt.setStopNumber(route.getStopNumber());
				lineRoutes.add(rt) ;
			}
			line.setRoute(lineRoutes);
		}
		
		if(lineList != null && line != null) {
			lineList.add(line) ;
		} else {
			// return empty list
			return new ArrayList<Line>();
		}
		
		logger.info("ALL_Lines :: " + new Gson().toJson(lineList)) ;
		return lineList ;
	}
	
}
