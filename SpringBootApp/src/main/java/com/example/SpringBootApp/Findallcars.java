package com.example.SpringBootApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/getallproducts")

public class Findallcars {
	@Autowired CarRepo ob;
	@GetMapping()
	    public List<Car> getAllcars()
	    {

	        return ob.findAll();

	        
	    }
}