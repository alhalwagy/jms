package com.fawry.model;

import java.io.Serializable;

public class Patient implements Serializable{


private int id;
private String name;
private  String insuranceProvider;
private Double copay;
private Double amountToBePaid;


    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInsuranceProvider() {
        return insuranceProvider;
    }

    public void setInsuranceProvider(String insuranceProvider) {
        this.insuranceProvider = insuranceProvider;
    }

    public Double getCopay() {
        return copay;
    }

    public void setCopay(Double copay) {
        this.copay = copay;
    }

    public Double getAmountToBePaid() {
        return amountToBePaid;
    }

    public void setAmountToBePaid(Double amountToBePaid) {
        this.amountToBePaid = amountToBePaid;
    }
}
