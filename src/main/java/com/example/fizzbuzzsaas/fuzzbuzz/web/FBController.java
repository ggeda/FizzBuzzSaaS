package com.example.fizzbuzzsaas.fuzzbuzz.web;

import java.util.List;
import java.util.Map;

import com.example.fizzbuzzsaas.fuzzbuzz.FBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/fizzbuzz/{upperbound}")
public class FBController {

	// DI - Dependency Injection pattern
	@Autowired
	FBService fbService;

	@RequestMapping(method = RequestMethod.GET)
	public Map<String, List<Integer>> getFBCompute(@PathVariable (value = "upperbound") int upperbound) {

		return fbService.fizzbuzz(upperbound);
	}
}
