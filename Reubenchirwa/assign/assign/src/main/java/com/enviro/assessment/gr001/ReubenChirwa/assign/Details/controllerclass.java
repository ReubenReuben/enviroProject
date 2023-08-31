package com.enviro.assessment.gr001.ReubenChirwa.assign.Details;

import com.enviro.assessment.gr001.ReubenChirwa.assign.interfaces.ForInvestorDetails;
import com.enviro.assessment.gr001.ReubenChirwa.assign.interfaces.ForNotice;
import com.enviro.assessment.gr001.ReubenChirwa.assign.interfaces.forProducts;
import com.enviro.assessment.gr001.ReubenChirwa.assign.services.seriveForAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/view")
public class controllerclass {

    @Autowired
private seriveForAll service;
    //url for investors
    /*
    @RequestMapping("/addUser")
    public String addUser(){

        return "this.html";
    }
    */

    @GetMapping("/investorsDetails")
    public List<InvestorDetails> getAllInvestors(){
        return  service.getAllInvestor();
    }
    @GetMapping("/Products")
    public List<Productdetails> getproducts(){
        return service.getproducts();
    }
    @PostMapping("/withdraw")
    public NoticetoInvestor getANotice(@RequestParam  long Id  ,
                                       @RequestParam double AmountTowithdraw,
                                       @RequestParam int date,
                                       @RequestParam int investorID,
                                       @RequestParam  int productID,
                                       @RequestParam String BankAccount){
        return service.getANotice(Id, AmountTowithdraw, date, investorID, productID,BankAccount);
    }
}
