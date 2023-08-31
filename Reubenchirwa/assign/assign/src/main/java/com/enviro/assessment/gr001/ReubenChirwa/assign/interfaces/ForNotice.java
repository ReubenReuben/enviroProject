package com.enviro.assessment.gr001.ReubenChirwa.assign.interfaces;

import com.enviro.assessment.gr001.ReubenChirwa.assign.Details.InvestorDetails;
import com.enviro.assessment.gr001.ReubenChirwa.assign.Details.NoticetoInvestor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForNotice extends JpaRepository<NoticetoInvestor, Integer> {
}

