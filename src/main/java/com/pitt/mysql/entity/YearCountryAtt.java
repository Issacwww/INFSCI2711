package com.pitt.mysql.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "year_country_att")
public class YearCountryAtt {
    @Id
    @Column(name = "uuid")
    private UUID uuid;

    @Column(name = "year")
    private int year;

    @Column(name = "region")
    private String region;

    @Column(name = "attacktype1")
    private int attacktype;

    @Column(name = "total_kill")
    private int nkill;

    @Column(name = "total_nwound")
    private int nwound;

    @Column(name = "total_propvalue")
    private int propvalue;

    @Column(name = "count_num_case")
    private int num;

    @Column(name = "country")
    private String country;

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

    public int getAttacktype() {
        return attacktype;
    }

    public void setAttacktype(int attacktype) {
        this.attacktype = attacktype;
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
}
