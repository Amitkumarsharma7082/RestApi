package com.amit.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.amit.demo.model.*;

public interface AlienRepo extends JpaRepository<Alien, Integer>
{
	
	
/*List<Alien> findByTech(String Tech);
List<Alien> findByAidGreaterThan(int aid);
@Query("from Alien where tech=?1 order by aname ")
List<Alien> findByTechSorted(String tech);
*/	
}