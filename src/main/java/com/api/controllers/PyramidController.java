package com.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.services.Pyramid;

@RestController
public class PyramidController {
	@Autowired
	Pyramid pyramid;

	@RequestMapping()
	public String hello() {
		return "hello ! In order to use this API."+
		 "\n 1. POST a request to localhost:8080/pyramid "+
		 "\n 2. Enter a string value without using quotes and semi quotes \"\"  "+
		 "\n 3. An example of input is banana. Make sure you have no spaces in between or after";
	}

	@PostMapping("/pyramid")
	public boolean isPyramid(@RequestBody String inputString) {
		return pyramid.isPyramidSequence(inputString.trim());
	}
}
