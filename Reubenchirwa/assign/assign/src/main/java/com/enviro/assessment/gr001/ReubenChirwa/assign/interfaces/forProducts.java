package com.enviro.assessment.gr001.ReubenChirwa.assign.interfaces;

import com.enviro.assessment.gr001.ReubenChirwa.assign.Details.Productdetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface forProducts extends JpaRepository<Productdetails, Integer> {
}
