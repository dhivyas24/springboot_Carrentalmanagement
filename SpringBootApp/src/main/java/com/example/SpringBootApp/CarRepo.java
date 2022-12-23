package com.example.SpringBootApp;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
 

public interface CarRepo extends JpaRepository<Car,Integer> {

	
	    List<Car> findAll();
	    
	    @Query(value = "SELECT * FROM car u where u.carid= ?1", nativeQuery = true)
	    List<Car> findbystatus(String type);
	    

@Transactional
@Modifying
@Query(value = "Update series u set u.carid = ?1 , u.carmodel =?2 , u.status = ?3  ,u.carno=?4 where u.carid = ?5 ", nativeQuery = true)
void update(String carid,String carmodel,String status,String carno,String cid);

@Modifying
@Transactional 
@Query(value = "DELETE FROM car t WHERE t.carid= ?1 ", nativeQuery = true)
void deleteAllByIdInBatch(String id);

}