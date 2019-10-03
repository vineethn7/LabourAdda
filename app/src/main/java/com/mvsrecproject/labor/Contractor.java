package com.mvsrecproject.labor;

public class Contractor {
    String name; //contractor Name
    String id;
    long number;
    int ContractorAge;
    String AadharNum;
    String ContractorLocation;

    public Contractor(String name,long number) {
        this.name = name;
        this.number=number;
    }

    public Contractor(String id,String name, int contractorAge, String aadharNum, String contractorLocation) {
        this.id = id;
        this.name = name;
        this.ContractorAge = contractorAge;
        this.AadharNum = aadharNum;
        this.ContractorLocation = contractorLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public long getNumber() {
//        return number;
//    }

//    public void setNumber(long number) {
//        this.number = number;
//    }

    public int getContractorAge() {
        return ContractorAge;
    }

    public String getAadharNum() {
        return AadharNum;
    }

    public String getContractorLocation() {
        return ContractorLocation;
    }
}
