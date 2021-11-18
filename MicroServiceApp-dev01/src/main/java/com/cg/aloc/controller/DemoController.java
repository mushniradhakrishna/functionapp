package com.cg.aloc.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/genx")

public class DemoController {


	@GetMapping(value = "/getApi")
	public String getApi() {
		return "ETAP";
	}
	
	@GetMapping(value = "/getResult")
	public String getResult() {
		return "Result!";
	}
	
	@GetMapping(value = "/getCustomer")
	public String getCustomer() {
		return "Customer!";
	}
}
