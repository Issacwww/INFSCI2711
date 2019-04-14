package com.pitt.mysql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Perpetrator")
public class Perpetrator {
    @Id
    @Column(name = "id")
    private int perpetratorid;

    @Column(name = "gname")
    private String gname;

    @Column(name = "individual")
    private int individual;

    @Column(name = "nperps")
    private int nperps;

    @Column(name = "nperpcap")
    private int nperpcap;

    @Column(name = "claimed")
    private int claimed;

    public int getPerpetratorid() {
        return perpetratorid;
    }

    public void setPerpetratorid(int perpetratorid) {
        this.perpetratorid = perpetratorid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public int getIndividual() {
        return individual;
    }

    public void setIndividual(int individual) {
        this.individual = individual;
    }

    public int getNperps() {
        return nperps;
    }

    public void setNperps(int nperps) {
        this.nperps = nperps;
    }

    public int getNperpcap() {
        return nperpcap;
    }

    public void setNperpcap(int nperpcap) {
        this.nperpcap = nperpcap;
    }

    public int getClaimed() {
        return claimed;
    }

    public void setClaimed(int claimed) {
        this.claimed = claimed;
    }
}
