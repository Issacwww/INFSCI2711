package com.pitt.mysql.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "month_country_weap")
public class MonthCountryWeap {
    @Id
    @Column(name = "uuid")
    private UUID uuid;

    @Column(name = "year")
    private int year;

    @Column(name = "region")
    private String region;

    @Column(name = "weaptype1")
    private int weaptype;

    @Column(name = "total_nkill")
    private int nkill;

    @Column(name = "total_nwound")
    private int nnwound;

    @Column(name = "total_propvalue")
    private int propvalue;

    @Column(name = "count_num_case")
    private int num;

    @Column(name = "month")
    private int month;

    @Column(name = "country")
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getWeaptype() {
        return weaptype;
    }

    public void setWeaptype(int weaptype) {
        this.weaptype = weaptype;
    }

    public int getNkill() {
        return nkill;
    }

    public void setNkill(int nkill) {
        this.nkill = nkill;
    }

    public int getNnwound() {
        return nnwound;
    }

    public void setNnwound(int nnwound) {
        this.nnwound = nnwound;
    }

    public int getPropvalue() {
        return propvalue;
    }

    public void setPropvalue(int propvalue) {
        this.propvalue = propvalue;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
