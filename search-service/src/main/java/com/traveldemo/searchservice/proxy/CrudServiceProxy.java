package com.traveldemo.searchservice.proxy;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.traveldemo.searchservice.domain.Line;

@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="crud-service")
public interface CrudServiceProxy {
	@GetMapping("/crud-service/all/{cityName}")
	public List<Line> retrieveExchangeValue(@PathVariable("cityName") String cityName) ;
}
