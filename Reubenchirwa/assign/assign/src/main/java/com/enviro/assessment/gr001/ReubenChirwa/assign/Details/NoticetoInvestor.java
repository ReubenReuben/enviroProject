package com.enviro.assessment.gr001.ReubenChirwa.assign.Details;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class NoticetoInvestor {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private  double AmountTowithdraw;
    private int date;
private int investorID;
private int productID;
private String BankAccount;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public double getAmountTowithdraw() {
        return AmountTowithdraw;
    }

    public void setAmountTowithdraw(double amountTowithdraw) {
        AmountTowithdraw = amountTowithdraw;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getInvestorID() {
        return investorID;
    }

    public void setInvestorID(int investorID) {
        this.investorID = investorID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getBankAccount() {
        return BankAccount;
    }

    public void setBankAccount(String bankAccount) {
        BankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "NoticetoInvestor{" +
                "Id=" + Id +
                ", AmountTowithdraw=" + AmountTowithdraw +
                ", date=" + date +
                ", investorID=" + investorID +
                ", productID=" + productID +
                ", BankAccount='" + BankAccount + '\'' +
                '}';
    }
}
