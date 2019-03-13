package com.traveldemo.crudservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Custom exception for City not found
 * @author AneesShaikh
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class CityNotFoundException extends RuntimeException {
	public CityNotFoundException(String message) {
		super(message) ;
	}
}
