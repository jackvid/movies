package com.demo.movies;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@SpringBootApplication
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	@ControllerAdvice
	public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
		@ExceptionHandler(value = { EntityNotFoundException.class })
		protected ResponseEntity<Object> handleConflict(RuntimeException ex, WebRequest request) {
			String bodyOfResponse = "Could not found movie with id: " + ((ServletWebRequest)request).getRequest().getRequestURI().split("/")[2];
			return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
		}
	}

}
