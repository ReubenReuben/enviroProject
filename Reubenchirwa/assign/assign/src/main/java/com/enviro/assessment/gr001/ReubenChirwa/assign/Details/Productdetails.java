package com.enviro.assessment.gr001.ReubenChirwa.assign.Details;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Productdetails {
    private String ProductName;
    private String ProductType;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ProductId;
    private double  balanceAvailable;

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductType() {
        return ProductType;
    }

    public void setProductType(String productType) {
        ProductType = productType;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public double getBalanceAvailable() {
        return balanceAvailable;
    }

    public void setBalanceAvailable(double balanceAvailable) {
        this.balanceAvailable = balanceAvailable;
    }

    @Override
    public String toString() {
        return "Productdetails{" +
                "ProductName='" + ProductName + '\'' +
                ", ProductType='" + ProductType + '\'' +
                ", ProductId=" + ProductId +
                ", balanceAvailable=" + balanceAvailable +
                '}';
    }
}
