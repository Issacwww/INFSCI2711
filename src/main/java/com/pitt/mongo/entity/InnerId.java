package com.pitt.mongo.entity;

public class InnerId {

    private int year;

    private int month;

    private int day;

    private String country;

    private String region;

    private String provstate;

    private int attacktype;

    private int targtype;

    private int weaptype;

    public InnerId() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int iyear) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProvstate() {
        return provstate;
    }

    public void setProvstate(String provstate) {
        this.provstate = provstate;
    }

    public int getAttacktype() { return attacktype; }

    public void setAttacktype(int attacktype) { this.attacktype = attacktype; }

    public int getTargtype() { return targtype; }

    public void setTargtype(int targtype) { this.targtype = targtype; }

    public int getWeaptype() { return weaptype; }

    public void setWeaptype(int weaptype) { this.weaptype = weaptype; }

    @Override
    public String toString() {
        return year+"-"+ month +"-"+ day +"\n"+region+"-"+country+"-"+provstate;
    }
}
