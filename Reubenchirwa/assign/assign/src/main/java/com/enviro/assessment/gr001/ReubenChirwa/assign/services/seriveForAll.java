package com.enviro.assessment.gr001.ReubenChirwa.assign.services;

import com.enviro.assessment.gr001.ReubenChirwa.assign.Details.InvestorDetails;
import com.enviro.assessment.gr001.ReubenChirwa.assign.Details.NoticetoInvestor;
import com.enviro.assessment.gr001.ReubenChirwa.assign.Details.Productdetails;
import com.enviro.assessment.gr001.ReubenChirwa.assign.interfaces.ForInvestorDetails;
import com.enviro.assessment.gr001.ReubenChirwa.assign.interfaces.ForNotice;
import com.enviro.assessment.gr001.ReubenChirwa.assign.interfaces.forProducts;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class seriveForAll {
    @Autowired
   private ForInvestorDetails details;
    @Autowired
   private ForNotice not;
    @Autowired
  private   forProducts pro;
Productdetails fd; //to get entities of this class
    InvestorDetails dt; //ditto
    NoticetoInvestor s= new NoticetoInvestor();

    public List<InvestorDetails> getAllInvestor(){
        return  details.findAll();
    }
    public List<Productdetails> getproducts(){
        return pro.findAll();
    }
    public List<NoticetoInvestor> getNotice(){
        return not.findAll();
    }
    @Transactional
    public NoticetoInvestor getANotice(long Id, double AmountToWithdraw,
                                       int date,
                                       int investorID,
                                       int productID,
                                       String BankAccount){
        Optional<InvestorDetails> thisIvestor = details.findById(dt.getInvestorId());
        Optional<Productdetails> productOpt = pro.findById(fd.getProductId());

        if(thisIvestor.isEmpty() || productOpt.isEmpty()){
            return null; //handle error
        }
        //age and retirement
        else if (fd.getProductType().equals("RETIREMENT") && dt.getAge()<=65) {
            return null;

        } else if(s.getAmountTowithdraw() > fd.getBalanceAvailable()){
            return null;
        }
        // maximum amount to withdraw
        double maxAmount =0.9*fd.getBalanceAvailable();
         if(s.getAmountTowithdraw() > maxAmount){
            return null;
        }
         //s.setId(Id);
         s.setId(Id);
         s.setDate(date);
         s.setBankAccount(BankAccount);
         s.setInvestorID(investorID);
         s.setAmountTowithdraw(AmountToWithdraw);
         s.setProductID(productID);
         //update products
        double CurrentBalance =fd.getBalanceAvailable() - AmountToWithdraw;
        fd.setBalanceAvailable(CurrentBalance);
        pro.save(fd);
         return not.save(s);
    }
}
