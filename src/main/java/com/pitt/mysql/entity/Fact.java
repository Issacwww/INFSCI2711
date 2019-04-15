package com.pitt.mysql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FactTable")
public class Fact {
    @Id
    @Column(name = "eventid")
    private String eventid;

    @Column(name = "dateID")
    private int dateID;

    @Column(name = "locationID")
    private int locationID;

    @Column(name = "attackID")
    private int attackID;

    @Column(name = "victimID")
    private int victimID;

    @Column(name = "perpetratorID")
    private int perpetratorID;

    @Column(name = "moneyID")
    private int moneyID;

    @Column(name = "weaponID")
    private int weaponID;

    @Column(name = "nkill")
    private int nkill;

    @Column(name = "nwound")
    private int nwound;

    @Column(name = "propvalue")
    private long propvalue;

    @Column(name = "latitude")
    private float latitude;

    @Column(name = "longitude")
    private float longitude;

    @Column(name = "summary")
    private String summary;

    @Column(name = "corp1")
    private String corp1;

    @Column(name = "target1")
    private String target1;

    @Column(name = "motive")
    private String motive;

    @Column(name = "propcomment")
    private String propcomment;

    public Fact(){}

    public String getEventid() {
        return eventid;
    }

    public void setEventid(String eventid) {
        this.eventid = eventid;
    }

    public int getDateID() {
        return dateID;
    }

    public void setDateID(int dateID) {
        this.dateID = dateID;
    }

    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public int getAttackID() {
        return attackID;
    }

    public void setAttackID(int attackID) {
        this.attackID = attackID;
    }

    public int getVictimID() {
        return victimID;
    }

    public void setVictimID(int victimID) {
        this.victimID = victimID;
    }

    public int getPerpetratorID() {
        return perpetratorID;
    }

    public void setPerpetratorID(int perpetratorID) {
        this.perpetratorID = perpetratorID;
    }

    public int getMoneyID() {
        return moneyID;
    }

    public void setMoneyID(int moneyID) {
        this.moneyID = moneyID;
    }

    public int getWeaponID() {
        return weaponID;
    }

    public void setWeaponID(int weaponID) {
        this.weaponID = weaponID;
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

    public long getPropvalue() {
        return propvalue;
    }

    public void setPropvalue(int propvalue) {
        this.propvalue = propvalue;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCorp1() {
        return corp1;
    }

    public void setCorp1(String corp1) {
        this.corp1 = corp1;
    }

    public String getTarget1() {
        return target1;
    }

    public void setTarget1(String target1) {
        this.target1 = target1;
    }

    public String getMotive() {
        return motive;
    }

    public void setMotive(String motive) {
        this.motive = motive;
    }

    public String getPropcomment() {
        return propcomment;
    }

    public void setPropcomment(String propcomment) {
        this.propcomment = propcomment;
    }
}
