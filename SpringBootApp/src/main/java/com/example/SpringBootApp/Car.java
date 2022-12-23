package com.example.SpringBootApp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


	@Entity
	public class Car {

	    @Id

	    @GeneratedValue(strategy = GenerationType.AUTO)
	   private int id;
		private String carid,carmodel,carno,status;
		Car() {}

		Car(String carid,String carmodel,String carno,String status)

		    {
		   
		    
this.setCarid(carid);
this.setCarmodel(carmodel);
this.setStatus(status);
this.setCarno(carno);
		
		
	}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCarid() {
			return carid;
		}

		public void setCarid(String carid) {
			this.carid = carid;
		}

		public String getCarno() {
			return carno;
		}

		public void setCarno(String carno) {
			this.carno = carno;
		}

		public String getCarmodel() {
			return carmodel;
		}

		public void setCarmodel(String carmodel) {
			this.carmodel = carmodel;
		}
	}
