package com.example.SpringBootApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/getbystatus")
public class Findbystatus {
	@Autowired CarRepo ob;
	@GetMapping()
	    public List<Car> getbystatus(@RequestBody String status)
	    {

	        return ob.findbystatus(status);

	        
	    }
}