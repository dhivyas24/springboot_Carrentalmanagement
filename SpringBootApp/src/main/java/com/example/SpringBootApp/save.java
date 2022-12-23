package com.example.SpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/saveproduct")
public class save {

@Autowired CarRepo ob;

@PostMapping()
	public <S> String saveproduct(@RequestBody Car log)
	{
	Car a= new Car();
	
	String carid=log.getCarid();
	
	String carmodel=log.getCarmodel();
	String carno=log.getCarno();
	String status=log.getStatus();
a.setCarid(carid);
a.setCarmodel(carmodel);
a.setCarno(carno);
a.setStatus(status);
 Car first = new Car(carid,carmodel,carno,status);
	ob.save(first);
	
return "saved successfully";
//return "saved successfully";
	
}
}
  