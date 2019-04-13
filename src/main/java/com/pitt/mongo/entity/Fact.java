package com.pitt.mongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fact")
public class Fact {
    /***
     * eventid
     * year
     * month
     * day
     * country
     * region
     * provstate
     * city
     * attacktype
     * targtype
     * nkill
     * nwound
     * weaptype
     * propvalue
     */
    @Id
    private Long id;

    private int year;

    private int month;

    private int day;

    private String country;

    private String region;

    private String provstate;

    private String city;

    private int attacktype;

    private int targtype;

    private int weaptype;

    private int nkill;

    private int nwound;

    private int propvalue;

    public Fact() {
    }

    public Fact(Long id, int year, int month, int day, String country, String region, String provstate, String city, int attacktype, int targtype, int nkill, int nwound, int weaptype, int propvalue) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.day = day;
        this.country = country;
        this.region = region;
        this.provstate = provstate;
        this.city = city;
        this.attacktype = attacktype;
        this.targtype = targtype;
        this.nkill = nkill;
        this.nwound = nwound;
        this.weaptype = weaptype;
        this.propvalue = propvalue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAttacktype() {
        return attacktype;
    }

    public void setAttacktype(int attacktype) {
        this.attacktype = attacktype;
    }

    public int getTargtype() {
        return targtype;
    }

    public void setTargtype(int targtype) {
        this.targtype = targtype;
    }

    public int getNkill() {
        return nkill;
    }

    public void setNkill(int nkill) {
        this.nkill = nkill;
    }

    public int getNwound() {
        return nwound;
    }

    public void setNwound(int nwound) {
        this.nwound = nwound;
    }

    public int getWeaptype() {
        return weaptype;
    }

    public void setWeaptype(int weaptype) {
        this.weaptype = weaptype;
    }

    public int getPropvalue() {
        return propvalue;
    }

    public void setPropvalue(int propvalue) {
        this.propvalue = propvalue;
    }

//    @Override
//    public String toString() {
//        return String.format(
//                "Event{eventid='%s', " +
//                        "year='%s', " +
//                        "month='%s', " +
//                        "day='%s', " +
//                        "country='%s', " +
//                        "region='%s', " +
//                        "provstate='%s', " +
//                        "city='%s', " +
//                        "attacktype='%d', " +
//                        "targtype='%d', " +
//                        "nkill='%d', " +
//                        "nwound='%d', " +
//                        "weaptype='%d', " +
//                        "propvalue='%d'}",
//                id,year,month,day,country,region,
//                provstate,city,attacktype,targtype,nkill,
//                nwound,weaptype,propvalue
//        );
//    }
}
