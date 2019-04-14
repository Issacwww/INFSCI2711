package com.pitt.mysql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Location")
public class Location {
    @Id
    @Column(name = "id")
    private int locationid;

    @Column(name = "counrty")
    private String country;

    @Column(name = "region")
    private String region;

    @Column(name = "provstate")
    private String provstate;

    @Column(name = "city")
    private String city;

    @Column(name = "vicinity")
    private int vicinity;

    public int getLocationid() {
        return locationid;
    }

    public void setLocationid(int locationid) {
        this.locationid = locationid;
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

    public int getVicinity() {
        return vicinity;
    }

    public void setVicinity(int vicinity) {
        this.vicinity = vicinity;
    }
}
