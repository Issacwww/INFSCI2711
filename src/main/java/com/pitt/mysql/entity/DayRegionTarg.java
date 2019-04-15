package com.pitt.mysql.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "day_region_targ")
public class DayRegionTarg {
    @Id
    @Column(name = "uuid")
    private UUID uuid;

    @Column(name = "year")
    private int year;

    @Column(name = "region")
    private String region;

    @Column(name = "targettype1")
    private int targetype;

    @Column(name = "total_kill")
    private int nkill;

    @Column(name = "total_nwound")
    private int tnwound;

    @Column(name = "total_propvalue")
    private int propvalue;

    @Column(name = "count_num_case")
    private int num;

    @Column(name = "month")
    private int month;

    @Column(name = "day")
    private int day;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }


    public UUID getUuid() {
        return uuid;
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

    public int getTargetype() {
        return targetype;
    }

    public void setTargetype(int targetype) {
        this.targetype = targetype;
    }

    public int getNkill() {
        return nkill;
    }

    public void setNkill(int nkill) {
        this.nkill = nkill;
    }

    public int getTnwound() {
        return tnwound;
    }

    public void setTnwound(int tnwound) {
        this.tnwound = tnwound;
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

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
