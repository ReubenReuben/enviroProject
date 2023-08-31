package com.enviro.assessment.gr001.ReubenChirwa.assign.Details;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InvestorDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  int InvestorId;
    private  String Name;
    private String Surname;
    private  String Address;
    private  int Contact;
private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getInvestorId() {
        return InvestorId;
    }

    public void setInvestorId(int investorId) {
        InvestorId = investorId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getContact() {
        return Contact;
    }

    public void setContact(int contact) {
        Contact = contact;
    }

    @Override
    public String toString() {
        return "InvestorDetails{" +
                "InvestorId=" + InvestorId +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Address='" + Address + '\'' +
                ", Contact=" + Contact +
                ", age=" + age +
                '}';
    }
}
