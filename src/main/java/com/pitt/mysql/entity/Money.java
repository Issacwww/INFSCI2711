package com.pitt.mysql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Money")
public class Money {
    @Id
    @Column(name = "id")
    private int moneyid;

    @Column(name = "property")
    private int property;

    @Column(name = "propextent")
    private String propextent;

    @Column(name = "ransom")
    private int ransom;

    @Column(name = "propextent_txt")
    private String propextent_txt;

    public int getMoneyid() {
        return moneyid;
    }

    public void setMoneyid(int moneyid) {
        this.moneyid = moneyid;
    }

    public int getProperty() {
        return property;
    }

    public void setProperty(int property) {
        this.property = property;
    }

    public String getPropextent() {
        return propextent;
    }

    public void setPropextent(String propextent) {
        this.propextent = propextent;
    }

    public int getRansom() {
        return ransom;
    }

    public void setRansom(int ransom) {
        this.ransom = ransom;
    }

    public String getPropextent_txt() {
        return propextent_txt;
    }

    public void setPropextent_txt(String propextent_txt) {
        this.propextent_txt = propextent_txt;
    }
}
