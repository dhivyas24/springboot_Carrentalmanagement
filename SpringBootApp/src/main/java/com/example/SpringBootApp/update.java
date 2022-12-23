package com.example.SpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





	@RestController
	@RequestMapping(path="/updatecar/{id}")
	public class update {	
		@Autowired CarRepo ob;
		@PutMapping()
		    public String updatecar(@RequestBody Car log,@PathVariable("id") String carid)
		    {
			
			

			String carsid=log.getCarid();
			String carmodel=log.getCarmodel();
			String status=log.getStatus();
			String carno=log.getCarno();
				       
						
				ob.update(carsid,carmodel,status,carno,carid);
					 
					 //ob.save(log);
			// return"success";
			return "successfully updated";
	}
		
	}


		